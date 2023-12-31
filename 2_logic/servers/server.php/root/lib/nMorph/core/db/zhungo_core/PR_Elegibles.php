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
class PR_Elegibles extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.PR_Elegibles\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;PR_Elegibles&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"PR_Elegibles\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_ElegibleID public=\"1\" expr=\"new UUIDSentence(&quot;PR_Elegibles&quot;, &quot;ElegibleID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_Elegibles\", \"ElegibleID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ElegibleID</haxe_doc>\x0A\x09</col_ElegibleID>\x0A\x09<col_EstructuraDatosID public=\"1\" expr=\"new UUIDSentence(&quot;PR_Elegibles&quot;, &quot;EstructuraDatosID&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_Elegibles\", \"EstructuraDatosID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EstructuraDatosID</haxe_doc>\x0A\x09</col_EstructuraDatosID>\x0A\x09<col_NombreCampo public=\"1\" expr=\"new VarcharSentence(&quot;PR_Elegibles&quot;, &quot;NombreCampo&quot;, 150, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_Elegibles\", \"NombreCampo\", 150, NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreCampo</haxe_doc>\x0A\x09</col_NombreCampo>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;PR_Elegibles&quot;, &quot;ProductoID&quot;, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_Elegibles\", \"ProductoID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;PR_Elegibles&quot;, &quot;NombreProducto&quot;, 150, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_Elegibles\", \"NombreProducto\", 150, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;PR_Elegibles&quot;, &quot;PlanID&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_Elegibles\", \"PlanID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;PR_Elegibles&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_Elegibles\", \"NombrePlan\", 150, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_ValorDesde public=\"1\" expr=\"new VarcharSentence(&quot;PR_Elegibles&quot;, &quot;ValorDesde&quot;, 250, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_Elegibles\", \"ValorDesde\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ValorDesde</haxe_doc>\x0A\x09</col_ValorDesde>\x0A\x09<col_ValorHasta public=\"1\" expr=\"new VarcharSentence(&quot;PR_Elegibles&quot;, &quot;ValorHasta&quot;, 250, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_Elegibles\", \"ValorHasta\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ValorHasta</haxe_doc>\x0A\x09</col_ValorHasta>\x0A\x09<col_EsElegible public=\"1\" expr=\"new BooleanSentence(&quot;PR_Elegibles&quot;, &quot;EsElegible&quot;, NullableEnum.NULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"PR_Elegibles\", \"EsElegible\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EsElegible</haxe_doc>\x0A\x09</col_EsElegible>\x0A\x09<col_FechaCreacion public=\"1\" expr=\"new DateTimeSentence(&quot;PR_Elegibles&quot;, &quot;FechaCreacion&quot;, NullableEnum.NULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PR_Elegibles\", \"FechaCreacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCreacion</haxe_doc>\x0A\x09</col_FechaCreacion>\x0A\x09<col_Status public=\"1\" expr=\"new SmallIntegerSentence(&quot;PR_Elegibles&quot;, &quot;Status&quot;, NullableEnum.NULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.SmallIntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new SmallIntegerSentence(\"PR_Elegibles\", \"Status\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;PR_Elegibles&quot;, &quot;Estado&quot;, NullableEnum.NULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"PR_Elegibles\", \"Estado\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"105\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"114\" static=\"1\">\x0A\x09\x09<f a=\"val_ElegibleID:val_NombreCampo\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"String\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<ElegibleID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ElegibleID>\x0A\x09<get_ElegibleID public=\"1\" set=\"method\" line=\"120\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ElegibleID>\x0A\x09<EstructuraDatosID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EstructuraDatosID>\x0A\x09<get_EstructuraDatosID public=\"1\" set=\"method\" line=\"127\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EstructuraDatosID>\x0A\x09<set_EstructuraDatosID public=\"1\" set=\"method\" line=\"131\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_EstructuraDatosID>\x0A\x09<NombreCampo get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreCampo>\x0A\x09<get_NombreCampo public=\"1\" set=\"method\" line=\"141\"><f a=\"\"><c path=\"String\"/></f></get_NombreCampo>\x0A\x09<ProductoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"148\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<set_ProductoID public=\"1\" set=\"method\" line=\"152\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ProductoID>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"162\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"166\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<PlanID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"176\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<set_PlanID public=\"1\" set=\"method\" line=\"180\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"190\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"194\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<ValorDesde get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ValorDesde>\x0A\x09<get_ValorDesde public=\"1\" set=\"method\" line=\"204\"><f a=\"\"><c path=\"String\"/></f></get_ValorDesde>\x0A\x09<set_ValorDesde public=\"1\" set=\"method\" line=\"208\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ValorDesde>\x0A\x09<ValorHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ValorHasta>\x0A\x09<get_ValorHasta public=\"1\" set=\"method\" line=\"218\"><f a=\"\"><c path=\"String\"/></f></get_ValorHasta>\x0A\x09<set_ValorHasta public=\"1\" set=\"method\" line=\"222\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ValorHasta>\x0A\x09<EsElegible get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EsElegible>\x0A\x09<get_EsElegible public=\"1\" set=\"method\" line=\"232\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_EsElegible>\x0A\x09<set_EsElegible public=\"1\" set=\"method\" line=\"236\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_EsElegible>\x0A\x09<FechaCreacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCreacion>\x0A\x09<get_FechaCreacion public=\"1\" set=\"method\" line=\"246\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCreacion>\x0A\x09<set_FechaCreacion public=\"1\" set=\"method\" line=\"250\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCreacion>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"260\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"264\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"274\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"278\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_Estado>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PR_Elegibles que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna ElegibleID
	 */
	static public $col_ElegibleID;
	/**
	 * @var BooleanSentence
	 * Referencia a columna EsElegible
	 */
	static public $col_EsElegible;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Estado
	 */
	static public $col_Estado;
	/**
	 * @var UUIDSentence
	 * Referencia a columna EstructuraDatosID
	 */
	static public $col_EstructuraDatosID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCreacion
	 */
	static public $col_FechaCreacion;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreCampo
	 */
	static public $col_NombreCampo;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombrePlan
	 */
	static public $col_NombrePlan;
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
	 * @var UUIDSentence
	 * Referencia a columna ProductoID
	 */
	static public $col_ProductoID;
	/**
	 * @var SmallIntegerSentence
	 * Referencia a columna Status
	 */
	static public $col_Status;
	/**
	 * @var VarcharSentence
	 * Referencia a columna ValorDesde
	 */
	static public $col_ValorDesde;
	/**
	 * @var VarcharSentence
	 * Referencia a columna ValorHasta
	 */
	static public $col_ValorHasta;
	/**
	 * @var ISource
	 * referencia a tabla para consultas
	 */
	static public $table;

	/**
	 * @var UUID
	 */
	public $ElegibleID;
	/**
	 * @var bool
	 */
	public $EsElegible;
	/**
	 * @var bool
	 */
	public $Estado;
	/**
	 * @var UUID
	 */
	public $EstructuraDatosID;
	/**
	 * @var \Date
	 */
	public $FechaCreacion;
	/**
	 * @var string
	 */
	public $NombreCampo;
	/**
	 * @var string
	 */
	public $NombrePlan;
	/**
	 * @var string
	 */
	public $NombreProducto;
	/**
	 * @var UUID
	 */
	public $PlanID;
	/**
	 * @var UUID
	 */
	public $ProductoID;
	/**
	 * @var int
	 */
	public $Status;
	/**
	 * @var string
	 */
	public $ValorDesde;
	/**
	 * @var string
	 */
	public $ValorHasta;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_ElegibleID
	 * @param string $val_NombreCampo
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_ElegibleID, $val_NombreCampo) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:115: characters 3-170
		return SQL::SELECT()->FROM(PR_Elegibles::$table)->WHERE(Condition::SET(PR_Elegibles::$col_ElegibleID, Op::Equal(), Val::uuid($val_ElegibleID))->AND_Ex(PR_Elegibles::$col_NombreCampo, Op::Equal(), Val::string($val_NombreCampo)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:106: characters 3-51
		return SQL::SELECT()->FROM(PR_Elegibles::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PR_Elegibles que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_ElegibleID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:121: characters 3-20
		return $this->ElegibleID;
	}

	/**
	 * @return bool
	 */
	public function get_EsElegible () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:233: characters 3-20
		return $this->EsElegible;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:275: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return UUID
	 */
	public function get_EstructuraDatosID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:128: characters 3-27
		return $this->EstructuraDatosID;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCreacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:247: characters 3-23
		return $this->FechaCreacion;
	}

	/**
	 * @return string
	 */
	public function get_NombreCampo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:142: characters 3-21
		return $this->NombreCampo;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:191: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:163: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:177: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:149: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:261: characters 3-16
		return $this->Status;
	}

	/**
	 * @return string
	 */
	public function get_ValorDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:205: characters 3-20
		return $this->ValorDesde;
	}

	/**
	 * @return string
	 */
	public function get_ValorHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:219: characters 3-20
		return $this->ValorHasta;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_EsElegible ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:239: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_EsElegible() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:239: characters 74-88
			$tmp = PR_Elegibles::$col_EsElegible;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:239: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_EsElegible(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:240: characters 3-26
		return $this->EsElegible = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:281: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:281: characters 70-80
			$tmp = PR_Elegibles::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:281: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:282: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_EstructuraDatosID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:134: characters 3-135
		if ($this->get_TrackChanges() && ($this->get_EstructuraDatosID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:134: characters 81-102
			$tmp = PR_Elegibles::$col_EstructuraDatosID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:134: characters 56-135
			$this->AddChange(new ChangeItem($tmp, $this->get_EstructuraDatosID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:135: characters 3-33
		return $this->EstructuraDatosID = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCreacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:253: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaCreacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:253: characters 77-94
			$tmp = PR_Elegibles::$col_FechaCreacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:253: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCreacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:254: characters 3-29
		return $this->FechaCreacion = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:197: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:197: characters 74-88
			$tmp = PR_Elegibles::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:197: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:198: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:169: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:169: characters 78-96
			$tmp = PR_Elegibles::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:169: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:170: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PlanID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:183: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_PlanID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:183: characters 70-80
			$tmp = PR_Elegibles::$col_PlanID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:183: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:184: characters 3-22
		return $this->PlanID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ProductoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:155: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ProductoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:155: characters 74-88
			$tmp = PR_Elegibles::$col_ProductoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:155: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ProductoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:156: characters 3-26
		return $this->ProductoID = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:267: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:267: characters 70-80
			$tmp = PR_Elegibles::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:267: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:268: characters 3-22
		return $this->Status = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ValorDesde ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:211: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ValorDesde() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:211: characters 74-88
			$tmp = PR_Elegibles::$col_ValorDesde;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:211: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ValorDesde(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:212: characters 3-26
		return $this->ValorDesde = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ValorHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:225: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ValorHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:225: characters 74-88
			$tmp = PR_Elegibles::$col_ValorHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:225: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ValorHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_Elegibles.hx:226: characters 3-26
		return $this->ValorHasta = $value;
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


		self::$table = new TableSource("PR_Elegibles");
		self::$col_ElegibleID = new UUIDSentence("PR_Elegibles", "ElegibleID", NullableEnum::NOTNULL(), true);
		self::$col_EstructuraDatosID = new UUIDSentence("PR_Elegibles", "EstructuraDatosID", NullableEnum::NULL(), false);
		self::$col_NombreCampo = new VarcharSentence("PR_Elegibles", "NombreCampo", 150, NullableEnum::NULL(), true);
		self::$col_ProductoID = new UUIDSentence("PR_Elegibles", "ProductoID", NullableEnum::NULL(), false);
		self::$col_NombreProducto = new VarcharSentence("PR_Elegibles", "NombreProducto", 150, NullableEnum::NULL(), false);
		self::$col_PlanID = new UUIDSentence("PR_Elegibles", "PlanID", NullableEnum::NULL(), false);
		self::$col_NombrePlan = new VarcharSentence("PR_Elegibles", "NombrePlan", 150, NullableEnum::NULL(), false);
		self::$col_ValorDesde = new VarcharSentence("PR_Elegibles", "ValorDesde", 250, NullableEnum::NULL(), false);
		self::$col_ValorHasta = new VarcharSentence("PR_Elegibles", "ValorHasta", 250, NullableEnum::NULL(), false);
		self::$col_EsElegible = new BooleanSentence("PR_Elegibles", "EsElegible", NullableEnum::NULL(), false);
		self::$col_FechaCreacion = new DateTimeSentence("PR_Elegibles", "FechaCreacion", NullableEnum::NULL(), false);
		self::$col_Status = new SmallIntegerSentence("PR_Elegibles", "Status", NullableEnum::NULL(), false);
		self::$col_Estado = new BooleanSentence("PR_Elegibles", "Estado", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(PR_Elegibles::class, 'nMorph.core.db.zhungo_core.PR_Elegibles');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\PR_Elegibles', [
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'EsElegible' => true,
	'ValorHasta' => true,
	'ValorDesde' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreCampo' => true,
	'EstructuraDatosID' => true,
	'ElegibleID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\PR_Elegibles', [
	'Estado' => true,
	'Status' => true,
	'FechaCreacion' => true,
	'EsElegible' => true,
	'ValorHasta' => true,
	'ValorDesde' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'EstructuraDatosID' => true
]);
PR_Elegibles::__hx__init();
