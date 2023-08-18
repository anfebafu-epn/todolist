package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.common.enums.ChangeTypeEnum;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class AlterColumnClause implements IClause {

    public var CurrentDDL : DDL;
    public var Column : IColumnDefinition;
    private var ChangeType:ChangeTypeEnum;
    public var OldTable:String;//para tomar el nombre de la tabla
    public var OldParameter:String;//para tomar el nombre del campo antiguo

    public function new(CurrentDDL:DDL, Column:IColumnDefinition, ChangeType:ChangeTypeEnum,?OldTable:String ,? OldParameter:String) {
        this.CurrentDDL = CurrentDDL;
        this.Column = Column;
        this.ChangeType = ChangeType;
        if(OldParameter!=null && OldParameter!=""){
            this.OldParameter=OldParameter;
        }
        if(OldTable!=null && OldTable!=""){
            this.OldTable=OldTable;
        }
    }

    public function SCRIPT_PART(?args:String) {
        
        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                if(this.ChangeType==ChangeTypeEnum.name){
                    if(OldParameter==null || OldParameter==''){
                        ExceptionHelper.LogicException(1, "No has old column name");
                        return;
                    }
                    //var sentencesC:String=Column.SCRIPT_PART("Alter");
                    //var r = ~/["]+/g;
                    //var splitArray:Array<String>=r.split(sentencesC);
                    CurrentDDL.AddBlock(" RENAME COLUMN \"" + OldParameter + "\" TO \"");
					Column.SCRIPT_PART("Alter");
					CurrentDDL.AddBlock("\"");

                }else{
                    CurrentDDL.AddBlock("ALTER COLUMN ");
					Column.SCRIPT_PART("Alter");
                }
            case DatabaseEngineEnum.MYSQL:
                if(this.ChangeType==ChangeTypeEnum.name){
                    if(OldParameter==null || OldParameter==''){
                        ExceptionHelper.LogicException(1, "No has old column name");
                        return;
                    }
                    //var sentencesC:String=Column.SCRIPT_PART("Alter");
                    //var r = ~/["]+/g;
                    //var splitArray:Array<String>=r.split(sentencesC);
                    CurrentDDL.AddBlock(" RENAME COLUMN \"" + OldParameter + "\" TO \"");
					Column.SCRIPT_PART("Alter");
					CurrentDDL.AddBlock("\"");

                }else{
                    if(this.ChangeType== ChangeTypeEnum.isDefaultCreate ||this.ChangeType== ChangeTypeEnum.isDefaultChange ){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" ALTER \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" SET DEFAULT ");
						Column.SCRIPT_PART("Alter");
                    }
                    if(this.ChangeType== ChangeTypeEnum.isDefaultDrop){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        CurrentDDL.AddBlock(" ALTER \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" DROP DEFAULT ");
                    }
                    CurrentDDL.AddBlock("MODIFY COLUMN ");
					Column.SCRIPT_PART("Alter");
                }
            case DatabaseEngineEnum.ORACLE:
                if(this.ChangeType==ChangeTypeEnum.name){
                    if(OldParameter==null || OldParameter==''){
                        ExceptionHelper.LogicException(1, "No has old column name");
                        return;
                    }
                    //var sentencesC:String=Column.SCRIPT_PART("Alter");
                    //var r = ~/["]+/g;
                    //var splitArray:Array<String>=r.split(sentencesC);
                    CurrentDDL.AddBlock(" RENAME COLUMN \"" + OldParameter + "\" TO \"");
					Column.SCRIPT_PART("Alter");
					CurrentDDL.AddBlock("\" ");

                }else{
                    if(this.ChangeType== ChangeTypeEnum.isDefaultCreate ||this.ChangeType== ChangeTypeEnum.isDefaultChange ){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" MODIFY \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" DEFAULT ");
						Column.SCRIPT_PART("Alter");
                    }
                    if(this.ChangeType== ChangeTypeEnum.isDefaultDrop){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        CurrentDDL.AddBlock(" MODIFY \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" DEFAULT NULL");
                    }
                    CurrentDDL.AddBlock("MODIFY ");
					Column.SCRIPT_PART("Alter");
                }
            case DatabaseEngineEnum.POSTGRESQL:
                if(this.ChangeType==ChangeTypeEnum.name){
                    if(OldParameter==null || OldParameter==''){
                        ExceptionHelper.LogicException(1, "No has old column name");
                        return;
                    }
                    //var sentencesC:String=Column.SCRIPT_PART("Alter");
                    //var r = ~/["]+/g;
                    //var splitArray:Array<String>=r.split(sentencesC);
                    CurrentDDL.AddBlock(" RENAME COLUMN \"" + OldParameter + "\" TO \"");
					Column.SCRIPT_PART("Alter");
					CurrentDDL.AddBlock("\" ");

                }else{

                    if(this.ChangeType== ChangeTypeEnum.isDefaultCreate ||this.ChangeType== ChangeTypeEnum.isDefaultChange ){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" ALTER COLUMN  \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" SET DEFAULT ");
						Column.SCRIPT_PART("Alter");
                        
                    }
                    if(this.ChangeType== ChangeTypeEnum.isDefaultDrop){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        CurrentDDL.AddBlock(" ALTER COLUMN  \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\" DROP DEFAULT");
                    }
                    CurrentDDL.AddBlock(" ALTER COLUMN ");
					Column.SCRIPT_PART("Alter");

                }
            case DatabaseEngineEnum.SQLSERVER:
                if(this.ChangeType==ChangeTypeEnum.name){
                    /*if(OldParameter==null || OldParameter==''){
                        ExceptionHelper.LogicException(1, "No has old column name");
                        return;
                    }
                    //var sentencesC:String=Column.SCRIPT_PART("Alter");
                    //var r = ~/["]+/g;
                    //var splitArray:Array<String>=r.split(sentencesC);
                    CurrentDDL.AddBlock("" + OldParameter + "\" , \"");
					Column.SCRIPT_PART("Alter");
					CurrentDDL.AddBlock("\",\"COLUMN\"");*/
					CurrentDDL.AddBlock(" CHANGE " + OldParameter + Column.SCRIPT_PART() );
                }else{
                    if(this.ChangeType==ChangeTypeEnum.isDefaultChange){
                        if(OldParameter==null || OldParameter==''){
                            ExceptionHelper.LogicException(1, "No has old column name in default");
                            return;
                        }
                        if(OldTable==null || OldTable==''){
                            ExceptionHelper.LogicException(1, "No has Table name in default");
                            return;
                        }
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" DROP CONSTRAINT \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("_Default\"; \n ALTER TABLE " + OldTable+" ADD CONSTRAINT \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("_Default\" DEFAULT ");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock(" FOR \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\";");

                    }
                    if(this.ChangeType==ChangeTypeEnum.isDefaultCreate){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" ADD CONSTRAINT \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("_Default\" DEFAULT ");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock(" FOR \"" );
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("\";");
                    }
                    if(this.ChangeType==ChangeTypeEnum.isDefaultDrop){
                        //var sentencesC:String=Column.SCRIPT_PART("Alter");
                        //var r = ~/["]+/g;
                        //var splitArray:Array<String>=r.split(sentencesC);
                        //var r2 = ~/(DEFAULT)/g;
                        //var splitArray2:Array<String>=r2.split(sentencesC);
                        CurrentDDL.AddBlock(" DROP CONSTRAINT \"");
						Column.SCRIPT_PART("Alter");
						CurrentDDL.AddBlock("_Default\";");
                    }
                    CurrentDDL.AddBlock("ALTER COLUMN ");
					Column.SCRIPT_PART("Alter");
                }
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
