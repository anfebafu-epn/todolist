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
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class PL_VerificacionReactivacion_PausaHoy_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.PL_VerificacionReactivacion_PausaHoy_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;PL_VerificacionReactivacion_PausaHoy_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"PL_VerificacionReactivacion_PausaHoy_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;PL_VerificacionReactivacion_PausaHoy_VTA&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_VerificacionReactivacion_PausaHoy_VTA\", \"SuscripcionID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_FechaRenovacion public=\"1\" expr=\"new DateTimeSentence(&quot;PL_VerificacionReactivacion_PausaHoy_VTA&quot;, &quot;FechaRenovacion&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PL_VerificacionReactivacion_PausaHoy_VTA\", \"FechaRenovacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaRenovacion</haxe_doc>\x0A\x09</col_FechaRenovacion>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"50\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"59\" static=\"1\">\x0A\x09\x09<f a=\"val_SuscripcionID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<SuscripcionID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"65\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<FechaRenovacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaRenovacion>\x0A\x09<get_FechaRenovacion public=\"1\" set=\"method\" line=\"72\"><f a=\"\"><c path=\"Date\"/></f></get_FechaRenovacion>\x0A\x09<set_FechaRenovacion public=\"1\" set=\"method\" line=\"76\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaRenovacion>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PL_VerificacionReactivacion_PausaHoy_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaRenovacion
	 */
	static public $col_FechaRenovacion;
	/**
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var \Date
	 */
	public $FechaRenovacion;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_SuscripcionID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_SuscripcionID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:60: characters 3-112
		return SQL::SELECT()->FROM(PL_VerificacionReactivacion_PausaHoy_VTA::$view)->WHERE(Condition::SET(PL_VerificacionReactivacion_PausaHoy_VTA::$col_SuscripcionID, Op::Equal(), Val::uuid($val_SuscripcionID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:51: characters 3-50
		return SQL::SELECT()->FROM(PL_VerificacionReactivacion_PausaHoy_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PL_VerificacionReactivacion_PausaHoy_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return \Date
	 */
	public function get_FechaRenovacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:73: characters 3-25
		return $this->FechaRenovacion;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:66: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaRenovacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:79: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_FechaRenovacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:79: characters 79-98
			$tmp = PL_VerificacionReactivacion_PausaHoy_VTA::$col_FechaRenovacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:79: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaRenovacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_VerificacionReactivacion_PausaHoy_VTA.hx:80: characters 3-31
		return $this->FechaRenovacion = $value;
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


		self::$view = new ViewSource("PL_VerificacionReactivacion_PausaHoy_VTA");
		self::$col_SuscripcionID = new UUIDSentence("PL_VerificacionReactivacion_PausaHoy_VTA", "SuscripcionID", NullableEnum::NOTNULL(), true);
		self::$col_FechaRenovacion = new DateTimeSentence("PL_VerificacionReactivacion_PausaHoy_VTA", "FechaRenovacion", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(PL_VerificacionReactivacion_PausaHoy_VTA::class, 'nMorph.core.db.zhungo_core.PL_VerificacionReactivacion_PausaHoy_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\PL_VerificacionReactivacion_PausaHoy_VTA', [
	'FechaRenovacion' => true,
	'SuscripcionID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\PL_VerificacionReactivacion_PausaHoy_VTA', [
	'FechaRenovacion' => true
]);
PL_VerificacionReactivacion_PausaHoy_VTA::__hx__init();
