package nMorph.framework.orm.common.sentences;

import nMorph.framework.orm.common.enums.HaxeTypeEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;

#if !js
import nMorph.framework.orm.lang.SQL;
//import nMorph.framework.orm.common.conditions.Condition;
#end

@:keepSub @:rtti
class FieldSentence implements ISentence {

    @:isVar public var FieldName(get, null):String;
    @:isVar public var FieldTable(get, null):String;
    @:isVar public var DBType(get, null):DBTypeEnum;
    @:isVar public var HXType(get, null):HaxeTypeEnum;
    @:isVar public var Length(get, null):Null<Int>;
    @:isVar public var Scale(get, null):Null<Int>;
    @:isVar public var Nullable(get, null):NullableEnum;
    @:isVar public var IsPrimaryKey(get, null):Bool;
	#if !js
    @:isVar public var CurrentSQL(get, null):SQL;
	#end


    public function new(FieldTable:String, FieldName:String, DBType:DBTypeEnum, HXType:HaxeTypeEnum, Length:Null<Int>, Scale:Null<Int>, Nullable:NullableEnum, IsPrimaryKey:Bool) {
		
        this.FieldName = "\""+FieldName+"\"";//ajuste compartible con bases de datos excepto mysql adaptacion en connector
        this.FieldTable = "\""+FieldTable+"\"";
        this.DBType = DBType;
        this.HXType = HXType;
        this.Length = Length;
        this.Scale = Scale;
        this.Nullable = Nullable;
        this.IsPrimaryKey = IsPrimaryKey;

		#if !js
        if(CurrentSQL==null)
            CurrentSQL=new SQL();

		#end
    }
	
	//public static function SET (FieldTable:String, FieldName:String, DBType:DBTypeEnum, HXType:HaxeTypeEnum, Length:Null<Int>, Scale:Null<Int>, Nullable:NullableEnum, IsPrimaryKey:Bool):FieldSentence {
		//return new FieldSentence(FieldTable, FieldName, DBType, HXType, Length, Scale, Nullable, IsPrimaryKey);
	//}
	

    public function RegisterQuery(CurrentSQL:ILang) {
		#if !js
        this.CurrentSQL = cast(CurrentSQL, SQL);
		#end
    }

    public function IsNullValue():Bool{
        return false;
    }

    function get_FieldName():String {
        return FieldName;
    }

    function get_FieldTable():String {
        return FieldTable;
    }

    function get_DBType():DBTypeEnum {
        return DBType;
    }

    function get_HXType():HaxeTypeEnum {
        return HXType;
    }

    function get_Length():Null<Int> {
        return Length;
    }

    function get_Scale():Null<Int> {
        return Scale;
    }

    function get_Nullable():NullableEnum {
        return Nullable;
    }

    function get_IsPrimaryKey():Bool {
        return IsPrimaryKey;
    }

	#if !js
    function get_CurrentSQL():SQL {
        return CurrentSQL;
    }
	#end


    public function SCRIPT_PART(?args:String) {
		#if !js
        switch(CurrentSQL.getCurrentEngine())
        {
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
                if (args != null) {
                    if (args == "ONLYNAME") {
                        CurrentSQL.AddBlock(FieldName);
                    }
                    else if (args == "WITHTABLE") {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                    else {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                }
                else {
                    CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                if (args != null) {
                    if (args == "ONLYNAME") {
                        CurrentSQL.AddBlock(FieldName);
                    }
                    else if (args == "WITHTABLE") {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                    else {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                }
                else {
                    CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                if (args != null) {
                    if (args == "ONLYNAME") {
                        CurrentSQL.AddBlock(FieldName);
                    }
                    else if (args == "WITHTABLE") {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                    else {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                }
                else {
                    CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                if (args != null) {
                    if (args == "ONLYNAME") {
                        CurrentSQL.AddBlock(FieldName);
                    }
                    else if (args == "WITHTABLE") {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                    else {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                }
                else {
                    CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                if (args != null) {
                    if (args == "ONLYNAME") {
                        CurrentSQL.AddBlock(FieldName);
                    }
                    else if (args == "WITHTABLE") {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                    else {
                        CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                    }
                }
                else {
                    CurrentSQL.AddBlock(FieldTable + "." + FieldName);
                }
        }
		#end
    }
}
