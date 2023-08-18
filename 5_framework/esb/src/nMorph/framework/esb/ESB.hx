package nMorph.framework.esb;
import nMorph.framework.common.configuration.Configuration;
import nMorph.framework.esb.bus.Bus;
import nMorph.framework.svc.transport.MethodCall;

/**
 * ...
 * @author Smartwork
 */
class ESB
{

	public function new() 
	{
		
		
	}
	
	public static function main(){
		Type.getClass(Bus);
		Type.getClass(Configuration);
		Type.getClass(MethodCall);
	}
	
}