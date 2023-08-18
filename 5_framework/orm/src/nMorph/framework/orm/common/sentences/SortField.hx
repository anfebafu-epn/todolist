package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.common.enums.SortTypeEnum;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.FnTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class SortField implements ISentence {

    private var Sentence:ISentence;
	private var SortDirection:SortTypeEnum;
	private var CurrentSQL :SQL;
	
    
    public function new(Sentence:ISentence, SortDirection:SortTypeEnum ) {
        this.Sentence = Sentence;
		this.SortDirection = SortDirection;
    }
	
    public function IsNullValue():Bool{
        return false;
    }
	
	public function RegisterQuery(CurrentSQL : ILang){
        this.CurrentSQL = CurrentSQL;
        this.Sentence.RegisterQuery(CurrentSQL);
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                switch(SortDirection){
                    case SortTypeEnum.ASC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "ASC ");
					case SortTypeEnum.DESC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "DESC ");
                }
            case DatabaseEngineEnum.MYSQL:
                switch(SortDirection){
                    case SortTypeEnum.ASC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "ASC ");
					case SortTypeEnum.DESC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "DESC ");
                }
            case DatabaseEngineEnum.ORACLE:
                switch(SortDirection){
                    case SortTypeEnum.ASC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "ASC ");
					case SortTypeEnum.DESC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "DESC ");
                }
            case DatabaseEngineEnum.POSTGRESQL:
                switch(SortDirection){
                    case SortTypeEnum.ASC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "ASC ");
					case SortTypeEnum.DESC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "DESC ");
                }
            case DatabaseEngineEnum.SQLSERVER:
                switch(SortDirection){
                    case SortTypeEnum.ASC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "ASC ");
					case SortTypeEnum.DESC:
						CurrentSQL.AddBlock(Sentence.SCRIPT_PART() + "DESC ");
                }
        }

    }
}