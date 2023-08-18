package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ExistClause implements IClause {

    private var CurrentSQL:SQL;
    private var TableName:String;

    public function new(CurrentSQL:SQL, TableName:String) {
        this.CurrentSQL = CurrentSQL;
        this.TableName = TableName;
    }

    public function SCRIPT():String {
        return CurrentSQL.GenerateAll();
    }

    public function SCRIPT_PART(?args:String):String {
        var Part = "";

        switch(CurrentSQL.getCurrentEngine()){
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

        return Part;
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
        ExceptionHelper.LogicException(1, "Not Valid Method");
        return null;
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
