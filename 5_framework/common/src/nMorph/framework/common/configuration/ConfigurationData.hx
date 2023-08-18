package nMorph.framework.common.configuration;

/**
 * ...
 * @author Smartwork
 */
class ConfigurationData 
{

	public function new() 
	{
		
	}
	
	@:isVar public var LogFolder(get, set):String;
    @:isVar public var CurrentDeployEnvironment(get, set):DeployEnvironmentEnum;
    

    function get_LogFolder():String {
        return LogFolder;
    }

    function set_LogFolder(value:String) {
        return this.LogFolder = value;
    }

    function get_CurrentDeployEnvironment():DeployEnvironmentEnum {
        return CurrentDeployEnvironment;
    }

    function set_CurrentDeployEnvironment(value:DeployEnvironmentEnum) {
        return this.CurrentDeployEnvironment = value;
    }
	
}