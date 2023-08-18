package nMorph.framework.orm.common.ddl;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.common.clauses.ColumnsClause;
import nMorph.framework.orm.common.enums.NullableEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.tools.Context;

@:keepSub @:rtti
class ColumnDefinition implements IColumnDefinition {

    private var ColumnName:String;
    private var DataType:DBTypeEnum;
    private var Lenght:Int;
    private var Scale:Int;
    private var Nullable:NullableEnum;
    private var IsPrimaryKey:Bool;
    private var DefaultValue:IColumnDefinition;
    private var CurrentDDL:DDL;

    public function new(ColumnName:String, DataType:DBTypeEnum, Lenght:Int, Scale:Int, Nullable:NullableEnum, IsPrimaryKey:Bool, DefaultValue:IColumnDefinition) {
        this.ColumnName = ColumnName;
        this.DataType = DataType;
        this.Lenght = Lenght;
        this.Scale = Scale;
        this.Nullable = Nullable;
        this.IsPrimaryKey = IsPrimaryKey;
        this.DefaultValue = DefaultValue;
    }

    public static function SET(ColumnName:String, DataType:DBTypeEnum, Lenght:Int, Scale:Int, Nullable:NullableEnum, IsPrimaryKey:Bool, DefaultValue:IColumnDefinition):ColumnDefinition {
        var cd:ColumnDefinition = new ColumnDefinition(ColumnName, DataType, Lenght, Scale, Nullable, IsPrimaryKey, DefaultValue);
        return cd;
    }

    public function RegisterQuery(CurrentDDL:ILang):Void {
        this.CurrentDDL = cast(CurrentDDL, DDL);
    }

    public function SCRIPT_PART(?args:String) {
        var Part = "";
        if(CurrentDDL==null)
            CurrentDDL = new DDL();

        switch(CurrentDDL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:

                if (args != null) {
                    if (args == "OnlyName") {
                        Part += " \""+ColumnName + "\" ";
                    }
                    else if (args == "Alter") {
                        Part += " \""+ColumnName + "\" ";
                        switch(DataType){
                            case DBTypeEnum.SMALLINTEGER:
                                Part += "smallint ";
                            case DBTypeEnum.REAL:
                                Part += "REAL ";
                            case DBTypeEnum.NVARCHAR:
                                Part += "NVARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.NCHAR:
                                Part += "NCHAR(" + Lenght + ") ";
                            case DBTypeEnum.NBIGTEXT:
                                Part += "VARCHAR(MAX) ";
                            case DBTypeEnum.CHAR:
                                Part += "CHAR ";
                            case DBTypeEnum.BIGTEXT:
                                Part += "VARCHAR(MAX) ";

                            case DBTypeEnum.BINARY:
                                Part += "VARBINARY(MAX) ";
                            case DBTypeEnum.BOOLEAN:
                                Part += "BIT ";
                            case DBTypeEnum.DATETIME:
                                Part += "DATETIME ";
                            case DBTypeEnum.DECIMAL:
                                Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                            case DBTypeEnum.FLOAT:
                                Part += "FLOAT ";
                            case DBTypeEnum.INTEGER:
                                Part += "INT ";
                            case DBTypeEnum.BIGINTEGER:
                                Part += "bigint ";
                            case DBTypeEnum.UUID:
                                Part += "UNIQUEIDENTIFIER ";
                            case DBTypeEnum.VARCHAR:
                                Part += "VARCHAR(" + Lenght + ") ";
                        }
                        //parte de es Null
                        Part += (Nullable == NullableEnum.NULL ? " NULL " : " NOT NULL ");
                        /*if (IsPrimaryKey) {
                            Part += "PRIMARY KEY ";
                        }*/

                        if (DefaultValue != null) {
                            Part += " " + DefaultValue.SCRIPT_PART() + " ";
                        }
                    }
                }
                else {
                    Part += " \""+ColumnName + "\" " ;

                    switch(DataType){
                        case DBTypeEnum.SMALLINTEGER:
                            Part += "smallint ";
                        case DBTypeEnum.REAL:
                            Part += "REAL ";
                        case DBTypeEnum.NVARCHAR:
                            Part += "NVARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.NCHAR:
                            Part += "NCHAR(" + Lenght + ") ";
                        case DBTypeEnum.NBIGTEXT:
                            Part += "VARCHAR(MAX) ";
                        case DBTypeEnum.CHAR:
                            Part += "CHAR ";
                        case DBTypeEnum.BIGTEXT:
                            Part += "VARCHAR(MAX) ";

                        case DBTypeEnum.BINARY:
                            Part += "VARBINARY(MAX) ";
                        case DBTypeEnum.BOOLEAN:
                            Part += "BIT ";
                        case DBTypeEnum.DATETIME:
                            Part += "DATETIME ";
                        case DBTypeEnum.DECIMAL:
                            Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                        case DBTypeEnum.FLOAT:
                            Part += "FLOAT ";
                        case DBTypeEnum.INTEGER:
                            Part += "INT ";
                        case DBTypeEnum.BIGINTEGER:
                            Part += "bigint ";
                        case DBTypeEnum.UUID:
                            Part += "UNIQUEIDENTIFIER ";
                        case DBTypeEnum.VARCHAR:
                            Part += "VARCHAR(" + Lenght + ") ";
                    }

                    Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                    if (IsPrimaryKey) {
                        Part += "PRIMARY KEY ";
                    }

                    if (DefaultValue != null) {
                        Part += " " + DefaultValue.SCRIPT_PART() + " ";
                    }
                }

            case DatabaseEngineEnum.MYSQL:

                if (args != null) {
                    if (args == "OnlyName") {
                        Part += " \""+ColumnName + "\" ";
                    }
                    else if (args == "Alter") {
                        Part += " \""+ColumnName + "\" ";
                        switch(DataType){
                            case DBTypeEnum.SMALLINTEGER:
                                Part += "SMALLINT ";
                            case DBTypeEnum.REAL:
                                Part += "REAL ";
                            case DBTypeEnum.NVARCHAR:
                                Part += "NVARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.NCHAR:
                                Part += "NCHAR ";
                            case DBTypeEnum.NBIGTEXT:
                                Part += "VARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.CHAR:
                                Part += "CHAR ";
                            case DBTypeEnum.BIGTEXT:
                                Part += "LONGTEXT ";

                            case DBTypeEnum.BINARY:
                                Part += "LONGBLOB ";
                            case DBTypeEnum.BOOLEAN:
                                Part += "BIT ";
                            case DBTypeEnum.DATETIME:
                                Part += "DATETIME ";
                            case DBTypeEnum.DECIMAL:
                                Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                            case DBTypeEnum.FLOAT:
                                Part += "FLOAT ";
                            case DBTypeEnum.INTEGER:
                                Part += "INT ";
                            case DBTypeEnum.BIGINTEGER:
                                Part += "LONG ";
                            case DBTypeEnum.UUID:
                                Part += "VARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.VARCHAR:
                                Part += "VARCHAR(" + Lenght + ") ";
                        }
                        Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                        /*if (IsPrimaryKey) {
                            Part += "PRIMARY KEY ";
                        }*/

                        if (DefaultValue != null) {
                            Part += " " + DefaultValue.SCRIPT_PART() + " ";
                        }
                    }
                }
                else {
                    Part += " \""+ColumnName + "\" " ;

                    switch(DataType){
                        case DBTypeEnum.SMALLINTEGER:
                            Part += "SMALLINT ";
                        case DBTypeEnum.REAL:
                            Part += "REAL ";
                        case DBTypeEnum.NVARCHAR:
                            Part += "NVARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.NCHAR:
                            Part += "NCHAR ";
                        case DBTypeEnum.NBIGTEXT:
                            Part += "VARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.CHAR:
                            Part += "CHAR ";
                        case DBTypeEnum.BIGTEXT:
                            Part += "LONGTEXT ";

                        case DBTypeEnum.BINARY:
                            Part += "LONGBLOB ";
                        case DBTypeEnum.BOOLEAN:
                            Part += "BIT ";
                        case DBTypeEnum.DATETIME:
                            Part += "DATETIME ";
                        case DBTypeEnum.DECIMAL:
                            Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                        case DBTypeEnum.FLOAT:
                            Part += "FLOAT ";
                        case DBTypeEnum.INTEGER:
                            Part += "INT ";
                        case DBTypeEnum.BIGINTEGER:
                            Part += "LONG ";
                        case DBTypeEnum.UUID:
                            Part += "VARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.VARCHAR:
                            Part += "VARCHAR(" + Lenght + ") ";
                    }

                    Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                    if (IsPrimaryKey) {
                        Part += "PRIMARY KEY ";
                    }

                    if (DefaultValue != null) {
                        Part += " " + DefaultValue.SCRIPT_PART() + " ";
                    }
                }

            case DatabaseEngineEnum.ORACLE:

                if (args != null) {
                    if (args == "OnlyName") {
                        Part += " \""+ColumnName + "\" ";
                    }
                    else if (args == "Alter") {
                        Part +=" \""+ ColumnName + "\" ";
                        switch(DataType){
                            case DBTypeEnum.SMALLINTEGER:
                                Part += "NUMBER (" + Lenght + ") ";
                            case DBTypeEnum.REAL:
                                Part += "REAL ";
                            case DBTypeEnum.NVARCHAR:
                                Part += "NVARCHAR2(" + Lenght + ") ";
                            case DBTypeEnum.NCHAR:
                                Part += "NCHAR ";
                            case DBTypeEnum.NBIGTEXT:
                                Part += "VARCHAR2(" + Lenght + ") ";
                            case DBTypeEnum.CHAR:
                                Part += "CHAR ";
                            case DBTypeEnum.BIGTEXT:
                                Part += "VARCHAR2(" + Lenght + ") ";

                            case DBTypeEnum.BINARY:
                                Part += "BLOB ";
                            case DBTypeEnum.BOOLEAN:
                                Part += "NUMBER(1) ";
                            case DBTypeEnum.DATETIME:
                                Part += "DATE ";
                            case DBTypeEnum.DECIMAL:
                                Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                            case DBTypeEnum.FLOAT:
                                Part += "FLOAT ";
                            case DBTypeEnum.INTEGER:
                                Part += "NUMBER (" + Lenght + ") ";
                            case DBTypeEnum.BIGINTEGER:
                                Part += "LONG ";
                            case DBTypeEnum.UUID:
                                Part += "VARCHAR2(" + Lenght + ") ";
                            case DBTypeEnum.VARCHAR:
                                Part += "VARCHAR2(" + Lenght + ") ";
                        }
                        //parte de es Null
                        Part += (Nullable == NullableEnum.NULL ? " NULL " : " NOT NULL ");
                        /*if (IsPrimaryKey) {
                            Part += "PRIMARY KEY ";
                        }*/

                        if (DefaultValue != null) {
                            Part += " " + DefaultValue.SCRIPT_PART() + " ";
                        }
                    }
                }
                else {
                    Part += " \""+ColumnName + "\" " ;

                    switch(DataType){
                        case DBTypeEnum.SMALLINTEGER:
                            Part += "NUMBER (" + Lenght + ") ";
                        case DBTypeEnum.REAL:
                            Part += "REAL ";
                        case DBTypeEnum.NVARCHAR:
                            Part += "NVARCHAR2(" + Lenght + ") ";
                        case DBTypeEnum.NCHAR:
                            Part += "NCHAR ";
                        case DBTypeEnum.NBIGTEXT:
                            Part += "VARCHAR2(" + Lenght + ") ";
                        case DBTypeEnum.CHAR:
                            Part += "CHAR ";
                        case DBTypeEnum.BIGTEXT:
                            Part += "VARCHAR2(" + Lenght + ") ";

                        case DBTypeEnum.BINARY:
                            Part += "BLOB ";
                        case DBTypeEnum.BOOLEAN:
                            Part += "NUMBER(1) ";
                        case DBTypeEnum.DATETIME:
                            Part += "DATE ";
                        case DBTypeEnum.DECIMAL:
                            Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                        case DBTypeEnum.FLOAT:
                            Part += "FLOAT ";
                        case DBTypeEnum.INTEGER:
                            Part += "NUMBER (" + Lenght + ") ";
                        case DBTypeEnum.BIGINTEGER:
                            Part += "LONG ";
                        case DBTypeEnum.UUID:
                            Part += "VARCHAR2(" + Lenght + ") ";
                        case DBTypeEnum.VARCHAR:
                            Part += "VARCHAR2(" + Lenght + ") ";
                    }

                    if (DefaultValue != null) {
                        Part += " " + DefaultValue.SCRIPT_PART() + " ";
                    }

                    Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                    if (IsPrimaryKey) {
                        Part += "PRIMARY KEY ";
                    }


                }

            case DatabaseEngineEnum.POSTGRESQL:

                if (args != null) {
                    if (args == "OnlyName") {
                        Part += " \""+ColumnName + "\" ";
                    }
                    else if (args == "Alter") {
                        Part += " \""+ColumnName + "\" ";
                        switch(DataType){
                            case DBTypeEnum.SMALLINTEGER:
                                Part += "smallint ";
                            case DBTypeEnum.REAL:
                                Part += "REAL ";
                            case DBTypeEnum.NVARCHAR:
                                Part += "VARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.NCHAR:
                                Part += "CHAR(" + Lenght + ") ";
                            case DBTypeEnum.NBIGTEXT:
                                Part += "text ";
                            case DBTypeEnum.CHAR:
                                Part += "CHAR(" + Lenght + ") ";
                            case DBTypeEnum.BIGTEXT:
                                Part += "text ";
                            case DBTypeEnum.BINARY:
                                Part += "bytea ";
                            case DBTypeEnum.BOOLEAN:
                                Part += "BIT ";
                            case DBTypeEnum.DATETIME:
                                Part += "timestamp with time zone ";
                            case DBTypeEnum.DECIMAL:
                                Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                            case DBTypeEnum.FLOAT:
                                Part += "FLOAT ";
                            case DBTypeEnum.INTEGER:
                                Part += "integer ";
                            case DBTypeEnum.BIGINTEGER:
                                Part += "bigint ";
                            case DBTypeEnum.UUID:
                                Part += "VARCHAR(" + Lenght + ") ";
                            case DBTypeEnum.VARCHAR:
                                Part += "VARCHAR(" + Lenght + ") ";
                        }
                        //parte de es Null
                        Part += (Nullable == NullableEnum.NULL ? " NULL " : " NOT NULL ");
                        /*if (IsPrimaryKey) {
                            Part += "PRIMARY KEY ";
                        }*/

                        if (DefaultValue != null) {
                            Part += " " + DefaultValue.SCRIPT_PART() + " ";
                        }
                    }
                }
                else {
                    Part +=" \""+ ColumnName + "\" " ;

                    switch(DataType){
                        case DBTypeEnum.SMALLINTEGER:
                            Part += "smallint ";
                        case DBTypeEnum.REAL:
                            Part += "REAL ";
                        case DBTypeEnum.NVARCHAR:
                            Part += "VARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.NCHAR:
                            Part += "CHAR(" + Lenght + ") ";
                        case DBTypeEnum.NBIGTEXT:
                            Part += "text ";
                        case DBTypeEnum.CHAR:
                            Part += "CHAR(" + Lenght + ") ";
                        case DBTypeEnum.BIGTEXT:
                            Part += "text ";
                        case DBTypeEnum.BINARY:
                            Part += "bytea ";
                        case DBTypeEnum.BOOLEAN:
                            Part += "BIT ";
                        case DBTypeEnum.DATETIME:
                            Part += "timestamp with time zone ";
                        case DBTypeEnum.DECIMAL:
                            Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                        case DBTypeEnum.FLOAT:
                            Part += "FLOAT ";
                        case DBTypeEnum.INTEGER:
                            Part += "integer ";
                        case DBTypeEnum.BIGINTEGER:
                            Part += "bigint ";
                        case DBTypeEnum.UUID:
                            Part += "VARCHAR(" + Lenght + ") ";
                        case DBTypeEnum.VARCHAR:
                            Part += "VARCHAR(" + Lenght + ") ";
                    }

                    Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                    if (IsPrimaryKey) {
                        Part += "PRIMARY KEY ";
                    }

                    if (DefaultValue != null) {
                        Part += " " + DefaultValue.SCRIPT_PART() + " ";
                    }
                }

            case DatabaseEngineEnum.SQLSERVER:

                if (args != null) {
                    if (args == "OnlyName") {
                        Part += " \""+ColumnName + "\" ";
                    }
                    else if (args == "Alter") {
                        Part += " \""+ColumnName + "\" ";
                        switch(DataType){
                            case DBTypeEnum.SMALLINTEGER:
                                Part += "smallint ";
                            case DBTypeEnum.REAL:
                                Part += "REAL ";
                            case DBTypeEnum.NVARCHAR:
                                Part += "NVARCHAR ";
                            case DBTypeEnum.NCHAR:
                                Part += "NCHAR ";
                            case DBTypeEnum.NBIGTEXT:
                                Part += "VARCHAR(MAX) ";
                            case DBTypeEnum.CHAR:
                                Part += "CHAR ";
                            case DBTypeEnum.BIGTEXT:
                                Part += "VARCHAR(MAX) ";
                            case DBTypeEnum.BINARY:
                                Part += "VARBINARY(MAX) ";
                            case DBTypeEnum.BOOLEAN:
                                Part += "BIT ";
                            case DBTypeEnum.DATETIME:
                                Part += "DATETIME ";
                            case DBTypeEnum.DECIMAL:
                                Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                            case DBTypeEnum.FLOAT:
                                Part += "FLOAT ";
                            case DBTypeEnum.INTEGER:
                                Part += "INT ";
                            case DBTypeEnum.BIGINTEGER:
                                Part += "bigint ";
                            case DBTypeEnum.UUID:
                                Part += "UNIQUEIDENTIFIER ";
                            case DBTypeEnum.VARCHAR:
                                Part += "VARCHAR(" + Lenght + ") ";
                        }
                        //parte de es Null
                        Part += (Nullable == NullableEnum.NULL ? " NULL " : " NOT NULL ");
                        /*if (IsPrimaryKey) {
                            Part += "PRIMARY KEY ";
                        }*/

                        if (DefaultValue != null) {
                            Part += " " + DefaultValue.SCRIPT_PART() + " ";
                        }
                    }
                }
                else {
                    Part += " \""+ColumnName + "\" " ;

                    switch(DataType){
                        case DBTypeEnum.SMALLINTEGER:
                            Part += "smallint ";
                        case DBTypeEnum.REAL:
                            Part += "REAL ";
                        case DBTypeEnum.NVARCHAR:
                            Part += "NVARCHAR ";
                        case DBTypeEnum.NCHAR:
                            Part += "NCHAR ";
                        case DBTypeEnum.NBIGTEXT:
                            Part += "VARCHAR(MAX) ";
                        case DBTypeEnum.CHAR:
                            Part += "CHAR ";
                        case DBTypeEnum.BIGTEXT:
                            Part += "VARCHAR(MAX) ";
                        case DBTypeEnum.BINARY:
                            Part += "VARBINARY(MAX) ";
                        case DBTypeEnum.BOOLEAN:
                            Part += "BIT ";
                        case DBTypeEnum.DATETIME:
                            Part += "DATETIME ";
                        case DBTypeEnum.DECIMAL:
                            Part += "DECIMAL (" + Lenght + "," + Scale + ") ";
                        case DBTypeEnum.FLOAT:
                            Part += "FLOAT ";
                        case DBTypeEnum.INTEGER:
                            Part += "INT ";
                        case DBTypeEnum.BIGINTEGER:
                            Part += "bigint ";
                        case DBTypeEnum.UUID:
                            Part += "UNIQUEIDENTIFIER ";
                        case DBTypeEnum.VARCHAR:
                            Part += "VARCHAR(" + Lenght + ") ";
                    }

                    Part += (Nullable == NullableEnum.NULL ? "NULL " : "NOT NULL ");
                    if (IsPrimaryKey) {
                        Part += "PRIMARY KEY ";
                    }

                    if (DefaultValue != null) {
                        Part += " " + DefaultValue.SCRIPT_PART() + " ";
                    }
                }

        }
        return Part;
    }
}
