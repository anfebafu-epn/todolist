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
class FC_FacturacionAgrupada_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_FacturacionAgrupada_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;FC_FacturacionAgrupada_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"FC_FacturacionAgrupada_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_ID public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;ID&quot;, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturacionAgrupada_VTA\", \"ID\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ID</haxe_doc>\x0A\x09</col_ID>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturacionAgrupada_VTA\", \"SuscripcionID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_NombrePersona public=\"1\" expr=\"new VarcharSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;NombrePersona&quot;, 250, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FacturacionAgrupada_VTA\", \"NombrePersona\", 250, NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePersona</haxe_doc>\x0A\x09</col_NombrePersona>\x0A\x09<col_IDGrupo public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;IDGrupo&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturacionAgrupada_VTA\", \"IDGrupo\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDGrupo</haxe_doc>\x0A\x09</col_IDGrupo>\x0A\x09<col_csv public=\"1\" expr=\"new VarcharSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;csv&quot;, -1, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FacturacionAgrupada_VTA\", \"csv\", -1, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna csv</haxe_doc>\x0A\x09</col_csv>\x0A\x09<col_ListaID public=\"1\" expr=\"new VarcharSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;ListaID&quot;, -1, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FacturacionAgrupada_VTA\", \"ListaID\", -1, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ListaID</haxe_doc>\x0A\x09</col_ListaID>\x0A\x09<col_SaldoPositivo public=\"1\" expr=\"new DecimalSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;SaldoPositivo&quot;, 17, 8, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_FacturacionAgrupada_VTA\", \"SaldoPositivo\", 17, 8, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SaldoPositivo</haxe_doc>\x0A\x09</col_SaldoPositivo>\x0A\x09<col_SaldoNegativo public=\"1\" expr=\"new DecimalSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;SaldoNegativo&quot;, 17, 8, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_FacturacionAgrupada_VTA\", \"SaldoNegativo\", 17, 8, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SaldoNegativo</haxe_doc>\x0A\x09</col_SaldoNegativo>\x0A\x09<col_SaldoCompleto public=\"1\" expr=\"new DecimalSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;SaldoCompleto&quot;, 17, 8, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_FacturacionAgrupada_VTA\", \"SaldoCompleto\", 17, 8, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SaldoCompleto</haxe_doc>\x0A\x09</col_SaldoCompleto>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;FC_FacturacionAgrupada_VTA&quot;, &quot;EmpresaID&quot;, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FacturacionAgrupada_VTA\", \"EmpresaID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"90\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"99\" static=\"1\">\x0A\x09\x09<f a=\"val_ID:val_NombrePersona\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"String\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<ID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ID>\x0A\x09<get_ID public=\"1\" set=\"method\" line=\"105\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ID>\x0A\x09<SuscripcionID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"112\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<set_SuscripcionID public=\"1\" set=\"method\" line=\"116\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_SuscripcionID>\x0A\x09<NombrePersona get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePersona>\x0A\x09<get_NombrePersona public=\"1\" set=\"method\" line=\"126\"><f a=\"\"><c path=\"String\"/></f></get_NombrePersona>\x0A\x09<IDGrupo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDGrupo>\x0A\x09<get_IDGrupo public=\"1\" set=\"method\" line=\"133\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDGrupo>\x0A\x09<set_IDGrupo public=\"1\" set=\"method\" line=\"137\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_IDGrupo>\x0A\x09<csv get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</csv>\x0A\x09<get_csv public=\"1\" set=\"method\" line=\"147\"><f a=\"\"><c path=\"String\"/></f></get_csv>\x0A\x09<set_csv public=\"1\" set=\"method\" line=\"151\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_csv>\x0A\x09<ListaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ListaID>\x0A\x09<get_ListaID public=\"1\" set=\"method\" line=\"161\"><f a=\"\"><c path=\"String\"/></f></get_ListaID>\x0A\x09<set_ListaID public=\"1\" set=\"method\" line=\"165\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ListaID>\x0A\x09<SaldoPositivo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SaldoPositivo>\x0A\x09<get_SaldoPositivo public=\"1\" set=\"method\" line=\"175\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_SaldoPositivo>\x0A\x09<set_SaldoPositivo public=\"1\" set=\"method\" line=\"179\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_SaldoPositivo>\x0A\x09<SaldoNegativo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SaldoNegativo>\x0A\x09<get_SaldoNegativo public=\"1\" set=\"method\" line=\"189\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_SaldoNegativo>\x0A\x09<set_SaldoNegativo public=\"1\" set=\"method\" line=\"193\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_SaldoNegativo>\x0A\x09<SaldoCompleto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SaldoCompleto>\x0A\x09<get_SaldoCompleto public=\"1\" set=\"method\" line=\"203\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_SaldoCompleto>\x0A\x09<set_SaldoCompleto public=\"1\" set=\"method\" line=\"207\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_SaldoCompleto>\x0A\x09<EmpresaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"217\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<set_EmpresaID public=\"1\" set=\"method\" line=\"221\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_EmpresaID>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_FacturacionAgrupada_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna EmpresaID
	 */
	static public $col_EmpresaID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna ID
	 */
	static public $col_ID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDGrupo
	 */
	static public $col_IDGrupo;
	/**
	 * @var VarcharSentence
	 * Referencia a columna ListaID
	 */
	static public $col_ListaID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombrePersona
	 */
	static public $col_NombrePersona;
	/**
	 * @var DecimalSentence
	 * Referencia a columna SaldoCompleto
	 */
	static public $col_SaldoCompleto;
	/**
	 * @var DecimalSentence
	 * Referencia a columna SaldoNegativo
	 */
	static public $col_SaldoNegativo;
	/**
	 * @var DecimalSentence
	 * Referencia a columna SaldoPositivo
	 */
	static public $col_SaldoPositivo;
	/**
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
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
	public $EmpresaID;
	/**
	 * @var UUID
	 */
	public $ID;
	/**
	 * @var UUID
	 */
	public $IDGrupo;
	/**
	 * @var string
	 */
	public $ListaID;
	/**
	 * @var string
	 */
	public $NombrePersona;
	/**
	 * @var float
	 */
	public $SaldoCompleto;
	/**
	 * @var float
	 */
	public $SaldoNegativo;
	/**
	 * @var float
	 */
	public $SaldoPositivo;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;
	/**
	 * @var string
	 */
	public $csv;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_ID
	 * @param string $val_NombrePersona
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_ID, $val_NombrePersona) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:100: characters 3-157
		return SQL::SELECT()->FROM(FC_FacturacionAgrupada_VTA::$view)->WHERE(Condition::SET(FC_FacturacionAgrupada_VTA::$col_ID, Op::Equal(), Val::uuid($val_ID))->AND_Ex(FC_FacturacionAgrupada_VTA::$col_NombrePersona, Op::Equal(), Val::string($val_NombrePersona)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:91: characters 3-50
		return SQL::SELECT()->FROM(FC_FacturacionAgrupada_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_FacturacionAgrupada_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:218: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return UUID
	 */
	public function get_ID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:106: characters 3-12
		return $this->ID;
	}

	/**
	 * @return UUID
	 */
	public function get_IDGrupo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:134: characters 3-17
		return $this->IDGrupo;
	}

	/**
	 * @return string
	 */
	public function get_ListaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:162: characters 3-17
		return $this->ListaID;
	}

	/**
	 * @return string
	 */
	public function get_NombrePersona () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:127: characters 3-23
		return $this->NombrePersona;
	}

	/**
	 * @return float
	 */
	public function get_SaldoCompleto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:204: characters 3-23
		return $this->SaldoCompleto;
	}

	/**
	 * @return float
	 */
	public function get_SaldoNegativo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:190: characters 3-23
		return $this->SaldoNegativo;
	}

	/**
	 * @return float
	 */
	public function get_SaldoPositivo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:176: characters 3-23
		return $this->SaldoPositivo;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:113: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @return string
	 */
	public function get_csv () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:148: characters 3-13
		return $this->csv;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_EmpresaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:224: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_EmpresaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:224: characters 73-86
			$tmp = FC_FacturacionAgrupada_VTA::$col_EmpresaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:224: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_EmpresaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:225: characters 3-25
		return $this->EmpresaID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_IDGrupo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:140: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_IDGrupo() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:140: characters 71-82
			$tmp = FC_FacturacionAgrupada_VTA::$col_IDGrupo;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:140: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_IDGrupo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:141: characters 3-23
		return $this->IDGrupo = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ListaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:168: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_ListaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:168: characters 71-82
			$tmp = FC_FacturacionAgrupada_VTA::$col_ListaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:168: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_ListaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:169: characters 3-23
		return $this->ListaID = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_SaldoCompleto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:210: characters 3-123
		if ($this->get_TrackChanges() && !Boot::equal($this->get_SaldoCompleto(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:210: characters 77-94
			$tmp = FC_FacturacionAgrupada_VTA::$col_SaldoCompleto;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:210: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SaldoCompleto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:211: characters 3-29
		return $this->SaldoCompleto = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_SaldoNegativo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:196: characters 3-123
		if ($this->get_TrackChanges() && !Boot::equal($this->get_SaldoNegativo(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:196: characters 77-94
			$tmp = FC_FacturacionAgrupada_VTA::$col_SaldoNegativo;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:196: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SaldoNegativo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:197: characters 3-29
		return $this->SaldoNegativo = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_SaldoPositivo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:182: characters 3-123
		if ($this->get_TrackChanges() && !Boot::equal($this->get_SaldoPositivo(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:182: characters 77-94
			$tmp = FC_FacturacionAgrupada_VTA::$col_SaldoPositivo;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:182: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SaldoPositivo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:183: characters 3-29
		return $this->SaldoPositivo = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_SuscripcionID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:119: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_SuscripcionID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:119: characters 77-94
			$tmp = FC_FacturacionAgrupada_VTA::$col_SuscripcionID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:119: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SuscripcionID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:120: characters 3-29
		return $this->SuscripcionID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_csv ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:154: characters 3-93
		if ($this->get_TrackChanges() && ($this->get_csv() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:154: characters 67-74
			$tmp = FC_FacturacionAgrupada_VTA::$col_csv;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:154: characters 42-93
			$this->AddChange(new ChangeItem($tmp, $this->get_csv(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FacturacionAgrupada_VTA.hx:155: characters 3-19
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


		self::$view = new ViewSource("FC_FacturacionAgrupada_VTA");
		self::$col_ID = new UUIDSentence("FC_FacturacionAgrupada_VTA", "ID", NullableEnum::NULL(), true);
		self::$col_SuscripcionID = new UUIDSentence("FC_FacturacionAgrupada_VTA", "SuscripcionID", NullableEnum::NOTNULL(), false);
		self::$col_NombrePersona = new VarcharSentence("FC_FacturacionAgrupada_VTA", "NombrePersona", 250, NullableEnum::NOTNULL(), true);
		self::$col_IDGrupo = new UUIDSentence("FC_FacturacionAgrupada_VTA", "IDGrupo", NullableEnum::NULL(), false);
		self::$col_csv = new VarcharSentence("FC_FacturacionAgrupada_VTA", "csv", -1, NullableEnum::NULL(), false);
		self::$col_ListaID = new VarcharSentence("FC_FacturacionAgrupada_VTA", "ListaID", -1, NullableEnum::NULL(), false);
		self::$col_SaldoPositivo = new DecimalSentence("FC_FacturacionAgrupada_VTA", "SaldoPositivo", 17, 8, NullableEnum::NULL(), false);
		self::$col_SaldoNegativo = new DecimalSentence("FC_FacturacionAgrupada_VTA", "SaldoNegativo", 17, 8, NullableEnum::NULL(), false);
		self::$col_SaldoCompleto = new DecimalSentence("FC_FacturacionAgrupada_VTA", "SaldoCompleto", 17, 8, NullableEnum::NULL(), false);
		self::$col_EmpresaID = new UUIDSentence("FC_FacturacionAgrupada_VTA", "EmpresaID", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(FC_FacturacionAgrupada_VTA::class, 'nMorph.core.db.zhungo_core.FC_FacturacionAgrupada_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_FacturacionAgrupada_VTA', [
	'EmpresaID' => true,
	'SaldoCompleto' => true,
	'SaldoNegativo' => true,
	'SaldoPositivo' => true,
	'ListaID' => true,
	'csv' => true,
	'IDGrupo' => true,
	'NombrePersona' => true,
	'SuscripcionID' => true,
	'ID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_FacturacionAgrupada_VTA', [
	'EmpresaID' => true,
	'SaldoCompleto' => true,
	'SaldoNegativo' => true,
	'SaldoPositivo' => true,
	'ListaID' => true,
	'csv' => true,
	'IDGrupo' => true,
	'SuscripcionID' => true
]);
FC_FacturacionAgrupada_VTA::__hx__init();
