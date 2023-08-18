package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.ValuesTypeEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ValuesClause implements IClause {
    private var CurrentSQL:SQL;
    private var Values:Array<ISentence>;
    private var ValuesType:ValuesTypeEnum;

    public function new(CurrentSQL:SQL, Values:Array<ISentence>, ValuesType:ValuesTypeEnum) {
        this.CurrentSQL = CurrentSQL;
        this.Values = Values;
        this.ValuesType = ValuesType;

        for(val in Values){
            val.RegisterQuery(CurrentSQL);
        }
    }

    public function VALUES(Values:Array<ISentence>):ValuesClause {
        var vc:ValuesClause = new ValuesClause(CurrentSQL, Values, ValuesTypeEnum.ADDITIONALVALUES);
        CurrentSQL.AddClause(vc);
        return vc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        if (Values == null) return;

        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                

                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES){
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("(");

                for (value in Values) {
                    value.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }

				if (Values.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(")");
                
            case DatabaseEngineEnum.MYSQL:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES){
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("(");

                for (value in Values) {
                    value.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }

				if (Values.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(")");
                
            case DatabaseEngineEnum.ORACLE:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES){
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("(");

                for (value in Values) {
                    value.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }

				if (Values.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(")");
                
            case DatabaseEngineEnum.POSTGRESQL:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES){
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("(");

                for (value in Values) {
                    value.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }

				if (Values.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(")");
                
            case DatabaseEngineEnum.SQLSERVER:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES){
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("(");

                for (value in Values) {
                    value.SCRIPT_PART();
					CurrentSQL.AddBlock(", ");
                }

				if (Values.length > 0)
					CurrentSQL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}

                CurrentSQL.AddBlock(")");
                
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
