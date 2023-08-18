package nMorph.core.logic.person;

import nMorph.core.db.sw_todolist.Person;
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
class PersonLogic
{
	public function new()
	{

	}
	
	public function Person_Login(Email:String, password:String):Person{
		// Consulta con los datos obtenidos para las credenciales
		var p:Person = Person.WHERE(Person.col_Email.Equals(Email).AND(Person.col_PasswordHash.Equals(password))).ReadOne(Person);
		
		if (p != null){
			p.set_PasswordHash(""); // No se envía el password en la respuesta
		}
		
		return p;
	}

	public function Person_Search(SearchTerm:String): Array<Person>
	{

		var lst: Array<Person> =
		Person.WHERE(Person.col_FullName.LIKE("%" + SearchTerm + "%").OR(Person.col_Email.LIKE("%" + SearchTerm + "%")))
		.ORDERBY([Person.col_FullName])
		.Read(Person);

		return lst;
	}

	public function Person_GetByID(ID:UUID): Person
	{
		var cat:Person = Person.BYPK(ID).ReadOne(Person);
		return cat;
	}

	public function Person_Save(UpdatedObj : Person)
	{
		// Valida si es que existe previamente el registro
		var Exists:Int =
			SQL.SELECT([Ag.COUNTALL()])
			.FROM(Person.table)
			.WHERE(Condition.SET(Person.col_PersonId, Op.Equal, Val.uuid(UpdatedObj.get_PersonId())))
			.ReadValue();

		// si no existe, crea un nuevo registro
		if (Exists == 0)
		{
			SQL.INSERT(Person.table)
			.VALUES([
				Val.uuid(UpdatedObj.get_PersonId()), 
				Val.str(UpdatedObj.get_FullName()), 
				Val.str(UpdatedObj.get_Email()), 
				Val.str(UpdatedObj.get_PasswordHash()),
				Val.int(UpdatedObj.get_Role())
				])
			.Execute();
		}
		else
		{
			// Si existe, actualiza los campobs
			SQL.UPDATE(Person.table)
			.SET([
				Assign.SET(Person.col_FullName, Val.str(UpdatedObj.get_FullName())),
				Assign.SET(Person.col_Email, Val.str(UpdatedObj.get_Email())),
				Assign.SET(Person.col_PasswordHash, Val.str(UpdatedObj.get_PasswordHash())),
				Assign.SET(Person.col_Role, Val.int(UpdatedObj.get_Role())),
			])
			.WHERE(Condition.SET(Person.col_PersonId, Op.Equal, Val.uuid(UpdatedObj.get_PersonId())))
			.Execute();
		}
	}
	public function Person_Delete(ID:UUID)
	{
		// Valida si es que existe previamente el registro
		var Exists:Int =
			SQL.SELECT([Ag.COUNTALL()])
			.FROM(Task.table)
			.WHERE(Task.col_PersonId.eq(ID))
			.ReadValue();
			
		// Existe una relación de tareas, por eso no puede borrar
		if (Exists > 0){
			ExceptionHelper.LogicException(1001, "Unable to delete Person. There are associated tasks.");
			return;
		}
		
		// Borra el registro de la base de datos
		SQL.DELETE()
		.FROM(Person.table)
		.WHERE(Condition.SET(Person.col_PersonId, Op.Equal, Val.uuid(ID)))
		.Execute();
	}
}
