<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\db\sw_todolist;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ICondition;
use \nMorph\framework\orm\common\sentences\Val;
use \nMorph\framework\orm\client\ModelObject;
use \php\Boot;
use \nMorph\framework\orm\common\enums\Op;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\sources\ViewSource;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class Person_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.sw_todolist.Person_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;Person_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"Person_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_PersonId public=\"1\" expr=\"new UUIDSentence(&quot;Person_VTA&quot;, &quot;PersonId&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"Person_VTA\", \"PersonId\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonId</haxe_doc>\x0A\x09</col_PersonId>\x0A\x09<col_FullName public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;FullName&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"FullName\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FullName</haxe_doc>\x0A\x09</col_FullName>\x0A\x09<col_Email public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;Email&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"Email\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Email</haxe_doc>\x0A\x09</col_Email>\x0A\x09<col_PasswordHash public=\"1\" expr=\"new VarcharSentence(&quot;Person_VTA&quot;, &quot;PasswordHash&quot;, 100, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"Person_VTA\", \"PasswordHash\", 100, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PasswordHash</haxe_doc>\x0A\x09</col_PasswordHash>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"60\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"69\" static=\"1\">\x0A\x09\x09<f a=\"val_PersonId\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<PersonId get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonId>\x0A\x09<get_PersonId public=\"1\" set=\"method\" line=\"75\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PersonId>\x0A\x09<FullName get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FullName>\x0A\x09<get_FullName public=\"1\" set=\"method\" line=\"82\"><f a=\"\"><c path=\"String\"/></f></get_FullName>\x0A\x09<set_FullName public=\"1\" set=\"method\" line=\"86\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_FullName>\x0A\x09<Email get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Email>\x0A\x09<get_Email public=\"1\" set=\"method\" line=\"96\"><f a=\"\"><c path=\"String\"/></f></get_Email>\x0A\x09<set_Email public=\"1\" set=\"method\" line=\"100\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_Email>\x0A\x09<PasswordHash get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PasswordHash>\x0A\x09<get_PasswordHash public=\"1\" set=\"method\" line=\"110\"><f a=\"\"><c path=\"String\"/></f></get_PasswordHash>\x0A\x09<set_PasswordHash public=\"1\" set=\"method\" line=\"114\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PasswordHash>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase Person_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var VarcharSentence
	 * Referencia a columna Email
	 */
	static public $col_Email;
	/**
	 * @var VarcharSentence
	 * Referencia a columna FullName
	 */
	static public $col_FullName;
	/**
	 * @var VarcharSentence
	 * Referencia a columna PasswordHash
	 */
	static public $col_PasswordHash;
	/**
	 * @var UUIDSentence
	 * Referencia a columna PersonId
	 */
	static public $col_PersonId;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var string
	 */
	public $Email;
	/**
	 * @var string
	 */
	public $FullName;
	/**
	 * @var string
	 */
	public $PasswordHash;
	/**
	 * @var UUID
	 */
	public $PersonId;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_PersonId
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_PersonId) {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:70: characters 3-102
		return SQL::SELECT()->FROM(Person_VTA::$view)->WHERE(Condition::SET(Person_VTA::$col_PersonId, Op::Equal(), Val::uuid($val_PersonId)));
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
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:61: characters 3-50
		return SQL::SELECT()->FROM(Person_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase Person_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return string
	 */
	public function get_Email () {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:97: characters 3-15
		return $this->Email;
	}

	/**
	 * @return string
	 */
	public function get_FullName () {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:83: characters 3-18
		return $this->FullName;
	}

	/**
	 * @return string
	 */
	public function get_PasswordHash () {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:111: characters 3-22
		return $this->PasswordHash;
	}

	/**
	 * @return UUID
	 */
	public function get_PersonId () {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:76: characters 3-18
		return $this->PersonId;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Email ($value) {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:103: characters 3-99
		if ($this->get_TrackChanges() && ($this->get_Email() !== $value)) {
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:103: characters 69-78
			$tmp = Person_VTA::$col_Email;
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:103: characters 44-99
			$this->AddChange(new ChangeItem($tmp, $this->get_Email(), $value));
		}
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:104: characters 3-21
		return $this->Email = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_FullName ($value) {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:89: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_FullName() !== $value)) {
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:89: characters 72-84
			$tmp = Person_VTA::$col_FullName;
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:89: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_FullName(), $value));
		}
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:90: characters 3-24
		return $this->FullName = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PasswordHash ($value) {
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:117: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_PasswordHash() !== $value)) {
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:117: characters 76-92
			$tmp = Person_VTA::$col_PasswordHash;
			#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:117: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_PasswordHash(), $value));
		}
		#3_data\db\src/nMorph/core/db/sw_todolist/Person_VTA.hx:118: characters 3-28
		return $this->PasswordHash = $value;
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


		self::$view = new ViewSource("Person_VTA");
		self::$col_PersonId = new UUIDSentence("Person_VTA", "PersonId", NullableEnum::NOTNULL(), true);
		self::$col_FullName = new VarcharSentence("Person_VTA", "FullName", 100, NullableEnum::NOTNULL(), false);
		self::$col_Email = new VarcharSentence("Person_VTA", "Email", 100, NullableEnum::NOTNULL(), false);
		self::$col_PasswordHash = new VarcharSentence("Person_VTA", "PasswordHash", 100, NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(Person_VTA::class, 'nMorph.core.db.sw_todolist.Person_VTA');
Boot::registerGetters('nMorph\\core\\db\\sw_todolist\\Person_VTA', [
	'PasswordHash' => true,
	'Email' => true,
	'FullName' => true,
	'PersonId' => true
]);
Boot::registerSetters('nMorph\\core\\db\\sw_todolist\\Person_VTA', [
	'PasswordHash' => true,
	'Email' => true,
	'FullName' => true
]);
Person_VTA::__hx__init();
