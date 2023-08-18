package nMorph.framework.svc.msg;
import nMorph.framework.svc.transport.MethodCall;

@:keep
@:expose
class RequestMessage {
    public function new() {
    }


    @:isVar public var RequestSeq(get, set):Int;
    @:isVar public var SessionID(get, set):String;
    @:isVar public var Calls(get, set):Array<MethodCall>;

    function set_RequestSeq(value:Int) {
        return this.RequestSeq = value;
    }

    function get_RequestSeq():Int {
        return RequestSeq;
    }

    function get_SessionID():String {
        return SessionID;
    }

    function set_SessionID(value:String) {
        return this.SessionID = value;
    }

    function get_Calls():Array<MethodCall> {
        return Calls;
    }

    function set_Calls(value:Array<MethodCall>) {
        return this.Calls = value;
    }
}
