package nMorph.framework.orm.client;
import nMorph.framework.orm.client.QueryColumn;
import nMorph.framework.orm.client.QueryRow;
@:keepSub @:rtti
class QueryTable {
    public function new() {
    }

    @:isVar public var Name(get, set):String;
    @:isVar public var Rows(get, set):Array<QueryRow> = new Array<QueryRow>();
    @:isVar public var Columns(get, set):Array<QueryColumn> = new Array<QueryColumn>();

    function get_Name():String {
        return Name;
    }

    function set_Name(value:String) {
        return this.Name = value;
    }

    function get_Rows():Array<QueryRow> {
        return Rows;
    }

    function set_Rows(value:Array<QueryRow>) {
        return this.Rows = value;
    }

    function get_Columns():Array<QueryColumn> {
        return Columns;
    }

    function set_Columns(value:Array<QueryColumn>) {
        return this.Columns = value;
    }
}
