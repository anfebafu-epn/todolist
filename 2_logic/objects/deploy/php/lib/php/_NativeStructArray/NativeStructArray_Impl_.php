<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace php\_NativeStructArray;

use \php\Boot;

final class NativeStructArray_Impl_ {
	/**
	 * @param mixed $obj
	 * 
	 * @return array
	 */
	public static function __fromObject ($obj) {
		#C:\HaxeToolkit\haxe\std/php/NativeStructArray.hx:34: characters 3-32
		return ((array)($obj));
	}

	/**
	 * @param array $this
	 * 
	 * @return mixed
	 */
	public static function __toObject ($this1) {
		#C:\HaxeToolkit\haxe\std/php/NativeStructArray.hx:39: characters 3-31
		return Boot::createAnon($this1);
	}

	/**
	 * @param array $this
	 * @param string $key
	 * 
	 * @return mixed
	 */
	public static function get ($this1, $key) {
		#C:\HaxeToolkit\haxe\std/php/NativeStructArray.hx:44: characters 3-19
		return $this1[$key];
	}

	/**
	 * @param array $this
	 * @param string $key
	 * @param mixed $val
	 * 
	 * @return mixed
	 */
	public static function set ($this1, $key, $val) {
		#C:\HaxeToolkit\haxe\std/php/NativeStructArray.hx:48: characters 3-25
		return $this1[$key] = $val;
	}
}

Boot::registerClass(NativeStructArray_Impl_::class, 'php._NativeStructArray.NativeStructArray_Impl_');