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
class PL_LapsoReactivacionA_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.PL_LapsoReactivacionA_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;PL_LapsoReactivacionA_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"PL_LapsoReactivacionA_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_id public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;id&quot;, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"id\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna id</haxe_doc>\x0A\x09</col_id>\x0A\x09<col_LapsoID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;LapsoID&quot;, NullableEnum.NULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"LapsoID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna LapsoID</haxe_doc>\x0A\x09</col_LapsoID>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;EmpresaID&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"EmpresaID\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_LapsoReactivacionA_VTA\", \"NombreEmpresa\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;ProductoID&quot;, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"ProductoID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;NombreProducto&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_LapsoReactivacionA_VTA\", \"NombreProducto\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"PlanID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_LapsoReactivacionA_VTA\", \"NombrePlan\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_PersonaID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;PersonaID&quot;, NullableEnum.NOTNULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"PersonaID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonaID</haxe_doc>\x0A\x09</col_PersonaID>\x0A\x09<col_PersonaNombre public=\"1\" expr=\"new VarcharSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;PersonaNombre&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PL_LapsoReactivacionA_VTA\", \"PersonaNombre\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonaNombre</haxe_doc>\x0A\x09</col_PersonaNombre>\x0A\x09<col_FechaLapsoDesde public=\"1\" expr=\"new DateTimeSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;FechaLapsoDesde&quot;, NullableEnum.NULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PL_LapsoReactivacionA_VTA\", \"FechaLapsoDesde\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaLapsoDesde</haxe_doc>\x0A\x09</col_FechaLapsoDesde>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PL_LapsoReactivacionA_VTA\", \"SuscripcionID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_FechaLapsoHasta public=\"1\" expr=\"new DateTimeSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;FechaLapsoHasta&quot;, NullableEnum.NULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PL_LapsoReactivacionA_VTA\", \"FechaLapsoHasta\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaLapsoHasta</haxe_doc>\x0A\x09</col_FechaLapsoHasta>\x0A\x09<col_Couta public=\"1\" expr=\"new IntegerSentence(&quot;PL_LapsoReactivacionA_VTA&quot;, &quot;Couta&quot;, NullableEnum.NULL, false)\" line=\"102\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"PL_LapsoReactivacionA_VTA\", \"Couta\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Couta</haxe_doc>\x0A\x09</col_Couta>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"110\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"119\" static=\"1\">\x0A\x09\x09<f a=\"val_id:val_EmpresaID\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<id get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</id>\x0A\x09<get_id public=\"1\" set=\"method\" line=\"125\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_id>\x0A\x09<LapsoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</LapsoID>\x0A\x09<get_LapsoID public=\"1\" set=\"method\" line=\"132\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_LapsoID>\x0A\x09<set_LapsoID public=\"1\" set=\"method\" line=\"136\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_LapsoID>\x0A\x09<EmpresaID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"146\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"153\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"157\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<ProductoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"167\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<set_ProductoID public=\"1\" set=\"method\" line=\"171\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ProductoID>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"181\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"185\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<PlanID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"195\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<set_PlanID public=\"1\" set=\"method\" line=\"199\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"209\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"213\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<PersonaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonaID>\x0A\x09<get_PersonaID public=\"1\" set=\"method\" line=\"223\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PersonaID>\x0A\x09<set_PersonaID public=\"1\" set=\"method\" line=\"227\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PersonaID>\x0A\x09<PersonaNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonaNombre>\x0A\x09<get_PersonaNombre public=\"1\" set=\"method\" line=\"237\"><f a=\"\"><c path=\"String\"/></f></get_PersonaNombre>\x0A\x09<set_PersonaNombre public=\"1\" set=\"method\" line=\"241\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PersonaNombre>\x0A\x09<FechaLapsoDesde get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaLapsoDesde>\x0A\x09<get_FechaLapsoDesde public=\"1\" set=\"method\" line=\"251\"><f a=\"\"><c path=\"Date\"/></f></get_FechaLapsoDesde>\x0A\x09<set_FechaLapsoDesde public=\"1\" set=\"method\" line=\"255\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaLapsoDesde>\x0A\x09<SuscripcionID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"265\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<set_SuscripcionID public=\"1\" set=\"method\" line=\"269\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_SuscripcionID>\x0A\x09<FechaLapsoHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaLapsoHasta>\x0A\x09<get_FechaLapsoHasta public=\"1\" set=\"method\" line=\"279\"><f a=\"\"><c path=\"Date\"/></f></get_FechaLapsoHasta>\x0A\x09<set_FechaLapsoHasta public=\"1\" set=\"method\" line=\"283\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaLapsoHasta>\x0A\x09<Couta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Couta>\x0A\x09<get_Couta public=\"1\" set=\"method\" line=\"293\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_Couta>\x0A\x09<set_Couta public=\"1\" set=\"method\" line=\"297\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_Couta>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PL_LapsoReactivacionA_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var IntegerSentence
	 * Referencia a columna Couta
	 */
	static public $col_Couta;
	/**
	 * @var UUIDSentence
	 * Referencia a columna EmpresaID
	 */
	static public $col_EmpresaID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaLapsoDesde
	 */
	static public $col_FechaLapsoDesde;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaLapsoHasta
	 */
	static public $col_FechaLapsoHasta;
	/**
	 * @var UUIDSentence
	 * Referencia a columna LapsoID
	 */
	static public $col_LapsoID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreEmpresa
	 */
	static public $col_NombreEmpresa;
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
	 * Referencia a columna PersonaID
	 */
	static public $col_PersonaID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna PersonaNombre
	 */
	static public $col_PersonaNombre;
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
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna id
	 */
	static public $col_id;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var int
	 */
	public $Couta;
	/**
	 * @var UUID
	 */
	public $EmpresaID;
	/**
	 * @var \Date
	 */
	public $FechaLapsoDesde;
	/**
	 * @var \Date
	 */
	public $FechaLapsoHasta;
	/**
	 * @var UUID
	 */
	public $LapsoID;
	/**
	 * @var string
	 */
	public $NombreEmpresa;
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
	public $PersonaID;
	/**
	 * @var string
	 */
	public $PersonaNombre;
	/**
	 * @var UUID
	 */
	public $PlanID;
	/**
	 * @var UUID
	 */
	public $ProductoID;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;
	/**
	 * @var UUID
	 */
	public $id;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_id
	 * @param UUID $val_EmpresaID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_id, $val_EmpresaID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:120: characters 3-147
		return SQL::SELECT()->FROM(PL_LapsoReactivacionA_VTA::$view)->WHERE(Condition::SET(PL_LapsoReactivacionA_VTA::$col_id, Op::Equal(), Val::uuid($val_id))->AND_Ex(PL_LapsoReactivacionA_VTA::$col_EmpresaID, Op::Equal(), Val::uuid($val_EmpresaID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:111: characters 3-50
		return SQL::SELECT()->FROM(PL_LapsoReactivacionA_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PL_LapsoReactivacionA_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return int
	 */
	public function get_Couta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:294: characters 3-15
		return $this->Couta;
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:147: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaLapsoDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:252: characters 3-25
		return $this->FechaLapsoDesde;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaLapsoHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:280: characters 3-25
		return $this->FechaLapsoHasta;
	}

	/**
	 * @return UUID
	 */
	public function get_LapsoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:133: characters 3-17
		return $this->LapsoID;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:154: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:210: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:182: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return UUID
	 */
	public function get_PersonaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:224: characters 3-19
		return $this->PersonaID;
	}

	/**
	 * @return string
	 */
	public function get_PersonaNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:238: characters 3-23
		return $this->PersonaNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:196: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:168: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:266: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @return UUID
	 */
	public function get_id () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:126: characters 3-12
		return $this->id;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Couta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:300: characters 3-99
		if ($this->get_TrackChanges() && ($this->get_Couta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:300: characters 69-78
			$tmp = PL_LapsoReactivacionA_VTA::$col_Couta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:300: characters 44-99
			$this->AddChange(new ChangeItem($tmp, $this->get_Couta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:301: characters 3-21
		return $this->Couta = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaLapsoDesde ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:258: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_FechaLapsoDesde() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:258: characters 79-98
			$tmp = PL_LapsoReactivacionA_VTA::$col_FechaLapsoDesde;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:258: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaLapsoDesde(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:259: characters 3-31
		return $this->FechaLapsoDesde = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaLapsoHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:286: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_FechaLapsoHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:286: characters 79-98
			$tmp = PL_LapsoReactivacionA_VTA::$col_FechaLapsoHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:286: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaLapsoHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:287: characters 3-31
		return $this->FechaLapsoHasta = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_LapsoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:139: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_LapsoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:139: characters 71-82
			$tmp = PL_LapsoReactivacionA_VTA::$col_LapsoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:139: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_LapsoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:140: characters 3-23
		return $this->LapsoID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:160: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:160: characters 77-94
			$tmp = PL_LapsoReactivacionA_VTA::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:160: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:161: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:216: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:216: characters 74-88
			$tmp = PL_LapsoReactivacionA_VTA::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:216: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:217: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:188: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:188: characters 78-96
			$tmp = PL_LapsoReactivacionA_VTA::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:188: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:189: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PersonaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:230: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_PersonaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:230: characters 73-86
			$tmp = PL_LapsoReactivacionA_VTA::$col_PersonaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:230: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_PersonaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:231: characters 3-25
		return $this->PersonaID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PersonaNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:244: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_PersonaNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:244: characters 77-94
			$tmp = PL_LapsoReactivacionA_VTA::$col_PersonaNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:244: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_PersonaNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:245: characters 3-29
		return $this->PersonaNombre = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PlanID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:202: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_PlanID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:202: characters 70-80
			$tmp = PL_LapsoReactivacionA_VTA::$col_PlanID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:202: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:203: characters 3-22
		return $this->PlanID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ProductoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:174: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ProductoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:174: characters 74-88
			$tmp = PL_LapsoReactivacionA_VTA::$col_ProductoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:174: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ProductoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:175: characters 3-26
		return $this->ProductoID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_SuscripcionID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:272: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_SuscripcionID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:272: characters 77-94
			$tmp = PL_LapsoReactivacionA_VTA::$col_SuscripcionID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:272: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SuscripcionID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PL_LapsoReactivacionA_VTA.hx:273: characters 3-29
		return $this->SuscripcionID = $value;
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


		self::$view = new ViewSource("PL_LapsoReactivacionA_VTA");
		self::$col_id = new UUIDSentence("PL_LapsoReactivacionA_VTA", "id", NullableEnum::NULL(), true);
		self::$col_LapsoID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "LapsoID", NullableEnum::NULL(), false);
		self::$col_EmpresaID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "EmpresaID", NullableEnum::NULL(), true);
		self::$col_NombreEmpresa = new VarcharSentence("PL_LapsoReactivacionA_VTA", "NombreEmpresa", 250, NullableEnum::NULL(), false);
		self::$col_ProductoID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "ProductoID", NullableEnum::NOTNULL(), false);
		self::$col_NombreProducto = new VarcharSentence("PL_LapsoReactivacionA_VTA", "NombreProducto", 150, NullableEnum::NOTNULL(), false);
		self::$col_PlanID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "PlanID", NullableEnum::NOTNULL(), false);
		self::$col_NombrePlan = new VarcharSentence("PL_LapsoReactivacionA_VTA", "NombrePlan", 150, NullableEnum::NOTNULL(), false);
		self::$col_PersonaID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "PersonaID", NullableEnum::NOTNULL(), false);
		self::$col_PersonaNombre = new VarcharSentence("PL_LapsoReactivacionA_VTA", "PersonaNombre", 150, NullableEnum::NOTNULL(), false);
		self::$col_FechaLapsoDesde = new DateTimeSentence("PL_LapsoReactivacionA_VTA", "FechaLapsoDesde", NullableEnum::NULL(), false);
		self::$col_SuscripcionID = new UUIDSentence("PL_LapsoReactivacionA_VTA", "SuscripcionID", NullableEnum::NOTNULL(), false);
		self::$col_FechaLapsoHasta = new DateTimeSentence("PL_LapsoReactivacionA_VTA", "FechaLapsoHasta", NullableEnum::NULL(), false);
		self::$col_Couta = new IntegerSentence("PL_LapsoReactivacionA_VTA", "Couta", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(PL_LapsoReactivacionA_VTA::class, 'nMorph.core.db.zhungo_core.PL_LapsoReactivacionA_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\PL_LapsoReactivacionA_VTA', [
	'Couta' => true,
	'FechaLapsoHasta' => true,
	'SuscripcionID' => true,
	'FechaLapsoDesde' => true,
	'PersonaNombre' => true,
	'PersonaID' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'LapsoID' => true,
	'id' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\PL_LapsoReactivacionA_VTA', [
	'Couta' => true,
	'FechaLapsoHasta' => true,
	'SuscripcionID' => true,
	'FechaLapsoDesde' => true,
	'PersonaNombre' => true,
	'PersonaID' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreEmpresa' => true,
	'LapsoID' => true
]);
PL_LapsoReactivacionA_VTA::__hx__init();
