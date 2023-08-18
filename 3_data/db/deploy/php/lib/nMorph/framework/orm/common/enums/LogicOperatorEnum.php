<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\enums;

use \php\Boot;
use \php\_Boot\HxEnum;

class LogicOperatorEnum extends HxEnum {
	/**
	 * @return LogicOperatorEnum
	 */
	static public function AND () {
		static $inst = null;
		if (!$inst) $inst = new LogicOperatorEnum('AND', 1, []);
		return $inst;
	}

	/**
	 * @return LogicOperatorEnum
	 */
	static public function OR () {
		static $inst = null;
		if (!$inst) $inst = new LogicOperatorEnum('OR', 2, []);
		return $inst;
	}

	/**
	 * @return LogicOperatorEnum
	 */
	static public function START () {
		static $inst = null;
		if (!$inst) $inst = new LogicOperatorEnum('START', 0, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			1 => 'AND',
			2 => 'OR',
			0 => 'START',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'AND' => 0,
			'OR' => 0,
			'START' => 0,
		];
	}
}

Boot::registerClass(LogicOperatorEnum::class, 'nMorph.framework.orm.common.enums.LogicOperatorEnum');