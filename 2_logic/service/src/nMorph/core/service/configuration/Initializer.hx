package nMorph.core.service.configuration;
import sys.io.File;
import sys.FileSystem;
/**
 * ...
 * @author Smartwork
 */
class Initializer
{
	public function new()
	{
	}
	public static function Application_Start(ConfigPath: String)
	{
		
		if (FileSystem.exists(ConfigPath + "nMorph.framework.common.configuration.Configuration.config"))
		{
			var nMorph_framework_common_configuration_Configuration_Content = File.getContent(ConfigPath + "nMorph.framework.common.configuration.Configuration.config");
			nMorph.framework.common.configuration.Configuration.ReadConfiguration(nMorph_framework_common_configuration_Configuration_Content);
		}

		if (FileSystem.exists(ConfigPath + "nMorph.framework.orm.configuration.Configuration.config"))
		{
			var nMorph_framework_orm_configuration_Configuration_Content = File.getContent(ConfigPath + "nMorph.framework.orm.configuration.Configuration.config");
			nMorph.framework.orm.configuration.Configuration.ReadConfiguration(nMorph_framework_orm_configuration_Configuration_Content);
		}

	}
}
