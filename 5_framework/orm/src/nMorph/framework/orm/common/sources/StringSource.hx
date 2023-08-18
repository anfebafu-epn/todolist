package nMorph.framework.orm.common.sources;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class StringSource implements ISource {
    private var ObjectName:String;
    private var CurrentSQL : SQL;

    public function new(ObjectName:String) {
        this.ObjectName = ObjectName;
    }

    public static function SET(ObjectName:String) : ISource{
        var sc : StringSource = new StringSource(ObjectName);
        return sc;
    }

    public function RegisterQuery(CurrentSQL:ILang){
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock(ObjectName);
            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock(ObjectName);
            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock(ObjectName);
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock(ObjectName);
            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock(ObjectName);
        }
    }
}
