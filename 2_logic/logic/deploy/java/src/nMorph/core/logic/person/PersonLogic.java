// Generated by Haxe 4.2.2
package nMorph.core.logic.person;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class PersonLogic extends haxe.lang.HxObject
{
	static
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		nMorph.core.logic.person.PersonLogic.__rtti = "<class path=\"nMorph.core.logic.person.PersonLogic\" params=\"\" final=\"1\">\n\t<Person_Login public=\"1\" set=\"method\" line=\"31\"><f a=\"Email:password\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.core.db.sw_todolist.Person\"/>\n</f></Person_Login>\n\t<Person_Search public=\"1\" set=\"method\" line=\"43\"><f a=\"SearchTerm\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.core.db.sw_todolist.Person\"/></c>\n</f></Person_Search>\n\t<Person_GetByID public=\"1\" set=\"method\" line=\"54\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<c path=\"nMorph.core.db.sw_todolist.Person\"/>\n</f></Person_GetByID>\n\t<Person_Save public=\"1\" set=\"method\" line=\"60\"><f a=\"UpdatedObj\">\n\t<c path=\"nMorph.core.db.sw_todolist.Person\"/>\n\t<x path=\"Void\"/>\n</f></Person_Save>\n\t<Person_Delete public=\"1\" set=\"method\" line=\"96\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<x path=\"Void\"/>\n</f></Person_Delete>\n\t<new public=\"1\" set=\"method\" line=\"27\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<haxe_doc>* ...\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":final\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public PersonLogic(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PersonLogic()
	{
		//line 26 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		nMorph.core.logic.person.PersonLogic.__hx_ctor_nMorph_core_logic_person_PersonLogic(this);
	}
	
	
	public static void __hx_ctor_nMorph_core_logic_person_PersonLogic(nMorph.core.logic.person.PersonLogic __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public final nMorph.core.db.sw_todolist.Person Person_Login(java.lang.String Email, java.lang.String password)
	{
		//line 33 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		nMorph.core.db.sw_todolist.Person p = ((nMorph.core.db.sw_todolist.Person) (nMorph.core.db.sw_todolist.Person.WHERE(nMorph.core.db.sw_todolist.Person.col_Email.Equals(Email).AND(nMorph.core.db.sw_todolist.Person.col_PasswordHash.Equals(password))).ReadOne(((java.lang.Class) (nMorph.core.db.sw_todolist.Person.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) );
		//line 35 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		if (( p != null )) 
		{
			//line 36 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			p.set_PasswordHash("");
		}
		
		//line 39 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		return p;
	}
	
	
	public final haxe.root.Array<nMorph.core.db.sw_todolist.Person> Person_Search(java.lang.String SearchTerm)
	{
		//line 45 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		haxe.root.Array<nMorph.core.db.sw_todolist.Person> lst = ((haxe.root.Array<nMorph.core.db.sw_todolist.Person>) (((haxe.root.Array) (nMorph.core.db.sw_todolist.Person.WHERE(nMorph.core.db.sw_todolist.Person.col_FullName.LIKE(( ( "%" + SearchTerm ) + "%" )).OR(nMorph.core.db.sw_todolist.Person.col_Email.LIKE(( ( "%" + SearchTerm ) + "%" )))).ORDERBY(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.core.db.sw_todolist.Person.col_FullName})).Read(((java.lang.Class) (nMorph.core.db.sw_todolist.Person.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) )) );
		//line 50 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		return lst;
	}
	
	
	public final nMorph.core.db.sw_todolist.Person Person_GetByID(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 55 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		nMorph.core.db.sw_todolist.Person cat = ((nMorph.core.db.sw_todolist.Person) (nMorph.core.db.sw_todolist.Person.BYPK(ID).ReadOne(((java.lang.Class) (nMorph.core.db.sw_todolist.Person.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) );
		//line 56 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		return cat;
	}
	
	
	public final void Person_Save(nMorph.core.db.sw_todolist.Person UpdatedObj)
	{
		//line 62 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		int Exists = ((int) (haxe.lang.Runtime.toInt(nMorph.framework.orm.lang.SQL.SELECT(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Ag.COUNTALL(null)}), null).FROM(nMorph.core.db.sw_todolist.Person.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Person.col_PersonId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_PersonId()))).ReadValue())) );
		//line 69 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		if (( Exists == 0 )) 
		{
			//line 71 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			nMorph.framework.orm.lang.SQL.INSERT(nMorph.core.db.sw_todolist.Person.table, null).VALUES(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_PersonId()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_FullName()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Email()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_PasswordHash()), nMorph.framework.orm.common.sentences.Val._int(UpdatedObj.get_Role())})).Execute();
		}
		else
		{
			//line 84 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			nMorph.framework.orm.lang.SQL.UPDATE(nMorph.core.db.sw_todolist.Person.table, null).SET(new haxe.root.Array<nMorph.framework.orm.interfaces.ISet>(new nMorph.framework.orm.interfaces.ISet[]{nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Person.col_FullName, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_FullName())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Person.col_Email, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Email())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Person.col_PasswordHash, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_PasswordHash())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Person.col_Role, nMorph.framework.orm.common.sentences.Val._int(UpdatedObj.get_Role()))})).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Person.col_PersonId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_PersonId()))).Execute();
		}
		
	}
	
	
	public final void Person_Delete(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 98 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		int Exists = ((int) (haxe.lang.Runtime.toInt(nMorph.framework.orm.lang.SQL.SELECT(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Ag.COUNTALL(null)}), null).FROM(nMorph.core.db.sw_todolist.Task.table).WHERE(nMorph.core.db.sw_todolist.Task.col_PersonId.eq(ID)).ReadValue())) );
		//line 105 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		if (( Exists > 0 )) 
		{
			//line 106 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1001, "Unable to delete Person. There are associated tasks.");
			//line 107 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			return ;
		}
		
		//line 111 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		nMorph.framework.orm.lang.SQL.DELETE(null).FROM(nMorph.core.db.sw_todolist.Person.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Person.col_PersonId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(ID))).Execute();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
				switch (field.hashCode())
				{
					case -1534686763:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Person_Delete")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -180371969:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Login")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Person_Login")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case 1241303079:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Person_Save")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -1105565230:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Person_Search")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -1956756162:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Person_GetByID")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
				switch (field.hashCode())
				{
					case -1534686763:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							this.Person_Delete(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -180371969:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Login")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return this.Person_Login(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case 1241303079:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							this.Person_Save(((nMorph.core.db.sw_todolist.Person) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -1105565230:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return this.Person_Search(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
					case -1956756162:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						if (field.equals("Person_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
							return this.Person_GetByID(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\person\\PersonLogic.hx"
		return null;
	}
	
	
}


