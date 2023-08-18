<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\common\configuration;

use \php\Boot;

/**
 * ...
 * @author Smartwork
 */
class ConfigurationData {
	/**
	 * @var DeployEnvironmentEnum
	 */
	public $CurrentDeployEnvironment;
	/**
	 * @var string
	 */
	public $LogFolder;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return DeployEnvironmentEnum
	 */
	public function get_CurrentDeployEnvironment () {
		#5_framework\common\src/nMorph/framework/common/configuration/ConfigurationData.hx:28: characters 9-40
		return $this->CurrentDeployEnvironment;
	}

	/**
	 * @return string
	 */
	public function get_LogFolder () {
		#5_framework\common\src/nMorph/framework/common/configuration/ConfigurationData.hx:20: characters 9-25
		return $this->LogFolder;
	}

	/**
	 * @param DeployEnvironmentEnum $value
	 * 
	 * @return DeployEnvironmentEnum
	 */
	public function set_CurrentDeployEnvironment ($value) {
		#5_framework\common\src/nMorph/framework/common/configuration/ConfigurationData.hx:32: characters 9-53
		return $this->CurrentDeployEnvironment = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_LogFolder ($value) {
		#5_framework\common\src/nMorph/framework/common/configuration/ConfigurationData.hx:24: characters 9-38
		return $this->LogFolder = $value;
	}
}

Boot::registerClass(ConfigurationData::class, 'nMorph.framework.common.configuration.ConfigurationData');
Boot::registerGetters('nMorph\\framework\\common\\configuration\\ConfigurationData', [
	'CurrentDeployEnvironment' => true,
	'LogFolder' => true
]);
Boot::registerSetters('nMorph\\framework\\common\\configuration\\ConfigurationData', [
	'CurrentDeployEnvironment' => true,
	'LogFolder' => true
]);