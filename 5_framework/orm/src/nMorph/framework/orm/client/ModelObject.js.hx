package nMorph.framework.orm.client;

import nMorph.framework.orm.client.ChangeItem;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.common.enums.ObjectSourceTypeEnum;
import nMorph.framework.orm.interfaces.ISource;
//import nMorph.framework.orm.common.sentences.Val;
import nMorph.framework.orm.common.enums.DBTypeEnum;
//import nMorph.framework.orm.common.sentences.Assign;
import nMorph.framework.orm.interfaces.ISet;
//import nMorph.framework.orm.common.conditions.Condition;
import nMorph.framework.orm.common.enums.ObjectEditTypeEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.sentences.FieldSentence;
import nMorph.framework.orm.interfaces.IModelObject;

@:keepSub @:rtti
class ModelObject implements IModelObject {

    public static var AllColumns:Array<ISentence> = [];

    @:isVar public var TrackChanges(get, set):Bool;

    @:isVar public var ChangeList(get, set):Array<ChangeItem>;

    @:isVar public var ObjectEditType(get, set):ObjectEditTypeEnum;

    @:isVar public var ObjectSource(get, set):ObjectSourceTypeEnum;


    public function new() {
        this.ChangeList = new Array<ChangeItem>();
        this.ObjectEditType = ObjectEditTypeEnum.CREATE;
        this.ObjectSource = ObjectSourceTypeEnum.LOGIC;
        this.TrackChanges = true;
    }

    public function get_Source():ISource {
        return null;
    }

    public function get_Name():String {
        return "";
    }

    public function get_Field(FieldName:String):FieldSentence {
        return null;
    }

    public function set_Field(FieldName:String, FieldValue:Dynamic) {
    }

    //public function get_PkCondition():Condition {
        //return null;
    //}

    function set_TrackChanges(value:Bool) {
        return this.TrackChanges = value;
    }

    function get_TrackChanges():Bool {
        return TrackChanges;
    }

    function get_ChangeList():Array<ChangeItem> {
        return ChangeList;
    }

    function set_ChangeList(value:Array<ChangeItem>) {
        return this.ChangeList = value;
    }

    function get_ObjectEditType():ObjectEditTypeEnum {
        return ObjectEditType;
    }

    function set_ObjectEditType(value:ObjectEditTypeEnum) {
        return this.ObjectEditType = value;
    }

    function get_ObjectSource():ObjectSourceTypeEnum {
        return ObjectSource;
    }

    function set_ObjectSource(value:ObjectSourceTypeEnum) {
        return this.ObjectSource = value;
    }

// Methods

    function AddChange(item:ChangeItem) {

        // revisa si ya no tiene un cambio registrado previamente para ese field
        // así se evita la duplicación de la sentencia
        // la verificación de si cambió el valor viene desde la clase generada
        for (i in ChangeList) {
            if (i.Field == item.Field) {
                i.NewValue = item.NewValue;
                return;
            }
        }

        // Si hay una variación en uno de los campos, cambia el estado de edición del objeto
        // Si esta en Create, Delete o Edit mismo, quedan como estaban, solamente cambia si estaba marcado sin cambios
        switch (ObjectEditType){
            case ObjectEditTypeEnum.NOCHANGE:
                ObjectEditType = ObjectEditTypeEnum.EDIT;

            case ObjectEditTypeEnum.CREATE:
            case ObjectEditTypeEnum.DELETE:
            case ObjectEditTypeEnum.EDIT:
        }

        // agrega el cambio a la lista de cambios para posterior ejecución
        ChangeList.push(item);
    }

    public function Save(queue:Array<QueueItem>):Array<QueueItem> {

        //var sets:Array<ISet> = new Array<ISet>();
//
        //for (change in ChangeList) {
            //var valSentence:ISentence = null;
//
            //switch(change.Field.DBType){
                //case DBTypeEnum.BIGINTEGER:
                    //valSentence = Val.int64(change.NewValue);
                //case DBTypeEnum.BIGTEXT:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.BINARY:
                    //valSentence = Val.bytes(change.NewValue);
                //case DBTypeEnum.BOOLEAN:
                    //valSentence = Val.bool(change.NewValue);
                //case DBTypeEnum.CHAR:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.DATETIME:
                    //valSentence = Val.date(change.NewValue);
                //case DBTypeEnum.DECIMAL:
                    //valSentence = Val.float(change.NewValue);
                //case DBTypeEnum.FLOAT:
                    //valSentence = Val.float(change.NewValue);
                //case DBTypeEnum.INTEGER:
                    //valSentence = Val.int(change.NewValue);
                //case DBTypeEnum.NBIGTEXT:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.NCHAR:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.NVARCHAR:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.REAL:
                    //valSentence = Val.float(change.NewValue);
                //case DBTypeEnum.SMALLINTEGER:
                    //valSentence = Val.int(change.NewValue);
                //case DBTypeEnum.VARCHAR:
                    //valSentence = Val.str(change.NewValue);
                //case DBTypeEnum.UUID:
                    //valSentence = Val.uuid(change.NewValue);
            //}
//
            //if (valSentence != null) {
                //sets.push(Assign.SET(change.Field, valSentence));
            //}
        //}

        //if (ObjectEditType == ObjectEditTypeEnum.CREATE) {
            //return SQL.INSERT(get_Source()).SETS(sets).Queue(queue);
        //}
        //else if (ObjectEditType == ObjectEditTypeEnum.EDIT) {
            //return SQL.UPDATE(get_Source()).SET(sets).WHERE(get_PkCondition()).Queue(queue);
//
            //// TODO: Audit Changes
        //}
        //else if (ObjectEditType == ObjectEditTypeEnum.DELETE) {
            //return SQL.DELETE().FROM(get_Source()).WHERE(get_PkCondition()).Queue(queue);
        //}

        //queue = SaveInner(queue);
        return queue;
    }

    public function SaveInner(queue:Array<QueueItem>):Array<QueueItem> {
        return queue;
    }

    public function Clear() {
        // limpio el arreglo
        this.ChangeList = new Array<ChangeItem>(); // la lista queda vacía nuevamente
        this.ObjectEditType = ObjectEditTypeEnum.NOCHANGE; // ya no tendría cambios
        this.ObjectSource = ObjectSourceTypeEnum.DB; // ya está grabado en base
        //this.TrackChanges = true; // no cambio la condicion de monitoreo

        ClearInner();
    }

    public function ClearInner() {

    }
}
