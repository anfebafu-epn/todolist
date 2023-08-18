package nMorph.framework.orm.lang;

import nMorph.framework.common.configuration.*;
import nMorph.framework.common.datatypes.UUID;
import nMorph.framework.orm.configuration.*;
import nMorph.framework.orm.client.Connector;
import nMorph.framework.orm.client.QueryBlock;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.common.clauses.CustomClause;
import nMorph.framework.orm.common.clauses.DeleteClause;
import nMorph.framework.orm.common.clauses.InsertIntoClause;
import nMorph.framework.orm.common.clauses.JoinClause;
import nMorph.framework.orm.common.clauses.SelectClause;
import nMorph.framework.orm.common.clauses.UnionClause;
import nMorph.framework.orm.common.clauses.UpdateClause;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.ISource;
import nMorph.framework.orm.tools.Context;

/**
 * ...
 * @author ...
 */
class SQL implements ILang
{
	private var cf : Configuration;
	private var Clauses:Array<IClause> = new Array<IClause>();
	private var Parameters:Array<QueryParameter> = new Array<QueryParameter>();
	private var QueryBlocks:Array<QueryBlock> = new Array<QueryBlock>();
	private var GeneratedBlocks: Array<String> = new Array<String>();
	private var UniqueQueryNumber:UUID = null;
	
	

	public static var AllColumns:Array<ISentence> = [];

	// constructor
	public function new()
	{
	}

	public static function SELECT(?Sentences:Array<ISentence>, ?UniqueQueryNumber:UUID = null):SelectClause
	{
		// Creación del Modelo para todo el Query
		var CurrentSQL = new SQL();

		// Para que soporte todas las columnas directamente
		if (Sentences == null)
			Sentences = [];

		var sc:SelectClause = new SelectClause(CurrentSQL, Sentences);

		CurrentSQL.AddClause(sc);
		CurrentSQL.UniqueQueryNumber = UniqueQueryNumber;

		return sc;
	}

	public static function INSERT(Into: ISource, ?UniqueQueryNumber:UUID = null):InsertIntoClause
	{
// Creación del Modelo para todo el Query
		var CurrentSQL = new SQL();

		var ic:InsertIntoClause = new InsertIntoClause (CurrentSQL, Into);

		CurrentSQL.AddClause(ic);
		CurrentSQL.UniqueQueryNumber = UniqueQueryNumber;

		return ic;
	}

	public static function UPDATE(UpdateSource:ISource, ?UniqueQueryNumber:UUID = null):UpdateClause
	{
// Creación del Modelo para todo el Query
		var CurrentSQL = new SQL();

		var uc:UpdateClause = new UpdateClause (CurrentSQL, UpdateSource);

		CurrentSQL.AddClause(uc);
		CurrentSQL.UniqueQueryNumber = UniqueQueryNumber;
		return uc;
	}

	public static function DELETE(?UniqueQueryNumber:UUID = null):DeleteClause
	{
// Creación del Modelo para todo el Query
		var CurrentSQL = new SQL();

		var dc:DeleteClause = new DeleteClause (CurrentSQL);
		CurrentSQL.AddClause(dc);
		CurrentSQL.UniqueQueryNumber = UniqueQueryNumber;
	
		return dc;
	}
	
	public static function CUSTOM(CustomQueries:Map<String,DatabaseEngineEnum>, Parameters:Array<QueryParameter>):CustomClause{
		var CurrentSQL = new SQL();
		var cc:CustomClause = new CustomClause(CurrentSQL,CustomQueries, Parameters);
		CurrentSQL.AddClause(cc);
		return cc;
	}

	public function AddClause(Clause:IClause)
	{
		Clauses.push(Clause);
	}

	public function AddParameter(p:QueryParameter):String
	{
		Parameters.push(p);
		//CurrentParameterNumber++;
		p.ParameterName = "P" + UUID.newUUID().getShort(); //CurrentParameterNumber;
		return p.ParameterName;
	}
	
	public function AddQueryBlock(b:QueryBlock)
	{
		QueryBlocks.push(b);
	}
	
	public function AddBlock(Block:String) {
		GeneratedBlocks.push(Block);
	}
	
	public function ContainsClause(t:Class<IClause>){
		for (clause in Clauses){
			if (Type.getClass(clause) == t)
			return true;
		}
		return false;
	}
	
	public function RemoveLastBlock(){
		GeneratedBlocks.pop();
	}

	public function GenerateAll():String
	{
		//TODO: revisar en el caché de querys procesados, cargar solamente los parámetros
		//TODO: traducir texto a SP y leer el SP desde el caché
		//TODO: modelo data virtualization, métodos de base expuestos como servicios

		switch (Configuration.Data.get_CurrentDatabaseConnection().DatabaseEngine)
		{
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
		}
		
		// Generación de código final
		// Se hace el reeplazo de los bloques de código
		var FinalScript = "";
		
		for (CodeBlock in GeneratedBlocks)
		{
			// Determina si el elemento generado es un bloque de código y no un código directo
			// en ese caso se reemplaza
			if (StringTools.startsWith(CodeBlock, "{{")){
				var BlockFound = QueryBlocks.filter(b -> b.BlockName == CodeBlock);
				if (BlockFound.length > 0){
					FinalScript += BlockFound[0];
				}
			}
			else{
				FinalScript += CodeBlock;
			}
		}
		
		return FinalScript;
	}

	public function Execute():Dynamic
	{
		var GeneratedSQL = GenerateAll();
		return Connector.Execute(GeneratedSQL, Parameters);
	}

	public function Queue(queue:Array<QueueItem>):Array<QueueItem>
	{
		var GeneratedSQL = GenerateAll();
		return Connector.Queue(GeneratedSQL, Parameters, queue);
	}

	public function ReadValue():Dynamic
	{
		var GeneratedSQL = GenerateAll();
		return Connector.ReadValue(GeneratedSQL, Parameters);
	}

	public function ReadTable():QueryTable
	{
		var GeneratedSQL = GenerateAll();
		return Connector.ReadTable(GeneratedSQL, Parameters);
	}

	// lee varios registros, devuelve un arreglo del tipo genérico
	// recibe el ORM de forma opcional,
	// Si viene, el resultado de la consulta es registrado para monitoreo automático de cambios
	// si no viene, ejecuta directamente.

	public function Read<T>(cl:Class<T>, ?context:Context):Array<T>
	{
		var GeneratedSQL = GenerateAll();

		// tiene Join, Insert, Update o Delete, así le haya enviado el parámetro del ORM, le manda null para que no ate
		// los objetos a la actualización automática
		var MultipleTables:Bool = false;

		for (clause in Clauses)
		{

			if (Type.getClass(clause) == JoinClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == UnionClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == InsertIntoClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == UpdateClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == DeleteClause)
				MultipleTables = true;

			if (MultipleTables) break;
		}

		if (MultipleTables)
		{
			return Connector.Read(GeneratedSQL, Parameters, cl, null);
		}
		else {
			return Connector.Read(GeneratedSQL, Parameters, cl, context);
		}
	}

	// lee un sólo registro, devuelve un objeto directo del tipo genérico
	// recibe el ORM de forma opcional,
	// Si viene, el resultado de la consulta es registrado para monitoreo automático de cambios
	// si no viene, ejecuta directamente.

	public function ReadOne<T>(cl:Class<T>, ?context:Context):T
	{
		var GeneratedSQL = GenerateAll();
		// tiene Join
		var MultipleTables:Bool = false;

		for (clause in Clauses)
		{
			if (Type.getClass(clause) == JoinClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == UnionClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == InsertIntoClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == UpdateClause)
				MultipleTables = true;
			else if (Type.getClass(clause) == DeleteClause)
				MultipleTables = true;

			if (MultipleTables) break;
		}

		if (MultipleTables)
		{
			return Connector.ReadOne(GeneratedSQL, Parameters, cl, null);
		}
		else {
			return Connector.ReadOne(GeneratedSQL, Parameters, cl, context);
		}
	}

	public function getCurrentEngine()
	{
		return Configuration.Data.get_CurrentDatabaseConnection().DatabaseEngine;
	}

	///**
	 //* Método que devuelve el código único de query
	 //* @return El código único de query
	 //*/
	//public function getUniqueQueryNumber():Int
	//{
		//return UniqueQueryNumber;
	//}

	// Registro de SQLs directos dentro del ORM
	// Sirve para que se corran SQLs como parte de las transacciones de grabación.
	public function Register(context:Context)
	{
		var queue = new Array<QueueItem>();
		queue = Queue(queue);
		context.Queue.concat(queue);
	}
}
