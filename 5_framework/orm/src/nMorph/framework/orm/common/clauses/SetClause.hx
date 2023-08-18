package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.FromClause;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class SetClause implements IClause {

    private var CurrentSQL:SQL;
    private var Sets:Array<ISet>;

    public function new(CurrentSQL:SQL, Sets:Array<ISet>) {
        this.CurrentSQL = CurrentSQL;
        this.Sets = Sets;

        for(set in Sets){
            set.RegisterQuery(CurrentSQL);
        }
    }

    public function FROM(Source:ISource):FromClause {
        var fc = new FromClause(CurrentSQL, Source);
        CurrentSQL.AddClause(fc);
        return fc;
    }

    public function WHERE(Condition:ICondition):WhereClause {
        var wc:WhereClause = new WhereClause(CurrentSQL, Condition);
        CurrentSQL.AddClause(wc);
        return wc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                
                CurrentSQL.AddBlock("SET ");
                for (set in Sets) {
                    set.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                
            case DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("SET ");
                for (set in Sets) {
                    set.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
            case DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("SET ");
                for (set in Sets) {
                    set.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("SET ");
                for (set in Sets) {
                    set.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
            case DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("SET ");
                for (set in Sets) {
                    set.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
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
