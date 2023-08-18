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
use \nMorph\framework\orm\common\fields\IntegerSentence;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\NCharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\sources\TableSource;
use \nMorph\framework\orm\common\fields\BooleanSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class FC_IntentoCobro extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_IntentoCobro\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;FC_IntentoCobro&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"FC_IntentoCobro\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_IntentoCobroID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IntentoCobro&quot;, &quot;IntentoCobroID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IntentoCobro\", \"IntentoCobroID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IntentoCobroID</haxe_doc>\x0A\x09</col_IntentoCobroID>\x0A\x09<col_ArchivoID public=\"1\" expr=\"new UUIDSentence(&quot;FC_IntentoCobro&quot;, &quot;ArchivoID&quot;, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IntentoCobro\", \"ArchivoID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ArchivoID</haxe_doc>\x0A\x09</col_ArchivoID>\x0A\x09<col_IDFactura public=\"1\" expr=\"new UUIDSentence(&quot;FC_IntentoCobro&quot;, &quot;IDFactura&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_IntentoCobro\", \"IDFactura\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFactura</haxe_doc>\x0A\x09</col_IDFactura>\x0A\x09<col_NumFactura public=\"1\" expr=\"new IntegerSentence(&quot;FC_IntentoCobro&quot;, &quot;NumFactura&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_IntentoCobro\", \"NumFactura\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NumFactura</haxe_doc>\x0A\x09</col_NumFactura>\x0A\x09<col_MontoFactura public=\"1\" expr=\"new DecimalSentence(&quot;FC_IntentoCobro&quot;, &quot;MontoFactura&quot;, 9, 4, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_IntentoCobro\", \"MontoFactura\", 9, 4, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna MontoFactura</haxe_doc>\x0A\x09</col_MontoFactura>\x0A\x09<col_FechaFactura public=\"1\" expr=\"new DateTimeSentence(&quot;FC_IntentoCobro&quot;, &quot;FechaFactura&quot;, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_IntentoCobro\", \"FechaFactura\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaFactura</haxe_doc>\x0A\x09</col_FechaFactura>\x0A\x09<col_FechaCobrada public=\"1\" expr=\"new DateTimeSentence(&quot;FC_IntentoCobro&quot;, &quot;FechaCobrada&quot;, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_IntentoCobro\", \"FechaCobrada\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCobrada</haxe_doc>\x0A\x09</col_FechaCobrada>\x0A\x09<col_CodigoRespuesta public=\"1\" expr=\"new NCharSentence(&quot;FC_IntentoCobro&quot;, &quot;CodigoRespuesta&quot;, 20, NullableEnum.NOTNULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.NCharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new NCharSentence(\"FC_IntentoCobro\", \"CodigoRespuesta\", 20, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna CodigoRespuesta</haxe_doc>\x0A\x09</col_CodigoRespuesta>\x0A\x09<col_FechaIntento public=\"1\" expr=\"new DateTimeSentence(&quot;FC_IntentoCobro&quot;, &quot;FechaIntento&quot;, NullableEnum.NOTNULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_IntentoCobro\", \"FechaIntento\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaIntento</haxe_doc>\x0A\x09</col_FechaIntento>\x0A\x09<col_Status public=\"1\" expr=\"new IntegerSentence(&quot;FC_IntentoCobro&quot;, &quot;Status&quot;, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_IntentoCobro\", \"Status\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;FC_IntentoCobro&quot;, &quot;Estado&quot;, NullableEnum.NOTNULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_IntentoCobro\", \"Estado\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"95\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"104\" static=\"1\">\x0A\x09\x09<f a=\"val_IntentoCobroID:val_IDFactura\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<IntentoCobroID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IntentoCobroID>\x0A\x09<get_IntentoCobroID public=\"1\" set=\"method\" line=\"110\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IntentoCobroID>\x0A\x09<ArchivoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ArchivoID>\x0A\x09<get_ArchivoID public=\"1\" set=\"method\" line=\"117\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ArchivoID>\x0A\x09<set_ArchivoID public=\"1\" set=\"method\" line=\"121\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ArchivoID>\x0A\x09<IDFactura get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFactura>\x0A\x09<get_IDFactura public=\"1\" set=\"method\" line=\"131\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFactura>\x0A\x09<NumFactura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NumFactura>\x0A\x09<get_NumFactura public=\"1\" set=\"method\" line=\"138\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_NumFactura>\x0A\x09<set_NumFactura public=\"1\" set=\"method\" line=\"142\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_NumFactura>\x0A\x09<MontoFactura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Float\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</MontoFactura>\x0A\x09<get_MontoFactura public=\"1\" set=\"method\" line=\"152\"><f a=\"\"><x path=\"Float\"/></f></get_MontoFactura>\x0A\x09<set_MontoFactura public=\"1\" set=\"method\" line=\"156\"><f a=\"value\">\x0A\x09<x path=\"Float\"/>\x0A\x09<x path=\"Float\"/>\x0A</f></set_MontoFactura>\x0A\x09<FechaFactura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaFactura>\x0A\x09<get_FechaFactura public=\"1\" set=\"method\" line=\"166\"><f a=\"\"><c path=\"Date\"/></f></get_FechaFactura>\x0A\x09<set_FechaFactura public=\"1\" set=\"method\" line=\"170\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaFactura>\x0A\x09<FechaCobrada get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCobrada>\x0A\x09<get_FechaCobrada public=\"1\" set=\"method\" line=\"180\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCobrada>\x0A\x09<set_FechaCobrada public=\"1\" set=\"method\" line=\"184\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCobrada>\x0A\x09<CodigoRespuesta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</CodigoRespuesta>\x0A\x09<get_CodigoRespuesta public=\"1\" set=\"method\" line=\"194\"><f a=\"\"><c path=\"String\"/></f></get_CodigoRespuesta>\x0A\x09<set_CodigoRespuesta public=\"1\" set=\"method\" line=\"198\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_CodigoRespuesta>\x0A\x09<FechaIntento get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaIntento>\x0A\x09<get_FechaIntento public=\"1\" set=\"method\" line=\"208\"><f a=\"\"><c path=\"Date\"/></f></get_FechaIntento>\x0A\x09<set_FechaIntento public=\"1\" set=\"method\" line=\"212\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaIntento>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"222\"><f a=\"\"><x path=\"Int\"/></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"226\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"236\"><f a=\"\"><x path=\"Bool\"/></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"240\"><f a=\"value\">\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Bool\"/>\x0A</f></set_Estado>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_IntentoCobro que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna ArchivoID
	 */
	static public $col_ArchivoID;
	/**
	 * @var NCharSentence
	 * Referencia a columna CodigoRespuesta
	 */
	static public $col_CodigoRespuesta;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Estado
	 */
	static public $col_Estado;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCobrada
	 */
	static public $col_FechaCobrada;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaFactura
	 */
	static public $col_FechaFactura;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaIntento
	 */
	static public $col_FechaIntento;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDFactura
	 */
	static public $col_IDFactura;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IntentoCobroID
	 */
	static public $col_IntentoCobroID;
	/**
	 * @var DecimalSentence
	 * Referencia a columna MontoFactura
	 */
	static public $col_MontoFactura;
	/**
	 * @var IntegerSentence
	 * Referencia a columna NumFactura
	 */
	static public $col_NumFactura;
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
	 * @var UUID
	 */
	public $ArchivoID;
	/**
	 * @var string
	 */
	public $CodigoRespuesta;
	/**
	 * @var bool
	 */
	public $Estado;
	/**
	 * @var \Date
	 */
	public $FechaCobrada;
	/**
	 * @var \Date
	 */
	public $FechaFactura;
	/**
	 * @var \Date
	 */
	public $FechaIntento;
	/**
	 * @var UUID
	 */
	public $IDFactura;
	/**
	 * @var UUID
	 */
	public $IntentoCobroID;
	/**
	 * @var float
	 */
	public $MontoFactura;
	/**
	 * @var int
	 */
	public $NumFactura;
	/**
	 * @var int
	 */
	public $Status;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_IntentoCobroID
	 * @param UUID $val_IDFactura
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_IntentoCobroID, $val_IDFactura) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:105: characters 3-172
		return SQL::SELECT()->FROM(FC_IntentoCobro::$table)->WHERE(Condition::SET(FC_IntentoCobro::$col_IntentoCobroID, Op::Equal(), Val::uuid($val_IntentoCobroID))->AND_Ex(FC_IntentoCobro::$col_IDFactura, Op::Equal(), Val::uuid($val_IDFactura)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:96: characters 3-51
		return SQL::SELECT()->FROM(FC_IntentoCobro::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_IntentoCobro que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_ArchivoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:118: characters 3-19
		return $this->ArchivoID;
	}

	/**
	 * @return string
	 */
	public function get_CodigoRespuesta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:195: characters 3-25
		return $this->CodigoRespuesta;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:237: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCobrada () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:181: characters 3-22
		return $this->FechaCobrada;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:167: characters 3-22
		return $this->FechaFactura;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaIntento () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:209: characters 3-22
		return $this->FechaIntento;
	}

	/**
	 * @return UUID
	 */
	public function get_IDFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:132: characters 3-19
		return $this->IDFactura;
	}

	/**
	 * @return UUID
	 */
	public function get_IntentoCobroID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:111: characters 3-24
		return $this->IntentoCobroID;
	}

	/**
	 * @return float
	 */
	public function get_MontoFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:153: characters 3-22
		return $this->MontoFactura;
	}

	/**
	 * @return int
	 */
	public function get_NumFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:139: characters 3-20
		return $this->NumFactura;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:223: characters 3-16
		return $this->Status;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ArchivoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:124: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_ArchivoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:124: characters 73-86
			$tmp = FC_IntentoCobro::$col_ArchivoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:124: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_ArchivoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:125: characters 3-25
		return $this->ArchivoID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_CodigoRespuesta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:201: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_CodigoRespuesta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:201: characters 79-98
			$tmp = FC_IntentoCobro::$col_CodigoRespuesta;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:201: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_CodigoRespuesta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:202: characters 3-31
		return $this->CodigoRespuesta = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:243: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:243: characters 70-80
			$tmp = FC_IntentoCobro::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:243: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:244: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCobrada ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:187: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_FechaCobrada() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:187: characters 76-92
			$tmp = FC_IntentoCobro::$col_FechaCobrada;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:187: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCobrada(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:188: characters 3-28
		return $this->FechaCobrada = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaFactura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:173: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_FechaFactura() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:173: characters 76-92
			$tmp = FC_IntentoCobro::$col_FechaFactura;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:173: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaFactura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:174: characters 3-28
		return $this->FechaFactura = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaIntento ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:215: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_FechaIntento() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:215: characters 76-92
			$tmp = FC_IntentoCobro::$col_FechaIntento;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:215: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaIntento(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:216: characters 3-28
		return $this->FechaIntento = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_MontoFactura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:159: characters 3-120
		if ($this->get_TrackChanges() && !Boot::equal($this->get_MontoFactura(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:159: characters 76-92
			$tmp = FC_IntentoCobro::$col_MontoFactura;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:159: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_MontoFactura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:160: characters 3-28
		return $this->MontoFactura = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_NumFactura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:145: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NumFactura() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:145: characters 74-88
			$tmp = FC_IntentoCobro::$col_NumFactura;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:145: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NumFactura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:146: characters 3-26
		return $this->NumFactura = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:229: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:229: characters 70-80
			$tmp = FC_IntentoCobro::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:229: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_IntentoCobro.hx:230: characters 3-22
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


		self::$table = new TableSource("FC_IntentoCobro");
		self::$col_IntentoCobroID = new UUIDSentence("FC_IntentoCobro", "IntentoCobroID", NullableEnum::NOTNULL(), true);
		self::$col_ArchivoID = new UUIDSentence("FC_IntentoCobro", "ArchivoID", NullableEnum::NOTNULL(), false);
		self::$col_IDFactura = new UUIDSentence("FC_IntentoCobro", "IDFactura", NullableEnum::NOTNULL(), true);
		self::$col_NumFactura = new IntegerSentence("FC_IntentoCobro", "NumFactura", NullableEnum::NULL(), false);
		self::$col_MontoFactura = new DecimalSentence("FC_IntentoCobro", "MontoFactura", 9, 4, NullableEnum::NOTNULL(), false);
		self::$col_FechaFactura = new DateTimeSentence("FC_IntentoCobro", "FechaFactura", NullableEnum::NOTNULL(), false);
		self::$col_FechaCobrada = new DateTimeSentence("FC_IntentoCobro", "FechaCobrada", NullableEnum::NULL(), false);
		self::$col_CodigoRespuesta = new NCharSentence("FC_IntentoCobro", "CodigoRespuesta", 20, NullableEnum::NOTNULL(), false);
		self::$col_FechaIntento = new DateTimeSentence("FC_IntentoCobro", "FechaIntento", NullableEnum::NOTNULL(), false);
		self::$col_Status = new IntegerSentence("FC_IntentoCobro", "Status", NullableEnum::NOTNULL(), false);
		self::$col_Estado = new BooleanSentence("FC_IntentoCobro", "Estado", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(FC_IntentoCobro::class, 'nMorph.core.db.zhungo_core.FC_IntentoCobro');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_IntentoCobro', [
	'Estado' => true,
	'Status' => true,
	'FechaIntento' => true,
	'CodigoRespuesta' => true,
	'FechaCobrada' => true,
	'FechaFactura' => true,
	'MontoFactura' => true,
	'NumFactura' => true,
	'IDFactura' => true,
	'ArchivoID' => true,
	'IntentoCobroID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_IntentoCobro', [
	'Estado' => true,
	'Status' => true,
	'FechaIntento' => true,
	'CodigoRespuesta' => true,
	'FechaCobrada' => true,
	'FechaFactura' => true,
	'MontoFactura' => true,
	'NumFactura' => true,
	'ArchivoID' => true
]);
FC_IntentoCobro::__hx__init();