// Generated by Haxe 4.2.2
package nMorph.core.db.sw_todolist;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Person_VTA extends nMorph.framework.orm.client.ModelObject
{
	static
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.__rtti = "<class path=\"nMorph.core.db.sw_todolist.Person_VTA\" params=\"\">\n\t<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\n\t<view public=\"1\" expr=\"new ViewSource(&quot;Person_VTA&quot;)\" line=\"33\" static=\"1\">\n\t\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t\t<meta><m n=\":value\"><e>new ViewSource(\"Person_VTA\")</e></m></meta>\n\t\t<haxe_doc>* referencia a vista para consultas</haxe_doc>\n\t</view>\n\t<col_PersonId public=\"1\" expr=\"new UUIDSentence(&quot;Person_VTA&quot;, &quot;PersonId&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\n\t\t<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\n\t\t<meta><m n=\":value\"><e>new UUIDSentence(\"Person_VTA\", \"PersonId\", NullableEnum.NOTNULL, true)</e></m></meta>\n\t\t<haxe_doc>* Referencia a columna PersonId</haxe_doc>\n\t</col_PersonId>\n\t<col_FullName public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;FullName&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\n\t\t<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\n\t\t<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"FullName\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\n\t\t<haxe_doc>* Referencia a columna FullName</haxe_doc>\n\t</col_FullName>\n\t<col_Email public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;Email&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"47\" static=\"1\">\n\t\t<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\n\t\t<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"Email\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\n\t\t<haxe_doc>* Referencia a columna Email</haxe_doc>\n\t</col_Email>\n\t<col_PasswordHash public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;PasswordHash&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\n\t\t<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\n\t\t<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"PasswordHash\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\n\t\t<haxe_doc>* Referencia a columna PasswordHash</haxe_doc>\n\t</col_PasswordHash>\n\t<WHERE public=\"1\" set=\"method\" line=\"60\" static=\"1\">\n\t\t<f a=\"Condition\">\n\t\t\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t\t\t<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\n\t\t</f>\n\t\t<haxe_doc>* inicio r\u00e1pido de filtro\n\t * @param\tFiltro\n\t * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\n\t</WHERE>\n\t<BYPK public=\"1\" set=\"method\" line=\"69\" static=\"1\">\n\t\t<f a=\"val_PersonId\">\n\t\t\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t\t\t<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\n\t\t</f>\n\t\t<haxe_doc>* filtro por clave primaria\n\t * @param\tvalor de clave primaria\n\t * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\n\t</BYPK>\n\t<PersonId get=\"accessor\" set=\"null\">\n\t\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</PersonId>\n\t<get_PersonId public=\"1\" set=\"method\" line=\"75\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PersonId>\n\t<FullName get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</FullName>\n\t<get_FullName public=\"1\" set=\"method\" line=\"82\"><f a=\"\"><c path=\"String\"/></f></get_FullName>\n\t<set_FullName public=\"1\" set=\"method\" line=\"86\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_FullName>\n\t<Email get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</Email>\n\t<get_Email public=\"1\" set=\"method\" line=\"96\"><f a=\"\"><c path=\"String\"/></f></get_Email>\n\t<set_Email public=\"1\" set=\"method\" line=\"100\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_Email>\n\t<PasswordHash get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</PasswordHash>\n\t<get_PasswordHash public=\"1\" set=\"method\" line=\"110\"><f a=\"\"><c path=\"String\"/></f></get_PasswordHash>\n\t<set_PasswordHash public=\"1\" set=\"method\" line=\"114\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_PasswordHash>\n\t<new public=\"1\" set=\"method\" line=\"25\">\n\t\t<f a=\"\"><x path=\"Void\"/></f>\n\t\t<haxe_doc>* Constructor de la clase Person_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\n\t</new>\n\t<haxe_doc>* ...\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		//line 33 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.view = ((nMorph.framework.orm.interfaces.ISource) (new nMorph.framework.orm.common.sources.ViewSource(haxe.lang.Runtime.toString("Person_VTA"))) );
		//line 37 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.col_PersonId = new nMorph.framework.orm.common.fields.UUIDSentence(haxe.lang.Runtime.toString("Person_VTA"), haxe.lang.Runtime.toString("PersonId"), ((nMorph.framework.orm.common.enums.NullableEnum) (nMorph.framework.orm.common.enums.NullableEnum.NOTNULL) ), haxe.lang.Runtime.toBool(((java.lang.Boolean) (true) )));
		//line 42 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.col_FullName = new nMorph.framework.orm.common.fields.VarcharSentence(haxe.lang.Runtime.toString("Person_VTA"), haxe.lang.Runtime.toString("FullName"), ((int) (100) ), ((nMorph.framework.orm.common.enums.NullableEnum) (nMorph.framework.orm.common.enums.NullableEnum.NOTNULL) ), haxe.lang.Runtime.toBool(((java.lang.Boolean) (false) )));
		//line 47 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.col_Email = new nMorph.framework.orm.common.fields.VarcharSentence(haxe.lang.Runtime.toString("Person_VTA"), haxe.lang.Runtime.toString("Email"), ((int) (100) ), ((nMorph.framework.orm.common.enums.NullableEnum) (nMorph.framework.orm.common.enums.NullableEnum.NOTNULL) ), haxe.lang.Runtime.toBool(((java.lang.Boolean) (false) )));
		//line 52 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.col_PasswordHash = new nMorph.framework.orm.common.fields.VarcharSentence(haxe.lang.Runtime.toString("Person_VTA"), haxe.lang.Runtime.toString("PasswordHash"), ((int) (100) ), ((nMorph.framework.orm.common.enums.NullableEnum) (nMorph.framework.orm.common.enums.NullableEnum.NOTNULL) ), haxe.lang.Runtime.toBool(((java.lang.Boolean) (false) )));
	}
	
	public Person_VTA(haxe.lang.EmptyObject empty)
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Person_VTA()
	{
		//line 27 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 27 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.core.db.sw_todolist.Person_VTA.__hx_ctor_nMorph_core_db_sw_todolist_Person_VTA(this);
	}
	
	
	protected static void __hx_ctor_nMorph_core_db_sw_todolist_Person_VTA(nMorph.core.db.sw_todolist.Person_VTA __hx_this)
	{
		//line 27 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		nMorph.framework.orm.client.ModelObject.__hx_ctor_nMorph_framework_orm_client_ModelObject(__hx_this);
	}
	
	
	public static java.lang.String __rtti;
	
	public static nMorph.framework.orm.interfaces.ISource view;
	
	public static nMorph.framework.orm.common.fields.UUIDSentence col_PersonId;
	
	public static nMorph.framework.orm.common.fields.VarcharSentence col_FullName;
	
	public static nMorph.framework.orm.common.fields.VarcharSentence col_Email;
	
	public static nMorph.framework.orm.common.fields.VarcharSentence col_PasswordHash;
	
	public static nMorph.framework.orm.common.clauses.WhereClause WHERE(nMorph.framework.orm.interfaces.ICondition Condition)
	{
		//line 61 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return nMorph.framework.orm.lang.SQL.SELECT(null, null).FROM(nMorph.core.db.sw_todolist.Person_VTA.view).WHERE(Condition);
	}
	
	
	public static nMorph.framework.orm.common.clauses.WhereClause BYPK(nMorph.framework.common.datatypes.UUID val_PersonId)
	{
		//line 70 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return nMorph.framework.orm.lang.SQL.SELECT(null, null).FROM(nMorph.core.db.sw_todolist.Person_VTA.view).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Person_VTA.col_PersonId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(val_PersonId)));
	}
	
	
	public nMorph.framework.common.datatypes.UUID PersonId;
	
	public nMorph.framework.common.datatypes.UUID get_PersonId()
	{
		//line 76 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.PersonId;
	}
	
	
	public java.lang.String FullName;
	
	public java.lang.String get_FullName()
	{
		//line 83 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.FullName;
	}
	
	
	public java.lang.String set_FullName(java.lang.String value)
	{
		//line 89 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		if (( this.get_TrackChanges() &&  ! (haxe.lang.Runtime.valEq(this.get_FullName(), value))  )) 
		{
			//line 89 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			this.AddChange(new nMorph.framework.orm.client.ChangeItem(((nMorph.framework.orm.common.sentences.FieldSentence) (nMorph.core.db.sw_todolist.Person_VTA.col_FullName) ), ((java.lang.Object) (this.get_FullName()) ), ((java.lang.Object) (value) )));
		}
		
		//line 90 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.FullName = value;
	}
	
	
	public java.lang.String Email;
	
	public java.lang.String get_Email()
	{
		//line 97 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.Email;
	}
	
	
	public java.lang.String set_Email(java.lang.String value)
	{
		//line 103 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		if (( this.get_TrackChanges() &&  ! (haxe.lang.Runtime.valEq(this.get_Email(), value))  )) 
		{
			//line 103 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			this.AddChange(new nMorph.framework.orm.client.ChangeItem(((nMorph.framework.orm.common.sentences.FieldSentence) (nMorph.core.db.sw_todolist.Person_VTA.col_Email) ), ((java.lang.Object) (this.get_Email()) ), ((java.lang.Object) (value) )));
		}
		
		//line 104 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.Email = value;
	}
	
	
	public java.lang.String PasswordHash;
	
	public java.lang.String get_PasswordHash()
	{
		//line 111 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.PasswordHash;
	}
	
	
	public java.lang.String set_PasswordHash(java.lang.String value)
	{
		//line 117 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		if (( this.get_TrackChanges() &&  ! (haxe.lang.Runtime.valEq(this.get_PasswordHash(), value))  )) 
		{
			//line 117 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			this.AddChange(new nMorph.framework.orm.client.ChangeItem(((nMorph.framework.orm.common.sentences.FieldSentence) (nMorph.core.db.sw_todolist.Person_VTA.col_PasswordHash) ), ((java.lang.Object) (this.get_PasswordHash()) ), ((java.lang.Object) (value) )));
		}
		
		//line 118 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		return this.PasswordHash = value;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				switch (field.hashCode())
				{
					case 731020905:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							if (handleProperties) 
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.set_PasswordHash(haxe.lang.Runtime.toString(value));
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							else
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.PasswordHash = haxe.lang.Runtime.toString(value);
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 507807600:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("PersonId")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							this.PersonId = ((nMorph.framework.common.datatypes.UUID) (value) );
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return value;
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 67066748:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							if (handleProperties) 
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.set_Email(haxe.lang.Runtime.toString(value));
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							else
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.Email = haxe.lang.Runtime.toString(value);
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1395496410:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							if (handleProperties) 
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.set_FullName(haxe.lang.Runtime.toString(value));
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							else
							{
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								this.FullName = haxe.lang.Runtime.toString(value);
								//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
								return value;
							}
							
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				switch (field.hashCode())
				{
					case -825697498:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_PasswordHash")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 507807600:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("PersonId")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ( (handleProperties) ? (this.get_PersonId()) : (this.PersonId) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1005745330:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_PasswordHash")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case -1415247303:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_PersonId")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_PersonId")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 731020905:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ( (handleProperties) ? (this.get_PasswordHash()) : (this.PasswordHash) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1395496410:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ( (handleProperties) ? (this.get_FullName()) : (this.FullName) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 889399647:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_Email")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case -527558493:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_FullName")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1104016723:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_Email")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1021434135:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_FullName")) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 67066748:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return ( (handleProperties) ? (this.get_Email()) : (this.Email) );
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		{
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (( field != null )) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				switch (field.hashCode())
				{
					case -825697498:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.set_PasswordHash(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case -1415247303:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_PersonId")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.get_PersonId();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1005745330:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_PasswordHash")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.get_PasswordHash();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case -527558493:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.get_FullName();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 889399647:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.set_Email(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1021434135:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("set_FullName")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.set_FullName(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
					case 1104016723:
					{
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						if (field.equals("get_Email")) 
						{
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							__temp_executeDef1 = false;
							//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
							return this.get_Email();
						}
						
						//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		baseArr.push("PasswordHash");
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		baseArr.push("Email");
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		baseArr.push("FullName");
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		baseArr.push("PersonId");
		//line 19 "C:\\TodoList\\nMorph\\3_data\\db\\src\\nMorph\\core\\db\\sw_todolist\\Person_VTA.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

