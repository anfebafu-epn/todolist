package nMorph.framework.svc.transport;

@:keep
@:expose
class MethodResult {
    public function new() {
    }

    @:isVar public var ReturnObject(get, set):Dynamic;
    @:isVar public var Name(get, set):String;

    function get_ReturnObject():Dynamic {
        return ReturnObject;
    }

    function set_ReturnObject(value:Dynamic) {
        return this.ReturnObject = value;
    }

    function get_Name():String {
        return Name;
    }

    function set_Name(value:String) {
        return this.Name = value;
    }
}
