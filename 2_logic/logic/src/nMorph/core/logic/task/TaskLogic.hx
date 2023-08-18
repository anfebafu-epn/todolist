package nMorph.core.logic.task;

import nMorph.core.db.sw_todolist.Task;
import nMorph.core.db.sw_todolist.Task_VTA;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.common.sources.*;
import nMorph.framework.orm.common.conditions.*;
import nMorph.framework.orm.common.sentences.*;
import nMorph.framework.orm.common.enums.*;
import nMorph.framework.orm.common.fields.UUIDSentence;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.common.datatypes.UUID;
import nMorph.framework.orm.tools.Context;

import nMorph.core.objects.ping.PingRequest;
import nMorph.core.objects.ping.PingResponse;
//Funcion de procesamiento de variable tipo blob

/**
 * ...
 * @author Smartwork
 */
@:keepSub @:final @:rtti
class TaskLogic
{
	public function new()
	{

	}

	public function Task_Search(SearchTerm:String, CategoryID: UUID, PersonID : UUID): Array<Task_VTA>
	{
		// Dynamic Filter
		var cg = ConditionGroup.SET(Task_VTA.col_Title.LIKE("%" + SearchTerm + "%")
			.OR(Task_VTA.col_Description.LIKE("%" + SearchTerm + "%")))
			.AND(Task_VTA.col_IsCompleted.Equals(false));
		
		if (!CategoryID.equals(UUID.empty())){
			cg = cg.AND(Task_VTA.col_CategoryId.eq(CategoryID));
		}
		
		if (!PersonID.equals(UUID.empty())){
			cg = cg.AND(Task_VTA.col_PersonId.eq(PersonID));
		}
		
		var lst: Array<Task_VTA> = Task_VTA.WHERE(cg).Read(Task_VTA);

		return lst;
	}

	public function Task_GetByID(ID:UUID): Task
	{
		var cat:Task = Task.BYPK(ID).ReadOne(Task);
		return cat;
	}
	
	public function Task_SetComplete(ID:UUID){
		// Si existe, actualiza los campobs
			SQL.UPDATE(Task.table)
			.SET([
				Assign.SET(Task.col_IsCompleted, Val.bool(true))
			])
			.WHERE(Condition.SET(Task.col_TaskId, Op.Equal, Val.uuid(ID)))
			.Execute();
	}

	public function Task_Save(UpdatedObj : Task)
	{
		// Valida si es que existe previamente el registro
		var Exists:Int =
			SQL.SELECT([Ag.COUNTALL()])
			.FROM(Task.table)
			.WHERE(Condition.SET(Task.col_TaskId, Op.Equal, Val.uuid(UpdatedObj.get_TaskId())))
			.ReadValue();

		// si no existe, crea un nuevo registro
		if (Exists == 0)
		{
			//var nullableDate: Null<Date> = null;
			//var ddd: Date = null;
			//nullableDate = cast(Date.now, Null<Date>);
			
			SQL.INSERT(Task.table)
			.VALUES([
				Val.uuid(UpdatedObj.get_TaskId()), 
				Val.uuid(UpdatedObj.get_PersonId()), 
				Val.uuid(UpdatedObj.get_CategoryId()), 
				Val.str(UpdatedObj.get_Title()), 
				Val.str(UpdatedObj.get_Description()), 
				Val.date(Date.now()),
				Val.date(UpdatedObj.get_DueDate()), 
				Val.bool(UpdatedObj.get_IsCompleted())
				])
			.Execute();
		}
		else
		{
			// Si existe, actualiza los campobs
			SQL.UPDATE(Task.table)
			.SET([
				Assign.SET(Task.col_PersonId, Val.uuid(UpdatedObj.get_PersonId())),
				Assign.SET(Task.col_CategoryId, Val.uuid(UpdatedObj.get_CategoryId())), 
				Assign.SET(Task.col_Title, Val.str(UpdatedObj.get_Title())), 
				Assign.SET(Task.col_Description, Val.str(UpdatedObj.get_Description())), 
				Assign.SET(Task.col_DueDate, Val.date(UpdatedObj.get_DueDate())), 
				Assign.SET(Task.col_IsCompleted, Val.bool(UpdatedObj.get_IsCompleted()))
			])
			.WHERE(Condition.SET(Task.col_TaskId, Op.Equal, Val.uuid(UpdatedObj.get_TaskId())))
			.Execute();
		}
	}
	public function Task_Delete(ID:UUID)
	{
		// Borra el registro de la base de datos
		SQL.DELETE()
		.FROM(Task.table)
		.WHERE(Condition.SET(Task.col_TaskId, Op.Equal, Val.uuid(ID)))
		.Execute();
	}
}
