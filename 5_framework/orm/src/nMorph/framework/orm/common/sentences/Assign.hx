package nMorph.framework.orm.common.sentences;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISet;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.SQL;

@:keepSub @:rtti
class Assign implements ISet
{

	private var UpdateField:FieldSentence;
	private var SetExpression:ISentence;
	private var CurrentSQL:SQL;

	public function new(UpdateField:FieldSentence, SetExpression:ISentence)
	{
		this.UpdateField = UpdateField;
		this.SetExpression = SetExpression;
	}

	public static function SET(UpdateField:FieldSentence, SetExpression:ISentence):ISet
	{
		var as:Assign = new Assign(UpdateField, SetExpression);
		return as;
	}

	public function RegisterQuery(CurrentSQL:ILang)
	{
		this.CurrentSQL = cast(CurrentSQL, SQL);
		UpdateField.RegisterQuery(CurrentSQL);
		SetExpression.RegisterQuery(CurrentSQL);
	}

	public function SCRIPT_PART(?args:String)
	{
		switch (CurrentSQL.getCurrentEngine())
		{
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:
				if (args == "ONLYFIELD")
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
				}
				else if (args == "ONLYVALUE")
				{

					SetExpression.SCRIPT_PART();
				}
				else
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(" = ");
					SetExpression.SCRIPT_PART();
				}
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
				if (args == "ONLYFIELD")
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
				}
				else if (args == "ONLYVALUE")
				{

					SetExpression.SCRIPT_PART();
				}
				else
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(" = ");
					SetExpression.SCRIPT_PART();
				}
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
				if (args == "ONLYFIELD")
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
				}
				else if (args == "ONLYVALUE")
				{

					SetExpression.SCRIPT_PART();
				}
				else
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(" = ");
					SetExpression.SCRIPT_PART();
				}
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
				if (args == "ONLYFIELD")
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
				}
				else if (args == "ONLYVALUE")
				{

					SetExpression.SCRIPT_PART();
				}
				else
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(" = ");
					SetExpression.SCRIPT_PART();
				}
			case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
				if (args == "ONLYFIELD")
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
				}
				else if (args == "ONLYVALUE")
				{

					SetExpression.SCRIPT_PART();
				}
				else
				{

					UpdateField.SCRIPT_PART("ONLYNAME");
					CurrentSQL.AddBlock(" = ");
					SetExpression.SCRIPT_PART();
				}
		}
	}
}
