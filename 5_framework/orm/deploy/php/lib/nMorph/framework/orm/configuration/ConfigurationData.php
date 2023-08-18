<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\configuration;

use \nMorph\framework\common\configuration\Configuration as ConfigurationConfiguration;
use \php\Boot;
use \nMorph\framework\common\exceptions\ExceptionHelper;

/**
 * ...
 * @author Smartwork
 */
class ConfigurationData {
	/**
	 * @var DatabaseConnectionData[]|\Array_hx
	 */
	public $DatabaseConnections;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * Obtiene la cadena de conexión actual
	 * @return
	 * 
	 * @return DatabaseConnectionData
	 */
	public function get_CurrentDatabaseConnection () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:40: characters 19-174
		$_this = $this->get_DatabaseConnections();
		$result = [];
		$data = $_this->arr;
		$_g_current = 0;
		$_g_length = \count($data);
		$_g_data = $data;
		while ($_g_current < $_g_length) {
			$item = $_g_data[$_g_current++];
			if ($item->get_DeploEnvironment() === ConfigurationConfiguration::$Data->get_CurrentDeployEnvironment()) {
				$result[] = $item;
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:40: characters 9-175
		$res = \Array_hx::wrap($result);
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:41: lines 41-44
		if ($res->length === 0) {
			#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:43: characters 13-132
			ExceptionHelper::LogicException(100, "No hay configuración de conexión a la base de datos en el ambiente deploy actual");
		}
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:45: characters 9-22
		return ($res->arr[0] ?? null);
	}

	/**
	 * @return DatabaseConnectionData[]|\Array_hx
	 */
	public function get_DatabaseConnections () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:32: characters 9-35
		return $this->DatabaseConnections;
	}

	/**
	 * @param DatabaseConnectionData[]|\Array_hx $value
	 * 
	 * @return DatabaseConnectionData[]|\Array_hx
	 */
	public function set_DatabaseConnections ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/ConfigurationData.hx:28: characters 9-48
		return $this->DatabaseConnections = $value;
	}
}

Boot::registerClass(ConfigurationData::class, 'nMorph.framework.orm.configuration.ConfigurationData');
Boot::registerGetters('nMorph\\framework\\orm\\configuration\\ConfigurationData', [
	'DatabaseConnections' => true
]);
Boot::registerSetters('nMorph\\framework\\orm\\configuration\\ConfigurationData', [
	'DatabaseConnections' => true
]);