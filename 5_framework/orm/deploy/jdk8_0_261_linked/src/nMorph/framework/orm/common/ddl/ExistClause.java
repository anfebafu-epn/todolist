// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.ddl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ExistClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	static
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.orm.common.ddl.ExistClause.__rtti = new String("<class path=\"nMorph.framework.orm.common.ddl.ExistClause\" params=\"\">\n\t") + 
new String ("<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t") + 
new String ("<CurrentDDL><c path=\"nMorph.framework.orm.lang.DDL\"/></CurrentDDL>\n\t") + 
new String ("<TableName><c path=\"String\"/></TableName>\n\t") + 
new String ("<SCRIPT public=\"1\" set=\"method\" line=\"24\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t") + 
new String ("<SCRIPT_PART public=\"1\" set=\"method\" line=\"28\"><f a=\"?args\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t") + 
new String ("<Execute public=\"1\" set=\"method\" line=\"62\"><f a=\"\"><d/></f></Execute>\n\t") + 
new String ("<Register public=\"1\" set=\"method\" line=\"66\"><f a=\"context\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></Register>\n\t") + 
new String ("<Queue public=\"1\" set=\"method\" line=\"70\"><f a=\"queue\">\n\t") + 
new String ("<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t") + 
new String ("<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t") + 
new String ("<Bulk public=\"1\" set=\"method\" line=\"75\"><f a=\"bulk\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t") + 
new String ("<ReadValue public=\"1\" set=\"method\" line=\"80\"><f a=\"\"><d/></f></ReadValue>\n\t") + 
new String ("<ReadTable public=\"1\" set=\"method\" line=\"85\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t") + 
new String ("<Read public=\"1\" params=\"T\" set=\"method\" line=\"90\"><f a=\"cl:?context\">\n\t") + 
new String ("<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t") + 
new String ("<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"95\"><f a=\"cl:?context\">\n\t") + 
new String ("<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"19\"><f a=\"CurrentDDL:TableName\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.lang.DDL\"/>\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></new>\n\t") + 
new String ("<meta>\n\t") + 
new String ("\t<m n=\":directlyUsed\"/>\n\t") + 
new String ("\t<m n=\":hxGen\"/>\n\t") + 
new String ("\t<m n=\":keepSub\"/>\n\t") + 
new String ("\t<m n=\":rtti\"/>\n\t") + 
new String ("</meta>\n</class>");
	}
	
	public ExistClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ExistClause(nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String TableName)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.orm.common.ddl.ExistClause.__hx_ctor_nMorph_framework_orm_common_ddl_ExistClause(this, CurrentDDL, TableName);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_ddl_ExistClause(nMorph.framework.orm.common.ddl.ExistClause __hx_this, nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String TableName)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		__hx_this.CurrentDDL = CurrentDDL;
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		__hx_this.TableName = TableName;
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.lang.DDL CurrentDDL;
	
	public java.lang.String TableName;
	
	public java.lang.String SCRIPT()
	{
		//line 25 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return this.CurrentDDL.GenerateAll();
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		java.lang.String Part = "";
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		switch (this.CurrentDDL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( ( "SELECT COUNT(*) AS EXIST " + "FROM information_schema.tables " ) + "WHERE table_name=\'" );
				//line 56 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( this.TableName + "\'" );
				//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( ( "select count(*) AS EXIST " + "from all_tables " ) + "where table_name= (\'" );
				//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( this.TableName + "\')" );
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( ( "SELECT count(*) AS EXIST " + "FROM information_schema.tables " ) + "WHERE table_name = \'" );
				//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( this.TableName + "\'" );
				//line 37 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += "SELECT ";
				//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( "SELECT COUNT(CAST(table_name as varchar)) AS EXIST " + "FROM INFORMATION_SCHEMA.TABLES WHERE  table_name= \'" );
				//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				Part += ( this.TableName + "\'" );
				//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				break;
			}
			
			
		}
		
		//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		this.CurrentDDL.AddBlock(Part);
	}
	
	
	public java.lang.Object Execute()
	{
		//line 63 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return this.CurrentDDL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 67 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 72 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 76 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 77 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 81 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 82 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 86 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 87 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 91 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 92 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 96 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 97 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		{
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (( field != null )) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				switch (field.hashCode())
				{
					case 15250265:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("TableName")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							this.TableName = haxe.lang.Runtime.toString(value);
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return value;
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (value) );
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return value;
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		{
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (( field != null )) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.CurrentDDL;
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Read")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 15250265:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("TableName")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.TableName;
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Execute")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Queue")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Register")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		{
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (( field != null )) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.SCRIPT();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Read")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.ReadTable();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Execute")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.Execute();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.ReadValue();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Register")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						if (field.equals("Queue")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		baseArr.push("TableName");
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		baseArr.push("CurrentDDL");
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\ExistClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

