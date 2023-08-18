package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.common.clauses.FromClause;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class DeleteClause implements IClause {

    private var CurrentSQL:SQL;
    
    public function new(CurrentSQL:SQL) {
        this.CurrentSQL = CurrentSQL;
        //DeleteSource.RegisterQuery(CurrentSQL);
    }

    public function FROM(Source:ISource):FromClause {
        var fc = new FromClause(CurrentSQL, Source);
        CurrentSQL.AddClause(fc);
        return fc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine()){
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
				CurrentSQL.AddBlock("DELETE ");
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("DELETE ");
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("DELETE ");
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("DELETE ");
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("DELETE ");
        }
    }

    public function Execute():Dynamic {
        return CurrentSQL.Execute();
    }

    public function Register(context:Context):Void {
        context.Queue = CurrentSQL.Queue(context.Queue);
    }

    public function Queue(queue: Array<QueueItem>): Array<QueueItem>{
        return CurrentSQL.Queue(queue);
    }
	
	public function Bulk(bulk: BulkRun):BulkRun {
        bulk.queue = CurrentSQL.Queue(bulk.queue);
        return bulk;
    }

    public function ReadValue():Dynamic {
        return CurrentSQL.ReadValue();
    }

    public function ReadTable():QueryTable{
        return CurrentSQL.ReadTable();
    }

    public function Read<T>(cl:Class<T>, ?context:Context):Array<T> {
        return CurrentSQL.Read(cl, context);
    }

    public function ReadOne<T>(cl:Class<T>, ?context:Context):T {
        return CurrentSQL.ReadOne(cl, context);
    }
}
