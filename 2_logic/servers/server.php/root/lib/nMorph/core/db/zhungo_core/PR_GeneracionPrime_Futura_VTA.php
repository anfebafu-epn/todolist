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
class PR_GeneracionPrime_Futura_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.PR_GeneracionPrime_Futura_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;PR_GeneracionPrime_Futura_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"PR_GeneracionPrime_Futura_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_id public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;id&quot;, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"id\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna id</haxe_doc>\x0A\x09</col_id>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"SuscripcionID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_IdentificadorArchivo public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;IdentificadorArchivo&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"IdentificadorArchivo\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IdentificadorArchivo</haxe_doc>\x0A\x09</col_IdentificadorArchivo>\x0A\x09<col_PersonaID public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;PersonaID&quot;, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"PersonaID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonaID</haxe_doc>\x0A\x09</col_PersonaID>\x0A\x09<col_PersonaNombre public=\"1\" expr=\"new VarcharSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;PersonaNombre&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_GeneracionPrime_Futura_VTA\", \"PersonaNombre\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonaNombre</haxe_doc>\x0A\x09</col_PersonaNombre>\x0A\x09<col_fechaDesde public=\"1\" expr=\"new DateTimeSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;fechaDesde&quot;, NullableEnum.NULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PR_GeneracionPrime_Futura_VTA\", \"fechaDesde\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaDesde</haxe_doc>\x0A\x09</col_fechaDesde>\x0A\x09<col_fechaHasta public=\"1\" expr=\"new DateTimeSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;fechaHasta&quot;, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PR_GeneracionPrime_Futura_VTA\", \"fechaHasta\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna fechaHasta</haxe_doc>\x0A\x09</col_fechaHasta>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;EmpresaID&quot;, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"EmpresaID\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_GeneracionPrime_Futura_VTA\", \"NombreEmpresa\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;ProductoID&quot;, NullableEnum.NOTNULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"ProductoID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;NombreProducto&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_GeneracionPrime_Futura_VTA\", \"NombreProducto\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_SiguienteRenovacion public=\"1\" expr=\"new DateTimeSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;SiguienteRenovacion&quot;, NullableEnum.NULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"PR_GeneracionPrime_Futura_VTA\", \"SiguienteRenovacion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SiguienteRenovacion</haxe_doc>\x0A\x09</col_SiguienteRenovacion>\x0A\x09<col_PlanID public=\"1\" expr=\"new UUIDSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;PlanID&quot;, NullableEnum.NOTNULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"PR_GeneracionPrime_Futura_VTA\", \"PlanID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanID</haxe_doc>\x0A\x09</col_PlanID>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"102\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"PR_GeneracionPrime_Futura_VTA\", \"NombrePlan\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_Couta public=\"1\" expr=\"new IntegerSentence(&quot;PR_GeneracionPrime_Futura_VTA&quot;, &quot;Couta&quot;, NullableEnum.NOTNULL, false)\" line=\"107\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"PR_GeneracionPrime_Futura_VTA\", \"Couta\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Couta</haxe_doc>\x0A\x09</col_Couta>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"115\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"124\" static=\"1\">\x0A\x09\x09<f a=\"val_id:val_IdentificadorArchivo\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<id get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</id>\x0A\x09<get_id public=\"1\" set=\"method\" line=\"130\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_id>\x0A\x09<SuscripcionID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"137\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<set_SuscripcionID public=\"1\" set=\"method\" line=\"141\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_SuscripcionID>\x0A\x09<IdentificadorArchivo get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IdentificadorArchivo>\x0A\x09<get_IdentificadorArchivo public=\"1\" set=\"method\" line=\"151\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IdentificadorArchivo>\x0A\x09<PersonaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonaID>\x0A\x09<get_PersonaID public=\"1\" set=\"method\" line=\"158\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PersonaID>\x0A\x09<set_PersonaID public=\"1\" set=\"method\" line=\"162\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PersonaID>\x0A\x09<PersonaNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonaNombre>\x0A\x09<get_PersonaNombre public=\"1\" set=\"method\" line=\"172\"><f a=\"\"><c path=\"String\"/></f></get_PersonaNombre>\x0A\x09<set_PersonaNombre public=\"1\" set=\"method\" line=\"176\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PersonaNombre>\x0A\x09<fechaDesde get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaDesde>\x0A\x09<get_fechaDesde public=\"1\" set=\"method\" line=\"186\"><f a=\"\"><c path=\"Date\"/></f></get_fechaDesde>\x0A\x09<set_fechaDesde public=\"1\" set=\"method\" line=\"190\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_fechaDesde>\x0A\x09<fechaHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</fechaHasta>\x0A\x09<get_fechaHasta public=\"1\" set=\"method\" line=\"200\"><f a=\"\"><c path=\"Date\"/></f></get_fechaHasta>\x0A\x09<set_fechaHasta public=\"1\" set=\"method\" line=\"204\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_fechaHasta>\x0A\x09<EmpresaID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"214\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<set_EmpresaID public=\"1\" set=\"method\" line=\"218\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"228\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"232\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<ProductoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"242\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<set_ProductoID public=\"1\" set=\"method\" line=\"246\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ProductoID>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"256\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"260\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<SiguienteRenovacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SiguienteRenovacion>\x0A\x09<get_SiguienteRenovacion public=\"1\" set=\"method\" line=\"270\"><f a=\"\"><c path=\"Date\"/></f></get_SiguienteRenovacion>\x0A\x09<set_SiguienteRenovacion public=\"1\" set=\"method\" line=\"274\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_SiguienteRenovacion>\x0A\x09<PlanID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanID>\x0A\x09<get_PlanID public=\"1\" set=\"method\" line=\"284\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_PlanID>\x0A\x09<set_PlanID public=\"1\" set=\"method\" line=\"288\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_PlanID>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"298\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"302\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<Couta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Couta>\x0A\x09<get_Couta public=\"1\" set=\"method\" line=\"312\"><f a=\"\"><x path=\"Int\"/></f></get_Couta>\x0A\x09<set_Couta public=\"1\" set=\"method\" line=\"316\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_Couta>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase PR_GeneracionPrime_Futura_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
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
	 * @var UUIDSentence
	 * Referencia a columna IdentificadorArchivo
	 */
	static public $col_IdentificadorArchivo;
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
	 * @var DateTimeSentence
	 * Referencia a columna SiguienteRenovacion
	 */
	static public $col_SiguienteRenovacion;
	/**
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaDesde
	 */
	static public $col_fechaDesde;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna fechaHasta
	 */
	static public $col_fechaHasta;
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
	 * @var UUID
	 */
	public $IdentificadorArchivo;
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
	 * @var \Date
	 */
	public $SiguienteRenovacion;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;
	/**
	 * @var \Date
	 */
	public $fechaDesde;
	/**
	 * @var \Date
	 */
	public $fechaHasta;
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
	 * @param UUID $val_IdentificadorArchivo
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_id, $val_IdentificadorArchivo) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:125: characters 3-169
		return SQL::SELECT()->FROM(PR_GeneracionPrime_Futura_VTA::$view)->WHERE(Condition::SET(PR_GeneracionPrime_Futura_VTA::$col_id, Op::Equal(), Val::uuid($val_id))->AND_Ex(PR_GeneracionPrime_Futura_VTA::$col_IdentificadorArchivo, Op::Equal(), Val::uuid($val_IdentificadorArchivo)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:116: characters 3-50
		return SQL::SELECT()->FROM(PR_GeneracionPrime_Futura_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase PR_GeneracionPrime_Futura_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return int
	 */
	public function get_Couta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:313: characters 3-15
		return $this->Couta;
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:215: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return UUID
	 */
	public function get_IdentificadorArchivo () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:152: characters 3-30
		return $this->IdentificadorArchivo;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:229: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:299: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:257: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return UUID
	 */
	public function get_PersonaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:159: characters 3-19
		return $this->PersonaID;
	}

	/**
	 * @return string
	 */
	public function get_PersonaNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:173: characters 3-23
		return $this->PersonaNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_PlanID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:285: characters 3-16
		return $this->PlanID;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:243: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @return \Date
	 */
	public function get_SiguienteRenovacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:271: characters 3-29
		return $this->SiguienteRenovacion;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:138: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:187: characters 3-20
		return $this->fechaDesde;
	}

	/**
	 * @return \Date
	 */
	public function get_fechaHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:201: characters 3-20
		return $this->fechaHasta;
	}

	/**
	 * @return UUID
	 */
	public function get_id () {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:131: characters 3-12
		return $this->id;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_Couta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:319: characters 3-99
		if ($this->get_TrackChanges() && ($this->get_Couta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:319: characters 69-78
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_Couta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:319: characters 44-99
			$this->AddChange(new ChangeItem($tmp, $this->get_Couta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:320: characters 3-21
		return $this->Couta = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_EmpresaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:221: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_EmpresaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:221: characters 73-86
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_EmpresaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:221: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_EmpresaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:222: characters 3-25
		return $this->EmpresaID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:235: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:235: characters 77-94
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:235: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:236: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:305: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:305: characters 74-88
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:305: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:306: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:263: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:263: characters 78-96
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:263: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:264: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PersonaID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:165: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_PersonaID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:165: characters 73-86
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_PersonaID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:165: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_PersonaID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:166: characters 3-25
		return $this->PersonaID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PersonaNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:179: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_PersonaNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:179: characters 77-94
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_PersonaNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:179: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_PersonaNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:180: characters 3-29
		return $this->PersonaNombre = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_PlanID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:291: characters 3-102
		if ($this->get_TrackChanges() && ($this->get_PlanID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:291: characters 70-80
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_PlanID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:291: characters 45-102
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:292: characters 3-22
		return $this->PlanID = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ProductoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:249: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ProductoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:249: characters 74-88
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_ProductoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:249: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ProductoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:250: characters 3-26
		return $this->ProductoID = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_SiguienteRenovacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:277: characters 3-141
		if ($this->get_TrackChanges() && ($this->get_SiguienteRenovacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:277: characters 83-106
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_SiguienteRenovacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:277: characters 58-141
			$this->AddChange(new ChangeItem($tmp, $this->get_SiguienteRenovacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:278: characters 3-35
		return $this->SiguienteRenovacion = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_SuscripcionID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:144: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_SuscripcionID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:144: characters 77-94
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_SuscripcionID;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:144: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SuscripcionID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:145: characters 3-29
		return $this->SuscripcionID = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_fechaDesde ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:193: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_fechaDesde() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:193: characters 74-88
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_fechaDesde;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:193: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_fechaDesde(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:194: characters 3-26
		return $this->fechaDesde = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_fechaHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:207: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_fechaHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:207: characters 74-88
			$tmp = PR_GeneracionPrime_Futura_VTA::$col_fechaHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:207: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_fechaHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/PR_GeneracionPrime_Futura_VTA.hx:208: characters 3-26
		return $this->fechaHasta = $value;
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


		self::$view = new ViewSource("PR_GeneracionPrime_Futura_VTA");
		self::$col_id = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "id", NullableEnum::NULL(), true);
		self::$col_SuscripcionID = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "SuscripcionID", NullableEnum::NOTNULL(), false);
		self::$col_IdentificadorArchivo = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "IdentificadorArchivo", NullableEnum::NULL(), true);
		self::$col_PersonaID = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "PersonaID", NullableEnum::NOTNULL(), false);
		self::$col_PersonaNombre = new VarcharSentence("PR_GeneracionPrime_Futura_VTA", "PersonaNombre", 150, NullableEnum::NOTNULL(), false);
		self::$col_fechaDesde = new DateTimeSentence("PR_GeneracionPrime_Futura_VTA", "fechaDesde", NullableEnum::NULL(), false);
		self::$col_fechaHasta = new DateTimeSentence("PR_GeneracionPrime_Futura_VTA", "fechaHasta", NullableEnum::NULL(), false);
		self::$col_EmpresaID = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "EmpresaID", NullableEnum::NULL(), false);
		self::$col_NombreEmpresa = new VarcharSentence("PR_GeneracionPrime_Futura_VTA", "NombreEmpresa", 250, NullableEnum::NULL(), false);
		self::$col_ProductoID = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "ProductoID", NullableEnum::NOTNULL(), false);
		self::$col_NombreProducto = new VarcharSentence("PR_GeneracionPrime_Futura_VTA", "NombreProducto", 150, NullableEnum::NOTNULL(), false);
		self::$col_SiguienteRenovacion = new DateTimeSentence("PR_GeneracionPrime_Futura_VTA", "SiguienteRenovacion", NullableEnum::NULL(), false);
		self::$col_PlanID = new UUIDSentence("PR_GeneracionPrime_Futura_VTA", "PlanID", NullableEnum::NOTNULL(), false);
		self::$col_NombrePlan = new VarcharSentence("PR_GeneracionPrime_Futura_VTA", "NombrePlan", 150, NullableEnum::NOTNULL(), false);
		self::$col_Couta = new IntegerSentence("PR_GeneracionPrime_Futura_VTA", "Couta", NullableEnum::NOTNULL(), false);
	}
}

Boot::registerClass(PR_GeneracionPrime_Futura_VTA::class, 'nMorph.core.db.zhungo_core.PR_GeneracionPrime_Futura_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\PR_GeneracionPrime_Futura_VTA', [
	'Couta' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'SiguienteRenovacion' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'fechaHasta' => true,
	'fechaDesde' => true,
	'PersonaNombre' => true,
	'PersonaID' => true,
	'IdentificadorArchivo' => true,
	'SuscripcionID' => true,
	'id' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\PR_GeneracionPrime_Futura_VTA', [
	'Couta' => true,
	'NombrePlan' => true,
	'PlanID' => true,
	'SiguienteRenovacion' => true,
	'NombreProducto' => true,
	'ProductoID' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'fechaHasta' => true,
	'fechaDesde' => true,
	'PersonaNombre' => true,
	'PersonaID' => true,
	'SuscripcionID' => true
]);
PR_GeneracionPrime_Futura_VTA::__hx__init();
