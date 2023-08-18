package nMorph.framework.orm.common.conditions;
import nMorph.framework.orm.configuration.DatabaseEngineEnum;
import nMorph.framework.orm.common.enums.LogicOperatorEnum;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.lang.SQL;
import StringTools;

@:keepSub @:rtti
class ConditionGroup implements ICondition {

    private var LogicOperator:LogicOperatorEnum;
    private var InnerCondition:ICondition;

    private var ConditionGroups:Array<ConditionGroup> = new Array<ConditionGroup>();

    private var CurrentSQL:SQL;


    public function new(InnerCondition:ICondition, LogicOperator:LogicOperatorEnum) {
        this.InnerCondition = InnerCondition;
        this.LogicOperator = LogicOperator;
    }

    public static function SET(cond:ICondition):ConditionGroup {
        var cg:ConditionGroup = new ConditionGroup(cond, LogicOperatorEnum.START);
        cg.AddConditionGroup(cg);
        return cg;
    }

    public function AddConditionGroup(cg:ConditionGroup) {
        ConditionGroups.push(cg);
    }

    public function get_LogicOperator():LogicOperatorEnum {
        return LogicOperator;
    }

    public function get_InnerCondition():ICondition {
        return InnerCondition;
    }

    public function AND(cond:ICondition):ConditionGroup {
        var cg:ConditionGroup = new ConditionGroup(cond, LogicOperatorEnum.AND);
        cond.RegisterQuery(CurrentSQL);
        this.AddConditionGroup(cg);
        return this;
    }

    public function OR(cond:ICondition):ConditionGroup {
        var cg:ConditionGroup = new ConditionGroup(cond, LogicOperatorEnum.OR);
        cond.RegisterQuery(CurrentSQL);
        this.AddConditionGroup(cg);
        return this;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
        InnerCondition.RegisterQuery(CurrentSQL);
        for (cg in ConditionGroups) {
            if (cg != this)
                cg.RegisterQuery(CurrentSQL);
        }
    }


    public function SCRIPT_PART(?args:String) {

        switch(CurrentSQL.getCurrentEngine()){
            case DatabaseEngineEnum.GENERIC:
                
                for (cg in ConditionGroups) {
                    switch(cg.get_LogicOperator()){
                        case LogicOperatorEnum.START:

                        case LogicOperatorEnum.AND:
                            CurrentSQL.AddBlock(" AND ");
                        case LogicOperatorEnum.OR:
                            CurrentSQL.AddBlock(" OR ");
                    }
                    
                    CurrentSQL.AddBlock("(");
                    cg.get_InnerCondition().SCRIPT_PART();
                    CurrentSQL.AddBlock(") ");
                }
            case DatabaseEngineEnum.MYSQL:
                for (cg in ConditionGroups) {
                    switch(cg.get_LogicOperator()){
                        case LogicOperatorEnum.START:

                        case LogicOperatorEnum.AND:
                            CurrentSQL.AddBlock(" AND ");
                        case LogicOperatorEnum.OR:
                            CurrentSQL.AddBlock(" OR ");
                    }
                    
                    CurrentSQL.AddBlock("(");
                    cg.get_InnerCondition().SCRIPT_PART();
                    CurrentSQL.AddBlock(") ");
                }
            case DatabaseEngineEnum.ORACLE:
                for (cg in ConditionGroups) {
                    switch(cg.get_LogicOperator()){
                        case LogicOperatorEnum.START:

                        case LogicOperatorEnum.AND:
                            CurrentSQL.AddBlock(" AND ");
                        case LogicOperatorEnum.OR:
                            CurrentSQL.AddBlock(" OR ");
                    }
                    
                    CurrentSQL.AddBlock("(");
                    cg.get_InnerCondition().SCRIPT_PART();
                    CurrentSQL.AddBlock(") ");
                }
            case DatabaseEngineEnum.POSTGRESQL:
                for (cg in ConditionGroups) {
                    switch(cg.get_LogicOperator()){
                        case LogicOperatorEnum.START:

                        case LogicOperatorEnum.AND:
                            CurrentSQL.AddBlock(" AND ");
                        case LogicOperatorEnum.OR:
                            CurrentSQL.AddBlock(" OR ");
                    }
                    
                    CurrentSQL.AddBlock("(");
                    cg.get_InnerCondition().SCRIPT_PART();
                    CurrentSQL.AddBlock(") ");
                }
            case DatabaseEngineEnum.SQLSERVER:
                for (cg in ConditionGroups) {
                    switch(cg.get_LogicOperator()){
                        case LogicOperatorEnum.START:

                        case LogicOperatorEnum.AND:
                            CurrentSQL.AddBlock(" AND ");
                        case LogicOperatorEnum.OR:
                            CurrentSQL.AddBlock(" OR ");
                    }
                    
                    CurrentSQL.AddBlock("(");
                    cg.get_InnerCondition().SCRIPT_PART();
                    CurrentSQL.AddBlock(") ");
                }
        }


    }
}
