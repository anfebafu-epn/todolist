package nMorph.framework.orm.lang;

import nMorph.framework.orm.common.ddl.ExistClause;
import nMorph.framework.orm.common.ddl.CreateSql;
import nMorph.framework.orm.common.ddl.DropIndexClause;
import nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences;
import nMorph.framework.orm.common.ddl.CreateIndexClause;
import nMorph.framework.orm.configuration.Configuration;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.ddl.DropViewClause;
import nMorph.framework.orm.common.ddl.AlterViewClause;
import nMorph.framework.orm.common.ddl.CreateViewClause;
import nMorph.framework.orm.common.ddl.DropTableClause;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.client.Connector;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.ddl.AlterTableClause;
import nMorph.framework.orm.interfaces.IClause;
import nMorph.framework.orm.common.ddl.CreateTableClause;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.client.QueryBlock;

/**
 * ...
 * @author ...
 */
class DDL implements ILang
{

	private var Clauses:Array<IClause> = new Array<IClause>();
	private var QueryBlocks:Array<QueryBlock> = new Array<QueryBlock>();
	private var GeneratedBlocks: Array<String> = new Array<String>();

	public function new()
	{
	}

	public static function CREATETABLE(TableName:String, Columns:Array<IColumnDefinition>):CreateTableClause
	{
		var CurrentDDL:DDL = new DDL();
		var ctc:CreateTableClause = new CreateTableClause(CurrentDDL, TableName, Columns);
		CurrentDDL.AddClause(ctc);
		return ctc;
	}
	
	public static function CREATEsql(Querys:String):CreateSql
	{
		var CurrentDDL:DDL = new DDL();
		var ctc:CreateSql = new CreateSql(CurrentDDL, Querys);
		CurrentDDL.AddClause(ctc);
		return ctc;
	}

	public static function ALTERTABLE(TableName:String):AlterTableClause
	{
		var CurrentDDL:DDL = new DDL();
		var atc:AlterTableClause = new AlterTableClause(CurrentDDL, TableName);
		CurrentDDL.AddClause(atc);
		return atc;
	}

	public static function RENAMETABLE():AlterTableClause
	{
		var CurrentDDL:DDL = new DDL();
		var dtc:AlterTableClause = new AlterTableClause(CurrentDDL);
		CurrentDDL.AddClause(dtc);
		return dtc;
	}

	public static function DROPTABLE(TableName:String):DropTableClause
	{
		var CurrentDDL:DDL = new DDL();
		var dtc:DropTableClause = new DropTableClause(CurrentDDL, TableName);
		CurrentDDL.AddClause(dtc);
		return dtc;
	}

	public static function CREATEVIEW(ViewName:String):CreateViewClause
	{
		var CurrentDDL:DDL = new DDL();
		var vtc:CreateViewClause = new CreateViewClause(CurrentDDL, ViewName);
		CurrentDDL.AddClause(vtc);
		return vtc;
	}

	public static function ALTERVIEW(ViewName:String)
	{
		var CurrentDDL:DDL = new DDL();
		var vav:AlterViewClause = new AlterViewClause(CurrentDDL, ViewName);
		CurrentDDL.AddClause(vav);
		return vav;
	}

	public static function DROPVIEW(ViewName:String)
	{
		var CurrentDDL:DDL = new DDL();
		var vav:DropViewClause = new DropViewClause(CurrentDDL, ViewName);
		CurrentDDL.AddClause(vav);
		return vav;
	}

	public static function EXISTTABLE(TableName:String)
	{
		var CurrentDDL:DDL= new DDL();
		var vav:ExistClause = new ExistClause(CurrentDDL, TableName);
		CurrentDDL.AddClause(vav);
		return vav;
	}

	public static function CREATEUSER()
	{

	}

	public static function ALTERUSER()
	{

	}

	public static function DROPUSER()
	{

	}

	public static function CREATEINDEX(IndexName:String,Columns:FielIndexDefinitionSentences)
	{
		var CurrentDDL:DDL = new DDL();
		var ci:CreateIndexClause = new CreateIndexClause(CurrentDDL, IndexName,Columns);
		CurrentDDL.AddClause(ci);
		return ci;
	}

	public static function DROPINDEX(IndexName:String,?TableName:String)
	{
		var CurrentDDL:DDL = new DDL();
		var di:DropIndexClause = new DropIndexClause(CurrentDDL, IndexName,TableName);
		CurrentDDL.AddClause(di);
		return di;
	}

	public function AddClause(Clause:IClause)
	{
		Clauses.push(Clause);
	}
	
	public function AddQueryBlock(b:QueryBlock)
	{
		QueryBlocks.push(b);
	}
	
	public function AddBlock(Block:String) {
		GeneratedBlocks.push(Block);
	}
	
	
	
	public function RemoveLastBlock(){
		GeneratedBlocks.pop();
	}
	
	public function getCurrentEngine()
	{
		return Configuration.Data.get_CurrentDatabaseConnection().DatabaseEngine;
	}

	public function GenerateAll():String
	{

		switch (getCurrentEngine())
		{
			case DatabaseEngineEnum.GENERIC:
				
				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case DatabaseEngineEnum.MYSQL:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case DatabaseEngineEnum.ORACLE:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case DatabaseEngineEnum.POSTGRESQL:
				var Script = "";

				for (clause in Clauses)
				{
					clause.SCRIPT_PART();
					AddBlock("\n");
				}

				
			case DatabaseEngineEnum.SQLSERVER:
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
		GeneratedSQL=StringTools.replace(GeneratedSQL,".**\n",".");
		var Parameters:Array<QueryParameter> = new Array<QueryParameter>();
		return Connector.Execute(GeneratedSQL, Parameters);
	}
}
