package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.common.enums.ChangeTypeEnum;
import nMorph.framework.orm.common.ddl.AddPrimaryKeyClause;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class AlterTableClause implements IClause {

    private var CurrentDDL:DDL;
    private var TableName:String;
    private var ChangeType:ChangeTypeEnum;
    private var TableOldName:String;

    public function new(CurrentDDL:DDL, ?TableName:String) {
        this.CurrentDDL = CurrentDDL;
        if(TableName!=null)
            this.TableName = TableName;
    }

    public function ADDCOLUMN(Column:IColumnDefinition):AddColumnClause {
        var acc:AddColumnClause = new AddColumnClause(CurrentDDL, Column);
        CurrentDDL.AddClause(acc);
        Column.RegisterQuery(CurrentDDL);
        return acc;
    }

    public function DROPCOLUMN(ColumnName:String):DropColumnClause {
        var dcc:DropColumnClause = new DropColumnClause(CurrentDDL, ColumnName);
        CurrentDDL.AddClause(dcc);
        return dcc;
    }

    public function ADDFOREIGNKEY(ForeignKeyName:String, BaseColumns:Array<IColumnDefinition>, ReferenceTable:String, ReferenceColumns:Array<IColumnDefinition>):AddForeignKeyClause {
        var afkc:AddForeignKeyClause = new AddForeignKeyClause(CurrentDDL, ForeignKeyName, BaseColumns, ReferenceTable, ReferenceColumns);
        CurrentDDL.AddClause(afkc);
        for(bcolumn in BaseColumns){
            bcolumn.RegisterQuery(CurrentDDL);
        }
        return afkc;
    }

    public function ADDPRIMARYKEY(PrimaryKeyName:String, BaseColumns:Array<IColumnDefinition>):AddPrimaryKeyClause {
        var apkc:AddPrimaryKeyClause = new AddPrimaryKeyClause(CurrentDDL, PrimaryKeyName, BaseColumns);
        CurrentDDL.AddClause(apkc);
        for(bcolumn in BaseColumns){
            bcolumn.RegisterQuery(CurrentDDL);
        }
        return apkc;
    }

    public function DROPPRIMARYKEY(PrimaryKeyName:String, BaseColumns:Array<IColumnDefinition>):AddPrimaryKeyClause {
        var apkc:AddPrimaryKeyClause = new AddPrimaryKeyClause(CurrentDDL, PrimaryKeyName, BaseColumns);
        CurrentDDL.AddClause(apkc);
        for(bcolumn in BaseColumns){
            bcolumn.RegisterQuery(CurrentDDL);
        }
        return apkc;
    }

    public function DROPCONSTRAINT(ConstraintName:String):DropConstraintClause {
        var dcc:DropConstraintClause = new DropConstraintClause(CurrentDDL, ConstraintName);
        CurrentDDL.AddClause(dcc);
        return dcc;
    }

    public function ALTERCOLUMN(ChangedColumn:IColumnDefinition, TypeChange:ChangeTypeEnum,?OldTable:String,?OldParameter:String):AlterColumnClause {
        this.ChangeType=TypeChange;
        var acc:AlterColumnClause;
        if(OldParameter!=null && OldParameter!="")
            acc= new AlterColumnClause(CurrentDDL, ChangedColumn,TypeChange,OldTable,OldParameter);
        else
            acc = new AlterColumnClause(CurrentDDL, ChangedColumn,TypeChange);
        CurrentDDL.AddClause(acc);
        ChangedColumn.RegisterQuery(CurrentDDL);
        return acc;
    }

    public function RENAMETABLE(NewName:String,OldNewName ):DDL{
        this.ChangeType=ChangeTypeEnum.tableName;
        this.TableName=NewName;
        this.TableOldName=OldNewName;
        return CurrentDDL;
    }

    public function SCRIPT_PART(?args:String) {
        

        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:

                CurrentDDL.AddBlock("ALTER TABLE \"" + TableName + "\" ");

            case DatabaseEngineEnum.MYSQL:

                CurrentDDL.AddBlock("ALTER TABLE \"" + TableName + "\" ");

            case DatabaseEngineEnum.ORACLE:
                    CurrentDDL.AddBlock("ALTER TABLE \"" + TableName + "\" ");
            case DatabaseEngineEnum.POSTGRESQL:

                CurrentDDL.AddBlock("ALTER TABLE \"" + TableName + "\" ");

            case DatabaseEngineEnum.SQLSERVER:
                if(this.ChangeType == ChangeTypeEnum.tableName)
                    CurrentDDL.AddBlock("EXEC sp_rename \"" + TableOldName + "\",\""+TableName+"\" ");//Part += "EXEC sp_rename \"" + TableName + ".**";//para posterior cambio de sentencia .** se usa para replazar en cadena
                else
                CurrentDDL.AddBlock("ALTER TABLE \"" + TableName + "\" ");
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
