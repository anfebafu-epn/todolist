package nMorph.framework.orm.common.sentences;
import haxe.Int64;
import haxe.io.Bytes;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.interfaces.ILang;

import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.lang.SQL;


@:keepSub @:rtti
class Val implements ISentence {

    private var HaxeType:HaxeTypeEnum;
    private var StringValue:String;
    private var IntValue:Int;
    private var Int64Value:Int64;
    private var FloatValue:Float;
    private var BytesValue:Bytes;
    private var DateValue:Date;
    private var BoolValue:Bool;
    private var UUIDValue:nMorph.framework.common.datatypes.UUID;
    private var isNullValue:Bool;


    private var ParName:String;


    private var CurrentSQL:SQL;

    public function new() {
    }

    public function setStringValue(StringValue:Null<String>) {
        if (StringValue == null) {
            this.isNullValue = true;
        }
        else {
            this.StringValue = StringValue;
        }
        this.HaxeType = HaxeTypeEnum.STRING;
    }

    public function setIntValue(IntValue:Null<Int>) {
        if (IntValue == null) {
            this.isNullValue = true;
        }
        else {
            this.IntValue = IntValue;
        }
        this.HaxeType = HaxeTypeEnum.INT;
    }

    public function setInt64Value(Int64Value:Null<Int64>) {
        if (Int64Value == null) {
            this.isNullValue = true;
        }
        else {
            this.Int64Value = Int64Value;
        }
        this.HaxeType = HaxeTypeEnum.INT64;
    }

    public function setFloatValue(FloatValue:Null<Float>) {
        if (FloatValue == null) {
            this.isNullValue = true;
        }
        else {
            this.FloatValue = FloatValue;
        }
        this.HaxeType = HaxeTypeEnum.FLOAT;
    }

    public function setBytesValue(BytesValue:Null<Bytes>) {
        if (BytesValue == null) {
            this.isNullValue = true;
        }
        else {
            this.BytesValue = BytesValue;
        }
        this.HaxeType = HaxeTypeEnum.BYTES;
    }

    public function setDateValue(DateValue:Null<Date>) {
        if (DateValue == null) {
            this.isNullValue = true;
        }
        else {
            this.DateValue = DateValue;
        }
        this.HaxeType = HaxeTypeEnum.DATE;
    }

    public function setBoolValue(BoolValue:Null<Bool>) {
        if (BoolValue == null) {
            this.isNullValue = true;
        }
        else {
            this.BoolValue = BoolValue;
        }
        this.HaxeType = HaxeTypeEnum.BOOL;
    }

    public function setUUIDValue(UUIDValue:Null<nMorph.framework.common.datatypes.UUID>) {
        if (UUIDValue == null) {
            this.isNullValue = true;
        }
        else {
            this.UUIDValue = UUIDValue;
        }
        this.HaxeType = HaxeTypeEnum.UUID;
    }

    public static function str(sValue:Null<String>):Val {
        var fvs:Val = new Val();
        fvs.setStringValue(sValue);
        return fvs;
    }

    public static function string(sValue:Null<String>):Val {
        var fvs:Val = new Val();
        fvs.setStringValue(sValue);
        return fvs;
    }

    public static function int(iValue:Null<Int>):Val {
        var fvs:Val = new Val();
        fvs.setIntValue(iValue);
        return fvs;
    }

    public static function int64(iValue:Null<Int64>):Val {
        var fvs:Val = new Val();
        fvs.setInt64Value(iValue);
        return fvs;
    }

    public static function float(fValue:Null<Float>):Val {
        var fvs:Val = new Val();
        fvs.setFloatValue(fValue);
        return fvs;
    }

    public static function bytes(bValue:Null<Bytes>):Val {
        var fvs:Val = new Val();
        fvs.setBytesValue(bValue);
        return fvs;
    }

    public static function date(dValue:Null<Date>):Val {
        var fvs:Val = new Val();
        fvs.setDateValue(dValue);
        return fvs;
    }

    public static function bool(bValue:Null<Bool>):Val {
        var fvs:Val = new Val();
        fvs.setBoolValue(bValue);
        return fvs;
    }

    public static function uuid(uValue:Null<nMorph.framework.common.datatypes.UUID>):Val {
        var fvs:Val = new Val();
        fvs.setUUIDValue(uValue);
        return fvs;
    }

    public function IsNullValue():Bool{
        return isNullValue;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine()){
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
                switch(HaxeType)
                {
                    case HaxeTypeEnum.STRING:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.VARCHAR, isNullValue ? null : StringValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.INT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.INTEGER, isNullValue ? null : IntValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.INT64:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BIGINTEGER, isNullValue ? null : Int64Value));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.BOOL:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BOOLEAN, isNullValue ? null : BoolValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.BYTES:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BINARY, isNullValue ? null : BytesValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.DATE:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.DATETIME, isNullValue ? null : DateValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.FLOAT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.FLOAT, isNullValue ? null : FloatValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.UUID:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.UUID, isNullValue ? null : UUIDValue));
                        CurrentSQL.AddBlock("@" + ParName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                switch(HaxeType)
                {
                    case HaxeTypeEnum.STRING:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.VARCHAR, isNullValue ? null : StringValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.INTEGER, isNullValue ? null : IntValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT64:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BIGINTEGER, isNullValue ? null : Int64Value));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BOOL:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BOOLEAN, isNullValue ? null : BoolValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BYTES:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BINARY, isNullValue ? null : BytesValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.DATE:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.DATETIME, isNullValue ? null : DateValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.FLOAT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.FLOAT, isNullValue ? null : FloatValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.UUID:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.UUID, isNullValue ? null : UUIDValue));
                        CurrentSQL.AddBlock(":" + ParName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                switch(HaxeType)
                {
                    case HaxeTypeEnum.STRING:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.VARCHAR, isNullValue ? null : StringValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.INTEGER, isNullValue ? null : IntValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT64:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BIGINTEGER, isNullValue ? null : Int64Value));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BOOL:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BOOLEAN, isNullValue ? null : BoolValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BYTES:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BINARY, isNullValue ? null : BytesValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.DATE:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.DATETIME, isNullValue ? null : DateValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.FLOAT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.FLOAT, isNullValue ? null : FloatValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.UUID:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.UUID, isNullValue ? null : UUIDValue));
                        CurrentSQL.AddBlock(":" + ParName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                switch(HaxeType)
                {
                    case HaxeTypeEnum.STRING:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.VARCHAR, isNullValue ? null : StringValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.INTEGER, isNullValue ? null : IntValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.INT64:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BIGINTEGER, isNullValue ? null : Int64Value));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BOOL:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BOOLEAN, isNullValue ? null : BoolValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.BYTES:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BINARY, isNullValue ? null : BytesValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.DATE:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.DATETIME, isNullValue ? null : DateValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.FLOAT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.FLOAT, isNullValue ? null : FloatValue));
                        CurrentSQL.AddBlock(":" + ParName);
                    case HaxeTypeEnum.UUID:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.UUID, isNullValue ? null : UUIDValue));
                        CurrentSQL.AddBlock(":" + ParName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                switch(HaxeType)
                {
                    case HaxeTypeEnum.STRING:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.VARCHAR, isNullValue ? null : StringValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.INT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.INTEGER, isNullValue ? null : IntValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.INT64:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BIGINTEGER, isNullValue ? null : Int64Value));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.BOOL:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BOOLEAN, isNullValue ? null : BoolValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.BYTES:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.BINARY, isNullValue ? null : BytesValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.DATE:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.DATETIME, isNullValue ? null : DateValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.FLOAT:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.FLOAT, isNullValue ? null : FloatValue));
                        CurrentSQL.AddBlock("@" + ParName);
                    case HaxeTypeEnum.UUID:
                        var ParName = CurrentSQL.AddParameter(QueryParameter.SET(DBTypeEnum.UUID, isNullValue ? null : UUIDValue));
                        CurrentSQL.AddBlock("@" + ParName);
                }
        }
    }
}
