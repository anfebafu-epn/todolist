package nMorph.framework.common;

import haxe.Exception;
import haxe.Http;
import haxe.Serializer;
import haxe.Unserializer;
import haxe.http.HttpBase;
import haxe.http.HttpMethod;
import haxe.http.HttpStatus;
import haxe.io.BytesOutput;
import nMorph.framework.common.configuration.Configuration;
import nMorph.framework.common.datatypes.UUID;
import nMorph.framework.common.exceptions.*;
import nMorph.framework.common.helpers.SerializationHelper;
import nMorph.framework.common.helpers.UUIDKEY;
import haxe.Json;
import haxe.crypto.Base64;
import haxe.crypto.Sha256;
import haxe.xml.Parser;
import nMorph.framework.common.helpers.Int64_Helper;
import haxe.Int64;
import haxe.io.UInt8Array;
import haxe.Log;
import nMorph.framework.common.interfaces.IDisposable;
import sys.FileSystem;


import Math;

#if js
	import haxe.http.HttpJs;
	import haxe.http.HttpNodeJs;
#end


#if (!flash)
	import sys.io.File;
	import sys.io.Process;
	import sys.net.Host;
	import sys.net.Address;
#end

/**
*   Clase de procesamiento de pedidos. Toma el pedido recibido por medio de POST y lo procesa ubicando el componente encargado del procesamiento
**/
@:keepSub @:rtti
class Common
{

	public static function main()
	{
		Type.getClass(Int64_Helper);
		Type.getClass(UUID);
		Type.getClass(DateTools);
		Type.getClass(Xml);
		Type.getClass(Base64);
		Type.getClass(Sha256);
		Type.getClass(Json);
		Type.getClass(UUIDKEY);
		Type.getClass(Common);
		Type.getClass(Configuration);
		Type.getClass(Serializer);
		Type.getClass(Unserializer);
		Type.getClass(Math);
		Type.getClass(Parser);
		Type.getClass(Exception);
		Type.getClass(Configuration);
		Type.getClass(IDisposable);
		Type.getClass(ExceptionHelper);
		Type.getClass(LogicException);
		Type.getClass(SecurityException);
		Type.getClass(SerializationHelper);
		Type.getClass(Http);
		Type.getClass(HttpBase);
		Type.getClass(BytesOutput);
		Type.getClass(FileSystem);
		Type.getClass(hscript.Async);
		Type.getClass(hscript.Bytes);
		Type.getClass(hscript.Checker);
		//Type.getClass(hscript.Expr);
		Type.getClass(hscript.Interp);
		//Type.getClass(hscript.Macro);
		Type.getClass(hscript.Parser);
		Type.getClass(hscript.Printer);
		Type.getClass(hscript.Tools);
		//Type.getClass(Null<Int>);
		//Type.getClass(haxe.lang.StringExt);
		
		
		#if js
		Type.getClass(HttpJs);
		Type.getClass(HttpNodeJs);
		#end

		#if (!flash)
		Type.getClass(File); 
		Type.getClass(Process);
		Type.getClass(Host);
		Type.getClass(Address);
		#end
	}
}
