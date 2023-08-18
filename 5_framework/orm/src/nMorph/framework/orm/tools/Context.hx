package nMorph.framework.orm.tools;

import nMorph.framework.orm.common.enums.ObjectEditTypeEnum;
import nMorph.framework.orm.client.Connector;
import nMorph.framework.orm.client.ModelObject;
import nMorph.framework.orm.client.QueueItem;

@:keep @:rtti
class Context
{
	@:isVar public var Queue(get, set):Array<QueueItem>;
	@:isVar public var Objects(get, set):Array<ModelObject>;

	function get_Queue():Array<QueueItem>
	{
		return Queue;
	}

	function set_Queue(value:Array<QueueItem>)
	{
		return this.Queue = value;
	}

	function get_Objects():Array<ModelObject>
	{
		return Objects;
	}

	function set_Objects(value:Array<ModelObject>)
	{
		return this.Objects = value;
	}

	public function new()
	{
		Queue=new Array<QueueItem>();
		Objects=new Array<ModelObject>();
	}

	public function Attach(obj:ModelObject)
	{
		Objects.push(obj);
	}

	public function Save()
	{

		// Obtención de cambios de todos los objetos atados
		for (obj in Objects)
		{
			if (obj.ObjectEditType != ObjectEditTypeEnum.NOCHANGE)
				Queue = obj.Save(Queue);
		}

		// Ejecuto en una sola transacción todos los cambios en la base de datos
		Connector.ExecuteQueue(Queue);

		// Limpieza de cambios
		for (obj in Objects)
		{
			obj.Clear();
		}
	}

	public static function ExecuteQueue(queue:Array<QueueItem>)
	{
		Connector.ExecuteQueue(queue);
	}
}
