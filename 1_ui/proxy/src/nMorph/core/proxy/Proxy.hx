package nMorph.core.proxy;
import nMorph.core.proxy.tools.Initializer;
import nMorph.core.proxy.tools.Packager;
import nMorph.framework.common.datatypes.UUID;
import nMorph.framework.svc.transport.MethodCall;
import nMorph.framework.svc.transport.MethodResult;
import nMorph.framework.svc.msg.RequestMessage;
import nMorph.framework.svc.msg.ResponseMessage;
import nMorph.framework.orm.client.ModelObject;


/**
 * ...
 * @author Smartwork
 */
class Proxy 
{

	public function new() 
	{
		
	}
	
	public static function main (){
		Type.getClass(Packager);
		Type.getClass(MethodCall);
		Type.getClass(MethodResult);
		Type.getClass(RequestMessage);
		Type.getClass(ResponseMessage);
		Type.getClass(UUID);
		Type.getClass(ModelObject);
		
		Type.getClass(Initializer);
		Initializer.Init();
	}

}
