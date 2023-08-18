package nMorph.core.proxy.tools;
import haxe.Serializer;
import haxe.Unserializer;

/**
 * Método que permite invocar a los métodos de lógica
 * @author Smartwork
 */
@:keep
@:expose
class Packager 
{

	public function new() 
	{
		
	}
	
	public static function Serialize(obj:Dynamic): String{
		Serializer.USE_CACHE = true;
		var serializer = new Serializer();
		serializer.serialize(obj);
		var ResponseString:String = serializer.toString();
		return ResponseString;
	}
	
	public static function Unserialize(SerializedStr:String): Dynamic{
		var unserializer:Unserializer = new Unserializer(SerializedStr);
		return unserializer.unserialize();
	}
}