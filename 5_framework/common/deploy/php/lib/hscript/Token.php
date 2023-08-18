<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace hscript;

use \php\Boot;
use \php\_Boot\HxEnum;

class Token extends HxEnum {
	/**
	 * @return Token
	 */
	static public function TBkClose () {
		static $inst = null;
		if (!$inst) $inst = new Token('TBkClose', 12, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TBkOpen () {
		static $inst = null;
		if (!$inst) $inst = new Token('TBkOpen', 11, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TBrClose () {
		static $inst = null;
		if (!$inst) $inst = new Token('TBrClose', 7, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TBrOpen () {
		static $inst = null;
		if (!$inst) $inst = new Token('TBrOpen', 6, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TComma () {
		static $inst = null;
		if (!$inst) $inst = new Token('TComma', 9, []);
		return $inst;
	}

	/**
	 * @param Const_hx $c
	 * 
	 * @return Token
	 */
	static public function TConst ($c) {
		return new Token('TConst', 1, [$c]);
	}

	/**
	 * @return Token
	 */
	static public function TDot () {
		static $inst = null;
		if (!$inst) $inst = new Token('TDot', 8, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TDoubleDot () {
		static $inst = null;
		if (!$inst) $inst = new Token('TDoubleDot', 14, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TEof () {
		static $inst = null;
		if (!$inst) $inst = new Token('TEof', 0, []);
		return $inst;
	}

	/**
	 * @param string $s
	 * 
	 * @return Token
	 */
	static public function TId ($s) {
		return new Token('TId', 2, [$s]);
	}

	/**
	 * @param string $s
	 * 
	 * @return Token
	 */
	static public function TMeta ($s) {
		return new Token('TMeta', 15, [$s]);
	}

	/**
	 * @param string $s
	 * 
	 * @return Token
	 */
	static public function TOp ($s) {
		return new Token('TOp', 3, [$s]);
	}

	/**
	 * @return Token
	 */
	static public function TPClose () {
		static $inst = null;
		if (!$inst) $inst = new Token('TPClose', 5, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TPOpen () {
		static $inst = null;
		if (!$inst) $inst = new Token('TPOpen', 4, []);
		return $inst;
	}

	/**
	 * @param string $s
	 * 
	 * @return Token
	 */
	static public function TPrepro ($s) {
		return new Token('TPrepro', 16, [$s]);
	}

	/**
	 * @return Token
	 */
	static public function TQuestion () {
		static $inst = null;
		if (!$inst) $inst = new Token('TQuestion', 13, []);
		return $inst;
	}

	/**
	 * @return Token
	 */
	static public function TSemicolon () {
		static $inst = null;
		if (!$inst) $inst = new Token('TSemicolon', 10, []);
		return $inst;
	}

	/**
	 * Returns array of (constructorIndex => constructorName)
	 *
	 * @return string[]
	 */
	static public function __hx__list () {
		return [
			12 => 'TBkClose',
			11 => 'TBkOpen',
			7 => 'TBrClose',
			6 => 'TBrOpen',
			9 => 'TComma',
			1 => 'TConst',
			8 => 'TDot',
			14 => 'TDoubleDot',
			0 => 'TEof',
			2 => 'TId',
			15 => 'TMeta',
			3 => 'TOp',
			5 => 'TPClose',
			4 => 'TPOpen',
			16 => 'TPrepro',
			13 => 'TQuestion',
			10 => 'TSemicolon',
		];
	}

	/**
	 * Returns array of (constructorName => parametersCount)
	 *
	 * @return int[]
	 */
	static public function __hx__paramsCount () {
		return [
			'TBkClose' => 0,
			'TBkOpen' => 0,
			'TBrClose' => 0,
			'TBrOpen' => 0,
			'TComma' => 0,
			'TConst' => 1,
			'TDot' => 0,
			'TDoubleDot' => 0,
			'TEof' => 0,
			'TId' => 1,
			'TMeta' => 1,
			'TOp' => 1,
			'TPClose' => 0,
			'TPOpen' => 0,
			'TPrepro' => 1,
			'TQuestion' => 0,
			'TSemicolon' => 0,
		];
	}
}

Boot::registerClass(Token::class, 'hscript.Token');
