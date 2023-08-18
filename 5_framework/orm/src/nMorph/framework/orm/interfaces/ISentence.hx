package nMorph.framework.orm.interfaces;

import nMorph.framework.orm.common.enums.DBTypeEnum;
//import nMorph.framework.orm.lang.SQL;

@:keepSub 
interface ISentence {
    public function SCRIPT_PART(?args:String):Void;
    public function RegisterQuery(CurrentLang:ILang):Void;
    public function IsNullValue():Bool;
}
