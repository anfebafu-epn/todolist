// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.fields;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NVarcharSentence extends nMorph.framework.orm.common.sentences.FieldSentence
{
	static
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		nMorph.framework.orm.common.fields.NVarcharSentence.__rtti = new String("<class path=\"nMorph.framework.orm.common.fields.NVarcharSentence\" params=\"\">\n\t") + 
new String ("<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t") + 
new String ("<ValidateDBCompatibility public=\"1\" set=\"method\" line=\"19\"><f a=\"stringValue\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></ValidateDBCompatibility>\n\t") + 
new String ("<Equals public=\"1\" set=\"method\" line=\"23\"><f a=\"stringValue\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Equals>\n\t") + 
new String ("<LIKE public=\"1\" set=\"method\" line=\"28\"><f a=\"stringValue\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LIKE>\n\t") + 
new String ("<NotLIKE public=\"1\" set=\"method\" line=\"33\"><f a=\"stringValue\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></NotLIKE>\n\t") + 
new String ("<IsNull public=\"1\" set=\"method\" line=\"38\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNull>\n\t") + 
new String ("<IsNotNull public=\"1\" set=\"method\" line=\"42\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNotNull>\n\t") + 
new String ("<SET public=\"1\" set=\"method\" line=\"46\"><f a=\"stringValue\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.interfaces.ISet\"/>\n</f></SET>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"15\"><f a=\"FieldTable:FieldName:Length:Nullable:IsPrimaryKey\">\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<c path=\"String\"/>\n\t") + 
new String ("<x path=\"Int\"/>\n\t") + 
new String ("<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\n\t") + 
new String ("<x path=\"Bool\"/>\n\t") + 
new String ("<x path=\"Void\"/>\n</f></new>\n\t") + 
new String ("<meta>\n\t") + 
new String ("\t<m n=\":directlyUsed\"/>\n\t") + 
new String ("\t<m n=\":hxGen\"/>\n\t") + 
new String ("\t<m n=\":keep\"/>\n\t") + 
new String ("</meta>\n</class>");
	}
	
	public NVarcharSentence(haxe.lang.EmptyObject empty)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public NVarcharSentence(java.lang.String FieldTable, java.lang.String FieldName, int Length, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		nMorph.framework.orm.common.fields.NVarcharSentence.__hx_ctor_nMorph_framework_orm_common_fields_NVarcharSentence(this, FieldTable, FieldName, Length, Nullable, IsPrimaryKey);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_fields_NVarcharSentence(nMorph.framework.orm.common.fields.NVarcharSentence __hx_this, java.lang.String FieldTable, java.lang.String FieldName, int Length, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, nMorph.framework.orm.common.enums.DBTypeEnum.NVARCHAR, nMorph.framework.orm.common.enums.HaxeTypeEnum.STRING, Length, null, Nullable, IsPrimaryKey);
	}
	
	
	public static java.lang.String __rtti;
	
	public void ValidateDBCompatibility(java.lang.String stringValue)
	{
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition Equals(java.lang.String stringValue)
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		this.ValidateDBCompatibility(stringValue);
		//line 25 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.str(stringValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition LIKE(java.lang.String stringValue)
	{
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		this.ValidateDBCompatibility(stringValue);
		//line 30 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.LIKE, nMorph.framework.orm.common.sentences.Val.str(stringValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition NotLIKE(java.lang.String stringValue)
	{
		//line 34 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		this.ValidateDBCompatibility(stringValue);
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.NotLIKE, nMorph.framework.orm.common.sentences.Val.str(stringValue));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNull()
	{
		//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.str(null));
	}
	
	
	public nMorph.framework.orm.common.conditions.Condition IsNotNull()
	{
		//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Different, nMorph.framework.orm.common.sentences.Val.str(null));
	}
	
	
	public nMorph.framework.orm.interfaces.ISet SET(java.lang.String stringValue)
	{
		//line 47 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		nMorph.framework.orm.interfaces.ISet asg = nMorph.framework.orm.common.sentences.Assign.SET(this, nMorph.framework.orm.common.sentences.Val.str(stringValue));
		//line 48 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return asg;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("SET")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "SET")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ValidateDBCompatibility")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNotNull")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Equals")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "IsNull")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 2336663:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("LIKE")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "LIKE")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -501856054:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("NotLIKE")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "NotLIKE")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
				switch (field.hashCode())
				{
					case 81986:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("SET")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.SET(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 1434114460:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("ValidateDBCompatibility")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							this.ValidateDBCompatibility(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -742217136:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("IsNotNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.IsNotNull();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 2083351519:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("Equals")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.Equals(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -2096394767:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("IsNull")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.IsNull();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case 2336663:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("LIKE")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.LIKE(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
					case -501856054:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						if (field.equals("NotLIKE")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
							return this.NotLIKE(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\NVarcharSentence.hx"
		return null;
	}
	
	
}


