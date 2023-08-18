package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.enums.UnionTypeEnum;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class OrderByClause implements IClause {

    private var CurrentSQL:SQL;
    private var OrderBySentences:Array<ISentence>;

    public function new(CurrentSQL:SQL, OrderBySentences:Array<ISentence>) {
        this.CurrentSQL = CurrentSQL;
        if(CurrentSQL==null){
            this.CurrentSQL = new SQL();
        }
        this.OrderBySentences = OrderBySentences;
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

        if (OrderBySentences == null) return;

        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                CurrentSQL.AddBlock("ORDER BY ");

// Itero y renderizo las sentencias de ordenamiento
                for (sentence in OrderBySentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (OrderBySentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("ORDER BY ");

// Itero y renderizo las sentencias de ordenamiento
                for (sentence in OrderBySentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (OrderBySentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("ORDER BY ");

// Itero y renderizo las sentencias de ordenamiento
                for (sentence in OrderBySentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (OrderBySentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("ORDER BY ");

// Itero y renderizo las sentencias de ordenamiento
                for (sentence in OrderBySentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (OrderBySentences.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);


            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("ORDER BY ");

// Itero y renderizo las sentencias de ordenamiento
                for (sentence in OrderBySentences) {
                    sentence.SCRIPT_PART();
                    CurrentSQL.AddBlock(", ");
                }

// quito la ultima coma
                if (OrderBySentences.length > 0)
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
