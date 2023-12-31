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
class PL_DescuentoEstructura extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.PL_DescuentoEstructura\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<table public=\"1\" expr=\"new TableSource(&quot;PL_DescuentoEstructura&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new TableSource(\"PL_DescuentoEstructura\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a tabla para consultas</haxe_doc>\x0A\x09</table>\x0A\x09<col_DescuentoEstructuraID public=\"1\" expr=\"new UUIDSentence(&quot;PL_DescuentoEstructura&quot;, &quot;DescuentoEstructuraID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_DescuentoEstructura\", \"DescuentoEstructuraID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna DescuentoEstructuraID</haxe_doc>\x0A\x09</col_DescuentoEstructuraID>\x0A\x09<col_DescuentoID public=\"1\" expr=\"new UUIDSentence(&quot;PL_DescuentoEstructura&quot;, &quot;DescuentoID&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_DescuentoEstructura\", \"DescuentoID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna DescuentoID</haxe_doc>\x0A\x09</col_DescuentoID>\x0A\x09<col_EstructuraID public=\"1\" expr=\"new UUIDSentence(&quot;PL_DescuentoEstructura&quot;, &quot;EstructuraID&quot;, NullableEnum.NOTNULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_DescuentoEstructura\", \"EstructuraID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EstructuraID</haxe_doc>\x0A\x09</col_EstructuraID>\x0A\x09<col_NombreEstructura public=\"1\" expr=\"new VarcharSentence(&quot;PL_DescuentoEstructura&quot;, &quot;NombreEstructura&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_DescuentoEstructura\", \"NombreEstructura\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEstructura</haxe_doc>\x0A\x09</col_NombreEstructura>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;PL_DescuentoEstructura&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_DescuentoEstructura\", \"PlanID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;PL_DescuentoEstructura&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_DescuentoEstructura\", \"NombrePlan\", 150, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;PL_DescuentoEstructura&quot;, &quot;ProductoID&quot;, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_DescuentoEstructura\", \"ProductoID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;PL_DescuentoEstructura&quot;, &quot;NombreProducto&quot;, 150, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_DescuentoEstructura\", \"NombreProducto\", 150, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_ValorDesde public=\"1\" expr=\"new VarcharSentence(&quot;PL_DescuentoEstructura&quot;, &quot;ValorDesde&quot;, 250, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_DescuentoEstructura\", \"ValorDesde\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ValorDesde</haxe_doc>\x0A\x09</col_ValorDesde>\x0A\x09<col_ValorHasta public=\"1\" expr=\"new VarcharSentence(&quot;PL_DescuentoEstructura&quot;, &quot;ValorHasta&quot;, 250, NullableEnum.NULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_DescuentoEstructura\", \"ValorHasta\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ValorHasta</haxe_doc>\x0A\x09</col_ValorHasta>\x0A\x09<col_EsPermitible public=\"1\" expr=\"new BooleanSentence(&quot;PL_DescuentoEstructura&quot;, &quot;EsPermitible&quot;, NullableEnum.NULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"PL_DescuentoEstructura\", \"EsPermitible\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EsPermitible</haxe_doc>\x0A\x09</col_EsPermitible>\x0A\x09<col_FechaRegistro public=\"1\" expr=\"new DateTimeSentence(&quot;PL_DescuentoEstructura&quot;, &quot;FechaRegistro&quot;, NullableEnum.NULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PL_DescuentoEstructura\", \"FechaRegistro\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaRegistro</haxe_doc>\x0A\x09</col_FechaRegistro>\x0A\x09<col_Status public=\"1\" expr=\"new SmallIntegerSentence(&quot;PL_DescuentoEstructura&quot;, &quot;Status&quot;, NullableEnum.NULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.SmallIntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new SmallIntegerSentence(\"PL_DescuentoEstructura\", \"Status\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Status</haxe_doc>\x0A\x09</col_Status>\x0A\x09<col_Estado public=\"1\" expr=\"new BooleanSentence(&quot;PL_DescuentoEstructura&quot;, &quot;Estado&quot;, NullableEnum.NULL, false)\" line=\"102\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"PL_DescuentoEstructura\", \"Estado\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Estado</haxe_doc>\x0A\x09</col_Estado>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"110\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"119\" static=\"1\">\x0A\x09\x09<f a=\"val_DescuentoEstructuraID:val_EstructuraID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<DescuentoEstructuraID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</DescuentoEstructuraID>\x0A\x09<get_DescuentoEstructuraID public=\"1\" set=\"method\" line=\"125\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_DescuentoEstructuraID>\x0A\x09<DescuentoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</DescuentoID>\x0A\x09<get_DescuentoID public=\"1\" set=\"method\" line=\"132\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_DescuentoID>\x0A\x09<set_DescuentoID public=\"1\" set=\"method\" line=\"136\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_DescuentoID>\x0A\x09<EstructuraID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EstructuraID>\x0A\x09<get_EstructuraID public=\"1\" set=\"method\" line=\"146\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EstructuraID>\x0A\x09<NombreEstructura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEstructura>\x0A\x09<get_NombreEstructura public=\"1\" set=\"method\" line=\"153\"><f a=\"\"><c path=\"String\"/></f></get_NombreEstructura>\x0A\x09<set_NombreEstructura public=\"1\" set=\"method\" line=\"157\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEstructura>\x0A\x09<PlanID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"167\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<set_PlanID public=\"1\" set=\"method\" line=\"171\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"181\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"185\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<ProductoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"195\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<set_ProductoID public=\"1\" set=\"method\" line=\"199\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ProductoID>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"209\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"213\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<ValorDesde get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ValorDesde>\x0A\x09<get_ValorDesde public=\"1\" set=\"method\" line=\"223\"><f a=\"\"><c path=\"String\"/></f></get_ValorDesde>\x0A\x09<set_ValorDesde public=\"1\" set=\"method\" line=\"227\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ValorDesde>\x0A\x09<ValorHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ValorHasta>\x0A\x09<get_ValorHasta public=\"1\" set=\"method\" line=\"237\"><f a=\"\"><c path=\"String\"/></f></get_ValorHasta>\x0A\x09<set_ValorHasta public=\"1\" set=\"method\" line=\"241\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_ValorHasta>\x0A\x09<EsPermitible get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EsPermitible>\x0A\x09<get_EsPermitible public=\"1\" set=\"method\" line=\"251\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_EsPermitible>\x0A\x09<set_EsPermitible public=\"1\" set=\"method\" line=\"255\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_EsPermitible>\x0A\x09<FechaRegistro get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaRegistro>\x0A\x09<get_FechaRegistro public=\"1\" set=\"method\" line=\"265\"><f a=\"\"><c path=\"Date\"/></f></get_FechaRegistro>\x0A\x09<set_FechaRegistro public=\"1\" set=\"method\" line=\"269\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaRegistro>\x0A\x09<Status get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Status>\x0A\x09<get_Status public=\"1\" set=\"method\" line=\"279\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Status>\x0A\x09<set_Status public=\"1\" set=\"method\" line=\"283\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Status>\x0A\x09<Estado get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Estado>\x0A\x09<get_Estado public=\"1\" set=\"method\" line=\"293\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_Estado>\x0A\x09<set_Estado public=\"1\" set=\"method\" line=\"297\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_Estado>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PL_DescuentoEstructura que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna DescuentoEstructuraID
	 */
	static public $col_DescuentoEstructuraID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna DescuentoID
	 */
	static public $col_DescuentoID;
	/**
	 * @var BooleanSentence
	 * Referencia a columna EsPermitible
	 */
	static public $col_EsPermitible;
	/**
	 * @var BooleanSentence
	 * Referencia a columna Estado
	 */
	static public $col_Estado;
	/**
	 * @var UUIDSentence
	 * Referencia a columna EstructuraID
	 */
	static public $col_EstructuraID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaRegistro
	 */
	static public $col_FechaRegistro;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreEstructura
	 */
	static public $col_NombreEstructura;
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
	public $DescuentoEstructuraID;
	/**
	 * @var UUID
	 */
	public $DescuentoID;
	/**
	 * @var bool
	 */
	public $EsPermitible;
	/**
	 * @var bool
	 */
	public $Estado;
	/**
	 * @var UUID
	 */
	public $EstructuraID;
	/**
	 * @var \Date
	 */
	public $FechaRegistro;
	/**
	 * @var string
	 */
	public $NombreEstructura;
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
	 * @param UUID $val_DescuentoEstructuraID
	 * @param UUID $val_EstructuraID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_DescuentoEstructuraID, $val_EstructuraID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:120: characters 3-192
		return SQL::SELECT()->FROM(PL_DescuentoEstructura::$table)->WHERE(Condition::SET(PL_DescuentoEstructura::$col_DescuentoEstructuraID, Op::Equal(), Val::uuid($val_DescuentoEstructuraID))->AND_Ex(PL_DescuentoEstructura::$col_EstructuraID, Op::Equal(), Val::uuid($val_EstructuraID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:111: characters 3-51
		return SQL::SELECT()->FROM(PL_DescuentoEstructura::$table)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PL_DescuentoEstructura que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_DescuentoEstructuraID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:126: characters 3-31
		return $this->DescuentoEstructuraID;
	}

	/**
	 * @return UUID
	 */
	public function get_DescuentoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:133: characters 3-21
		return $this->DescuentoID;
	}

	/**
	 * @return bool
	 */
	public function get_EsPermitible () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:252: characters 3-22
		return $this->EsPermitible;
	}

	/**
	 * @return bool
	 */
	public function get_Estado () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:294: characters 3-16
		return $this->Estado;
	}

	/**
	 * @return UUID
	 */
	public function get_EstructuraID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:147: characters 3-22
		return $this->EstructuraID;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaRegistro () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:266: characters 3-23
		return $this->FechaRegistro;
	}

	/**
	 * @return string
	 */
	public function get_NombreEstructura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:154: characters 3-26
		return $this->NombreEstructura;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:182: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:210: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:168: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:196: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @return int
	 */
	public function get_Status () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:280: characters 3-16
		return $this->Status;
	}

	/**
	 * @return string
	 */
	public function get_ValorDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:224: characters 3-20
		return $this->ValorDesde;
	}

	/**
	 * @return string
	 */
	public function get_ValorHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:238: characters 3-20
		return $this->ValorHasta;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_DescuentoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:139: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_DescuentoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:139: characters 75-90
			$tmp = PL_DescuentoEstructura::$col_DescuentoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:139: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_DescuentoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:140: characters 3-27
		return $this->DescuentoID = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_EsPermitible ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:258: characters 3-120
		if ($this->get_TrackChanges() && ($this->get_EsPermitible() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:258: characters 76-92
			$tmp = PL_DescuentoEstructura::$col_EsPermitible;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:258: characters 51-120
			$this->AddChange(new ChangeItem($tmp, $this->get_EsPermitible(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:259: characters 3-28
		return $this->EsPermitible = $value;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Estado ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:300: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Estado() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:300: characters 70-80
			$tmp = PL_DescuentoEstructura::$col_Estado;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:300: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Estado(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:301: characters 3-22
		return $this->Estado = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaRegistro ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:272: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaRegistro() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:272: characters 77-94
			$tmp = PL_DescuentoEstructura::$col_FechaRegistro;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:272: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaRegistro(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:273: characters 3-29
		return $this->FechaRegistro = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEstructura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:160: characters 3-132
		if ($this->get_TrackChanges() && ($this->get_NombreEstructura() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:160: characters 80-100
			$tmp = PL_DescuentoEstructura::$col_NombreEstructura;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:160: characters 55-132
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEstructura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:161: characters 3-32
		return $this->NombreEstructura = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:188: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:188: characters 74-88
			$tmp = PL_DescuentoEstructura::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:188: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:189: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:216: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:216: characters 78-96
			$tmp = PL_DescuentoEstructura::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:216: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:217: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PlanID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:174: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_PlanID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:174: characters 70-80
			$tmp = PL_DescuentoEstructura::$col_PlanID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:174: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:175: characters 3-22
		return $this->PlanID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ProductoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:202: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ProductoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:202: characters 74-88
			$tmp = PL_DescuentoEstructura::$col_ProductoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:202: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ProductoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:203: characters 3-26
		return $this->ProductoID = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Status ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:286: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_Status() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:286: characters 70-80
			$tmp = PL_DescuentoEstructura::$col_Status;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:286: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_Status(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:287: characters 3-22
		return $this->Status = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ValorDesde ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:230: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ValorDesde() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:230: characters 74-88
			$tmp = PL_DescuentoEstructura::$col_ValorDesde;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:230: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ValorDesde(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:231: characters 3-26
		return $this->ValorDesde = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ValorHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:244: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ValorHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:244: characters 74-88
			$tmp = PL_DescuentoEstructura::$col_ValorHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:244: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ValorHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_DescuentoEstructura.hx:245: characters 3-26
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


		self::$table = new TableSource("PL_DescuentoEstructura");
		self::$col_DescuentoEstructuraID = new UUIDSentence("PL_DescuentoEstructura", "DescuentoEstructuraID", NullableEnum::NOTNULL(), true);
		self::$col_DescuentoID = new UUIDSentence("PL_DescuentoEstructura", "DescuentoID", NullableEnum::NULL(), false);
		self::$col_EstructuraID = new UUIDSentence("PL_DescuentoEstructura", "EstructuraID", NullableEnum::NOTNULL(), true);
		self::$col_NombreEstructura = new VarcharSentence("PL_DescuentoEstructura", "NombreEstructura", 150, NullableEnum::NOTNULL(), false);
		self::$col_PlanID = new UUIDSentence("PL_DescuentoEstructura", "PlanID", NullableEnum::NOTNULL(), false);
		self::$col_NombrePlan = new VarcharSentence("PL_DescuentoEstructura", "NombrePlan", 150, NullableEnum::NULL(), false);
		self::$col_ProductoID = new UUIDSentence("PL_DescuentoEstructura", "ProductoID", NullableEnum::NULL(), false);
		self::$col_NombreProducto = new VarcharSentence("PL_DescuentoEstructura", "NombreProducto", 150, NullableEnum::NULL(), false);
		self::$col_ValorDesde = new VarcharSentence("PL_DescuentoEstructura", "ValorDesde", 250, NullableEnum::NULL(), false);
		self::$col_ValorHasta = new VarcharSentence("PL_DescuentoEstructura", "ValorHasta", 250, NullableEnum::NULL(), false);
		self::$col_EsPermitible = new BooleanSentence("PL_DescuentoEstructura", "EsPermitible", NullableEnum::NULL(), false);
		self::$col_FechaRegistro = new DateTimeSentence("PL_DescuentoEstructura", "FechaRegistro", NullableEnum::NULL(), false);
		self::$col_Status = new SmallIntegerSentence("PL_DescuentoEstructura", "Status", NullableEnum::NULL(), false);
		self::$col_Estado = new BooleanSentence("PL_DescuentoEstructura", "Estado", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(PL_DescuentoEstructura::class, 'nMorph.core.db.zhungo_core.PL_DescuentoEstructura');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\PL_DescuentoEstructura', [
	'Estado' => true,
	'Status' => true,
	'FechaRegistro' => true,
	'EsPermitible' => true,
	'ValorHasta' => true,
	'ValorDesde' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreEstructura' => true,
	'EstructuraID' => true,
	'DescuentoID' => true,
	'DescuentoEstructuraID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\PL_DescuentoEstructura', [
	'Estado' => true,
	'Status' => true,
	'FechaRegistro' => true,
	'EsPermitible' => true,
	'ValorHasta' => true,
	'ValorDesde' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreEstructura' => true,
	'DescuentoID' => true
]);
PL_DescuentoEstructura::__hx__init();
