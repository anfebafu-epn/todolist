// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.sentences;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FieldAliasSentence extends haxe.lang.HxObject implements nMorph.framework.orm.interfaces.ISentence
{
	static
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		nMorph.framework.orm.common.sentences.FieldAliasSentence.__rtti = new String("<class path=\"nMorph.framework.orm.common.sentences.FieldAliasSentence\" params=\"\">\n\t") + 
new String ("<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t") + 
new String ("<SET public=\"1\" set=\"method\" line=\"25\" static=\"1\"><f a=\"TableAlias:InnerField\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.sentences.FieldAliasSentence\"/>\n</f></SET>\n\t") + 
new String ("<TableAlias><c path=\"String\"/></TableAlias>\n\t") + 
new String ("<InnerField><c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/></InnerField>\n\t") + 
new String ("<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t") + 
new String ("<IsNullValue public=\"1\" set=\"method\" line=\"21\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\n\t") + 
new String ("<RegisterQuery public=\"1\" set=\"method\" line=\"31\"><f a=\"CurrentSQL\">\n\t") + 
new String ("<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></RegisterQuery>\n\t") + 
new String ("<SCRIPT_PART public=\"1\" set=\"method\" line=\"35\"><f a=\"?args\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"16\"><f a=\"TableAlias:InnerField\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></new>\n\t") + 
new String ("<meta>\n\t") + 
new String ("\t<m n=\":directlyUsed\"/>\n\t") + 
new String ("\t<m n=\":hxGen\"/>\n\t") + 
new String ("\t<m n=\":keepSub\"/>\n\t") + 
new String ("\t<m n=\":rtti\"/>\n\t") + 
new String ("</meta>\n</class>");
	}
	
	public FieldAliasSentence(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FieldAliasSentence(java.lang.String TableAlias, nMorph.framework.orm.common.sentences.FieldSentence InnerField)
	{
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		nMorph.framework.orm.common.sentences.FieldAliasSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldAliasSentence(this, TableAlias, InnerField);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_sentences_FieldAliasSentence(nMorph.framework.orm.common.sentences.FieldAliasSentence __hx_this, java.lang.String TableAlias, nMorph.framework.orm.common.sentences.FieldSentence InnerField)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		__hx_this.TableAlias = TableAlias;
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		__hx_this.InnerField = InnerField;
	}
	
	
	public static java.lang.String __rtti;
	
	public static nMorph.framework.orm.common.sentences.FieldAliasSentence SET(java.lang.String TableAlias, nMorph.framework.orm.common.sentences.FieldSentence InnerField)
	{
		//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		nMorph.framework.orm.common.sentences.FieldAliasSentence fas = new nMorph.framework.orm.common.sentences.FieldAliasSentence(haxe.lang.Runtime.toString(TableAlias), ((nMorph.framework.orm.common.sentences.FieldSentence) (InnerField) ));
		//line 27 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		return fas;
	}
	
	
	public java.lang.String TableAlias;
	
	public nMorph.framework.orm.common.sentences.FieldSentence InnerField;
	
	public nMorph.framework.orm.lang.SQL CurrentSQL;
	
	public boolean IsNullValue()
	{
		//line 22 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		return false;
	}
	
	
	public void RegisterQuery(nMorph.framework.orm.interfaces.ILang CurrentSQL)
	{
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (CurrentSQL) );
	}
	
	
	public void SCRIPT_PART(java.lang.String args)
	{
		//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		switch (this.CurrentSQL.getCurrentEngine())
		{
			case SQLSERVER:
			{
				//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.CurrentSQL.AddBlock(( this.TableAlias + "." ));
				//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.InnerField.SCRIPT_PART("ONLYNAME");
				//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				break;
			}
			
			
			case ORACLE:
			{
				//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.CurrentSQL.AddBlock(( this.TableAlias + "." ));
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.InnerField.SCRIPT_PART("ONLYNAME");
				//line 44 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				break;
			}
			
			
			case MYSQL:
			{
				//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.CurrentSQL.AddBlock(( this.TableAlias + "." ));
				//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.InnerField.SCRIPT_PART("ONLYNAME");
				//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				break;
			}
			
			
			case POSTGRESQL:
			{
				//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.CurrentSQL.AddBlock(( this.TableAlias + "." ));
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.InnerField.SCRIPT_PART("ONLYNAME");
				//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				break;
			}
			
			
			case GENERIC:
			{
				//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.CurrentSQL.AddBlock(( this.TableAlias + "." ));
				//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				this.InnerField.SCRIPT_PART("ONLYNAME");
				//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				break;
			}
			
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				switch (field.hashCode())
				{
					case 904479157:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							this.CurrentSQL = ((nMorph.framework.orm.lang.SQL) (value) );
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case 461076290:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("TableAlias")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							this.TableAlias = haxe.lang.Runtime.toString(value);
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -1501313948:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("InnerField")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							this.InnerField = ((nMorph.framework.orm.common.sentences.FieldSentence) (value) );
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return value;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SCRIPT_PART")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case 461076290:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("TableAlias")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return this.TableAlias;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "RegisterQuery")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -1501313948:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("InnerField")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return this.InnerField;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -414309888:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("IsNullValue")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNullValue")) );
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case 904479157:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("CurrentSQL")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return this.CurrentSQL;
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		{
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (( field != null )) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				switch (field.hashCode())
				{
					case 1864996583:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("SCRIPT_PART")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							this.SCRIPT_PART(haxe.lang.Runtime.toString(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) )));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -414309888:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("IsNullValue")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							return this.IsNullValue();
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
					case -603859003:
					{
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						if (field.equals("RegisterQuery")) 
						{
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							__temp_executeDef1 = false;
							//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
							this.RegisterQuery(((nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						}
						
						//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		baseArr.push("CurrentSQL");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		baseArr.push("InnerField");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		baseArr.push("TableAlias");
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\sentences\\FieldAliasSentence.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


