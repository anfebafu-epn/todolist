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
class FloatSentence extends FieldSentence
{

	public function new(FieldTable:String, FieldName:String, Nullable:NullableEnum, IsPrimaryKey:Bool)
	{
		super(FieldTable, FieldName, DBTypeEnum.FLOAT, HaxeTypeEnum.FLOAT, null, null, Nullable, IsPrimaryKey);
	}

	public function ValidateDBCompatibility(FloatValue:Float)
	{

	}

	public function Equals(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.Equal, Val.float(FloatValue));
	}

	public function Different(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.Different, Val.float(FloatValue));
	}

	public function LessThan(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.LessThan, Val.float(FloatValue));
	}

	public function LessThanAndEquals(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.LessThanAndEquals, Val.float(FloatValue));
	}

	public function MoreThan(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.MoreThan, Val.float(FloatValue));
	}

	public function MoreThanAndEquals(FloatValue:Float):Condition
	{
		ValidateDBCompatibility(FloatValue);
		return Condition.SET(this, Op.MoreThanAndEquals, Val.float(FloatValue));
	}

	public function IsNull():Condition
	{
		return Condition.SET(this, Op.Equal, Val.float(null));
	}

	public function IsNotNull():Condition
	{
		return Condition.SET(this, Op.Different, Val.float(null));
	}

	public function SET(FloatValue:Float):ISet
	{
		var asg = Assign.SET(this, Val.float(FloatValue));
		return asg;
	}

}
