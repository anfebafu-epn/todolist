<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace hscript;

use \php\Boot;
use \php\_Boot\HxEnum;

class TType extends HxEnum {
	/**
	 * @param object $a
	 * @param TType[]|\Array_hx $args
	 * 
	 * @return TType
	 */
	static public function TAbstract ($a, $args) {
		return new TType('TAbstract', 12, [$a, $args]);
	}

	/**
	 * @param object[]|\Array_hx $fields
	 * 
	 * @return TType
	 */
	static public function TAnon ($fields) {
		return new TType('TAnon', 14, [$fields]);
	}

	/**
	 * @return TType
	 */
	static public function TBool () {
		static $inst = null;
		if (!$inst) $inst = new TType('TBool', 4, []);
		return $inst;
	}

	/**
	 * @return TType
	 */
	static public function TDynamic () {
		static $inst = null;
		if (!$inst) $inst = new TType('TDynamic', 5, []);
		return $inst;
	}

	/**
	 * @param object $e
	 * @param TType[]|\Array_hx $args
	 * 
	 * @return TType
	 */
	static public function TEnum ($e, $args) {
		return new TType('TEnum', 10, [$e, $args]);
	}

	/**
	 * @return TType
	 */
	static public function TFloat () {
		static $inst = null;
		if (!$inst) $inst = new TType('TFloat', 3, []);
		return $inst;
	}

	/**
	 * @param object[]|\Array_hx $args
	 * @param TType $ret
	 * 
	 * @return TType
	 */
	static public function TFun ($args, $ret) {
		return new TType('TFun', 13, [$args, $ret]);
	}

	/**
	 * @param object $c
	 * @param TType[]|\Array_hx $args
	 * 
	 * @return TType
	 */
	static public function TInst ($c, $args) {
		return new TType('TInst', 9, [$c, $args]);
	}

	/**
	 * @return TType
	 */
	static public function TInt () {
		static $inst = null;
		if (!$inst) $inst = new TType('TInt', 2, []);
		return $inst;
	}

	/**
	 * @param \Closure $f
	 * 
	 * @return TType
	 */
	static public function TLazy ($f) {
		return new TType('TLazy', 15, [$f]);
	}

	/**
	 * @param object $r
	 * 
	 * @return TType
	 */
	static public function TMono ($r) {
		return new TType('TMono', 0, [$r]);
	}

	/**
	 * @param TType $t
	 * 
	 * @return TType
	 */
	static public function TNull ($t) {
		return new TType('TNull', 8, [$t]);
	}

	/**
	 * @param string $name
	 * 
	 * @return TType
	 */
	static public function TParam ($name) {
		return new TType('TParam', 6, [$name]);
	}

	/**
	 * @param object $t
	 * @param TType[]|\Array_hx $args
	 * 
	 * @return TType
	 */
	static public function TType ($t, $args) {
		return new TType('TType', 11, [$t, $args]);
	}

	/**
	 * @param string $name
	 * 
	 * @return TType
	 */
	static public function TUnresolved ($name) {
		return new TType('TUnresolved', 7, [$name]);
	}

	/**
	 * @return TType
	 */
	static public function TVoid () {
		static $inst = null;
		if (!$inst) $inst = new TType('TVoid', 1, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			12 => 'TAbstract',
			14 => 'TAnon',
			4 => 'TBool',
			5 => 'TDynamic',
			10 => 'TEnum',
			3 => 'TFloat',
			13 => 'TFun',
			9 => 'TInst',
			2 => 'TInt',
			15 => 'TLazy',
			0 => 'TMono',
			8 => 'TNull',
			6 => 'TParam',
			11 => 'TType',
			7 => 'TUnresolved',
			1 => 'TVoid',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'TAbstract' => 2,
			'TAnon' => 1,
			'TBool' => 0,
			'TDynamic' => 0,
			'TEnum' => 2,
			'TFloat' => 0,
			'TFun' => 2,
			'TInst' => 2,
			'TInt' => 0,
			'TLazy' => 1,
			'TMono' => 1,
			'TNull' => 1,
			'TParam' => 1,
			'TType' => 2,
			'TUnresolved' => 1,
			'TVoid' => 0,
		];
	}
}

Boot::registerClass(TType::class, 'hscript.TType');
