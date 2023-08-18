package nMorph.framework.orm.interfaces;
//import nMorph.framework.orm.lang.SQL;

@:keepSub
interface ISet {
    public function SCRIPT_PART(?args:String):Void;
    public function RegisterQuery(CurrentSQL : ILang) : Void;
}
