package nMorph.core.db.sw_todolist;
import nMorph.framework.common.datatypes.UUID;

import nMorph.framework.orm.client.*;
import nMorph.framework.orm.interfaces.*;
import nMorph.framework.orm.lang.*;
import nMorph.framework.orm.tools.*;
import nMorph.framework.orm.common.clauses.*;
import nMorph.framework.orm.common.conditions.*;
import nMorph.framework.orm.common.enums.*;
import nMorph.framework.orm.common.fields.*;
import nMorph.framework.orm.common.sentences.*;
import nMorph.framework.orm.common.sources.*;
/**
 * ...
 * @author Smartwork
 */
@:keepSub @:rtti
class Category extends ModelObject
{
	/**
	 * Constructor de la clase Category que tiene equivalencia con la tabla de la base de datos
	 */
	public function new()
	{
		//inicializamos la herencia
		super();
		//inicialización de arreglos de objetos internos
	}
	/**
	 * referencia a tabla para consultas
	 */
	public static var table:ISource = new TableSource("Category");
	/**
	 * Referencia a columna CategoryId
	 */
		public static var col_CategoryId: UUIDSentence = new UUIDSentence("Category", "CategoryId", NullableEnum.NOTNULL, true);

	/**
	 * Referencia a columna CategoryName
	 */
		public static var col_CategoryName: VarcharSentence = new VarcharSentence("Category", "CategoryName", 50, NullableEnum.NOTNULL, false);

	/**
	 * inicio rápido de filtro
	 * @param	Filtro
	 * @return objeto para aplicar otras condiciones o ejecutar el query
	 */
	public static function WHERE(Condition:ICondition):WhereClause
	{
		return SQL.SELECT().FROM(table).WHERE(Condition);
	}
	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 */
	public static function BYPK(val_CategoryId:nMorph.framework.common.datatypes.UUID):WhereClause
	{
		return SQL.SELECT().FROM(table).WHERE(Condition.SET(col_CategoryId, Op.Equal, Val.uuid(val_CategoryId)));
	}
	
	@:isVar var CategoryId (get, null):nMorph.framework.common.datatypes.UUID;
	public function get_CategoryId():nMorph.framework.common.datatypes.UUID
	{
		return CategoryId;
	}

	
	@:isVar var CategoryName (get, set):String;
	public function get_CategoryName():String
	{
		return CategoryName;
	}
	public function set_CategoryName(value:String):String
	{
		//col_CategoryName.ValidateDBCompatibility(value);//para registro de cambios
		
		if (TrackChanges && this.CategoryName != value) AddChange(new ChangeItem(col_CategoryName, this.CategoryName, value));
		return CategoryName=value;
	}

}
