package nMorph.framework.orm;
import nMorph.framework.orm.client.ChangeItem;
import nMorph.framework.orm.client.Connector;
import nMorph.framework.orm.client.ModelArray;
import nMorph.framework.orm.client.ModelItem;
import nMorph.framework.orm.client.ModelObject;
import nMorph.framework.orm.client.QueryColumn;
import nMorph.framework.orm.client.QueryParameter;
import nMorph.framework.orm.client.QueryRow;
import nMorph.framework.orm.client.QuerySet;
import nMorph.framework.orm.client.QueryTable;
import nMorph.framework.orm.client.QueueItem;
import nMorph.framework.orm.common.clauses.ColumnsClause;
import nMorph.framework.orm.common.clauses.DeleteClause;
import nMorph.framework.orm.common.ddl.ExistClause;
import nMorph.framework.orm.common.clauses.FromClause;
import nMorph.framework.orm.common.clauses.GroupByClause;
import nMorph.framework.orm.common.clauses.HavingClause;
import nMorph.framework.orm.common.clauses.InsertIntoClause;
import nMorph.framework.orm.common.clauses.InsertSetClause;
import nMorph.framework.orm.common.clauses.JoinClause;
import nMorph.framework.orm.common.clauses.OrderByClause;
import nMorph.framework.orm.common.clauses.SelectClause;
import nMorph.framework.orm.common.clauses.SetClause;
import nMorph.framework.orm.lang.DDL;
import nMorph.framework.orm.lang.SQL;
import nMorph.framework.orm.tools.*;
import nMorph.framework.orm.common.clauses.*;
import nMorph.framework.orm.common.conditions.*;
import nMorph.framework.orm.common.ddl.*;
import nMorph.framework.orm.common.enums.*;
import nMorph.framework.orm.common.sentences.*;
import nMorph.framework.orm.common.sources.*;
import nMorph.framework.orm.common.fields.*;
import nMorph.framework.orm.client.*;
import nMorph.framework.orm.interfaces.*;

/**
 * ...
 * @author ...
 */
class ORM
{

	public function new()
	{

	}

	public static function main()
	{
		// base.clauses
		Type.getClass(ColumnsClause);
		Type.getClass(DeleteClause);
		Type.getClass(ExistClause);
		Type.getClass(FromClause);
		Type.getClass(GroupByClause);
		Type.getClass(HavingClause);
		Type.getClass(InsertIntoClause);
		Type.getClass(InsertSetClause);
		Type.getClass(JoinClause);
		Type.getClass(OrderByClause);
		Type.getClass(SelectClause);
		Type.getClass(SetClause);
		Type.getClass(UnionClause);
		Type.getClass(UpdateClause);
		Type.getClass(ValuesClause);
		Type.getClass(WhereClause);
		
		// base.conditions
		Type.getClass(Condition);
		Type.getClass(ConditionGroup);
		
		// base.ddl
		Type.getClass(AddColumnClause);
		Type.getClass(AddDefaultValueClause);
		Type.getClass(AddForeignKeyClause);
		Type.getClass(AddPrimaryKeyClause);
		Type.getClass(AlterColumnClause);
		Type.getClass(AlterTableClause);
		Type.getClass(AlterViewClause);
		Type.getClass(ColumnDefinition);
		Type.getClass(ConstrainPKDefinition);
		Type.getClass(CreateIndexClause);
		Type.getClass(CreateTableClause);
		Type.getClass(CreateViewClause);
		Type.getClass(DefaultClause);
		Type.getClass(DropColumnClause);
		Type.getClass(DropConstraintClause);
		Type.getClass(DropIndexClause);
		Type.getClass(DropPrimaryKeyClause);
		Type.getClass(DropTableClause);
		Type.getClass(DropViewClause);
		
		//base.enums
		Type.getClass(AgTypeEnum);
		Type.getClass(CastTypeEnum);
		Type.getClass(ChangeTypeEnum);
		Type.getClass(DBTypeEnum);
		Type.getClass(DefaultTypeEnum);
		Type.getClass(FnTypeEnum);
		Type.getClass(HaxeTypeEnum);
		Type.getClass(JoinTypeEnum);
		Type.getClass(LogicOperatorEnum);
		Type.getClass(MtTypeEnum);
		Type.getClass(NullableEnum);
		Type.getClass(ObjectEditTypeEnum);
		Type.getClass(ObjectSourceTypeEnum);
		Type.getClass(Op);
		Type.getClass(ParameterDirectionEnum);
		Type.getClass(StTypeEnum);
		Type.getClass(UnionTypeEnum);
		Type.getClass(ValuesTypeEnum);
		
		// base.fields
		Type.getClass(BigIntegerSentence);
		Type.getClass(BigTextSentence);
		Type.getClass(BinarySentence);
		Type.getClass(BooleanSentence);
		Type.getClass(CharSentence);
		Type.getClass(DateTimeSentence);
		Type.getClass(DecimalSentence);
		Type.getClass(FloatSentence);
		Type.getClass(IntegerSentence);
		Type.getClass(NBigTextSentence);
		Type.getClass(NCharSentence);
		Type.getClass(NVarcharSentence);
		Type.getClass(RealSentence);
		Type.getClass(SmallIntegerSentence);
		Type.getClass(UUIDSentence);
		Type.getClass(VarcharSentence);
		
		// base.sentences
		Type.getClass(Ag);
		Type.getClass(Assign);
		Type.getClass(Cast);
		Type.getClass(FieldAliasSentence);
		Type.getClass(FieldSentence);
		Type.getClass(FielIndexDefinitionSentences);
		Type.getClass(Fn);
		Type.getClass(Mt);
		Type.getClass(St);
		Type.getClass(SubQuerySentence);
		Type.getClass(Val);
		
		// base.sources
		Type.getClass(AliasSource);
		Type.getClass(InlineViewSource);
		Type.getClass(StringSource);
		Type.getClass(TableSource);
		Type.getClass(ViewSource);
		
		// base.client
		Type.getClass(ChangeItem);
		Type.getClass(Connector);
		Type.getClass(QueryColumn);
		Type.getClass(QueryRow);
		Type.getClass(QuerySet);
		Type.getClass(QueryTable);
		Type.getClass(ModelArray);
		Type.getClass(ModelItem);
		Type.getClass(ModelObject);
		Type.getClass(QueryParameter);
		Type.getClass(QueueItem);
		
		//lang
		Type.getClass(DDL);
		Type.getClass(SQL);
		Type.getClass(Context);
		Type.getClass(BulkRun);
		
	}

}