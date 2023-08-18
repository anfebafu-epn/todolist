package nMorph.framework.orm.common.sentences;

import nMorph.framework.orm.common.enums.MtTypeEnum;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class Mt implements ISentence{
    private var mtTypeEnum:MtTypeEnum;
    private var Sentence:ISentence;
    private var CurrentSQL:SQL;
    private var Alias:String;
    private var Parameter2:Float;

    public function new(mtTypeEnum:MtTypeEnum, Sentence:ISentence,?Parameter2:Float,?Alias:String) {
        this.mtTypeEnum = mtTypeEnum;
        this.Sentence = Sentence;
        this.Alias=Alias;
        this.Parameter2=Parameter2;
    }

    public function IsNullValue():Bool{
        return false;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
        if (this.Sentence != null) {
            this.Sentence.RegisterQuery(CurrentSQL);
        }
    }

    public static function ABS(Sentence:ISentence,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.ABS, Sentence,Alias);
        return mt;
    }

    public static function EXP(Sentence:ISentence,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.EXP, Sentence,Alias);
        return mt;
    }

    public static function FLOOR(Sentence:ISentence,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.FLOOR, Sentence,Alias);
        return mt;
    }

    public static function MOD(Sentence:ISentence,Divider:Float,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.MOD,Sentence,Divider,Alias);
        return mt;
    }

    public static function POWER(Sentence:ISentence,Exponent:Float,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.POWER,Sentence,Exponent,Alias);
        return mt;
    }

    public static function ROUND(Sentence:ISentence,decimals:Float,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.ROUND,Sentence,decimals,Alias);
        return mt;
    }

    public static function SQRT(Sentence:ISentence,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.SQRT, Sentence,Alias);
        return mt;
    }

    public static function SUM(Sentence:ISentence,?Alias:String):ISentence {
        var mt:Mt = new Mt(MtTypeEnum.SUM, Sentence,Alias);
        return mt;
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                switch(mtTypeEnum){
                    case MtTypeEnum.ABS:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.EXP:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.FLOOR:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.MOD:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.POWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.ROUND:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.SQRT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.SUM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUM("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

                }
            case DatabaseEngineEnum.MYSQL:
                switch(mtTypeEnum){
                    case MtTypeEnum.ABS:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.EXP:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.FLOOR:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.MOD:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.POWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.ROUND:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.SQRT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.SUM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUM("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

                }
            case DatabaseEngineEnum.ORACLE:
                switch(mtTypeEnum){
                    case MtTypeEnum.ABS:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.EXP:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.FLOOR:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.MOD:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.POWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.ROUND:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.SQRT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.SUM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUM("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

                }
            case DatabaseEngineEnum.POSTGRESQL:
                switch(mtTypeEnum){
                    case MtTypeEnum.ABS:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.EXP:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.FLOOR:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.MOD:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.POWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.ROUND:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.SQRT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.SUM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUM("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

                }
            case DatabaseEngineEnum.SQLSERVER:
                switch(mtTypeEnum){
                    case MtTypeEnum.ABS:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ABS(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.EXP:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("EXP(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.FLOOR:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("FLOOR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.MOD:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("MOD(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.POWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("POWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.ROUND:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock("," + Parameter2 + ") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("ROUND(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Parameter2 + ") ");
						}
                    case MtTypeEnum.SQRT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SQRT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case MtTypeEnum.SUM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUM("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

                }
        }
    }
}