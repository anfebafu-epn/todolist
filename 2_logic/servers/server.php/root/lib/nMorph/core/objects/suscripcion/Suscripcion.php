<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\objects\suscripcion;

use \nMorph\core\db\zhungo_core\SC_Suscripcion;
use \nMorph\core\db\zhungo_core\SC_MuestraLapsos_VTA;
use \php\Boot;
use \nMorph\core\db\zhungo_core\PL_Cuota_VTA;
use \nMorph\core\db\zhungo_core\FC_MuestrasFacturas_VTA;
use \nMorph\core\db\zhungo_core\SC_Persona;
use \nMorph\core\db\zhungo_core\SC_MuestraFacturas_VTA;
use \nMorph\core\db\zhungo_core\SC_MuestraSuscripciones;
use \nMorph\core\db\zhungo_core\FC_Facturacion;

/**
 * ...
 * @author ...
 */
class Suscripcion {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.objects.suscripcion.Suscripcion\" params=\"\">\x0A\x09<cliente public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.core.db.zhungo_core.SC_Persona\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</cliente>\x0A\x09<suscripcion public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</suscripcion>\x0A\x09<suscripcionServicio public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</suscripcionServicio>\x0A\x09<facturacion public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.core.db.zhungo_core.FC_Facturacion\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</facturacion>\x0A\x09<listadoSuscripcion public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoSuscripcion>\x0A\x09<listadoSuscripcionVista public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraSuscripciones\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoSuscripcionVista>\x0A\x09<listadoFacturacionVista public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoFacturacionVista>\x0A\x09<listadoLapsosVista public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraLapsos_VTA\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoLapsosVista>\x0A\x09<listadoFacturacionesVista public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.FC_MuestrasFacturas_VTA\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoFacturacionesVista>\x0A\x09<listadoCuota public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.PL_Cuota_VTA\"/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</listadoCuota>\x0A\x09<mensaje public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"String\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</mensaje>\x0A\x09<pag public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</pag>\x0A\x09<limite public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<x path=\"Int\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</limite>\x0A\x09<set_listadoFacturacionesVista set=\"method\" line=\"38\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.FC_MuestrasFacturas_VTA\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.FC_MuestrasFacturas_VTA\"/></c>\x0A</f></set_listadoFacturacionesVista>\x0A\x09<get_listadoFacturacionesVista set=\"method\" line=\"43\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.FC_MuestrasFacturas_VTA\"/></c></f></get_listadoFacturacionesVista>\x0A\x09<set_suscripcionServicio set=\"method\" line=\"48\"><f a=\"value\">\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A</f></set_suscripcionServicio>\x0A\x09<get_suscripcionServicio set=\"method\" line=\"53\"><f a=\"\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></f></get_suscripcionServicio>\x0A\x09<set_limite set=\"method\" line=\"58\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_limite>\x0A\x09<get_limite set=\"method\" line=\"63\"><f a=\"\"><x path=\"Int\"/></f></get_limite>\x0A\x09<set_pag set=\"method\" line=\"69\"><f a=\"value\">\x0A\x09<x path=\"Int\"/>\x0A\x09<x path=\"Int\"/>\x0A</f></set_pag>\x0A\x09<get_pag set=\"method\" line=\"74\"><f a=\"\"><x path=\"Int\"/></f></get_pag>\x0A\x09<set_listadoCuota set=\"method\" line=\"79\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.PL_Cuota_VTA\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.PL_Cuota_VTA\"/></c>\x0A</f></set_listadoCuota>\x0A\x09<get_listadoCuota set=\"method\" line=\"84\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.PL_Cuota_VTA\"/></c></f></get_listadoCuota>\x0A\x09<set_mensaje set=\"method\" line=\"89\"><f a=\"value\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A</f></set_mensaje>\x0A\x09<get_mensaje set=\"method\" line=\"95\"><f a=\"\"><c path=\"String\"/></f></get_mensaje>\x0A\x09<get_facturacion set=\"method\" line=\"100\"><f a=\"\"><c path=\"nMorph.core.db.zhungo_core.FC_Facturacion\"/></f></get_facturacion>\x0A\x09<set_facturacion set=\"method\" line=\"105\"><f a=\"value\">\x0A\x09<c path=\"nMorph.core.db.zhungo_core.FC_Facturacion\"/>\x0A\x09<c path=\"nMorph.core.db.zhungo_core.FC_Facturacion\"/>\x0A</f></set_facturacion>\x0A\x09<set_listadoLapsosVista set=\"method\" line=\"110\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraLapsos_VTA\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraLapsos_VTA\"/></c>\x0A</f></set_listadoLapsosVista>\x0A\x09<get_listadoLapsosVista set=\"method\" line=\"115\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraLapsos_VTA\"/></c></f></get_listadoLapsosVista>\x0A\x09<set_listadoFacturacionVista set=\"method\" line=\"121\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA\"/></c>\x0A</f></set_listadoFacturacionVista>\x0A\x09<get_listadoFacturacionVista set=\"method\" line=\"126\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraFacturas_VTA\"/></c></f></get_listadoFacturacionVista>\x0A\x09<set_listadoSuscripcionVista set=\"method\" line=\"131\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraSuscripciones\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraSuscripciones\"/></c>\x0A</f></set_listadoSuscripcionVista>\x0A\x09<get_listadoSuscripcionVista set=\"method\" line=\"137\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_MuestraSuscripciones\"/></c></f></get_listadoSuscripcionVista>\x0A\x09<set_listadoSuscripcion set=\"method\" line=\"143\"><f a=\"value\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></c>\x0A</f></set_listadoSuscripcion>\x0A\x09<get_listadoSuscripcion set=\"method\" line=\"149\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></c></f></get_listadoSuscripcion>\x0A\x09<set_cliente set=\"method\" line=\"154\"><f a=\"value\">\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Persona\"/>\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Persona\"/>\x0A</f></set_cliente>\x0A\x09<get_cliente set=\"method\" line=\"160\"><f a=\"\"><c path=\"nMorph.core.db.zhungo_core.SC_Persona\"/></f></get_cliente>\x0A\x09<set_suscripcion set=\"method\" line=\"165\"><f a=\"value\">\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A\x09<c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/>\x0A</f></set_suscripcion>\x0A\x09<get_suscripcion set=\"method\" line=\"171\"><f a=\"\"><c path=\"nMorph.core.db.zhungo_core.SC_Suscripcion\"/></f></get_suscripcion>\x0A\x09<new public=\"1\" set=\"method\" line=\"19\"><f a=\"\"><x path=\"Void\"/></f></new>\x0A\x09<haxe_doc>* ...\x0A * @author ...</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var SC_Persona
	 */
	public $cliente;
	/**
	 * @var FC_Facturacion
	 */
	public $facturacion;
	/**
	 * @var int
	 */
	public $limite;
	/**
	 * @var PL_Cuota_VTA[]|\Array_hx
	 */
	public $listadoCuota;
	/**
	 * @var SC_MuestraFacturas_VTA[]|\Array_hx
	 */
	public $listadoFacturacionVista;
	/**
	 * @var FC_MuestrasFacturas_VTA[]|\Array_hx
	 */
	public $listadoFacturacionesVista;
	/**
	 * @var SC_MuestraLapsos_VTA[]|\Array_hx
	 */
	public $listadoLapsosVista;
	/**
	 * @var SC_Suscripcion[]|\Array_hx
	 */
	public $listadoSuscripcion;
	/**
	 * @var SC_MuestraSuscripciones[]|\Array_hx
	 */
	public $listadoSuscripcionVista;
	/**
	 * @var string
	 */
	public $mensaje;
	/**
	 * @var int
	 */
	public $pag;
	/**
	 * @var SC_Suscripcion
	 */
	public $suscripcion;
	/**
	 * @var SC_Suscripcion
	 */
	public $suscripcionServicio;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return SC_Persona
	 */
	public function get_cliente () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:161: characters 3-17
		return $this->cliente;
	}

	/**
	 * @return FC_Facturacion
	 */
	public function get_facturacion () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:101: characters 3-21
		return $this->facturacion;
	}

	/**
	 * @return int
	 */
	public function get_limite () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:64: characters 3-16
		return $this->limite;
	}

	/**
	 * @return PL_Cuota_VTA[]|\Array_hx
	 */
	public function get_listadoCuota () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:85: characters 3-22
		return $this->listadoCuota;
	}

	/**
	 * @return SC_MuestraFacturas_VTA[]|\Array_hx
	 */
	public function get_listadoFacturacionVista () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:127: characters 3-33
		return $this->listadoFacturacionVista;
	}

	/**
	 * @return FC_MuestrasFacturas_VTA[]|\Array_hx
	 */
	public function get_listadoFacturacionesVista () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:44: characters 3-35
		return $this->listadoFacturacionesVista;
	}

	/**
	 * @return SC_MuestraLapsos_VTA[]|\Array_hx
	 */
	public function get_listadoLapsosVista () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:116: characters 3-28
		return $this->listadoLapsosVista;
	}

	/**
	 * @return SC_Suscripcion[]|\Array_hx
	 */
	public function get_listadoSuscripcion () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:150: characters 3-28
		return $this->listadoSuscripcion;
	}

	/**
	 * @return SC_MuestraSuscripciones[]|\Array_hx
	 */
	public function get_listadoSuscripcionVista () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:138: characters 3-33
		return $this->listadoSuscripcionVista;
	}

	/**
	 * @return string
	 */
	public function get_mensaje () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:96: characters 3-17
		return $this->mensaje;
	}

	/**
	 * @return int
	 */
	public function get_pag () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:75: characters 3-13
		return $this->pag;
	}

	/**
	 * @return SC_Suscripcion
	 */
	public function get_suscripcion () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:172: characters 3-21
		return $this->suscripcion;
	}

	/**
	 * @return SC_Suscripcion
	 */
	public function get_suscripcionServicio () {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:54: characters 3-29
		return $this->suscripcionServicio;
	}

	/**
	 * @param SC_Persona $value
	 * 
	 * @return SC_Persona
	 */
	public function set_cliente ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:155: characters 3-24
		return $this->cliente = $value;
	}

	/**
	 * @param FC_Facturacion $value
	 * 
	 * @return FC_Facturacion
	 */
	public function set_facturacion ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:106: characters 3-28
		return $this->facturacion = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_limite ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:59: characters 3-25
		return $this->limite = $value;
	}

	/**
	 * @param PL_Cuota_VTA[]|\Array_hx $value
	 * 
	 * @return PL_Cuota_VTA[]|\Array_hx
	 */
	public function set_listadoCuota ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:80: characters 3-31
		return $this->listadoCuota = $value;
	}

	/**
	 * @param SC_MuestraFacturas_VTA[]|\Array_hx $value
	 * 
	 * @return SC_MuestraFacturas_VTA[]|\Array_hx
	 */
	public function set_listadoFacturacionVista ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:122: characters 3-42
		return $this->listadoFacturacionVista = $value;
	}

	/**
	 * @param FC_MuestrasFacturas_VTA[]|\Array_hx $value
	 * 
	 * @return FC_MuestrasFacturas_VTA[]|\Array_hx
	 */
	public function set_listadoFacturacionesVista ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:39: characters 3-44
		return $this->listadoFacturacionesVista = $value;
	}

	/**
	 * @param SC_MuestraLapsos_VTA[]|\Array_hx $value
	 * 
	 * @return SC_MuestraLapsos_VTA[]|\Array_hx
	 */
	public function set_listadoLapsosVista ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:111: characters 3-37
		return $this->listadoLapsosVista = $value;
	}

	/**
	 * @param SC_Suscripcion[]|\Array_hx $value
	 * 
	 * @return SC_Suscripcion[]|\Array_hx
	 */
	public function set_listadoSuscripcion ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:144: characters 3-37
		return $this->listadoSuscripcion = $value;
	}

	/**
	 * @param SC_MuestraSuscripciones[]|\Array_hx $value
	 * 
	 * @return SC_MuestraSuscripciones[]|\Array_hx
	 */
	public function set_listadoSuscripcionVista ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:132: characters 3-42
		return $this->listadoSuscripcionVista = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_mensaje ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:90: characters 3-25
		return $this->mensaje = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_pag ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:70: characters 3-22
		return $this->pag = $value;
	}

	/**
	 * @param SC_Suscripcion $value
	 * 
	 * @return SC_Suscripcion
	 */
	public function set_suscripcion ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:166: characters 3-29
		return $this->suscripcion = $value;
	}

	/**
	 * @param SC_Suscripcion $value
	 * 
	 * @return SC_Suscripcion
	 */
	public function set_suscripcionServicio ($value) {
		#2_logic\objects\src/nMorph/core/objects/suscripcion/Suscripcion.hx:49: characters 3-38
		return $this->suscripcionServicio = $value;
	}
}

Boot::registerClass(Suscripcion::class, 'nMorph.core.objects.suscripcion.Suscripcion');
Boot::registerGetters('nMorph\\core\\objects\\suscripcion\\Suscripcion', [
	'limite' => true,
	'pag' => true,
	'mensaje' => true,
	'listadoCuota' => true,
	'listadoFacturacionesVista' => true,
	'listadoLapsosVista' => true,
	'listadoFacturacionVista' => true,
	'listadoSuscripcionVista' => true,
	'listadoSuscripcion' => true,
	'facturacion' => true,
	'suscripcionServicio' => true,
	'suscripcion' => true,
	'cliente' => true
]);
Boot::registerSetters('nMorph\\core\\objects\\suscripcion\\Suscripcion', [
	'limite' => true,
	'pag' => true,
	'mensaje' => true,
	'listadoCuota' => true,
	'listadoFacturacionesVista' => true,
	'listadoLapsosVista' => true,
	'listadoFacturacionVista' => true,
	'listadoSuscripcionVista' => true,
	'listadoSuscripcion' => true,
	'facturacion' => true,
	'suscripcionServicio' => true,
	'suscripcion' => true,
	'cliente' => true
]);