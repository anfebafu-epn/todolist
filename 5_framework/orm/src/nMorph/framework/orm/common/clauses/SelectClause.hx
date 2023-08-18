package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.FromClause;
import nMorph.framework.orm.common.enums.LimitTypeEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class SelectClause implements IClause {

    private var CurrentSQL:SQL;
    private var Sentences:Array<ISentence> = new Array<ISentence>();

    public function new(CurrentSQL:SQL, Sentences:Array<ISentence>) {
        this.CurrentSQL = CurrentSQL;
        this.Sentences = Sentences;
		
        for (s in Sentences) {
            s.RegisterQuery(CurrentSQL);
        }
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
                CurrentSQL.AddBlock("SELECT ");
				CurrentSQL.AddBlock("{{TopBlock}}");

                if (Sentences.length == 0) {
                    CurrentSQL.AddBlock("* ");
                }
                else {
                    for (sentence in Sentences) {
                        sentence.SCRIPT_PART();
                        CurrentSQL.AddBlock(", ");
                    }

					if (Sentences.length > 0)
						CurrentSQL.RemoveLastBlock();
                    //if (Part.substr(Part.length - 2, 2) == ", ")
                        //Part = Part.substr(0, Part.length - 2);
                }

            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                CurrentSQL.AddBlock("SELECT ");
				CurrentSQL.AddBlock("{{TopBlock}}");

                if (Sentences.length == 0) {
                    CurrentSQL.AddBlock("* ");
                }
                else {
                    for (sentence in Sentences) {
                        sentence.SCRIPT_PART();
                        CurrentSQL.AddBlock(", ");
                    }

					if (Sentences.length > 0)
						CurrentSQL.RemoveLastBlock();
                    //if (Part.substr(Part.length - 2, 2) == ", ")
                        //Part = Part.substr(0, Part.length - 2);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                CurrentSQL.AddBlock("SELECT ");
				CurrentSQL.AddBlock("{{TopBlock}}");

                if (Sentences.length == 0) {
                    CurrentSQL.AddBlock("* ");
                }
                else {
                    for (sentence in Sentences) {
                        sentence.SCRIPT_PART();
                        CurrentSQL.AddBlock(", ");
                    }

					if (Sentences.length > 0)
						CurrentSQL.RemoveLastBlock();
                    //if (Part.substr(Part.length - 2, 2) == ", ")
                        //Part = Part.substr(0, Part.length - 2);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                CurrentSQL.AddBlock("SELECT ");
				CurrentSQL.AddBlock("{{TopBlock}}");

                if (Sentences.length == 0) {
                    CurrentSQL.AddBlock("* ");
                }
                else {
                    for (sentence in Sentences) {
                        sentence.SCRIPT_PART();
                        CurrentSQL.AddBlock(", ");
                    }

					if (Sentences.length > 0)
						CurrentSQL.RemoveLastBlock();
                    //if (Part.substr(Part.length - 2, 2) == ", ")
                        //Part = Part.substr(0, Part.length - 2);
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                CurrentSQL.AddBlock("SELECT ");
				CurrentSQL.AddBlock("{{TopBlock}}");

                if (Sentences.length == 0) {
                    CurrentSQL.AddBlock("* ");
                }
                else {
                    for (sentence in Sentences) {
                        sentence.SCRIPT_PART();
                        CurrentSQL.AddBlock(", ");
                    }

					if (Sentences.length > 0)
						CurrentSQL.RemoveLastBlock();
                    //if (Part.substr(Part.length - 2, 2) == ", ")
                        //Part = Part.substr(0, Part.length - 2);
                }
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
