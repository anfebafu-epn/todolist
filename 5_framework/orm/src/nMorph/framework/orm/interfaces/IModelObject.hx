package nMorph.framework.orm.interfaces;
import nMorph.framework.orm.common.sentences.FieldSentence;

interface IModelObject {
    public function get_Name():String;
    public function get_Field(FieldName:String):FieldSentence;
    public function set_Field(FieldName:String, FieldValue:Dynamic):Void;
}
