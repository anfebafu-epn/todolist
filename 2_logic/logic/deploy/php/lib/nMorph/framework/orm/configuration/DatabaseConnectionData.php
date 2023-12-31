<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\configuration;

use \php\Boot;
use \nMorph\framework\common\configuration\DeployEnvironmentEnum;

class DatabaseConnectionData {
	/**
	 * @var int
	 */
	public $ConnectionPoolSize;
	/**
	 * @var string
	 */
	public $ConnectionString;
	/**
	 * @var string
	 */
	public $DataSource;
	/**
	 * @var string
	 */
	public $Database;
	/**
	 * @var DatabaseEngineEnum
	 */
	public $DatabaseEngine;
	/**
	 * @var DatabaseTypeAuthenticationEnum
	 */
	public $DatabaseTypeAuthentication;
	/**
	 * @var DeployEnvironmentEnum
	 */
	public $DeploEnvironment;
	/**
	 * @var string[]|\Array_hx
	 */
	public $OtherParameters;
	/**
	 * @var string
	 */
	public $Password;
	/**
	 * @var string
	 */
	public $SID;
	/**
	 * @var string
	 */
	public $Schema;
	/**
	 * @var string
	 */
	public $ServerPort;
	/**
	 * @var string
	 */
	public $ServiceName;
	/**
	 * @var string
	 */
	public $UserID;

	/**
	 * @return void
	 */
	public function __construct () {
	}

	/**
	 * @return int
	 */
	public function get_ConnectionPoolSize () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:27: characters 9-34
		return $this->ConnectionPoolSize;
	}

	/**
	 * @return string
	 */
	public function get_ConnectionString () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:60: characters 9-32
		return $this->ConnectionString;
	}

	/**
	 * @return string
	 */
	public function get_DataSource () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:72: characters 9-26
		return $this->DataSource;
	}

	/**
	 * @return string
	 */
	public function get_Database () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:108: characters 9-24
		return $this->Database;
	}

	/**
	 * @return DatabaseEngineEnum
	 */
	public function get_DatabaseEngine () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:44: characters 9-30
		return $this->DatabaseEngine;
	}

	/**
	 * @return DatabaseTypeAuthenticationEnum
	 */
	public function get_DatabaseTypeAuthentication () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:124: characters 9-42
		return $this->DatabaseTypeAuthentication;
	}

	/**
	 * @return DeployEnvironmentEnum
	 */
	public function get_DeploEnvironment () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:52: characters 9-32
		return $this->DeploEnvironment;
	}

	/**
	 * @return string[]|\Array_hx
	 */
	public function get_OtherParameters () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:120: characters 9-31
		return $this->OtherParameters;
	}

	/**
	 * @return string
	 */
	public function get_Password () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:100: characters 9-24
		return $this->Password;
	}

	/**
	 * @return string
	 */
	public function get_SID () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:88: characters 9-19
		return $this->SID;
	}

	/**
	 * @return string
	 */
	public function get_Schema () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:133: characters 3-16
		return $this->Schema;
	}

	/**
	 * @return string
	 */
	public function get_ServerPort () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:36: characters 9-26
		return $this->ServerPort;
	}

	/**
	 * @return string
	 */
	public function get_ServiceName () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:80: characters 9-27
		return $this->ServiceName;
	}

	/**
	 * @return string
	 */
	public function get_UserID () {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:96: characters 9-22
		return $this->UserID;
	}

	/**
	 * @param int $value
	 * 
	 * @return int
	 */
	public function set_ConnectionPoolSize ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:31: characters 9-47
		return $this->ConnectionPoolSize = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ConnectionString ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:64: characters 9-45
		return $this->ConnectionString = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_DataSource ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:68: characters 9-39
		return $this->DataSource = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Database ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:112: characters 9-37
		return $this->Database = $value;
	}

	/**
	 * @param DatabaseEngineEnum $value
	 * 
	 * @return DatabaseEngineEnum
	 */
	public function set_DatabaseEngine ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:48: characters 9-43
		return $this->DatabaseEngine = $value;
	}

	/**
	 * @param DatabaseTypeAuthenticationEnum $value
	 * 
	 * @return DatabaseTypeAuthenticationEnum
	 */
	public function set_DatabaseTypeAuthentication ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:128: characters 9-55
		return $this->DatabaseTypeAuthentication = $value;
	}

	/**
	 * @param DeployEnvironmentEnum $value
	 * 
	 * @return DeployEnvironmentEnum
	 */
	public function set_DeploEnvironment ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:56: characters 9-45
		return $this->DeploEnvironment = $value;
	}

	/**
	 * @param string[]|\Array_hx $value
	 * 
	 * @return string[]|\Array_hx
	 */
	public function set_OtherParameters ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:116: characters 9-44
		return $this->OtherParameters = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Password ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:104: characters 9-37
		return $this->Password = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_SID ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:84: characters 9-32
		return $this->SID = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_Schema ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:138: characters 3-24
		return $this->Schema = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ServerPort ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:40: characters 9-39
		return $this->ServerPort = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_ServiceName ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:76: characters 9-40
		return $this->ServiceName = $value;
	}

	/**
	 * @param string $value
	 * 
	 * @return string
	 */
	public function set_UserID ($value) {
		#5_framework\orm\src/nMorph/framework/orm/configuration/DatabaseConnectionData.hx:92: characters 9-35
		return $this->UserID = $value;
	}
}

Boot::registerClass(DatabaseConnectionData::class, 'nMorph.framework.orm.configuration.DatabaseConnectionData');
Boot::registerGetters('nMorph\\framework\\orm\\configuration\\DatabaseConnectionData', [
	'Schema' => true,
	'ConnectionPoolSize' => true,
	'ServerPort' => true,
	'OtherParameters' => true,
	'Database' => true,
	'Password' => true,
	'UserID' => true,
	'SID' => true,
	'ServiceName' => true,
	'DataSource' => true,
	'ConnectionString' => true,
	'DatabaseTypeAuthentication' => true,
	'DeploEnvironment' => true,
	'DatabaseEngine' => true
]);
Boot::registerSetters('nMorph\\framework\\orm\\configuration\\DatabaseConnectionData', [
	'Schema' => true,
	'ConnectionPoolSize' => true,
	'ServerPort' => true,
	'OtherParameters' => true,
	'Database' => true,
	'Password' => true,
	'UserID' => true,
	'SID' => true,
	'ServiceName' => true,
	'DataSource' => true,
	'ConnectionString' => true,
	'DatabaseTypeAuthentication' => true,
	'DeploEnvironment' => true,
	'DatabaseEngine' => true
]);
