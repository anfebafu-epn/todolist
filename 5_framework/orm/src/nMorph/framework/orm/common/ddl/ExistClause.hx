package nMorph.framework.orm.common.ddl;

import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ExistClause implements IClause {

    private var CurrentDDL:DDL;
    private var TableName:String;

    public function new(CurrentDDL:DDL, TableName:String) {
        this.CurrentDDL = CurrentDDL;
        this.TableName = TableName;
    }

    public function SCRIPT():String {
        return CurrentDDL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String) {
        var Part = "";

        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                Part += "SELECT COUNT(CAST(table_name as varchar)) AS EXIST "+
                        "FROM INFORMATION_SCHEMA.TABLES WHERE  table_name= '";
                Part += TableName+"'";

            case DatabaseEngineEnum.MYSQL:
                Part += "SELECT count(*) AS EXIST "+
                        "FROM information_schema.tables "+
                        "WHERE table_name = '";
                Part+=TableName+"'";

            case DatabaseEngineEnum.ORACLE:
                Part += "select count(*) AS EXIST "+
                        "from all_tables "+
                        "where table_name= ('";
                Part+= TableName+"')";

            case DatabaseEngineEnum.POSTGRESQL:
                Part += "SELECT ";

            case DatabaseEngineEnum.SQLSERVER:
                Part += "SELECT COUNT(*) AS EXIST "+
                        "FROM information_schema.tables "+
                        "WHERE table_name='";
                Part +=TableName+"'";
        }

        CurrentDDL.AddBlock(Part);
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
