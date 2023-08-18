package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class CreateTableClause implements IClause {

    private var CurrentDDL:DDL;
    private var TableName:String;
    private var Columns:Array<IColumnDefinition>;

    public function new(CurrentDDL:DDL, TableName:String, Columns:Array<IColumnDefinition>) {
        this.CurrentDDL = CurrentDDL;
        this.TableName = TableName;
        this.Columns = Columns;

        for(column in Columns){
            column.RegisterQuery(CurrentDDL);
        }
    }

    public function SCRIPT_PART(?args:String) {
        
        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:

                CurrentDDL.AddBlock("CREATE TABLE \"" + TableName + "\" (");

                var limite = Columns.length;
				var i = 1;
                for (column in Columns) {
					if (i < limite) {
						CurrentDDL.AddBlock(column.SCRIPT_PART() + ",");
					} 
					if (i == limite)
					{
						CurrentDDL.AddBlock(column.SCRIPT_PART());
					}
					i = i + 1;
                  
                }
				//if (Columns.length > 0)
					//CurrentDDL.RemoveLastBlock();
				//if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");

            case DatabaseEngineEnum.MYSQL:

                CurrentDDL.AddBlock("CREATE TABLE \"" + TableName + "\" (");

                var limite = Columns.length;
				var i = 1;
                for (column in Columns) {
					if (i < limite) {
						CurrentDDL.AddBlock(column.SCRIPT_PART() + ",");
					} 
					if (i == limite)
					{
						CurrentDDL.AddBlock(column.SCRIPT_PART());
					}
					i = i + 1;
                }
				//if (Columns.length > 0)
					//CurrentDDL.RemoveLastBlock();
				//if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");

            case DatabaseEngineEnum.ORACLE:

                CurrentDDL.AddBlock("CREATE TABLE \"" + TableName + "\" (");

                var limite = Columns.length;
				var i = 1;
                for (column in Columns) {
					if (i < limite) {
						CurrentDDL.AddBlock(column.SCRIPT_PART() + ",");
					} 
					if (i == limite)
					{
						CurrentDDL.AddBlock(column.SCRIPT_PART());
					}
					i = i + 1;
                }
                
				//if (Columns.length > 0)
					//CurrentDDL.RemoveLastBlock();
				//if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");

            case DatabaseEngineEnum.POSTGRESQL:

                CurrentDDL.AddBlock("CREATE TABLE \"" + TableName + "\" (");

                 var limite = Columns.length;
				var i = 1;
                for (column in Columns) {
					if (i < limite) {
						CurrentDDL.AddBlock(column.SCRIPT_PART() + ",");
					} 
					if (i == limite)
					{
						CurrentDDL.AddBlock(column.SCRIPT_PART());
					}
					i = i + 1;
                }
                
				//if (Columns.length > 0)
					//CurrentDDL.RemoveLastBlock();
				//if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");

            case DatabaseEngineEnum.SQLSERVER:

                CurrentDDL.AddBlock("CREATE TABLE \"" + TableName + "\" (");
                var limite = Columns.length;
				var i = 1;
                for (column in Columns) {
					if (i < limite) {
						CurrentDDL.AddBlock(column.SCRIPT_PART() + ",");
					} 
					if (i == limite)
					{
						CurrentDDL.AddBlock(column.SCRIPT_PART());
					}
					i = i + 1;
                }
                
				//if (Columns.length > 0)
					//CurrentDDL.RemoveLastBlock();
				//if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");
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
