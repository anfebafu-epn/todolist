// Generated by Haxe 4.2.2
package nMorph.framework.orm.common.fields;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class UUIDSentence extends nMorph.framework.orm.common.sentences.FieldSentence
{
	static
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		nMorph.framework.orm.common.fields.UUIDSentence.__rtti = new String("<class path=\"nMorph.framework.orm.common.fields.UUIDSentence\" params=\"\">\n\t") + 
new String ("<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t") + 
new String ("<eq public=\"1\" set=\"method\" line=\"18\"><f a=\"UUIDValue\">\n\t") + 
new String ("<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t") + 
new String ("<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></eq>\n\t") + 
new String ("<new public=\"1\" set=\"method\" line=\"14\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\n\t") + 
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
	
	public UUIDSentence(haxe.lang.EmptyObject empty)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public UUIDSentence(java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 15 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 15 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		nMorph.framework.orm.common.fields.UUIDSentence.__hx_ctor_nMorph_framework_orm_common_fields_UUIDSentence(this, FieldTable, FieldName, Nullable, IsPrimaryKey);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_common_fields_UUIDSentence(nMorph.framework.orm.common.fields.UUIDSentence __hx_this, java.lang.String FieldTable, java.lang.String FieldName, nMorph.framework.orm.common.enums.NullableEnum Nullable, boolean IsPrimaryKey)
	{
		//line 15 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, nMorph.framework.orm.common.enums.DBTypeEnum.UUID, nMorph.framework.orm.common.enums.HaxeTypeEnum.UUID, null, null, Nullable, IsPrimaryKey);
	}
	
	
	public static java.lang.String __rtti;
	
	public nMorph.framework.orm.common.conditions.Condition eq(nMorph.framework.common.datatypes.UUID UUIDValue)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		return nMorph.framework.orm.common.conditions.Condition.SET(this, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UUIDValue));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		{
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			if (( field != null )) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				switch (field.hashCode())
				{
					case 3244:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
						if (field.equals("eq")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "eq")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
		{
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			if (( field != null )) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				switch (field.hashCode())
				{
					case 3244:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
						if (field.equals("eq")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
							return this.eq(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\common\\fields\\UUIDSentence.hx"
				throw null;
			}
			
		}
		
	}
	
	
}

