package nMorph.framework.orm.common.sentences;

import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.lang.DDL;

@:keepSub @:rtti
class FielIndexDefinitionSentences implements ISentence
{

	@:isVar public var FieldName(get, null):String;
	@:isVar public var FieldTable(get, null):String;
	@:isVar public var CurrentDDL(get, null):DDL;

	public function new(FieldTable:String, FieldName:String)
	{
		this.FieldName = "\""+FieldName+"\"";//ajuste compartible con bases de datos excepto mysql adaptacion en connector
		this.FieldTable = "\""+FieldTable+"\"";
	}

	public function RegisterQuery(CurrentDDL:ILang)
	{
		this.CurrentDDL = cast(CurrentDDL, DDL);
	}

	public function IsNullValue():Bool
	{
		return false;
	}

	function get_FieldName():String
	{
		return FieldName;
	}

	function get_FieldTable():String
	{
		return FieldTable;
	}

	function get_CurrentDDL():DDL
	{
		return CurrentDDL;
	}

	public function SCRIPT_PART(?args:String) {
		switch (CurrentDDL.getCurrentEngine())
		{
			case DatabaseEngineEnum.GENERIC:
				if (args != null)
				{
					if (args == "ONLYNAME")
					{
						CurrentDDL.AddBlock(FieldName);
					}
					else if (args == "WITHTABLE")
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
					else
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
				}
				else
				{
					CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
				}
			case DatabaseEngineEnum.MYSQL:
				if (args != null)
				{
					if (args == "ONLYNAME")
					{
						CurrentDDL.AddBlock(FieldName);
					}
					else if (args == "WITHTABLE")
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
					else
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
				}
				else
				{
					CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
				}
			case DatabaseEngineEnum.ORACLE:
				if (args != null)
				{
					if (args == "ONLYNAME")
					{
						CurrentDDL.AddBlock(FieldName);
					}
					else if (args == "WITHTABLE")
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
					else
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
				}
				else
				{
					CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
				}
			case DatabaseEngineEnum.POSTGRESQL:
				if (args != null)
				{
					if (args == "ONLYNAME")
					{
						CurrentDDL.AddBlock(FieldName);
					}
					else if (args == "WITHTABLE")
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
					else
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
				}
				else
				{
					CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
				}
			case DatabaseEngineEnum.SQLSERVER:
				if (args != null)
				{
					if (args == "ONLYNAME")
					{
						CurrentDDL.AddBlock(FieldName);
					}
					else if (args == "WITHTABLE")
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
					else
					{
						CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
					}
				}
				else
				{
					CurrentDDL.AddBlock(FieldTable + "(" + FieldName+")");
				}
		}
	}
}