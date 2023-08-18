package nMorph.framework.orm.configuration;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.common.configuration.DeployEnvironmentEnum;
import nMorph.framework.common.helpers.SerializationHelper;

/**
 * ...
 * @author Smartwork
 */
class Configuration
{
	public static var Data: ConfigurationData;

	public function new()
	{

	}

	public static function ReadConfiguration(ConfigContent: String): Void
	{
		Configuration.Data = SerializationHelper.Unserialize(ConfigContent);
	}

	public static function WriteExampleConfiguration(): String
	{
		var cd = new ConfigurationData();
		cd.DatabaseConnections = new Array<DatabaseConnectionData>();
		//cd.Schemes="";

		/*DEV*/
		var  dcd = new DatabaseConnectionData();
		dcd.DeploEnvironment = DeployEnvironmentEnum.DEVELOPMENT;
		dcd.DatabaseEngine = DatabaseEngineEnum.SQLSERVER;
		dcd.DatabaseTypeAuthentication = DatabaseTypeAuthenticationEnum.CREDENTIALS;
		dcd.ConnectionString = "DEV";
		dcd.ServerPort="1433";
		dcd.Database = "SW_TodoList";
		dcd.UserID = "DevExternal";
	    dcd.Password = "3jWZuMr6Z83cy2spSy3g";
		dcd.ConnectionPoolSize = 0;
		cd.DatabaseConnections.push(dcd);
		
		/*PRUEBAS  ZHUNGO_CORE_T1*/
		//var  dcd = new DatabaseConnectionData();
		//dcd.DeploEnvironment = DeployEnvironmentEnum.TEST;
		//dcd.DatabaseEngine = DatabaseEngineEnum.SQLSERVER;
		//dcd.DatabaseTypeAuthentication = DatabaseTypeAuthenticationEnum.CREDENTIALS;
		//dcd.ConnectionString = "DEV";
		//dcd.ServerPort="1433";
		////dcd.Database = "ZHUNGO_CORE";
		//dcd.Database = "ZHUNGO_CORE_T1";
		//dcd.UserID = "DevExternal";
	    //dcd.Password = "3jWZuMr6Z83cy2spSy3g";
		//dcd.ConnectionPoolSize = 0;
		//cd.DatabaseConnections.push(dcd);
		//
		///*DESARROLLO*/
		//var  dcd = new DatabaseConnectionData();
		//dcd.DeploEnvironment = DeployEnvironmentEnum.DEVELOPMENT;
		//dcd.DatabaseEngine = DatabaseEngineEnum.SQLSERVER;
		//dcd.DatabaseTypeAuthentication = DatabaseTypeAuthenticationEnum.CREDENTIALS;
		//dcd.ConnectionString = "DEV";
		//dcd.ServerPort="1433";
		////dcd.Database = "ZHUNGO_CORE";
		//dcd.Database = "ZHUNGO_CORE_T1";
		//dcd.UserID = "DevExternal";
	    //dcd.Password = "3jWZuMr6Z83cy2spSy3g";
		//dcd.ConnectionPoolSize = 0;
		//cd.DatabaseConnections.push(dcd);
		

		///**CONNECCION MYSQL**/
		//var  dcd2 = new DatabaseConnectionData();
		//dcd2.DeploEnvironment = DeployEnvironmentEnum.PRODUCTION;
		//dcd2.DatabaseEngine = DatabaseEngineEnum.MYSQL;
		//dcd2.DatabaseTypeAuthentication = DatabaseTypeAuthenticationEnum.CREDENTIALS;
		//dcd2.ConnectionString = "DEV";
		//dcd2.ServerPort="0000";
		//dcd2.Database = "SW_XXXXX";
		//dcd2.UserID = "Sw_XXXXX_User";
		//dcd2.Password = "Smartw0rk.";
		//dcd2.ConnectionPoolSize = 0;
		//cd.DatabaseConnections.push(dcd2);

		return SerializationHelper.Serialize(cd);
	}
}
