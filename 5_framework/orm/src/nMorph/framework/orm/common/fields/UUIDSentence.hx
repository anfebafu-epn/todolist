package nMorph.framework.orm.common.fields;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.common.datatypes.UUID;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.common.sentences.Val;

@:keep
class UUIDSentence extends FieldSentence {

    public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool) {
        super(FieldTable, FieldName, DBTypeEnum.UUID, HaxeTypeEnum.UUID, null, null, Nullable, IsPrimaryKey);
    }

    public function eq(UUIDValue:UUID) : Condition {
        return Condition.SET(this, Op.Equal, Val.uuid(UUIDValue));
    }
}
