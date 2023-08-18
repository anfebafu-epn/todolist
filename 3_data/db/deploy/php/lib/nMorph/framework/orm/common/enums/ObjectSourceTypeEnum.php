<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\enums;

use \php\Boot;
use \php\_Boot\HxEnum;

class ObjectSourceTypeEnum extends HxEnum {
	/**
	 * @return ObjectSourceTypeEnum
	 */
	static public function DB () {
		static $inst = null;
		if (!$inst) $inst = new ObjectSourceTypeEnum('DB', 0, []);
		return $inst;
	}

	/**
	 * @return ObjectSourceTypeEnum
	 */
	static public function LOGIC () {
		static $inst = null;
		if (!$inst) $inst = new ObjectSourceTypeEnum('LOGIC', 1, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			0 => 'DB',
			1 => 'LOGIC',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'DB' => 0,
			'LOGIC' => 0,
		];
	}
}

Boot::registerClass(ObjectSourceTypeEnum::class, 'nMorph.framework.orm.common.enums.ObjectSourceTypeEnum');