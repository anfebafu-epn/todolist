// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.fields;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FloatSentence extends nMorph.framework.orm.common.sentences.FieldSentence
{
	static
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		nMorph.framework.orm.common.fields.FloatSentence.__rtti = new String("<class path=\"nMorph.framework.orm.common.fields.FloatSentence\" params=\"\">\n\t") + 
new String ("<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t") + 
new String ("<ValidateDBCompatibility public=\"1\" set=\"method\" line=\"22\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></ValidateDBCompatibility>\n\t") + 
new String ("<Equals public=\"1\" set=\"method\" line=\"27\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Equals>\n\t") + 
new String ("<Different public=\"1\" set=\"method\" line=\"33\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Different>\n\t") + 
new String ("<LessThan public=\"1\" set=\"method\" line=\"39\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThan>\n\t") + 
new String ("<LessThanAndEquals public=\"1\" set=\"method\" line=\"45\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThanAndEquals>\n\t") + 
new String ("<MoreThan public=\"1\" set=\"method\" line=\"51\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThan>\n\t") + 
new String ("<MoreThanAndEquals public=\"1\" set=\"method\" line=\"57\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThanAndEquals>\n\t") + 
new String ("<IsNull public=\"1\" set=\"method\" line=\"63\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNull>\n\t") + 
new String ("<IsNotNull public=\"1\" set=\"method\" line=\"68\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNotNull>\n\t") + 
new String ("<SET public=\"1\" set=\"method\" line=\"73\"><f a=\"FloatValue\">\n\t") + 
new String ("<x path=\"Float\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.interfaces.ISet\"/>\n</f></SET>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"17\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\n\t") + 
new String ("<x path=\"Bool\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></new>\n\t") + 
new String ("<meta>\n\t") + 
new String ("\t<m n=\":directlyUsed\"/>\n\t") + 
new String ("\t<m n=\":hxGen\"/>\n\t") + 
new String ("\t<m n=\":keep\"/>\n\t") + 
new String ("</meta>\n</class>");
	}
	
	public FloatSentence(haxe.lang.EmptyObject empty)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public FloatSentence(java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		nMorph.framework.orm.common.fields.FloatSentence.__hx_ctor_nMorph_framework_orm_common_fields_FloatSentence(this, FieldTable, FieldName, Nullable, IsPrimaryKey);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_fields_FloatSentence(nMorph.framework.orm.common.fields.FloatSentence __hx_this, java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, nMorph.framework.orm.common.enums.DBTypeEnum.FLOAT, nMorph.framework.orm.common.enums.HaxeTypeEnum.FLOAT, null, null, Nullable, IsPrimaryKey);
	}
	
	
	public static java.lang.String __rtti;
	
	public void ValidateDBCompatibility(double FloatValue)
	{
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition Equals(double FloatValue)
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition Different(double FloatValue)
	{
		//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Different, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition LessThan(double FloatValue)
	{
		//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.LessThan, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition LessThanAndEquals(double FloatValue)
	{
		//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.LessThanAndEquals, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition MoreThan(double FloatValue)
	{
		//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.MoreThan, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition MoreThanAndEquals(double FloatValue)
	{
		//line 58 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		this.ValidateDBCompatibility(FloatValue);
		//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.MoreThanAndEquals, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNull()
	{
		//line 64 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val._float(null));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNotNull()
	{
		//line 69 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Different, nMorph.framework.orm.common.sentences.Val._float(null));
	}
	
	
	public nMorph.framework.orm.interfaces.ISet SET(double FloatValue)
	{
		//line 74 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		nMorph.framework.orm.interfaces.ISet asg = nMorph.framework.orm.common.sentences.Assign.SET(this, nMorph.framework.orm.common.sentences.Val._float(FloatValue));
		//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return asg;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("SET")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SET")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ValidateDBCompatibility")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNotNull")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Equals")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNull")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -988319719:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("Different")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Different")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 1697285728:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("MoreThanAndEquals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "MoreThanAndEquals")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -2140646662:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("LessThan")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "LessThan")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -154292554:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("MoreThan")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "MoreThan")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -120951140:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("LessThanAndEquals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "LessThanAndEquals")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("SET")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.SET(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							this.ValidateDBCompatibility(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.IsNotNull();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.Equals(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.IsNull();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -988319719:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("Different")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.Different(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case 1697285728:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("MoreThanAndEquals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.MoreThanAndEquals(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -2140646662:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("LessThan")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.LessThan(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -154292554:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("MoreThan")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.MoreThan(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
					case -120951140:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						if (field.equals("LessThanAndEquals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
							return this.LessThanAndEquals(((double) (haxe.lang.Runtime.toDouble(dynargs[0])) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\FloatSentence.hx"
		return null;
	}
	
	
}


