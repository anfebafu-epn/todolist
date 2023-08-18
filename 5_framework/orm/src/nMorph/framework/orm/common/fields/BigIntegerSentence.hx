package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.common.exceptions.LogicException;
import haxe.Int64;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Assign;

@:keep
class BigIntegerSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.BIGINTEGER, HaxeTypeEnum.INT64, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(int64Value:Int64) {
        if (int64Value > cast(9223372036854775807, Int64)) {
            ExceptionHelper.LogicException(50001, "BigInteger not compatible with Database, BigInteger too large");
        }

        if (int64Value < cast(-9223372036854775807, Int64)) {
            ExceptionHelper.LogicException(50002, "BigInteger not compatible with Database, BigInteger too large (negative)");
        }

        // NULL VALIDATION, NULL data support
    }

    public function Equals(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.Equal, Val.int64(int64Value));
    }

    public function Different(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.Different, Val.int64(int64Value));
    }

    public function LessThan(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.LessThan, Val.int64(int64Value));
    }

    public function LessThanAndEquals(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.LessThanAndEquals, Val.int64(int64Value));
    }

    public function MoreThan(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.MoreThan, Val.int64(int64Value));
    }

    public function MoreThanAndEquals(int64Value:Int64):Condition {
        ValidateDBCompatibility(int64Value);
        return Condition.SET(this, Op.MoreThanAndEquals, Val.int64(int64Value));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.int64(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.int64(null));
    }

    public function SET(int64Value:Int64):ISet {
        var asg = Assign.SET(this, Val.int64(int64Value));
        return asg;
    }
}
