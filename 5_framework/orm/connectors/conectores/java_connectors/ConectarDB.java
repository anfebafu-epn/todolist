package cornerstone.orm.client;

import cornerstone.integrator.configuration.DatabaseConnectionData;
import cornerstone.integrator.configuration.DatabaseEngineEnum;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by Andrés on 31/7/2017.
 */
public class ConectarDB {
    /**Metodo para realizar la coneccion**/
    public static Connection conectar(String ConnectionString, String user, String passsword, DatabaseEngineEnum databaseEngineEnum )throws SQLException,ClassNotFoundException,InstantiationException,IllegalAccessException, IOException{
        Connection conn=null;
        String userName= user;
        String password=passsword;
        String url=ConnectionString;

        switch (databaseEngineEnum){
            default:
            case MYSQL:
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                break;
            case ORACLE:
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                break;
            case SQLSERVER:
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                break;
            case POSTGRESQL:
                Class.forName("org.postgresql.Driver").newInstance();
                break;
        }
        conn= DriverManager.getConnection(url,userName,password);
        return conn;
    }
	
	public static Connection conectar(String server,String serverPort,String databaseName, String user, String passsword, DatabaseEngineEnum databaseEngineEnum )throws SQLException,ClassNotFoundException,InstantiationException,IllegalAccessException, IOException{
        Connection conn=null;
        String userName= user;
        String password=passsword;
        String initConfigString="init";
        String dbName="db";

        switch (databaseEngineEnum){
            default:
            case MYSQL:
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                initConfigString="jdbc:mysql://";
                dbName="/"+databaseName;
                break;
            case ORACLE:
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                initConfigString="jdbc:oracle:thin:@";
                dbName=":"+databaseName;
                break;
            case SQLSERVER:
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                initConfigString="jdbc:sqlserver://";
                dbName=";DatabaseName="+databaseName;
                break;
            case POSTGRESQL:
                Class.forName("org.postgresql.Driver").newInstance();
                initConfigString="jdbc:postgresql://";
                dbName="/"+databaseName;
                break;
        }
        initConfigString=initConfigString+""+server+":"+serverPort+""+dbName;
        conn= DriverManager.getConnection(initConfigString,userName,password);
        return conn;
    }

    public void cerrarConeccion(Connection con)throws SQLException,ClassNotFoundException,InstantiationException,IllegalAccessException{
        con.close();
        System.out.println("Connector cerrada ");
    }
}
