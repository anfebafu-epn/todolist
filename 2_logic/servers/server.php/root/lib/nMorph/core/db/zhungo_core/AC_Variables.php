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
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\sources\TableSource;
use \nMorph\framework\orm\common\fields\SmallIntegerSentence;
use \nMorph\framework\orm\common\fields\BooleanSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class AC_Variables extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.AC_Variables\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;AC_Variables&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"AC_Variables\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_VariableID public=\"1\" expr=\"new UUIDSentence(&quot;AC_Variables&quot;, &quot;VariableID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"AC_Variables\", \"VariableID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna VariableID</haxe_doc>\x0A\x09</col_VariableID>\x0A\x09<col_NombreVariable public=\"1\" expr=\"new VarcharSentence(&quot;AC_Variables&quot;, &quot;NombreVariable&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"AC_Variables\", \"NombreVariable\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreVariable</haxe_doc>\x0A\x09</col_NombreVariable>\x0A\x09<col_TipoVariableID public=\"1\" expr=\"new UUIDSentence(&quot;AC_Variables&quot;, &quot;TipoVariableID&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"AC_Variables\", \"TipoVariableID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna TipoVariableID</haxe_doc>\x0A\x09</col_TipoVariableID>\x0A\x09<col_TipoVariableNombre public=\"1\" expr=\"new VarcharSentence(&quot;AC_Variables&quot;, &quot;TipoVariableNombre&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"AC_Variables\", \"TipoVariableNombre\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna TipoVariableNombre</haxe_doc>\x0A\x09</col_TipoVariableNombre>\x0A\x09<col_Opciones public=\"1\" expr=\"new VarcharSentence(&quot;AC_Variables&quot;, &quot;Opciones&quot;, -1, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"AC_Variables\", \"Opciones\", -1, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Opciones</haxe_doc>\x0A\x09</col_Opciones>\x0A\x09<col_ActivableID public=\"1\" expr=\"new UUIDSentence(&quot;AC_Variables&quot;, &quot;ActivableID&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"AC_Variables\", \"ActivableID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ActivableID</haxe_doc>\x0A\x09</col_ActivableID>\x0A\x09<col_ActivableNombre public=\"1\" expr=\"new VarcharSentence(&quot;AC_Variables&quot;, &quot;ActivableNombre&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"AC_Variables\", \"ActivableNombre\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ActivableNombre</haxe_doc>\x0A\x09</col_ActivableNombre>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;AC_Variables&quot;, &quot;EmpresaID&quot;, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"AC_Variables\", \"EmpresaID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;AC_Variables&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"AC_Variables\", \"NombreEmpresa\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_FechaRegistro public=\"1\" expr=\"new DateTimeSentence(&quot;AC_Variables&quot;, &quot;FechaRegistro&quot;, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"AC_Variables\", \"FechaRegistro\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaRegistro</haxe_doc>\x0A\x09</col_FechaRegistro>\x0A\x09<col_Status public=\"1\" expr=\"new SmallIntegerSentence(&quot;AC_Variables&quot;, &quot;Status&quot;, NullableEnum.NOTNULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.SmallIntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new SmallIntegerSentence(\"AC_Variables\", \"Status\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;AC_Variables&quot;, &quot;Estado&quot;, NullableEnum.NOTNULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"AC_Variables\", \"Estado\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"100\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"109\" static=\"1\">\x0A\x09\x09<f a=\"val_VariableID:val_TipoVariableID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<VariableID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</VariableID>\x0A\x09<get_VariableID public=\"1\" set=\"method\" line=\"115\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_VariableID>\x0A\x09<NombreVariable get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreVariable>\x0A\x09<get_NombreVariable public=\"1\" set=\"method\" line=\"122\"><f a=\"\"><c path=\"String\"/></f></get_NombreVariable>\x0A\x09<set_NombreVariable public=\"1\" set=\"method\" line=\"126\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreVariable>\x0A\x09<TipoVariableID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</TipoVariableID>\x0A\x09<get_TipoVariableID public=\"1\" set=\"method\" line=\"136\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_TipoVariableID>\x0A\x09<TipoVariableNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</TipoVariableNombre>\x0A\x09<get_TipoVariableNombre public=\"1\" set=\"method\" line=\"143\"><f a=\"\"><c path=\"String\"/></f></get_TipoVariableNombre>\x0A\x09<set_TipoVariableNombre public=\"1\" set=\"method\" line=\"147\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_TipoVariableNombre>\x0A\x09<Opciones get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Opciones>\x0A\x09<get_Opciones public=\"1\" set=\"method\" line=\"157\"><f a=\"\"><c path=\"String\"/></f></get_Opciones>\x0A\x09<set_Opciones public=\"1\" set=\"method\" line=\"161\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_Opciones>\x0A\x09<ActivableID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ActivableID>\x0A\x09<get_ActivableID public=\"1\" set=\"method\" line=\"171\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ActivableID>\x0A\x09<set_ActivableID public=\"1\" set=\"method\" line=\"175\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ActivableID>\x0A\x09<ActivableNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ActivableNombre>\x0A\x09<get_ActivableNombre public=\"1\" set=\"method\" line=\"185\"><f a=\"\"><c path=\"String\"/></f></get_ActivableNombre>\x0A\x09<set_ActivableNombre public=\"1\" set=\"method\" line=\"189\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ActivableNombre>\x0A\x09<EmpresaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"199\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<set_EmpresaID public=\"1\" set=\"method\" line=\"203\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"213\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"217\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<FechaRegistro get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaRegistro>\x0A\x09<get_FechaRegistro public=\"1\" set=\"method\" line=\"227\"><f a=\"\"><c path=\"Date\"/></f></get_FechaRegistro>\x0A\x09<set_FechaRegistro public=\"1\" set=\"method\" line=\"231\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaRegistro>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"241\"><f a=\"\"><x path=\"Int\"/></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"245\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"255\"><f a=\"\"><x path=\"Bool\"/></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"259\"><f a=\"value\">\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Bool\"/>\x0A</f></set_Estado>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase AC_Variables que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna ActivableID
	 */
	static public $col_ActivableID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna ActivableNombre
	 */
	static public $col_ActivableNombre;
	/**
	 * @var UUIDSentence
	 * Referencia a columna EmpresaID
	 */
	static public $col_EmpresaID;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Estado
	 */
	static public $col_Estado;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaRegistro
	 */
	static public $col_FechaRegistro;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreEmpresa
	 */
	static public $col_NombreEmpresa;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreVariable
	 */
	static public $col_NombreVariable;
	/**
	 * @var VarcharSentence
	 * Referencia a columna Opciones
	 */
	static public $col_Opciones;
	/**
	 * @var SmallIntegerSentence
	 * Referencia a columna Status
	 */
	static public $col_Status;
	/**
	 * @var UUIDSentence
	 * Referencia a columna TipoVariableID
	 */
	static public $col_TipoVariableID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna TipoVariableNombre
	 */
	static public $col_TipoVariableNombre;
	/**
	 * @var UUIDSentence
	 * Referencia a columna VariableID
	 */
	static public $col_VariableID;
	/**
	 * @var ISource
	 * referencia a tabla para consultas
	 */
	static public $table;

	/**
	 * @var UUID
	 */
	public $ActivableID;
	/**
	 * @var string
	 */
	public $ActivableNombre;
	/**
	 * @var UUID
	 */
	public $EmpresaID;
	/**
	 * @var bool
	 */
	public $Estado;
	/**
	 * @var \Date
	 */
	public $FechaRegistro;
	/**
	 * @var string
	 */
	public $NombreEmpresa;
	/**
	 * @var string
	 */
	public $NombreVariable;
	/**
	 * @var string
	 */
	public $Opciones;
	/**
	 * @var int
	 */
	public $Status;
	/**
	 * @var UUID
	 */
	public $TipoVariableID;
	/**
	 * @var string
	 */
	public $TipoVariableNombre;
	/**
	 * @var UUID
	 */
	public $VariableID;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_VariableID
	 * @param UUID $val_TipoVariableID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_VariableID, $val_TipoVariableID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:110: characters 3-174
		return SQL::SELECT()->FROM(AC_Variables::$table)->WHERE(Condition::SET(AC_Variables::$col_VariableID, Op::Equal(), Val::uuid($val_VariableID))->AND_Ex(AC_Variables::$col_TipoVariableID, Op::Equal(), Val::uuid($val_TipoVariableID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:101: characters 3-51
		return SQL::SELECT()->FROM(AC_Variables::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase AC_Variables que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_ActivableID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:172: characters 3-21
		return $this->ActivableID;
	}

	/**
	 * @return string
	 */
	public function get_ActivableNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:186: characters 3-25
		return $this->ActivableNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:200: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:256: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaRegistro () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:228: characters 3-23
		return $this->FechaRegistro;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:214: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombreVariable () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:123: characters 3-24
		return $this->NombreVariable;
	}

	/**
	 * @return string
	 */
	public function get_Opciones () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:158: characters 3-18
		return $this->Opciones;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:242: characters 3-16
		return $this->Status;
	}

	/**
	 * @return UUID
	 */
	public function get_TipoVariableID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:137: characters 3-24
		return $this->TipoVariableID;
	}

	/**
	 * @return string
	 */
	public function get_TipoVariableNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:144: characters 3-28
		return $this->TipoVariableNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_VariableID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:116: characters 3-20
		return $this->VariableID;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ActivableID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:178: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_ActivableID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:178: characters 75-90
			$tmp = AC_Variables::$col_ActivableID;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:178: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_ActivableID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:179: characters 3-27
		return $this->ActivableID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ActivableNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:192: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_ActivableNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:192: characters 79-98
			$tmp = AC_Variables::$col_ActivableNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:192: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_ActivableNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:193: characters 3-31
		return $this->ActivableNombre = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_EmpresaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:206: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_EmpresaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:206: characters 73-86
			$tmp = AC_Variables::$col_EmpresaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:206: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_EmpresaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:207: characters 3-25
		return $this->EmpresaID = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:262: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:262: characters 70-80
			$tmp = AC_Variables::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:262: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:263: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaRegistro ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:234: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaRegistro() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:234: characters 77-94
			$tmp = AC_Variables::$col_FechaRegistro;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:234: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaRegistro(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:235: characters 3-29
		return $this->FechaRegistro = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:220: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:220: characters 77-94
			$tmp = AC_Variables::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:220: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:221: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreVariable ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:129: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreVariable() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:129: characters 78-96
			$tmp = AC_Variables::$col_NombreVariable;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:129: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreVariable(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:130: characters 3-30
		return $this->NombreVariable = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Opciones ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:164: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_Opciones() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:164: characters 72-84
			$tmp = AC_Variables::$col_Opciones;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:164: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_Opciones(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:165: characters 3-24
		return $this->Opciones = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:248: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:248: characters 70-80
			$tmp = AC_Variables::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:248: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:249: characters 3-22
		return $this->Status = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_TipoVariableNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:150: characters 3-138
		if ($this->get_TrackChanges() && ($this->get_TipoVariableNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:150: characters 82-104
			$tmp = AC_Variables::$col_TipoVariableNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:150: characters 57-138
			$this->AddChange(new ChangeItem($tmp, $this->get_TipoVariableNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/AC_Variables.hx:151: characters 3-34
		return $this->TipoVariableNombre = $value;
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


		self::$table = new TableSource("AC_Variables");
		self::$col_VariableID = new UUIDSentence("AC_Variables", "VariableID", NullableEnum::NOTNULL(), true);
		self::$col_NombreVariable = new VarcharSentence("AC_Variables", "NombreVariable", 250, NullableEnum::NOTNULL(), false);
		self::$col_TipoVariableID = new UUIDSentence("AC_Variables", "TipoVariableID", NullableEnum::NOTNULL(), true);
		self::$col_TipoVariableNombre = new VarcharSentence("AC_Variables", "TipoVariableNombre", 250, NullableEnum::NOTNULL(), false);
		self::$col_Opciones = new VarcharSentence("AC_Variables", "Opciones", -1, NullableEnum::NULL(), false);
		self::$col_ActivableID = new UUIDSentence("AC_Variables", "ActivableID", NullableEnum::NULL(), false);
		self::$col_ActivableNombre = new VarcharSentence("AC_Variables", "ActivableNombre", 150, NullableEnum::NOTNULL(), false);
		self::$col_EmpresaID = new UUIDSentence("AC_Variables", "EmpresaID", NullableEnum::NULL(), false);
		self::$col_NombreEmpresa = new VarcharSentence("AC_Variables", "NombreEmpresa", 250, NullableEnum::NULL(), false);
		self::$col_FechaRegistro = new DateTimeSentence("AC_Variables", "FechaRegistro", NullableEnum::NOTNULL(), false);
		self::$col_Status = new SmallIntegerSentence("AC_Variables", "Status", NullableEnum::NOTNULL(), false);
		self::$col_Estado = new BooleanSentence("AC_Variables", "Estado", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(AC_Variables::class, 'nMorph.core.db.zhungo_core.AC_Variables');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\AC_Variables', [
	'Estado' => true,
	'Status' => true,
	'FechaRegistro' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'ActivableNombre' => true,
	'ActivableID' => true,
	'Opciones' => true,
	'TipoVariableNombre' => true,
	'TipoVariableID' => true,
	'NombreVariable' => true,
	'VariableID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\AC_Variables', [
	'Estado' => true,
	'Status' => true,
	'FechaRegistro' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'ActivableNombre' => true,
	'ActivableID' => true,
	'Opciones' => true,
	'TipoVariableNombre' => true,
	'NombreVariable' => true
]);
AC_Variables::__hx__init();