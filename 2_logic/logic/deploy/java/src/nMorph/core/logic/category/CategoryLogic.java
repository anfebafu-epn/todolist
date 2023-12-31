// Generated by Haxe 4.2.2
package nMorph.core.logic.category;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class CategoryLogic extends haxe.lang.HxObject
{
	static
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		nMorph.core.logic.category.CategoryLogic.__rtti = "<class path=\"nMorph.core.logic.category.CategoryLogic\" params=\"\" final=\"1\">\n\t<Query public=\"1\" set=\"method\" line=\"32\"><f a=\"\"><c path=\"String\"/></f></Query>\n\t<Category_Search public=\"1\" set=\"method\" line=\"38\"><f a=\"SearchTerm\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.core.db.sw_todolist.Category\"/></c>\n</f></Category_Search>\n\t<Category_GetByID public=\"1\" set=\"method\" line=\"49\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<c path=\"nMorph.core.db.sw_todolist.Category\"/>\n</f></Category_GetByID>\n\t<Category_Save public=\"1\" set=\"method\" line=\"57\"><f a=\"UpdatedObj\">\n\t<c path=\"nMorph.core.db.sw_todolist.Category\"/>\n\t<x path=\"Void\"/>\n</f></Category_Save>\n\t<Category_Delete public=\"1\" set=\"method\" line=\"82\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<x path=\"Void\"/>\n</f></Category_Delete>\n\t<new public=\"1\" set=\"method\" line=\"27\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<haxe_doc>* ...\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":final\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public CategoryLogic(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CategoryLogic()
	{
		//line 26 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		nMorph.core.logic.category.CategoryLogic.__hx_ctor_nMorph_core_logic_category_CategoryLogic(this);
	}
	
	
	public static void __hx_ctor_nMorph_core_logic_category_CategoryLogic(nMorph.core.logic.category.CategoryLogic __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public final java.lang.String Query()
	{
		//line 33 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		nMorph.core.db.sw_todolist.Category p = ((nMorph.core.db.sw_todolist.Category) (nMorph.framework.orm.lang.SQL.SELECT(null, null).FROM(nMorph.core.db.sw_todolist.Category.table).ReadOne(((java.lang.Class) (nMorph.core.db.sw_todolist.Category.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) );
		//line 34 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		return p.get_CategoryName();
	}
	
	
	public final haxe.root.Array<nMorph.core.db.sw_todolist.Category> Category_Search(java.lang.String SearchTerm)
	{
		//line 40 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		haxe.root.Array<nMorph.core.db.sw_todolist.Category> lst = ((haxe.root.Array<nMorph.core.db.sw_todolist.Category>) (((haxe.root.Array) (nMorph.core.db.sw_todolist.Category.WHERE(nMorph.core.db.sw_todolist.Category.col_CategoryName.LIKE(( ( "%" + SearchTerm ) + "%" ))).ORDERBY(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.core.db.sw_todolist.Category.col_CategoryName})).Read(((java.lang.Class) (nMorph.core.db.sw_todolist.Category.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) )) );
		//line 45 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		return lst;
	}
	
	
	public final nMorph.core.db.sw_todolist.Category Category_GetByID(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 51 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		nMorph.core.db.sw_todolist.Category cat = ((nMorph.core.db.sw_todolist.Category) (nMorph.core.db.sw_todolist.Category.BYPK(ID).ReadOne(((java.lang.Class) (nMorph.core.db.sw_todolist.Category.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) );
		//line 53 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		return cat;
	}
	
	
	public final void Category_Save(nMorph.core.db.sw_todolist.Category UpdatedObj)
	{
		//line 59 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		int Exists = ((int) (haxe.lang.Runtime.toInt(nMorph.framework.orm.lang.SQL.SELECT(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Ag.COUNTALL(null)}), null).FROM(nMorph.core.db.sw_todolist.Category.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Category.col_CategoryId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_CategoryId()))).ReadValue())) );
		//line 66 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		if (( Exists == 0 )) 
		{
			//line 68 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			nMorph.framework.orm.lang.SQL.INSERT(nMorph.core.db.sw_todolist.Category.table, null).VALUES(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_CategoryId()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_CategoryName())})).Execute();
		}
		else
		{
			//line 75 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			nMorph.framework.orm.lang.SQL.UPDATE(nMorph.core.db.sw_todolist.Category.table, null).SET(new haxe.root.Array<nMorph.framework.orm.interfaces.ISet>(new nMorph.framework.orm.interfaces.ISet[]{nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Category.col_CategoryName, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_CategoryName()))})).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Category.col_CategoryId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_CategoryId()))).Execute();
		}
		
	}
	
	
	public final void Category_Delete(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 84 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		int Exists = ((int) (haxe.lang.Runtime.toInt(nMorph.framework.orm.lang.SQL.SELECT(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Ag.COUNTALL(null)}), null).FROM(nMorph.core.db.sw_todolist.Task.table).WHERE(nMorph.core.db.sw_todolist.Task.col_CategoryId.eq(ID)).ReadValue())) );
		//line 91 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		if (( Exists > 0 )) 
		{
			//line 92 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1002, "Unable to delete Category. There are associated tasks.");
			//line 93 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			return ;
		}
		
		//line 97 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		nMorph.framework.orm.lang.SQL.DELETE(null).FROM(nMorph.core.db.sw_todolist.Category.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Category.col_CategoryId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(ID))).Execute();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
				switch (field.hashCode())
				{
					case 1156214796:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Category_Delete")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 78391464:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Query")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Query")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 1136840734:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Category_Save")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 1585336329:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Category_Search")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case -143186457:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Category_GetByID")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
				switch (field.hashCode())
				{
					case 1156214796:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							this.Category_Delete(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 78391464:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Query")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return this.Query();
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 1136840734:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							this.Category_Save(((nMorph.core.db.sw_todolist.Category) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case 1585336329:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return this.Category_Search(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
					case -143186457:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						if (field.equals("Category_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
							return this.Category_GetByID(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\category\\CategoryLogic.hx"
		return null;
	}
	
	
}


