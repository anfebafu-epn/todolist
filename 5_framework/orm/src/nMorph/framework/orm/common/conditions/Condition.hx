package nMorph.framework.orm.common.conditions;

import nMorph.framework.orm.common.enums.LogicOperatorEnum;
import nMorph.framework.orm.common.enums.Op;
import nMorph.framework.orm.interfaces.ILang;
import nMorph.framework.orm.interfaces.ISentence;
import nMorph.framework.orm.interfaces.ICondition;
import nMorph.framework.orm.lang.SQL;


@:keepSub @:rtti
class Condition implements ICondition {

    private var BaseExpression:ISentence;
    private var Operator:Op;
    private var ExpressionToCompare:ISentence;
    @:isVar public var LogicOperator(null, set):LogicOperatorEnum;
    private var Conditions:Array<ICondition> = new Array<ICondition>();
    private var CurrentSQL:SQL;

    public function new(BaseExpression:ISentence, Operator:Op, ExpressionToCompare:ISentence, LogicOperator:LogicOperatorEnum) {
        this.BaseExpression = BaseExpression;
        this.Operator = Operator;
        this.ExpressionToCompare = ExpressionToCompare;
        this.LogicOperator = LogicOperator;
    }

    public static function SET(BaseExpression:ISentence, Operator:Op, ExpressionToCompare:ISentence):Condition {
        var c:Condition = new Condition(BaseExpression, Operator, ExpressionToCompare, LogicOperatorEnum.START);
        return c;
    }

    public function RegisterQuery(CurrentSQL:ILang) {
        this.CurrentSQL = cast(CurrentSQL, SQL);
        this.BaseExpression.RegisterQuery(CurrentSQL);
        this.ExpressionToCompare.RegisterQuery(CurrentSQL);

        for (cond in Conditions) {
            cond.RegisterQuery(CurrentSQL);
        }
    }

    public function AND_Ex(BaseExpression:ISentence, Operator:Op, ExpressionToCompare:ISentence):Condition {
        var c:Condition = new Condition(BaseExpression, Operator, ExpressionToCompare, LogicOperatorEnum.AND);
        BaseExpression.RegisterQuery(CurrentSQL);
        ExpressionToCompare.RegisterQuery(CurrentSQL);
        c.RegisterQuery(CurrentSQL);
        this.Conditions.push(c);
        return this;
    }

    public function AND(AndCondition:Condition):Condition {
        AndCondition.set_LogicOperator(LogicOperatorEnum.AND);
        BaseExpression.RegisterQuery(CurrentSQL);
        ExpressionToCompare.RegisterQuery(CurrentSQL);
        AndCondition.RegisterQuery(CurrentSQL);
        this.Conditions.push(AndCondition);
        return this;
    }

    public function OR_Ex(BaseExpression:ISentence, Operator:Op, ExpressionToCompare:ISentence):Condition {
        var c:Condition = new Condition(BaseExpression, Operator, ExpressionToCompare, LogicOperatorEnum.OR);
        BaseExpression.RegisterQuery(CurrentSQL);
        ExpressionToCompare.RegisterQuery(CurrentSQL);
        c.RegisterQuery(CurrentSQL);
        this.Conditions.push(c);
        return this;
    }

    public function OR(OrCondition:Condition):Condition {
        OrCondition.set_LogicOperator(LogicOperatorEnum.OR);
        BaseExpression.RegisterQuery(CurrentSQL);
        ExpressionToCompare.RegisterQuery(CurrentSQL);
        OrCondition.RegisterQuery(CurrentSQL);
        this.Conditions.push(OrCondition);
        return this;
    }

    public function AddCondition(ConditionToAdd:ICondition) {
        ConditionToAdd.RegisterQuery(CurrentSQL);
        Conditions.push(ConditionToAdd);
    }

    public function SCRIPT_PART(?args:String) {
        

        switch(CurrentSQL.getCurrentEngine())
        {
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:

                if (this.LogicOperator == LogicOperatorEnum.START) {
                    RenderCurrentCondition();

// en la primera condición se almacena un arreglo para las demás condiciones concatenadas con operadores lógicos. Se itera para generar las condiciones internas
                    for (condition in Conditions)
                        condition.SCRIPT_PART();
                }
                else if (this.LogicOperator == LogicOperatorEnum.AND) {
                    CurrentSQL.AddBlock(" AND ");
                    RenderCurrentCondition();
                }
                else if (this.LogicOperator == LogicOperatorEnum.OR) {
                    CurrentSQL.AddBlock(" OR ");
                    RenderCurrentCondition();
                }

            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:

                if (this.LogicOperator == LogicOperatorEnum.START) {
                    RenderCurrentCondition();

// en la primera condición se almacena un arreglo para las demás condiciones concatenadas con operadores lógicos. Se itera para generar las condiciones internas
                    for (condition in Conditions)
                        condition.SCRIPT_PART();
                }
                else if (this.LogicOperator == LogicOperatorEnum.AND) {
                    CurrentSQL.AddBlock(" AND ");
                    RenderCurrentCondition();
                }
                else if (this.LogicOperator == LogicOperatorEnum.OR) {
                    CurrentSQL.AddBlock(" OR ");
                    RenderCurrentCondition();
                }

            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:

                if (this.LogicOperator == LogicOperatorEnum.START) {
                    RenderCurrentCondition();

// en la primera condición se almacena un arreglo para las demás condiciones concatenadas con operadores lógicos. Se itera para generar las condiciones internas
                    for (condition in Conditions)
                        condition.SCRIPT_PART();
                }
                else if (this.LogicOperator == LogicOperatorEnum.AND) {
                    CurrentSQL.AddBlock(" AND ");
                    RenderCurrentCondition();
                }
                else if (this.LogicOperator == LogicOperatorEnum.OR) {
                    CurrentSQL.AddBlock(" OR ");
                    RenderCurrentCondition();
                }

            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:

                if (this.LogicOperator == LogicOperatorEnum.START) {
                    RenderCurrentCondition();

// en la primera condición se almacena un arreglo para las demás condiciones concatenadas con operadores lógicos. Se itera para generar las condiciones internas
                    for (condition in Conditions)
                        condition.SCRIPT_PART();
                }
                else if (this.LogicOperator == LogicOperatorEnum.AND) {
                    CurrentSQL.AddBlock(" AND ");
                    RenderCurrentCondition();
                }
                else if (this.LogicOperator == LogicOperatorEnum.OR) {
                    CurrentSQL.AddBlock(" OR ");
                    RenderCurrentCondition();
                }

            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:

                if (this.LogicOperator == LogicOperatorEnum.START) {
                    RenderCurrentCondition();

// en la primera condición se almacena un arreglo para las demás condiciones concatenadas con operadores lógicos. Se itera para generar las condiciones internas
                    for (condition in Conditions)
                        condition.SCRIPT_PART();
                }
                else if (this.LogicOperator == LogicOperatorEnum.AND) {
                    CurrentSQL.AddBlock(" AND ");
                    RenderCurrentCondition();
                }
                else if (this.LogicOperator == LogicOperatorEnum.OR) {
                    CurrentSQL.AddBlock(" OR ");
                    RenderCurrentCondition();
                }
        }
    }

    private function RenderCurrentCondition() {
        switch(CurrentSQL.getCurrentEngine()){
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.GENERIC:

                
                BaseExpression.SCRIPT_PART();
                
                if (ExpressionToCompare.IsNullValue()) {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" is not NULL ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                    }
                }
                else {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" <> ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" = ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" in ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" < ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" <= ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" like ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" > ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" >= ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" not in ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" not like ");
                    }

                    ExpressionToCompare.SCRIPT_PART();
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.MYSQL:
                
                BaseExpression.SCRIPT_PART();
                
                if (ExpressionToCompare.IsNullValue()) {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" is not NULL ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                    }
                }
                else {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" <> ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" = ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" in ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" < ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" <= ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" like ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" > ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" >= ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" not in ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" not like ");
                    }

                    ExpressionToCompare.SCRIPT_PART();
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.ORACLE:
                
                BaseExpression.SCRIPT_PART();
                
                if (ExpressionToCompare.IsNullValue()) {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" is not NULL ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                    }
                }
                else {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" <> ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" = ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" in ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" < ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" <= ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" like ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" > ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" >= ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" not in ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" not like ");
                    }

                    ExpressionToCompare.SCRIPT_PART();
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.POSTGRESQL:
                
                BaseExpression.SCRIPT_PART();
                
                if (ExpressionToCompare.IsNullValue()) {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" is not NULL ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                    }
                }
                else {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" <> ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" = ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" in ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" < ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" <= ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" like ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" > ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" >= ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" not in ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" not like ");
                    }

                    ExpressionToCompare.SCRIPT_PART();
                }
            case nMorph.framework.orm.configuration.DatabaseEngineEnum.SQLSERVER:
                
                BaseExpression.SCRIPT_PART();
                
                if (ExpressionToCompare.IsNullValue()) {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" is not NULL ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" is NULL ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" is NULL ");
                    }
                }
                else {
                    switch(this.Operator){
                        case Op.Different:
                            CurrentSQL.AddBlock(" <> ");
                        case Op.Equal:
                            CurrentSQL.AddBlock(" = ");
                        case Op.IN:
                            CurrentSQL.AddBlock(" in ");
                        case Op.LessThan:
                            CurrentSQL.AddBlock(" < ");
                        case Op.LessThanAndEquals:
                            CurrentSQL.AddBlock(" <= ");
                        case Op.LIKE:
                            CurrentSQL.AddBlock(" like ");
                        case Op.MoreThan:
                            CurrentSQL.AddBlock(" > ");
                        case Op.MoreThanAndEquals:
                            CurrentSQL.AddBlock(" >= ");
                        case Op.NotIN:
                            CurrentSQL.AddBlock(" not in ");
                        case Op.NotLIKE:
                            CurrentSQL.AddBlock(" not like ");
                    }

                    ExpressionToCompare.SCRIPT_PART();
                }
        }
    }

    public function set_LogicOperator(value:LogicOperatorEnum) {
        return this.LogicOperator = value;
    }

}
