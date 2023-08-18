package nMorph.framework.orm.client;
import nMorph.framework.orm.common.enums.DBTypeEnum;
@:keepSub @:rtti
class QueryColumn {
    public function new() {
    }

    @:isVar public var ColumnName(get, set):String;
    @:isVar public var ColumnType(get, set):DBTypeEnum;
    @:isVar public var ColumnIndex(get, set):Int;

    function get_ColumnName():String {
        return ColumnName;
    }

    function set_ColumnName(value:String) {
        return this.ColumnName = value;
    }

    function get_ColumnType():DBTypeEnum {
        return ColumnType;
    }

    function set_ColumnType(value:DBTypeEnum) {
        return this.ColumnType = value;
    }


    function get_ColumnIndex():Int {
        return ColumnIndex;
    }

    function set_ColumnIndex(value:Int) {
        return this.ColumnIndex = value;
    }
}
