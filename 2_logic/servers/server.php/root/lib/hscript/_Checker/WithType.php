<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace hscript\_Checker;

use \php\Boot;
use \hscript\TType;
use \php\_Boot\HxEnum;

class WithType extends HxEnum {
	/**
	 * @return WithType
	 */
	static public function NoValue () {
		static $inst = null;
		if (!$inst) $inst = new WithType('NoValue', 0, []);
		return $inst;
	}

	/**
	 * @return WithType
	 */
	static public function Value () {
		static $inst = null;
		if (!$inst) $inst = new WithType('Value', 1, []);
		return $inst;
	}

	/**
	 * @param TType $t
	 * 
	 * @return WithType
	 */
	static public function WithType ($t) {
		return new WithType('WithType', 2, [$t]);
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			0 => 'NoValue',
			1 => 'Value',
			2 => 'WithType',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'NoValue' => 0,
			'Value' => 0,
			'WithType' => 1,
		];
	}
}

Boot::registerClass(WithType::class, 'hscript._Checker.WithType');