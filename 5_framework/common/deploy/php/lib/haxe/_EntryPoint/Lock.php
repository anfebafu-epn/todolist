<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe\_EntryPoint;

use \php\Boot;

class Lock {
	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return void
	 */
	public function release () {
	}

	/**
	 * @param float $t
	 * 
	 * @return void
	 */
	public function wait ($t = null) {
	}
}

Boot::registerClass(Lock::class, 'haxe._EntryPoint.Lock');
