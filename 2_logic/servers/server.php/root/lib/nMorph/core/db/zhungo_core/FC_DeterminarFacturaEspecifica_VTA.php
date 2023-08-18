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
class FC_DeterminarFacturaEspecifica_VTA extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.FC_DeterminarFacturaEspecifica_VTA\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"FC_DeterminarFacturaEspecifica_VTA\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_IdentificadorPersona public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;IdentificadorPersona&quot;, 120, NullableEnum.NULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"IdentificadorPersona\", 120, NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IdentificadorPersona</haxe_doc>\x0A\x09</col_IdentificadorPersona>\x0A\x09<col_PersonaNombre public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;PersonaNombre&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"PersonaNombre\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PersonaNombre</haxe_doc>\x0A\x09</col_PersonaNombre>\x0A\x09<col_EmpresaID public=\"1\" expr=\"new UUIDSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;EmpresaID&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"EmpresaID\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna EmpresaID</haxe_doc>\x0A\x09</col_EmpresaID>\x0A\x09<col_NombreEmpresa public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;NombreEmpresa&quot;, 250, NullableEnum.NULL, false)\" line=\"52\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"NombreEmpresa\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreEmpresa</haxe_doc>\x0A\x09</col_NombreEmpresa>\x0A\x09<col_NombreProducto public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;NombreProducto&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"57\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"NombreProducto\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombreProducto</haxe_doc>\x0A\x09</col_NombreProducto>\x0A\x09<col_NombrePlan public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;NombrePlan&quot;, 150, NullableEnum.NOTNULL, false)\" line=\"62\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"NombrePlan\", 150, NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna NombrePlan</haxe_doc>\x0A\x09</col_NombrePlan>\x0A\x09<col_TipoLapso public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;TipoLapso&quot;, 250, NullableEnum.NULL, false)\" line=\"67\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"TipoLapso\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna TipoLapso</haxe_doc>\x0A\x09</col_TipoLapso>\x0A\x09<col_Termino public=\"1\" expr=\"new VarcharSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;Termino&quot;, 250, NullableEnum.NULL, false)\" line=\"72\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.VarcharSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new VarcharSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"Termino\", 250, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna Termino</haxe_doc>\x0A\x09</col_Termino>\x0A\x09<col_FechaLapsoDesde public=\"1\" expr=\"new DateTimeSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;FechaLapsoDesde&quot;, NullableEnum.NOTNULL, false)\" line=\"77\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"FechaLapsoDesde\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaLapsoDesde</haxe_doc>\x0A\x09</col_FechaLapsoDesde>\x0A\x09<col_FechaLapsoHasta public=\"1\" expr=\"new DateTimeSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;FechaLapsoHasta&quot;, NullableEnum.NULL, false)\" line=\"82\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"FechaLapsoHasta\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaLapsoHasta</haxe_doc>\x0A\x09</col_FechaLapsoHasta>\x0A\x09<col_FechaCalculoFact public=\"1\" expr=\"new DateTimeSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;FechaCalculoFact&quot;, NullableEnum.NULL, false)\" line=\"87\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"FechaCalculoFact\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaCalculoFact</haxe_doc>\x0A\x09</col_FechaCalculoFact>\x0A\x09<col_FechaEmsion public=\"1\" expr=\"new DateTimeSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;FechaEmsion&quot;, NullableEnum.NULL, false)\" line=\"92\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DateTimeSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DateTimeSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"FechaEmsion\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna FechaEmsion</haxe_doc>\x0A\x09</col_FechaEmsion>\x0A\x09<col_PrecioCancelar public=\"1\" expr=\"new DecimalSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;PrecioCancelar&quot;, 9, 8, NullableEnum.NULL, false)\" line=\"97\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.DecimalSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new DecimalSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"PrecioCancelar\", 9, 8, NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna PrecioCancelar</haxe_doc>\x0A\x09</col_PrecioCancelar>\x0A\x09<col_IDFactura public=\"1\" expr=\"new UUIDSentence(&quot;FC_DeterminarFacturaEspecifica_VTA&quot;, &quot;IDFactura&quot;, NullableEnum.NULL, false)\" line=\"102\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"FC_DeterminarFacturaEspecifica_VTA\", \"IDFactura\", NullableEnum.NULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IDFactura</haxe_doc>\x0A\x09</col_IDFactura>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"110\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"119\" static=\"1\">\x0A\x09\x09<f a=\"val_IdentificadorPersona:val_EmpresaID\">\x0A\x09\x09\x09<c path=\"String\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<IdentificadorPersona get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IdentificadorPersona>\x0A\x09<get_IdentificadorPersona public=\"1\" set=\"method\" line=\"125\"><f a=\"\"><c path=\"String\"/></f></get_IdentificadorPersona>\x0A\x09<PersonaNombre get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PersonaNombre>\x0A\x09<get_PersonaNombre public=\"1\" set=\"method\" line=\"132\"><f a=\"\"><c path=\"String\"/></f></get_PersonaNombre>\x0A\x09<set_PersonaNombre public=\"1\" set=\"method\" line=\"136\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_PersonaNombre>\x0A\x09<EmpresaID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</EmpresaID>\x0A\x09<get_EmpresaID public=\"1\" set=\"method\" line=\"146\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_EmpresaID>\x0A\x09<NombreEmpresa get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreEmpresa>\x0A\x09<get_NombreEmpresa public=\"1\" set=\"method\" line=\"153\"><f a=\"\"><c path=\"String\"/></f></get_NombreEmpresa>\x0A\x09<set_NombreEmpresa public=\"1\" set=\"method\" line=\"157\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreEmpresa>\x0A\x09<NombreProducto get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombreProducto>\x0A\x09<get_NombreProducto public=\"1\" set=\"method\" line=\"167\"><f a=\"\"><c path=\"String\"/></f></get_NombreProducto>\x0A\x09<set_NombreProducto public=\"1\" set=\"method\" line=\"171\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombreProducto>\x0A\x09<NombrePlan get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</NombrePlan>\x0A\x09<get_NombrePlan public=\"1\" set=\"method\" line=\"181\"><f a=\"\"><c path=\"String\"/></f></get_NombrePlan>\x0A\x09<set_NombrePlan public=\"1\" set=\"method\" line=\"185\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_NombrePlan>\x0A\x09<TipoLapso get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</TipoLapso>\x0A\x09<get_TipoLapso public=\"1\" set=\"method\" line=\"195\"><f a=\"\"><c path=\"String\"/></f></get_TipoLapso>\x0A\x09<set_TipoLapso public=\"1\" set=\"method\" line=\"199\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_TipoLapso>\x0A\x09<Termino get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Termino>\x0A\x09<get_Termino public=\"1\" set=\"method\" line=\"209\"><f a=\"\"><c path=\"String\"/></f></get_Termino>\x0A\x09<set_Termino public=\"1\" set=\"method\" line=\"213\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_Termino>\x0A\x09<FechaLapsoDesde get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaLapsoDesde>\x0A\x09<get_FechaLapsoDesde public=\"1\" set=\"method\" line=\"223\"><f a=\"\"><c path=\"Date\"/></f></get_FechaLapsoDesde>\x0A\x09<set_FechaLapsoDesde public=\"1\" set=\"method\" line=\"227\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaLapsoDesde>\x0A\x09<FechaLapsoHasta get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaLapsoHasta>\x0A\x09<get_FechaLapsoHasta public=\"1\" set=\"method\" line=\"237\"><f a=\"\"><c path=\"Date\"/></f></get_FechaLapsoHasta>\x0A\x09<set_FechaLapsoHasta public=\"1\" set=\"method\" line=\"241\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaLapsoHasta>\x0A\x09<FechaCalculoFact get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaCalculoFact>\x0A\x09<get_FechaCalculoFact public=\"1\" set=\"method\" line=\"251\"><f a=\"\"><c path=\"Date\"/></f></get_FechaCalculoFact>\x0A\x09<set_FechaCalculoFact public=\"1\" set=\"method\" line=\"255\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaCalculoFact>\x0A\x09<FechaEmsion get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Date\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</FechaEmsion>\x0A\x09<get_FechaEmsion public=\"1\" set=\"method\" line=\"265\"><f a=\"\"><c path=\"Date\"/></f></get_FechaEmsion>\x0A\x09<set_FechaEmsion public=\"1\" set=\"method\" line=\"269\"><f a=\"value\">\x0A\x09<c path=\"Date\"/>\x0A\x09<c path=\"Date\"/>\x0A</f></set_FechaEmsion>\x0A\x09<PrecioCancelar get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</PrecioCancelar>\x0A\x09<get_PrecioCancelar public=\"1\" set=\"method\" line=\"279\"><f a=\"\"><x path=\"Null\"><x path=\"Float\"/></x></f></get_PrecioCancelar>\x0A\x09<set_PrecioCancelar public=\"1\" set=\"method\" line=\"283\"><f a=\"value\">\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A\x09<x path=\"Null\"><x path=\"Float\"/></x>\x0A</f></set_PrecioCancelar>\x0A\x09<IDFactura get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IDFactura>\x0A\x09<get_IDFactura public=\"1\" set=\"method\" line=\"293\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IDFactura>\x0A\x09<set_IDFactura public=\"1\" set=\"method\" line=\"297\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_IDFactura>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase FC_DeterminarFacturaEspecifica_VTA que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna EmpresaID
	 */
	static public $col_EmpresaID;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaCalculoFact
	 */
	static public $col_FechaCalculoFact;
	/**
	 * @var DateTimeSentence
	 * Referencia a columna FechaEmsion
	 */
	static public $col_FechaEmsion;
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
	 * Referencia a columna IDFactura
	 */
	static public $col_IDFactura;
	/**
	 * @var VarcharSentence
	 * Referencia a columna IdentificadorPersona
	 */
	static public $col_IdentificadorPersona;
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
	 * @var VarcharSentence
	 * Referencia a columna PersonaNombre
	 */
	static public $col_PersonaNombre;
	/**
	 * @var DecimalSentence
	 * Referencia a columna PrecioCancelar
	 */
	static public $col_PrecioCancelar;
	/**
	 * @var VarcharSentence
	 * Referencia a columna Termino
	 */
	static public $col_Termino;
	/**
	 * @var VarcharSentence
	 * Referencia a columna TipoLapso
	 */
	static public $col_TipoLapso;
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
	 * @var \Date
	 */
	public $FechaCalculoFact;
	/**
	 * @var \Date
	 */
	public $FechaEmsion;
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
	public $IDFactura;
	/**
	 * @var string
	 */
	public $IdentificadorPersona;
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
	 * @var string
	 */
	public $PersonaNombre;
	/**
	 * @var float
	 */
	public $PrecioCancelar;
	/**
	 * @var string
	 */
	public $Termino;
	/**
	 * @var string
	 */
	public $TipoLapso;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param string $val_IdentificadorPersona
	 * @param UUID $val_EmpresaID
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_IdentificadorPersona, $val_EmpresaID) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:120: characters 3-185
		return SQL::SELECT()->FROM(FC_DeterminarFacturaEspecifica_VTA::$view)->WHERE(Condition::SET(FC_DeterminarFacturaEspecifica_VTA::$col_IdentificadorPersona, Op::Equal(), Val::string($val_IdentificadorPersona))->AND_Ex(FC_DeterminarFacturaEspecifica_VTA::$col_EmpresaID, Op::Equal(), Val::uuid($val_EmpresaID)));
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
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:111: characters 3-50
		return SQL::SELECT()->FROM(FC_DeterminarFacturaEspecifica_VTA::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase FC_DeterminarFacturaEspecifica_VTA que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_EmpresaID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:147: characters 3-19
		return $this->EmpresaID;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaCalculoFact () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:252: characters 3-26
		return $this->FechaCalculoFact;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaEmsion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:266: characters 3-21
		return $this->FechaEmsion;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaLapsoDesde () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:224: characters 3-25
		return $this->FechaLapsoDesde;
	}

	/**
	 * @return \Date
	 */
	public function get_FechaLapsoHasta () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:238: characters 3-25
		return $this->FechaLapsoHasta;
	}

	/**
	 * @return UUID
	 */
	public function get_IDFactura () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:294: characters 3-19
		return $this->IDFactura;
	}

	/**
	 * @return string
	 */
	public function get_IdentificadorPersona () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:126: characters 3-30
		return $this->IdentificadorPersona;
	}

	/**
	 * @return string
	 */
	public function get_NombreEmpresa () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:154: characters 3-23
		return $this->NombreEmpresa;
	}

	/**
	 * @return string
	 */
	public function get_NombrePlan () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:182: characters 3-20
		return $this->NombrePlan;
	}

	/**
	 * @return string
	 */
	public function get_NombreProducto () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:168: characters 3-24
		return $this->NombreProducto;
	}

	/**
	 * @return string
	 */
	public function get_PersonaNombre () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:133: characters 3-23
		return $this->PersonaNombre;
	}

	/**
	 * @return float
	 */
	public function get_PrecioCancelar () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:280: characters 3-24
		return $this->PrecioCancelar;
	}

	/**
	 * @return string
	 */
	public function get_Termino () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:210: characters 3-17
		return $this->Termino;
	}

	/**
	 * @return string
	 */
	public function get_TipoLapso () {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:196: characters 3-19
		return $this->TipoLapso;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaCalculoFact ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:258: characters 3-132
		if ($this->get_TrackChanges() && ($this->get_FechaCalculoFact() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:258: characters 80-100
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_FechaCalculoFact;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:258: characters 55-132
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaCalculoFact(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:259: characters 3-32
		return $this->FechaCalculoFact = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaEmsion ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:272: characters 3-117
		if ($this->get_TrackChanges() && ($this->get_FechaEmsion() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:272: characters 75-90
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_FechaEmsion;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:272: characters 50-117
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaEmsion(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:273: characters 3-27
		return $this->FechaEmsion = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaLapsoDesde ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:230: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_FechaLapsoDesde() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:230: characters 79-98
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_FechaLapsoDesde;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:230: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaLapsoDesde(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:231: characters 3-31
		return $this->FechaLapsoDesde = $value;
	}

	/**
	 * @param \Date $value
	 * 
	 * @return \Date
	 */
	public function set_FechaLapsoHasta ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:244: characters 3-129
		if ($this->get_TrackChanges() && ($this->get_FechaLapsoHasta() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:244: characters 79-98
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_FechaLapsoHasta;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:244: characters 54-129
			$this->AddChange(new ChangeItem($tmp, $this->get_FechaLapsoHasta(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:245: characters 3-31
		return $this->FechaLapsoHasta = $value;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_IDFactura ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:300: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_IDFactura() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:300: characters 73-86
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_IDFactura;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:300: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_IDFactura(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:301: characters 3-25
		return $this->IDFactura = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreEmpresa ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:160: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_NombreEmpresa() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:160: characters 77-94
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_NombreEmpresa;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:160: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreEmpresa(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:161: characters 3-29
		return $this->NombreEmpresa = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombrePlan ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:188: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_NombrePlan() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:188: characters 74-88
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_NombrePlan;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:188: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_NombrePlan(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:189: characters 3-26
		return $this->NombrePlan = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_NombreProducto ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:174: characters 3-126
		if ($this->get_TrackChanges() && ($this->get_NombreProducto() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:174: characters 78-96
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_NombreProducto;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:174: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_NombreProducto(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:175: characters 3-30
		return $this->NombreProducto = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_PersonaNombre ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:139: characters 3-123
		if ($this->get_TrackChanges() && ($this->get_PersonaNombre() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:139: characters 77-94
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_PersonaNombre;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:139: characters 52-123
			$this->AddChange(new ChangeItem($tmp, $this->get_PersonaNombre(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:140: characters 3-29
		return $this->PersonaNombre = $value;
	}

	/**
	 * @param float $value
	 * 
	 * @return float
	 */
	public function set_PrecioCancelar ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:286: characters 3-126
		if ($this->get_TrackChanges() && !Boot::equal($this->get_PrecioCancelar(), $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:286: characters 78-96
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_PrecioCancelar;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:286: characters 53-126
			$this->AddChange(new ChangeItem($tmp, $this->get_PrecioCancelar(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:287: characters 3-30
		return $this->PrecioCancelar = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Termino ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:216: characters 3-105
		if ($this->get_TrackChanges() && ($this->get_Termino() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:216: characters 71-82
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_Termino;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:216: characters 46-105
			$this->AddChange(new ChangeItem($tmp, $this->get_Termino(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:217: characters 3-23
		return $this->Termino = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_TipoLapso ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:202: characters 3-111
		if ($this->get_TrackChanges() && ($this->get_TipoLapso() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:202: characters 73-86
			$tmp = FC_DeterminarFacturaEspecifica_VTA::$col_TipoLapso;
			#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:202: characters 48-111
			$this->AddChange(new ChangeItem($tmp, $this->get_TipoLapso(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/FC_DeterminarFacturaEspecifica_VTA.hx:203: characters 3-25
		return $this->TipoLapso = $value;
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


		self::$view = new ViewSource("FC_DeterminarFacturaEspecifica_VTA");
		self::$col_IdentificadorPersona = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "IdentificadorPersona", 120, NullableEnum::NULL(), true);
		self::$col_PersonaNombre = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "PersonaNombre", 150, NullableEnum::NOTNULL(), false);
		self::$col_EmpresaID = new UUIDSentence("FC_DeterminarFacturaEspecifica_VTA", "EmpresaID", NullableEnum::NULL(), true);
		self::$col_NombreEmpresa = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "NombreEmpresa", 250, NullableEnum::NULL(), false);
		self::$col_NombreProducto = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "NombreProducto", 150, NullableEnum::NOTNULL(), false);
		self::$col_NombrePlan = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "NombrePlan", 150, NullableEnum::NOTNULL(), false);
		self::$col_TipoLapso = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "TipoLapso", 250, NullableEnum::NULL(), false);
		self::$col_Termino = new VarcharSentence("FC_DeterminarFacturaEspecifica_VTA", "Termino", 250, NullableEnum::NULL(), false);
		self::$col_FechaLapsoDesde = new DateTimeSentence("FC_DeterminarFacturaEspecifica_VTA", "FechaLapsoDesde", NullableEnum::NOTNULL(), false);
		self::$col_FechaLapsoHasta = new DateTimeSentence("FC_DeterminarFacturaEspecifica_VTA", "FechaLapsoHasta", NullableEnum::NULL(), false);
		self::$col_FechaCalculoFact = new DateTimeSentence("FC_DeterminarFacturaEspecifica_VTA", "FechaCalculoFact", NullableEnum::NULL(), false);
		self::$col_FechaEmsion = new DateTimeSentence("FC_DeterminarFacturaEspecifica_VTA", "FechaEmsion", NullableEnum::NULL(), false);
		self::$col_PrecioCancelar = new DecimalSentence("FC_DeterminarFacturaEspecifica_VTA", "PrecioCancelar", 9, 8, NullableEnum::NULL(), false);
		self::$col_IDFactura = new UUIDSentence("FC_DeterminarFacturaEspecifica_VTA", "IDFactura", NullableEnum::NULL(), false);
	}
}

Boot::registerClass(FC_DeterminarFacturaEspecifica_VTA::class, 'nMorph.core.db.zhungo_core.FC_DeterminarFacturaEspecifica_VTA');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\FC_DeterminarFacturaEspecifica_VTA', [
	'IDFactura' => true,
	'PrecioCancelar' => true,
	'FechaEmsion' => true,
	'FechaCalculoFact' => true,
	'FechaLapsoHasta' => true,
	'FechaLapsoDesde' => true,
	'Termino' => true,
	'TipoLapso' => true,
	'NombrePlan' => true,
	'NombreProducto' => true,
	'NombreEmpresa' => true,
	'EmpresaID' => true,
	'PersonaNombre' => true,
	'IdentificadorPersona' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\FC_DeterminarFacturaEspecifica_VTA', [
	'IDFactura' => true,
	'PrecioCancelar' => true,
	'FechaEmsion' => true,
	'FechaCalculoFact' => true,
	'FechaLapsoHasta' => true,
	'FechaLapsoDesde' => true,
	'Termino' => true,
	'TipoLapso' => true,
	'NombrePlan' => true,
	'NombreProducto' => true,
	'NombreEmpresa' => true,
	'PersonaNombre' => true
]);
FC_DeterminarFacturaEspecifica_VTA::__hx__init();
