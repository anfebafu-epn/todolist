package nMorph.framework.orm.common.ddl;


import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.DBTypeEnum;
import nMorph.framework.orm.interfaces.IColumnDefinition;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.lang.DDL;

@:keepSub @:rtti
class ConstrainPKDefinition implements IColumnDefinition {

    private var PKName:String;
    private var ColumnsNames:Array<String>;
    private var CurrentDDL:DDL;

    public function new(PKName:String, ColumnsNames:Array<String>) {
        this.PKName = PKName;
        this.ColumnsNames = ColumnsNames;
    }

    public static function SET(PKName:String, ColumnsNames:Array<String>):ConstrainPKDefinition {
        var cd:ConstrainPKDefinition = new ConstrainPKDefinition(PKName, ColumnsNames);
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
                Part += " CONSTRAINT \"PK"+PKName + "\" PRIMARY KEY ( ";
                for (columnName in ColumnsNames) {
                    Part +="\""+columnName + "\" , ";
                }
                if (Part.substr(Part.length - 2, 2) == ", ")
                    Part = Part.substr(0, Part.length - 2);
                Part += ")";

            case DatabaseEngineEnum.MYSQL:

                Part += " CONSTRAINT \"PK"+PKName + "\" PRIMARY KEY ( ";
                for (columnName in ColumnsNames) {
                    Part +=""+columnName + " , ";
                }
                if (Part.substr(Part.length - 2, 2) == ", ")
                    Part = Part.substr(0, Part.length - 2);
                Part += ")";

            case DatabaseEngineEnum.ORACLE:

                Part += " CONSTRAINT \"PK"+PKName + "\" PRIMARY KEY ( ";
                for (columnName in ColumnsNames) {
                    Part +="\""+columnName + "\" , ";
                }
                if (Part.substr(Part.length - 2, 2) == ", ")
                    Part = Part.substr(0, Part.length - 2);
                Part += ")";

            case DatabaseEngineEnum.POSTGRESQL:

                Part += " CONSTRAINT \"PK"+PKName + "\" PRIMARY KEY ( ";
                for (columnName in ColumnsNames) {
                    Part +="\""+columnName + "\" , ";
                }
                if (Part.substr(Part.length - 2, 2) == ", ")
                    Part = Part.substr(0, Part.length - 2);
                Part += ")";

            case DatabaseEngineEnum.SQLSERVER:

                Part += " CONSTRAINT \"PK"+PKName + "\" PRIMARY KEY ( ";
                for (columnName in ColumnsNames) {
                    Part +="\""+columnName + "\" , ";
                }
                if (Part.substr(Part.length - 2, 2) == ", ")
                    Part = Part.substr(0, Part.length - 2);
                Part += ")";

        }
        return Part;
    }
}
