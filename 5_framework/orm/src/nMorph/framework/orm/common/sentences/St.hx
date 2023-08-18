package nMorph.framework.orm.common.sentences;

import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.StTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;


@:keepSub @:rtti
class St implements ISentence {
    private var StType:StTypeEnum;
    private var Sentence:ISentence;
    private var CurrentSQL:SQL;
    private var Alias:String;
    private var First:String;//primer parametro de funciones Str
    private var Last:String;//segundo parametro de funciones Str
    private var Index:Null<Int>;//parametro para busquedas a partir de un indice
    private var Length:Null<Int>;//parametro ingresar longitud de cadena

    public function new(StType:StTypeEnum,Sentence:ISentence,?First,?Last,?Index:Int,?Length:Int,?Alias:String) {
        this.StType = StType;
        this.Sentence = Sentence;

        this.Alias=Alias;
        this.First=First;
        this.Last=Last;
        this.Index=Index;
        this.Length=Length;
    }

    public function IsNullValue():Bool{
        return false;
    }

    public static function LENGTH(Sentence:ISentence,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.LENGTH,Sentence,null,null,null,null,Alias);
        return st;
    }

    public static function CONCAT(Sentence:ISentence,OtherStr:String,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.CONCAT,Sentence,OtherStr,null,null,null,Alias);
        return st;
    }

    public static function REPLACE(Sentence:ISentence,First:String,Last:String,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.REPLACE,Sentence,First,Last,null,null,Alias);
        return st;
    }
    public static function LOCATE(Sentence:ISentence,Search:String,?Index:Int,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.LOCATE,Sentence,Search,null,Index,null,Alias);
        return st;
    }
    public static function SUBSTRING(Sentence:ISentence,Index:Int,Length:Int,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.SUBSTRING,Sentence,null,null,Index,Length,Alias);
        return st;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
        if (this.Sentence != null) {
            this.Sentence.RegisterQuery(CurrentSQL);
        }
    }

    public static function LOWER(Sentence:ISentence,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.LOWER,Sentence,null,null,null,null,Alias);
        return st;
    }

    public static function UPPER(Sentence:ISentence,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.UPPER,Sentence,null,null,null,null,Alias);
        return st;
    }

    public static function TRIM(Sentence:ISentence,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.TRIM,Sentence,null,null,null,null,Alias);
        return st;
    }

    public static function REVERSE(Sentence:ISentence,?Alias:String):ISentence {
        var st:St = new St(StTypeEnum.REVERSE,Sentence,null,null,null,null,Alias);
        return st;
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                switch(StType){
                    case StTypeEnum.LENGTH:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.CONCAT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') ");
						}

                    case StTypeEnum.LOCATE:
                        if(Alias!=null){
                            if (Index != null){
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART(); 
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Index != null){
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART(); 
								CurrentSQL.AddBlock(") ");
							}
                        }
                    case StTypeEnum.REPLACE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(",'" + First + "\",\"" + Last + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "\",\"" + Last + "') ");
						}
                    case StTypeEnum.SUBSTRING:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("SUBSTRING(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Index + "," + Length + ") AS \"" + Alias + "\" ");
						}
                        else{
							
							CurrentSQL.AddBlock("SUBSTRING(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("," + Index + "," + Length + ") ");
						}
                    case StTypeEnum.LOWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else {
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.UPPER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.TRIM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.REVERSE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                }
            case DatabaseEngineEnum.MYSQL:
                switch(StType){
                    case StTypeEnum.LENGTH:
                        if (Alias != null)
						{
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.CONCAT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') ");
						}

                    case StTypeEnum.REPLACE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') ");
						}
                    case StTypeEnum.LOCATE:
                        if(Alias!=null){
                            if (Index != null){
								
                                CurrentSQL.AddBlock("LOCATE('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("LOCATE('" + First + "'," );
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Index != null){
								
                                CurrentSQL.AddBlock("LOCATE('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("LOCATE('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") ");
							}
                        }
                    case StTypeEnum.SUBSTRING:
                        if(Alias!=null){
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART(); 
								CurrentSQL.AddBlock("," + Index + "," + Length + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                        }
                    case StTypeEnum.LOWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.UPPER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.TRIM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.REVERSE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                }
            case DatabaseEngineEnum.ORACLE:
                switch(StType){
                    case StTypeEnum.LENGTH:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.CONCAT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') ");
						}

                    case StTypeEnum.REPLACE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') ");
						}
                    case StTypeEnum.LOCATE:
                        if(Alias!=null){
                            if (Index != null){
								
                                CurrentSQL.AddBlock("INSTR('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("INSTR('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Index != null){
								
                                CurrentSQL.AddBlock("INSTR('" + First + "',"); 
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("INSTR('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") ");
							}
                        }
                    case StTypeEnum.SUBSTRING:
                        if(Alias!=null){
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTR("); 
								Sentence.SCRIPT_PART(); 
								CurrentSQL.AddBlock("," + Index + "," + Length + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTR(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTR(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTR(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                        }
                    case StTypeEnum.LOWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.UPPER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.TRIM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.REVERSE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                }
            case DatabaseEngineEnum.POSTGRESQL:
                switch(StType){
                    case StTypeEnum.LENGTH:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.CONCAT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(",'" + First + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') ");
						}

                    case StTypeEnum.REPLACE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') ");
						}
                    case StTypeEnum.LOCATE:
                        if(Alias!=null){
                            if (Index != null){
								
                                CurrentSQL.AddBlock("POSITION('" + First + "' IN ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("POSITION('" + First + "' IN ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Index != null){
								
                                CurrentSQL.AddBlock("POSITION('" + First + "' IN ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("POSITION('" + First + "' IN ");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") ");
							}
                        }
                    case StTypeEnum.SUBSTRING:
                        if(Alias!=null){
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING("); 
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                        }
                    case StTypeEnum.LOWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.UPPER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.TRIM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("TRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.REVERSE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                }
            case DatabaseEngineEnum.SQLSERVER:
                switch(StType){
                    case StTypeEnum.LENGTH:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("DATALENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("DATALENGTH(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.CONCAT:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("CONCAT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "') ");
						}
                    case StTypeEnum.REPLACE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REPLACE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",'" + First + "','" + Last + "') ");
						}
                    case StTypeEnum.LOCATE:
                        if(Alias!=null){
                            if (Index != null)
							{
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "'," );
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Index != null){
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("CHARINDEX('" + First + "',");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock(") ");
							}
                        }
                    case StTypeEnum.SUBSTRING:
                        if(Alias!=null){
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") AS \"" + Alias + "\" ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") AS \"" + Alias + "\" ");
							}
                        }
                        else{
                            if (Length != null){
								
                                CurrentSQL.AddBlock("SUBSTRING(");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + "," + Length + ") ");
							}
                            else{
								
                                CurrentSQL.AddBlock("SUBSTRING()");
								Sentence.SCRIPT_PART();
								CurrentSQL.AddBlock("," + Index + ") ");
							}
                        }
                    case StTypeEnum.LOWER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LOWER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.UPPER:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("UPPER(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                    case StTypeEnum.TRIM:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("LTRIM(RTRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(")) AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("LTRIM(RTRIM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(")) ");
						}
                    case StTypeEnum.REVERSE:
                        if (Alias != null){
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
                        else{
							
                            CurrentSQL.AddBlock("REVERSE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
                }
        }
    }
}
