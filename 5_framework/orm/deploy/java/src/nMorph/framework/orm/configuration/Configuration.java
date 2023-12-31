// Generated by Haxe 4.2.2
package nMorph.framework.orm.configuration;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Configuration extends haxe.lang.HxObject
{
	public Configuration(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Configuration()
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		nMorph.framework.orm.configuration.Configuration.__hx_ctor_nMorph_framework_orm_configuration_Configuration(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_configuration_Configuration(nMorph.framework.orm.configuration.Configuration __hx_this)
	{
	}
	
	
	public static nMorph.framework.orm.configuration.ConfigurationData Data;
	
	public static void ReadConfiguration(java.lang.String ConfigContent)
	{
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		nMorph.framework.orm.configuration.Configuration.Data = ((nMorph.framework.orm.configuration.ConfigurationData) (nMorph.framework.common.helpers.SerializationHelper.Unserialize(ConfigContent)) );
	}
	
	
	public static java.lang.String WriteExampleConfiguration()
	{
		//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		nMorph.framework.orm.configuration.ConfigurationData cd = new nMorph.framework.orm.configuration.ConfigurationData();
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		cd.set_DatabaseConnections(new haxe.root.Array<nMorph.framework.orm.configuration.DatabaseConnectionData>());
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		nMorph.framework.orm.configuration.DatabaseConnectionData dcd = new nMorph.framework.orm.configuration.DatabaseConnectionData();
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_DeploEnvironment(nMorph.framework.common.configuration.DeployEnvironmentEnum.DEVELOPMENT);
		//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_DatabaseEngine(nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER);
		//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_DatabaseTypeAuthentication(nMorph.framework.orm.configuration.DatabaseTypeAuthenticationEnum.CREDENTIALS);
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_ConnectionString("DEV");
		//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_ServerPort("1433");
		//line 37 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_Database("SW_TodoList");
		//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_UserID("DevExternal");
		//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_Password("3jWZuMr6Z83cy2spSy3g");
		//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		dcd.set_ConnectionPoolSize(0);
		//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		cd.get_DatabaseConnections().push(dcd);
		//line 85 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\configuration\\Configuration.hx"
		return nMorph.framework.common.helpers.SerializationHelper.Serialize(cd);
	}
	
	
}


