<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\client;

use \php\Boot;

class QueryRow {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.client.QueryRow\" params=\"\">\x0A\x09<Items public=\"1\" get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"Array\"><d/></c>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</Items>\x0A\x09<set_Items set=\"method\" line=\"13\"><f a=\"value\">\x0A\x09<c path=\"Array\"><d/></c>\x0A\x09<c path=\"Array\"><d/></c>\x0A</f></set_Items>\x0A\x09<get_Items set=\"method\" line=\"18\"><f a=\"\"><c path=\"Array\"><d/></c></f></get_Items>\x0A\x09<new public=\"1\" set=\"method\" line=\"7\"><f a=\"\"><x path=\"Void\"/></f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var mixed[]|\Array_hx
	 */
	public $Items;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return mixed[]|\Array_hx
	 */
	public function get_Items () {
		#5_framework\orm\src/nMorph/framework/orm/client/QueryRow.hx:19: characters 3-15
		return $this->Items;
	}

	/**
	 * @param mixed[]|\Array_hx $value
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public function set_Items ($value) {
		#5_framework\orm\src/nMorph/framework/orm/client/QueryRow.hx:14: characters 3-28
		return $this->Items = $value;
	}
}

Boot::registerClass(QueryRow::class, 'nMorph.framework.orm.client.QueryRow');
Boot::registerGetters('nMorph\\framework\\orm\\client\\QueryRow', [
	'Items' => true
]);
Boot::registerSetters('nMorph\\framework\\orm\\client\\QueryRow', [
	'Items' => true
]);
