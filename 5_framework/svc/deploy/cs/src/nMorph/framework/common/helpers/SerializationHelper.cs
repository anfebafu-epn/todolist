// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.common.helpers {
	public class SerializationHelper : global::haxe.lang.HxObject {
		
		public SerializationHelper(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public SerializationHelper() {
			global::nMorph.framework.common.helpers.SerializationHelper.__hx_ctor_nMorph_framework_common_helpers_SerializationHelper(this);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_common_helpers_SerializationHelper(global::nMorph.framework.common.helpers.SerializationHelper __hx_this) {
		}
		
		
		public static string Serialize(object obj) {
			global::haxe.Serializer.USE_CACHE = true;
			global::haxe.Serializer serializer = new global::haxe.Serializer();
			serializer.serialize(obj);
			string ResponseString = serializer.toString();
			return ResponseString;
		}
		
		
		public static object Unserialize(string SerializedStr) {
			global::haxe.Unserializer unserializer = new global::haxe.Unserializer(((string) (SerializedStr) ));
			return unserializer.unserialize();
		}
		
		
		public static string JSON_Serialize(object obj) {
			global::haxe.lang.Function replacer = null;
			string space = null;
			return global::haxe.format.JsonPrinter.print(obj, replacer, space);
		}
		
		
		public static object JSON_Unserialize(string SerializedStr) {
			return new global::haxe.format.JsonParser(((string) (SerializedStr) )).doParse();
		}
		
		
	}
}

