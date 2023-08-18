package nMorph.core.objects.ping;

/**
 * ...
 * @author Smartwork
 */
@:keepSub @:rtti
class PingRequest 
{

	public function new() 
	{
		
	}
	
	function get_Name():String 
	{
		return Name;
	}
	
	function set_Name(value:String):String 
	{
		return Name = value;
	}
	
	@:isVar public var Name(get, set):String;
	
}