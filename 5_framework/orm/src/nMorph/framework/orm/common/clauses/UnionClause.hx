package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.common.enums.UnionTypeEnum;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class UnionClause implements IClause {

    private var UnionType:UnionTypeEnum;
    private var InnerClause:IClause;

    private var CurrentSQL:SQL;

    public function new(CurrentSQL:SQL, UnionType:UnionTypeEnum, InnerClause:IClause) {
        this.UnionType = UnionType;
        this.InnerClause = InnerClause;
        this.CurrentSQL = CurrentSQL;
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

        switch(CurrentSQL.getCurrentEngine()){
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
                var Part = "";

                switch(UnionType)
                {
                    case UnionTypeEnum.UNION:
                        Part += " UNION (";
                        Part += InnerClause.SCRIPT();
                        Part += ") ";
                }
                CurrentSQL.AddBlock(Part);
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                var Part = "";

                switch(UnionType)
                {
                    case UnionTypeEnum.UNION:
                        Part += " UNION (";
                        Part += InnerClause.SCRIPT();
                        Part += ") ";
                }
                CurrentSQL.AddBlock(Part);
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                var Part = "";

                switch(UnionType)
                {
                    case UnionTypeEnum.UNION:
                        Part += " UNION (";
                        Part += InnerClause.SCRIPT();
                        Part += ") ";
                }
                CurrentSQL.AddBlock(Part);
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                var Part = "";

                switch(UnionType)
                {
                    case UnionTypeEnum.UNION:
                        Part += " UNION (";
                        Part += InnerClause.SCRIPT();
                        Part += ") ";
                }
                CurrentSQL.AddBlock(Part);
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                var Part = "";

                switch(UnionType)
                {
                    case UnionTypeEnum.UNION:
                        Part += " UNION (";
                        Part += InnerClause.SCRIPT();
                        Part += ") ";
                }
                CurrentSQL.AddBlock(Part);
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
