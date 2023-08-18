package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.StTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.common.enums.CastTypeEnum;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class Cast implements ISentence
{
	private var CastTypeEnum:CastTypeEnum;
	private var Sentence:ISentence;
	private var CurrentSQL:SQL;
	private var Alias:String;
	private var FormatDate:String;

	public function new(CastTypeEnum:CastTypeEnum,Sentence:ISentence,?Alias:String,?FormatDate:String)
	{
		this.CastTypeEnum = CastTypeEnum;
		this.Sentence = Sentence;
		this.Alias=Alias;
		this.FormatDate=FormatDate;
	}

	public static function CastVarChartoInt(Sentence:ISentence,?Alias:String):ISentence
	{
		var Cast:Cast = new Cast(CastTypeEnum.CastVarChartoInt,Sentence,Alias,null);
		return Cast;
	}

	public static function CastVarChartoDouble(Sentence:ISentence,?Alias:String):ISentence
	{
		var Cast:Cast = new Cast(CastTypeEnum.CastVarChartoDouble,Sentence,Alias,null);
		return Cast;
	}

	public static function CastVarChartoBigInteger(Sentence:ISentence,?Alias:String):ISentence
	{
		var Cast:Cast = new Cast(CastTypeEnum.CastVarChartoBigInteger,Sentence,Alias,null);
		return Cast;
	}

	public static function CastVarChartoDate(Sentence:ISentence,FormatDate:String,?Alias:String):ISentence
	{
		var Cast:Cast = new Cast(CastTypeEnum.CastVarChartoDate,Sentence,Alias,FormatDate);
		return Cast;
	}

	public static function CastNumbertoVarChar(Sentence:ISentence,?Alias:String):ISentence
	{
		var Cast:Cast = new Cast(CastTypeEnum.CastNumbertoVarChar,Sentence,Alias,null);
		return Cast;
	}

	public function IsNullValue():Bool
	{
		return false;
	}

	public function RegisterQuery(CurrentSQL:ILang)
	{
		this.CurrentSQL = cast(CurrentSQL, SQL);
		this.Sentence.RegisterQuery(CurrentSQL);

	}
	public function SCRIPT_PART(?args:String)
	{
		switch (CurrentSQL.getCurrentEngine())
		{
			case DatabaseEngineEnum.GENERIC:
				switch (CastTypeEnum)
				{
					case CastVarChartoInt:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS int) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS int) ");
						}
					case CastVarChartoBigInteger:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) ");
						}
					case CastVarChartoDouble:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS decimal(9,2)) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("AS decimal(9,2)) ");
						}
					case CastVarChartoDate:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CONVERT(datetime,");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CONVERT(datetime,");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case CastNumbertoVarChar:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST("); 
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) ");
						}

				}
			case DatabaseEngineEnum.MYSQL:
				switch (CastTypeEnum)
				{
					case CastVarChartoInt:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS UNSIGNED) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS UNSIGNED) ");
						}
					case CastVarChartoBigInteger:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS UNSIGNED integer) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS UNSIGNED integer) ");
						}
					case CastVarChartoDouble:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS DECIMAL(9,2)) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS DECIMAL(9,2)) ");
						}
					case CastVarChartoDate:
						if (Alias != null){
							
							CurrentSQL.AddBlock("str_to_date(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("str_to_date(");
							Sentence.SCRIPT_PART(); 
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") ");
						}
					case CastNumbertoVarChar:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) ");
						}

				}
			case DatabaseEngineEnum.ORACLE:
				switch (CastTypeEnum)
				{
					case CastVarChartoInt:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS INTEGER) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS INTEGER) ");
						}
					case CastVarChartoBigInteger:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS NUMBER(18)) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS NUMBER(18)) ");
						}
					case CastVarChartoDouble:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS NUMERIC(17,2)) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS NUMERIC(17,2)) ");
						}
					case CastVarChartoDate:
						if (Alias != null){
							
							CurrentSQL.AddBlock("TO_DATE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("TO_DATE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") ");
						}
					case CastNumbertoVarChar:
						if (Alias != null){
							
							CurrentSQL.AddBlock("TO_CHAR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" ) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("TO_CHAR(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" ) ");
						}

				}
			case DatabaseEngineEnum.POSTGRESQL:
				switch (CastTypeEnum)
				{
					case CastVarChartoInt:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS INT) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS INT) ");
						}
					case CastVarChartoBigInteger:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) ");
						}
					case CastVarChartoDouble:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" as double precision) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" as double precision) ");
						}
					case CastVarChartoDate:
						if (Alias != null){
							
							CurrentSQL.AddBlock("TO_DATE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("TO_DATE(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(",\"" + FormatDate+"\") ");
						}
					case CastNumbertoVarChar:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) ");
						}

				}
			case DatabaseEngineEnum.SQLSERVER:
				switch (CastTypeEnum)
				{
					case CastVarChartoInt:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS int) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS int) ");
						}
					case CastVarChartoBigInteger:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS bigint) ");
						}
					case CastVarChartoDouble:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS decimal(9,2)) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock("AS decimal(9,2)) ");
						}
					case CastVarChartoDate:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CONVERT(datetime,");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CONVERT(datetime,");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case CastNumbertoVarChar:
						if (Alias != null){
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("CAST(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(" AS CHAR) ");
						}

				}
		}
	}
}
