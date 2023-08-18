package nMorph.framework.common.configuration;
import nMorph.framework.common.helpers.SerializationHelper;

@:keep
class Configuration
{
	public static var Data: ConfigurationData;

	public static function ReadConfiguration(ConfigContent: String): Void
	{
		Data = SerializationHelper.Unserialize(ConfigContent);
	}

	
	public static function WriteExampleConfiguration(): String{
		
		var conf :ConfigurationData = new ConfigurationData();

		//DEV
		conf.LogFolder = "C:\\log\\";
		conf.CurrentDeployEnvironment = DeployEnvironmentEnum.DEVELOPMENT;

		//UAT
		//conf.LogFolder = "C:\\Sites\\UAT_Zhungo\\Log\\";
		//conf.CurrentDeployEnvironment = DeployEnvironmentEnum.TEST;
		
		return SerializationHelper.Serialize(conf);
	}
	
}
