package nMorph.core.objects.ping;

/**
 * ...
 * @author Smartwork
 */
@:keepSub @:rtti
class PingResponse 
{

	public function new() 
	{
		
	}
	
	function get_NameModified():String 
	{
		return NameModified;
	}
	
	function set_NameModified(value:String):String 
	{
		return NameModified = value;
	}
	
	@:isVar public var NameModified(get, set):String;
	
}