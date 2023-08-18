package nMorph.framework.orm.client;

import nMorph.framework.orm.common.enums.ParameterDirectionEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;

@:keepSub @:rtti
class QueryParameter
{
	public function new()
	{
	}

	public static function SET(DataType:DBTypeEnum, Value:Dynamic):QueryParameter
	{
		var p = new  QueryParameter();
		p.Value = Value;
		p.DataType = DataType;
		p.ParameterDirection = ParameterDirectionEnum.INPUT;
		return p;
	}

	@:isVar public var DataType(get, set):DBTypeEnum;
	@:isVar public var ParameterDirection(get, set):ParameterDirectionEnum;
	@:isVar public var ParameterName(get, set):String;
	@:isVar public var Value(get, set):Dynamic;

	function get_DataType():DBTypeEnum
	{
		return DataType;
	}

	function set_DataType(value:DBTypeEnum)
	{
		return this.DataType = value;
	}

	function set_ParameterDirection(value:ParameterDirectionEnum)
	{
		return this.ParameterDirection = value;
	}

	function get_ParameterDirection():ParameterDirectionEnum
	{
		return ParameterDirection;
	}

	function set_ParameterName(value:String)
	{
		return this.ParameterName = value;
	}

	function get_ParameterName():String
	{
		return ParameterName;
	}

	function get_Value():Dynamic
	{
		return Value;
	}

	function set_Value(value:Dynamic)
	{
		return this.Value = value;
	}

}
