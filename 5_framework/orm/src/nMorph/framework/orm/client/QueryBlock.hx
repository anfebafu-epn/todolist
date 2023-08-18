package nMorph.framework.orm.client;

/**
 * ...
 * @author Smartwork
 */
@:keepSub @:rtti
class QueryBlock 
{

	public function new() 
	{
		
	}
	
	public static function SET(BlockName:String, BlockCode:String):QueryBlock
	{
		var b = new QueryBlock();
		b.BlockName = BlockName;
		b.BlockCode = BlockCode;
		return b;
	}
	
	@:isVar public var BlockName(get, set):String;
	
	function get_BlockName():String 
	{
		return BlockName;
	}
	
	function set_BlockName(value:String):String 
	{
		return BlockName = value;
	}
	
	
	@:isVar private var BlockCode(get, set):String;
	
	function get_BlockCode():String 
	{
		return BlockCode;
	}
	
	function set_BlockCode(value:String):String 
	{
		return BlockCode = value;
	}
	
	
	
}