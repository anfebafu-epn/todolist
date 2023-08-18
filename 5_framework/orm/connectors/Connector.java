package nMorph.framework.orm.client;

import haxe.root.*;

import nMorph.framework.orm.client.*;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.client.QueryParameter;
import haxe.root.Array;
import haxe.root.Reflect;
import haxe.root.Type;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import nMorph.framework.orm.configuration.DatabaseConnectionData;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;

public class Connector extends haxe.lang.HxObject {

    static {
        //line 9 "C:\\Workspace_Products\\nMorph - Framework\\1. DEV\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\Connector.hx"
        nMorph.framework.orm.client.Connector.__rtti = "<class path=\"nMorph.framework.orm.client.Connector\" params=\"\">\n\t<Execute public=\"1\" set=\"method\" line=\"14\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></Execute>\n\t<Queue public=\"1\" set=\"method\" line=\"19\" static=\"1\"><f a=\"SQL:Parameters:queue\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<ExecuteQueue public=\"1\" set=\"method\" line=\"34\" static=\"1\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<x path=\"Void\"/>\n</f></ExecuteQueue>\n\t<ReadValue public=\"1\" set=\"method\" line=\"42\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"47\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"nMorph.framework.orm.client.QueryTable\"/>\n</f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"53\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"59\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
    }

    public Connector(haxe.lang.EmptyObject empty) {
    }

    public Connector() {
        //line 9 "C:\\Workspace_Products\\nMorph - Framework\\1. DEV\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\Connector.hx"
        nMorph.framework.orm.client.Connector.__hx_ctor_nMorph_framework_orm_client_Connector(this);
    }

    protected static void __hx_ctor_nMorph_framework_orm_client_Connector(nMorph.framework.orm.client.Connector __hx_this) {
    }

    public static java.lang.String __rtti;

    public static java.lang.Object Execute(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters) {
        return Run(SQL, Parameters, OperationEnum.NonQuery, null);
    }

    public static haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters, haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue) {
        if ((queue == null)) {
            queue = new haxe.root.Array<nMorph.framework.orm.client.QueueItem>();
        }
        nMorph.framework.orm.client.QueueItem item = new nMorph.framework.orm.client.QueueItem();
        item.set_SQL(SQL);
        item.set_Parameters(Parameters);
        queue.push(item);
        return queue;
    }

    private static PreparedStatement pstmt = null;//para ejecuciones de transacciones
    private static Connection conn = null; //conexion general
    private static boolean transt = false;

    public static void ExecuteQueue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue) {

        try {
            int paramNumber = 0;
            StringBuilder sb = new StringBuilder();
            Array<QueryParameter> globalParams = new Array<>();
            for (int i = 0; i < queue.length; i++) {
                nMorph.framework.orm.client.QueueItem item = queue.__get(i);
                // Concatena los querys separados por punto y coma, para que se corran en una sola transacción
                sb.append(item.get_SQL() + ";");
                // Se agregan los parámetros a un listado global para que puedan ser ejecutados
                globalParams.concat(item.get_Parameters());
                // Si este es el último, ejecuta
                if (i == queue.length - 1) {
                    nMorph.framework.orm.client.Connector.Execute(sb.toString(), globalParams);
                    break;
                }
                // Si con el número de parámetros del siguiente se supera los 2099 parámetros (máx permitido)
                // se ejecuta el bloque, limpia para siguiente vuelta
                if (queue.__get(i + 1).get_Parameters().length + globalParams.length > 2099) {
                    nMorph.framework.orm.client.Connector.Execute(sb.toString(), globalParams);
                    sb.setLength(0);
                    globalParams = new Array<QueryParameter>();
                }
            }
            pstmt.execute("COMMIT");//al final se hace commit
            conn.commit();
            conn.close();
            conn.setAutoCommit(true);
        } catch (SQLException failure) {
            try {
                pstmt.execute("ROLLBACK");
                conn.rollback();
                conn.close();
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static java.lang.Object ReadValue(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters) {
        return Run(SQL, Parameters, OperationEnum.Scalar, null);
    }

    public static nMorph.framework.orm.client.QueryTable ReadTable(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters) {
        return (nMorph.framework.orm.client.QueryTable) Run(SQL, Parameters, OperationEnum.Datatable, null);
    }

    public static <T> haxe.root.Array<T> Read(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters, java.lang.Class cl, nMorph.framework.orm.tools.Context context) {
        return (Array<T>) Run(SQL, Parameters, OperationEnum.ObjectArray, cl);
    }

    public static <T> T ReadOne(java.lang.String SQL, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters, java.lang.Class cl, nMorph.framework.orm.tools.Context context) {
        return (T) Run(SQL, Parameters, OperationEnum.SingleObject, cl);
    }

    public static <T> Object Run(String sql, Array<nMorph.framework.orm.client.QueryParameter> parameters, OperationEnum operation, Class cl) {
        System.out.println(sql);
        Object Result = null;
        ResultSet rs = null;
        try {
            DatabaseConnectionData ConnectionData = nMorph.framework.orm.configuration.Configuration.Data.get_CurrentDatabaseConnection();
            //to cast Oracle Types to Java Types
            switch (ConnectionData.get_DatabaseEngine()) {
                case ORACLE:
                    System.getProperties().setProperty("oracle.jdbc.J2EE13Compliant", "true");
                    break;
            }
            //se genra la conexion

            String userName = ConnectionData.get_UserID();
            String password = ConnectionData.get_Password();
            String initConfigString = "init";
            String dbName = "db";

            switch (ConnectionData.get_DatabaseEngine()) {
                default:
                case MYSQL:
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    initConfigString = "jdbc:mysql://";
                    dbName = "/" + ConnectionData.get_Database();
                    break;
                case ORACLE:
                    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                    initConfigString = "jdbc:oracle:thin:@";
                    dbName = ":" + ConnectionData.get_Database();
                    break;
                case SQLSERVER:
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                    initConfigString = "jdbc:sqlserver://";
                    dbName = ";DatabaseName=" + ConnectionData.get_Database();
                    break;
                case POSTGRESQL:
                    Class.forName("org.postgresql.Driver").newInstance();
                    initConfigString = "jdbc:postgresql://";
                    dbName = "/" + ConnectionData.get_Database();
                    break;
            }
            initConfigString = initConfigString + "" + ConnectionData.ConnectionString + ":" + ConnectionData.get_ServerPort() + "" + ConnectionData.get_Database();
            //Entra al proceso transaccional si viene como transaccion se habre un commit y no se vuele
            //a abrir la coneccion si que esta ya existe, la conexion se abre aqui porque se necesita esta
            //previamente para instanciar el preparet statement y configurar la transaccion.
            if (transt) {
                if (conn == null) {//si no viene abro la conexion
                    conn = DriverManager.getConnection(initConfigString, userName, password);
                    conn.setAutoCommit(false);
                }
            } else {
                //como no es una transaccion abro la conexion y afirmo el auto commit
                conn = DriverManager.getConnection(initConfigString, userName, password);
                conn.setAutoCommit(true);
            }
            //alistamos el prepare statement en base a la conexcion
            String sqlDecode = "";
            switch (ConnectionData.get_DatabaseEngine()) {
                case MYSQL:
                    sqlDecode = sql.replace("\"", "");
                    break;
                default:
                    sqlDecode = sql;
            }
            switch (operation) {
                case Scalar:
                    pstmt = conn.prepareStatement(sqlDecode, Statement.RETURN_GENERATED_KEYS);
                    break;
                default:
                    pstmt = conn.prepareStatement(sqlDecode);
            }
            //verificamos si es transaccion o no para alistas el prepare statement
            if (transt) {
                pstmt.execute("BEGIN");//cabecea del commit
            }
            try {
                /**
                 * Proceso de transformacion de cadena en cadena configurada
                 * para recibir prepareStatement*
                 */
                int numParam = parameters.length;
                for (int i = 1; i <= numParam; i++) {
                    sql = sql.replace("@P" + i, "?");
                    sql = sql.replace(":P" + i, "?");
                }
                //Define Parameters
                List<Object> prm = new ArrayList<>();
                int iterador = 1;
                if (parameters != null && parameters.length != 0) {
                    prm = castParameters(parameters);
                }
                //en java las fechas y los bytearray se manejan de diferente manera
                for (Object entry : prm) {
                    try {
                        if (entry instanceof haxe.root.Date) {
                            pstmt.setObject(iterador, castDate(entry));
                        } else {
                            if (entry instanceof haxe.io.Bytes) {
                                haxe.io.Bytes haxeObject = (haxe.io.Bytes) entry;
                                byte[] bytesArray = haxeObject.getData();
                                pstmt.setObject(iterador, bytesArray);
                            } else {
                                pstmt.setObject(iterador, entry);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    iterador++;
                }
                switch (operation) {
                    case NonQuery:
                        Result = pstmt.execute();
                        if (!transt) {
                            conn.close();
                        }
                        break;
                    case Scalar:
                        pstmt.executeUpdate();
                        rs = pstmt.getGeneratedKeys();
                        rs.next();
                        Result = rs.getObject(1);
                        if (!transt) {
                            conn.close();
                        }
                        break;
                    case Datatable:
                        rs = pstmt.executeQuery();
                        ResultSetMetaData rsmt = rs.getMetaData();
                        Result = ConvertToHaxeDataTable(rsmt, rs);
                        if (!transt) {
                            conn.close();
                        }
                        break;
                    case ObjectArray:
                        rs = pstmt.executeQuery();
                        Array<T> arrayT = new Array<T>();
                        Array<Object> _g2 = Fields(cl);
                        while (rs.next()) {
                            T item = Type.createInstance(cl, new Array<Object>(new Object[]{}));
                            int _g1 = 0;
                            while ((_g1 < _g2.length)) {
                                Object obj = _g2.__get(_g1);
                                String field = haxe.lang.Runtime.toString(obj);
                                ++_g1;
                                try {
                                    if (rs.getObject(field) instanceof java.sql.Date || rs.getObject(field) instanceof java.sql.Timestamp) {
                                        if (rs.getObject(field) instanceof java.sql.Date) {
                                            java.sql.Date valorTime = rs.getDate(field);
                                            java.util.Date uDate = new java.util.Date(valorTime.getTime());
                                            SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                                            String fechaForm = dt.format(uDate);
                                            haxe.root.Date date = haxe.root.Date.fromString(fechaForm);
                                            Reflect.setField(item, field, date);
                                        }
                                        if (rs.getObject(field) instanceof java.sql.Timestamp) {
                                            Timestamp vTime = (Timestamp) rs.getObject(field);
                                            java.util.Date valorTime = new java.util.Date(vTime.getTime());
                                            SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                                            String fechaForm = dt.format(valorTime);
                                            haxe.root.Date date = haxe.root.Date.fromString(fechaForm);
                                            Reflect.setField(item, field, date);
                                        }

                                    } else {
                                        Object objty = rs.getObject(field);
                                        String tipoClase = objty.getClass().getName();
                                        if (rs.getObject(field) instanceof Byte || tipoClase.trim().equals("[B")) {
//                                                || rs.getObject(field) instanceof oracle.sql.BLOB
//                                                || rs.getObject(field) instanceof oracle.sql.CLOB) {
//                                            if (rs.getObject(field) instanceof oracle.sql.BLOB || rs.getObject(field) instanceof oracle.sql.CLOB) {
//                                                haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(rs.getBytes(field));
//                                                Reflect.setField(item, field, haxeObject);
//                                            } else {
                                            byte[] bytesArray = (byte[]) rs.getObject(field);
                                            haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(bytesArray);
                                            Reflect.setField(item, field, haxeObject);

                                        } else {
                                            Reflect.setField(item, field, rs.getObject(field));
                                        }
                                    }
                                } catch (Exception e) {
                                }
                            }
                            arrayT.push(item);
                        }
                        Result = arrayT;
                        if (!transt) {
                            conn.close();
                        }
                        break;
                    case SingleObject:
                        rs = pstmt.executeQuery();
                        Array<Object> _g3 = Fields(cl);
                        while (rs.next()) {
                            T item = Type.createInstance(cl, new Array<Object>(new Object[]{}));
                            int _g1 = 0;
                            while ((_g1 < _g3.length)) {
                                Object obj = _g3.__get(_g1);
                                String field = haxe.lang.Runtime.toString(obj);
                                ++_g1;
                                try {
                                    if (rs.getObject(field) != null) {
                                        if (rs.getObject(field) instanceof java.sql.Date || rs.getObject(field) instanceof java.sql.Timestamp) {
                                            if (rs.getObject(field) instanceof java.sql.Date) {
                                                java.sql.Date valorTime = rs.getDate(field);
                                                java.util.Date uDate = new java.util.Date(valorTime.getTime());
                                                SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                                                String fechaForm = dt.format(uDate);
                                                haxe.root.Date date = haxe.root.Date.fromString(fechaForm);
                                                Reflect.setField(item, field, date);
                                            }
                                            if (rs.getObject(field) instanceof java.sql.Timestamp) {
                                                Timestamp vTime = (Timestamp) rs.getObject(field);
                                                java.util.Date valorTime = new java.util.Date(vTime.getTime());
                                                SimpleDateFormat dt = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
                                                String fechaForm = dt.format(valorTime);
                                                haxe.root.Date date = haxe.root.Date.fromString(fechaForm);
                                                Reflect.setField(item, field, date);
                                            }
                                        } else {
                                            Object objty = rs.getObject(field);
                                            String tipoClase = objty.getClass().getName();
                                            if (rs.getObject(field) instanceof Byte || tipoClase.trim().equals("[B")) {
//                                                    || rs.getObject(field) instanceof oracle.sql.BLOB
//                                                    || rs.getObject(field) instanceof oracle.sql.CLOB) {
//                                                if (rs.getObject(field) instanceof oracle.sql.BLOB || rs.getObject(field) instanceof oracle.sql.CLOB) {
//                                                    haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(rs.getBytes(field));
//                                                    Reflect.setField(item, field, haxeObject);
//                                                } else {
                                                byte[] bytesArray = (byte[]) rs.getObject(field);
                                                haxe.io.Bytes haxeObject = haxe.io.Bytes.ofData(bytesArray);
                                                Reflect.setField(item, field, haxeObject);

                                            } else {
                                                Reflect.setField(item, field, rs.getObject(field));
                                            }
                                        }
                                    } else {
                                        Reflect.setField(item, field, null);
                                    }
                                } catch (Exception e) {
                                }
                            }
                            return item;
                        }
                        if (!transt) {
                            conn.close();
                        }
                        break;
                }
                return Result;
            } catch (Exception e) {
                conn.close();
                e.printStackTrace();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decodeQuery(String query) {
        String tableName = decodeTableName(query);
        //1) reemplazamos el nombre de la tabla en todas las coincidencias agregando "tableName"
        //2) reemplazamos todos los saltos de linea de la sentencia
        //3) reemplazamos Todos . por ."
        //4) reemplazamos todos , por ","
        //5) reemplazamos todos = por "=
        String sqlTraslate = query.replace(tableName, "\"" + tableName + "\"");
        sqlTraslate = sqlTraslate.replace("\n", "");
        sqlTraslate = sqlTraslate.replace(".", ".\"");
        sqlTraslate = sqlTraslate.replace(" =", "\" =");

        if (sqlTraslate.contains("SELECT")) {
            if (!sqlTraslate.contains("*")) {
                sqlTraslate = sqlTraslate.replace("FROM", "\" FROM");
            }
        }
        if (sqlTraslate.contains("FROM")) {
            sqlTraslate = sqlTraslate.replace(", ", "\", \"");
        }
        if (sqlTraslate.contains("INSERT")) {
            String[] elements = sqlTraslate.split("VALUES");
            String firstElements = elements[0].replace(", ", "\", \"");
            firstElements = firstElements.replace("(", "(\"");
            firstElements = firstElements.replace(")", "\")");
            sqlTraslate = firstElements + "VALUES" + elements[1];
        }
        if (sqlTraslate.contains("UPDATE")) {
            sqlTraslate = sqlTraslate.replace(", ", ", \"");
            sqlTraslate = sqlTraslate.replace("SET ", "SET \"");
            sqlTraslate = sqlTraslate.replace("WHERE", " WHERE");
        }
        if (sqlTraslate.contains("DELETE")) {
            String[] elements = sqlTraslate.split("FROM");
            String firstElement = elements[0].replace("\"" + tableName + "\"", "");
            sqlTraslate = firstElement + " FROM " + elements[1];
        }
        return sqlTraslate;
    }

    public static String decodeTableName(String query) {
        String queryCast = "";
        if (query.contains("FROM")) {
            //1)Buscamos donde empieza el From
            //2)Buscamos donde empieza el Where
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int ifrom = query.indexOf("FROM");
            int iwhere = 0;
            if (query.contains("WHERE")) {
                iwhere = query.indexOf("WHERE");
            }
            String subQuery = "";
            if (iwhere == 0 || iwhere == -1) {
                subQuery = query.substring(ifrom);
            } else {
                subQuery = query.substring(ifrom, iwhere);
            }

            subQuery = subQuery.replace("FROM", "").replace("WHERE", "");
            subQuery = subQuery.trim();
            queryCast = subQuery;
        }
        if (query.contains("INTO")) {
            //1)Buscamos donde empieza el INTO
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int iInsert = query.indexOf("INTO");
            int iParameters = query.indexOf("(");
            String subQuery = query.substring(iInsert, iParameters);
            subQuery = subQuery.replace("INTO", "").replace("(", "");
            subQuery = subQuery.trim();
            queryCast = subQuery;
        }
        if (query.contains("PDATE")) {
            //1)Buscamos donde empieza el INTO
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            int iInsert = query.indexOf("UPDATE");
            int iParameters = query.indexOf("SET");
            String subQuery = query.substring(iInsert, iParameters);
            subQuery = subQuery.replace("UPDATE", "").replace("SET", "");
            subQuery = subQuery.trim();
            queryCast = subQuery;
        }
        return queryCast;
    }

    public static Object castDate(Object oDate) {
        Object out;
        if (oDate instanceof haxe.root.Date) {
            haxe.root.Date fecha = (haxe.root.Date) oDate;
            java.util.Date fechaD = fecha.date.getTime();
            out = new java.sql.Date(fechaD.getTime());
        } else {
            out = oDate;
        }
        return out;
    }

    public static Array<Object> Fields(Class c) {
        Array<Object> array = new Array<Object>(new Object[0]);
        Field[] f = c.getFields();
        int num = 0;
        int length = f.length;
        while (num < length) {
            int num1 = num;
            num = num1 + 1;
            String name = f[num1].getName();
            if (name.startsWith("__hx_") || name.equals("__rtti")) {
                continue;
            }
            array.push(name);
        }
        return array;

    }

    private static Object ConvertToHaxeDataTable(ResultSetMetaData rsmt, ResultSet rs) throws SQLException {
        nMorph.framework.orm.client.QueryTable hdt = new nMorph.framework.orm.client.QueryTable();
        int columns = rsmt.getColumnCount();
        for (int i = 1; i <= columns; i++) {
            QueryColumn col = new QueryColumn();
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
            QueryRow row = new QueryRow();
            row.set_Items(arr);
            hdt.Rows.push(row);
        }
        return hdt;
    }

    private static DBTypeEnum ConvertToHaxeType(String type) {
        if (type.equalsIgnoreCase("INT")) {
            return DBTypeEnum.INTEGER;
        }
        if (type.equalsIgnoreCase("BIGINTEGER")) {
            return DBTypeEnum.BIGINTEGER;
        }
        if (type.equalsIgnoreCase("STRING")) {
            return DBTypeEnum.VARCHAR;
        }
        if (type.equalsIgnoreCase("FLOAT")) {
            return DBTypeEnum.FLOAT;
        }
        if (type.equalsIgnoreCase("DOUBLE")) {
            return DBTypeEnum.DECIMAL;
        }
        if (type.equalsIgnoreCase("DATE") || type.equalsIgnoreCase("DATETIME")
                || type.equalsIgnoreCase("TIMESPAN")) {
            return DBTypeEnum.DATETIME;
        }
        if (type.equalsIgnoreCase("BOOL") || type.equalsIgnoreCase("BOOLEAN")) {
            return DBTypeEnum.BOOLEAN;
        }
        if (type.equalsIgnoreCase("BYTE")) {
            return DBTypeEnum.BINARY;
        }
        return DBTypeEnum.VARCHAR;
    }

    public static List<Object> castParameters(Array<QueryParameter> parameters) {
        List<Object> out = new ArrayList<>();
        int _y = parameters.length;
        for (int i = 0; i < _y; i++) {
            QueryParameter p = parameters.__get(i);
            out.add(p.get_Value());
        }
        return out;
    }

    /**
     * Buscamos el proveedor y lo retornamos*
     */
    public static String ReadProvide(DatabaseConnectionData ConnectionData) {
        String provider = "";
        DatabaseEngineEnum _g1 = ConnectionData.get_DatabaseEngine();
        switch (_g1) {
            default:
            case MYSQL:
                provider = "com.mysql.jdbc.Driver";
                break;
            case SQLSERVER:
                provider = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                break;
            case POSTGRESQL:
                provider = "org.postgresql.Driver";
                break;
            case ORACLE:
                provider = "oracle.jdbc.driver.OracleDriver";
        }
        return provider;

    }

    public enum OperationEnum {
        NonQuery,
        Scalar,
        Datatable,
        ObjectArray,
        SingleObject
    }
}
