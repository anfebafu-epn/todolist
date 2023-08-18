package nMorph.framework.orm.client;

import nMorph.framework.orm.client.ModelObject;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.common.enums.ObjectSourceTypeEnum;
import nMorph.framework.orm.common.enums.ObjectEditTypeEnum;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.tools.Context;


@:keepSub @:rtti
class ModelItem<T> {

    @:isVar public var it(get, set):T;

    function set_it(value:T) {
        return this.it = value;
    }

    function get_it():T {
        return it;
    }


    public function Include(clause:IClause,laClase:Dynamic,context:Context) {

        var clase=std.Type.getClass(laClase);
        var name = std.Type.getClassName(clase);
        //var type = std.Type.resolveClass(name.substr(name.indexOf("_") + 1));
        var type = std.Type.resolveClass(name);
        var item:T = clause.ReadOne(type,context);

        // asigno el objeto leído al objeto interno 
        it = item;

        // si el objeto es un ModelObject, activo el monitoreo
        if (Std.isOfType(it, ModelObject)) {
            var mo:ModelObject = cast(it, ModelObject);
            mo.TrackChanges = true;
            mo.ObjectEditType = ObjectEditTypeEnum.NOCHANGE;
            mo.ObjectSource = ObjectSourceTypeEnum.DB;
        }
        else {
            ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
        }
    }

    public function Save(queue:Array<QueueItem>):Array<QueueItem> {
        if (it == null) return queue;
        if (Std.isOfType(it, ModelObject)) {
            var mo:ModelObject = cast(it, ModelObject);
            queue = mo.Save(queue);
        }
        return queue;
    }

    public function Clear() {
        if (it == null) return;
        if (Std.isOfType(it, ModelObject)) {
            var mo:ModelObject = cast(it, ModelObject);
            mo.Clear();
        }
    }

    public function new() {
    }
}
