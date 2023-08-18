package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class DropConstraintClause implements IClause {

    private var CurrentDDL:DDL;
    private var ConstraintName:String;

    public function new(CurrentDDL:DDL, ConstraintName:String) {
        this.CurrentDDL = CurrentDDL;
        this.ConstraintName = ConstraintName;
    }

    public function SCRIPT_PART(?args:String) {
        
        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                CurrentDDL.AddBlock("DROP CONSTRAINT " + ConstraintName + " ");
            case DatabaseEngineEnum.MYSQL:
                CurrentDDL.AddBlock("DROP CONSTRAINT " + ConstraintName + " ");
            case DatabaseEngineEnum.ORACLE:
                CurrentDDL.AddBlock("DROP CONSTRAINT " + ConstraintName + " ");
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentDDL.AddBlock("DROP CONSTRAINT " + ConstraintName + " ");
            case DatabaseEngineEnum.SQLSERVER:
                CurrentDDL.AddBlock("DROP CONSTRAINT " + ConstraintName + " ");
        }
        
    }

    public function SCRIPT():String {
        return CurrentDDL.GenerateAll();
    }

    public function Execute():Dynamic {
        return CurrentDDL.Execute();
    }

    public function Register(context:Context):Void {
        ExceptionHelper.LogicException(1, "Not Valid Method");
    }

    public function Queue(queue:Array<QueueItem>):Array<QueueItem> {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }
	
	public function Bulk(bulk: BulkRun):BulkRun {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }

    public function ReadValue():Dynamic {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }

    public function ReadTable():QueryTable {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }

    public function Read<T>(cl:Class<T>, ?context:Context):Array<T> {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }

    public function ReadOne<T>(cl:Class<T>, ?context:Context):T {
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
    }
}
