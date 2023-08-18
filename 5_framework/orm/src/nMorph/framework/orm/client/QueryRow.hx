package nMorph.framework.orm.client;
@:keepSub @:rtti
class QueryRow
{

	public function new()
	{
	}

	@:isVar public var Items(get, set):Array<Dynamic>;

	function set_Items(value:Array<Dynamic>)
	{
		return this.Items = value;
	}

	function get_Items():Array<Dynamic>
	{
		return Items;
	}
}
