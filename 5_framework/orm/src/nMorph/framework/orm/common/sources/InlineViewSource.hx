package nMorph.framework.orm.common.sources;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class InlineViewSource implements ISource {

    private var Clauses:IClause;
    private var Alias:String;
    private var CurrentSQL : SQL;

    public function new(Clauses:IClause, Alias:String) {
        this.Clauses = Clauses;
        this.Alias = Alias;
    }

    public static function SET(Clauses:IClause, Alias:String):InlineViewSource {
        var ivs:InlineViewSource = new InlineViewSource(Clauses, Alias);
        return ivs;
    }

    public function RegisterQuery(CurrentSQL:ILang){
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock("(" + Clauses.SCRIPT() + ") as " + Alias);
            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("(" + Clauses.SCRIPT() + ") as " + Alias);
            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("(" + Clauses.SCRIPT() + ") as " + Alias);
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("(" + Clauses.SCRIPT() + ") as " + Alias);
            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("(" + Clauses.SCRIPT() + ") as " + Alias);
        }
    }
}
