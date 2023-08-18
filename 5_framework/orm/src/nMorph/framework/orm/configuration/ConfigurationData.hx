package nMorph.framework.orm.configuration;
import nMorph.framework.common.exceptions.ExceptionHelper;

/**
 * ...
 * @author Smartwork
 */
class ConfigurationData 
{

	public function new() 
	{
		
	}
	
	@:isVar public var DatabaseConnections(get, set):Array<DatabaseConnectionData>;
	//@:isVar public var Schemes(get, set):String;

    //function get_Schemes():String {
        //return Schemes;
    //}

    //function set_Schemes(value:String) {
        //return this.Schemes = value;
    //}
	
	 function set_DatabaseConnections(value:Array<DatabaseConnectionData>) {
        return this.DatabaseConnections = value;
    }

    function get_DatabaseConnections():Array<DatabaseConnectionData> {
        return DatabaseConnections;
    }

	/**
	 * Obtiene la cadena de conexión actual
	 * @return
	 */
    public function get_CurrentDatabaseConnection():DatabaseConnectionData {
        var res = DatabaseConnections.filter(function(d) { return d.DeploEnvironment == nMorph.framework.common.configuration.Configuration.Data.CurrentDeployEnvironment; });
        if (res.length == 0)
        {
            ExceptionHelper.LogicException(100, "No hay configuración de conexión a la base de datos en el ambiente deploy actual");
        }
        return res[0];
    }	
}
