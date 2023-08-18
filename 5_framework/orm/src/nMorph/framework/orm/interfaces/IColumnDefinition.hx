package nMorph.framework.orm.interfaces;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.lang.DDL;

@:keepSub
interface IColumnDefinition {
    public function SCRIPT_PART(?args:String):String;
    public function RegisterQuery(CurrentDDL : ILang) : Void;
}
