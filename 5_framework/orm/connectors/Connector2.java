package cornerstone.orm.client;

import haxe.root.Array;
import haxe.root.Reflect;
import haxe.root.Type;
import cornerstone.integrator.configuration.Configuration;
import cornerstone.integrator.configuration.DatabaseConnectionData;
import cornerstone.integrator.configuration.DatabaseEngineEnum;
import cornerstone.orm.ORM;
import cornerstone.orm.client.*;
import cornerstone.orm.common.enums.DBTypeEnum;
import cornerstone.orm.common.enums.ObjectEditTypeEnum;
import cornerstone.orm.common.enums.ObjectSourceTypeEnum;
import cornerstone.integrator.exceptions.ExceptionManager;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.text.SimpleDateFormat;


/**
 * Created by Andrés on 28/8/2017.
 */
public class Connector {
    public static Object Execute(String var0, Array<Parameter> var1) {
        return Run(var0, var1, OperationEnum.NonQuery,null);
    }

    public static Object ReadValue(String var0, Array<Parameter> var1) {
        return Run(var0, var1, OperationEnum.Scalar,null);
    }

    public static DataTable ReadTable(String var0, Array<Parameter> var1) {
        return (DataTable)Run(var0, var1, OperationEnum.Datatable,null);
    }

    public static <T> Array<T> Read(String SQL, Array<Parameter> parameters, Class cl, ORM orm) {
        Array<T> var4 = new Array<T>();
        var4=(Array<T>)Run(SQL, parameters, OperationEnum.ObjectArray,cl);

        for(T obj:var4.__a){
            if(obj instanceof ModelObject){
				try{
					ModelObject mo= (ModelObject)(Object)obj;
					mo.set_ObjectEditType(ObjectEditTypeEnum.NOCHANGE);
					mo.set_ObjectSource(ObjectSourceTypeEnum.DB);
					if(orm!=null){
						orm.Objects.push(mo);
						mo.set_TrackChanges(true);
					}else{
						mo.set_TrackChanges(false);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
            }
        }
        return var4;
    }

    public static <T> T ReadOne(String SQL, Array<Parameter> parameters,Class cl,ORM orm) {
        T obj =  (T) Run(SQL, parameters, OperationEnum.SingleObject,cl);
        if(obj instanceof ModelObject){
            try{
				ModelObject mo= (ModelObject)(Object)obj;
				mo.set_ObjectEditType(ObjectEditTypeEnum.NOCHANGE);
				mo.set_ObjectSource(ObjectSourceTypeEnum.DB);
				if(orm!=null){
					orm.Objects.push(mo);
					mo.set_TrackChanges(true);
				}else{
					mo.set_TrackChanges(false);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
        }
        return obj;
    }

    public static <T>Object Run(String sql, Array<Parameter> parameters, OperationEnum operation,Class cl){
		System.out.println(sql);
		
        Object Result = null;
        PreparedStatement pstmt = null;
        ResultSet rs=null;
        try{
            DatabaseConnectionData ConnectionData = Configuration.Data.get_CurrentDatabaseConnection();
            //to cast Oracle Types to Java Types
            switch (ConnectionData.get_DatabaseEngine()) {
                case ORACLE:
                    System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");
                    break;
            }
            //Connection conn=ConectarDB.conectar(ConnectionData.get_ConnectionString(),ConnectionData.get_UserID()
            //        ,ConnectionData.get_Password(),ConnectionData.get_DatabaseEngine());
					
			Connection conn=ConectarDB.conectar(ConnectionData.get_ConnectionString(),ConnectionData.get_ServerPort(),ConnectionData.get_Database(),ConnectionData.get_UserID()
                    ,ConnectionData.get_Password(),ConnectionData.get_DatabaseEngine());
            try{
                /**Proceso de transformacion de cadena en cadena configurada para recibir prepareStatement**/
                int numParam=parameters.length;
                for(int i=1; i<=numParam;i++){
                    sql=sql.replace("@P"+i,"?");
                    sql=sql.replace(":P"+i,"?");
                }
				
				String sqlDecode="";
                switch (ConnectionData.get_DatabaseEngine()) {
                    case MYSQL:
                    	sqlDecode=sql.replace("\"", "");
                        //sqlDecode=decodeQuery(sql);
                        break;
                    default:
                        sqlDecode=sql;
                }
				
                //Define Parameters
                List<Object> prm = new ArrayList<>();
                switch (operation){
                    case Scalar:
                        pstmt = conn.prepareStatement(sqlDecode, Statement.RETURN_GENERATED_KEYS);
                        break;
                    default:
                        pstmt = conn.prepareStatement(sqlDecode);
                }
                int iterador=1;
                if (parameters != null && parameters.length!=0)
                {
                    prm = castParameters(parameters);

                }
                for (Object entry : prm) {                    
					try{
						if(entry instanceof haxe.root.Date)
							pstmt.setObject(iterador,castDate(entry));
						else{
							if(entry instanceof haxe.io.Bytes){
								haxe.io.Bytes haxeObject=(haxe.io.Bytes)entry;
                                byte[] bytesArray=haxeObject.getData();
                                pstmt.setObject(iterador,bytesArray);
							}else{
								pstmt.setObject(iterador,entry);
							}
						}
					}catch(Exception e){
						e.printStackTrace();
					} 
					iterador++;					
                }
				
				
                switch (operation){
                    case NonQuery:
                        Result = pstmt.execute();
                        break;
                    case Scalar:
                        pstmt.executeUpdate();
                        rs = pstmt.getGeneratedKeys();
                        rs.next();
                        Result= rs.getObject(1);
                        break;
                    case Datatable:
                        rs = pstmt.executeQuery();
                        ResultSetMetaData rsmt=rs.getMetaData();
                        Result = ConvertToHaxeDataTable(rsmt,rs);
                        break;
                    case ObjectArray:
                        rs=pstmt.executeQuery();
                        Array<T> arrayT = new Array<T>();
                        Array<Object> _g2 = Fields(cl);
                        while (rs.next()) {
                            T item= Type.createInstance(cl, new Array<Object>(new Object[]{}));
                            int _g1 = 0;
                            while ((_g1 < _g2.length)) {
                                Object obj=_g2.__get(_g1);
                                String field=haxe.lang.Runtime.toString(obj);
                                ++_g1;
								try {
									if(rs.getObject(field) instanceof java.sql.Date || rs.getObject(field) instanceof java.sql.Timestamp){
										if(rs.getObject(field) instanceof java.sql.Date){
											java.sql.Date valorTime=rs.getDate(field);
											java.util.Date uDate = new java.util.Date (valorTime.getTime ());
											SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                                            String fechaForm=dt.format(uDate);
											haxe.root.Date date=  haxe.root.Date.fromString(fechaForm);
											Reflect.setField(item, field, date);
										}
										if(rs.getObject(field) instanceof java.sql.Timestamp){
											Timestamp vTime=(Timestamp)rs.getObject(field);
											java.util.Date valorTime=new java.util.Date(vTime.getTime());
											SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
											String fechaForm=dt.format(valorTime);
											haxe.root.Date date=  haxe.root.Date.fromString(fechaForm);											
											Reflect.setField(item, field, date);
										}
										
									}else{
										Object objty=rs.getObject(field);
                                        String tipoClase=objty.getClass().getName();
                                        if(rs.getObject(field) instanceof Byte || tipoClase.trim().equals("[B")
                                                ||rs.getObject(field) instanceof oracle.sql.BLOB
                                                ||rs.getObject(field) instanceof oracle.sql.CLOB){
                                            if(rs.getObject(field) instanceof oracle.sql.BLOB||rs.getObject(field) instanceof oracle.sql.CLOB){
                                                haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(rs.getBytes(field));
                                                Reflect.setField(item, field, haxeObject);
                                            }else {
                                                byte[] bytesArray = (byte[]) rs.getObject(field);
                                                haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(bytesArray);
                                                Reflect.setField(item, field, haxeObject);
                                            }
                                        }else{
                                            Reflect.setField(item, field, rs.getObject(field));
                                        }
									}
								}catch (Exception e){
                                }
                            }
                            arrayT.push(item);
                        }
                        Result = arrayT;
                        break;
                    case SingleObject:
                        rs=pstmt.executeQuery();
                        Array<Object> _g3 = Fields(cl);
                        while (rs.next()) {
                            T item= Type.createInstance(cl, new Array<Object>(new Object[]{}));
                            int _g1 = 0;
                            while ((_g1 < _g3.length)) {
                                Object obj=_g3.__get(_g1);
                                String field=haxe.lang.Runtime.toString(obj);
                                ++_g1;
								try {
									if(rs.getObject(field)!=null){
										if(rs.getObject(field) instanceof java.sql.Date || rs.getObject(field) instanceof java.sql.Timestamp){
											if(rs.getObject(field) instanceof java.sql.Date){
												java.sql.Date valorTime=rs.getDate(field);
												java.util.Date uDate = new java.util.Date (valorTime.getTime ());
												SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
												String fechaForm=dt.format(uDate);
												haxe.root.Date date=  haxe.root.Date.fromString(fechaForm);
												Reflect.setField(item, field, date);
											}
											if(rs.getObject(field) instanceof java.sql.Timestamp){
												Timestamp vTime=(Timestamp)rs.getObject(field);
												java.util.Date valorTime=new java.util.Date(vTime.getTime());
												SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
												String fechaForm=dt.format(valorTime);
												haxe.root.Date date=  haxe.root.Date.fromString(fechaForm);											
												Reflect.setField(item, field, date);
											}
										}else{
											Object objty=rs.getObject(field);
											String tipoClase=objty.getClass().getName();
											if(rs.getObject(field) instanceof Byte || tipoClase.trim().equals("[B")
													||rs.getObject(field) instanceof oracle.sql.BLOB
													||rs.getObject(field) instanceof oracle.sql.CLOB){
												if(rs.getObject(field) instanceof oracle.sql.BLOB||rs.getObject(field) instanceof oracle.sql.CLOB){
													haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(rs.getBytes(field));
													Reflect.setField(item, field, haxeObject);
												}else {
													byte[] bytesArray = (byte[]) rs.getObject(field);
													haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(bytesArray);
													Reflect.setField(item, field, haxeObject);
												}
											}else{
												Reflect.setField(item, field, rs.getObject(field));
											}
										}
									}else{
										Reflect.setField(item, field, null);
									}
								}catch (Exception e){
                                }
								
                            }
							return item;
                        }
                        break;
                }
                conn.close();
                return Result ;
            }catch (Exception e){
                conn.close();
                e.printStackTrace();
				ExceptionManager.LogicException(1, "Error DB:"+e.getMessage());
				return null;
            }
        }catch (Exception e){
            e.printStackTrace();
			ExceptionManager.LogicException(1, "Error DB:"+e.getMessage());
			return null;
        }
    }
	
	public static String decodeQuery(String query){
        String tableName=decodeTableName(query);
        //1) reemplazamos el nombre de la tabla en todas las coincidencias agregando "tableName"
        //2) reemplazamos todos los saltos de linea de la sentencia
        //3) reemplazamos Todos . por ."
        //4) reemplazamos todos , por ","
        //5) reemplazamos todos = por "=
        String sqlTraslate=query.replace(tableName,"\"" +tableName+"\"");
        sqlTraslate=sqlTraslate.replace("\n","");
        sqlTraslate=sqlTraslate.replace(".",".\"");
        sqlTraslate=sqlTraslate.replace(" =","\" =");

        if(sqlTraslate.contains("SELECT")){
            if(!sqlTraslate.contains("*"))
                sqlTraslate =sqlTraslate.replace("FROM","\" FROM");
        }
        if(sqlTraslate.contains("FROM")){
            sqlTraslate=sqlTraslate.replace(", ","\", \"");
        }
        if(sqlTraslate.contains("INSERT")){
            String[] elements=sqlTraslate.split("VALUES");
            String firstElements=elements[0].replace(", ","\", \"");
            firstElements=firstElements.replace("(","(\"");
            firstElements=firstElements.replace(")","\")");
            sqlTraslate=firstElements+"VALUES"+elements[1];
        }
        if(sqlTraslate.contains("UPDATE")){
            sqlTraslate=sqlTraslate.replace(", ",", \"");
            sqlTraslate=sqlTraslate.replace("SET ","SET \"");
            sqlTraslate=sqlTraslate.replace("WHERE"," WHERE");
        }
        if(sqlTraslate.contains("DELETE")){
            String[] elements=sqlTraslate.split("FROM");
            String firstElement=elements[0].replace("\""+tableName+"\"","");
            sqlTraslate=firstElement+" FROM "+elements[1];
        }
        return sqlTraslate;
    }
	
	public static String decodeTableName(String query){
        String queryCast="";
        if(query.contains("FROM")){
            //1)Buscamos donde empieza el From
            //2)Buscamos donde empieza el Where
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int ifrom=query.indexOf("FROM");
            int iwhere=0;
            if(query.contains("WHERE"))
                iwhere=query.indexOf("WHERE");
            String subQuery="";
            if(iwhere==0||iwhere==-1)
                subQuery=query.substring(ifrom);
            else
                subQuery=query.substring(ifrom,iwhere);

            subQuery=subQuery.replace("FROM","").replace("WHERE","");
            subQuery=subQuery.trim();
            queryCast=subQuery;
        }
        if(query.contains("INTO")){
            //1)Buscamos donde empieza el INTO
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int iInsert=query.indexOf("INTO");
            int iParameters=query.indexOf("(");
            String subQuery=query.substring(iInsert,iParameters);
            subQuery=subQuery.replace("INTO","").replace("(","");
            subQuery=subQuery.trim();
            queryCast=subQuery;
        }
        if(query.contains("PDATE")){
            //1)Buscamos donde empieza el INTO
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int iInsert=query.indexOf("UPDATE");
            int iParameters=query.indexOf("SET");
            String subQuery=query.substring(iInsert,iParameters);
            subQuery=subQuery.replace("UPDATE","").replace("SET","");
            subQuery=subQuery.trim();
            queryCast=subQuery;
        }
        return queryCast;
    }

    public static Object castDate(Object oDate){
        Object out ;
        if(oDate instanceof haxe.root.Date){ 
				haxe.root.Date fecha=(haxe.root.Date)oDate;
				java.util.Date fechaD=fecha.date;
                out=new java.sql.Date(fechaD.getTime());
        }else
            out=oDate;
        return out;
    }

    public static Array<Object> Fields(Class c){
        Array<Object> array = new Array<Object>(new Object[0]);
        Field[] f= c.getFields();
        int num=0;
        int length=f.length;
        while(num<length){
            int num1=num;
            num=num1+1;
            String name=f[num1].getName();
            if(name.startsWith("__hx_") || name .equals("__rtti")){
                continue;
            }
            array.push(name);
        }
        return array;

    }

    private static Object ConvertToHaxeDataTable(ResultSetMetaData rsmt, ResultSet rs)throws SQLException
    {
        DataTable hdt = new DataTable();
        int columns = rsmt.getColumnCount();
        for(int i=1;i<=columns;i++){
            DataColumn col = new DataColumn();
            col.ColumnIndex = i;
            col.ColumnName = rsmt.getColumnName(i);
            col.ColumnType = ConvertToHaxeType(rsmt.getColumnTypeName(i));
            hdt.Columns.push(col);
        }
        while (rs.next()) {
            Array<Object> arr = new Array<Object>();
            for (int i = 1; i <= columns; i++) {
                arr.push(rs.getObject(i));
            }
            DataRow row = new DataRow();
            row.set_Items(arr);
            hdt.Rows.push(row);
        }
        return hdt;
    }

    private static DBTypeEnum ConvertToHaxeType(String type)
    {
        if (type .equalsIgnoreCase("INT")) return DBTypeEnum.INTEGER;
        if (type .equalsIgnoreCase("BIGINTEGER")) return DBTypeEnum.BIGINTEGER;
        if (type .equalsIgnoreCase("STRING")) return DBTypeEnum.VARCHAR;
        if (type .equalsIgnoreCase("FLOAT")) return DBTypeEnum.FLOAT;
        if (type .equalsIgnoreCase("DOUBLE")) return DBTypeEnum.DECIMAL;
        if (type .equalsIgnoreCase("DATE")||type .equalsIgnoreCase("DATETIME")
                ||type .equalsIgnoreCase("TIMESPAN")) return DBTypeEnum.DATETIME;
        if (type .equalsIgnoreCase("BOOL")||type .equalsIgnoreCase("BOOLEAN"))
            return DBTypeEnum.BOOLEAN;
        if (type .equalsIgnoreCase("BYTE")) return DBTypeEnum.BINARY;
        return DBTypeEnum.VARCHAR;
    }

    public static  List<Object> castParameters(Array<Parameter> parameters){
        List<Object> out= new ArrayList<>();
        int _y=parameters.length;
        for(int i=0; i<_y; i++){
            Parameter p =parameters.__get(i);
            out.add(p.get_Value());

        }
        return out;
    }    

    /**Buscamos el proveedor y lo retornamos**/
    public static String ReadProvide(DatabaseConnectionData ConnectionData){
        String provider="";
        DatabaseEngineEnum _g1= ConnectionData.get_DatabaseEngine();
        switch (_g1){
            default:
            case MYSQL:
                provider="com.mysql.jdbc.Driver";
                break;
            case SQLSERVER:
                provider="com.microsoft.sqlserver.jdbc.SQLServerDriver";
                break;
            case POSTGRESQL:
                provider="org.postgresql.Driver";
                break;
            case ORACLE:
                provider="oracle.jdbc.driver.OracleDriver";
        }
        return provider;
    }


    public static void ExecuteQueue(haxe.root.Array<cornerstone.orm.client.QueueItem> queue)
    {
        //line 27 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        int _g = 0;
        //line 27 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        while (( _g < queue.length ))
        {
            //line 27 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
            cornerstone.orm.client.QueueItem item = queue.__get(_g);
            //line 27 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
            ++ _g;
            //line 28 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
            cornerstone.orm.client.Connector.Execute(item.get_SQL(), item.get_Parameters());
        }

    }

    public static haxe.root.Array<cornerstone.orm.client.QueueItem> Queue(java.lang.String SQL, haxe.root.Array<cornerstone.orm.client.Parameter> Parameters, haxe.root.Array<cornerstone.orm.client.QueueItem> queue)
    {
        //line 15 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        if (( queue == null ))
        {
            //line 16 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
            queue = new haxe.root.Array<cornerstone.orm.client.QueueItem>();
        }

        //line 18 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        cornerstone.orm.client.QueueItem item = new cornerstone.orm.client.QueueItem();
        //line 19 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        item.set_SQL(SQL);
        //line 20 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        item.set_Parameters(Parameters);
        //line 21 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        queue.push(item);
        //line 23 "D:\\Workspace_cornerstone\\v3.1\\modules\\cornerstone.orm\\src\\cornerstone\\orm\\client\\Connector.hx"
        return queue;
    }

    public enum OperationEnum
    {
        NonQuery,
        Scalar,
        Datatable,
        ObjectArray,
        SingleObject
    }
}
