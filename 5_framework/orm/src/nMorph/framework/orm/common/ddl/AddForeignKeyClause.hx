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
class AddForeignKeyClause implements IClause {

    private var CurrentDDL:DDL;
    private var ForeignKeyName:String;
    private var BaseColumns:Array<IColumnDefinition>;
    private var ReferenceTable:String;
    private var ReferenceColumns:Array<IColumnDefinition>;


    public function new(CurrentDDL:DDL, ForeignKeyName:String, BaseColumns:Array<IColumnDefinition>, ReferenceTable:String, ReferenceColumns:Array<IColumnDefinition>) {
        this.CurrentDDL = CurrentDDL;
        this.ForeignKeyName = ForeignKeyName;
        this.BaseColumns = BaseColumns;
        this.ReferenceTable = ReferenceTable;
        this.ReferenceColumns = ReferenceColumns;
    }

    public function SCRIPT_PART(?args:String) {
        
        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:

                CurrentDDL.AddBlock("ADD CONSTRAINT \"" + ForeignKeyName + "_FK\" FOREIGN KEY (");

                for (basecolumn in BaseColumns) {
                    basecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (BaseColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")  REFERENCES \"" + ReferenceTable + "\" (");

                for (referencecolumn in ReferenceColumns) {
                    referencecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (ReferenceColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");

            case DatabaseEngineEnum.MYSQL:
                CurrentDDL.AddBlock("ADD CONSTRAINT \"" + ForeignKeyName + "_FK\" FOREIGN KEY (");

                for (basecolumn in BaseColumns) {
                    basecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (BaseColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")  REFERENCES \"" + ReferenceTable + "\" (");

                for (referencecolumn in ReferenceColumns) {
                    referencecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (ReferenceColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");
            case DatabaseEngineEnum.ORACLE:
                CurrentDDL.AddBlock("ADD CONSTRAINT \"" + ForeignKeyName + "_FK\" FOREIGN KEY (");

                for (basecolumn in BaseColumns) {
                    basecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (BaseColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")  REFERENCES \"" + ReferenceTable + "\" (");

                for (referencecolumn in ReferenceColumns) {
                    referencecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (ReferenceColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");
            case DatabaseEngineEnum.POSTGRESQL:
                CurrentDDL.AddBlock("ADD CONSTRAINT \"" + ForeignKeyName + "_FK\" FOREIGN KEY (");

                for (basecolumn in BaseColumns) {
                    basecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (BaseColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")  REFERENCES \"" + ReferenceTable + "\" (");

                for (referencecolumn in ReferenceColumns) {
                    referencecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (ReferenceColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")");
            case DatabaseEngineEnum.SQLSERVER:
                CurrentDDL.AddBlock("ADD CONSTRAINT \"" + ForeignKeyName + "_FK\" FOREIGN KEY (");

                for (basecolumn in BaseColumns) {
                    basecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (BaseColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
                //if (Part.substr(Part.length - 2, 2) == ", ")
                    //Part = Part.substr(0, Part.length - 2);

                CurrentDDL.AddBlock(")  REFERENCES \"" + ReferenceTable + "\" (");

                for (referencecolumn in ReferenceColumns) {
                    referencecolumn.SCRIPT_PART("OnlyName");
					CurrentDDL.AddBlock(", ");
                }

				if (ReferenceColumns.length > 0)
					CurrentDDL.RemoveLastBlock();
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
