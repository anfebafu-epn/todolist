<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\svc\transport;

use \nMorph\framework\common\exceptions\LogicException;
use \php\Boot;
use \haxe\Exception;
use \nMorph\framework\svc\exceptions\ExceptionManager;
use \nMorph\framework\common\exceptions\ExceptionHelper;
use \nMorph\framework\svc\msg\ResponseMessage;
use \nMorph\framework\common\exceptions\SecurityException;
use \nMorph\framework\common\helpers\SerializationHelper;
use \haxe\NativeStackTrace;

/**
 * ...
 * @author Smartwork
 */
class Router {
	/**
	 * Método de arranque en el procesamiento de pedidos
	 * Toma el contenido del body HTTP y lo procesa
	 * Espera que el contenido venga serializado (Haxe Serialization)
	 * Encapsulado en un objeto RequestMessage
	 * NOTA: ¿ CONTROL TRANSACCIONAL?
	 * @param	PostData Contenido Serializado (Haxe Serialization) del objeto RequestMessage
	 * @return	Contenido Serializado de respuesta del servicio en objeto ResponseMessage, con Haxe Serialization
	 * 
	 * @param string $PostData
	 * 
	 * @return string
	 */
	public static function Process ($PostData) {
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:42: characters 3-35
		$DecryptedString = "";
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:43: characters 3-33
		$req = null;
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:44: characters 3-31
		$LogicModule = "";
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:45: characters 3-30
		$LogicClass = "";
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:46: characters 3-31
		$LogicMethod = "";
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:47: characters 3-24
		$Name = "";
		#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:49: lines 49-133
		try {
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:51: characters 4-51
			$req = SerializationHelper::Unserialize($PostData);
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:54: characters 4-52
			$res = new ResponseMessage();
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:57: characters 4-44
			$Results = new \Array_hx();
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:61: lines 61-100
			$_g = 0;
			$_g1 = $req->get_Calls();
			while ($_g < $_g1->length) {
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:61: characters 9-11
				$mc = ($_g1->arr[$_g] ?? null);
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:61: lines 61-100
				++$_g;
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:64: characters 5-33
				$LogicModule = $mc->get_LogicModule();
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:65: characters 5-31
				$LogicClass = $mc->get_LogicClass();
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:66: characters 5-33
				$LogicMethod = $mc->get_LogicMethod();
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:67: characters 5-19
				$Name = $mc->get_Name();
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:70: characters 5-47
				$cl = \Type::resolveClass($mc->get_LogicClass());
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:73: lines 73-76
				if ($cl === null) {
					#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:75: characters 6-95
					ExceptionHelper::LogicException(1, "Clase no encontrada. Revise actualización de módulos");
				}
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:79: characters 5-51
				$obj = \Type::createInstance($cl, new \Array_hx());
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:82: characters 5-49
				$mt = \Reflect::field($obj, $mc->get_LogicMethod());
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:85: lines 85-88
				if ($mt === null) {
					#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:87: characters 6-96
					ExceptionHelper::LogicException(2, "Método no encontrado. Revise actualización de módulos");
				}
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:91: characters 5-67
				$ret = \Reflect::callMethod($obj, $mt, $mc->get_LogicParams());
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:94: characters 5-33
				$mr = new MethodResult();
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:95: characters 5-22
				$mr->set_Name($mc->get_Name());
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:96: characters 5-26
				$mr->set_ReturnObject($ret);
				#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:99: characters 5-21
				$Results->arr[$Results->length++] = $mr;
			}
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:103: characters 4-20
			$LogicModule = "";
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:104: characters 4-19
			$LogicClass = "";
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:105: characters 4-20
			$LogicMethod = "";
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:106: characters 4-15
			$Name = "OK";
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:109: characters 4-35
			$res->set_RequestSeq($req->get_RequestSeq());
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:110: characters 4-25
			$res->set_Results($Results);
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:113: characters 4-67
			$ResponseString = SerializationHelper::Serialize($res);
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:116: characters 4-25
			return $ResponseString;
		} catch(LogicException $ex) {
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:120: characters 4-47
			return ExceptionManager::HandleException($ex);
		} catch(SecurityException $ex) {
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:124: characters 4-47
			return ExceptionManager::HandleException($ex);
		} catch(\Throwable $_g) {
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:126: characters 10-12
			NativeStackTrace::saveStack($_g);
			$_g1 = Exception::caught($_g);
			$_g = $_g1->unwrap();
			$ex = $_g1;
			#5_framework\svc\src/nMorph/framework/svc/transport/Router.hx:128: characters 4-113
			return ExceptionManager::HandleException($ex, $DecryptedString, $req, $LogicModule, $LogicClass, $LogicMethod, $Name);
		}
	}

	/**
	 * @return void
	 */
	public function __construct () {
	}
}

Boot::registerClass(Router::class, 'nMorph.framework.svc.transport.Router');
