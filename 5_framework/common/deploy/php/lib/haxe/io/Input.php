<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe\io;

use \php\_Boot\HxAnon;
use \php\Boot;
use \haxe\Exception;
use \php\_Boot\HxString;
use \haxe\exceptions\NotImplementedException;
use \haxe\NativeStackTrace;

/**
 * An Input is an abstract reader. See other classes in the `haxe.io` package
 * for several possible implementations.
 * All functions which read data throw `Eof` when the end of the stream
 * is reached.
 */
class Input {
	/**
	 * @var bool
	 * Endianness (word byte order) used when reading numbers.
	 * If `true`, big-endian is used, otherwise `little-endian` is used.
	 */
	public $bigEndian;

	/**
	 * Close the input source.
	 * Behaviour while reading after calling this method is unspecified.
	 * 
	 * @return void
	 */
	public function close () {
	}

	/**
	 * Read and return `nbytes` bytes.
	 * 
	 * @param int $nbytes
	 * 
	 * @return Bytes
	 */
	public function read ($nbytes) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:146: characters 3-31
		$s = Bytes::alloc($nbytes);
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:147: characters 3-13
		$p = 0;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:148: lines 148-154
		while ($nbytes > 0) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:149: characters 4-36
			$k = $this->readBytes($s, $p, $nbytes);
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:150: lines 150-151
			if ($k === 0) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:151: characters 5-10
				throw Exception::thrown(Error::Blocked());
			}
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:152: characters 4-10
			$p += $k;
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:153: characters 4-15
			$nbytes -= $k;
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:155: characters 3-11
		return $s;
	}

	/**
	 * Read and return all available data.
	 * The `bufsize` optional argument specifies the size of chunks by
	 * which data is read. Its default value is target-specific.
	 * 
	 * @param int $bufsize
	 * 
	 * @return Bytes
	 */
	public function readAll ($bufsize = null) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:107: lines 107-109
		if ($bufsize === null) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:109: characters 4-11
			$bufsize = 8192;
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:114: characters 3-34
		$buf = Bytes::alloc($bufsize);
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:115: characters 3-41
		$total = new BytesBuffer();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:116: lines 116-123
		try {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:117: lines 117-122
			while (true) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:118: characters 5-42
				$len = $this->readBytes($buf, 0, $bufsize);
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:119: lines 119-120
				if ($len === 0) {
					#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:120: characters 6-11
					throw Exception::thrown(Error::Blocked());
				}
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:121: characters 5-32
				if (($len < 0) || ($len > $buf->length)) {
					throw Exception::thrown(Error::OutsideBounds());
				} else {
					$left = $total->b;
					$this_s = \substr($buf->b->s, 0, $len);
					$total->b = ($left . $this_s);
				}
			}
		} catch(\Throwable $_g) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:123: characters 12-13
			NativeStackTrace::saveStack($_g);
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:116: lines 116-123
			if (!(Exception::caught($_g)->unwrap() instanceof Eof)) {
				throw $_g;
			}
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:124: characters 3-26
		return $total->getBytes();
	}

	/**
	 * Read and return one byte.
	 * 
	 * @return int
	 */
	public function readByte () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:53: characters 10-15
		throw new NotImplementedException(null, null, new _HxAnon_Input0("haxe/io/Input.hx", 53, "haxe.io.Input", "readByte"));
	}

	/**
	 * Read `len` bytes and write them into `s` to the position specified by `pos`.
	 * Returns the actual length of read data that can be smaller than `len`.
	 * See `readFullBytes` that tries to read the exact amount of specified bytes.
	 * 
	 * @param Bytes $s
	 * @param int $pos
	 * @param int $len
	 * 
	 * @return int
	 */
	public function readBytes ($s, $pos, $len) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:65: characters 3-15
		$k = $len;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:66: characters 3-69
		$b = $s->b;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:67: lines 67-68
		if (($pos < 0) || ($len < 0) || (($pos + $len) > $s->length)) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:68: characters 4-9
			throw Exception::thrown(Error::OutsideBounds());
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:69: lines 69-83
		try {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:70: lines 70-82
			while ($k > 0) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:74: characters 5-27
				$val = $this->readByte();
				$b->s[$pos] = \chr($val);
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:80: characters 5-10
				++$pos;
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:81: characters 5-8
				--$k;
			}
		} catch(\Throwable $_g) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:83: characters 12-15
			NativeStackTrace::saveStack($_g);
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:69: lines 69-83
			if (!(Exception::caught($_g)->unwrap() instanceof Eof)) {
				throw $_g;
			}
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:84: characters 3-17
		return $len - $k;
	}

	/**
	 * Read a 64-bit double-precision floating point number.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return float
	 */
	public function readDouble () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:209: characters 3-24
		$i1 = $this->readInt32();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:210: characters 3-24
		$i2 = $this->readInt32();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:211: characters 10-81
		if ($this->bigEndian) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:211: characters 22-50
			return \unpack("d", \pack("ii", (FPHelper::$isLittleEndian ? $i2 : $i1), (FPHelper::$isLittleEndian ? $i1 : $i2)))[1];
		} else {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:211: characters 53-81
			return \unpack("d", \pack("ii", (FPHelper::$isLittleEndian ? $i1 : $i2), (FPHelper::$isLittleEndian ? $i2 : $i1)))[1];
		}
	}

	/**
	 * Read a 32-bit floating point number.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return float
	 */
	public function readFloat () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:200: characters 10-42
		return \unpack("f", \pack("l", $this->readInt32()))[1];
	}

	/**
	 * Read `len` bytes and write them into `s` to the position specified by `pos`.
	 * Unlike `readBytes`, this method tries to read the exact `len` amount of bytes.
	 * 
	 * @param Bytes $s
	 * @param int $pos
	 * @param int $len
	 * 
	 * @return void
	 */
	public function readFullBytes ($s, $pos, $len) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:133: lines 133-139
		while ($len > 0) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:134: characters 4-35
			$k = $this->readBytes($s, $pos, $len);
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:135: lines 135-136
			if ($k === 0) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:136: characters 5-10
				throw Exception::thrown(Error::Blocked());
			}
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:137: characters 4-12
			$pos += $k;
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:138: characters 4-12
			$len -= $k;
		}
	}

	/**
	 * Read a 16-bit signed integer.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return int
	 */
	public function readInt16 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:230: characters 3-24
		$ch1 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:231: characters 3-24
		$ch2 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:232: characters 3-59
		$n = ($this->bigEndian ? $ch2 | ($ch1 << 8) : $ch1 | ($ch2 << 8));
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:233: lines 233-234
		if (($n & 32768) !== 0) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:234: characters 4-22
			return $n - 65536;
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:235: characters 3-11
		return $n;
	}

	/**
	 * Read a 24-bit signed integer.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return int
	 */
	public function readInt24 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:255: characters 3-24
		$ch1 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:256: characters 3-24
		$ch2 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:257: characters 3-24
		$ch3 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:258: characters 3-87
		$n = ($this->bigEndian ? $ch3 | ($ch2 << 8) | ($ch1 << 16) : $ch1 | ($ch2 << 8) | ($ch3 << 16));
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:259: lines 259-260
		if (($n & 8388608) !== 0) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:260: characters 4-24
			return $n - 16777216;
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:261: characters 3-11
		return $n;
	}

	/**
	 * Read a 32-bit signed integer.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return int
	 */
	public function readInt32 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:282: characters 3-24
		$ch1 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:283: characters 3-24
		$ch2 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:284: characters 3-24
		$ch3 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:285: characters 3-24
		$ch4 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:288: characters 3-115
		$n = ($this->bigEndian ? $ch4 | ($ch3 << 8) | ($ch2 << 16) | ($ch1 << 24) : $ch1 | ($ch2 << 8) | ($ch3 << 16) | ($ch4 << 24));
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:289: lines 289-292
		if (($n & ((int)-2147483648)) !== 0) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:290: characters 4-27
			return $n | ((int)-2147483648);
		} else {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:292: characters 4-12
			return $n;
		}
	}

	/**
	 * Read a 8-bit signed integer.
	 * 
	 * @return int
	 */
	public function readInt8 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:218: characters 3-22
		$n = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:219: lines 219-220
		if ($n >= 128) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:220: characters 4-18
			return $n - 256;
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:221: characters 3-11
		return $n;
	}

	/**
	 * Read a line of text separated by CR and/or LF bytes.
	 * The CR/LF characters are not included in the resulting string.
	 * 
	 * @return string
	 */
	public function readLine () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:177: characters 3-31
		$buf = new BytesBuffer();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:178: characters 3-16
		$last = null;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:179: characters 3-9
		$s = null;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:180: lines 180-190
		try {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:181: lines 181-182
			while (true) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:181: characters 11-30
				$last = $this->readByte();
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:181: lines 181-182
				if (!($last !== 10)) {
					break;
				}
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:182: characters 5-22
				$buf->b = ($buf->b . \chr($last));
			}
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:183: characters 4-33
			$s = $buf->getBytes()->toString();
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:184: lines 184-185
			if (HxString::charCodeAt($s, mb_strlen($s) - 1) === 13) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:185: characters 5-24
				$s = \mb_substr($s, 0, -1);
			}
		} catch(\Throwable $_g) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:186: characters 12-13
			NativeStackTrace::saveStack($_g);
			$_g1 = Exception::caught($_g)->unwrap();
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:180: lines 180-190
			if (($_g1 instanceof Eof)) {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:186: characters 12-13
				$e = $_g1;
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:187: characters 4-33
				$s = $buf->getBytes()->toString();
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:188: lines 188-189
				if (mb_strlen($s) === 0) {
					#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:189: characters 37-42
					throw Exception::thrown($e);
				}
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:180: lines 180-190
				throw $_g;
			}
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:191: characters 3-11
		return $s;
	}

	/**
	 * Read and `len` bytes as a string.
	 * 
	 * @param int $len
	 * @param Encoding $encoding
	 * 
	 * @return string
	 */
	public function readString ($len, $encoding = null) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:305: characters 3-28
		$b = Bytes::alloc($len);
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:306: characters 3-27
		$this->readFullBytes($b, 0, $len);
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:310: characters 10-39
		$tmp = null;
		if (($len < 0) || ($len > $b->length)) {
			throw Exception::thrown(Error::OutsideBounds());
		} else {
			$tmp = \substr($b->b->s, 0, $len);
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:310: characters 3-39
		return $tmp;
	}

	/**
	 * Read a 16-bit unsigned integer.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return int
	 */
	public function readUInt16 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:244: characters 3-24
		$ch1 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:245: characters 3-24
		$ch2 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:246: characters 10-57
		if ($this->bigEndian) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:246: characters 22-38
			return $ch2 | ($ch1 << 8);
		} else {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:246: characters 41-57
			return $ch1 | ($ch2 << 8);
		}
	}

	/**
	 * Read a 24-bit unsigned integer.
	 * Endianness is specified by the `bigEndian` property.
	 * 
	 * @return int
	 */
	public function readUInt24 () {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:270: characters 3-24
		$ch1 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:271: characters 3-24
		$ch2 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:272: characters 3-24
		$ch3 = $this->readByte();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:273: characters 10-85
		if ($this->bigEndian) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:273: characters 22-52
			return $ch3 | ($ch2 << 8) | ($ch1 << 16);
		} else {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:273: characters 55-85
			return $ch1 | ($ch2 << 8) | ($ch3 << 16);
		}
	}

	/**
	 * Read a string until a character code specified by `end` is occurred.
	 * The final character is not included in the resulting string.
	 * 
	 * @param int $end
	 * 
	 * @return string
	 */
	public function readUntil ($end) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:164: characters 3-31
		$buf = new BytesBuffer();
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:165: characters 3-16
		$last = null;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:166: lines 166-167
		while (true) {
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:166: characters 10-29
			$last = $this->readByte();
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:166: lines 166-167
			if (!($last !== $end)) {
				break;
			}
			#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:167: characters 4-21
			$buf->b = ($buf->b . \chr($last));
		}
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:168: characters 3-35
		return $buf->getBytes()->toString();
	}

	/**
	 * @param bool $b
	 * 
	 * @return bool
	 */
	public function set_bigEndian ($b) {
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:95: characters 3-16
		$this->bigEndian = $b;
		#C:\HaxeToolkit\haxe\std/haxe/io/Input.hx:96: characters 3-11
		return $b;
	}
}

class _HxAnon_Input0 extends HxAnon {
	function __construct($fileName, $lineNumber, $className, $methodName) {
		$this->fileName = $fileName;
		$this->lineNumber = $lineNumber;
		$this->className = $className;
		$this->methodName = $methodName;
	}
}

Boot::registerClass(Input::class, 'haxe.io.Input');
Boot::registerSetters('haxe\\io\\Input', [
	'bigEndian' => true
]);