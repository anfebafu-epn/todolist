package nMorph.framework.orm.common.clauses;
import nMorph.framework.orm.client.QueryBlock;
import nMorph.framework.orm.common.enums.LimitTypeEnum;
import nMorph.framework.orm.lang.SQL;

/**
 * Cláusula que permite determinar la cantidad de registros presentados
 * @author Smartwork
 */
@:keepSub @:rtti
class LimitClause implements IClause
{
	private var CurrentSQL:SQL;
	private var IsTopLimit = false;
	private var Offset:Int;
	private var Fetch:Int;
	private var Top:Int;
	private var LimitType:LimitTypeEnum;
	
	public function new(CurrentSQL:SQL, Offset:Int, Fetch:Int) 
	{
		this.CurrentSQL = CurrentSQL;
		this.IsTopLimit = false;
		this.Offset = Offset;
		this.Fetch = Fetch;
	}
	
	public function new(CurrentSQL:SQL, Top:Int, LimitType:LimitTypeEnum) 
	{
		this.CurrentSQL = CurrentSQL;
		this.Top = Top;
		this.LimitType = LimitType;
		this.IsTopLimit = true;
	}
	
	
	public function SCRIPT():String
	{
		return CurrentSQL.GenerateAll();
	}

	public function SCRIPT_PART(?args:String)
	{
		if (IsTopLimit){
			CurrentSQL.AddQueryBlock(QueryBlock.SET("TopBlock", " TOP " + Top + (LimitType == LimitTypeEnum.PERCENT ? " PERCENT " :  " ")));
		}
		else{
			if (CurrentSQL.ContainsClause(OrderByClause)){
				CurrentSQL.AddBlock("OFFSET " + Offset + " ROWS FETCH NEXT " + Fetch + " ROWS ONLY;");	
			}
			else{
				CurrentSQL.AddBlock("ORDER BY 1 OFFSET " + Offset + " ROWS FETCH NEXT " + Fetch + " ROWS ONLY;");	
			}
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

	public function Bulk(bulk: BulkRun):BulkRun
	{
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