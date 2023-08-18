package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.common.sentences.Assign;

@:keep
class DateTimeSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.DATETIME, HaxeTypeEnum.DATE, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(DateValue:Date) {
        if (DateValue.getFullYear() < 1753) {
            ExceptionHelper.LogicException(50006, "Date not compatible with Database, Date is less than year 1753");
        }

        if (DateValue.getFullYear() > 9999) {
            ExceptionHelper.LogicException(50007, "Date not compatible with Database, Date is more than year 9999");
        }
    }

    public function Equals(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.Equal, Val.date(DateValue));
    }

    public function Different(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.Different, Val.date(DateValue));
    }

    public function LessThan(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.LessThan, Val.date(DateValue));
    }

    public function LessThanAndEquals(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.LessThanAndEquals, Val.date(DateValue));
    }

    public function MoreThan(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.MoreThan, Val.date(DateValue));
    }

    public function MoreThanAndEquals(DateValue:Date):Condition {
        ValidateDBCompatibility(DateValue);
        return Condition.SET(this, Op.MoreThanAndEquals, Val.date(DateValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.date(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.date(null));
    }

    public function SET(DateValue:Date):ISet {
        var asg = Assign.SET(this, Val.date(DateValue));
        return asg;
    }
}
