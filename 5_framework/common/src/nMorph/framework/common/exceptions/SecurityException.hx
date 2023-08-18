package nMorph.framework.common.exceptions;
import haxe.Exception;
@:keep
@:expose
class SecurityException extends Exception {

    public function new(Code:Int, Msg:String) {
		super(Msg);
        this.Code = Code;
    }

    @:isVar public var Code(get, set):Int;

    function set_Code(value:Int) {
        return this.Code = value;
    }

    function get_Code():Int {
        return Code;
    }
}
