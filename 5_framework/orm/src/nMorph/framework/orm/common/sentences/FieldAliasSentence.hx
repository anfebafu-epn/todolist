package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.common.sources.TableSource;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class FieldAliasSentence implements ISentence {

    private var TableAlias : String;
    private var InnerField : FieldSentence;

    private var CurrentSQL :SQL;

    public function new(TableAlias : String, InnerField : FieldSentence) {
        this.TableAlias = TableAlias;
        this.InnerField = InnerField;
    }

    public function IsNullValue():Bool{
        return false;
    }

    public static function SET(TableAlias : String, InnerField : FieldSentence) : FieldAliasSentence{
        var fas : FieldAliasSentence = new FieldAliasSentence(TableAlias, InnerField);
        return fas;
    }


    public function RegisterQuery(CurrentSQL : ILang){
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock(TableAlias + ".");
				InnerField.SCRIPT_PART("ONLYNAME");
            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock(TableAlias + ".");
				InnerField.SCRIPT_PART("ONLYNAME");
            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock(TableAlias + ".");
				InnerField.SCRIPT_PART("ONLYNAME");
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock(TableAlias + ".");
				InnerField.SCRIPT_PART("ONLYNAME");
            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock(TableAlias + ".");
				InnerField.SCRIPT_PART("ONLYNAME");
        }
    }
}
