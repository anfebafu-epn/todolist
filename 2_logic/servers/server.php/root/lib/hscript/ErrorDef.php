<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace hscript;

use \php\Boot;
use \php\_Boot\HxEnum;

class ErrorDef extends HxEnum {
	/**
	 * @param string $msg
	 * 
	 * @return ErrorDef
	 */
	static public function ECustom ($msg) {
		return new ErrorDef('ECustom', 9, [$msg]);
	}

	/**
	 * @param string $f
	 * 
	 * @return ErrorDef
	 */
	static public function EInvalidAccess ($f) {
		return new ErrorDef('EInvalidAccess', 8, [$f]);
	}

	/**
	 * @param int $c
	 * 
	 * @return ErrorDef
	 */
	static public function EInvalidChar ($c) {
		return new ErrorDef('EInvalidChar', 0, [$c]);
	}

	/**
	 * @param string $v
	 * 
	 * @return ErrorDef
	 */
	static public function EInvalidIterator ($v) {
		return new ErrorDef('EInvalidIterator', 6, [$v]);
	}

	/**
	 * @param string $op
	 * 
	 * @return ErrorDef
	 */
	static public function EInvalidOp ($op) {
		return new ErrorDef('EInvalidOp', 7, [$op]);
	}

	/**
	 * @param string $msg
	 * 
	 * @return ErrorDef
	 */
	static public function EInvalidPreprocessor ($msg) {
		return new ErrorDef('EInvalidPreprocessor', 4, [$msg]);
	}

	/**
	 * @param string $s
	 * 
	 * @return ErrorDef
	 */
	static public function EUnexpected ($s) {
		return new ErrorDef('EUnexpected', 1, [$s]);
	}

	/**
	 * @param string $v
	 * 
	 * @return ErrorDef
	 */
	static public function EUnknownVariable ($v) {
		return new ErrorDef('EUnknownVariable', 5, [$v]);
	}

	/**
	 * @return ErrorDef
	 */
	static public function EUnterminatedComment () {
		static $inst = null;
		if (!$inst) $inst = new ErrorDef('EUnterminatedComment', 3, []);
		return $inst;
	}

	/**
	 * @return ErrorDef
	 */
	static public function EUnterminatedString () {
		static $inst = null;
		if (!$inst) $inst = new ErrorDef('EUnterminatedString', 2, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			9 => 'ECustom',
			8 => 'EInvalidAccess',
			0 => 'EInvalidChar',
			6 => 'EInvalidIterator',
			7 => 'EInvalidOp',
			4 => 'EInvalidPreprocessor',
			1 => 'EUnexpected',
			5 => 'EUnknownVariable',
			3 => 'EUnterminatedComment',
			2 => 'EUnterminatedString',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'ECustom' => 1,
			'EInvalidAccess' => 1,
			'EInvalidChar' => 1,
			'EInvalidIterator' => 1,
			'EInvalidOp' => 1,
			'EInvalidPreprocessor' => 1,
			'EUnexpected' => 1,
			'EUnknownVariable' => 1,
			'EUnterminatedComment' => 0,
			'EUnterminatedString' => 0,
		];
	}
}

Boot::registerClass(ErrorDef::class, 'hscript.ErrorDef');