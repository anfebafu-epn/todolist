<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\db\nmorph_core;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ICondition;
use \nMorph\framework\orm\common\sentences\Val;
use \nMorph\framework\orm\client\ModelObject;
use \php\Boot;
use \nMorph\framework\orm\common\enums\Op;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\sources\TableSource;
use \nMorph\framework\orm\common\fields\SmallIntegerSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class PL_Role extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.nmorph_core.PL_Role\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;PL_Role&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"PL_Role\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_RoleID public=\"1\" expr=\"new UUIDSentence(&quot;PL_Role&quot;, &quot;RoleID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_Role\", \"RoleID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna RoleID</haxe_doc>\x0A\x09</col_RoleID>\x0A\x09<col_TenantID public=\"1\" expr=\"new UUIDSentence(&quot;PL_Role&quot;, &quot;TenantID&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_Role\", \"TenantID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna TenantID</haxe_doc>\x0A\x09</col_TenantID>\x0A\x09<col_RoleName public=\"1\" expr=\"new VarcharSentence(&quot;PL_Role&quot;, &quot;RoleName&quot;, 250, NullableEnum.NULL, false)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_Role\", \"RoleName\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna RoleName</haxe_doc>\x0A\x09</col_RoleName>\x0A\x09<col_Status public=\"1\" expr=\"new SmallIntegerSentence(&quot;PL_Role&quot;, &quot;Status&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.SmallIntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new SmallIntegerSentence(\"PL_Role\", \"Status\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"60\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"69\" static=\"1\">\x0A\x09\x09<f a=\"val_RoleID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<RoleID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</RoleID>\x0A\x09<get_RoleID public=\"1\" set=\"method\" line=\"75\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_RoleID>\x0A\x09<TenantID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</TenantID>\x0A\x09<get_TenantID public=\"1\" set=\"method\" line=\"82\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_TenantID>\x0A\x09<set_TenantID public=\"1\" set=\"method\" line=\"86\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_TenantID>\x0A\x09<RoleName get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</RoleName>\x0A\x09<get_RoleName public=\"1\" set=\"method\" line=\"96\"><f a=\"\"><c path=\"String\"/></f></get_RoleName>\x0A\x09<set_RoleName public=\"1\" set=\"method\" line=\"100\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_RoleName>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"110\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"114\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Status>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PL_Role que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna RoleID
	 */
	static public $col_RoleID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna RoleName
	 */
	static public $col_RoleName;
	/**
	 * @var SmallIntegerSentence
	 * Referencia a columna Status
	 */
	static public $col_Status;
	/**
	 * @var UUIDSentence
	 * Referencia a columna TenantID
	 */
	static public $col_TenantID;
	/**
	 * @var ISource
	 * referencia a tabla para consultas
	 */
	static public $table;

	/**
	 * @var UUID
	 */
	public $RoleID;
	/**
	 * @var string
	 */
	public $RoleName;
	/**
	 * @var int
	 */
	public $Status;
	/**
	 * @var UUID
	 */
	public $TenantID;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_RoleID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_RoleID) {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:70: characters 3-99
		return SQL::SELECT()->FROM(PL_Role::$table)->WHERE(Condition::SET(PL_Role::$col_RoleID, Op::Equal(), Val::uuid($val_RoleID)));
	}

	/**
	 * inicio rápido de filtro
	 * @param	Filtro
	 * @return objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param ICondition $Condition
	 * 
	 * @return WhereClause
	 */
	public static function WHERE ($Condition) {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:61: characters 3-51
		return SQL::SELECT()->FROM(PL_Role::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PL_Role que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_RoleID () {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:76: characters 3-16
		return $this->RoleID;
	}

	/**
	 * @return string
	 */
	public function get_RoleName () {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:97: characters 3-18
		return $this->RoleName;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:111: characters 3-16
		return $this->Status;
	}

	/**
	 * @return UUID
	 */
	public function get_TenantID () {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:83: characters 3-18
		return $this->TenantID;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_RoleName ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:103: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_RoleName() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:103: characters 72-84
			$tmp = PL_Role::$col_RoleName;
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:103: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_RoleName(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:104: characters 3-24
		return $this->RoleName = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:117: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:117: characters 70-80
			$tmp = PL_Role::$col_Status;
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:117: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:118: characters 3-22
		return $this->Status = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_TenantID ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:89: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_TenantID() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:89: characters 72-84
			$tmp = PL_Role::$col_TenantID;
			#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:89: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_TenantID(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/PL_Role.hx:90: characters 3-24
		return $this->TenantID = $value;
	}

	/**
	 * @internal
	 * @access private
	 */
	static public function __hx__init ()
	{
		static $called = false;
		if ($called) return;
		$called = true;


		self::$table = new TableSource("PL_Role");
		self::$col_RoleID = new UUIDSentence("PL_Role", "RoleID", NullableEnum::NOTNULL(), true);
		self::$col_TenantID = new UUIDSentence("PL_Role", "TenantID", NullableEnum::NULL(), false);
		self::$col_RoleName = new VarcharSentence("PL_Role", "RoleName", 250, NullableEnum::NULL(), false);
		self::$col_Status = new SmallIntegerSentence("PL_Role", "Status", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(PL_Role::class, 'nMorph.core.db.nmorph_core.PL_Role');
Boot::registerGetters('nMorph\\core\\db\\nmorph_core\\PL_Role', [
	'Status' => true,
	'RoleName' => true,
	'TenantID' => true,
	'RoleID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\nmorph_core\\PL_Role', [
	'Status' => true,
	'RoleName' => true,
	'TenantID' => true
]);
PL_Role::__hx__init();
