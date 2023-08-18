package nMorph.framework.orm.client;

import nMorph.framework.orm.common.sentences.FieldSentence;

@:keepSub @:rtti
class ChangeItem {
    public function new(?Field:FieldSentence, ?OldValue:Dynamic, ?NewValue:Dynamic) {
        this.Field = Field;
        this.OldValue = OldValue;
        this.NewValue = NewValue;
    }

    @:isVar public var Field(get, set):FieldSentence;
    @:isVar public var OldValue(get, set):Dynamic;
    @:isVar public var NewValue(get, set):Dynamic;

    function set_Field(value:FieldSentence) {
        return this.Field = value;
    }

    function get_Field():FieldSentence {
        return Field;
    }

    function set_OldValue(value:Dynamic) {
        return this.OldValue = value;
    }

    function get_OldValue():Dynamic {
        return OldValue;
    }

    function get_NewValue():Dynamic {
        return NewValue;
    }

    function set_NewValue(value:Dynamic) {
        return this.NewValue = value;
    }

}
