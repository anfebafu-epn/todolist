<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe;

use \php\Boot;
use \haxe\ds\ObjectMap;
use \haxe\ds\IntMap;
use \haxe\ds\List_hx;
use \haxe\ds\StringMap;
use \haxe\io\Bytes;

/**
 * The Serializer class can be used to encode values and objects into a `String`,
 * from which the `Unserializer` class can recreate the original representation.
 * This class can be used in two ways:
 * - create a `new Serializer()` instance, call its `serialize()` method with
 * any argument and finally retrieve the String representation from
 * `toString()`
 * - call `Serializer.run()` to obtain the serialized representation of a
 * single argument
 * Serialization is guaranteed to work for all haxe-defined classes, but may
 * or may not work for instances of external/native classes.
 * The specification of the serialization format can be found here:
 * <https://haxe.org/manual/std-serialization-format.html>
 */
class Serializer {
	/**
	 * @var bool
	 * If the values you are serializing can contain circular references or
	 * objects repetitions, you should set `USE_CACHE` to true to prevent
	 * infinite loops.
	 * This may also reduce the size of serialization Strings at the expense of
	 * performance.
	 * This value can be changed for individual instances of `Serializer` by
	 * setting their `useCache` field.
	 */
	static public $USE_CACHE = false;
	/**
	 * @var bool
	 * Use constructor indexes for enums instead of names.
	 * This may reduce the size of serialization Strings, but makes them less
	 * suited for long-term storage: If constructors are removed or added from
	 * the enum, the indices may no longer match.
	 * This value can be changed for individual instances of `Serializer` by
	 * setting their `useEnumIndex` field.
	 */
	static public $USE_ENUM_INDEX = false;

	/**
	 * @var \StringBuf
	 */
	public $buf;
	/**
	 * @var mixed[]|\Array_hx
	 */
	public $cache;
	/**
	 * @var int
	 */
	public $scount;
	/**
	 * @var StringMap
	 */
	public $shash;
	/**
	 * @var bool
	 * The individual cache setting for `this` Serializer instance.
	 * See `USE_CACHE` for a complete description.
	 */
	public $useCache;
	/**
	 * @var bool
	 * The individual enum index setting for `this` Serializer instance.
	 * See `USE_ENUM_INDEX` for a complete description.
	 */
	public $useEnumIndex;

	/**
	 * Creates a new Serializer instance.
	 * Subsequent calls to `this.serialize` will append values to the
	 * internal buffer of this String. Once complete, the contents can be
	 * retrieved through a call to `this.toString`.
	 * Each `Serializer` instance maintains its own cache if `this.useCache` is
	 * `true`.
	 * 
	 * @return void
	 */
	public function __construct () {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:104: characters 3-24
		$this->buf = new \StringBuf();
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:105: characters 3-22
		$this->cache = new \Array_hx();
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:106: characters 3-23
		$this->useCache = Serializer::$USE_CACHE;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:107: characters 3-32
		$this->useEnumIndex = Serializer::$USE_ENUM_INDEX;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:108: characters 3-34
		$this->shash = new StringMap();
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:109: characters 3-13
		$this->scount = 0;
	}

	/**
	 * Serializes `v`.
	 * All haxe-defined values and objects with the exception of functions can
	 * be serialized. Serialization of external/native objects is not
	 * guaranteed to work.
	 * The values of `this.useCache` and `this.useEnumIndex` may affect
	 * serialization output.
	 * 
	 * @param mixed $v
	 * 
	 * @return void
	 */
	public function serialize ($v) {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:230: characters 11-25
		$_g = \Type::typeof($v);
		$__hx__switch = ($_g->index);
		if ($__hx__switch === 0) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:232: characters 5-17
			$this->buf->add("n");
		} else if ($__hx__switch === 1) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:234: characters 5-19
			$v1 = $v;
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:235: lines 235-238
			if ($v1 === 0) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:236: characters 6-18
				$this->buf->add("z");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:237: characters 6-12
				return;
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:239: characters 5-17
			$this->buf->add("i");
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:240: characters 5-15
			$this->buf->add($v1);
		} else if ($__hx__switch === 2) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:242: characters 5-21
			$v1 = $v;
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:243: lines 243-250
			if (\is_nan($v1)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:244: characters 6-18
				$this->buf->add("k");
			} else if (!\is_finite($v1)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:246: characters 6-38
				$this->buf->add(($v1 < 0 ? "m" : "p"));
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:248: characters 6-18
				$this->buf->add("d");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:249: characters 6-16
				$this->buf->add($v1);
			}
		} else if ($__hx__switch === 3) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:252: characters 5-33
			$this->buf->add(($v ? "t" : "f"));
		} else if ($__hx__switch === 4) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:413: lines 413-432
			if (Boot::isOfType($v, Boot::getClass('Class'))) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:414: characters 6-43
				$className = \Type::getClassName($v);
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:422: characters 6-18
				$this->buf->add("A");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:423: characters 6-32
				$this->serializeString($className);
			} else if (Boot::isOfType($v, Boot::getClass('Enum'))) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:425: characters 6-18
				$this->buf->add("B");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:426: characters 6-42
				$this->serializeString(\Type::getEnumName($v));
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:428: lines 428-429
				if ($this->useCache && $this->serializeRef($v)) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:429: characters 7-13
					return;
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:430: characters 6-18
				$this->buf->add("o");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:431: characters 6-24
				$this->serializeFields($v);
			}
		} else if ($__hx__switch === 5) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:543: characters 5-10
			throw Exception::thrown("Cannot serialize function");
		} else if ($__hx__switch === 6) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:253: characters 16-17
			$c = $_g->params[0];
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:254: lines 254-257
			if ($c === Boot::getClass('String')) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:255: characters 6-24
				$this->serializeString($v);
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:256: characters 6-12
				return;
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:258: lines 258-259
			if ($this->useCache && $this->serializeRef($v)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:259: characters 6-12
				return;
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:260: lines 260-411
			if ($c === Boot::getClass(\Array_hx::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:262: characters 7-22
				$ucount = 0;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:263: characters 7-19
				$this->buf->add("a");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:267: lines 267-268
				$l = Boot::dynamicField($v, 'length');
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:269: characters 17-21
				$_g1 = 0;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:269: characters 21-22
				$_g2 = $l;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:269: lines 269-284
				while ($_g1 < $_g2) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:269: characters 17-22
					$i = $_g1++;
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:270: lines 270-283
					if ($v[$i] === null) {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:271: characters 9-17
						++$ucount;
					} else {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:273: lines 273-281
						if ($ucount > 0) {
							#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:274: lines 274-279
							if ($ucount === 1) {
								#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:275: characters 11-23
								$this->buf->add("n");
							} else {
								#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:277: characters 11-23
								$this->buf->add("u");
								#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:278: characters 11-26
								$this->buf->add($ucount);
							}
							#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:280: characters 10-16
							$ucount = 0;
						}
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:282: characters 9-24
						$this->serialize($v[$i]);
					}
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:285: lines 285-292
				if ($ucount > 0) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:286: lines 286-291
					if ($ucount === 1) {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:287: characters 9-21
						$this->buf->add("n");
					} else {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:289: characters 9-21
						$this->buf->add("u");
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:290: characters 9-24
						$this->buf->add($ucount);
					}
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:293: characters 7-19
				$this->buf->add("h");
			} else if ($c === Boot::getClass(\Date::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:301: characters 7-22
				$d = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:302: characters 7-19
				$this->buf->add("v");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:303: characters 7-27
				$this->buf->add($d->getTime());
			} else if ($c === Boot::getClass(IntMap::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:313: characters 7-19
				$this->buf->add("q");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:314: characters 7-41
				$v1 = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:315: characters 17-25
				$data = \array_keys($v1->data);
				$_g_current = 0;
				$_g_length = \count($data);
				$_g_data = $data;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:315: lines 315-319
				while ($_g_current < $_g_length) {
					$k = $_g_data[$_g_current++];
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:316: characters 8-20
					$this->buf->add(":");
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:317: characters 8-18
					$this->buf->add($k);
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:318: characters 8-27
					$this->serialize(($v1->data[$k] ?? null));
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:320: characters 7-19
				$this->buf->add("h");
			} else if ($c === Boot::getClass(List_hx::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:295: characters 7-19
				$this->buf->add("l");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:296: characters 7-31
				$v1 = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:297: characters 17-18
				$_g_head = $v1->h;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:297: lines 297-298
				while ($_g_head !== null) {
					$val = $_g_head->item;
					$_g_head = $_g_head->next;
					$i = $val;
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:298: characters 8-20
					$this->serialize($i);
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:299: characters 7-19
				$this->buf->add("h");
			} else if ($c === Boot::getClass(ObjectMap::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:322: characters 7-19
				$this->buf->add("M");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:323: characters 7-53
				$v1 = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:324: characters 17-25
				$data = \array_values($v1->_keys);
				$_g_current = 0;
				$_g_length = \count($data);
				$_g_data = $data;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:324: lines 324-334
				while ($_g_current < $_g_length) {
					$k = $_g_data[$_g_current++];
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:331: characters 8-20
					$this->serialize($k);
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:333: characters 8-27
					$this->serialize($v1->get($k));
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:335: characters 7-19
				$this->buf->add("h");
			} else if ($c === Boot::getClass(StringMap::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:305: characters 7-19
				$this->buf->add("b");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:306: characters 7-44
				$v1 = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:307: characters 17-25
				$data = \array_values(\array_map("strval", \array_keys($v1->data)));
				$_g_current = 0;
				$_g_length = \count($data);
				$_g_data = $data;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:307: lines 307-310
				while ($_g_current < $_g_length) {
					$k = $_g_data[$_g_current++];
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:308: characters 8-26
					$this->serializeString($k);
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:309: characters 8-27
					$this->serialize(($v1->data[$k] ?? null));
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:311: characters 7-19
				$this->buf->add("h");
			} else if ($c === Boot::getClass(Bytes::class)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:337: characters 7-31
				$v1 = $v;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:345: characters 7-69
				$chars = \base64_encode($v1->b->s);
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:346: characters 7-12
				$chars = \strtr($chars, "+/", "%:");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:347: characters 7-19
				$this->buf->add("s");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:348: characters 7-28
				$this->buf->add(mb_strlen($chars));
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:349: characters 7-19
				$this->buf->add(":");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:350: characters 7-21
				$this->buf->add($chars);
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:388: characters 7-32
				if ($this->useCache) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:388: characters 21-32
					$_this = $this->cache;
					if ($_this->length > 0) {
						$_this->length--;
					}
					\array_pop($_this->arr);
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:389: lines 389-410
				if (\method_exists($v, "hxSerialize")) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:394: characters 8-20
					$this->buf->add("C");
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:395: characters 8-45
					$this->serializeString(\Type::getClassName($c));
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:396: lines 396-397
					if ($this->useCache) {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:397: characters 9-22
						$_this = $this->cache;
						$_this->arr[$_this->length++] = $v;
					}
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:398: characters 8-27
					$v->hxSerialize($this);
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:399: characters 8-20
					$this->buf->add("g");
				} else {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:401: characters 8-20
					$this->buf->add("c");
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:402: characters 8-45
					$this->serializeString(\Type::getClassName($c));
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:403: lines 403-404
					if ($this->useCache) {
						#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:404: characters 9-22
						$_this = $this->cache;
						$_this->arr[$_this->length++] = $v;
					}
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:408: characters 8-26
					$this->serializeFields($v);
				}
			}
		} else if ($__hx__switch === 7) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:433: characters 15-16
			$e = $_g->params[0];
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:434: lines 434-438
			if ($this->useCache) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:435: lines 435-436
				if ($this->serializeRef($v)) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:436: characters 7-13
					return;
				}
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:437: characters 6-17
				$_this = $this->cache;
				if ($_this->length > 0) {
					$_this->length--;
				}
				\array_pop($_this->arr);
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:439: characters 5-38
			$this->buf->add(($this->useEnumIndex ? "j" : "w"));
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:440: characters 5-41
			$this->serializeString(\Type::getEnumName($e));
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:485: lines 485-489
			if ($this->useEnumIndex) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:486: characters 6-18
				$this->buf->add(":");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:487: characters 6-22
				$this->buf->add(Boot::dynamicField($v, 'index'));
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:489: characters 6-28
				$this->serializeString(Boot::dynamicField($v, 'tag'));
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:490: characters 5-17
			$this->buf->add(":");
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:491: characters 5-57
			$l = count(Boot::dynamicField($v, 'params'));
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:492: lines 492-501
			if (($l === 0) || (Boot::dynamicField($v, 'params') === null)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:493: characters 6-16
				$this->buf->add(0);
			} else {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:495: characters 6-16
				$this->buf->add($l);
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:496: characters 16-20
				$_g = 0;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:496: characters 20-21
				$_g1 = $l;
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:496: lines 496-500
				while ($_g < $_g1) {
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:496: characters 16-21
					$i = $_g++;
					#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:498: characters 7-29
					$this->serialize(Boot::dynamicField($v, 'params')[$i]);
				}
			}
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:540: lines 540-541
			if ($this->useCache) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:541: characters 6-19
				$_this = $this->cache;
				$_this->arr[$_this->length++] = $v;
			}
		} else {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:552: characters 5-10
			throw Exception::thrown("Cannot serialize " . \Std::string($v));
		}
	}

	/**
	 * @param object $v
	 * 
	 * @return void
	 */
	public function serializeFields ($v) {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:212: lines 212-215
		$_g = 0;
		$_g1 = \Reflect::fields($v);
		while ($_g < $_g1->length) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:212: characters 8-9
			$f = ($_g1->arr[$_g] ?? null);
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:212: lines 212-215
			++$_g;
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:213: characters 4-22
			$this->serializeString($f);
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:214: characters 4-34
			$this->serialize(\Reflect::field($v, $f));
		}
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:216: characters 3-15
		$this->buf->add("g");
	}

	/**
	 * @param mixed $v
	 * 
	 * @return bool
	 */
	public function serializeRef ($v) {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:178: characters 13-17
		$_g = 0;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:178: characters 17-29
		$_g1 = $this->cache->length;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:178: lines 178-189
		while ($_g < $_g1) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:178: characters 13-29
			$i = $_g++;
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:183: lines 183-188
			if (Boot::equal(($this->cache->arr[$i] ?? null), $v)) {
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:185: characters 5-17
				$this->buf->add("r");
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:186: characters 5-15
				$this->buf->add($i);
				#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:187: characters 5-16
				return true;
			}
		}
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:190: characters 3-16
		$_this = $this->cache;
		$_this->arr[$_this->length++] = $v;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:191: characters 3-15
		return false;
	}

	/**
	 * @param string $s
	 * 
	 * @return void
	 */
	public function serializeString ($s) {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:155: characters 3-24
		$x = ($this->shash->data[$s] ?? null);
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:156: lines 156-160
		if ($x !== null) {
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:157: characters 4-16
			$this->buf->add("R");
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:158: characters 4-14
			$this->buf->add($x);
			#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:159: characters 4-10
			return;
		}
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:161: characters 3-25
		$this->shash->data[$s] = $this->scount++;
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:167: characters 3-15
		$this->buf->add("y");
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:168: characters 3-31
		$s = \rawurlencode($s);
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:169: characters 3-20
		$this->buf->add(mb_strlen($s));
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:170: characters 3-15
		$this->buf->add(":");
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:171: characters 3-13
		$this->buf->add($s);
	}

	/**
	 * Return the String representation of `this` Serializer.
	 * The exact format specification can be found here:
	 * https://haxe.org/manual/serialization/format
	 * 
	 * @return string
	 */
	public function toString () {
		#C:\HaxeToolkit\haxe\std/haxe/Serializer.hx:119: characters 3-24
		return $this->buf->b;
	}

	public function __toString() {
		return $this->toString();
	}
}

Boot::registerClass(Serializer::class, 'haxe.Serializer');