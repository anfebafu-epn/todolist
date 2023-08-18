package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.FnTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class Fn implements ISentence {

    private var FnType:FnTypeEnum;
    private var Sentence:ISentence;
    private var CurrentSQL :SQL;
    private var val2:Null<Float>;
    private var Sentence2:ISentence;
    private var Alias:String;

    public function new(FnType:FnTypeEnum, Sentence:ISentence,?val2:Float,?Sentence2:ISentence,?Alias:String) {
        this.FnType = FnType;
        this.Sentence = Sentence;
        this.val2=val2;
        this.Sentence2=Sentence2;
        this.Alias=Alias;
    }

    public function IsNullValue():Bool{
        return false;
    }

    public static function FSUM(Sentence:ISentence,?val2:Float,?Sentence2:ISentence,?Alias:String):ISentence {
        var fn:Fn = new Fn(FnTypeEnum.FSUM, Sentence,val2,Sentence2,Alias);
        return fn;
    }

    public static function FSUBTRACTION(Sentence:ISentence,?val2:Float,?Sentence2:ISentence,?Alias:String):ISentence {
        var fn:Fn = new Fn(FnTypeEnum.FSUB, Sentence,val2,Sentence2,Alias);
        return fn;
    }

    public static function FMULT(Sentence:ISentence,?val2:Float,?Sentence2:ISentence,?Alias:String):ISentence {
        var fn:Fn = new Fn(FnTypeEnum.FMULT, Sentence,val2,Sentence2,Alias);
        return fn;
    }

    public static function FDIV(Sentence:ISentence,?val2:Float,?Sentence2:ISentence,?Alias:String):ISentence {
        var fn:Fn = new Fn(FnTypeEnum.FDIV, Sentence,val2,Sentence2,Alias);
        return fn;
    }

    public function RegisterQuery(CurrentSQL : ILang){
        this.CurrentSQL = cast(CurrentSQL, SQL);
        this.Sentence.RegisterQuery(CurrentSQL);
        if(this.Sentence2!=null)
            this.Sentence2.RegisterQuery(CurrentSQL);
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                switch(FnType){
                    case FnTypeEnum.FSUM:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FSUB:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FMULT:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FDIV:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " ");
							}
                        }
                }
            case DatabaseEngineEnum.MYSQL:
                switch(FnType){
                    case FnTypeEnum.FSUM:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FSUB:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FMULT:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FDIV:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " ");
							}
                        }
                }
            case DatabaseEngineEnum.ORACLE:
                switch(FnType){
                    case FnTypeEnum.FSUM:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FSUB:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FMULT:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FDIV:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " ");
							}
                        }
                }
            case DatabaseEngineEnum.POSTGRESQL:
                switch(FnType){
                    case FnTypeEnum.FSUM:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FSUB:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FMULT:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FDIV:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " ");
							}
                        }
                }
            case DatabaseEngineEnum.SQLSERVER:
                switch(FnType){
                    case FnTypeEnum.FSUM:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" + " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FSUB:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" - " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FMULT:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" * " + val2 + " ");
							}
                        }
                    case FnTypeEnum.FDIV:
                        if(Alias!=null){
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (val2 == null){
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / ");
								Sentence2.SCRIPT_PART();
								CurrentSQL.AddBlock(" ");
							}
                            else{
								
                                CurrentSQL.AddBlock(" ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(" / " + val2 + " ");
							}
                        }
                }
        }

    }
}
