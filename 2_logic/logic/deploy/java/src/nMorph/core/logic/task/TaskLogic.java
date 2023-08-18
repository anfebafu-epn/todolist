// Generated by Haxe 4.2.2
package nMorph.core.logic.task;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class TaskLogic extends haxe.lang.HxObject
{
	static
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.core.logic.task.TaskLogic.__rtti = "<class path=\"nMorph.core.logic.task.TaskLogic\" params=\"\" final=\"1\">\n\t<Task_Search public=\"1\" set=\"method\" line=\"32\"><f a=\"SearchTerm:CategoryID:PersonID\">\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<c path=\"Array\"><c path=\"nMorph.core.db.sw_todolist.Task_VTA\"/></c>\n</f></Task_Search>\n\t<Task_GetByID public=\"1\" set=\"method\" line=\"52\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<c path=\"nMorph.core.db.sw_todolist.Task\"/>\n</f></Task_GetByID>\n\t<Task_SetComplete public=\"1\" set=\"method\" line=\"57\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<x path=\"Void\"/>\n</f></Task_SetComplete>\n\t<Task_Save public=\"1\" set=\"method\" line=\"68\"><f a=\"UpdatedObj\">\n\t<c path=\"nMorph.core.db.sw_todolist.Task\"/>\n\t<x path=\"Void\"/>\n</f></Task_Save>\n\t<Task_Delete public=\"1\" set=\"method\" line=\"113\"><f a=\"ID\">\n\t<c path=\"nMorph.framework.common.datatypes.UUID\"/>\n\t<x path=\"Void\"/>\n</f></Task_Delete>\n\t<new public=\"1\" set=\"method\" line=\"27\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<haxe_doc>* ...\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":final\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public TaskLogic(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TaskLogic()
	{
		//line 26 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.core.logic.task.TaskLogic.__hx_ctor_nMorph_core_logic_task_TaskLogic(this);
	}
	
	
	public static void __hx_ctor_nMorph_core_logic_task_TaskLogic(nMorph.core.logic.task.TaskLogic __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public final haxe.root.Array<nMorph.core.db.sw_todolist.Task_VTA> Task_Search(java.lang.String SearchTerm, nMorph.framework.common.datatypes.UUID CategoryID, nMorph.framework.common.datatypes.UUID PersonID)
	{
		//line 34 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.framework.orm.common.conditions.ConditionGroup cg = nMorph.framework.orm.common.conditions.ConditionGroup.SET(nMorph.core.db.sw_todolist.Task_VTA.col_Title.LIKE(( ( "%" + SearchTerm ) + "%" )).OR(nMorph.core.db.sw_todolist.Task_VTA.col_Description.LIKE(( ( "%" + SearchTerm ) + "%" )))).AND(nMorph.core.db.sw_todolist.Task_VTA.col_IsCompleted.Equals(false));
		//line 38 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		if ( ! (CategoryID.equals(nMorph.framework.common.datatypes.UUID.empty())) ) 
		{
			//line 39 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			cg = cg.AND(nMorph.core.db.sw_todolist.Task_VTA.col_CategoryId.eq(CategoryID));
		}
		
		//line 42 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		if ( ! (PersonID.equals(nMorph.framework.common.datatypes.UUID.empty())) ) 
		{
			//line 43 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			cg = cg.AND(nMorph.core.db.sw_todolist.Task_VTA.col_PersonId.eq(PersonID));
		}
		
		//line 46 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		haxe.root.Array<nMorph.core.db.sw_todolist.Task_VTA> lst = ((haxe.root.Array<nMorph.core.db.sw_todolist.Task_VTA>) (((haxe.root.Array) (nMorph.core.db.sw_todolist.Task_VTA.WHERE(cg).Read(((java.lang.Class) (nMorph.core.db.sw_todolist.Task_VTA.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) )) );
		//line 48 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		return lst;
	}
	
	
	public final nMorph.core.db.sw_todolist.Task Task_GetByID(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 53 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.core.db.sw_todolist.Task cat = ((nMorph.core.db.sw_todolist.Task) (nMorph.core.db.sw_todolist.Task.BYPK(ID).ReadOne(((java.lang.Class) (nMorph.core.db.sw_todolist.Task.class) ), ((nMorph.framework.orm.tools.Context) (null) ))) );
		//line 54 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		return cat;
	}
	
	
	public final void Task_SetComplete(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 59 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.framework.orm.lang.SQL.UPDATE(nMorph.core.db.sw_todolist.Task.table, null).SET(new haxe.root.Array<nMorph.framework.orm.interfaces.ISet>(new nMorph.framework.orm.interfaces.ISet[]{nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_IsCompleted, nMorph.framework.orm.common.sentences.Val.bool(true))})).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Task.col_TaskId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(ID))).Execute();
	}
	
	
	public final void Task_Save(nMorph.core.db.sw_todolist.Task UpdatedObj)
	{
		//line 70 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		int Exists = ((int) (haxe.lang.Runtime.toInt(nMorph.framework.orm.lang.SQL.SELECT(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Ag.COUNTALL(null)}), null).FROM(nMorph.core.db.sw_todolist.Task.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Task.col_TaskId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_TaskId()))).ReadValue())) );
		//line 77 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		if (( Exists == 0 )) 
		{
			//line 83 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			nMorph.framework.orm.lang.SQL.INSERT(nMorph.core.db.sw_todolist.Task.table, null).VALUES(new haxe.root.Array<nMorph.framework.orm.interfaces.ISentence>(new nMorph.framework.orm.interfaces.ISentence[]{nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_TaskId()), nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_PersonId()), nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_CategoryId()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Title()), nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Description()), nMorph.framework.orm.common.sentences.Val.date(haxe.root.Date.now()), nMorph.framework.orm.common.sentences.Val.date(UpdatedObj.get_DueDate()), nMorph.framework.orm.common.sentences.Val.bool(UpdatedObj.get_IsCompleted())})).Execute();
		}
		else
		{
			//line 99 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			nMorph.framework.orm.lang.SQL.UPDATE(nMorph.core.db.sw_todolist.Task.table, null).SET(new haxe.root.Array<nMorph.framework.orm.interfaces.ISet>(new nMorph.framework.orm.interfaces.ISet[]{nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_PersonId, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_PersonId())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_CategoryId, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_CategoryId())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_Title, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Title())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_Description, nMorph.framework.orm.common.sentences.Val.str(UpdatedObj.get_Description())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_DueDate, nMorph.framework.orm.common.sentences.Val.date(UpdatedObj.get_DueDate())), nMorph.framework.orm.common.sentences.Assign.SET(nMorph.core.db.sw_todolist.Task.col_IsCompleted, nMorph.framework.orm.common.sentences.Val.bool(UpdatedObj.get_IsCompleted()))})).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Task.col_TaskId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(UpdatedObj.get_TaskId()))).Execute();
		}
		
	}
	
	
	public final void Task_Delete(nMorph.framework.common.datatypes.UUID ID)
	{
		//line 115 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		nMorph.framework.orm.lang.SQL.DELETE(null).FROM(nMorph.core.db.sw_todolist.Task.table).WHERE(nMorph.framework.orm.common.conditions.Condition.SET(nMorph.core.db.sw_todolist.Task.col_TaskId, nMorph.framework.orm.common.enums.Op.Equal, nMorph.framework.orm.common.sentences.Val.uuid(ID))).Execute();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
				switch (field.hashCode())
				{
					case -1946840667:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Task_Delete")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -1517719134:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Task_Search")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -2111077385:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Task_Save")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -1848625298:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Task_GetByID")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -929878015:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_SetComplete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Task_SetComplete")) );
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		{
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			if (( field != null )) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
				switch (field.hashCode())
				{
					case -1946840667:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Delete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							this.Task_Delete(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -1517719134:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Search")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return this.Task_Search(haxe.lang.Runtime.toString(dynargs[0]), ((nMorph.framework.common.datatypes.UUID) (dynargs[1]) ), ((nMorph.framework.common.datatypes.UUID) (dynargs[2]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -2111077385:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_Save")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							this.Task_Save(((nMorph.core.db.sw_todolist.Task) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -1848625298:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_GetByID")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							return this.Task_GetByID(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
					case -929878015:
					{
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						if (field.equals("Task_SetComplete")) 
						{
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							__temp_executeDef1 = false;
							//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
							this.Task_SetComplete(((nMorph.framework.common.datatypes.UUID) (dynargs[0]) ));
						}
						
						//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "C:\\TodoList\\nMorph\\2_logic\\logic\\src\\nMorph\\core\\logic\\task\\TaskLogic.hx"
		return null;
	}
	
	
}


