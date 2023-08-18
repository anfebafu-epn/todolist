package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.common.exceptions.ExceptionHelper;
import haxe.io.Bytes;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.common.sentences.Assign;

@:keep
class BinarySentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.BINARY, HaxeTypeEnum.BYTES, null, null, Nullable, IsPrimaryKey);
    }

    public function ValidateDBCompatibility(binaryValue:Bytes) {
        if (binaryValue.length > 2147483646 ){
            ExceptionHelper.LogicException(50004, "Binary not compatible with Database, Binary too large");
        }
    }


    public function Equals(binaryValue:Bytes) : Condition {
        return Condition.SET(this, Op.Equal, Val.bytes(binaryValue));
    }

    public function IsNull():Condition {
        return Condition.SET(this, Op.Equal, Val.bytes(null));
    }

    public function IsNotNull():Condition {
        return Condition.SET(this, Op.Different, Val.bytes(null));
    }

    public function SET(binaryValue:Bytes):ISet{
        var asg = Assign.SET(this,Val.bytes(binaryValue));
        return asg;
    }
}
