package nMorph.core.logic.ping;


import nMorph.core.db.sw_todolist.Person;
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
class Categroy
{
	public function new()
	{

	}
	
	public function Echo(Data: String): String
	{
		return "Echo " + Data;
	}
	
	public function ObjectPing(pr:PingRequest, val:Int): PingResponse{
		var res = new PingResponse();
		res.NameModified = pr.Name + " modificado " + val;
		return res;
	}
	
	public function Categroy():String{
		return "Pong";
	}
	
	public function Query():String{
		var p: Person = SQL.SELECT().FROM(Person.table).ReadOne(Person);
		return p.get_FullName();
	}
}
