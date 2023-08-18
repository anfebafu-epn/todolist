package nMorph.framework.common.helpers;

import haxe.Json;
import haxe.Serializer;
import haxe.Unserializer;

/**
 * ...
 * @author Smartwork
 */
class SerializationHelper
{

	public function new()
	{

	}

	public static function Serialize(obj:Dynamic): String
	{
		Serializer.USE_CACHE = true;
		var serializer = new Serializer();
		serializer.serialize(obj);
		var ResponseString:String = serializer.toString();
		return ResponseString;
	}

	public static function Unserialize(SerializedStr:String): Dynamic
	{
		var unserializer:Unserializer = new Unserializer(SerializedStr);
		return unserializer.unserialize();
	}

	public static function JSON_Serialize(obj:Dynamic): String
	{
		return Json.stringify(obj);
	}

	public static function JSON_Unserialize(SerializedStr:String): Dynamic
	{
		return Json.parse(SerializedStr);
	}

}