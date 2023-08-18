package nMorph.framework.orm.common.sources;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.configuration.Configuration;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class ViewSource implements ISource {
    private var ViewName:String;
    private var CurrentSQL:SQL;

    public function new(ViewName:String) {
        this.ViewName = ViewName;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
    }

    public function SCRIPT_PART(?args:String) {
		
		var WithScheme = false;
		
		// Determina si en la cadena de conexión se determina un schema. En ese caso las tablas adoptan el schema
		
		var CurrentSchema = Configuration.Data.get_CurrentDatabaseConnection().Schema;
		if (CurrentSchema != null && CurrentSchema != "")
			WithScheme = true;
		
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                if (WithScheme)
					CurrentSQL.AddBlock(CurrentSchema + "." + ViewName);
				else
					CurrentSQL.AddBlock(ViewName);
            case DatabaseEngineEnum.MYSQL:
                if (WithScheme)
					CurrentSQL.AddBlock(CurrentSchema + "." + ViewName);
				else
					CurrentSQL.AddBlock(ViewName);
            case DatabaseEngineEnum.ORACLE:
                if (WithScheme)
					CurrentSQL.AddBlock(CurrentSchema + "." + ViewName);
				else
					CurrentSQL.AddBlock(ViewName);
            case DatabaseEngineEnum.POSTGRESQL:
                if (WithScheme)
					CurrentSQL.AddBlock(CurrentSchema + "." + ViewName);
				else
					CurrentSQL.AddBlock(ViewName);
            case DatabaseEngineEnum.SQLSERVER:
                if (WithScheme)
					CurrentSQL.AddBlock(CurrentSchema + "." + ViewName);
				else
					CurrentSQL.AddBlock(ViewName);
        }
    }
}
