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
use \nMorph\framework\orm\common\sources\ViewSource;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\orm\common\fields\VarcharSentence;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\fields\BooleanSentence;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class SC_MuestraFacturas_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;SC_MuestraFacturas_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"SC_MuestraFacturas_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_FacturaID public=\"1\" expr=\"new UUIDSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;FacturaID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_MuestraFacturas_VTA\", \"FacturaID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FacturaID</haxe_doc>\x0A\x09</col_FacturaID>\x0A\x09<col_SuscripcionID public=\"1\" expr=\"new UUIDSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;SuscripcionID&quot;, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_MuestraFacturas_VTA\", \"SuscripcionID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna SuscripcionID</haxe_doc>\x0A\x09</col_SuscripcionID>\x0A\x09<col_FechaCalculoFact public=\"1\" expr=\"new DateTimeSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;FechaCalculoFact&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_MuestraFacturas_VTA\", \"FechaCalculoFact\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCalculoFact</haxe_doc>\x0A\x09</col_FechaCalculoFact>\x0A\x09<col_FechaCreacion public=\"1\" expr=\"new DateTimeSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;FechaCreacion&quot;, NullableEnum.NOTNULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_MuestraFacturas_VTA\", \"FechaCreacion\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCreacion</haxe_doc>\x0A\x09</col_FechaCreacion>\x0A\x09<col_FechaEmsion public=\"1\" expr=\"new DateTimeSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;FechaEmsion&quot;, NullableEnum.NULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_MuestraFacturas_VTA\", \"FechaEmsion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaEmsion</haxe_doc>\x0A\x09</col_FechaEmsion>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;NombreProducto&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_MuestraFacturas_VTA\", \"NombreProducto\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_PlanNombre public=\"1\" expr=\"new VarcharSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;PlanNombre&quot;, 250, NullableEnum.NOTNULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_MuestraFacturas_VTA\", \"PlanNombre\", 250, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PlanNombre</haxe_doc>\x0A\x09</col_PlanNombre>\x0A\x09<col_PrecioCancelar public=\"1\" expr=\"new DecimalSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;PrecioCancelar&quot;, 9, 8, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"SC_MuestraFacturas_VTA\", \"PrecioCancelar\", 9, 8, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PrecioCancelar</haxe_doc>\x0A\x09</col_PrecioCancelar>\x0A\x09<col_Termino public=\"1\" expr=\"new VarcharSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;Termino&quot;, 250, NullableEnum.NULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_MuestraFacturas_VTA\", \"Termino\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Termino</haxe_doc>\x0A\x09</col_Termino>\x0A\x09<col_IdentificadorN public=\"1\" expr=\"new IntegerSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;IdentificadorN&quot;, NullableEnum.NULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"SC_MuestraFacturas_VTA\", \"IdentificadorN\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IdentificadorN</haxe_doc>\x0A\x09</col_IdentificadorN>\x0A\x09<col_Cobrada public=\"1\" expr=\"new BooleanSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;Cobrada&quot;, NullableEnum.NULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.BooleanSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new BooleanSentence(\"SC_MuestraFacturas_VTA\", \"Cobrada\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Cobrada</haxe_doc>\x0A\x09</col_Cobrada>\x0A\x09<col_CobranzaNombre public=\"1\" expr=\"new VarcharSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;CobranzaNombre&quot;, 150, NullableEnum.NULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"SC_MuestraFacturas_VTA\", \"CobranzaNombre\", 150, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna CobranzaNombre</haxe_doc>\x0A\x09</col_CobranzaNombre>\x0A\x09<col_CobranzaCajaNum public=\"1\" expr=\"new IntegerSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;CobranzaCajaNum&quot;, NullableEnum.NULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.IntegerSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new IntegerSentence(\"SC_MuestraFacturas_VTA\", \"CobranzaCajaNum\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna CobranzaCajaNum</haxe_doc>\x0A\x09</col_CobranzaCajaNum>\x0A\x09<col_FechaCobranza public=\"1\" expr=\"new DateTimeSentence(&quot;SC_MuestraFacturas_VTA&quot;, &quot;FechaCobranza&quot;, NullableEnum.NULL, false)\" line=\"102\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"SC_MuestraFacturas_VTA\", \"FechaCobranza\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCobranza</haxe_doc>\x0A\x09</col_FechaCobranza>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"110\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"119\" static=\"1\">\x0A\x09\x09<f a=\"val_FacturaID:val_FechaCalculoFact\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"Date\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<FacturaID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FacturaID>\x0A\x09<get_FacturaID public=\"1\" set=\"method\" line=\"125\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_FacturaID>\x0A\x09<SuscripcionID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</SuscripcionID>\x0A\x09<get_SuscripcionID public=\"1\" set=\"method\" line=\"132\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_SuscripcionID>\x0A\x09<set_SuscripcionID public=\"1\" set=\"method\" line=\"136\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_SuscripcionID>\x0A\x09<FechaCalculoFact get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCalculoFact>\x0A\x09<get_FechaCalculoFact public=\"1\" set=\"method\" line=\"146\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCalculoFact>\x0A\x09<FechaCreacion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCreacion>\x0A\x09<get_FechaCreacion public=\"1\" set=\"method\" line=\"153\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCreacion>\x0A\x09<set_FechaCreacion public=\"1\" set=\"method\" line=\"157\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCreacion>\x0A\x09<FechaEmsion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaEmsion>\x0A\x09<get_FechaEmsion public=\"1\" set=\"method\" line=\"167\"><f a=\"\"><c path=\"Date\"/></f></get_FechaEmsion>\x0A\x09<set_FechaEmsion public=\"1\" set=\"method\" line=\"171\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaEmsion>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"181\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"185\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<PlanNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PlanNombre>\x0A\x09<get_PlanNombre public=\"1\" set=\"method\" line=\"195\"><f a=\"\"><c path=\"String\"/></f></get_PlanNombre>\x0A\x09<set_PlanNombre public=\"1\" set=\"method\" line=\"199\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PlanNombre>\x0A\x09<PrecioCancelar get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PrecioCancelar>\x0A\x09<get_PrecioCancelar public=\"1\" set=\"method\" line=\"209\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_PrecioCancelar>\x0A\x09<set_PrecioCancelar public=\"1\" set=\"method\" line=\"213\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_PrecioCancelar>\x0A\x09<Termino get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Termino>\x0A\x09<get_Termino public=\"1\" set=\"method\" line=\"223\"><f a=\"\"><c path=\"String\"/></f></get_Termino>\x0A\x09<set_Termino public=\"1\" set=\"method\" line=\"227\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_Termino>\x0A\x09<IdentificadorN get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IdentificadorN>\x0A\x09<get_IdentificadorN public=\"1\" set=\"method\" line=\"237\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_IdentificadorN>\x0A\x09<set_IdentificadorN public=\"1\" set=\"method\" line=\"241\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_IdentificadorN>\x0A\x09<Cobrada get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Cobrada>\x0A\x09<get_Cobrada public=\"1\" set=\"method\" line=\"251\"><f a=\"\"><x path=\"Null\"><x path=\"Bool\"/></x></f></get_Cobrada>\x0A\x09<set_Cobrada public=\"1\" set=\"method\" line=\"255\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Bool\"/></x>\x0A</f></set_Cobrada>\x0A\x09<CobranzaNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</CobranzaNombre>\x0A\x09<get_CobranzaNombre public=\"1\" set=\"method\" line=\"265\"><f a=\"\"><c path=\"String\"/></f></get_CobranzaNombre>\x0A\x09<set_CobranzaNombre public=\"1\" set=\"method\" line=\"269\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_CobranzaNombre>\x0A\x09<CobranzaCajaNum get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</CobranzaCajaNum>\x0A\x09<get_CobranzaCajaNum public=\"1\" set=\"method\" line=\"279\"><f a=\"\"><x path=\"Null\"><x path=\"Int\"/></x></f></get_CobranzaCajaNum>\x0A\x09<set_CobranzaCajaNum public=\"1\" set=\"method\" line=\"283\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Int\"/></x>\x0A</f></set_CobranzaCajaNum>\x0A\x09<FechaCobranza get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCobranza>\x0A\x09<get_FechaCobranza public=\"1\" set=\"method\" line=\"293\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCobranza>\x0A\x09<set_FechaCobranza public=\"1\" set=\"method\" line=\"297\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCobranza>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase SC_MuestraFacturas_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var BooleanSentence
	 * Referencia a columna Cobrada
	 */
	static public $col_Cobrada;
	/**
	 * @var IntegerSentence
	 * Referencia a columna CobranzaCajaNum
	 */
	static public $col_CobranzaCajaNum;
	/**
	 * @var VarcharSentence
	 * Referencia a columna CobranzaNombre
	 */
	static public $col_CobranzaNombre;
	/**
	 * @var UUIDSentence
	 * Referencia a columna FacturaID
	 */
	static public $col_FacturaID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCalculoFact
	 */
	static public $col_FechaCalculoFact;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCobranza
	 */
	static public $col_FechaCobranza;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCreacion
	 */
	static public $col_FechaCreacion;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaEmsion
	 */
	static public $col_FechaEmsion;
	/**
	 * @var IntegerSentence
	 * Referencia a columna IdentificadorN
	 */
	static public $col_IdentificadorN;
	/**
	 * @var VarcharSentence
	 * Referencia a columna NombreProducto
	 */
	static public $col_NombreProducto;
	/**
	 * @var VarcharSentence
	 * Referencia a columna PlanNombre
	 */
	static public $col_PlanNombre;
	/**
	 * @var DecimalSentence
	 * Referencia a columna PrecioCancelar
	 */
	static public $col_PrecioCancelar;
	/**
	 * @var UUIDSentence
	 * Referencia a columna SuscripcionID
	 */
	static public $col_SuscripcionID;
	/**
	 * @var VarcharSentence
	 * Referencia a columna Termino
	 */
	static public $col_Termino;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var bool
	 */
	public $Cobrada;
	/**
	 * @var int
	 */
	public $CobranzaCajaNum;
	/**
	 * @var string
	 */
	public $CobranzaNombre;
	/**
	 * @var UUID
	 */
	public $FacturaID;
	/**
	 * @var \Date
	 */
	public $FechaCalculoFact;
	/**
	 * @var \Date
	 */
	public $FechaCobranza;
	/**
	 * @var \Date
	 */
	public $FechaCreacion;
	/**
	 * @var \Date
	 */
	public $FechaEmsion;
	/**
	 * @var int
	 */
	public $IdentificadorN;
	/**
	 * @var string
	 */
	public $NombreProducto;
	/**
	 * @var string
	 */
	public $PlanNombre;
	/**
	 * @var float
	 */
	public $PrecioCancelar;
	/**
	 * @var UUID
	 */
	public $SuscripcionID;
	/**
	 * @var string
	 */
	public $Termino;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_FacturaID
	 * @param \Date $val_FechaCalculoFact
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_FacturaID, $val_FechaCalculoFact) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:120: characters 3-175
		return SQL::SELECT()->FROM(SC_MuestraFacturas_VTA::$view)->WHERE(Condition::SET(SC_MuestraFacturas_VTA::$col_FacturaID, Op::Equal(), Val::uuid($val_FacturaID))->AND_Ex(SC_MuestraFacturas_VTA::$col_FechaCalculoFact, Op::Equal(), Val::date($val_FechaCalculoFact)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:111: characters 3-50
		return SQL::SELECT()->FROM(SC_MuestraFacturas_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase SC_MuestraFacturas_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return bool
	 */
	public function get_Cobrada () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:252: characters 3-17
		return $this->Cobrada;
	}

	/**
	 * @return int
	 */
	public function get_CobranzaCajaNum () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:280: characters 3-25
		return $this->CobranzaCajaNum;
	}

	/**
	 * @return string
	 */
	public function get_CobranzaNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:266: characters 3-24
		return $this->CobranzaNombre;
	}

	/**
	 * @return UUID
	 */
	public function get_FacturaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:126: characters 3-19
		return $this->FacturaID;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCalculoFact () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:147: characters 3-26
		return $this->FechaCalculoFact;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCobranza () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:294: characters 3-23
		return $this->FechaCobranza;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCreacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:154: characters 3-23
		return $this->FechaCreacion;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaEmsion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:168: characters 3-21
		return $this->FechaEmsion;
	}

	/**
	 * @return int
	 */
	public function get_IdentificadorN () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:238: characters 3-24
		return $this->IdentificadorN;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:182: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return string
	 */
	public function get_PlanNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:196: characters 3-20
		return $this->PlanNombre;
	}

	/**
	 * @return float
	 */
	public function get_PrecioCancelar () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:210: characters 3-24
		return $this->PrecioCancelar;
	}

	/**
	 * @return UUID
	 */
	public function get_SuscripcionID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:133: characters 3-23
		return $this->SuscripcionID;
	}

	/**
	 * @return string
	 */
	public function get_Termino () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:224: characters 3-17
		return $this->Termino;
	}

	/**
	 * @param bool $value
	 * 
	 * @return bool
	 */
	public function set_Cobrada ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:258: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_Cobrada() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:258: characters 71-82
			$tmp = SC_MuestraFacturas_VTA::$col_Cobrada;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:258: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_Cobrada(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:259: characters 3-23
		return $this->Cobrada = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_CobranzaCajaNum ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:286: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_CobranzaCajaNum() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:286: characters 79-98
			$tmp = SC_MuestraFacturas_VTA::$col_CobranzaCajaNum;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:286: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_CobranzaCajaNum(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:287: characters 3-31
		return $this->CobranzaCajaNum = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_CobranzaNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:272: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_CobranzaNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:272: characters 78-96
			$tmp = SC_MuestraFacturas_VTA::$col_CobranzaNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:272: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_CobranzaNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:273: characters 3-30
		return $this->CobranzaNombre = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCobranza ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:300: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaCobranza() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:300: characters 77-94
			$tmp = SC_MuestraFacturas_VTA::$col_FechaCobranza;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:300: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCobranza(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:301: characters 3-29
		return $this->FechaCobranza = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCreacion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:160: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_FechaCreacion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:160: characters 77-94
			$tmp = SC_MuestraFacturas_VTA::$col_FechaCreacion;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:160: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCreacion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:161: characters 3-29
		return $this->FechaCreacion = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaEmsion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:174: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_FechaEmsion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:174: characters 75-90
			$tmp = SC_MuestraFacturas_VTA::$col_FechaEmsion;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:174: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaEmsion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:175: characters 3-27
		return $this->FechaEmsion = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_IdentificadorN ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:244: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_IdentificadorN() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:244: characters 78-96
			$tmp = SC_MuestraFacturas_VTA::$col_IdentificadorN;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:244: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_IdentificadorN(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:245: characters 3-30
		return $this->IdentificadorN = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:188: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:188: characters 78-96
			$tmp = SC_MuestraFacturas_VTA::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:188: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:189: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PlanNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:202: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_PlanNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:202: characters 74-88
			$tmp = SC_MuestraFacturas_VTA::$col_PlanNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:202: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_PlanNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:203: characters 3-26
		return $this->PlanNombre = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_PrecioCancelar ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:216: characters 3-126
		if ($this->get_TrackChanges() && !Boot::equal($this->get_PrecioCancelar(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:216: characters 78-96
			$tmp = SC_MuestraFacturas_VTA::$col_PrecioCancelar;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:216: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_PrecioCancelar(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:217: characters 3-30
		return $this->PrecioCancelar = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_SuscripcionID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:139: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_SuscripcionID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:139: characters 77-94
			$tmp = SC_MuestraFacturas_VTA::$col_SuscripcionID;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:139: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_SuscripcionID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:140: characters 3-29
		return $this->SuscripcionID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Termino ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:230: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_Termino() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:230: characters 71-82
			$tmp = SC_MuestraFacturas_VTA::$col_Termino;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:230: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_Termino(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_MuestraFacturas_VTA.hx:231: characters 3-23
		return $this->Termino = $value;
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


		self::$view = new ViewSource("SC_MuestraFacturas_VTA");
		self::$col_FacturaID = new UUIDSentence("SC_MuestraFacturas_VTA", "FacturaID", NullableEnum::NOTNULL(), true);
		self::$col_SuscripcionID = new UUIDSentence("SC_MuestraFacturas_VTA", "SuscripcionID", NullableEnum::NOTNULL(), false);
		self::$col_FechaCalculoFact = new DateTimeSentence("SC_MuestraFacturas_VTA", "FechaCalculoFact", NullableEnum::NULL(), true);
		self::$col_FechaCreacion = new DateTimeSentence("SC_MuestraFacturas_VTA", "FechaCreacion", NullableEnum::NOTNULL(), false);
		self::$col_FechaEmsion = new DateTimeSentence("SC_MuestraFacturas_VTA", "FechaEmsion", NullableEnum::NULL(), false);
		self::$col_NombreProducto = new VarcharSentence("SC_MuestraFacturas_VTA", "NombreProducto", 250, NullableEnum::NOTNULL(), false);
		self::$col_PlanNombre = new VarcharSentence("SC_MuestraFacturas_VTA", "PlanNombre", 250, NullableEnum::NOTNULL(), false);
		self::$col_PrecioCancelar = new DecimalSentence("SC_MuestraFacturas_VTA", "PrecioCancelar", 9, 8, NullableEnum::NULL(), false);
		self::$col_Termino = new VarcharSentence("SC_MuestraFacturas_VTA", "Termino", 250, NullableEnum::NULL(), false);
		self::$col_IdentificadorN = new IntegerSentence("SC_MuestraFacturas_VTA", "IdentificadorN", NullableEnum::NULL(), false);
		self::$col_Cobrada = new BooleanSentence("SC_MuestraFacturas_VTA", "Cobrada", NullableEnum::NULL(), false);
		self::$col_CobranzaNombre = new VarcharSentence("SC_MuestraFacturas_VTA", "CobranzaNombre", 150, NullableEnum::NULL(), false);
		self::$col_CobranzaCajaNum = new IntegerSentence("SC_MuestraFacturas_VTA", "CobranzaCajaNum", NullableEnum::NULL(), false);
		self::$col_FechaCobranza = new DateTimeSentence("SC_MuestraFacturas_VTA", "FechaCobranza", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(SC_MuestraFacturas_VTA::class, 'nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\SC_MuestraFacturas_VTA', [
	'FechaCobranza' => true,
	'CobranzaCajaNum' => true,
	'CobranzaNombre' => true,
	'Cobrada' => true,
	'IdentificadorN' => true,
	'Termino' => true,
	'PrecioCancelar' => true,
	'PlanNombre' => true,
	'NombreProducto' => true,
	'FechaEmsion' => true,
	'FechaCreacion' => true,
	'FechaCalculoFact' => true,
	'SuscripcionID' => true,
	'FacturaID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\SC_MuestraFacturas_VTA', [
	'FechaCobranza' => true,
	'CobranzaCajaNum' => true,
	'CobranzaNombre' => true,
	'Cobrada' => true,
	'IdentificadorN' => true,
	'Termino' => true,
	'PrecioCancelar' => true,
	'PlanNombre' => true,
	'NombreProducto' => true,
	'FechaEmsion' => true,
	'FechaCreacion' => true,
	'SuscripcionID' => true
]);
SC_MuestraFacturas_VTA::__hx__init();