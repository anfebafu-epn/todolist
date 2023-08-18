// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.ddl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CreateIndexClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	static
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.orm.common.ddl.CreateIndexClause.__rtti = "<class path=\"nMorph.framework.orm.common.ddl.CreateIndexClause\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<CurrentDDL><c path=\"nMorph.framework.orm.lang.DDL\"/></CurrentDDL>\n\t<IndexName><c path=\"String\"/></IndexName>\n\t<Columns><c path=\"nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences\"/></Columns>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"32\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<SCRIPT public=\"1\" set=\"method\" line=\"62\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t<Execute public=\"1\" set=\"method\" line=\"66\"><f a=\"\"><d/></f></Execute>\n\t<Register public=\"1\" set=\"method\" line=\"70\"><f a=\"context\">\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Register>\n\t<Queue public=\"1\" set=\"method\" line=\"74\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<Bulk public=\"1\" set=\"method\" line=\"79\"><f a=\"bulk\">\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t<ReadValue public=\"1\" set=\"method\" line=\"84\"><f a=\"\"><d/></f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"89\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"94\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"99\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<new public=\"1\" set=\"method\" line=\"25\"><f a=\"CurrentDDL:IndexName:Columns\">\n\t<c path=\"nMorph.framework.orm.lang.DDL\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public CreateIndexClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CreateIndexClause(nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String IndexName, nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences Columns)
	{
		//line 25 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.orm.common.ddl.CreateIndexClause.__hx_ctor_nMorph_framework_orm_common_ddl_CreateIndexClause(this, CurrentDDL, IndexName, Columns);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_ddl_CreateIndexClause(nMorph.framework.orm.common.ddl.CreateIndexClause __hx_this, nMorph.framework.orm.lang.DDL CurrentDDL, java.lang.String IndexName, nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences Columns)
	{
		//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		__hx_this.CurrentDDL = CurrentDDL;
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		__hx_this.IndexName = IndexName;
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		__hx_this.Columns = Columns;
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		__hx_this.Columns.RegisterQuery(CurrentDDL);
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.lang.DDL CurrentDDL;
	
	public java.lang.String IndexName;
	
	public nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences Columns;
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		switch (this.CurrentDDL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 57 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE INDEX \"" + this.IndexName ) + "\" ON " ));
				//line 58 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.Columns.SCRIPT_PART(null);
				//line 56 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE INDEX \"" + this.IndexName ) + "\" ON " ));
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.Columns.SCRIPT_PART(null);
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE INDEX \"" + this.IndexName ) + "\" ON " ));
				//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.Columns.SCRIPT_PART(null);
				//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE INDEX \"" + this.IndexName ) + "\" ON " ));
				//line 54 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.Columns.SCRIPT_PART(null);
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.CurrentDDL.AddBlock(( ( "CREATE INDEX \"" + this.IndexName ) + "\" ON " ));
				//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				this.Columns.SCRIPT_PART(null);
				//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				break;
			}
			
			
		}
		
	}
	
	
	public java.lang.String SCRIPT()
	{
		//line 63 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return this.CurrentDDL.GenerateAll();
	}
	
	
	public java.lang.Object Execute()
	{
		//line 67 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return this.CurrentDDL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 76 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 80 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 81 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 85 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 86 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 90 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 91 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 95 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 96 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 100 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
		//line 101 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				switch (field.hashCode())
				{
					case -1680592963:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Columns")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							this.Columns = ((nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences) (value) );
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return value;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (value) );
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return value;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 1196260957:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("IndexName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							this.IndexName = haxe.lang.Runtime.toString(value);
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return value;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.CurrentDDL;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Read")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 1196260957:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("IndexName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.IndexName;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case -1680592963:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Columns")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.Columns;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Queue")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Execute")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Register")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Read")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.SCRIPT();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.ReadTable();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Execute")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.Execute();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.ReadValue();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Register")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						if (field.equals("Queue")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		baseArr.push("Columns");
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		baseArr.push("IndexName");
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		baseArr.push("CurrentDDL");
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\ddl\\CreateIndexClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


