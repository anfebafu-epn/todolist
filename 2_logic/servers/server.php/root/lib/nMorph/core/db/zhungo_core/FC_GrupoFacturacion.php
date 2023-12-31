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
class FC_GrupoFacturacion extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_GrupoFacturacion\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;FC_GrupoFacturacion&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"FC_GrupoFacturacion\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_IDGrupo public=\"1\" expr=\"new UUIDSentence(&quot;FC_GrupoFacturacion&quot;, &quot;IDGrupo&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_GrupoFacturacion\", \"IDGrupo\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDGrupo</haxe_doc>\x0A\x09</col_IDGrupo>\x0A\x09<col_NombreGrupo public=\"1\" expr=\"new VarcharSentence(&quot;FC_GrupoFacturacion&quot;, &quot;NombreGrupo&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_GrupoFacturacion\", \"NombreGrupo\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreGrupo</haxe_doc>\x0A\x09</col_NombreGrupo>\x0A\x09<col_Consolidado public=\"1\" expr=\"new BooleanSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Consolidado&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_GrupoFacturacion\", \"Consolidado\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Consolidado</haxe_doc>\x0A\x09</col_Consolidado>\x0A\x09<col_Inidvidual public=\"1\" expr=\"new BooleanSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Inidvidual&quot;, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_GrupoFacturacion\", \"Inidvidual\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Inidvidual</haxe_doc>\x0A\x09</col_Inidvidual>\x0A\x09<col_Agrupada public=\"1\" expr=\"new BooleanSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Agrupada&quot;, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_GrupoFacturacion\", \"Agrupada\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Agrupada</haxe_doc>\x0A\x09</col_Agrupada>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;FC_GrupoFacturacion&quot;, &quot;EmpresaID&quot;, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_GrupoFacturacion\", \"EmpresaID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;FC_GrupoFacturacion&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_GrupoFacturacion\", \"NombreEmpresa\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_FechaCreacion public=\"1\" expr=\"new DateTimeSentence(&quot;FC_GrupoFacturacion&quot;, &quot;FechaCreacion&quot;, NullableEnum.NOTNULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_GrupoFacturacion\", \"FechaCreacion\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCreacion</haxe_doc>\x0A\x09</col_FechaCreacion>\x0A\x09<col_Status public=\"1\" expr=\"new IntegerSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Status&quot;, NullableEnum.NOTNULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_GrupoFacturacion\", \"Status\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Estado&quot;, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"FC_GrupoFacturacion\", \"Estado\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<col_Identificador public=\"1\" expr=\"new IntegerSentence(&quot;FC_GrupoFacturacion&quot;, &quot;Identificador&quot;, NullableEnum.NOTNULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"FC_GrupoFacturacion\", \"Identificador\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Identificador</haxe_doc>\x0A\x09</col_Identificador>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"95\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"104\" static=\"1\">\x0A\x09\x09<f a=\"val_IDGrupo:val_Consolidado\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<x path=\"Bool\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<IDGrupo get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDGrupo>\x0A\x09<get_IDGrupo public=\"1\" set=\"method\" line=\"110\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDGrupo>\x0A\x09<NombreGrupo get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreGrupo>\x0A\x09<get_NombreGrupo public=\"1\" set=\"method\" line=\"117\"><f a=\"\"><c path=\"String\"/></f></get_NombreGrupo>\x0A\x09<set_NombreGrupo public=\"1\" set=\"method\" line=\"121\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreGrupo>\x0A\x09<Consolidado get=\"accessor\" set=\"null\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Consolidado>\x0A\x09<get_Consolidado public=\"1\" set=\"method\" line=\"131\"><f a=\"\"><x path=\"Bool\"/></f></get_Consolidado>\x0A\x09<Inidvidual get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Inidvidual>\x0A\x09<get_Inidvidual public=\"1\" set=\"method\" line=\"138\"><f a=\"\"><x path=\"Bool\"/></f></get_Inidvidual>\x0A\x09<set_Inidvidual public=\"1\" set=\"method\" line=\"142\"><f a=\"value\">\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Bool\"/>\x0A</f></set_Inidvidual>\x0A\x09<Agrupada get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Agrupada>\x0A\x09<get_Agrupada public=\"1\" set=\"method\" line=\"152\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_Agrupada>\x0A\x09<set_Agrupada public=\"1\" set=\"method\" line=\"156\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_Agrupada>\x0A\x09<EmpresaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"166\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<set_EmpresaID public=\"1\" set=\"method\" line=\"170\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"180\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"184\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<FechaCreacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCreacion>\x0A\x09<get_FechaCreacion public=\"1\" set=\"method\" line=\"194\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCreacion>\x0A\x09<set_FechaCreacion public=\"1\" set=\"method\" line=\"198\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCreacion>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"208\"><f a=\"\"><x path=\"Int\"/></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"212\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Bool\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"222\"><f a=\"\"><x path=\"Bool\"/></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"226\"><f a=\"value\">\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Bool\"/>\x0A</f></set_Estado>\x0A\x09<Identificador get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Identificador>\x0A\x09<get_Identificador public=\"1\" set=\"method\" line=\"236\"><f a=\"\"><x path=\"Int\"/></f></get_Identificador>\x0A\x09<set_Identificador public=\"1\" set=\"method\" line=\"240\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Identificador>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_GrupoFacturacion que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var BooleanSentence
	 * Referencia a columna Agrupada
	 */
	static public $col_Agrupada;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Consolidado
	 */
	static public $col_Consolidado;
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
	 * Referencia a columna FechaCreacion
	 */
	static public $col_FechaCreacion;
	/**
	 * @var UUIDSentence
	 * Referencia a columna IDGrupo
	 */
	static public $col_IDGrupo;
	/**
	 * @var IntegerSentence
	 * Referencia a columna Identificador
	 */
	static public $col_Identificador;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Inidvidual
	 */
	static public $col_Inidvidual;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreEmpresa
	 */
	static public $col_NombreEmpresa;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreGrupo
	 */
	static public $col_NombreGrupo;
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
	 * @var bool
	 */
	public $Agrupada;
	/**
	 * @var bool
	 */
	public $Consolidado;
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
	public $FechaCreacion;
	/**
	 * @var UUID
	 */
	public $IDGrupo;
	/**
	 * @var int
	 */
	public $Identificador;
	/**
	 * @var bool
	 */
	public $Inidvidual;
	/**
	 * @var string
	 */
	public $NombreEmpresa;
	/**
	 * @var string
	 */
	public $NombreGrupo;
	/**
	 * @var int
	 */
	public $Status;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_IDGrupo
	 * @param bool $val_Consolidado
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_IDGrupo, $val_Consolidado) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:105: characters 3-162
		return SQL::SELECT()->FROM(FC_GrupoFacturacion::$table)->WHERE(Condition::SET(FC_GrupoFacturacion::$col_IDGrupo, Op::Equal(), Val::uuid($val_IDGrupo))->AND_Ex(FC_GrupoFacturacion::$col_Consolidado, Op::Equal(), Val::bool($val_Consolidado)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:96: characters 3-51
		return SQL::SELECT()->FROM(FC_GrupoFacturacion::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_GrupoFacturacion que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return bool
	 */
	public function get_Agrupada () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:153: characters 3-18
		return $this->Agrupada;
	}

	/**
	 * @return bool
	 */
	public function get_Consolidado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:132: characters 3-21
		return $this->Consolidado;
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:167: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:223: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCreacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:195: characters 3-23
		return $this->FechaCreacion;
	}

	/**
	 * @return UUID
	 */
	public function get_IDGrupo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:111: characters 3-17
		return $this->IDGrupo;
	}

	/**
	 * @return int
	 */
	public function get_Identificador () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:237: characters 3-23
		return $this->Identificador;
	}

	/**
	 * @return bool
	 */
	public function get_Inidvidual () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:139: characters 3-20
		return $this->Inidvidual;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:181: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombreGrupo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:118: characters 3-21
		return $this->NombreGrupo;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:209: characters 3-16
		return $this->Status;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Agrupada ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:159: characters 3-108
		if ($this->get_TrackChanges() && ($this->get_Agrupada() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:159: characters 72-84
			$tmp = FC_GrupoFacturacion::$col_Agrupada;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:159: characters 47-108
			$this->AddChange(new ChangeItem($tmp, $this->get_Agrupada(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:160: characters 3-24
		return $this->Agrupada = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_EmpresaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:173: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_EmpresaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:173: characters 73-86
			$tmp = FC_GrupoFacturacion::$col_EmpresaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:173: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_EmpresaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:174: characters 3-25
		return $this->EmpresaID = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:229: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:229: characters 70-80
			$tmp = FC_GrupoFacturacion::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:229: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:230: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCreacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:201: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaCreacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:201: characters 77-94
			$tmp = FC_GrupoFacturacion::$col_FechaCreacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:201: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCreacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:202: characters 3-29
		return $this->FechaCreacion = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Identificador ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:243: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_Identificador() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:243: characters 77-94
			$tmp = FC_GrupoFacturacion::$col_Identificador;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:243: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_Identificador(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:244: characters 3-29
		return $this->Identificador = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Inidvidual ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:145: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_Inidvidual() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:145: characters 74-88
			$tmp = FC_GrupoFacturacion::$col_Inidvidual;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:145: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_Inidvidual(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:146: characters 3-26
		return $this->Inidvidual = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:187: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:187: characters 77-94
			$tmp = FC_GrupoFacturacion::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:187: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:188: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreGrupo ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:124: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_NombreGrupo() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:124: characters 75-90
			$tmp = FC_GrupoFacturacion::$col_NombreGrupo;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:124: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreGrupo(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:125: characters 3-27
		return $this->NombreGrupo = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:215: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:215: characters 70-80
			$tmp = FC_GrupoFacturacion::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:215: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_GrupoFacturacion.hx:216: characters 3-22
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


		self::$table = new TableSource("FC_GrupoFacturacion");
		self::$col_IDGrupo = new UUIDSentence("FC_GrupoFacturacion", "IDGrupo", NullableEnum::NOTNULL(), true);
		self::$col_NombreGrupo = new VarcharSentence("FC_GrupoFacturacion", "NombreGrupo", 250, NullableEnum::NOTNULL(), false);
		self::$col_Consolidado = new BooleanSentence("FC_GrupoFacturacion", "Consolidado", NullableEnum::NOTNULL(), true);
		self::$col_Inidvidual = new BooleanSentence("FC_GrupoFacturacion", "Inidvidual", NullableEnum::NOTNULL(), false);
		self::$col_Agrupada = new BooleanSentence("FC_GrupoFacturacion", "Agrupada", NullableEnum::NULL(), false);
		self::$col_EmpresaID = new UUIDSentence("FC_GrupoFacturacion", "EmpresaID", NullableEnum::NOTNULL(), false);
		self::$col_NombreEmpresa = new VarcharSentence("FC_GrupoFacturacion", "NombreEmpresa", 250, NullableEnum::NOTNULL(), false);
		self::$col_FechaCreacion = new DateTimeSentence("FC_GrupoFacturacion", "FechaCreacion", NullableEnum::NOTNULL(), false);
		self::$col_Status = new IntegerSentence("FC_GrupoFacturacion", "Status", NullableEnum::NOTNULL(), false);
		self::$col_Estado = new BooleanSentence("FC_GrupoFacturacion", "Estado", NullableEnum::NOTNULL(), false);
		self::$col_Identificador = new IntegerSentence("FC_GrupoFacturacion", "Identificador", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(FC_GrupoFacturacion::class, 'nMorph.core.db.zhungo_core.FC_GrupoFacturacion');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_GrupoFacturacion', [
	'Identificador' => true,
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'Agrupada' => true,
	'Inidvidual' => true,
	'Consolidado' => true,
	'NombreGrupo' => true,
	'IDGrupo' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_GrupoFacturacion', [
	'Identificador' => true,
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'Agrupada' => true,
	'Inidvidual' => true,
	'NombreGrupo' => true
]);
FC_GrupoFacturacion::__hx__init();
