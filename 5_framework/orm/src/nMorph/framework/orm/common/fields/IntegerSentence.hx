package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.common.sentences.Assign;

@:keep
class IntegerSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.INTEGER, HaxeTypeEnum.INT, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(IntValue:Int) {

    }

    public function Equals(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.Equal, Val.int(IntValue));
    }

    public function Different(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.Different, Val.int(IntValue));
    }

    public function LessThan(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.LessThan, Val.int(IntValue));
    }

    public function LessThanAndEquals(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.LessThanAndEquals, Val.int(IntValue));
    }

    public function MoreThan(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.MoreThan, Val.int(IntValue));
    }

    public function MoreThanAndEquals(IntValue:Int):Condition {
        ValidateDBCompatibility(IntValue);
        return Condition.SET(this, Op.MoreThanAndEquals, Val.int(IntValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.int(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.int(null));
    }

    public function SET(IntValue:Int):ISet {
        var asg = Assign.SET(this, Val.int(IntValue));
        return asg;
    }

}
