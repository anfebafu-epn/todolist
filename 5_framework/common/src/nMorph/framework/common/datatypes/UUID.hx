package nMorph.framework.common.datatypes;
import haxe.io.Bytes;
import haxe.ds.Vector;
import haxe.Timer;
import haxe.Int64;
import haxe.crypto.Md5;
import haxe.crypto.Sha1;

@:keep
@:keepSub
@:expose
class UUID
{
	// variable interna que lleva el almacenamiento del tipo de dato
	// inicia con un valor 0 inicialmente
	private var UUIDValue:String = NIL;

	/**
	 * Inicializa un UUID con valor 0
	 */
	public function new()
	{
		// el valor inicia en vacío
	}

	/**
	 * Almacena el valor string determinado internamente
	 * @param	Valor en string
	 * @return
	 */
	public function setValue(UUIDString:String):UUID
	{
		// siempre se almacena en uppercase
		if (UUIDString == null)
		{
			this.UUIDValue = null;
		}
		else{
			this.UUIDValue = UUIDString.toUpperCase();
		}
		return this;
	}

	@:op(A = B)
	public function assign(b:String):UUID
	{
		setValue(b);
		return this;
	}

	@:op(A == B)
	public function equals(b:UUID):Bool
	{
		return UUIDValue == b.UUIDValue;
	}

	@:op(A != B)
	public function diff(b:UUID):Bool
	{
		return this.UUIDValue != b.UUIDValue;
	}

	/**
	 * Obtiene el UUID almacenado en String
	 * @param	UUID
	 * @return string interno almacenado
	 */
	public function getValue():String
	{
		return this.UUIDValue;
	}

	/**
	 * Obtiene el UUID almacenado en String
	 * @param	UUID
	 * @return string interno almacenado
	 */
	public function toString():String
	{
		return this.UUIDValue;
	}

	/**
	 * Obtiene la representación en formato short
	 * @return
	 */
	public function getShort():String
	{
		if (this.UUIDValue == null) return null;
		return UUID.toShort(this.UUIDValue);
	}

	/**
	 * Obtiene la representación en formato Nano
	 * @return
	 */
	public function getNano():String
	{
		if (this.UUIDValue == null) return null;
		return UUID.toNano(this.UUIDValue);
	}

	/**
	 * Devuelve la representación del UUID en Bytes
	 * @return
	 */
	public function getBytes():Bytes
	{
		if (this.UUIDValue == null) return null;
		return UUID.parse(this.UUIDValue);
	}

	/**
	 * Establece el valor desde un tipo de dato Bytes
	 * @param	UUIDBytes
	 */
	public function setValuefromBytes(UUIDBytes: Bytes):UUID
	{
		setValue(UUID.stringify(UUIDBytes));
		return this;
	}

	/**
	 * Crea un nuevo UUID vacío
	 */
	public static function empty(): UUID
	{
		return new UUID().setValue(NIL);
	}

	/**
	 * Crea un UUID desde Bytes
	 * @param	UUIDBytes
	 */
	public static function fromBytes(UUIDBytes:Bytes)
	{
		return new UUID().setValuefromBytes(UUIDBytes);
	}

	/**
	 * Genera un valor UUID de forma aleatoria utilizando algoritmo v4
	 * @return
	 */
	public static function newUUID():UUID
	{
		return new UUID().setValue(UUID.v4(secureRandom));
	}

	private static function secureRandom():Int
	{
		return Std.random(256);
	}

	/**
	 * Genera un UUID desde un String
	 * @param	UUID en string
	 * @return  UUID
	 */
	public static function fromString(UUIDString:String):UUID
	{
		return new UUID().setValue(UUIDString);
	}

	/**
	 * Valida si el valor es EMPTY
	 * @return
	 */
	public function isEMPTY():Bool
	{
		if (this.UUIDValue == null)
			return false;
		if (this.UUIDValue == NIL)
			return true;
		return false;
	}

	/**
	 * Valida si el valor es NULL
	 * @return
	 */
	public function isNULL():Bool
	{
		if (this.UUIDValue == null)
			return true;
		return false;
	}

	//https://github.com/flashultra/uuid/blob/master/src/uuid/Uuid.hx

	private inline static var DNS = '6ba7b810-9dad-11d1-80b4-00c04fd430c8';
	private inline static var URL = '6ba7b811-9dad-11d1-80b4-00c04fd430c8';
	private inline static var ISO_OID = '6ba7b812-9dad-11d1-80b4-00c04fd430c8';
	private inline static var X500_DN = '6ba7b814-9dad-11d1-80b4-00c04fd430c8';
	private inline static var NIL = '00000000-0000-0000-0000-000000000000';

	private inline static var LOWERCASE_BASE26 = "abcdefghijklmnopqrstuvwxyz";
	private inline static var UPPERCASE_BASE26 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private inline static var NO_LOOK_ALIKES_BASE51 = "2346789ABCDEFGHJKLMNPQRTUVWXYZabcdefghijkmnpqrtwxyz"; // without 1, l, I, 0, O, o, u, v, 5, S, s
	private inline static var FLICKR_BASE58 = "123456789abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";  // without similar characters 0/O, 1/I/l
	private inline static var BASE_70 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-+!@#$^";
	private inline static var COOKIE_BASE90 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!#$%&'()*+-./:<=>?@[]^_`{|}~";
	private inline static var NANO_ID_ALPHABET = "_-0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private inline static var NUMBERS_BIN = "01";
	private inline static var NUMBERS_OCT = "01234567";
	private inline static var NUMBERS_DEC = "0123456789";
	private inline static var NUMBERS_HEX = "0123456789abcdef";

	static var lastMSecs:Float = 0;
	static var lastNSecs = 0;
	static var clockSequenceBuffer:Int = -1;
	static var regexp:EReg = ~/^(?:[0-9a-f] {8}-[0-9a-f] {4}-[1-5][0-9a-f] {3}-[89ab][0-9a-f] {3}-[0-9a-f] {12}|00000000-0000-0000-0000-000000000000)$/i;

	static var rndSeed:Int = Std.int(Timer.stamp() * 1000);
	static var state0 = splitmix64_seed(rndSeed);
	static var state1 = splitmix64_seed(rndSeed + 1);

	private static function splitmix64_seed(index:Int):Int64
	{
		var result:Int64 = (index + Int64.make(0x9E3779B9, 0x7F4A7C15));
		result = (result ^ (result >> 30)) * Int64.make(0xBF58476D, 0x1CE4E5B9);
		result = (result ^ (result >> 27)) * Int64.make(0x94D049BB, 0x133111EB);
		return result ^ (result >> 31);
	}

	private static function randomFromRange(min:Int, max:Int):Int
	{
		var s1:Int64 = state0;
		var s0:Int64 = state1;
		state0 = s0;
		s1 ^= s1 << 23;
		state1 = s1 ^ s0 ^ (s1 >>> 18) ^ (s0 >>> 5);
		var result:Int = ((state1 + s0) % (max - min + 1)).low;
		result = (result < 0) ? -result : result;
		return result + min;
	}

	private static function randomByte():Int
	{
		return randomFromRange(0, 255);
	}

	private static function fromShort(shortUUID:String, separator:String = '-', fromAlphabet:String = FLICKR_BASE58):String
	{
		var uuid  = UUID.convert(shortUUID,fromAlphabet,NUMBERS_HEX);
		return hexToUUID(uuid,separator);
	}

	private static function toShort(uuid:String, separator:String = '-',toAlphabet:String = FLICKR_BASE58):String
	{
		uuid = StringTools.replace(uuid, separator, '').toLowerCase();
		return  UUID.convert(uuid,NUMBERS_HEX,toAlphabet);
	}

	private static function fromNano(nanoUUID:String, separator:String = '-', fromAlphabet:String = NANO_ID_ALPHABET):String
	{
		var uuid  = UUID.convert(nanoUUID,fromAlphabet,NUMBERS_HEX);
		return hexToUUID(uuid,separator);
	}

	private static function toNano(uuid:String, separator:String = '-',toAlphabet:String = NANO_ID_ALPHABET):String
	{
		uuid = StringTools.replace(uuid, separator, '').toLowerCase();
		return  UUID.convert(uuid,NUMBERS_HEX,toAlphabet);
	}

	private static function v1(node:Bytes = null, optClockSequence:Int = -1, msecs:Float = -1, optNsecs:Int = -1, ?randomFunc:Void->Int, separator:String = "-", shortUUID:Bool = false, toAlphabet:String = FLICKR_BASE58):String
	{
		if ( randomFunc == null) randomFunc = randomByte;
		var buffer:Bytes = Bytes.alloc(16);
		if (node == null)
		{
			node = Bytes.alloc(6);
			for (i in 0...6)
				node.set(i, randomFunc());
			node.set(0, node.get(0) | 0x01);
		}
		if (clockSequenceBuffer == -1)
		{
			clockSequenceBuffer = (randomFunc() << 8 | randomFunc()) & 0x3fff;
		}
		var clockSeq = optClockSequence;
		if (optClockSequence == -1)
		{
			clockSeq = clockSequenceBuffer;
		}
		if (msecs == -1)
		{
			msecs = Timer.stamp();
		}
		var nsecs = optNsecs;
		if (optNsecs == -1)
		{
			nsecs = lastNSecs + 1;
		}
		var dt = (msecs - lastMSecs) + (nsecs - lastNSecs) / 10000;
		if (dt < 0 && (optClockSequence == -1))
		{
			clockSeq = (clockSeq + 1) & 0x3fff;
		}
		if ((dt < 0 || msecs > lastMSecs) && optNsecs == -1)
		{
			nsecs = 0;
		}
		if (nsecs >= 10000)
		{
			throw "Can't create more than 10M uuids/sec";
		}
		lastMSecs = msecs;
		lastNSecs = nsecs;
		clockSequenceBuffer = clockSeq;

		msecs += 12219292800000;
		var dvs:Int64 = Int64.make(0x00000001, 0x00000000);
		var tl:Int = (((Int64.fromFloat(msecs) & 0xfffffff) * 10000 + nsecs) % dvs).low;
		buffer.set(0, tl >>> 24 & 0xff);
		buffer.set(1, tl >>> 16 & 0xff);
		buffer.set(2, tl >>> 8 & 0xff);
		buffer.set(3, tl & 0xff);

		var tmh:Int = ((Int64.fromFloat(msecs) / dvs * 10000) & 0xfffffff).low;
		buffer.set(4, tmh >>> 8 & 0xff);
		buffer.set(5, tmh & 0xff);

		buffer.set(6, tmh >>> 24 & 0xf | 0x10);
		buffer.set(7, tmh >>> 16 & 0xff);

		buffer.set(8, clockSeq >>> 8 | 0x80);
		buffer.set(9, clockSeq & 0xff);

		for (i in 0...6)
			buffer.set(i + 10, node.get(i));

		var uuid = stringify(buffer,separator);
		if ( shortUUID ) uuid = UUID.toShort(uuid,separator,toAlphabet);

		return uuid;
	}

	private static function v3(name:String, namespace:String = "", separator:String = "-", shortUUID:Bool = false, toAlphabet:String = FLICKR_BASE58):String
	{
		namespace = StringTools.replace(namespace, '-', '');
		var buffer = Md5.make(Bytes.ofHex(namespace + Bytes.ofString(name).toHex()));
		buffer.set(6, (buffer.get(6) & 0x0f) | 0x30);
		buffer.set(8, (buffer.get(8) & 0x3f) | 0x80);
		var uuid = stringify(buffer,separator);
		if ( shortUUID ) uuid = UUID.toShort(uuid,separator,toAlphabet);
		return uuid;
	}

	private static function v4(randBytes:Bytes = null, ?randomFunc:Void->Int, separator:String = "-", shortUUID:Bool = false, toAlphabet:String = FLICKR_BASE58):String
	{
		if ( randomFunc == null) randomFunc = randomByte;
		var buffer:Bytes = randBytes;
		if ( buffer == null )
		{
			buffer = Bytes.alloc(16);
			for (i in 0...16)
			{
				buffer.set(i, randomFunc());
			}
		}
		else {
			if ( buffer.length < 16) throw "Random bytes should be at least 16 bytes";
		}
		buffer.set(6, (buffer.get(6) & 0x0f) | 0x40);
		buffer.set(8, (buffer.get(8) & 0x3f) | 0x80);
		var uuid = stringify(buffer,separator);
		if ( shortUUID ) uuid = UUID.toShort(uuid,separator,toAlphabet);
		return uuid;
	}

	private static function v5(name:String, namespace:String = "", separator:String = "-", shortUUID:Bool = false, toAlphabet:String = FLICKR_BASE58):String
	{
		namespace = StringTools.replace(namespace, '-', '');
		var buffer = Sha1.make(Bytes.ofHex(namespace + Bytes.ofString(name).toHex()));
		buffer.set(6, (buffer.get(6) & 0x0f) | 0x50);
		buffer.set(8, (buffer.get(8) & 0x3f) | 0x80);
		var uuid = stringify(buffer,separator);
		if ( shortUUID ) uuid = UUID.toShort(uuid,separator,toAlphabet);
		return uuid;
	}

	private static function stringify(data:Bytes,separator:String = "-"):String
	{
		return hexToUUID(data.toHex(),separator);
	}

	private static function parse(uuid:String, separator:String = "-"):Bytes
	{
		return Bytes.ofHex(StringTools.replace(uuid, separator, ''));
	}

	private static function validate(uuid:String,separator:String = "-"):Bool
	{
		if ( separator == "")
		{
			uuid = uuid.substr(0, 8) + "-" + uuid.substr(8, 4) + "-" + uuid.substr(12, 4) + "-" + uuid.substr(16, 4) + "-" + uuid.substr(20, 12);
		}
		else if ( separator != "-")
		{
			uuid = StringTools.replace(uuid, separator, '-');
		}
		return regexp.match(uuid);
	}

	private static function version(uuid:String,separator:String = "-"):Int
	{
		uuid = StringTools.replace(uuid, separator, '');
		return Std.parseInt("0x"+uuid.substr(12,1));
	}

	private static function hexToUUID( hex:String, separator:String):String
	{
		return ( hex.substr(0, 8) + separator + hex.substr(8, 4) + separator + hex.substr(12, 4) + separator + hex.substr(16, 4) + separator + hex.substr(20, 12));
	}

	private static function convert(number:String, fromAlphabet:String, toAlphabet:String ):String
	{
		var fromBase:Int = fromAlphabet.length;
		var toBase:Int  = toAlphabet.length;
		var len = number.length;
		var buf:String = "";
		var numberMap:Vector<Int> = new Vector<Int>(len);
		var divide:Int = 0, newlen:Int = 0;
		for (i in 0...len)
		{
			numberMap[i] = fromAlphabet.indexOf(number.charAt(i));
		}
		do {
			divide = 0;
			newlen = 0;
			for (i in 0...len)
			{
				divide = divide * fromBase + numberMap[i];
				if (divide >= toBase)
				{
					numberMap[newlen++] = Math.floor( divide / toBase);
					divide = divide % toBase;
				}
				else if (newlen > 0)
				{
					numberMap[newlen++] = 0;
				}
			}
			len = newlen;
			buf = toAlphabet.charAt(divide) + buf;
		}
		while (newlen !=0 );

		return buf;
	}

	private static function nanoId(len:Int=21,alphabet:String=NANO_ID_ALPHABET,?randomFunc:Void->Int):String
	{
		if ( randomFunc == null ) randomFunc = randomByte;
		if ( alphabet == null ) throw "Alphabet cannot be null";
		if ( alphabet.length == 0 || alphabet.length >= 256 ) throw "Alphabet must contain between 1 and 255 symbols";
		if ( len <= 0 ) throw "Length must be greater than zero";
		var mask:Int = (2 <<  Math.floor(Math.log(alphabet.length - 1) / Math.log(2))) - 1;
		var step:Int =  Math.ceil(1.6 * mask * len / alphabet.length);
		var sb = new StringBuf();
		while (sb.length != len)
		{
			for (i in 0...step)
			{
				var rnd = randomFunc();
				var aIndex:Int = rnd & mask;
				if (aIndex < alphabet.length)
				{
					sb.add(alphabet.charAt(aIndex));
					if (sb.length == len) break;
				}
			}
		}
		return sb.toString();
	}

	private static function short(toAlphabet:String = FLICKR_BASE58, ?randomFunc:Void->Int):String
	{
		return UUID.v4(randomFunc,true,toAlphabet);
	}
}
