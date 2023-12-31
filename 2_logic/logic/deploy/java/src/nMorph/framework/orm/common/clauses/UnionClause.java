// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.clauses;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class UnionClause extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.IClause
{
	static
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		nMorph.framework.orm.common.clauses.UnionClause.__rtti = "<class path=\"nMorph.framework.orm.common.clauses.UnionClause\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<UnionType><e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/></UnionType>\n\t<InnerClause><c path=\"nMorph.framework.orm.interfaces.IClause\"/></InnerClause>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<UNION public=\"1\" set=\"method\" line=\"26\"><f a=\"UnionType:Clause\">\n\t<e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<c path=\"nMorph.framework.orm.common.clauses.UnionClause\"/>\n</f></UNION>\n\t<SCRIPT public=\"1\" set=\"method\" line=\"32\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"36\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<Execute public=\"1\" set=\"method\" line=\"97\"><f a=\"\"><d/></f></Execute>\n\t<Register public=\"1\" set=\"method\" line=\"101\"><f a=\"context\">\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Register>\n\t<Queue public=\"1\" set=\"method\" line=\"105\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<Bulk public=\"1\" set=\"method\" line=\"109\"><f a=\"bulk\">\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t<ReadValue public=\"1\" set=\"method\" line=\"114\"><f a=\"\"><d/></f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"118\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"122\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"126\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<new public=\"1\" set=\"method\" line=\"20\"><f a=\"CurrentSQL:UnionType:InnerClause\">\n\t<c path=\"nMorph.framework.orm.lang.SQL\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public UnionClause(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public UnionClause(nMorph.framework.orm.lang.SQL CurrentSQL, nMorph.framework.orm.common.enums.UnionTypeEnum UnionType, nMorph.framework.orm.interfaces.IClause InnerClause)
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		nMorph.framework.orm.common.clauses.UnionClause.__hx_ctor_nMorph_framework_orm_common_clauses_UnionClause(this, CurrentSQL, UnionType, InnerClause);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_clauses_UnionClause(nMorph.framework.orm.common.clauses.UnionClause __hx_this, nMorph.framework.orm.lang.SQL CurrentSQL, nMorph.framework.orm.common.enums.UnionTypeEnum UnionType, nMorph.framework.orm.interfaces.IClause InnerClause)
	{
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		__hx_this.UnionType = UnionType;
		//line 22 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		__hx_this.InnerClause = InnerClause;
		//line 23 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		__hx_this.CurrentSQL = CurrentSQL;
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.common.enums.UnionTypeEnum UnionType;
	
	public nMorph.framework.orm.interfaces.IClause InnerClause;
	
	public nMorph.framework.orm.lang.SQL CurrentSQL;
	
	public nMorph.framework.orm.common.clauses.UnionClause UNION(nMorph.framework.orm.common.enums.UnionTypeEnum UnionType, nMorph.framework.orm.interfaces.IClause Clause)
	{
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		nMorph.framework.orm.common.clauses.UnionClause uc = new nMorph.framework.orm.common.clauses.UnionClause(((nMorph.framework.orm.lang.SQL) (this.CurrentSQL) ), ((nMorph.framework.orm.common.enums.UnionTypeEnum) (UnionType) ), ((nMorph.framework.orm.interfaces.IClause) (Clause) ));
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		this.CurrentSQL.AddClause(uc);
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return uc;
	}
	
	
	public java.lang.String SCRIPT()
	{
		//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return this.CurrentSQL.GenerateAll();
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		switch (this.CurrentSQL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 84 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				java.lang.String Part = "";
				//line 86 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				{
					//line 86 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					nMorph.framework.orm.common.enums.UnionTypeEnum _g = this.UnionType;
					//line 88 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					{
						//line 89 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part += " UNION (";
						//line 90 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part += this.InnerClause.SCRIPT();
						//line 91 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part += ") ";
					}
					
				}
				
				//line 93 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				this.CurrentSQL.AddBlock(Part);
				//line 83 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 62 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				java.lang.String Part1 = "";
				//line 64 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				{
					//line 64 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					nMorph.framework.orm.common.enums.UnionTypeEnum _g1 = this.UnionType;
					//line 66 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					{
						//line 67 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part1 += " UNION (";
						//line 68 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part1 += this.InnerClause.SCRIPT();
						//line 69 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part1 += ") ";
					}
					
				}
				
				//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				this.CurrentSQL.AddBlock(Part1);
				//line 61 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				java.lang.String Part2 = "";
				//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				{
					//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					nMorph.framework.orm.common.enums.UnionTypeEnum _g2 = this.UnionType;
					//line 55 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					{
						//line 56 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part2 += " UNION (";
						//line 57 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part2 += this.InnerClause.SCRIPT();
						//line 58 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part2 += ") ";
					}
					
				}
				
				//line 60 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				this.CurrentSQL.AddBlock(Part2);
				//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 73 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				java.lang.String Part3 = "";
				//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				{
					//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					nMorph.framework.orm.common.enums.UnionTypeEnum _g3 = this.UnionType;
					//line 77 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					{
						//line 78 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part3 += " UNION (";
						//line 79 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part3 += this.InnerClause.SCRIPT();
						//line 80 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part3 += ") ";
					}
					
				}
				
				//line 82 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				this.CurrentSQL.AddBlock(Part3);
				//line 72 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				java.lang.String Part4 = "";
				//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				{
					//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					nMorph.framework.orm.common.enums.UnionTypeEnum _g4 = this.UnionType;
					//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
					{
						//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part4 += " UNION (";
						//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part4 += this.InnerClause.SCRIPT();
						//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						Part4 += ") ";
					}
					
				}
				
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				this.CurrentSQL.AddBlock(Part4);
				//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				break;
			}
			
			
		}
		
	}
	
	
	public java.lang.Object Execute()
	{
		//line 98 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return this.CurrentSQL.Execute();
	}
	
	
	public void Register(nMorph.framework.orm.tools.Context context)
	{
		//line 102 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		context.set_Queue(this.CurrentSQL.Queue(context.get_Queue()));
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 106 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return this.CurrentSQL.Queue(queue);
	}
	
	
	public nMorph.framework.orm.tools.BulkRun Bulk(nMorph.framework.orm.tools.BulkRun bulk)
	{
		//line 110 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		bulk.set_queue(this.CurrentSQL.Queue(bulk.get_queue()));
		//line 111 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return bulk;
	}
	
	
	public java.lang.Object ReadValue()
	{
		//line 115 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return this.CurrentSQL.ReadValue();
	}
	
	
	public nMorph.framework.orm.client.QueryTable ReadTable()
	{
		//line 119 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return this.CurrentSQL.ReadTable();
	}
	
	
	public <T> haxe.root.Array<T> Read(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 123 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return ((haxe.root.Array<T>) (((haxe.root.Array) (this.CurrentSQL.Read(((java.lang.Class) (cl) ), ((nMorph.framework.orm.tools.Context) (context) ))) )) );
	}
	
	
	public <T> T ReadOne(java.lang.Class cl, nMorph.framework.orm.tools.Context context)
	{
		//line 127 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return ((T) (this.CurrentSQL.ReadOne(((java.lang.Class) (cl) ), ((nMorph.framework.orm.tools.Context) (context) ))) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				switch (field.hashCode())
				{
					case 904479157:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (value) );
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return value;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 1401453193:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("UnionType")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							this.UnionType = ((nMorph.framework.orm.common.enums.UnionTypeEnum) (value) );
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return value;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 620681029:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("InnerClause")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							this.InnerClause = ((nMorph.framework.orm.interfaces.IClause) (value) );
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return value;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadOne")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 1401453193:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("UnionType")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.UnionType;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Read")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Read")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 620681029:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("InnerClause")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.InnerClause;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadTable")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 904479157:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.CurrentSQL;
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ReadValue")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 80895663:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("UNION")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "UNION")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Bulk")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Queue")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Queue")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Register")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Register")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Execute")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				switch (field.hashCode())
				{
					case -1549925168:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadOne")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((java.lang.Object) (this.ReadOne(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 80895663:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("UNION")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.UNION(((nMorph.framework.orm.common.enums.UnionTypeEnum) (dynargs[0]) ), ((nMorph.framework.orm.interfaces.IClause) (dynargs[1]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 2543030:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Read")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return ((haxe.root.Array<java.lang.Object>) (this.Read(((java.lang.Class) (dynargs[0]) ), ((nMorph.framework.orm.tools.Context) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ))) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case -1854356277:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("SCRIPT")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.SCRIPT();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 879796152:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadTable")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.ReadTable();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 1864996583:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 881653083:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("ReadValue")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.ReadValue();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 345083733:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Execute")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.Execute();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 2082098:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Bulk")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.Bulk(((nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case -625569085:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Register")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							this.Register(((nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
					case 78391537:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						if (field.equals("Queue")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
							return this.Queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		baseArr.push("CurrentSQL");
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		baseArr.push("InnerClause");
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		baseArr.push("UnionType");
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\clauses\\UnionClause.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


