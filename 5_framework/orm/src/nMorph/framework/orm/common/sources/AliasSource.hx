package nMorph.framework.orm.common.sources;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class AliasSource implements ISource {

    @:isVar private  var Alias(get, set):String;
    @:isVar private  var CurrentSQL : SQL;
    @:isVar private  var InnerSource(get, set):ISource;


    function get_Alias():String {
        return Alias;
    }

    function set_Alias(value:String) {
        return this.Alias = value;
    }

    function get_InnerSource():ISource {
        return InnerSource;
    }

    function set_InnerSource(value:ISource) {
        return this.InnerSource = value;
    }

    public function new(Alias :String, InnerSource:ISource) {
        this.Alias = Alias;
        this.InnerSource = InnerSource;
    }
    public function SCRIPT_PART(?args:String)
    {
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
				InnerSource.SCRIPT_PART(args);
                CurrentSQL.AddBlock(" as " + Alias);
            case DatabaseEngineEnum.MYSQL:
				InnerSource.SCRIPT_PART(args);
                CurrentSQL.AddBlock(" as " + Alias);
            case DatabaseEngineEnum.ORACLE:
				InnerSource.SCRIPT_PART(args);
                CurrentSQL.AddBlock(" as " + Alias);
            case DatabaseEngineEnum.POSTGRESQL:
				InnerSource.SCRIPT_PART(args);
                CurrentSQL.AddBlock(" as " + Alias);
            case DatabaseEngineEnum.SQLSERVER:
				InnerSource.SCRIPT_PART(args);
                CurrentSQL.AddBlock(" as " + Alias);
        }
    }
    public function RegisterQuery(CurrentSQL : ILang) : Void
    {
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }
}
