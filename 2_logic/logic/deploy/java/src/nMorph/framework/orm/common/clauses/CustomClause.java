// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.clauses;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CustomClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	static
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		nMorph.framework.orm.common.clauses.CustomClause.__rtti = "<class path=\"nMorph.framework.orm.common.clauses.CustomClause\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<CustomQueries><t path=\"Map\">\n\t<c path=\"String\"/>\n\t<e path=\"nMorph.framework.orm.configuration.DatabaseEngineEnum\"/>\n</t></CustomQueries>\n\t<Parameters><c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c></Parameters>\n\t<SCRIPT public=\"1\" set=\"method\" line=\"34\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"39\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<Execute public=\"1\" set=\"method\" line=\"58\"><f a=\"\"><d/></f></Execute>\n\t<Register public=\"1\" set=\"method\" line=\"63\"><f a=\"context\">\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Register>\n\t<Queue public=\"1\" set=\"method\" line=\"68\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<Bulk public=\"1\" set=\"method\" line=\"73\"><f a=\"bulk\">\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t<ReadValue public=\"1\" set=\"method\" line=\"79\"><f a=\"\"><d/></f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"84\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"89\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"94\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<new public=\"1\" set=\"method\" line=\"27\"><f a=\"CurrentSQL:CustomQueries:?Parameters\">\n\t<c path=\"nMorph.framework.orm.lang.SQL\"/>\n\t<t path=\"Map\">\n\t\t<c path=\"String\"/>\n\t\t<e path=\"nMorph.framework.orm.configuration.DatabaseEngineEnum\"/>\n\t</t>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Void\"/>\n</f></new>\n\t<haxe_doc>* Cl\u00e1usula que permite la ejecuci\u00f3n de m\u00e9todos con la incorporaci\u00f3n de queries directos\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public CustomClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CustomClause(nMorph.framework.orm.lang.SQL CurrentSQL, haxe.ds.StringMap<nMorph.framework.orm.configuration.DatabaseEngineEnum> CustomQueries, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters)
	{
		//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		nMorph.framework.orm.common.clauses.CustomClause.__hx_ctor_nMorph_framework_orm_common_clauses_CustomClause(this, CurrentSQL, CustomQueries, Parameters);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_clauses_CustomClause(nMorph.framework.orm.common.clauses.CustomClause __hx_this, nMorph.framework.orm.lang.SQL CurrentSQL, haxe.ds.StringMap<nMorph.framework.orm.configuration.DatabaseEngineEnum> CustomQueries, haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters)
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		__hx_this.CurrentSQL = CurrentSQL;
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		__hx_this.CustomQueries = CustomQueries;
		//line 30 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		__hx_this.Parameters = Parameters;
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.lang.SQL CurrentSQL;
	
	public haxe.ds.StringMap<nMorph.framework.orm.configuration.DatabaseEngineEnum> CustomQueries;
	
	public haxe.root.Array<nMorph.framework.orm.client.QueryParameter> Parameters;
	
	public java.lang.String SCRIPT()
	{
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return this.CurrentSQL.GenerateAll();
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		haxe.IMap<java.lang.String, nMorph.framework.orm.configuration.DatabaseEngineEnum> map = ((haxe.ds.StringMap<nMorph.framework.orm.configuration.DatabaseEngineEnum>) (((haxe.IMap<java.lang.String, nMorph.framework.orm.configuration.DatabaseEngineEnum>) (this.CustomQueries) )) );
		//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		haxe.IMap<java.lang.String, nMorph.framework.orm.configuration.DatabaseEngineEnum> _g_map = map;
		//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		java.lang.Object _g_keys = map.keys();
		//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(_g_keys, "hasNext", null)) )))
		{
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			java.lang.String key = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(_g_keys, "next", null));
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			nMorph.framework.orm.configuration.DatabaseEngineEnum _g1_value = ((nMorph.framework.orm.configuration.DatabaseEngineEnum) (_g_map.get(key)) );
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			java.lang.String _g1_key = key;
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			java.lang.String k = _g1_key;
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			nMorph.framework.orm.configuration.DatabaseEngineEnum v = _g1_value;
			//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (( v == this.CurrentSQL.getCurrentEngine() )) 
			{
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				this.CurrentSQL.AddBlock(k);
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				{
					//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
					int _g = 0;
					//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
					haxe.root.Array<nMorph.framework.orm.client.QueryParameter> _g1 = this.Parameters;
					//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
					while (( _g < _g1.length ))
					{
						//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						nMorph.framework.orm.client.QueryParameter par = _g1.__get(_g);
						//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						 ++ _g;
						//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						this.CurrentSQL.AddParameter(par);
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public java.lang.Object Execute()
	{
		//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return this.CurrentSQL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 64 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		context.set_Queue(this.CurrentSQL.Queue(context.get_Queue()));
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 69 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return this.CurrentSQL.Queue(queue);
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 74 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		bulk.set_queue(this.CurrentSQL.Queue(bulk.get_queue()));
		//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return bulk;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 80 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return this.CurrentSQL.ReadValue();
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 85 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return this.CurrentSQL.ReadTable();
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 90 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return ((haxe.root.Array<T>) (((haxe.root.Array) (this.CurrentSQL.Read(((java.lang.Class) (cl) ), ((nMorph.framework.orm.tools.Context) (context) ))) )) );
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 95 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return ((T) (this.CurrentSQL.ReadOne(((java.lang.Class) (cl) ), ((nMorph.framework.orm.tools.Context) (context) ))) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		{
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (( field != null )) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				switch (field.hashCode())
				{
					case -1842766326:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Parameters")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							this.Parameters = ((haxe.root.Array<nMorph.framework.orm.client.QueryParameter>) (value) );
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return value;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 904479157:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (value) );
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return value;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -1823505771:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("CustomQueries")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							this.CustomQueries = ((haxe.ds.StringMap<nMorph.framework.orm.configuration.DatabaseEngineEnum>) (value) );
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return value;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		{
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (( field != null )) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 904479157:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.CurrentSQL;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Read")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -1823505771:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("CustomQueries")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.CustomQueries;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -1842766326:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Parameters")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.Parameters;
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Queue")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Execute")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Register")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		{
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			boolean __temp_executeDef1 = true;
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (( field != null )) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.SCRIPT();
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Read")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.ReadTable();
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Execute")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.Execute();
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.ReadValue();
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Register")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						if (field.equals("Queue")) 
						{
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							__temp_executeDef1 = false;
							//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
			if (__temp_executeDef1) 
			{
				//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		baseArr.push("Parameters");
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		baseArr.push("CustomQueries");
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		baseArr.push("CurrentSQL");
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\CustomClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

