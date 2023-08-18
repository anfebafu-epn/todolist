<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace haxe;

use \php\Boot;

class MainEvent {
	/**
	 * @var \Closure
	 */
	public $f;
	/**
	 * @var bool
	 * Tells if the event can lock the process from exiting (default:true)
	 */
	public $isBlocking;
	/**
	 * @var MainEvent
	 */
	public $next;
	/**
	 * @var float
	 */
	public $nextRun;
	/**
	 * @var MainEvent
	 */
	public $prev;
	/**
	 * @var int
	 */
	public $priority;

	/**
	 * @param \Closure $f
	 * @param int $p
	 * 
	 * @return void
	 */
	public function __construct ($f, $p) {
		#C:\HaxeToolkit\haxe\std/haxe/MainLoop.hx:17: characters 31-35
		$this->isBlocking = true;
		#C:\HaxeToolkit\haxe\std/haxe/MainLoop.hx:23: characters 3-13
		$this->f = $f;
		#C:\HaxeToolkit\haxe\std/haxe/MainLoop.hx:24: characters 3-20
		$this->priority = $p;
		#C:\HaxeToolkit\haxe\std/haxe/MainLoop.hx:25: characters 3-35
		$this->nextRun = \Math::$NEGATIVE_INFINITY;
	}
}

Boot::registerClass(MainEvent::class, 'haxe.MainEvent');