<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\db\zhungo_core;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ICondition;
use \nMorph\framework\orm\common\sentences\Val;
use \nMorph\framework\orm\client\ModelObject;
use \php\Boot;
use \nMorph\framework\orm\common\enums\Op;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\common\fields\DateTimeSentence;
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
class SC_ConsultarFechaGeneracion extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.SC_ConsultarFechaGeneracion\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;SC_ConsultarFechaGeneracion&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"SC_ConsultarFechaGeneracion\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;SC_ConsultarFechaGeneracion&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_ConsultarFechaGeneracion\", \"PlanID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;SC_ConsultarFechaGeneracion&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_ConsultarFechaGeneracion\", \"NombrePlan\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_fechaDesde public=\"1\" expr=\"new DateTimeSentence(&quot;SC_ConsultarFechaGeneracion&quot;, &quot;fechaDesde&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_ConsultarFechaGeneracion\", \"fechaDesde\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaDesde</haxe_doc>\x0A\x09</col_fechaDesde>\x0A\x09<col_fechaHasta public=\"1\" expr=\"new DateTimeSentence(&quot;SC_ConsultarFechaGeneracion&quot;, &quot;fechaHasta&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_ConsultarFechaGeneracion\", \"fechaHasta\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaHasta</haxe_doc>\x0A\x09</col_fechaHasta>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"60\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"69\" static=\"1\">\x0A\x09\x09<f a=\"val_PlanID:val_fechaDesde\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"Date\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<PlanID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"75\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"82\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"86\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<fechaDesde get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaDesde>\x0A\x09<get_fechaDesde public=\"1\" set=\"method\" line=\"96\"><f a=\"\"><c path=\"Date\"/></f></get_fechaDesde>\x0A\x09<fechaHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaHasta>\x0A\x09<get_fechaHasta public=\"1\" set=\"method\" line=\"103\"><f a=\"\"><c path=\"Date\"/></f></get_fechaHasta>\x0A\x09<set_fechaHasta public=\"1\" set=\"method\" line=\"107\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_fechaHasta>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase SC_ConsultarFechaGeneracion que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombrePlan
	 */
	static public $col_NombrePlan;
	/**
	 * @var UUIDSentence
	 * Referencia a columna PlanID
	 */
	static public $col_PlanID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaDesde
	 */
	static public $col_fechaDesde;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaHasta
	 */
	static public $col_fechaHasta;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var string
	 */
	public $NombrePlan;
	/**
	 * @var UUID
	 */
	public $PlanID;
	/**
	 * @var \Date
	 */
	public $fechaDesde;
	/**
	 * @var \Date
	 */
	public $fechaHasta;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_PlanID
	 * @param \Date $val_fechaDesde
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_PlanID, $val_fechaDesde) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:70: characters 3-157
		return SQL::SELECT()->FROM(SC_ConsultarFechaGeneracion::$view)->WHERE(Condition::SET(SC_ConsultarFechaGeneracion::$col_PlanID, Op::Equal(), Val::uuid($val_PlanID))->AND_Ex(SC_ConsultarFechaGeneracion::$col_fechaDesde, Op::Equal(), Val::date($val_fechaDesde)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:61: characters 3-50
		return SQL::SELECT()->FROM(SC_ConsultarFechaGeneracion::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase SC_ConsultarFechaGeneracion que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:83: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:76: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:97: characters 3-20
		return $this->fechaDesde;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:104: characters 3-20
		return $this->fechaHasta;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:89: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:89: characters 74-88
			$tmp = SC_ConsultarFechaGeneracion::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:89: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:90: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_fechaHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:110: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_fechaHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:110: characters 74-88
			$tmp = SC_ConsultarFechaGeneracion::$col_fechaHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:110: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_fechaHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaGeneracion.hx:111: characters 3-26
		return $this->fechaHasta = $value;
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


		self::$view = new ViewSource("SC_ConsultarFechaGeneracion");
		self::$col_PlanID = new UUIDSentence("SC_ConsultarFechaGeneracion", "PlanID", NullableEnum::NOTNULL(), true);
		self::$col_NombrePlan = new VarcharSentence("SC_ConsultarFechaGeneracion", "NombrePlan", 150, NullableEnum::NOTNULL(), false);
		self::$col_fechaDesde = new DateTimeSentence("SC_ConsultarFechaGeneracion", "fechaDesde", NullableEnum::NULL(), true);
		self::$col_fechaHasta = new DateTimeSentence("SC_ConsultarFechaGeneracion", "fechaHasta", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(SC_ConsultarFechaGeneracion::class, 'nMorph.core.db.zhungo_core.SC_ConsultarFechaGeneracion');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\SC_ConsultarFechaGeneracion', [
	'fechaHasta' => true,
	'fechaDesde' => true,
	'NombrePlan' => true,
	'PlanID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\SC_ConsultarFechaGeneracion', [
	'fechaHasta' => true,
	'NombrePlan' => true
]);
SC_ConsultarFechaGeneracion::__hx__init();
