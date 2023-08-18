package nMorph.framework.orm.client;
import haxe.ds.List;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class Connector
{

	//se conecta
	public static function Execute(SQL:String, Parameters:Array<QueryParameter>): Dynamic
	{
		return null;
	}

	public static function Queue(SQL:String, Parameters:Array<QueryParameter>, queue:Array<QueueItem>):Array<QueueItem>
	{
		if (queue == null)
		{
			queue = new Array<QueueItem>();
		}

		var item = new QueueItem();
		item.SQL = SQL;
		item.Parameters = Parameters;
		queue.push(item);

		return queue;
	}

	public static function ExecuteQueue(queue:Array<QueueItem>)
	{
		for (item in queue)
		{
			Execute(item.SQL, item.Parameters);
		}
	}

	public static function ReadValue(SQL:String, Parameters:Array<QueryParameter>):Dynamic
	{
		return null;
	}

	public static function ReadTable(SQL:String, Parameters:Array<QueryParameter>):QueryTable
	{
		var dt = new QueryTable();
		return dt;
	}

	public static function Read<T>(SQL:String, Parameters:Array<QueryParameter>, cl:Class<T>, ?context:Context):Array<T>
	{
		var arr:Array<T> = new Array<T>();
		return arr;
	}

	public static function ReadOne<T>(SQL:String, Parameters:Array<QueryParameter>, cl:Class<T>, ?context:Context):T
	{
		return null;
	}
}
