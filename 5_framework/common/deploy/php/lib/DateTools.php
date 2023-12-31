<?php
/**
 * Generated by Haxe 4.2.2
 */

use \php\_Boot\HxAnon;
use \php\Boot;

/**
 * The DateTools class contains some extra functionalities for handling `Date`
 * instances and timestamps.
 * In the context of Haxe dates, a timestamp is defined as the number of
 * milliseconds elapsed since 1st January 1970.
 */
class DateTools {
	/**
	 * @var int[]|\Array_hx
	 */
	static public $DAYS_OF_MONTH;

	/**
	 * Converts a number of days to a timestamp.
	 * 
	 * @param float $n
	 * 
	 * @return float
	 */
	public static function days ($n) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:207: characters 3-41
		return $n * 24.0 * 60.0 * 60.0 * 1000.0;
	}

	/**
	 * Returns the result of adding timestamp `t` to Date `d`.
	 * This is a convenience function for calling
	 * `Date.fromTime(d.getTime() + t)`.
	 * 
	 * @param \Date $d
	 * @param float $t
	 * 
	 * @return \Date
	 */
	public static function delta ($d, $t) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:161: characters 3-40
		return \Date::fromTime($d->getTime() + $t);
	}

	/**
	 * Format the date `d` according to the format `f`. The format is
	 * compatible with the `strftime` standard format, except that there is no
	 * support in Flash and JS for day and months names (due to lack of proper
	 * internationalization API). On Haxe/Neko/Windows, some formats are not
	 * supported.
	 * ```haxe
	 * var t = DateTools.format(Date.now(), "%Y-%m-%d_%H:%M:%S");
	 * // 2016-07-08_14:44:05
	 * var t = DateTools.format(Date.now(), "%r");
	 * // 02:44:05 PM
	 * var t = DateTools.format(Date.now(), "%T");
	 * // 14:44:05
	 * var t = DateTools.format(Date.now(), "%F");
	 * // 2016-07-08
	 * ```
	 * 
	 * @param \Date $d
	 * @param string $f
	 * 
	 * @return string
	 */
	public static function format ($d, $f) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:148: characters 3-71
		return strftime($f, (int)($d->__t));
	}

	/**
	 * Returns the number of days in the month of Date `d`.
	 * This method handles leap years.
	 * 
	 * @param \Date $d
	 * 
	 * @return int
	 */
	public static function getMonthDays ($d) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:172: characters 3-28
		$month = $d->getMonth();
		#C:\HaxeToolkit\haxe\std/DateTools.hx:173: characters 3-30
		$year = $d->getFullYear();
		#C:\HaxeToolkit\haxe\std/DateTools.hx:175: lines 175-176
		if ($month !== 1) {
			#C:\HaxeToolkit\haxe\std/DateTools.hx:176: characters 4-31
			return (DateTools::$DAYS_OF_MONTH->arr[$month] ?? null);
		}
		#C:\HaxeToolkit\haxe\std/DateTools.hx:178: characters 3-73
		$isB = ((($year % 4) === 0) && (($year % 100) !== 0)) || (($year % 400) === 0);
		#C:\HaxeToolkit\haxe\std/DateTools.hx:179: characters 10-29
		if ($isB) {
			#C:\HaxeToolkit\haxe\std/DateTools.hx:179: characters 19-21
			return 29;
		} else {
			#C:\HaxeToolkit\haxe\std/DateTools.hx:179: characters 27-29
			return 28;
		}
	}

	/**
	 * Converts a number of hours to a timestamp.
	 * 
	 * @param float $n
	 * 
	 * @return float
	 */
	public static function hours ($n) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:200: characters 3-34
		return $n * 60.0 * 60.0 * 1000.0;
	}

	/**
	 * Build a date-time from several components
	 * 
	 * @param object $o
	 * 
	 * @return float
	 */
	public static function make ($o) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:236: characters 3-93
		return $o->ms + 1000.0 * ($o->seconds + 60.0 * ($o->minutes + 60.0 * ($o->hours + 24.0 * $o->days)));
	}

	/**
	 * Retrieve Unix timestamp value from Date components. Takes same argument sequence as the Date constructor.
	 * 
	 * @param int $year
	 * @param int $month
	 * @param int $day
	 * @param int $hour
	 * @param int $min
	 * @param int $sec
	 * 
	 * @return float
	 */
	public static function makeUtc ($year, $month, $day, $hour, $min, $sec) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:247: characters 3-74
		return gmmktime($hour, $min, $sec, $month + 1, $day, $year) * 1000;
	}

	/**
	 * Converts a number of minutes to a timestamp.
	 * 
	 * @param float $n
	 * 
	 * @return float
	 */
	public static function minutes ($n) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:193: characters 3-27
		return $n * 60.0 * 1000.0;
	}

	/**
	 * Separate a date-time into several components
	 * 
	 * @param float $t
	 * 
	 * @return object
	 */
	public static function parse ($t) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:214: characters 3-20
		$s = $t / 1000;
		#C:\HaxeToolkit\haxe\std/DateTools.hx:215: characters 3-18
		$m = $s / 60;
		#C:\HaxeToolkit\haxe\std/DateTools.hx:216: characters 3-18
		$h = $m / 60;
		#C:\HaxeToolkit\haxe\std/DateTools.hx:219: characters 13-28
		$tmp = (int)((fmod($s, 60)));
		#C:\HaxeToolkit\haxe\std/DateTools.hx:220: characters 13-28
		$tmp1 = (int)((fmod($m, 60)));
		#C:\HaxeToolkit\haxe\std/DateTools.hx:221: characters 11-26
		$tmp2 = (int)((fmod($h, 24)));
		#C:\HaxeToolkit\haxe\std/DateTools.hx:217: lines 217-223
		return new _HxAnon_DateTools0(fmod($t, 1000), $tmp, $tmp1, $tmp2, (int)(($h / 24)));
	}

	/**
	 * Converts a number of seconds to a timestamp.
	 * 
	 * @param float $n
	 * 
	 * @return float
	 */
	public static function seconds ($n) {
		#C:\HaxeToolkit\haxe\std/DateTools.hx:186: characters 3-20
		return $n * 1000.0;
	}

	/**
	 * @internal
	 * @access private
	 */
	static public function __hx__init ()
	{
		static $called = false;
		if ($called) return;
		$called = true;


		self::$DAYS_OF_MONTH = \Array_hx::wrap([
			31,
			28,
			31,
			30,
			31,
			30,
			31,
			31,
			30,
			31,
			30,
			31,
		]);
	}
}

class _HxAnon_DateTools0 extends HxAnon {
	function __construct($ms, $seconds, $minutes, $hours, $days) {
		$this->ms = $ms;
		$this->seconds = $seconds;
		$this->minutes = $minutes;
		$this->hours = $hours;
		$this->days = $days;
	}
}

Boot::registerClass(DateTools::class, 'DateTools');
DateTools::__hx__init();
