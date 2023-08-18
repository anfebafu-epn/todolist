// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.fields;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DateTimeSentence extends nMorph.framework.orm.common.sentences.FieldSentence
{
	static
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		nMorph.framework.orm.common.fields.DateTimeSentence.__rtti = "<class path=\"nMorph.framework.orm.common.fields.DateTimeSentence\" params=\"\">\n\t<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t<ValidateDBCompatibility public=\"1\" set=\"method\" line=\"20\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<x path=\"Void\"/>\n</f></ValidateDBCompatibility>\n\t<Equals public=\"1\" set=\"method\" line=\"30\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Equals>\n\t<Different public=\"1\" set=\"method\" line=\"35\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Different>\n\t<LessThan public=\"1\" set=\"method\" line=\"40\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThan>\n\t<LessThanAndEquals public=\"1\" set=\"method\" line=\"45\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThanAndEquals>\n\t<MoreThan public=\"1\" set=\"method\" line=\"50\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThan>\n\t<MoreThanAndEquals public=\"1\" set=\"method\" line=\"55\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThanAndEquals>\n\t<IsNull public=\"1\" set=\"method\" line=\"60\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNull>\n\t<IsNotNull public=\"1\" set=\"method\" line=\"64\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNotNull>\n\t<SET public=\"1\" set=\"method\" line=\"68\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISet\"/>\n</f></SET>\n\t<new public=\"1\" set=\"method\" line=\"16\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\n\t<x path=\"Bool\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keep\"/>\n\t</meta>\n</class>";
	}
	
	public DateTimeSentence(haxe.lang.EmptyObject empty)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DateTimeSentence(java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		nMorph.framework.orm.common.fields.DateTimeSentence.__hx_ctor_nMorph_framework_orm_common_fields_DateTimeSentence(this, FieldTable, FieldName, Nullable, IsPrimaryKey);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_fields_DateTimeSentence(nMorph.framework.orm.common.fields.DateTimeSentence __hx_this, java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 17 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, nMorph.framework.orm.common.enums.DBTypeEnum.DATETIME, nMorph.framework.orm.common.enums.HaxeTypeEnum.DATE, null, null, Nullable, IsPrimaryKey);
	}
	
	
	public static java.lang.String __rtti;
	
	public void ValidateDBCompatibility(haxe.root.Date DateValue)
	{
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		if (( DateValue.date.get(((int) (java.util.Calendar.YEAR) )) < 1753 )) 
		{
			//line 22 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(50006, "Date not compatible with Database, Date is less than year 1753");
		}
		
		//line 25 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		if (( DateValue.date.get(((int) (java.util.Calendar.YEAR) )) > 9999 )) 
		{
			//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(50007, "Date not compatible with Database, Date is more than year 9999");
		}
		
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition Equals(haxe.root.Date DateValue)
	{
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition Different(haxe.root.Date DateValue)
	{
		//line 36 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 37 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Different, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition LessThan(haxe.root.Date DateValue)
	{
		//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.LessThan, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition LessThanAndEquals(haxe.root.Date DateValue)
	{
		//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.LessThanAndEquals, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition MoreThan(haxe.root.Date DateValue)
	{
		//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.MoreThan, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition MoreThanAndEquals(haxe.root.Date DateValue)
	{
		//line 56 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		this.ValidateDBCompatibility(DateValue);
		//line 57 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.MoreThanAndEquals, nMorph.framework.orm.common.sentences.Val.date(DateValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNull()
	{
		//line 61 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.date(null));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNotNull()
	{
		//line 65 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Different, nMorph.framework.orm.common.sentences.Val.date(null));
	}
	
	
	public nMorph.framework.orm.interfaces.ISet SET(haxe.root.Date DateValue)
	{
		//line 69 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		nMorph.framework.orm.interfaces.ISet asg = nMorph.framework.orm.common.sentences.Assign.SET(this, nMorph.framework.orm.common.sentences.Val.date(DateValue));
		//line 70 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return asg;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		{
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			if (( field != null )) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("SET")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SET")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ValidateDBCompatibility")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNotNull")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Equals")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNull")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -988319719:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("Different")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Different")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 1697285728:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("MoreThanAndEquals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "MoreThanAndEquals")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -2140646662:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("LessThan")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "LessThan")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -154292554:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("MoreThan")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "MoreThan")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -120951140:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("LessThanAndEquals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "LessThanAndEquals")) );
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		{
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			if (( field != null )) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("SET")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.SET(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							this.ValidateDBCompatibility(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.IsNotNull();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.Equals(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.IsNull();
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -988319719:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("Different")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.Different(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case 1697285728:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("MoreThanAndEquals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.MoreThanAndEquals(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -2140646662:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("LessThan")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.LessThan(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -154292554:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("MoreThan")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.MoreThan(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
					case -120951140:
					{
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						if (field.equals("LessThanAndEquals")) 
						{
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							__temp_executeDef1 = false;
							//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
							return this.LessThanAndEquals(((haxe.root.Date) (dynargs[0]) ));
						}
						
						//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\DateTimeSentence.hx"
		return null;
	}
	
	
}


