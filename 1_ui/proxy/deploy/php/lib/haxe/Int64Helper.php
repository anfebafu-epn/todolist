<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe;

use \haxe\_Int64\___Int64;
use \php\Boot;
use \haxe\_Int32\Int32_Impl_;

/**
 * Helper for parsing to `Int64` instances.
 */
class Int64Helper {
	/**
	 * Create `Int64` from given float.
	 * 
	 * @param float $f
	 * 
	 * @return ___Int64
	 */
	public static function fromFloat ($f) {
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:80: lines 80-82
		if (\is_nan($f) || !\is_finite($f)) {
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:81: characters 4-9
			throw Exception::thrown("Number is NaN or Infinite");
		}
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:84: characters 3-33
		$noFractions = $f - fmod($f, 1);
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:90: lines 90-92
		if ($noFractions > 9007199254740991) {
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:91: characters 4-9
			throw Exception::thrown("Conversion overflow");
		}
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:93: lines 93-95
		if ($noFractions < -9007199254740991) {
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:94: characters 4-9
			throw Exception::thrown("Conversion underflow");
		}
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:97: characters 16-30
		$this1 = new ___Int64(0, 0);
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:97: characters 3-31
		$result = $this1;
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:98: characters 3-29
		$neg = $noFractions < 0;
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:99: characters 3-47
		$rest = ($neg ? -$noFractions : $noFractions);
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:101: characters 3-13
		$i = 0;
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:102: lines 102-109
		while ($rest >= 1) {
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:103: characters 4-24
			$curr = fmod($rest, 2);
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:104: characters 4-8
			$rest /= 2;
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:105: lines 105-107
			if ($curr >= 1) {
				#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 42-56
				$a_high = 0;
				$a_low = 1;
				#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 32-60
				$b = $i;
				$b &= 63;
				#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 14-61
				$b1 = null;
				#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 32-60
				if ($b === 0) {
					$this1 = new ___Int64($a_high, $a_low);
					#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 14-61
					$b1 = $this1;
				} else if ($b < 32) {
					#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 32-60
					$this2 = new ___Int64((((($a_high << $b << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits) | Boot::shiftRightUnsigned($a_low, (32 - $b))) << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits, ($a_low << $b << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits);
					#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 14-61
					$b1 = $this2;
				} else {
					#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 32-60
					$this3 = new ___Int64(($a_low << ($b - 32) << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits, 0);
					#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 14-61
					$b1 = $this3;
				}
				$high = (($result->high + $b1->high) << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
				$low = (($result->low + $b1->low) << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
				if (Int32_Impl_::ucompare($low, $result->low) < 0) {
					$ret = $high++;
					#C:\HaxeToolkit\haxe\std/haxe/Int64.hx:264: characters 4-8
					$high = ($high << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
				}
				#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:106: characters 14-61
				$this4 = new ___Int64($high, $low);
				$result = $this4;
			}
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:108: characters 4-7
			++$i;
		}
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:111: lines 111-113
		if ($neg) {
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:112: characters 13-30
			$high = (~$result->high << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
			$low = ((~$result->low + 1) << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
			if ($low === 0) {
				$ret = $high++;
				#C:\HaxeToolkit\haxe\std/haxe/Int64.hx:225: characters 4-8
				$high = ($high << Int32_Impl_::$extraBits) >> Int32_Impl_::$extraBits;
			}
			#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:112: characters 13-30
			$this1 = new ___Int64($high, $low);
			$result = $this1;
		}
		#C:\HaxeToolkit\haxe\std/haxe/Int64Helper.hx:114: characters 3-16
		return $result;
	}
}

Boot::registerClass(Int64Helper::class, 'haxe.Int64Helper');
