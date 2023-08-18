<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\svc\msg;

use \php\Boot;
use \nMorph\framework\svc\transport\MethodCall;

class RequestMessage {
	/**
	 * @var MethodCall[]|\Array_hx
	 */
	public $Calls;
	/**
	 * @var int
	 */
	public $RequestSeq;
	/**
	 * @var string
	 */
	public $SessionID;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return MethodCall[]|\Array_hx
	 */
	public function get_Calls () {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:32: characters 9-21
		return $this->Calls;
	}

	/**
	 * @return int
	 */
	public function get_RequestSeq () {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:20: characters 9-26
		return $this->RequestSeq;
	}

	/**
	 * @return string
	 */
	public function get_SessionID () {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:24: characters 9-25
		return $this->SessionID;
	}

	/**
	 * @param MethodCall[]|\Array_hx $value
	 * 
	 * @return MethodCall[]|\Array_hx
	 */
	public function set_Calls ($value) {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:36: characters 9-34
		return $this->Calls = $value;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_RequestSeq ($value) {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:16: characters 9-39
		return $this->RequestSeq = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_SessionID ($value) {
		#5_framework\svc\src/nMorph/framework/svc/msg/RequestMessage.hx:28: characters 9-38
		return $this->SessionID = $value;
	}
}

Boot::registerClass(RequestMessage::class, 'nMorph.framework.svc.msg.RequestMessage');
Boot::registerGetters('nMorph\\framework\\svc\\msg\\RequestMessage', [
	'Calls' => true,
	'SessionID' => true,
	'RequestSeq' => true
]);
Boot::registerSetters('nMorph\\framework\\svc\\msg\\RequestMessage', [
	'Calls' => true,
	'SessionID' => true,
	'RequestSeq' => true
]);
