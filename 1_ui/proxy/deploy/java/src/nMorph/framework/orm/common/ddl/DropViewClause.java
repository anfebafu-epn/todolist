// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.ddl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DropViewClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	public DropViewClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DropViewClause(nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String ViewName)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.orm.common.ddl.DropViewClause.__hx_ctor_nMorph_framework_orm_common_ddl_DropViewClause(this, CurrentDDL, ViewName);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_ddl_DropViewClause(nMorph.framework.orm.common.ddl.DropViewClause __hx_this, nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String ViewName)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		__hx_this.CurrentDDL = CurrentDDL;
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		__hx_this.ViewName = ViewName;
	}
	
	
	public nMorph.framework.orm.lang.DDL CurrentDDL;
	
	public java.lang.String ViewName;
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		switch (this.CurrentDDL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "DROP VIEW \"" + this.ViewName ) + "\"" ));
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "DROP VIEW \"" + this.ViewName ) + "\"" ));
				//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "DROP VIEW \"" + this.ViewName ) + "\"" ));
				//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "DROP VIEW \"" + this.ViewName ) + "\"" ));
				//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 30 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "DROP VIEW \"" + this.ViewName ) + "\"" ));
				//line 30 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				break;
			}
			
			
		}
		
	}
	
	
	public java.lang.String SCRIPT()
	{
		//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return this.CurrentDDL.GenerateAll();
	}
	
	
	public java.lang.Object Execute()
	{
		//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return this.CurrentDDL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 55 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 60 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 61 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 65 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 66 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 72 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 77 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 78 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 83 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 84 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 89 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 90 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		{
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (( field != null )) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				switch (field.hashCode())
				{
					case 1260303088:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ViewName")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							this.ViewName = haxe.lang.Runtime.toString(value);
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return value;
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (value) );
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return value;
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		{
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (( field != null )) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.CurrentDDL;
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Read")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 1260303088:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ViewName")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.ViewName;
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Execute")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Queue")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Register")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		{
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (( field != null )) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Read")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.SCRIPT();
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.ReadTable();
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Execute")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.Execute();
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.ReadValue();
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Register")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						if (field.equals("Queue")) 
						{
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							__temp_executeDef1 = false;
							//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		baseArr.push("ViewName");
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		baseArr.push("CurrentDDL");
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\DropViewClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

