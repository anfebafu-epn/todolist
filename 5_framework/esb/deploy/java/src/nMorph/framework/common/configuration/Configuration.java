// Generated by Haxe 4.2.2
package nMorph.framework.common.configuration;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Configuration extends haxe.lang.HxObject
{
	public Configuration(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Configuration()
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		nMorph.framework.common.configuration.Configuration.__hx_ctor_nMorph_framework_common_configuration_Configuration(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_common_configuration_Configuration(nMorph.framework.common.configuration.Configuration __hx_this)
	{
	}
	
	
	public static nMorph.framework.common.configuration.ConfigurationData Data;
	
	public static void ReadConfiguration(java.lang.String ConfigContent)
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		nMorph.framework.common.configuration.Configuration.Data = ((nMorph.framework.common.configuration.ConfigurationData) (nMorph.framework.common.helpers.SerializationHelper.Unserialize(ConfigContent)) );
	}
	
	
	public static java.lang.String WriteExampleConfiguration()
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		nMorph.framework.common.configuration.ConfigurationData conf = new nMorph.framework.common.configuration.ConfigurationData();
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		conf.set_LogFolder("C:\\log\\");
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		conf.set_CurrentDeployEnvironment(nMorph.framework.common.configuration.DeployEnvironmentEnum.DEVELOPMENT);
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\Configuration.hx"
		return nMorph.framework.common.helpers.SerializationHelper.Serialize(conf);
	}
	
	
}


