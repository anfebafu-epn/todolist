package nMorph.framework.orm.client;

import nMorph.framework.orm.client.ModelObject;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.common.enums.ObjectSourceTypeEnum;
import nMorph.framework.orm.common.enums.ObjectEditTypeEnum;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ModelArray<T>
{

	@:isVar public var arr(get, set):Array<T>;

	function set_arr(value:Array<T>)
	{
		return this.arr = value;
	}

	function get_arr():Array<T>
	{
		return arr;
	}

	//public function Include(DBresult:Array<T>) {
	// la idea es que se crguen los arreglos hijos
	// sin que éstos se aten al ORM principal
	// aún así se marquen como monitoreados.
	// por tanto la idea es que corra la cláusula con el SQL sin monitoreo directamente
	// pero en esta función se le activa el monitoreo

	// Qué pasa si el padre no es monitoreado? nada en principio, nunca reflejarán los cambios
	// pero

	public function Include(clause:IClause,laClase:Dynamic,context:Context)
	{

		var clase=std.Type.getClass(laClase);
		var name = std.Type.getClassName(clase);
		//var type = std.Type.resolveClass(name.substr(name.indexOf("_") + 1));
		var type = std.Type.resolveClass(name);

		var DBresult:Array<T> = clause.Read(type,context);
		for (item in DBresult)
		{
			// si el objeto es un ModelObject, activo el monitoreo
			if (Std.isOfType(item, ModelObject))
			{
				var mo:ModelObject = cast(item, ModelObject);
				mo.TrackChanges = true;
				mo.ObjectEditType = ObjectEditTypeEnum.NOCHANGE;
				mo.ObjectSource = ObjectSourceTypeEnum.DB;
				Add(item);
			}
			else
			{
				ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
			}
		}
	}

	public function Add(x:T):Int
	{
		if (!Std.isOfType(x, ModelObject))
			ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
		return arr.push(x);
	}

	// attach

	public function Remove(x:T):Bool
	{
		if (!Std.isOfType(x, ModelObject))
			ExceptionHelper.LogicException(1, "Objects should be ModelObjects");

		var mo:ModelObject = cast(x, ModelObject);

		// solamente lo marca para borrado, pero se quita del arreglo solamente cuando el procedimiento de borrado se haya completado
		mo.ObjectEditType = ObjectEditTypeEnum.DELETE;

		//return arr.remove(x);
		return true;
	}

	public function Insert(pos:Int, x:T)
	{
		arr.insert(pos, x);
	}

	public function Filter(f:T -> Bool):Array<T>
	{
		return arr.filter(f);
	}

	public function iterator():Iterator<T>
	{
		return arr.iterator();
	}

	public function Save(queue:Array<QueueItem>):Array<QueueItem>
	{
		for (item in arr)
		{
			if (Std.isOfType(item, ModelObject))
			{
				var mo:ModelObject = cast(item, ModelObject);
				queue = mo.Save(queue);
			}
		}
		return queue;
	}

	public function Clear()
	{
		for (item in arr)
		{
			if (Std.isOfType(item, ModelObject))
			{
				var mo:ModelObject = cast(item, ModelObject);

				if (mo.ObjectEditType == ObjectEditTypeEnum.DELETE)
				{
					// borro los items borrados de la lista
					arr.remove(item);
				}
				else
				{
					// Limpio los objetos internos
					mo.Clear();
				}
			}
		}
	}

	public function new()
	{
		arr = new Array<T>();
	}
}
