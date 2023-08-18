<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\db\zhungo_core;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\common\fields\DecimalSentence;
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
class FC_FacturaCSV_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_FacturaCSV_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;FC_FacturaCSV_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"FC_FacturaCSV_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_NUM public=\"1\" expr=\"new DecimalSentence(&quot;FC_FacturaCSV_VTA&quot;, &quot;NUM&quot;, 9, 0, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_FacturaCSV_VTA\", \"NUM\", 9, 0, NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NUM</haxe_doc>\x0A\x09</col_NUM>\x0A\x09<col_csv public=\"1\" expr=\"new VarcharSentence(&quot;FC_FacturaCSV_VTA&quot;, &quot;csv&quot;, -1, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FacturaCSV_VTA\", \"csv\", -1, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna csv</haxe_doc>\x0A\x09</col_csv>\x0A\x09<col_IDFactura public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturaCSV_VTA&quot;, &quot;IDFactura&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturaCSV_VTA\", \"IDFactura\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFactura</haxe_doc>\x0A\x09</col_IDFactura>\x0A\x09<col_IDSolicitud public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturaCSV_VTA&quot;, &quot;IDSolicitud&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturaCSV_VTA\", \"IDSolicitud\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDSolicitud</haxe_doc>\x0A\x09</col_IDSolicitud>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"60\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"69\" static=\"1\">\x0A\x09\x09<f a=\"val_NUM:val_IDFactura\">\x0A\x09\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<NUM get=\"accessor\" set=\"null\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NUM>\x0A\x09<get_NUM public=\"1\" set=\"method\" line=\"75\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_NUM>\x0A\x09<csv get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</csv>\x0A\x09<get_csv public=\"1\" set=\"method\" line=\"82\"><f a=\"\"><c path=\"String\"/></f></get_csv>\x0A\x09<set_csv public=\"1\" set=\"method\" line=\"86\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_csv>\x0A\x09<IDFactura get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFactura>\x0A\x09<get_IDFactura public=\"1\" set=\"method\" line=\"96\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFactura>\x0A\x09<IDSolicitud get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDSolicitud>\x0A\x09<get_IDSolicitud public=\"1\" set=\"method\" line=\"103\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDSolicitud>\x0A\x09<set_IDSolicitud public=\"1\" set=\"method\" line=\"107\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_IDSolicitud>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_FacturaCSV_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDFactura
	 */
	static public $col_IDFactura;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDSolicitud
	 */
	static public $col_IDSolicitud;
	/**
	 * @var DecimalSentence
	 * Referencia a columna NUM
	 */
	static public $col_NUM;
	/**
	 * @var VarcharSentence
	 * Referencia a columna csv
	 */
	static public $col_csv;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var UUID
	 */
	public $IDFactura;
	/**
	 * @var UUID
	 */
	public $IDSolicitud;
	/**
	 * @var float
	 */
	public $NUM;
	/**
	 * @var string
	 */
	public $csv;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param float $val_NUM
	 * @param UUID $val_IDFactura
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_NUM, $val_IDFactura) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:70: characters 3-150
		return SQL::SELECT()->FROM(FC_FacturaCSV_VTA::$view)->WHERE(Condition::SET(FC_FacturaCSV_VTA::$col_NUM, Op::Equal(), Val::float($val_NUM))->AND_Ex(FC_FacturaCSV_VTA::$col_IDFactura, Op::Equal(), Val::uuid($val_IDFactura)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:61: characters 3-50
		return SQL::SELECT()->FROM(FC_FacturaCSV_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_FacturaCSV_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_IDFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:97: characters 3-19
		return $this->IDFactura;
	}

	/**
	 * @return UUID
	 */
	public function get_IDSolicitud () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:104: characters 3-21
		return $this->IDSolicitud;
	}

	/**
	 * @return float
	 */
	public function get_NUM () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:76: characters 3-13
		return $this->NUM;
	}

	/**
	 * @return string
	 */
	public function get_csv () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:83: characters 3-13
		return $this->csv;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_IDSolicitud ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:110: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_IDSolicitud() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:110: characters 75-90
			$tmp = FC_FacturaCSV_VTA::$col_IDSolicitud;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:110: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_IDSolicitud(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:111: characters 3-27
		return $this->IDSolicitud = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_csv ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:89: characters 3-93
		if ($this->get_TrackChanges() && ($this->get_csv() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:89: characters 67-74
			$tmp = FC_FacturaCSV_VTA::$col_csv;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:89: characters 42-93
			$this->AddChange(new ChangeItem($tmp, $this->get_csv(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturaCSV_VTA.hx:90: characters 3-19
		return $this->csv = $value;
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


		self::$view = new ViewSource("FC_FacturaCSV_VTA");
		self::$col_NUM = new DecimalSentence("FC_FacturaCSV_VTA", "NUM", 9, 0, NullableEnum::NULL(), true);
		self::$col_csv = new VarcharSentence("FC_FacturaCSV_VTA", "csv", -1, NullableEnum::NULL(), false);
		self::$col_IDFactura = new UUIDSentence("FC_FacturaCSV_VTA", "IDFactura", NullableEnum::NOTNULL(), true);
		self::$col_IDSolicitud = new UUIDSentence("FC_FacturaCSV_VTA", "IDSolicitud", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(FC_FacturaCSV_VTA::class, 'nMorph.core.db.zhungo_core.FC_FacturaCSV_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_FacturaCSV_VTA', [
	'IDSolicitud' => true,
	'IDFactura' => true,
	'csv' => true,
	'NUM' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_FacturaCSV_VTA', [
	'IDSolicitud' => true,
	'csv' => true
]);
FC_FacturaCSV_VTA::__hx__init();
