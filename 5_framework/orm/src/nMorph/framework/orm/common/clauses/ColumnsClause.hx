package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.SelectClause;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.ValuesTypeEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ColumnsClause implements IClause {

    private var CurrentSQL:SQL;
    private var Columns:Array<FieldSentence>;

    public function new(CurrentSQL:SQL, Columns:Array<FieldSentence>) {
        this.CurrentSQL = CurrentSQL;
        this.Columns = Columns;
        for (col in Columns) {
            col.RegisterQuery(CurrentSQL);
        }
    }

    public function VALUES(Values:Array<ISentence>):ValuesClause {
        var vc:ValuesClause = new ValuesClause(CurrentSQL, Values, ValuesTypeEnum.STARTVALUES);
        CurrentSQL.AddClause(vc);
        return vc;
    }

    public function SELECT(Sentences:Array<ISentence>):SelectClause {
        var innerQuery:SQL = new SQL();
        var innerModel:SelectClause = new SelectClause(innerQuery, Sentences);
        innerQuery.AddClause(innerModel);
        return innerModel;
    }


    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                
                CurrentSQL.AddBlock("(");

                for (column in Columns) {
                    column.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(", ");
                }

				if (Columns.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(") ");
            case DatabaseEngineEnum.MYSQL:

                CurrentSQL.AddBlock("(");

                for (column in Columns) {
                    column.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(", ");
                }

				if (Columns.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(") ");
            case DatabaseEngineEnum.ORACLE:

                CurrentSQL.AddBlock("(");

                for (column in Columns) {
                    column.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(", ");
                }

				if (Columns.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(") ");
            case DatabaseEngineEnum.POSTGRESQL:

                CurrentSQL.AddBlock("(");

                for (column in Columns) {
                    column.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(", ");
                }

				if (Columns.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(") ");
            case DatabaseEngineEnum.SQLSERVER:

                CurrentSQL.AddBlock("(");

                for (column in Columns) {
                    column.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(", ");
                }

				if (Columns.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(") ");
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
