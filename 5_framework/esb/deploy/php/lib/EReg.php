<?php
/**
 * Generated by Haxe 4.2.2
 */

use \php\_Boot\HxAnon;
use \php\Boot;
use \haxe\Exception as HaxeException;

/**
 * The EReg class represents regular expressions.
 * While basic usage and patterns consistently work across platforms, some more
 * complex operations may yield different results. This is a necessary trade-
 * off to retain a certain level of performance.
 * EReg instances can be created by calling the constructor, or with the
 * special syntax `~/pattern/modifier`
 * EReg instances maintain an internal state, which is affected by several of
 * its methods.
 * A detailed explanation of the supported operations is available at
 * <https://haxe.org/manual/std-regex.html>
 */
final class EReg {
	/**
	 * @var bool
	 */
	public $global;
	/**
	 * @var string
	 */
	public $last;
	/**
	 * @var mixed[]
	 */
	public $matches;
	/**
	 * @var string
	 */
	public $options;
	/**
	 * @var string
	 */
	public $pattern;
	/**
	 * @var mixed
	 */
	public $r;
	/**
	 * @var string
	 */
	public $re;

	/**
	 * Escape the string `s` for use as a part of regular expression.
	 * If `s` is null, the result is unspecified.
	 * 
	 * @param string $s
	 * 
	 * @return string
	 */
	public static function escape ($s) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:173: characters 3-30
		return preg_quote($s);
	}

	/**
	 * Creates a new regular expression with pattern `r` and modifiers `opt`.
	 * This is equivalent to the shorthand syntax `~/r/opt`
	 * If `r` or `opt` are null, the result is unspecified.
	 * 
	 * @param string $r
	 * @param string $opt
	 * 
	 * @return void
	 */
	public function __construct ($r, $opt) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:37: characters 3-19
		$this->pattern = $r;
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:38: characters 3-45
		$this->options = str_replace("g", "", $opt);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:39: characters 3-26
		$this->global = $this->options !== $opt;
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:40: characters 3-49
		$this->options = str_replace("u", "", $this->options);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:41: characters 3-68
		$this->re = "\"" . (str_replace("\"", "\\\"", $r)??'null') . "\"" . ($this->options??'null');
	}

	/**
	 * @return string
	 */
	public function get_reUnicode () {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:177: characters 10-32
		return ($this->re . "u");
	}

	/**
	 * @return void
	 */
	public function handlePregError () {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:63: characters 3-36
		$e = preg_last_error();
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:64: lines 64-72
		if ($e === PREG_INTERNAL_ERROR) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:65: characters 4-9
			throw HaxeException::thrown("EReg: internal PCRE error");
		} else if ($e === PREG_BACKTRACK_LIMIT_ERROR) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:67: characters 4-9
			throw HaxeException::thrown("EReg: backtrack limit");
		} else if ($e === PREG_RECURSION_LIMIT_ERROR) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:69: characters 4-9
			throw HaxeException::thrown("EReg: recursion limit");
		} else if ($e === PREG_JIT_STACKLIMIT_ERROR) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:71: characters 4-9
			throw HaxeException::thrown("failed due to limited JIT stack space");
		}
	}

	/**
	 * Calls the function `f` for the substring of `s` which `this` EReg matches
	 * and replaces that substring with the result of `f` call.
	 * The `f` function takes `this` EReg object as its first argument and should
	 * return a replacement string for the substring matched.
	 * If `this` EReg does not match any substring, the result is `s`.
	 * By default, this method replaces only the first matched substring. If
	 * the global g modifier is in place, all matched substrings are replaced.
	 * If `s` or `f` are null, the result is unspecified.
	 * 
	 * @param string $s
	 * @param \Closure $f
	 * 
	 * @return string
	 */
	public function map ($s, $f) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:151: characters 7-26
		$p = preg_match(($this->re . "u"), $s, $this->matches, PREG_OFFSET_CAPTURE, 0);
		if ($p === false) {
			$this->handlePregError();
			$p = preg_match($this->re, $s, $this->matches, PREG_OFFSET_CAPTURE);
		}
		if ($p > 0) {
			$this->last = $s;
		} else {
			$this->last = null;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:151: lines 151-153
		if ($p <= 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:152: characters 4-12
			return $s;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:154: characters 3-19
		$result = "";
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:155: characters 3-23
		$bytesOffset = 0;
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:156: characters 3-37
		$bytesTotal = strlen($s);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:157: lines 157-167
		while (true) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:158: characters 4-72
			$result = ($result??'null') . (substr($s, $bytesOffset, $this->matches[0][1] - $bytesOffset)??'null');
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:159: characters 4-21
			$result = ($result??'null') . ($f($this)??'null');
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:160: characters 4-31
			$bytesOffset = $this->matches[0][1];
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:161: lines 161-166
			if ($this->matches[0][0] === "") {
				#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:162: characters 5-68
				$result = ($result??'null') . (mb_substr(substr($s, $bytesOffset), 0, 1)??'null');
				#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:163: characters 5-18
				++$bytesOffset;
			} else {
				#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:165: characters 5-48
				$bytesOffset += strlen($this->matches[0][0]);
			}
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:167: characters 11-78
			$tmp = null;
			if ($this->global && ($bytesOffset < $bytesTotal)) {
				#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:167: characters 49-78
				$p = preg_match(($this->re . "u"), $s, $this->matches, PREG_OFFSET_CAPTURE, $bytesOffset);
				if ($p === false) {
					$this->handlePregError();
					$p = preg_match($this->re, $s, $this->matches, PREG_OFFSET_CAPTURE);
				}
				if ($p > 0) {
					$this->last = $s;
				} else {
					$this->last = null;
				}
				#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:167: characters 11-78
				$tmp = $p > 0;
			} else {
				$tmp = false;
			}
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:157: lines 157-167
			if (!$tmp) {
				break;
			}
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:168: characters 3-42
		$result = ($result??'null') . (substr($s, $bytesOffset)??'null');
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:169: characters 3-16
		return $result;
	}

	/**
	 * Tells if `this` regular expression matches String `s`.
	 * This method modifies the internal state.
	 * If `s` is `null`, the result is unspecified.
	 * 
	 * @param string $s
	 * 
	 * @return bool
	 */
	public function match ($s) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:45: characters 10-29
		$p = preg_match(($this->re . "u"), $s, $this->matches, PREG_OFFSET_CAPTURE, 0);
		if ($p === false) {
			$this->handlePregError();
			$p = preg_match($this->re, $s, $this->matches, PREG_OFFSET_CAPTURE);
		}
		if ($p > 0) {
			$this->last = $s;
		} else {
			$this->last = null;
		}
		return $p > 0;
	}

	/**
	 * @param string $s
	 * @param int $bytesOffset
	 * 
	 * @return bool
	 */
	public function matchFromByte ($s, $bytesOffset) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:49: characters 3-92
		$p = preg_match(($this->re . "u"), $s, $this->matches, PREG_OFFSET_CAPTURE, $bytesOffset);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:50: lines 50-53
		if ($p === false) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:51: characters 4-21
			$this->handlePregError();
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:52: characters 4-68
			$p = preg_match($this->re, $s, $this->matches, PREG_OFFSET_CAPTURE);
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:54: lines 54-58
		if ($p > 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:55: characters 4-12
			$this->last = $s;
		} else {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:57: characters 4-15
			$this->last = null;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:59: characters 3-23
		return $p > 0;
	}

	/**
	 * Tells if `this` regular expression matches a substring of String `s`.
	 * This function expects `pos` and `len` to describe a valid substring of
	 * `s`, or else the result is unspecified. To get more robust behavior,
	 * `this.match(s.substr(pos,len))` can be used instead.
	 * This method modifies the internal state.
	 * If `s` is null, the result is unspecified.
	 * 
	 * @param string $s
	 * @param int $pos
	 * @param int $len
	 * 
	 * @return bool
	 */
	public function matchSub ($s, $pos, $len = -1) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:112: lines 112-125
		if ($len === null) {
			$len = -1;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:113: characters 3-54
		$subject = ($len < 0 ? $s : mb_substr($s, 0, $pos + $len));
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:114: characters 3-90
		$p = preg_match(($this->re . "u"), $subject, $this->matches, PREG_OFFSET_CAPTURE, $pos);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:115: lines 115-118
		if ($p === false) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:116: characters 4-21
			$this->handlePregError();
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:117: characters 4-79
			$p = preg_match($this->re, $subject, $this->matches, PREG_OFFSET_CAPTURE, $pos);
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:119: lines 119-123
		if ($p > 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:120: characters 4-12
			$this->last = $s;
		} else {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:122: characters 4-15
			$this->last = null;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:124: characters 3-23
		return $p > 0;
	}

	/**
	 * Returns the matched sub-group `n` of `this` EReg.
	 * This method should only be called after `this.match` or
	 * `this.matchSub`, and then operates on the String of that operation.
	 * The index `n` corresponds to the n-th set of parentheses in the pattern
	 * of `this` EReg. If no such sub-group exists, the result is unspecified.
	 * If `n` equals 0, the whole matched substring is returned.
	 * 
	 * @param int $n
	 * 
	 * @return string
	 */
	public function matched ($n) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:81: lines 81-82
		if (($this->matches === null) || ($n < 0)) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:82: characters 4-9
			throw HaxeException::thrown("EReg::matched");
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:85: lines 85-86
		if ($n >= count($this->matches)) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:86: characters 4-15
			return null;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:87: lines 87-88
		if ($this->matches[$n][1] < 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:88: characters 4-15
			return null;
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:89: characters 3-23
		return $this->matches[$n][0];
	}

	/**
	 * Returns the part to the left of the last matched substring.
	 * If the most recent call to `this.match` or `this.matchSub` did not
	 * match anything, the result is unspecified.
	 * If the global g modifier was in place for the matching, only the
	 * substring to the left of the leftmost match is returned.
	 * The result does not include the matched part.
	 * 
	 * @return string
	 */
	public function matchedLeft () {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:93: lines 93-94
		if (count($this->matches) === 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:94: characters 4-9
			throw HaxeException::thrown("No string matched");
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:95: characters 3-47
		return substr($this->last, 0, $this->matches[0][1]);
	}

	/**
	 * Returns the position and length of the last matched substring, within
	 * the String which was last used as argument to `this.match` or
	 * `this.matchSub`.
	 * If the most recent call to `this.match` or `this.matchSub` did not
	 * match anything, the result is unspecified.
	 * If the global g modifier was in place for the matching, the position and
	 * length of the leftmost substring is returned.
	 * 
	 * @return object
	 */
	public function matchedPos () {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:107: characters 9-64
		$tmp = mb_strlen(substr($this->last, 0, $this->matches[0][1]));
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:106: lines 106-109
		return new _HxAnon_EReg0($tmp, mb_strlen($this->matches[0][0]));
	}

	/**
	 * Returns the part to the right of the last matched substring.
	 * If the most recent call to `this.match` or `this.matchSub` did not
	 * match anything, the result is unspecified.
	 * If the global g modifier was in place for the matching, only the
	 * substring to the right of the leftmost match is returned.
	 * The result does not include the matched part.
	 * 
	 * @return string
	 */
	public function matchedRight () {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:99: lines 99-100
		if (count($this->matches) === 0) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:100: characters 4-9
			throw HaxeException::thrown("No string matched");
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:101: characters 3-68
		$x = $this->matches[0][1] + strlen($this->matches[0][0]);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:102: characters 3-32
		return substr($this->last, $x);
	}

	/**
	 * Replaces the first substring of `s` which `this` EReg matches with `by`.
	 * If `this` EReg does not match any substring, the result is `s`.
	 * By default, this method replaces only the first matched substring. If
	 * the global g modifier is in place, all matched substrings are replaced.
	 * If `by` contains `$1` to `$9`, the digit corresponds to number of a
	 * matched sub-group and its value is used instead. If no such sub-group
	 * exists, the replacement is unspecified. The string `$$` becomes `$`.
	 * If `s` or `by` are null, the result is unspecified.
	 * 
	 * @param string $s
	 * @param string $by
	 * 
	 * @return string
	 */
	public function replace ($s, $by) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:137: characters 3-46
		$by = str_replace("\\\$", "\\\\\$", $by);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:138: characters 3-43
		$by = str_replace("\$\$", "\\\$", $by);
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:139: lines 139-141
		if (!preg_match("/\\\\([^?].*?\\\\)/", $this->re)) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:140: characters 4-57
			$by = preg_replace("/\\\$(\\d+)/", "\\\$\\1", $by);
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:142: characters 3-71
		$result = preg_replace(($this->re . "u"), $by, $s, ($this->global ? -1 : 1));
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:143: lines 143-146
		if ($result === null) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:144: characters 4-21
			$this->handlePregError();
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:145: characters 4-60
			$result = preg_replace($this->re, $by, $s, ($this->global ? -1 : 1));
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:147: characters 3-16
		return $result;
	}

	/**
	 * Splits String `s` at all substrings `this` EReg matches.
	 * If a match is found at the start of `s`, the result contains a leading
	 * empty String "" entry.
	 * If a match is found at the end of `s`, the result contains a trailing
	 * empty String "" entry.
	 * If two matching substrings appear next to each other, the result
	 * contains the empty String `""` between them.
	 * By default, this method splits `s` into two parts at the first matched
	 * substring. If the global g modifier is in place, `s` is split at each
	 * matched substring.
	 * If `s` is null, the result is unspecified.
	 * 
	 * @param string $s
	 * 
	 * @return string[]|\Array_hx
	 */
	public function split ($s) {
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:128: characters 3-96
		$parts = preg_split(($this->re . "u"), $s, ($this->global ? -1 : 2));
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:129: lines 129-132
		if ($parts === false) {
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:130: characters 4-21
			$this->handlePregError();
			#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:131: characters 4-55
			$parts = preg_split($this->re, $s, ($this->global ? -1 : 2));
		}
		#C:\HaxeToolkit\haxe\std/php/_std/EReg.hx:133: characters 3-48
		return \Array_hx::wrap($parts);
	}
}

class _HxAnon_EReg0 extends HxAnon {
	function __construct($pos, $len) {
		$this->pos = $pos;
		$this->len = $len;
	}
}

Boot::registerClass(EReg::class, 'EReg');
Boot::registerGetters('EReg', [
	'reUnicode' => true
]);
