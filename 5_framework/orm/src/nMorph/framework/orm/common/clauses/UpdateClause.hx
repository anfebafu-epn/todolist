package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.SetClause;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;


@:keepSub @:rtti
class UpdateClause implements IClause
{

	private var CurrentSQL:SQL;
	private var UpdateSource:ISource;

	public function new(CurrentSQL:SQL, UpdateSource:ISource)
	{
		this.CurrentSQL = CurrentSQL;
		this.UpdateSource = UpdateSource;
		UpdateSource.RegisterQuery(CurrentSQL);
	}

	public function SET(Sets:Array<ISet>):SetClause
	{
		var sc:SetClause = new SetClause(CurrentSQL, Sets);
		CurrentSQL.AddClause(sc);
		return sc;
	}

	public function SCRIPT():String
	{
		return CurrentSQL.GenerateAll();
	}

	public function SCRIPT_PART(?args:String)
	{
		switch (CurrentSQL.getCurrentEngine())
		{
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
				CurrentSQL.AddBlock("UPDATE ");
				UpdateSource.SCRIPT_PART();
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
				CurrentSQL.AddBlock("UPDATE ");
				UpdateSource.SCRIPT_PART();
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
				CurrentSQL.AddBlock("UPDATE ");
				UpdateSource.SCRIPT_PART();
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
				CurrentSQL.AddBlock("UPDATE ");
				UpdateSource.SCRIPT_PART();
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
				CurrentSQL.AddBlock("UPDATE ");
				UpdateSource.SCRIPT_PART();
		}

	}

	public function Execute():Dynamic
	{
		return CurrentSQL.Execute();
	}

	public function Register(context:Context):Void
	{
		context.Queue = CurrentSQL.Queue(context.Queue);
	}

	public function Queue(queue: Array<QueueItem>): Array<QueueItem>
	{
		return CurrentSQL.Queue(queue);
	}
	
	public function Bulk(bulk: BulkRun):BulkRun {
        bulk.queue = CurrentSQL.Queue(bulk.queue);
        return bulk;
    }

	public function ReadValue():Dynamic
	{
		return CurrentSQL.ReadValue();
	}

	public function ReadTable():QueryTable
	{
		return CurrentSQL.ReadTable();
	}

	public function Read<T>(cl:Class<T>, ?context:Context):Array<T>
	{
		return CurrentSQL.Read(cl, context);
	}

	public function ReadOne<T>(cl:Class<T>, ?context:Context):T
	{
		return CurrentSQL.ReadOne(cl, context);
	}
}
