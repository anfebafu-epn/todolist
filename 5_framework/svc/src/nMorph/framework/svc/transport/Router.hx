package nMorph.framework.svc.transport;

import nMorph.framework.common.configuration.DeployEnvironmentEnum;
import nMorph.framework.common.exceptions.ExceptionHelper;
import nMorph.framework.common.helpers.SerializationHelper;
import nMorph.framework.svc.exceptions.ExceptionManager;
import nMorph.framework.svc.transport.MethodCall;
import nMorph.framework.svc.transport.MethodResult;
import nMorph.framework.svc.msg.ResponseMessage;
import nMorph.framework.svc.msg.RequestMessage;
import nMorph.framework.common.configuration.ConfigurationData;
import nMorph.framework.common.configuration.Configuration;
import nMorph.framework.common.exceptions.SecurityException;
import nMorph.framework.common.exceptions.LogicException;
import haxe.Exception;
import haxe.Json;

/**
 * ...
 * @author Smartwork
 */
@:keep
class Router
{
	public function new()
	{

	}

	/**
	 * Método de arranque en el procesamiento de pedidos
	 * Toma el contenido del body HTTP y lo procesa
	 * Espera que el contenido venga serializado (Haxe Serialization)
	 * Encapsulado en un objeto RequestMessage
	 * NOTA: ¿ CONTROL TRANSACCIONAL?
	 * @param	PostData Contenido Serializado (Haxe Serialization) del objeto RequestMessage
	 * @return	Contenido Serializado de respuesta del servicio en objeto ResponseMessage, con Haxe Serialization
	 */
	public static function Process(PostData:String):String
	{
		// declaración de variables necesarias para el procesamiento
		var DecryptedString:String = "";
		var req:RequestMessage = null;
		var LogicModule:String = "";
		var LogicClass:String = "";
		var LogicMethod:String = "";
		var Name:String = "";

		try {
			// Deserializa el mensaje que viene del Request
			req = SerializationHelper.Unserialize(PostData);

			// crea la variable de respuesta
			var res:ResponseMessage = new ResponseMessage();
			
			// crea el arreglo de respuestas
			var Results = new Array<MethodResult>();
			

			// por cada llamada que venga dentro del Request hace el procesamiento interno en lógica
			for (mc in req.Calls)
			{
				// determina las variables para ejeccuión
				LogicModule = mc.LogicModule;
				LogicClass = mc.LogicClass;
				LogicMethod = mc.LogicMethod;
				Name = mc.Name;

				// busca la clase que está identificada en la lógica
				var cl = Type.resolveClass(mc.LogicClass);

				// si no encuentra la clase, genera un error
				if (cl == null)
				{
					ExceptionHelper.LogicException(1, "Clase no encontrada. Revise actualización de módulos");
				}

				// crea una instancia de la clase encontrada, para esto las clases involucradas deben tener un constructor vacío obligatoriamente
				var obj:Dynamic = Type.createInstance(cl, []);

				// por medio de reflection, encuentra el método específico que se quiere invocar
				var mt = Reflect.field(obj, mc.LogicMethod);
				
				// si no encuentra el método buscado, genera un error
				if (mt == null)
				{
					ExceptionHelper.LogicException(2, "Método no encontrado. Revise actualización de módulos");
				}

				// Llamada al método descubierto en lógica para obtener el resultado esperado
				var ret:Dynamic = Reflect.callMethod(obj, mt, mc.LogicParams);

				// Llena el objeto de respuesta con la respuesta de lógica del método invocado
				var mr = new MethodResult();
				mr.Name = mc.Name;
				mr.ReturnObject = ret;

				// Agrega la respuesta al arreglo de resultados enviados
				Results.push(mr);
			}

			// Limpia las variables de ejecución
			LogicModule = "";
			LogicClass = "";
			LogicMethod = "";
			Name = "OK";

			// llena en el mensaje los resultados
			res.RequestSeq = req.RequestSeq;
			res.Results = Results;

			// Serializa la respuesta
			var ResponseString:String = SerializationHelper.Serialize(res);

			// reporta la cadena serializada para que forme parte del body de respuesta
			return ResponseString;
		}
		catch (ex:LogicException)
		{
			return ExceptionManager.HandleException(ex);
		}
		catch (ex:SecurityException)
		{
			return ExceptionManager.HandleException(ex);
		}
		catch (ex:Exception)
		{
			return ExceptionManager.HandleException(ex, DecryptedString, req, LogicModule, LogicClass, LogicMethod, Name);
		}
		catch (ex:Dynamic)
		{
			return ExceptionManager.HandleException(new Exception(Json.stringify(ex)), DecryptedString, req, LogicModule, LogicClass, LogicMethod, Name);
		}

		return "";
	}
}
