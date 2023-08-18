package nMorph.framework.orm.client;
import nMorph.framework.orm.client.QueryParameter;
class QueueItem {
    public function new() {
    }

    @:isVar public var SQL(get, set):String;
    @:isVar public var Parameters(get, set):Array<QueryParameter>;

    function set_SQL(value:String) {
        return this.SQL = value;
    }

    function get_SQL():String {
        return SQL;
    }

    function get_Parameters():Array<QueryParameter> {
        return Parameters;
    }

    function set_Parameters(value:Array<QueryParameter>) {
        return this.Parameters = value;
    }


}
