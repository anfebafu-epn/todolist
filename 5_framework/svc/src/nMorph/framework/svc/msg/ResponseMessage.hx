package nMorph.framework.svc.msg;
import nMorph.framework.svc.transport.MethodResult;

@:keep
@:expose
class ResponseMessage {

    public function new() {
    }

    @:isVar public var Results(get, set):Array<MethodResult>;
    @:isVar public var RequestSeq(get, set):Int;
    @:isVar public var Message(get, set):String;
    @:isVar public var AttentionCode(get, set):String;

    function set_Results(value:Array<MethodResult>) {
        return this.Results = value;
    }

    function get_Results():Array<MethodResult> {
        return Results;
    }

    function set_RequestSeq(value:Int) {
        return this.RequestSeq = value;
    }

    function get_RequestSeq():Int {
        return RequestSeq;
    }

    function set_Message(value:String) {
        return this.Message = value;
    }

    function get_Message():String {
        return Message;
    }

    function get_AttentionCode():String {
        return AttentionCode;
    }

    function set_AttentionCode(value:String) {
        return this.AttentionCode = value;
    }


}
