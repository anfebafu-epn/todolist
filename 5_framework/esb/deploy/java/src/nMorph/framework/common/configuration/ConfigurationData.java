// Generated by Haxe 4.2.2
package nMorph.framework.common.configuration;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ConfigurationData extends haxe.lang.HxObject
{
	public ConfigurationData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ConfigurationData()
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		nMorph.framework.common.configuration.ConfigurationData.__hx_ctor_nMorph_framework_common_configuration_ConfigurationData(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_common_configuration_ConfigurationData(nMorph.framework.common.configuration.ConfigurationData __hx_this)
	{
	}
	
	
	public java.lang.String LogFolder;
	
	public nMorph.framework.common.configuration.DeployEnvironmentEnum CurrentDeployEnvironment;
	
	public java.lang.String get_LogFolder()
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		return this.LogFolder;
	}
	
	
	public java.lang.String set_LogFolder(java.lang.String value)
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		return this.LogFolder = value;
	}
	
	
	public nMorph.framework.common.configuration.DeployEnvironmentEnum get_CurrentDeployEnvironment()
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		return this.CurrentDeployEnvironment;
	}
	
	
	public nMorph.framework.common.configuration.DeployEnvironmentEnum set_CurrentDeployEnvironment(nMorph.framework.common.configuration.DeployEnvironmentEnum value)
	{
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		return this.CurrentDeployEnvironment = value;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		{
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (( field != null )) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				switch (field.hashCode())
				{
					case -1506489773:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							if (handleProperties) 
							{
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								this.set_CurrentDeployEnvironment(((nMorph.framework.common.configuration.DeployEnvironmentEnum) (value) ));
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								return value;
							}
							else
							{
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								this.CurrentDeployEnvironment = ((nMorph.framework.common.configuration.DeployEnvironmentEnum) (value) );
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								return value;
							}
							
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case -715700046:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							if (handleProperties) 
							{
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								this.set_LogFolder(haxe.lang.Runtime.toString(value));
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								return value;
							}
							else
							{
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								this.LogFolder = haxe.lang.Runtime.toString(value);
								//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
								return value;
							}
							
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		{
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (( field != null )) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				switch (field.hashCode())
				{
					case 1434252176:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("set_CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_CurrentDeployEnvironment")) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case -715700046:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ( (handleProperties) ? (this.get_LogFolder()) : (this.LogFolder) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case 196123420:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("get_CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_CurrentDeployEnvironment")) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case -1506489773:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ( (handleProperties) ? (this.get_CurrentDeployEnvironment()) : (this.CurrentDeployEnvironment) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case 573271317:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("set_LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_LogFolder")) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case -200859895:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("get_LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_LogFolder")) );
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		{
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (( field != null )) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				switch (field.hashCode())
				{
					case 1434252176:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("set_CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return this.set_CurrentDeployEnvironment(((nMorph.framework.common.configuration.DeployEnvironmentEnum) (dynargs[0]) ));
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case -200859895:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("get_LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return this.get_LogFolder();
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case 196123420:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("get_CurrentDeployEnvironment")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return this.get_CurrentDeployEnvironment();
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
					case 573271317:
					{
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						if (field.equals("set_LogFolder")) 
						{
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							__temp_executeDef1 = false;
							//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
							return this.set_LogFolder(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		baseArr.push("CurrentDeployEnvironment");
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		baseArr.push("LogFolder");
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\configuration\\ConfigurationData.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

