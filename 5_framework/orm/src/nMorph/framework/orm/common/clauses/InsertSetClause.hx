package nMorph.framework.orm.common.clauses;


import nMorph.framework.orm.common.enums.ValuesTypeEnum;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;


@:keepSub @:rtti
class InsertSetClause implements IClause {

    private var CurrentSQL:SQL;
    private var Sets:Array<ISet>;
    private var ValuesType:ValuesTypeEnum;

    public function new(CurrentSQL:SQL, Sets:Array<ISet>, ValuesType:ValuesTypeEnum) {
        this.CurrentSQL = CurrentSQL;
        this.Sets = Sets;
        this.ValuesType = ValuesType;

        for (set in Sets) {
            set.RegisterQuery(CurrentSQL);
        }
    }

    public function SETS(Sets:Array<ISet>):InsertSetClause {
        var vc:InsertSetClause = new InsertSetClause(CurrentSQL, Sets, ValuesTypeEnum.ADDITIONALVALUES);
        CurrentSQL.AddClause(vc);
        return vc;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("( ");
                    for (set in Sets) {
                        set.SCRIPT_PART("ONLYFIELD");
						CurrentSQL.AddBlock(", ");
                    }
					if (Sets.length > 0){
						CurrentSQL.RemoveLastBlock();
					}
                    //if (Part.substr(Part.length - 2, 2) == ", ") {
                        //Part = Part.substr(0, Part.length - 2);
                    //}
                    CurrentSQL.AddBlock(") ");
                    CurrentSQL.AddBlock(" VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES) {
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("( ");
                for (set in Sets) {
                    set.SCRIPT_PART("ONLYVALUE");
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
                CurrentSQL.AddBlock(") ");
                
            case DatabaseEngineEnum.MYSQL:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("( ");
                    for (set in Sets) {
                        set.SCRIPT_PART("ONLYFIELD");
						CurrentSQL.AddBlock(", ");
                    }
					if (Sets.length > 0){
						CurrentSQL.RemoveLastBlock();
					}
                    //if (Part.substr(Part.length - 2, 2) == ", ") {
                        //Part = Part.substr(0, Part.length - 2);
                    //}
                    CurrentSQL.AddBlock(") ");
                    CurrentSQL.AddBlock(" VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES) {
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("( ");
                for (set in Sets) {
                    set.SCRIPT_PART("ONLYVALUE");
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
                CurrentSQL.AddBlock(") ");
                
            case DatabaseEngineEnum.ORACLE:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("( ");
                    for (set in Sets) {
                        set.SCRIPT_PART("ONLYFIELD");
						CurrentSQL.AddBlock(", ");
                    }
					if (Sets.length > 0){
						CurrentSQL.RemoveLastBlock();
					}
                    //if (Part.substr(Part.length - 2, 2) == ", ") {
                        //Part = Part.substr(0, Part.length - 2);
                    //}
                    CurrentSQL.AddBlock(") ");
                    CurrentSQL.AddBlock(" VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES) {
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("( ");
                for (set in Sets) {
                    set.SCRIPT_PART("ONLYVALUE");
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
                CurrentSQL.AddBlock(") ");
                
            case DatabaseEngineEnum.POSTGRESQL:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("( ");
                    for (set in Sets) {
                        set.SCRIPT_PART("ONLYFIELD");
						CurrentSQL.AddBlock(", ");
                    }
					if (Sets.length > 0){
						CurrentSQL.RemoveLastBlock();
					}
                    //if (Part.substr(Part.length - 2, 2) == ", ") {
                        //Part = Part.substr(0, Part.length - 2);
                    //}
                    CurrentSQL.AddBlock(") ");
                    CurrentSQL.AddBlock(" VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES) {
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("( ");
                for (set in Sets) {
                    set.SCRIPT_PART("ONLYVALUE");
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
                //if (Part.substr(Part.length - 2, 2) == ", ") {
                    //Part = Part.substr(0, Part.length - 2);
                //}
                CurrentSQL.AddBlock(") ");
                
            case DatabaseEngineEnum.SQLSERVER:
                if (ValuesType == ValuesTypeEnum.STARTVALUES) {
                    CurrentSQL.AddBlock("( ");
                    for (set in Sets) {
                        set.SCRIPT_PART("ONLYFIELD");
						CurrentSQL.AddBlock(", ");
                    }
					if (Sets.length > 0){
						CurrentSQL.RemoveLastBlock();
					}
                    //if (Part.substr(Part.length - 2, 2) == ", ") {
                        //Part = Part.substr(0, Part.length - 2);
                    //}
                    CurrentSQL.AddBlock(") ");
                    CurrentSQL.AddBlock(" VALUES ");
                }
                else if (ValuesType == ValuesTypeEnum.ADDITIONALVALUES) {
                    CurrentSQL.AddBlock(",");
                }

                CurrentSQL.AddBlock("( ");
                for (set in Sets) {
                    set.SCRIPT_PART("ONLYVALUE");
					CurrentSQL.AddBlock(", ");
                }
				if (Sets.length > 0){
					CurrentSQL.RemoveLastBlock();
				}
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

    public function Queue(queue:Array<QueueItem>):Array<QueueItem> {
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
