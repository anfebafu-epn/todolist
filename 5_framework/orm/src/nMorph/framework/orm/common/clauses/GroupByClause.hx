package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.OrderByClause;
import nMorph.framework.orm.common.clauses.UnionClause;
import nMorph.framework.orm.common.enums.UnionTypeEnum;
import nMorph.framework.orm.common.clauses.HavingClause;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

import nMorph.framework.orm.configuration.DatabaseEngineEnum;

@:keepSub @:rtti
class GroupByClause implements IClause {

    private var CurrentSQL:SQL;
    private var GroupSentences:Array<ISentence>;

    public function new(CurrentSQL:SQL, GroupSentences:Array<ISentence>) {
        this.CurrentSQL = CurrentSQL;
        this.GroupSentences = GroupSentences;
    }

    public function HAVING(HavingCondition:ICondition):HavingClause {
        var hc:HavingClause = new HavingClause(CurrentSQL, HavingCondition);
        CurrentSQL.AddClause(hc);
        return hc;
    }

    public function ORDERBY(OrderBySentences:Array<ISentence>):OrderByClause {
        var obc:OrderByClause = new OrderByClause(CurrentSQL, OrderBySentences);
        CurrentSQL.AddClause(obc);
        return obc;
    }

    public function UNION(UnionType:UnionTypeEnum, Clause:IClause):UnionClause {
        var uc:UnionClause = new UnionClause(CurrentSQL, UnionType, Clause);
        CurrentSQL.AddClause(uc);
        return uc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        if (GroupSentences == null) return;

        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock("GROUP BY ");

// Itero y renderizo las sentencias de agrupación
                for (sentence in GroupSentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (GroupSentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("GROUP BY ");

// Itero y renderizo las sentencias de agrupación
                for (sentence in GroupSentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (GroupSentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("GROUP BY ");

// Itero y renderizo las sentencias de agrupación
                for (sentence in GroupSentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (GroupSentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("GROUP BY ");

// Itero y renderizo las sentencias de agrupación
                for (sentence in GroupSentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (GroupSentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("GROUP BY ");

// Itero y renderizo las sentencias de agrupación
                for (sentence in GroupSentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (GroupSentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);
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

    public function ReadTable():QueryTable {
        return CurrentSQL.ReadTable();
    }

    public function Read<T>(cl:Class<T>, ?context:Context):Array<T> {
        return CurrentSQL.Read(cl, context);
    }

    public function ReadOne<T>(cl:Class<T>, ?context:Context):T {
        return CurrentSQL.ReadOne(cl, context);
    }
}
