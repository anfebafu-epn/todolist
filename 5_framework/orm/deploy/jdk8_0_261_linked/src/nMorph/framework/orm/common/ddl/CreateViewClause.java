// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.ddl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CreateViewClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	static
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.orm.common.ddl.CreateViewClause.__rtti = new String("<class path=\"nMorph.framework.orm.common.ddl.CreateViewClause\" params=\"\">\n\t") + 
new String ("<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t") + 
new String ("<CurrentDDL><c path=\"nMorph.framework.orm.lang.DDL\"/></CurrentDDL>\n\t") + 
new String ("<ViewName><c path=\"String\"/></ViewName>\n\t") + 
new String ("<InnerSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></InnerSQL>\n\t") + 
new String ("<SELECT public=\"1\" set=\"method\" line=\"28\"><f a=\"Sentences\">\n\t") + 
new String ("<c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.ISentence\"/></c>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.clauses.SelectClause\"/>\n</f></SELECT>\n\t") + 
new String ("<SCRIPT_PART public=\"1\" set=\"method\" line=\"35\"><f a=\"?args\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t") + 
new String ("<SCRIPT public=\"1\" set=\"method\" line=\"56\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t") + 
new String ("<Execute public=\"1\" set=\"method\" line=\"60\"><f a=\"\"><d/></f></Execute>\n\t") + 
new String ("<Register public=\"1\" set=\"method\" line=\"64\"><f a=\"context\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></Register>\n\t") + 
new String ("<Queue public=\"1\" set=\"method\" line=\"68\"><f a=\"queue\">\n\t") + 
new String ("<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t") + 
new String ("<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t") + 
new String ("<Bulk public=\"1\" set=\"method\" line=\"73\"><f a=\"bulk\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t") + 
new String ("<ReadValue public=\"1\" set=\"method\" line=\"78\"><f a=\"\"><d/></f></ReadValue>\n\t") + 
new String ("<ReadTable public=\"1\" set=\"method\" line=\"83\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t") + 
new String ("<Read public=\"1\" params=\"T\" set=\"method\" line=\"88\"><f a=\"cl:?context\">\n\t") + 
new String ("<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t") + 
new String ("<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"93\"><f a=\"cl:?context\">\n\t") + 
new String ("<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t") + 
new String ("<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"23\"><f a=\"CurrentDDL:ViewName\">\n\t") + 
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
	
	public CreateViewClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CreateViewClause(nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String ViewName)
	{
		//line 23 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.orm.common.ddl.CreateViewClause.__hx_ctor_nMorph_framework_orm_common_ddl_CreateViewClause(this, CurrentDDL, ViewName);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_ddl_CreateViewClause(nMorph.framework.orm.common.ddl.CreateViewClause __hx_this, nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String ViewName)
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		__hx_this.CurrentDDL = CurrentDDL;
		//line 25 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		__hx_this.ViewName = ViewName;
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.lang.DDL CurrentDDL;
	
	public java.lang.String ViewName;
	
	public nMorph.framework.orm.lang.SQL InnerSQL;
	
	public nMorph.framework.orm.common.clauses.SelectClause SELECT(haxe.root.Array<nMorph.framework.orm.interfaces.ISentence> Sentences)
	{
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		this.InnerSQL = new nMorph.framework.orm.lang.SQL();
		//line 30 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.orm.common.clauses.SelectClause df = new nMorph.framework.orm.common.clauses.SelectClause(((nMorph.framework.orm.lang.SQL) (this.InnerSQL) ), ((haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>) (Sentences) ));
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		this.CurrentDDL.AddClause(df);
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return df;
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		switch (this.CurrentDDL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE VIEW \"" + this.ViewName ) + "\" AS " ));
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(this.InnerSQL.GenerateAll());
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE VIEW \"" + this.ViewName ) + "\" AS " ));
				//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(this.InnerSQL.GenerateAll());
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE VIEW \"" + this.ViewName ) + "\" AS " ));
				//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(this.InnerSQL.GenerateAll());
				//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE VIEW \"" + this.ViewName ) + "\" AS " ));
				//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(this.InnerSQL.GenerateAll());
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE VIEW \"" + this.ViewName ) + "\" AS " ));
				//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				this.CurrentDDL.AddBlock(this.InnerSQL.GenerateAll());
				//line 37 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				break;
			}
			
			
		}
		
	}
	
	
	public java.lang.String SCRIPT()
	{
		//line 57 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return this.CurrentDDL.GenerateAll();
	}
	
	
	public java.lang.Object Execute()
	{
		//line 61 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return this.CurrentDDL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 65 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 69 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 70 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 74 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 79 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 80 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 84 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 85 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 89 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 90 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 95 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		{
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (( field != null )) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				switch (field.hashCode())
				{
					case 463253432:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("InnerSQL")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							this.InnerSQL = ((nMorph.framework.orm.lang.SQL) (value) );
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return value;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (value) );
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return value;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 1260303088:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ViewName")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							this.ViewName = haxe.lang.Runtime.toString(value);
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return value;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		{
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (( field != null )) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.CurrentDDL;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Read")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 1260303088:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ViewName")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.ViewName;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 463253432:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("InnerSQL")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.InnerSQL;
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -1852692228:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SELECT")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SELECT")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Queue")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Register")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Execute")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		{
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			boolean __temp_executeDef1 = true;
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (( field != null )) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -1852692228:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SELECT")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.SELECT(((haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>) (dynargs[0]) ));
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Read")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.ReadTable();
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.SCRIPT();
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.ReadValue();
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Execute")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.Execute();
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Register")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						if (field.equals("Queue")) 
						{
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							__temp_executeDef1 = false;
							//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
			if (__temp_executeDef1) 
			{
				//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		baseArr.push("InnerSQL");
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		baseArr.push("ViewName");
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		baseArr.push("CurrentDDL");
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateViewClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


