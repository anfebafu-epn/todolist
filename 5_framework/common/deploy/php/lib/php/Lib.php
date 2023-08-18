<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace php;

use \php\_Boot\HxAnon;
use \haxe\Exception;
use \php\_Boot\HxString;
use \haxe\ds\StringMap;

/**
 * Platform-specific PHP Library. Provides some platform-specific functions
 * for the PHP target, such as conversion from Haxe types to native types
 * and vice-versa.
 */
class Lib {
	/**
	 * @var bool
	 */
	static public $loaded = false;

	/**
	 * @param StringMap $hash
	 * 
	 * @return array
	 */
	public static function associativeArrayOfHash ($hash) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:108: characters 3-35
		return $hash->data;
	}

	/**
	 * @param mixed $ob
	 * 
	 * @return array
	 */
	public static function associativeArrayOfObject ($ob) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:121: characters 3-26
		return ((array)($ob));
	}

	/**
	 * Displays structured information about one or more expressions
	 * that includes its type and value. Arrays and objects are
	 * explored recursively with values indented to show structure.
	 * 
	 * @param mixed $v
	 * 
	 * @return void
	 */
	public static function dump ($v) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:57: characters 3-21
		\var_dump($v);
	}

	/**
	 * Find out whether an extension is loaded.
	 * 
	 * @param string $name
	 * 
	 * @return bool
	 */
	public static function extensionLoaded ($name) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:79: characters 3-39
		return \extension_loaded($name);
	}

	/**
	 * Tries to load all compiled php files and returns list of types.
	 * 
	 * @return mixed
	 */
	public static function getClasses () {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:148: lines 148-152
		if (!Lib::$loaded) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:149: characters 4-17
			Lib::$loaded = true;
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:150: characters 4-70
			$reflection = new \ReflectionClass(Boot::getPhpName("php.Boot"));
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:151: characters 4-56
			Lib::loadLib(\dirname($reflection->getFileName(), 2));
		}
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:154: characters 3-27
		$result = new HxAnon();
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:155: lines 155-166
		$collection = Boot::getRegisteredAliases();
		foreach ($collection as $key => $value) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:156: characters 4-36
			$parts = HxString::split($value, ".");
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:157: characters 4-21
			$obj = $result;
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:158: lines 158-164
			while ($parts->length > 1) {
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:159: characters 16-29
				if ($parts->length > 0) {
					$parts->length--;
				}
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:159: characters 5-30
				$pack = \array_shift($parts->arr);
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:160: characters 22-25
				$tmp = $obj;
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:160: lines 160-162
				if ($tmp->{$pack} === null) {
					#C:\HaxeToolkit\haxe\std/php/Lib.hx:161: characters 22-25
					$tmp1 = $obj;
					#C:\HaxeToolkit\haxe\std/php/Lib.hx:161: characters 6-36
					$tmp1->{$pack} = new HxAnon();
				}
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:163: characters 24-27
				$tmp2 = $obj;
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:163: characters 5-34
				$obj = $tmp2->{$pack};
			}
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:165: characters 20-23
			$tmp3 = $obj;
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:165: characters 4-58
			$tmp3->{($parts->arr[0] ?? null)} = Boot::getClass($key);
		}
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:168: characters 3-16
		return $result;
	}

	/**
	 * @param array $arr
	 * 
	 * @return StringMap
	 */
	public static function hashOfAssociativeArray ($arr) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:102: characters 3-32
		$result = new StringMap();
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:103: characters 19-36
		$result->data = $arr;
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:104: characters 3-16
		return $result;
	}

	/**
	 * @return bool
	 */
	public static function isCli () {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:83: characters 3-59
		return 0 === \strncasecmp(\PHP_SAPI, "cli", 3);
	}

	/**
	 * Loads types defined in the specified directory.
	 * 
	 * @param string $pathToLib
	 * 
	 * @return void
	 */
	public static function loadLib ($pathToLib) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:177: characters 3-49
		$absolutePath = \realpath($pathToLib);
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:178: lines 178-179
		if ($absolutePath === false) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:179: characters 4-9
			throw Exception::thrown("Failed to read path: " . ($pathToLib??'null'));
		}
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:180: lines 180-184
		$collection = \glob("" . ($absolutePath??'null') . "/*.php");
		foreach ($collection as $key => $value) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:181: lines 181-183
			if (!\is_dir($value)) {
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:182: characters 5-34
				require_once($value);
			}
		}
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:185: lines 185-187
		$collection = \glob("" . ($absolutePath??'null') . "/*", \GLOB_ONLYDIR);
		foreach ($collection as $key => $value) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:186: characters 4-20
			Lib::loadLib($value);
		}
	}

	/**
	 * See the documentation for the equivalent PHP function for details on usage:
	 * <http://php.net/manual/en/function.mail.php>
	 * 
	 * @param string $to
	 * @param string $subject
	 * @param string $message
	 * @param string $additionalHeaders
	 * @param string $additionalParameters
	 * 
	 * @return bool
	 */
	public static function mail ($to, $subject, $message, $additionalHeaders = null, $additionalParameters = null) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:129: characters 3-84
		return \mail($to, $subject, $message, $additionalHeaders, $additionalParameters);
	}

	/**
	 * @param array $arr
	 * 
	 * @return mixed
	 */
	public static function objectOfAssociativeArray ($arr) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:112: lines 112-116
		foreach ($arr as $key => $value) {
			#C:\HaxeToolkit\haxe\std/php/Lib.hx:113: lines 113-115
			$value1 = $value;
			if (\is_array($value1)) {
				#C:\HaxeToolkit\haxe\std/php/Lib.hx:114: characters 5-47
				$arr[$key] = Lib::objectOfAssociativeArray($value1);
			}
		}
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:117: characters 3-30
		return Boot::createAnon($arr);
	}

	/**
	 * Print the specified value on the default output.
	 * 
	 * @param mixed $v
	 * 
	 * @return void
	 */
	public static function print ($v) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:39: characters 3-29
		echo(\Std::string($v));
	}

	/**
	 * Output file content from the given file name.
	 * 
	 * @param string $file
	 * 
	 * @return int
	 */
	public static function printFile ($file) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:90: characters 3-51
		return \fpassthru(\fopen($file, "r"));
	}

	/**
	 * Print the specified value on the default output followed by
	 * a newline character.
	 * 
	 * @param mixed $v
	 * 
	 * @return void
	 */
	public static function println ($v) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:47: characters 3-11
		echo(\Std::string($v));
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:48: characters 3-14
		echo("\x0A");
	}

	/**
	 * Serialize using native PHP serialization. This will return a binary
	 * `String` that can be stored for long term usage.
	 * 
	 * @param mixed $v
	 * 
	 * @return string
	 */
	public static function serialize ($v) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:65: characters 3-29
		return \serialize($v);
	}

	/**
	 * @param array $a
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public static function toHaxeArray ($a) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:98: characters 3-39
		return \Array_hx::wrap($a);
	}

	/**
	 * @param mixed[]|\Array_hx $a
	 * 
	 * @return array
	 */
	public static function toPhpArray ($a) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:94: characters 3-31
		return $a->arr;
	}

	/**
	 * Unserialize a `String` using native PHP serialization. See `php.Lib.serialize()`.
	 * 
	 * @param string $s
	 * 
	 * @return mixed
	 */
	public static function unserialize ($s) {
		#C:\HaxeToolkit\haxe\std/php/Lib.hx:72: characters 3-31
		return \unserialize($s);
	}
}

Boot::registerClass(Lib::class, 'php.Lib');