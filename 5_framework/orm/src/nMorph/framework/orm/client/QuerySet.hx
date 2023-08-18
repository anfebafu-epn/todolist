package nMorph.framework.orm.client;
import nMorph.framework.orm.client.QueryTable;
class QuerySet
{
	public function new()
	{
	}

	@:isVar public var Tables(get, set):Array<QueryTable>;

	function set_Tables(value:Array<QueryTable>)
	{
		return this.Tables = value;
	}

	function get_Tables():Array<QueryTable>
	{
		return Tables;
	}

	function get(Name: String):QueryTable
	{
		for (dt in Tables)
		{
			if (dt.Name == Name)
			{
				return dt;
			}
		}
		return null;
	}
}
