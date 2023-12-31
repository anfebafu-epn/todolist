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
use \nMorph\framework\orm\common\fields\DateTimeSentence;
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
class TR_Background extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.nmorph_core.TR_Background\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;TR_Background&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"TR_Background\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_BackgroundID public=\"1\" expr=\"new UUIDSentence(&quot;TR_Background&quot;, &quot;BackgroundID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"TR_Background\", \"BackgroundID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna BackgroundID</haxe_doc>\x0A\x09</col_BackgroundID>\x0A\x09<col_TenantID public=\"1\" expr=\"new UUIDSentence(&quot;TR_Background&quot;, &quot;TenantID&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"TR_Background\", \"TenantID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna TenantID</haxe_doc>\x0A\x09</col_TenantID>\x0A\x09<col_RecordID public=\"1\" expr=\"new UUIDSentence(&quot;TR_Background&quot;, &quot;RecordID&quot;, NullableEnum.NULL, false)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"TR_Background\", \"RecordID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna RecordID</haxe_doc>\x0A\x09</col_RecordID>\x0A\x09<col_ReferredDate public=\"1\" expr=\"new DateTimeSentence(&quot;TR_Background&quot;, &quot;ReferredDate&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"TR_Background\", \"ReferredDate\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ReferredDate</haxe_doc>\x0A\x09</col_ReferredDate>\x0A\x09<col_Description public=\"1\" expr=\"new VarcharSentence(&quot;TR_Background&quot;, &quot;Description&quot;, 500, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"TR_Background\", \"Description\", 500, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Description</haxe_doc>\x0A\x09</col_Description>\x0A\x09<col_Status public=\"1\" expr=\"new SmallIntegerSentence(&quot;TR_Background&quot;, &quot;Status&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.SmallIntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new SmallIntegerSentence(\"TR_Background\", \"Status\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"70\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"79\" static=\"1\">\x0A\x09\x09<f a=\"val_BackgroundID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<BackgroundID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</BackgroundID>\x0A\x09<get_BackgroundID public=\"1\" set=\"method\" line=\"85\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_BackgroundID>\x0A\x09<TenantID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</TenantID>\x0A\x09<get_TenantID public=\"1\" set=\"method\" line=\"92\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_TenantID>\x0A\x09<set_TenantID public=\"1\" set=\"method\" line=\"96\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_TenantID>\x0A\x09<RecordID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</RecordID>\x0A\x09<get_RecordID public=\"1\" set=\"method\" line=\"106\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_RecordID>\x0A\x09<set_RecordID public=\"1\" set=\"method\" line=\"110\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_RecordID>\x0A\x09<ReferredDate get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ReferredDate>\x0A\x09<get_ReferredDate public=\"1\" set=\"method\" line=\"120\"><f a=\"\"><c path=\"Date\"/></f></get_ReferredDate>\x0A\x09<set_ReferredDate public=\"1\" set=\"method\" line=\"124\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_ReferredDate>\x0A\x09<Description get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Description>\x0A\x09<get_Description public=\"1\" set=\"method\" line=\"134\"><f a=\"\"><c path=\"String\"/></f></get_Description>\x0A\x09<set_Description public=\"1\" set=\"method\" line=\"138\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_Description>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"148\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"152\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Status>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase TR_Background que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna BackgroundID
	 */
	static public $col_BackgroundID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna Description
	 */
	static public $col_Description;
	/**
	 * @var UUIDSentence
	 * Referencia a columna RecordID
	 */
	static public $col_RecordID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna ReferredDate
	 */
	static public $col_ReferredDate;
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
	public $BackgroundID;
	/**
	 * @var string
	 */
	public $Description;
	/**
	 * @var UUID
	 */
	public $RecordID;
	/**
	 * @var \Date
	 */
	public $ReferredDate;
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
	 * @param UUID $val_BackgroundID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_BackgroundID) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:80: characters 3-111
		return SQL::SELECT()->FROM(TR_Background::$table)->WHERE(Condition::SET(TR_Background::$col_BackgroundID, Op::Equal(), Val::uuid($val_BackgroundID)));
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
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:71: characters 3-51
		return SQL::SELECT()->FROM(TR_Background::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase TR_Background que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_BackgroundID () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:86: characters 3-22
		return $this->BackgroundID;
	}

	/**
	 * @return string
	 */
	public function get_Description () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:135: characters 3-21
		return $this->Description;
	}

	/**
	 * @return UUID
	 */
	public function get_RecordID () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:107: characters 3-18
		return $this->RecordID;
	}

	/**
	 * @return \Date
	 */
	public function get_ReferredDate () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:121: characters 3-22
		return $this->ReferredDate;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:149: characters 3-16
		return $this->Status;
	}

	/**
	 * @return UUID
	 */
	public function get_TenantID () {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:93: characters 3-18
		return $this->TenantID;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Description ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:141: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_Description() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:141: characters 75-90
			$tmp = TR_Background::$col_Description;
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:141: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_Description(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:142: characters 3-27
		return $this->Description = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_RecordID ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:113: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_RecordID() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:113: characters 72-84
			$tmp = TR_Background::$col_RecordID;
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:113: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_RecordID(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:114: characters 3-24
		return $this->RecordID = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_ReferredDate ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:127: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_ReferredDate() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:127: characters 76-92
			$tmp = TR_Background::$col_ReferredDate;
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:127: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_ReferredDate(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:128: characters 3-28
		return $this->ReferredDate = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:155: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:155: characters 70-80
			$tmp = TR_Background::$col_Status;
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:155: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:156: characters 3-22
		return $this->Status = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_TenantID ($value) {
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:99: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_TenantID() !== $value)) {
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:99: characters 72-84
			$tmp = TR_Background::$col_TenantID;
			#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:99: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_TenantID(), $value));
		}
		#3_data\db\src/nMorph/core/db/nmorph_core/TR_Background.hx:100: characters 3-24
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


		self::$table = new TableSource("TR_Background");
		self::$col_BackgroundID = new UUIDSentence("TR_Background", "BackgroundID", NullableEnum::NOTNULL(), true);
		self::$col_TenantID = new UUIDSentence("TR_Background", "TenantID", NullableEnum::NULL(), false);
		self::$col_RecordID = new UUIDSentence("TR_Background", "RecordID", NullableEnum::NULL(), false);
		self::$col_ReferredDate = new DateTimeSentence("TR_Background", "ReferredDate", NullableEnum::NULL(), false);
		self::$col_Description = new VarcharSentence("TR_Background", "Description", 500, NullableEnum::NULL(), false);
		self::$col_Status = new SmallIntegerSentence("TR_Background", "Status", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(TR_Background::class, 'nMorph.core.db.nmorph_core.TR_Background');
Boot::registerGetters('nMorph\\core\\db\\nmorph_core\\TR_Background', [
	'Status' => true,
	'Description' => true,
	'ReferredDate' => true,
	'RecordID' => true,
	'TenantID' => true,
	'BackgroundID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\nmorph_core\\TR_Background', [
	'Status' => true,
	'Description' => true,
	'ReferredDate' => true,
	'RecordID' => true,
	'TenantID' => true
]);
TR_Background::__hx__init();
