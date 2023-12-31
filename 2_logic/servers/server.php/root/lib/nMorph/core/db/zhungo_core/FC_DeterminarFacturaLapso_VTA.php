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
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\fields\IntegerSentence;
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
class FC_DeterminarFacturaLapso_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_DeterminarFacturaLapso_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;FC_DeterminarFacturaLapso_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"FC_DeterminarFacturaLapso_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_IDFactura public=\"1\" expr=\"new UUIDSentence(&quot;FC_DeterminarFacturaLapso_VTA&quot;, &quot;IDFactura&quot;, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_DeterminarFacturaLapso_VTA\", \"IDFactura\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFactura</haxe_doc>\x0A\x09</col_IDFactura>\x0A\x09<col_Cantidad public=\"1\" expr=\"new IntegerSentence(&quot;FC_DeterminarFacturaLapso_VTA&quot;, &quot;Cantidad&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_DeterminarFacturaLapso_VTA\", \"Cantidad\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Cantidad</haxe_doc>\x0A\x09</col_Cantidad>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"50\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"59\" static=\"1\">\x0A\x09\x09<f a=\"val_IDFactura\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<IDFactura get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFactura>\x0A\x09<get_IDFactura public=\"1\" set=\"method\" line=\"65\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFactura>\x0A\x09<Cantidad get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Cantidad>\x0A\x09<get_Cantidad public=\"1\" set=\"method\" line=\"72\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Cantidad>\x0A\x09<set_Cantidad public=\"1\" set=\"method\" line=\"76\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Cantidad>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_DeterminarFacturaLapso_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var IntegerSentence
	 * Referencia a columna Cantidad
	 */
	static public $col_Cantidad;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDFactura
	 */
	static public $col_IDFactura;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var int
	 */
	public $Cantidad;
	/**
	 * @var UUID
	 */
	public $IDFactura;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_IDFactura
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_IDFactura) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:60: characters 3-104
		return SQL::SELECT()->FROM(FC_DeterminarFacturaLapso_VTA::$view)->WHERE(Condition::SET(FC_DeterminarFacturaLapso_VTA::$col_IDFactura, Op::Equal(), Val::uuid($val_IDFactura)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:51: characters 3-50
		return SQL::SELECT()->FROM(FC_DeterminarFacturaLapso_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_DeterminarFacturaLapso_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return int
	 */
	public function get_Cantidad () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:73: characters 3-18
		return $this->Cantidad;
	}

	/**
	 * @return UUID
	 */
	public function get_IDFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:66: characters 3-19
		return $this->IDFactura;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Cantidad ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:79: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_Cantidad() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:79: characters 72-84
			$tmp = FC_DeterminarFacturaLapso_VTA::$col_Cantidad;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:79: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_Cantidad(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaLapso_VTA.hx:80: characters 3-24
		return $this->Cantidad = $value;
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


		self::$view = new ViewSource("FC_DeterminarFacturaLapso_VTA");
		self::$col_IDFactura = new UUIDSentence("FC_DeterminarFacturaLapso_VTA", "IDFactura", NullableEnum::NULL(), true);
		self::$col_Cantidad = new IntegerSentence("FC_DeterminarFacturaLapso_VTA", "Cantidad", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(FC_DeterminarFacturaLapso_VTA::class, 'nMorph.core.db.zhungo_core.FC_DeterminarFacturaLapso_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_DeterminarFacturaLapso_VTA', [
	'Cantidad' => true,
	'IDFactura' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_DeterminarFacturaLapso_VTA', [
	'Cantidad' => true
]);
FC_DeterminarFacturaLapso_VTA::__hx__init();
