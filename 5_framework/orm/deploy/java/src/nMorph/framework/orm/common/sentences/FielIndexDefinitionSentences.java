// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.sentences;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FielIndexDefinitionSentences extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.ISentence
{
	static
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences.__rtti = "<class path=\"nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<FieldName public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</FieldName>\n\t<FieldTable public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</FieldTable>\n\t<CurrentDDL public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"nMorph.framework.orm.lang.DDL\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</CurrentDDL>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"23\"><f a=\"CurrentDDL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<IsNullValue public=\"1\" set=\"method\" line=\"28\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\n\t<get_FieldName set=\"method\" line=\"33\"><f a=\"\"><c path=\"String\"/></f></get_FieldName>\n\t<get_FieldTable set=\"method\" line=\"38\"><f a=\"\"><c path=\"String\"/></f></get_FieldTable>\n\t<get_CurrentDDL set=\"method\" line=\"43\"><f a=\"\"><c path=\"nMorph.framework.orm.lang.DDL\"/></f></get_CurrentDDL>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"47\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<new public=\"1\" set=\"method\" line=\"17\"><f a=\"FieldTable:FieldName\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public FielIndexDefinitionSentences(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FielIndexDefinitionSentences(java.lang.String FieldTable, java.lang.String FieldName)
	{
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences.__hx_ctor_nMorph_framework_orm_common_sentences_FielIndexDefinitionSentences(this, FieldTable, FieldName);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_sentences_FielIndexDefinitionSentences(nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences __hx_this, java.lang.String FieldTable, java.lang.String FieldName)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		__hx_this.FieldName = ( ( "\"" + FieldName ) + "\"" );
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		__hx_this.FieldTable = ( ( "\"" + FieldTable ) + "\"" );
	}
	
	
	public static java.lang.String __rtti;
	
	public java.lang.String FieldName;
	
	public java.lang.String FieldTable;
	
	public nMorph.framework.orm.lang.DDL CurrentDDL;
	
	public void RegisterQuery(nMorph.framework.orm.interfaces.ILang CurrentDDL)
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (CurrentDDL) );
	}
	
	
	public boolean IsNullValue()
	{
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		return false;
	}
	
	
	public java.lang.String get_FieldName()
	{
		//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		return this.FieldName;
	}
	
	
	public java.lang.String get_FieldTable()
	{
		//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		return this.FieldTable;
	}
	
	
	public nMorph.framework.orm.lang.DDL get_CurrentDDL()
	{
		//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		return this.CurrentDDL;
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		switch (this.get_CurrentDDL().getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 131 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				if (( args != null )) 
				{
					//line 133 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					if (haxe.lang.Runtime.valEq(args, "ONLYNAME")) 
					{
						//line 135 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						this.get_CurrentDDL().AddBlock(this.get_FieldName());
					}
					else
					{
						//line 137 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (haxe.lang.Runtime.valEq(args, "WITHTABLE")) 
						{
							//line 139 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						else
						{
							//line 143 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						
					}
					
				}
				else
				{
					//line 148 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
				}
				
				//line 131 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 91 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				if (( args != null )) 
				{
					//line 93 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					if (haxe.lang.Runtime.valEq(args, "ONLYNAME")) 
					{
						//line 95 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						this.get_CurrentDDL().AddBlock(this.get_FieldName());
					}
					else
					{
						//line 97 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (haxe.lang.Runtime.valEq(args, "WITHTABLE")) 
						{
							//line 99 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						else
						{
							//line 103 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						
					}
					
				}
				else
				{
					//line 108 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
				}
				
				//line 91 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				if (( args != null )) 
				{
					//line 73 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					if (haxe.lang.Runtime.valEq(args, "ONLYNAME")) 
					{
						//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						this.get_CurrentDDL().AddBlock(this.get_FieldName());
					}
					else
					{
						//line 77 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (haxe.lang.Runtime.valEq(args, "WITHTABLE")) 
						{
							//line 79 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						else
						{
							//line 83 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						
					}
					
				}
				else
				{
					//line 88 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
				}
				
				//line 71 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 111 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				if (( args != null )) 
				{
					//line 113 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					if (haxe.lang.Runtime.valEq(args, "ONLYNAME")) 
					{
						//line 115 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						this.get_CurrentDDL().AddBlock(this.get_FieldName());
					}
					else
					{
						//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (haxe.lang.Runtime.valEq(args, "WITHTABLE")) 
						{
							//line 119 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						else
						{
							//line 123 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						
					}
					
				}
				else
				{
					//line 128 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
				}
				
				//line 111 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				if (( args != null )) 
				{
					//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					if (haxe.lang.Runtime.valEq(args, "ONLYNAME")) 
					{
						//line 55 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						this.get_CurrentDDL().AddBlock(this.get_FieldName());
					}
					else
					{
						//line 57 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (haxe.lang.Runtime.valEq(args, "WITHTABLE")) 
						{
							//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						else
						{
							//line 63 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
						}
						
					}
					
				}
				else
				{
					//line 68 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
					this.get_CurrentDDL().AddBlock(( ( ( this.get_FieldTable() + "(" ) + this.get_FieldName() ) + ")" ));
				}
				
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				break;
			}
			
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				switch (field.hashCode())
				{
					case 904464339:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.CurrentDDL = ((nMorph.framework.orm.lang.DDL) (value) );
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -1025990011:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("FieldName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.FieldName = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -1735388396:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("FieldTable")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.FieldTable = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -1025990011:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("FieldName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ( (handleProperties) ? (this.get_FieldName()) : (this.FieldName) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -315360164:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_CurrentDDL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_CurrentDDL")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -1735388396:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("FieldTable")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ( (handleProperties) ? (this.get_FieldTable()) : (this.FieldTable) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case 1339754397:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_FieldTable")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_FieldTable")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case 904464339:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("CurrentDDL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ( (handleProperties) ? (this.get_CurrentDDL()) : (this.CurrentDDL) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -511149860:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_FieldName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_FieldName")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "RegisterQuery")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -414309888:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("IsNullValue")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNullValue")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							this.RegisterQuery(((nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -315360164:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_CurrentDDL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return this.get_CurrentDDL();
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -414309888:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("IsNullValue")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return this.IsNullValue();
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case 1339754397:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_FieldTable")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return this.get_FieldTable();
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
					case -511149860:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						if (field.equals("get_FieldName")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
							return this.get_FieldName();
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		baseArr.push("CurrentDDL");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		baseArr.push("FieldTable");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		baseArr.push("FieldName");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FielIndexDefinitionSentences.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


