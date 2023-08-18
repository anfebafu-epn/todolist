package nMorph.core.logic.category;

import nMorph.core.db.sw_todolist.Category;
import nMorph.core.db.sw_todolist.Task;
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
class CategoryLogic
{
	public function new()
	{

	}

	public function Query():String
	{
		var p: Category = SQL.SELECT().FROM(Category.table).ReadOne(Category);
		return p.get_CategoryName();
	}

	public function Category_Search(SearchTerm:String): Array<Category>
	{

		var lst: Array<Category> =
		Category.WHERE(Category.col_CategoryName.LIKE("%" + SearchTerm + "%"))
		.ORDERBY([Category.col_CategoryName])
		.Read(Category);

		return lst;
	}

	public function Category_GetByID(ID:UUID): Category
	{

		var cat:Category = Category.BYPK(ID).ReadOne(Category);

		return cat;
	}

	public function Category_Save(UpdatedObj : Category)
	{
		// Valida si es que existe previamente el registro
		var Exists:Int =
			SQL.SELECT([Ag.COUNTALL()])
			.FROM(Category.table)
			.WHERE(Condition.SET(Category.col_CategoryId, Op.Equal, Val.uuid(UpdatedObj.get_CategoryId())))
			.ReadValue();

		// si no existe, crea un nuevo registro
		if (Exists == 0)
		{
			SQL.INSERT(Category.table)
			.VALUES([Val.uuid(UpdatedObj.get_CategoryId()), Val.str(UpdatedObj.get_CategoryName()) ])
			.Execute();
		}
		else
		{
			// Si existe, actualiza los campobs
			SQL.UPDATE(Category.table)
			.SET([Assign.SET(Category.col_CategoryName, Val.str(UpdatedObj.get_CategoryName()))])
			.WHERE(Condition.SET(Category.col_CategoryId, Op.Equal, Val.uuid(UpdatedObj.get_CategoryId())))
			.Execute();
		}
	}
	public function Category_Delete(ID:UUID)
	{
		// Valida si es que existe previamente el registro
		var Exists:Int =
			SQL.SELECT([Ag.COUNTALL()])
			.FROM(Task.table)
			.WHERE(Task.col_CategoryId.eq(ID))
			.ReadValue();
			
		// Existe una relación de tareas, por eso no puede borrar
		if (Exists > 0){
			ExceptionHelper.LogicException(1002, "Unable to delete Category. There are associated tasks.");
			return;
		}
		
		// Borra el registro de la base de datos
		SQL.DELETE()
		.FROM(Category.table)
		.WHERE(Condition.SET(Category.col_CategoryId, Op.Equal, Val.uuid(ID)))
		.Execute();
	}
}
