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
class DecimalSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Length:Int, Scale:Int, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.DECIMAL, HaxeTypeEnum.FLOAT, Length, Scale, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(DecimalValue:Float) {
        //TODO: Validar número de enteros y número de decimales
    }

    public function Equals(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.Equal, Val.float(DecimalValue));
    }

    public function Different(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.Different, Val.float(DecimalValue));
    }

    public function LessThan(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.LessThan, Val.float(DecimalValue));
    }

    public function LessThanAndEquals(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.LessThanAndEquals, Val.float(DecimalValue));
    }

    public function MoreThan(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.MoreThan, Val.float(DecimalValue));
    }

    public function MoreThanAndEquals(DecimalValue:Float):Condition {
        ValidateDBCompatibility(DecimalValue);
        return Condition.SET(this, Op.MoreThanAndEquals, Val.float(DecimalValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.float(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.float(null));
    }

    public function SET(DecimalValue:Float):ISet{
        var asg = Assign.SET(this,Val.float(DecimalValue));
        return asg;
    }}
