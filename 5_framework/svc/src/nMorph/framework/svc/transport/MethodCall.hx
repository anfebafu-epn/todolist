package nMorph.framework.svc.transport;

@:keep
@:expose
class MethodCall {
    public function new() {
    }

    @:isVar public var LogicModule(get, set):String;
    @:isVar public var LogicClass(get, set):String;
    @:isVar public var LogicMethod(get, set):String;
    @:isVar public var LogicParams(get, set):Array<Dynamic>;
    @:isVar public var Name(get, set):String;

    function set_LogicModule(value:String) {
        return this.LogicModule = value;
    }

    function get_LogicModule():String {
        return LogicModule;
    }

    function set_LogicClass(value:String) {
        return this.LogicClass = value;
    }

    function get_LogicClass():String {
        return LogicClass;
    }

    function set_LogicMethod(value:String) {
        return this.LogicMethod = value;
    }

    function get_LogicMethod():String {
        return LogicMethod;
    }

    function set_LogicParams(value:Array<Dynamic>) {
        return this.LogicParams = value;
    }

    function get_LogicParams():Array<Dynamic> {
        return LogicParams;
    }

    function get_Name():String {
        return Name;
    }

    function set_Name(value:String) {
        return this.Name = value;
    }
}
