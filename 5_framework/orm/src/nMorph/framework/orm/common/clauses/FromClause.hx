package nMorph.framework.orm.common.clauses;


import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.GroupByClause;
import nMorph.framework.orm.common.clauses.JoinClause;
import nMorph.framework.orm.common.clauses.OrderByClause;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.UnionTypeEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.enums.JoinTypeEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class FromClause implements IClause {

    private var CurrentSQL:SQL;
    private var Source:ISource;

    public function new(CurrentSQL:SQL, Source:ISource) {
        this.CurrentSQL = CurrentSQL;
        this.Source = Source;
        this.Source.RegisterQuery(CurrentSQL);
    }

    public function INNERJOIN(Source:ISource, OnCondition:ICondition):JoinClause {
        var jc = new JoinClause(CurrentSQL, Source, OnCondition, JoinTypeEnum.INNERJOIN);
        OnCondition.RegisterQuery(CurrentSQL);
        CurrentSQL.AddClause(jc);
        return jc;
    }

    public function LEFTJOIN(Source:ISource, OnCondition:ICondition):JoinClause {
        var jc = new JoinClause(CurrentSQL, Source, OnCondition, JoinTypeEnum.LEFTJOIN);
        CurrentSQL.AddClause(jc);
        return jc;
    }

    public function RIGHTJOIN(Source:ISource, OnCondition:ICondition):JoinClause {
        var jc = new JoinClause(CurrentSQL, Source, OnCondition, JoinTypeEnum.RIGHTJOIN);
        CurrentSQL.AddClause(jc);
        return jc;
    }

    public function UNION(UnionType:UnionTypeEnum, Clause:IClause):UnionClause {
        var uc:UnionClause = new UnionClause(CurrentSQL, UnionType, Clause);
        CurrentSQL.AddClause(uc);
        return uc;
    }

    public function WHERE(Condition:ICondition):WhereClause {
        var wc:WhereClause = new WhereClause(CurrentSQL, Condition);
        CurrentSQL.AddClause(wc);
        return wc;
    }

    public function GROUPBY(GroupSentences:Array<ISentence>):GroupByClause {
        var gbc:GroupByClause = new GroupByClause(CurrentSQL, GroupSentences);
        CurrentSQL.AddClause(gbc);
        return gbc;
    }

    public function ORDERBY(OrderBySentences:Array<ISentence>):OrderByClause {
        var obc:OrderByClause = new OrderByClause(CurrentSQL, OrderBySentences);
        CurrentSQL.AddClause(obc);
        return obc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        CurrentSQL.AddBlock("FROM ");

        switch(CurrentSQL.getCurrentEngine())
        {
            case DatabaseEngineEnum.GENERIC:
                Source.SCRIPT_PART();
            case DatabaseEngineEnum.MYSQL:
                Source.SCRIPT_PART();
            case DatabaseEngineEnum.ORACLE:
                Source.SCRIPT_PART();
            case DatabaseEngineEnum.POSTGRESQL:
                Source.SCRIPT_PART();
            case DatabaseEngineEnum.SQLSERVER:
                Source.SCRIPT_PART();
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
