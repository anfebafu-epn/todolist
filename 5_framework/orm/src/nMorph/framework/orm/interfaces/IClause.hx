package nMorph.framework.orm.interfaces;

import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub
interface IClause {

    public function SCRIPT_PART(?args:String):Void;
    public function SCRIPT():String;
    public function Execute():Dynamic;
    public function Register(context:Context):Void;
    public function Queue(queue: Array<QueueItem>): Array<QueueItem>;
	public function Bulk(bulk: BulkRun):BulkRun;
    public function ReadValue():Dynamic;
    public function ReadTable():QueryTable;
    public function Read<T>(cl:Class<T>, ?context:Context):Array<T>;
    public function ReadOne<T>(cl:Class<T>, ?context:Context):T;

}
