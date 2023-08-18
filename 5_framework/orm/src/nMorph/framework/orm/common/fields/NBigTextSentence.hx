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
class NBigTextSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.NBIGTEXT, HaxeTypeEnum.STRING, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(stringValue:String) {
        // VALIDAR CODIFICACION
    }

    public function Equals(stringValue:String):Condition {
        ValidateDBCompatibility(stringValue);
        return Condition.SET(this, Op.Equal, Val.str(stringValue));
    }

    public function LIKE(stringValue:String):Condition {
        ValidateDBCompatibility(stringValue);
        return Condition.SET(this, Op.LIKE, Val.str(stringValue));
    }

    public function NotLIKE(stringValue:String):Condition {
        ValidateDBCompatibility(stringValue);
        return Condition.SET(this, Op.NotLIKE, Val.str(stringValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.str(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.str(null));
    }

    public function SET(stringValue:String):ISet {
        var asg = Assign.SET(this, Val.str(stringValue));
        return asg;
    }
}
