<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\common\interfaces;

use \php\Boot;

interface IDisposable {
	/**
	 * @return void
	 */
	public function Dispose () ;
}

Boot::registerClass(IDisposable::class, 'nMorph.framework.common.interfaces.IDisposable');