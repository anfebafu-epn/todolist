package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.common.sentences.Assign;

@:keep
class BooleanSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.BOOLEAN, HaxeTypeEnum.BOOL, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(boolValue:Bool) {

    }

    public function Equals(boolValue:Bool) : Condition {
        ValidateDBCompatibility(boolValue);
        return Condition.SET(this, Op.Equal, Val.bool(boolValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.bool(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.bool(null));
    }

    public function SET(boolValue:Bool):ISet{
        var asg = Assign.SET(this,Val.bool(boolValue));
        return asg;
    }
}
