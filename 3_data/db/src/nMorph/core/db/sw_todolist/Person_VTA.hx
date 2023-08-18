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
class Person_VTA extends ModelObject
{
	/**
	 * Constructor de la clase Person_VTA que tiene equivalencia con la tabla de la base de datos
	 */
	public function new()
	{
		//inicializamos la herencia
		super();
		//inicialización de arreglos de objetos internos
	}
	/**
	 * referencia a vista para consultas
	 */
	public static var view:ISource = new ViewSource("Person_VTA");
	/**
	 * Referencia a columna PersonId
	 */
		public static var col_PersonId: UUIDSentence = new UUIDSentence("Person_VTA", "PersonId", NullableEnum.NOTNULL, true);

	/**
	 * Referencia a columna FullName
	 */
		public static var col_FullName: VarcharSentence = new VarcharSentence("Person_VTA", "FullName", 100, NullableEnum.NOTNULL, false);

	/**
	 * Referencia a columna Email
	 */
		public static var col_Email: VarcharSentence = new VarcharSentence("Person_VTA", "Email", 100, NullableEnum.NOTNULL, false);

	/**
	 * Referencia a columna PasswordHash
	 */
		public static var col_PasswordHash: VarcharSentence = new VarcharSentence("Person_VTA", "PasswordHash", 100, NullableEnum.NOTNULL, false);

	/**
	 * inicio rápido de filtro
	 * @param	Filtro
	 * @return objeto para aplicar otras condiciones o ejecutar el query
	 */
	public static function WHERE(Condition:ICondition):WhereClause
	{
		return SQL.SELECT().FROM(view).WHERE(Condition);
	}
	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 */
	public static function BYPK(val_PersonId:nMorph.framework.common.datatypes.UUID):WhereClause
	{
		return SQL.SELECT().FROM(view).WHERE(Condition.SET(col_PersonId, Op.Equal, Val.uuid(val_PersonId)));
	}
	
	@:isVar var PersonId (get, null):nMorph.framework.common.datatypes.UUID;
	public function get_PersonId():nMorph.framework.common.datatypes.UUID
	{
		return PersonId;
	}

	
	@:isVar var FullName (get, set):String;
	public function get_FullName():String
	{
		return FullName;
	}
	public function set_FullName(value:String):String
	{
		//col_FullName.ValidateDBCompatibility(value);//para registro de cambios
		
		if (TrackChanges && this.FullName != value) AddChange(new ChangeItem(col_FullName, this.FullName, value));
		return FullName=value;
	}

	
	@:isVar var Email (get, set):String;
	public function get_Email():String
	{
		return Email;
	}
	public function set_Email(value:String):String
	{
		//col_Email.ValidateDBCompatibility(value);//para registro de cambios
		
		if (TrackChanges && this.Email != value) AddChange(new ChangeItem(col_Email, this.Email, value));
		return Email=value;
	}

	
	@:isVar var PasswordHash (get, set):String;
	public function get_PasswordHash():String
	{
		return PasswordHash;
	}
	public function set_PasswordHash(value:String):String
	{
		//col_PasswordHash.ValidateDBCompatibility(value);//para registro de cambios
		
		if (TrackChanges && this.PasswordHash != value) AddChange(new ChangeItem(col_PasswordHash, this.PasswordHash, value));
		return PasswordHash=value;
	}

}
