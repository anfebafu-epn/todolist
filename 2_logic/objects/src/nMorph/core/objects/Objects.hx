package nMorph.core.objects;
import nMorph.core.objects.ping.PingRequest;
import nMorph.core.objects.ping.PingResponse;

/**
 * ...
 * @author Smartwork
 */
@:keepSub @:rtti
class Objects
{

	public function new()
	{

	}

	public static function main ()
	{		
	    Type.getClass(PingRequest);
		Type.getClass(PingResponse);
	    
	}

}