<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\client;

use \php\Boot;

class QuerySet {
	/**
	 * @var QueryTable[]|\Array_hx
	 */
	public $Tables;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @param string $Name
	 * 
	 * @return QueryTable
	 */
	public function get ($Name) {
		#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:23: lines 23-29
		$_g = 0;
		$_g1 = $this->get_Tables();
		while ($_g < $_g1->length) {
			#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:23: characters 8-10
			$dt = ($_g1->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:23: lines 23-29
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:25: lines 25-28
			if ($dt->get_Name() === $Name) {
				#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:27: characters 5-14
				return $dt;
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:30: characters 3-14
		return null;
	}

	/**
	 * @return QueryTable[]|\Array_hx
	 */
	public function get_Tables () {
		#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:18: characters 3-16
		return $this->Tables;
	}

	/**
	 * @param QueryTable[]|\Array_hx $value
	 * 
	 * @return QueryTable[]|\Array_hx
	 */
	public function set_Tables ($value) {
		#5_framework\orm\src/nMorph/framework/orm/client/QuerySet.hx:13: characters 3-29
		return $this->Tables = $value;
	}
}

Boot::registerClass(QuerySet::class, 'nMorph.framework.orm.client.QuerySet');
Boot::registerGetters('nMorph\\framework\\orm\\client\\QuerySet', [
	'Tables' => true
]);
Boot::registerSetters('nMorph\\framework\\orm\\client\\QuerySet', [
	'Tables' => true
]);
