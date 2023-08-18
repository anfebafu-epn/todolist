package nMorph.framework.orm.common.clauses;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.Context;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.BulkRun;

/**
 * Cláusula que permite la ejecución de métodos con la incorporación de queries directos
 * @author Smartwork
 */
@:keepSub @:rtti
class CustomClause implements IClause
{
	private var CurrentSQL:SQL;
	private var CustomQueries:Map<String,DatabaseEngineEnum>;
	private var Parameters:Array<QueryParameter>;

	public function new(CurrentSQL:SQL, CustomQueries:Map<String,DatabaseEngineEnum>, ?Parameters:Array<QueryParameter>)
	{
		this.CurrentSQL = CurrentSQL;
		this.CustomQueries = CustomQueries;
		this.Parameters = Parameters;
	}

	public function SCRIPT():String
	{
		return CurrentSQL.GenerateAll();
	}

	public function SCRIPT_PART(?args:String)
	{
		// Busca en los Queries personalizados, el que corresponde al motor de base de datos actual
		// Si no lo encuentra, no registra ningún query y al ejecutar dará error
		for (k => v in CustomQueries)
		{
			if (v == CurrentSQL.getCurrentEngine())
			{
				CurrentSQL.AddBlock(k);

				// Registro los parámetros para que se consideren durante la ejecución
				for (par in Parameters)
				{
					CurrentSQL.AddParameter(par);
				}
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
