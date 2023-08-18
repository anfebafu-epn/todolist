package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.configuration.Configuration;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.DefaultTypeEnum;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.Context;

class DefaultClause implements IColumnDefinition
{
	private var DefaultTypeEnum:DefaultTypeEnum;
	private var Value:String;
	private var DatabaseEngineEnum:DatabaseEngineEnum;
	private var ValueInt:Null<Int>;
	private var ValueDouble:Null<Float>;
	private var ValueBool:Bool;
	private var ColumnConstraint:String;

	public function new(ColumnConstraint:String,DefaultTypeEnum:DefaultTypeEnum, ?Value:String,?ValueInt:Int,?ValueDouble:Float,?ValueBool:Bool)
	{
		this.DefaultTypeEnum = DefaultTypeEnum;
		this.ColumnConstraint = ColumnConstraint;
		this.Value = Value;
		this.ValueInt=ValueInt;
		this.ValueDouble=ValueDouble;
		this.ValueBool=ValueBool;
		this.DatabaseEngineEnum = Configuration.Data.get_CurrentDatabaseConnection().DatabaseEngine;
	}

	public static function DefaulVarChar(ColumnConstraint:String,Value:String):DefaultClause
	{
		var DefaultClause:DefaultClause = new DefaultClause(ColumnConstraint,DefaultTypeEnum.DEFVARCHAR, Value,null,null,null);
		return DefaultClause;
	}

	public static function DefaulInt(ColumnConstraint:String,Value:Int):DefaultClause
	{
		var DefaultClause:DefaultClause = new DefaultClause(ColumnConstraint,DefaultTypeEnum.DEFINT,null,Value,null,null);
		return DefaultClause;
	}

	public static function DefaulDouble(ColumnConstraint:String,Value:Float):DefaultClause
	{
		var DefaultClause:DefaultClause = new DefaultClause(ColumnConstraint,DefaultTypeEnum.DEFDOUBLE,null,null,Value,null);
		return DefaultClause;
	}

	public static function DefaulDate(ColumnConstraint:String):DefaultClause
	{
		var DefaultClause:DefaultClause = new DefaultClause(ColumnConstraint,DefaultTypeEnum.DEFDATE,null,null,null,null);
		return DefaultClause;
	}

	public static function DefaulBool(ColumnConstraint:String,Value:Bool):DefaultClause
	{
		var DefaultClause:DefaultClause = new DefaultClause(ColumnConstraint,DefaultTypeEnum.DEFBOOL,null,null,null,Value);
		return DefaultClause;
	}

	public function RegisterQuery(CurrentDDL:ILang):Void
	{
		this.DatabaseEngineEnum =   Configuration.Data.get_CurrentDatabaseConnection().DatabaseEngine;
	}

	public function SCRIPT_PART(?args:String)
	{
		switch (DatabaseEngineEnum)
		{

			case GENERIC:
				switch (DefaultTypeEnum)
				{
					case  DEFVARCHAR:
						return " SET DEFAULT '"+ Value+"'  ";
					case DEFINT:
						return " SET DEFAULT "+ValueInt+" ";
					case DEFDOUBLE:
						return " SET DEFAULT "+ValueDouble+" ";
					case DEFDATE:
						return " SET DEFAULT CURRENT_TIMESTAMP";
					case DEFBOOL:
						return " SET DEFAULT '"+ValueBool+"' ";
				}
			case MYSQL:
				switch (DefaultTypeEnum)
				{
					case DEFVARCHAR:
						return " DEFAULT '"+ Value+"'  ";
					case DEFINT:
						return " DEFAULT "+ValueInt+" ";
					case DEFDOUBLE:
						return " DEFAULT "+ValueDouble+" ";
					case DEFDATE:
						return " DEFAULT CURRENT_TIMESTAMP";
					case DEFBOOL:
						return " DEFAULT "+ValueBool+" ";
				}
			case ORACLE:
				switch (DefaultTypeEnum)
				{
					case DEFVARCHAR:
						return " DEFAULT '"+ Value+"'  ";
					case DEFINT:
						return " DEFAULT "+ValueInt+" ";
					case DEFDOUBLE:
						return " DEFAULT "+ValueDouble+" ";
					case DEFDATE:
						return " DEFAULT CURRENT_TIMESTAMP ";
					case DEFBOOL:
						return " DEFAULT "+ValueBool+" ";
				}
			case POSTGRESQL:
				switch (DefaultTypeEnum)
				{
					case DEFVARCHAR:
						return " DEFAULT '"+ Value+"'  ";
					case DEFINT:
						return " DEFAULT "+ValueInt+" ";
					case DEFDOUBLE:
						return " DEFAULT "+ValueDouble+" ";
					case DEFDATE:
						return " default (now() at time zone 'utc') ";
					case DEFBOOL:
						return " DEFAULT "+ValueBool+" ";
				}
			case SQLSERVER:
				switch (DefaultTypeEnum)
				{
					case DEFVARCHAR:
						return " CONSTRAINT \""+ColumnConstraint+"\" DEFAULT '"+ Value+"'  ";
					case DEFINT:
						return " CONSTRAINT \""+ColumnConstraint+"\" DEFAULT "+ValueInt+" ";
					case DEFDOUBLE:
						return " CONSTRAINT \""+ColumnConstraint+"\" DEFAULT "+ValueDouble+" ";
					case DEFDATE:
						return " CONSTRAINT \""+ColumnConstraint+"\" DEFAULT CURRENT_TIMESTAMP";
					case DEFBOOL:
						return " CONSTRAINT \""+ColumnConstraint+"\" DEFAULT '"+ValueBool+"' ";
				}
		}
	}

}
