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
use \nMorph\framework\orm\common\fields\IntegerSentence;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\sources\TableSource;
use \nMorph\framework\orm\common\fields\BooleanSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class FC_FormaPagoAdm extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_FormaPagoAdm\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;FC_FormaPagoAdm&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"FC_FormaPagoAdm\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_IDFormaPago public=\"1\" expr=\"new UUIDSentence(&quot;FC_FormaPagoAdm&quot;, &quot;IDFormaPago&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_FormaPagoAdm\", \"IDFormaPago\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFormaPago</haxe_doc>\x0A\x09</col_IDFormaPago>\x0A\x09<col_NombrePago public=\"1\" expr=\"new VarcharSentence(&quot;FC_FormaPagoAdm&quot;, &quot;NombrePago&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FormaPagoAdm\", \"NombrePago\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePago</haxe_doc>\x0A\x09</col_NombrePago>\x0A\x09<col_CodigoCore public=\"1\" expr=\"new VarcharSentence(&quot;FC_FormaPagoAdm&quot;, &quot;CodigoCore&quot;, 250, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_FormaPagoAdm\", \"CodigoCore\", 250, NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna CodigoCore</haxe_doc>\x0A\x09</col_CodigoCore>\x0A\x09<col_EsBancario public=\"1\" expr=\"new BooleanSentence(&quot;FC_FormaPagoAdm&quot;, &quot;EsBancario&quot;, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_FormaPagoAdm\", \"EsBancario\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EsBancario</haxe_doc>\x0A\x09</col_EsBancario>\x0A\x09<col_FechaCreacion public=\"1\" expr=\"new DateTimeSentence(&quot;FC_FormaPagoAdm&quot;, &quot;FechaCreacion&quot;, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_FormaPagoAdm\", \"FechaCreacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCreacion</haxe_doc>\x0A\x09</col_FechaCreacion>\x0A\x09<col_Status public=\"1\" expr=\"new IntegerSentence(&quot;FC_FormaPagoAdm&quot;, &quot;Status&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_FormaPagoAdm\", \"Status\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;FC_FormaPagoAdm&quot;, &quot;Estado&quot;, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_FormaPagoAdm\", \"Estado\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<col_Identificador public=\"1\" expr=\"new IntegerSentence(&quot;FC_FormaPagoAdm&quot;, &quot;Identificador&quot;, NullableEnum.NOTNULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_FormaPagoAdm\", \"Identificador\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Identificador</haxe_doc>\x0A\x09</col_Identificador>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"80\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"89\" static=\"1\">\x0A\x09\x09<f a=\"val_IDFormaPago:val_CodigoCore\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"String\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<IDFormaPago get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFormaPago>\x0A\x09<get_IDFormaPago public=\"1\" set=\"method\" line=\"95\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFormaPago>\x0A\x09<NombrePago get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePago>\x0A\x09<get_NombrePago public=\"1\" set=\"method\" line=\"102\"><f a=\"\"><c path=\"String\"/></f></get_NombrePago>\x0A\x09<set_NombrePago public=\"1\" set=\"method\" line=\"106\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePago>\x0A\x09<CodigoCore get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</CodigoCore>\x0A\x09<get_CodigoCore public=\"1\" set=\"method\" line=\"116\"><f a=\"\"><c path=\"String\"/></f></get_CodigoCore>\x0A\x09<EsBancario get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EsBancario>\x0A\x09<get_EsBancario public=\"1\" set=\"method\" line=\"123\"><f a=\"\"><x path=\"Bool\"/></f></get_EsBancario>\x0A\x09<set_EsBancario public=\"1\" set=\"method\" line=\"127\"><f a=\"value\">\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Bool\"/>\x0A</f></set_EsBancario>\x0A\x09<FechaCreacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCreacion>\x0A\x09<get_FechaCreacion public=\"1\" set=\"method\" line=\"137\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCreacion>\x0A\x09<set_FechaCreacion public=\"1\" set=\"method\" line=\"141\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCreacion>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"151\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"155\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"165\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"169\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_Estado>\x0A\x09<Identificador get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Identificador>\x0A\x09<get_Identificador public=\"1\" set=\"method\" line=\"179\"><f a=\"\"><x path=\"Int\"/></f></get_Identificador>\x0A\x09<set_Identificador public=\"1\" set=\"method\" line=\"183\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Identificador>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_FormaPagoAdm que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var VarcharSentence
	 * Referencia a columna CodigoCore
	 */
	static public $col_CodigoCore;
	/**
	 * @var BooleanSentence
	 * Referencia a columna EsBancario
	 */
	static public $col_EsBancario;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Estado
	 */
	static public $col_Estado;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCreacion
	 */
	static public $col_FechaCreacion;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDFormaPago
	 */
	static public $col_IDFormaPago;
	/**
	 * @var IntegerSentence
	 * Referencia a columna Identificador
	 */
	static public $col_Identificador;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombrePago
	 */
	static public $col_NombrePago;
	/**
	 * @var IntegerSentence
	 * Referencia a columna Status
	 */
	static public $col_Status;
	/**
	 * @var ISource
	 * referencia a tabla para consultas
	 */
	static public $table;

	/**
	 * @var string
	 */
	public $CodigoCore;
	/**
	 * @var bool
	 */
	public $EsBancario;
	/**
	 * @var bool
	 */
	public $Estado;
	/**
	 * @var \Date
	 */
	public $FechaCreacion;
	/**
	 * @var UUID
	 */
	public $IDFormaPago;
	/**
	 * @var int
	 */
	public $Identificador;
	/**
	 * @var string
	 */
	public $NombrePago;
	/**
	 * @var int
	 */
	public $Status;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_IDFormaPago
	 * @param string $val_CodigoCore
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_IDFormaPago, $val_CodigoCore) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:90: characters 3-170
		return SQL::SELECT()->FROM(FC_FormaPagoAdm::$table)->WHERE(Condition::SET(FC_FormaPagoAdm::$col_IDFormaPago, Op::Equal(), Val::uuid($val_IDFormaPago))->AND_Ex(FC_FormaPagoAdm::$col_CodigoCore, Op::Equal(), Val::string($val_CodigoCore)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:81: characters 3-51
		return SQL::SELECT()->FROM(FC_FormaPagoAdm::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_FormaPagoAdm que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return string
	 */
	public function get_CodigoCore () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:117: characters 3-20
		return $this->CodigoCore;
	}

	/**
	 * @return bool
	 */
	public function get_EsBancario () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:124: characters 3-20
		return $this->EsBancario;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:166: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCreacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:138: characters 3-23
		return $this->FechaCreacion;
	}

	/**
	 * @return UUID
	 */
	public function get_IDFormaPago () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:96: characters 3-21
		return $this->IDFormaPago;
	}

	/**
	 * @return int
	 */
	public function get_Identificador () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:180: characters 3-23
		return $this->Identificador;
	}

	/**
	 * @return string
	 */
	public function get_NombrePago () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:103: characters 3-20
		return $this->NombrePago;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:152: characters 3-16
		return $this->Status;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_EsBancario ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:130: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_EsBancario() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:130: characters 74-88
			$tmp = FC_FormaPagoAdm::$col_EsBancario;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:130: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_EsBancario(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:131: characters 3-26
		return $this->EsBancario = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:172: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:172: characters 70-80
			$tmp = FC_FormaPagoAdm::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:172: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:173: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCreacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:144: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaCreacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:144: characters 77-94
			$tmp = FC_FormaPagoAdm::$col_FechaCreacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:144: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCreacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:145: characters 3-29
		return $this->FechaCreacion = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Identificador ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:186: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_Identificador() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:186: characters 77-94
			$tmp = FC_FormaPagoAdm::$col_Identificador;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:186: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_Identificador(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:187: characters 3-29
		return $this->Identificador = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePago ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:109: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePago() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:109: characters 74-88
			$tmp = FC_FormaPagoAdm::$col_NombrePago;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:109: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePago(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:110: characters 3-26
		return $this->NombrePago = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:158: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:158: characters 70-80
			$tmp = FC_FormaPagoAdm::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:158: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_FormaPagoAdm.hx:159: characters 3-22
		return $this->Status = $value;
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


		self::$table = new TableSource("FC_FormaPagoAdm");
		self::$col_IDFormaPago = new UUIDSentence("FC_FormaPagoAdm", "IDFormaPago", NullableEnum::NOTNULL(), true);
		self::$col_NombrePago = new VarcharSentence("FC_FormaPagoAdm", "NombrePago", 250, NullableEnum::NOTNULL(), false);
		self::$col_CodigoCore = new VarcharSentence("FC_FormaPagoAdm", "CodigoCore", 250, NullableEnum::NOTNULL(), true);
		self::$col_EsBancario = new BooleanSentence("FC_FormaPagoAdm", "EsBancario", NullableEnum::NOTNULL(), false);
		self::$col_FechaCreacion = new DateTimeSentence("FC_FormaPagoAdm", "FechaCreacion", NullableEnum::NULL(), false);
		self::$col_Status = new IntegerSentence("FC_FormaPagoAdm", "Status", NullableEnum::NULL(), false);
		self::$col_Estado = new BooleanSentence("FC_FormaPagoAdm", "Estado", NullableEnum::NULL(), false);
		self::$col_Identificador = new IntegerSentence("FC_FormaPagoAdm", "Identificador", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(FC_FormaPagoAdm::class, 'nMorph.core.db.zhungo_core.FC_FormaPagoAdm');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_FormaPagoAdm', [
	'Identificador' => true,
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'EsBancario' => true,
	'CodigoCore' => true,
	'NombrePago' => true,
	'IDFormaPago' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_FormaPagoAdm', [
	'Identificador' => true,
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'EsBancario' => true,
	'NombrePago' => true
]);
FC_FormaPagoAdm::__hx__init();