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
use \nMorph\framework\orm\common\fields\DateTimeSentence;
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\sources\ViewSource;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\fields\BooleanSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\fields\BigTextSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class SC_ConsultarFechaFacturacion extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.SC_ConsultarFechaFacturacion\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;SC_ConsultarFechaFacturacion&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"SC_ConsultarFechaFacturacion\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_ConsultarFechaFacturacion\", \"PlanID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_ConsultarFechaFacturacion\", \"NombrePlan\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_DescripcionPlan public=\"1\" expr=\"new BigTextSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;DescripcionPlan&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BigTextSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BigTextSentence(\"SC_ConsultarFechaFacturacion\", \"DescripcionPlan\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna DescripcionPlan</haxe_doc>\x0A\x09</col_DescripcionPlan>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_ConsultarFechaFacturacion\", \"SuscripcionID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_LapsoID public=\"1\" expr=\"new UUIDSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;LapsoID&quot;, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_ConsultarFechaFacturacion\", \"LapsoID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna LapsoID</haxe_doc>\x0A\x09</col_LapsoID>\x0A\x09<col_fechaCalculoFacturacion public=\"1\" expr=\"new DateTimeSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;fechaCalculoFacturacion&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_ConsultarFechaFacturacion\", \"fechaCalculoFacturacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaCalculoFacturacion</haxe_doc>\x0A\x09</col_fechaCalculoFacturacion>\x0A\x09<col_fechaEmisionFacturacion public=\"1\" expr=\"new DateTimeSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;fechaEmisionFacturacion&quot;, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_ConsultarFechaFacturacion\", \"fechaEmisionFacturacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaEmisionFacturacion</haxe_doc>\x0A\x09</col_fechaEmisionFacturacion>\x0A\x09<col_PrecioFijo public=\"1\" expr=\"new BooleanSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;PrecioFijo&quot;, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"SC_ConsultarFechaFacturacion\", \"PrecioFijo\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PrecioFijo</haxe_doc>\x0A\x09</col_PrecioFijo>\x0A\x09<col_PrecioFijoValor public=\"1\" expr=\"new DecimalSentence(&quot;SC_ConsultarFechaFacturacion&quot;, &quot;PrecioFijoValor&quot;, 17, 19, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"SC_ConsultarFechaFacturacion\", \"PrecioFijoValor\", 17, 19, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PrecioFijoValor</haxe_doc>\x0A\x09</col_PrecioFijoValor>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"85\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"94\" static=\"1\">\x0A\x09\x09<f a=\"val_PlanID:val_DescripcionPlan\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"String\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<PlanID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"100\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"107\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"111\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<DescripcionPlan get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</DescripcionPlan>\x0A\x09<get_DescripcionPlan public=\"1\" set=\"method\" line=\"121\"><f a=\"\"><c path=\"String\"/></f></get_DescripcionPlan>\x0A\x09<SuscripcionID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"128\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<set_SuscripcionID public=\"1\" set=\"method\" line=\"132\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_SuscripcionID>\x0A\x09<LapsoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</LapsoID>\x0A\x09<get_LapsoID public=\"1\" set=\"method\" line=\"142\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_LapsoID>\x0A\x09<set_LapsoID public=\"1\" set=\"method\" line=\"146\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_LapsoID>\x0A\x09<fechaCalculoFacturacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaCalculoFacturacion>\x0A\x09<get_fechaCalculoFacturacion public=\"1\" set=\"method\" line=\"156\"><f a=\"\"><c path=\"Date\"/></f></get_fechaCalculoFacturacion>\x0A\x09<set_fechaCalculoFacturacion public=\"1\" set=\"method\" line=\"160\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_fechaCalculoFacturacion>\x0A\x09<fechaEmisionFacturacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaEmisionFacturacion>\x0A\x09<get_fechaEmisionFacturacion public=\"1\" set=\"method\" line=\"170\"><f a=\"\"><c path=\"Date\"/></f></get_fechaEmisionFacturacion>\x0A\x09<set_fechaEmisionFacturacion public=\"1\" set=\"method\" line=\"174\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_fechaEmisionFacturacion>\x0A\x09<PrecioFijo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PrecioFijo>\x0A\x09<get_PrecioFijo public=\"1\" set=\"method\" line=\"184\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_PrecioFijo>\x0A\x09<set_PrecioFijo public=\"1\" set=\"method\" line=\"188\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_PrecioFijo>\x0A\x09<PrecioFijoValor get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PrecioFijoValor>\x0A\x09<get_PrecioFijoValor public=\"1\" set=\"method\" line=\"198\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_PrecioFijoValor>\x0A\x09<set_PrecioFijoValor public=\"1\" set=\"method\" line=\"202\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_PrecioFijoValor>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase SC_ConsultarFechaFacturacion que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var BigTextSentence
	 * Referencia a columna DescripcionPlan
	 */
	static public $col_DescripcionPlan;
	/**
	 * @var UUIDSentence
	 * Referencia a columna LapsoID
	 */
	static public $col_LapsoID;
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
	 * @var BooleanSentence
	 * Referencia a columna PrecioFijo
	 */
	static public $col_PrecioFijo;
	/**
	 * @var DecimalSentence
	 * Referencia a columna PrecioFijoValor
	 */
	static public $col_PrecioFijoValor;
	/**
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaCalculoFacturacion
	 */
	static public $col_fechaCalculoFacturacion;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaEmisionFacturacion
	 */
	static public $col_fechaEmisionFacturacion;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var string
	 */
	public $DescripcionPlan;
	/**
	 * @var UUID
	 */
	public $LapsoID;
	/**
	 * @var string
	 */
	public $NombrePlan;
	/**
	 * @var UUID
	 */
	public $PlanID;
	/**
	 * @var bool
	 */
	public $PrecioFijo;
	/**
	 * @var float
	 */
	public $PrecioFijoValor;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;
	/**
	 * @var \Date
	 */
	public $fechaCalculoFacturacion;
	/**
	 * @var \Date
	 */
	public $fechaEmisionFacturacion;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_PlanID
	 * @param string $val_DescripcionPlan
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_PlanID, $val_DescripcionPlan) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:95: characters 3-169
		return SQL::SELECT()->FROM(SC_ConsultarFechaFacturacion::$view)->WHERE(Condition::SET(SC_ConsultarFechaFacturacion::$col_PlanID, Op::Equal(), Val::uuid($val_PlanID))->AND_Ex(SC_ConsultarFechaFacturacion::$col_DescripcionPlan, Op::Equal(), Val::string($val_DescripcionPlan)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:86: characters 3-50
		return SQL::SELECT()->FROM(SC_ConsultarFechaFacturacion::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase SC_ConsultarFechaFacturacion que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return string
	 */
	public function get_DescripcionPlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:122: characters 3-25
		return $this->DescripcionPlan;
	}

	/**
	 * @return UUID
	 */
	public function get_LapsoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:143: characters 3-17
		return $this->LapsoID;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:108: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:101: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return bool
	 */
	public function get_PrecioFijo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:185: characters 3-20
		return $this->PrecioFijo;
	}

	/**
	 * @return float
	 */
	public function get_PrecioFijoValor () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:199: characters 3-25
		return $this->PrecioFijoValor;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:129: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaCalculoFacturacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:157: characters 3-33
		return $this->fechaCalculoFacturacion;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaEmisionFacturacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:171: characters 3-33
		return $this->fechaEmisionFacturacion;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_LapsoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:149: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_LapsoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:149: characters 71-82
			$tmp = SC_ConsultarFechaFacturacion::$col_LapsoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:149: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_LapsoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:150: characters 3-23
		return $this->LapsoID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:114: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:114: characters 74-88
			$tmp = SC_ConsultarFechaFacturacion::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:114: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:115: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_PrecioFijo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:191: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_PrecioFijo() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:191: characters 74-88
			$tmp = SC_ConsultarFechaFacturacion::$col_PrecioFijo;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:191: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_PrecioFijo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:192: characters 3-26
		return $this->PrecioFijo = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_PrecioFijoValor ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:205: characters 3-129
		if ($this->get_TrackChanges() && !Boot::equal($this->get_PrecioFijoValor(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:205: characters 79-98
			$tmp = SC_ConsultarFechaFacturacion::$col_PrecioFijoValor;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:205: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_PrecioFijoValor(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:206: characters 3-31
		return $this->PrecioFijoValor = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_SuscripcionID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:135: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_SuscripcionID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:135: characters 77-94
			$tmp = SC_ConsultarFechaFacturacion::$col_SuscripcionID;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:135: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SuscripcionID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:136: characters 3-29
		return $this->SuscripcionID = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_fechaCalculoFacturacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:163: characters 3-153
		if ($this->get_TrackChanges() && ($this->get_fechaCalculoFacturacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:163: characters 87-114
			$tmp = SC_ConsultarFechaFacturacion::$col_fechaCalculoFacturacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:163: characters 62-153
			$this->AddChange(new ChangeItem($tmp, $this->get_fechaCalculoFacturacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:164: characters 3-39
		return $this->fechaCalculoFacturacion = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_fechaEmisionFacturacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:177: characters 3-153
		if ($this->get_TrackChanges() && ($this->get_fechaEmisionFacturacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:177: characters 87-114
			$tmp = SC_ConsultarFechaFacturacion::$col_fechaEmisionFacturacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:177: characters 62-153
			$this->AddChange(new ChangeItem($tmp, $this->get_fechaEmisionFacturacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_ConsultarFechaFacturacion.hx:178: characters 3-39
		return $this->fechaEmisionFacturacion = $value;
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


		self::$view = new ViewSource("SC_ConsultarFechaFacturacion");
		self::$col_PlanID = new UUIDSentence("SC_ConsultarFechaFacturacion", "PlanID", NullableEnum::NOTNULL(), true);
		self::$col_NombrePlan = new VarcharSentence("SC_ConsultarFechaFacturacion", "NombrePlan", 150, NullableEnum::NOTNULL(), false);
		self::$col_DescripcionPlan = new BigTextSentence("SC_ConsultarFechaFacturacion", "DescripcionPlan", NullableEnum::NOTNULL(), true);
		self::$col_SuscripcionID = new UUIDSentence("SC_ConsultarFechaFacturacion", "SuscripcionID", NullableEnum::NOTNULL(), false);
		self::$col_LapsoID = new UUIDSentence("SC_ConsultarFechaFacturacion", "LapsoID", NullableEnum::NOTNULL(), false);
		self::$col_fechaCalculoFacturacion = new DateTimeSentence("SC_ConsultarFechaFacturacion", "fechaCalculoFacturacion", NullableEnum::NULL(), false);
		self::$col_fechaEmisionFacturacion = new DateTimeSentence("SC_ConsultarFechaFacturacion", "fechaEmisionFacturacion", NullableEnum::NULL(), false);
		self::$col_PrecioFijo = new BooleanSentence("SC_ConsultarFechaFacturacion", "PrecioFijo", NullableEnum::NULL(), false);
		self::$col_PrecioFijoValor = new DecimalSentence("SC_ConsultarFechaFacturacion", "PrecioFijoValor", 17, 19, NullableEnum::NULL(), false);
	}
}

Boot::registerClass(SC_ConsultarFechaFacturacion::class, 'nMorph.core.db.zhungo_core.SC_ConsultarFechaFacturacion');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\SC_ConsultarFechaFacturacion', [
	'PrecioFijoValor' => true,
	'PrecioFijo' => true,
	'fechaEmisionFacturacion' => true,
	'fechaCalculoFacturacion' => true,
	'LapsoID' => true,
	'SuscripcionID' => true,
	'DescripcionPlan' => true,
	'NombrePlan' => true,
	'PlanID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\SC_ConsultarFechaFacturacion', [
	'PrecioFijoValor' => true,
	'PrecioFijo' => true,
	'fechaEmisionFacturacion' => true,
	'fechaCalculoFacturacion' => true,
	'LapsoID' => true,
	'SuscripcionID' => true,
	'NombrePlan' => true
]);
SC_ConsultarFechaFacturacion::__hx__init();
