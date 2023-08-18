package nMorph.framework.orm.common.clauses;

import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.common.clauses.GroupByClause;
import nMorph.framework.orm.common.clauses.OrderByClause;
import nMorph.framework.orm.common.enums.UnionTypeEnum;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.BulkRun;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class WhereClause implements IClause
{

	private var CurrentSQL:SQL;
	private var Condition:ICondition;

	public function new(CurrentSQL:SQL, Condition:ICondition)
	{
		this.CurrentSQL = CurrentSQL;
		this.Condition = Condition;
		this.Condition.RegisterQuery(CurrentSQL);
	}

	public function GROUPBY(GroupSentences:Array<ISentence>):GroupByClause
	{
		var gbc:GroupByClause = new GroupByClause(CurrentSQL, GroupSentences);
		CurrentSQL.AddClause(gbc);
		return gbc;
	}

	public function ORDERBY(OrderBySentences:Array<ISentence>):OrderByClause
	{
		var obc:OrderByClause = new OrderByClause(CurrentSQL, OrderBySentences);
		CurrentSQL.AddClause(obc);
		return obc;
	}

	public function UNION(UnionType:UnionTypeEnum, Clause:IClause):UnionClause
	{
		var uc:UnionClause = new UnionClause(CurrentSQL, UnionType, Clause);
		CurrentSQL.AddClause(uc);
		return uc;
	}

	public function SCRIPT():String
	{
		return CurrentSQL.GenerateAll();
	}

	public function SCRIPT_PART(?args:String)
	{
		if (Condition == null) return;

		CurrentSQL.AddBlock("WHERE ");

		switch (CurrentSQL.getCurrentEngine())
		{
			case DatabaseEngineEnum.GENERIC:
				Condition.SCRIPT_PART();
			case DatabaseEngineEnum.MYSQL:
				Condition.SCRIPT_PART();
			case DatabaseEngineEnum.ORACLE:
				Condition.SCRIPT_PART();
			case DatabaseEngineEnum.POSTGRESQL:
				Condition.SCRIPT_PART();
			case DatabaseEngineEnum.SQLSERVER:
				Condition.SCRIPT_PART();
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

	public function Queue(queue:Array<QueueItem>):Array<QueueItem>
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
