<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe\iterators;

use \php\_Boot\HxAnon;
use \php\Boot;

class ArrayKeyValueIterator {
	/**
	 * @var mixed[]|\Array_hx
	 */
	public $array;
	/**
	 * @var int
	 */
	public $current;

	/**
	 * @param mixed[]|\Array_hx $array
	 * 
	 * @return void
	 */
	public function __construct ($array) {
		#C:\HaxeToolkit\haxe\std/haxe/iterators/ArrayKeyValueIterator.hx:27: characters 20-21
		$this->current = 0;
		#C:\HaxeToolkit\haxe\std/haxe/iterators/ArrayKeyValueIterator.hx:32: characters 3-21
		$this->array = $array;
	}

	/**
	 * @return bool
	 */
	public function hasNext () {
		#C:\HaxeToolkit\haxe\std/haxe/iterators/ArrayKeyValueIterator.hx:37: characters 3-32
		return $this->current < $this->array->length;
	}

	/**
	 * @return object
	 */
	public function next () {
		#C:\HaxeToolkit\haxe\std/haxe/iterators/ArrayKeyValueIterator.hx:42: characters 17-31
		$tmp = ($this->array->arr[$this->current] ?? null);
		#C:\HaxeToolkit\haxe\std/haxe/iterators/ArrayKeyValueIterator.hx:42: characters 3-47
		return new _HxAnon_ArrayKeyValueIterator0($tmp, $this->current++);
	}
}

class _HxAnon_ArrayKeyValueIterator0 extends HxAnon {
	function __construct($value, $key) {
		$this->value = $value;
		$this->key = $key;
	}
}

Boot::registerClass(ArrayKeyValueIterator::class, 'haxe.iterators.ArrayKeyValueIterator');