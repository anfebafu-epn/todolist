package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.common.clauses.ColumnsClause;
import nMorph.framework.orm.common.clauses.InsertSetClause;
import nMorph.framework.orm.common.clauses.SelectClause;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.enums.ValuesTypeEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class InsertIntoClause implements IClause {

    private var CurrentSQL:SQL;
    private var Into:ISource;

    public function new(CurrentSQL:SQL, Into:ISource) {
        this.CurrentSQL = CurrentSQL;
        this.Into = Into;
        Into.RegisterQuery(CurrentSQL);
    }

    public function COLUMNS(Columns:Array<FieldSentence>):ColumnsClause {
        var cc:ColumnsClause = new ColumnsClause(CurrentSQL, Columns);
        CurrentSQL.AddClause(cc);
        return cc;
    }

    public function VALUES(Values:Array<ISentence>):ValuesClause {
        var vc:ValuesClause = new ValuesClause(CurrentSQL, Values, ValuesTypeEnum.STARTVALUES);
        CurrentSQL.AddClause(vc);
        return vc;
    }

    public function SETS(Sets:Array<ISet>):InsertSetClause {
        var vc:InsertSetClause = new InsertSetClause(CurrentSQL, Sets, ValuesTypeEnum.STARTVALUES);
        CurrentSQL.AddClause(vc);
        return vc;
    }

    public function SELECT(Sentences:Array<ISentence>):SelectClause {
        var sc:SelectClause = new SelectClause(CurrentSQL, Sentences);
        CurrentSQL.AddClause(sc);
        return sc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine()){
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock("INSERT INTO ");
				Into.SCRIPT_PART();
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("INSERT INTO ");
				Into.SCRIPT_PART();
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("INSERT INTO ");
				Into.SCRIPT_PART();
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("INSERT INTO ");
				Into.SCRIPT_PART();
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("INSERT INTO ");
				Into.SCRIPT_PART();
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
