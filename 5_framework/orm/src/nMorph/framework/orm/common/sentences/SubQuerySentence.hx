package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;



@:keepSub @:rtti
class SubQuerySentence implements ISentence {

    private var CurrentSQL:SQL;
    private var InnerClause:IClause;

    public function new(InnerClause:IClause) {
        this.InnerClause = InnerClause;
    }

    public function IsNullValue():Bool{
        return false;
    }

    public static function SET(InnerClause:IClause):ISentence {
        var sqs:SubQuerySentence = new SubQuerySentence(InnerClause);
        return sqs;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock("(" + InnerClause.SCRIPT() + ")");
            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("(" + InnerClause.SCRIPT() + ")");
            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("(" + InnerClause.SCRIPT() + ")");
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("(" + InnerClause.SCRIPT() + ")");
            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("(" + InnerClause.SCRIPT() + ")");
        }
    }
}
