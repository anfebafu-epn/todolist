package nMorph.framework.orm.tools;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.Connector;

/**
 * Clase utilizada para encolar varias llamadas para ejecución masiva unificada
 * @author Smartwork
 */
@:keep @:rtti
class BulkRun 
{

	@:isVar public var queue(get,set):Array<QueueItem>;
	
	
	function get_queue():Array<QueueItem> 
	{
		return queue;
	}
	
	function set_queue(value:Array<QueueItem>):Array<QueueItem> 
	{
		return queue = value;
	}
	
	public function new() 
	{
		
	}
	
	public function Execute(){
		Connector.ExecuteQueue(queue);
	}
	
}