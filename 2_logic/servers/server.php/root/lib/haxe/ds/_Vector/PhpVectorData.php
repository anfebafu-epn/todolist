<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe\ds\_Vector;

use \php\Boot;

class PhpVectorData {
	/**
	 * @var mixed[]
	 */
	public $data;
	/**
	 * @var int
	 */
	public $length;

	/**
	 * @param int $length
	 * 
	 * @return void
	 */
	public function __construct ($length) {
		#C:\HaxeToolkit\haxe\std/php/_std/haxe/ds/Vector.hx:32: characters 3-23
		$this->length = $length;
		#C:\HaxeToolkit\haxe\std/php/_std/haxe/ds/Vector.hx:33: characters 10-34
		$this1 = [];
		#C:\HaxeToolkit\haxe\std/php/_std/haxe/ds/Vector.hx:33: characters 3-34
		$this->data = $this1;
	}
}

Boot::registerClass(PhpVectorData::class, 'haxe.ds._Vector.PhpVectorData');
