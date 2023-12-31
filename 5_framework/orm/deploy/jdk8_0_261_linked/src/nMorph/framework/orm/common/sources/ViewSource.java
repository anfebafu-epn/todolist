// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.sources;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ViewSource extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.ISource
{
	static
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		nMorph.framework.orm.common.sources.ViewSource.__rtti = new String("<class path=\"nMorph.framework.orm.common.sources.ViewSource\" params=\"\">\n\t") + 
new String ("<implements path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t") + 
new String ("<ViewName><c path=\"String\"/></ViewName>\n\t") + 
new String ("<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t") + 
new String ("<RegisterQuery public=\"1\" set=\"method\" line=\"17\"><f a=\"CurrentSQL\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></RegisterQuery>\n\t") + 
new String ("<SCRIPT_PART public=\"1\" set=\"method\" line=\"21\"><f a=\"?args\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"13\"><f a=\"ViewName\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></new>\n\t") + 
new String ("<meta>\n\t") + 
new String ("\t<m n=\":directlyUsed\"/>\n\t") + 
new String ("\t<m n=\":hxGen\"/>\n\t") + 
new String ("\t<m n=\":keepSub\"/>\n\t") + 
new String ("\t<m n=\":rtti\"/>\n\t") + 
new String ("</meta>\n</class>");
	}
	
	public ViewSource(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ViewSource(java.lang.String ViewName)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		nMorph.framework.orm.common.sources.ViewSource.__hx_ctor_nMorph_framework_orm_common_sources_ViewSource(this, ViewName);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_sources_ViewSource(nMorph.framework.orm.common.sources.ViewSource __hx_this, java.lang.String ViewName)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		__hx_this.ViewName = ViewName;
	}
	
	
	public static java.lang.String __rtti;
	
	public java.lang.String ViewName;
	
	public nMorph.framework.orm.lang.SQL CurrentSQL;
	
	public void RegisterQuery(nMorph.framework.orm.interfaces.ILang CurrentSQL)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (CurrentSQL) );
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 23 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		boolean WithScheme = false;
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		java.lang.String CurrentSchema = nMorph.framework.orm.configuration.Configuration.Data.get_CurrentDatabaseConnection().get_Schema();
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		if (( ( CurrentSchema != null ) &&  ! (haxe.lang.Runtime.valEq(CurrentSchema, ""))  )) 
		{
			//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			WithScheme = true;
		}
		
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		switch (this.CurrentSQL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				if (WithScheme) 
				{
					//line 54 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(( ( CurrentSchema + "." ) + this.ViewName ));
				}
				else
				{
					//line 56 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(this.ViewName);
				}
				
				//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				if (WithScheme) 
				{
					//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(( ( CurrentSchema + "." ) + this.ViewName ));
				}
				else
				{
					//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(this.ViewName);
				}
				
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				if (WithScheme) 
				{
					//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(( ( CurrentSchema + "." ) + this.ViewName ));
				}
				else
				{
					//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(this.ViewName);
				}
				
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				if (WithScheme) 
				{
					//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(( ( CurrentSchema + "." ) + this.ViewName ));
				}
				else
				{
					//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(this.ViewName);
				}
				
				//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				if (WithScheme) 
				{
					//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(( ( CurrentSchema + "." ) + this.ViewName ));
				}
				else
				{
					//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
					this.CurrentSQL.AddBlock(this.ViewName);
				}
				
				//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				break;
			}
			
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				switch (field.hashCode())
				{
					case 904479157:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (value) );
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
					case 1260303088:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("ViewName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							this.ViewName = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
					case 1260303088:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("ViewName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return this.ViewName;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "RegisterQuery")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
					case 904479157:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							return this.CurrentSQL;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
							this.RegisterQuery(((nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		baseArr.push("CurrentSQL");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		baseArr.push("ViewName");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sources\\ViewSource.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


