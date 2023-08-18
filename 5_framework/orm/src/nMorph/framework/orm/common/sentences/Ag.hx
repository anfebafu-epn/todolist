package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.AgTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class Ag implements ISentence
{

	private var AgType:AgTypeEnum;
	private var Sentence:ISentence;
	private var CurrentSQL:SQL;
	private var Alias:String;

	public function new(AgType:AgTypeEnum, Sentence:ISentence,?Alias:String)
	{
		this.AgType = AgType;
		this.Sentence = Sentence;
		this.Alias=Alias;
	}

	public function IsNullValue():Bool
	{
		return false;
	}

	public static function SUM(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.SUM, Sentence,Alias);
		return ag;
	}

	public static function COUNT(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.COUNT, Sentence,Alias);
		return ag;
	}

	public static function DISTINCT(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.DISTINCT, Sentence,Alias);
		return ag;
	}

	public static function AVG(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.AVG, Sentence,Alias);
		return ag;
	}

	public static function COUNTALL(?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.COUNTALL, null,Alias);
		return ag;
	}

	public static function MAX(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.MAX, Sentence,Alias);
		return ag;
	}

	public static function MIN(Sentence:ISentence,?Alias:String):ISentence
	{
		var ag:Ag = new Ag(AgTypeEnum.MIN, Sentence,Alias);
		return ag;
	}

	public function RegisterQuery(CurrentSQL:ILang)
	{
		this.CurrentSQL = cast(CurrentSQL, SQL);
		if (this.Sentence != null)
		{
			this.Sentence.RegisterQuery(CurrentSQL);
		}
	}

	public function SCRIPT_PART(?args:String)
	{
		switch (CurrentSQL.getCurrentEngine())
		{
			case DatabaseEngineEnum.GENERIC:
				switch (AgType)
				{
					case AgTypeEnum.SUM:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
							CurrentSQL.AddBlock("SUM(");
						Sentence.SCRIPT_PART();
						CurrentSQL.AddBlock(") ");
					case AgTypeEnum.COUNT:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{
							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}

					case AgTypeEnum.COUNTALL:
						if (Alias!=null)
							CurrentSQL.AddBlock("COUNT(*) AS \""+ Alias + "\" ");
						else
							CurrentSQL.AddBlock("COUNT(*) ");
					case AgTypeEnum.DISTINCT:
						if (Alias != null)
						{
							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.AVG:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MAX:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MIN:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
				}
			case DatabaseEngineEnum.MYSQL:
				switch (AgType)
				{
					case AgTypeEnum.SUM:
						if (Alias!=null)
						{
							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{
							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNT:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNTALL:
						if (Alias != null)
						{
							CurrentSQL.AddBlock("COUNT(*) AS \""+Alias+"\" ");
						}
						else
						{
							CurrentSQL.AddBlock("COUNT(*) ");
						}
					case AgTypeEnum.DISTINCT:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.AVG:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MAX:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{
							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MIN:
						if (Alias != null){
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
				}
			case DatabaseEngineEnum.ORACLE:
				switch (AgType)
				{
					case AgTypeEnum.SUM:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNT:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART() ;
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNTALL:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("COUNT(*) AS \""+Alias+"\" ");
						}
						else
						{

							CurrentSQL.AddBlock("COUNT(*) ");
						}
					case AgTypeEnum.DISTINCT:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.AVG:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MAX:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MIN:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else
						{

							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
				}
			case DatabaseEngineEnum.POSTGRESQL:
				switch (AgType)
				{
					case AgTypeEnum.SUM:
						if (Alias != null)
						{

							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNT:
						if (Alias != null){
							
							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNTALL:
						if (Alias != null){
							
							CurrentSQL.AddBlock("COUNT(*) AS \""+Alias+"\" ");
						}
						else{
							
							CurrentSQL.AddBlock("COUNT(*) ");
						}
					case AgTypeEnum.DISTINCT:
						if (Alias != null){
							
							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.AVG:
						if (Alias != null){
							
							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MAX:
						if (Alias != null)
						{
							
							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MIN:
						if (Alias != null){
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
				}
			case DatabaseEngineEnum.SQLSERVER:
				switch (AgType)
				{
					case AgTypeEnum.SUM:
						if (Alias != null){
							
							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("SUM(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNT:
						if (Alias != null){
							
							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("COUNT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.COUNTALL:
						if (Alias != null){
							
							CurrentSQL.AddBlock("COUNT(*) AS \""+Alias+"\" ");
						}
						else{
							
							CurrentSQL.AddBlock("COUNT(*) ");
						}
					case AgTypeEnum.DISTINCT:
						if (Alias != null){
							
							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("DISTINCT(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.AVG:
						if (Alias != null){
							
							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("AVG(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MAX:
						if (Alias != null){
							
							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("MAX(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
					case AgTypeEnum.MIN:
						if (Alias != null){
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") AS \"" + Alias + "\" ");
						}
						else{
							
							CurrentSQL.AddBlock("MIN(");
							Sentence.SCRIPT_PART();
							CurrentSQL.AddBlock(") ");
						}
				}
		}
	}
}
