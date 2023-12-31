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
class FC_IndicacionPreFacturas_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_IndicacionPreFacturas_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;FC_IndicacionPreFacturas_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"FC_IndicacionPreFacturas_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;EmpresaID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"EmpresaID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_IndicacionPreFacturas_VTA\", \"NombreEmpresa\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;ProductoID&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"ProductoID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;NombreProducto&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_IndicacionPreFacturas_VTA\", \"NombreProducto\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"PlanID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_PlanNombre public=\"1\" expr=\"new VarcharSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;PlanNombre&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_IndicacionPreFacturas_VTA\", \"PlanNombre\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanNombre</haxe_doc>\x0A\x09</col_PlanNombre>\x0A\x09<col_FacturaID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;FacturaID&quot;, NullableEnum.NOTNULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"FacturaID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FacturaID</haxe_doc>\x0A\x09</col_FacturaID>\x0A\x09<col_IDFactura public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;IDFactura&quot;, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"IDFactura\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFactura</haxe_doc>\x0A\x09</col_IDFactura>\x0A\x09<col_IDGrupo public=\"1\" expr=\"new UUIDSentence(&quot;FC_IndicacionPreFacturas_VTA&quot;, &quot;IDGrupo&quot;, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IndicacionPreFacturas_VTA\", \"IDGrupo\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDGrupo</haxe_doc>\x0A\x09</col_IDGrupo>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"85\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"94\" static=\"1\">\x0A\x09\x09<f a=\"val_EmpresaID:val_ProductoID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<EmpresaID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"100\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"107\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"111\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<ProductoID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"121\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"128\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"132\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<PlanID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"142\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<set_PlanID public=\"1\" set=\"method\" line=\"146\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PlanID>\x0A\x09<PlanNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanNombre>\x0A\x09<get_PlanNombre public=\"1\" set=\"method\" line=\"156\"><f a=\"\"><c path=\"String\"/></f></get_PlanNombre>\x0A\x09<set_PlanNombre public=\"1\" set=\"method\" line=\"160\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PlanNombre>\x0A\x09<FacturaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FacturaID>\x0A\x09<get_FacturaID public=\"1\" set=\"method\" line=\"170\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_FacturaID>\x0A\x09<set_FacturaID public=\"1\" set=\"method\" line=\"174\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_FacturaID>\x0A\x09<IDFactura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFactura>\x0A\x09<get_IDFactura public=\"1\" set=\"method\" line=\"184\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFactura>\x0A\x09<set_IDFactura public=\"1\" set=\"method\" line=\"188\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_IDFactura>\x0A\x09<IDGrupo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDGrupo>\x0A\x09<get_IDGrupo public=\"1\" set=\"method\" line=\"198\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDGrupo>\x0A\x09<set_IDGrupo public=\"1\" set=\"method\" line=\"202\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_IDGrupo>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_IndicacionPreFacturas_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna EmpresaID
	 */
	static public $col_EmpresaID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna FacturaID
	 */
	static public $col_FacturaID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDFactura
	 */
	static public $col_IDFactura;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDGrupo
	 */
	static public $col_IDGrupo;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreEmpresa
	 */
	static public $col_NombreEmpresa;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreProducto
	 */
	static public $col_NombreProducto;
	/**
	 * @var UUIDSentence
	 * Referencia a columna PlanID
	 */
	static public $col_PlanID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna PlanNombre
	 */
	static public $col_PlanNombre;
	/**
	 * @var UUIDSentence
	 * Referencia a columna ProductoID
	 */
	static public $col_ProductoID;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var UUID
	 */
	public $EmpresaID;
	/**
	 * @var UUID
	 */
	public $FacturaID;
	/**
	 * @var UUID
	 */
	public $IDFactura;
	/**
	 * @var UUID
	 */
	public $IDGrupo;
	/**
	 * @var string
	 */
	public $NombreEmpresa;
	/**
	 * @var string
	 */
	public $NombreProducto;
	/**
	 * @var UUID
	 */
	public $PlanID;
	/**
	 * @var string
	 */
	public $PlanNombre;
	/**
	 * @var UUID
	 */
	public $ProductoID;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_EmpresaID
	 * @param UUID $val_ProductoID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_EmpresaID, $val_ProductoID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:95: characters 3-163
		return SQL::SELECT()->FROM(FC_IndicacionPreFacturas_VTA::$view)->WHERE(Condition::SET(FC_IndicacionPreFacturas_VTA::$col_EmpresaID, Op::Equal(), Val::uuid($val_EmpresaID))->AND_Ex(FC_IndicacionPreFacturas_VTA::$col_ProductoID, Op::Equal(), Val::uuid($val_ProductoID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:86: characters 3-50
		return SQL::SELECT()->FROM(FC_IndicacionPreFacturas_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_IndicacionPreFacturas_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:101: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return UUID
	 */
	public function get_FacturaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:171: characters 3-19
		return $this->FacturaID;
	}

	/**
	 * @return UUID
	 */
	public function get_IDFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:185: characters 3-19
		return $this->IDFactura;
	}

	/**
	 * @return UUID
	 */
	public function get_IDGrupo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:199: characters 3-17
		return $this->IDGrupo;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:108: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:129: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:143: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return string
	 */
	public function get_PlanNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:157: characters 3-20
		return $this->PlanNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:122: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_FacturaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:177: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_FacturaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:177: characters 73-86
			$tmp = FC_IndicacionPreFacturas_VTA::$col_FacturaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:177: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_FacturaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:178: characters 3-25
		return $this->FacturaID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_IDFactura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:191: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_IDFactura() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:191: characters 73-86
			$tmp = FC_IndicacionPreFacturas_VTA::$col_IDFactura;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:191: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_IDFactura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:192: characters 3-25
		return $this->IDFactura = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_IDGrupo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:205: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_IDGrupo() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:205: characters 71-82
			$tmp = FC_IndicacionPreFacturas_VTA::$col_IDGrupo;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:205: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_IDGrupo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:206: characters 3-23
		return $this->IDGrupo = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:114: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:114: characters 77-94
			$tmp = FC_IndicacionPreFacturas_VTA::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:114: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:115: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:135: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:135: characters 78-96
			$tmp = FC_IndicacionPreFacturas_VTA::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:135: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:136: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PlanID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:149: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_PlanID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:149: characters 70-80
			$tmp = FC_IndicacionPreFacturas_VTA::$col_PlanID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:149: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:150: characters 3-22
		return $this->PlanID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PlanNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:163: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_PlanNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:163: characters 74-88
			$tmp = FC_IndicacionPreFacturas_VTA::$col_PlanNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:163: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IndicacionPreFacturas_VTA.hx:164: characters 3-26
		return $this->PlanNombre = $value;
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


		self::$view = new ViewSource("FC_IndicacionPreFacturas_VTA");
		self::$col_EmpresaID = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "EmpresaID", NullableEnum::NOTNULL(), true);
		self::$col_NombreEmpresa = new VarcharSentence("FC_IndicacionPreFacturas_VTA", "NombreEmpresa", 250, NullableEnum::NOTNULL(), false);
		self::$col_ProductoID = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "ProductoID", NullableEnum::NOTNULL(), true);
		self::$col_NombreProducto = new VarcharSentence("FC_IndicacionPreFacturas_VTA", "NombreProducto", 250, NullableEnum::NOTNULL(), false);
		self::$col_PlanID = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "PlanID", NullableEnum::NOTNULL(), false);
		self::$col_PlanNombre = new VarcharSentence("FC_IndicacionPreFacturas_VTA", "PlanNombre", 250, NullableEnum::NOTNULL(), false);
		self::$col_FacturaID = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "FacturaID", NullableEnum::NOTNULL(), false);
		self::$col_IDFactura = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "IDFactura", NullableEnum::NULL(), false);
		self::$col_IDGrupo = new UUIDSentence("FC_IndicacionPreFacturas_VTA", "IDGrupo", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(FC_IndicacionPreFacturas_VTA::class, 'nMorph.core.db.zhungo_core.FC_IndicacionPreFacturas_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_IndicacionPreFacturas_VTA', [
	'IDGrupo' => true,
	'IDFactura' => true,
	'FacturaID' => true,
	'PlanNombre' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_IndicacionPreFacturas_VTA', [
	'IDGrupo' => true,
	'IDFactura' => true,
	'FacturaID' => true,
	'PlanNombre' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'NombreEmpresa' => true
]);
FC_IndicacionPreFacturas_VTA::__hx__init();
