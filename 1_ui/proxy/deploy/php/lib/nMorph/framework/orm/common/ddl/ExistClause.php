<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\ddl;

use \php\Boot;
use \nMorph\framework\orm\interfaces\IClause;
use \nMorph\framework\orm\tools\BulkRun;
use \nMorph\framework\common\exceptions\ExceptionHelper;
use \nMorph\framework\orm\client\QueryTable;
use \nMorph\framework\orm\client\QueueItem;
use \nMorph\framework\orm\lang\DDL;
use \nMorph\framework\orm\tools\Context;

class ExistClause implements IClause {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.common.ddl.ExistClause\" params=\"\">\x0A\x09<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<CurrentDDL><c path=\"nMorph.framework.orm.lang.DDL\"/></CurrentDDL>\x0A\x09<TableName><c path=\"String\"/></TableName>\x0A\x09<SCRIPT public=\"1\" set=\"method\" line=\"24\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\x0A\x09<SCRIPT_PART public=\"1\" set=\"method\" line=\"28\"><f a=\"?args\">\x0A\x09<c path=\"String\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></SCRIPT_PART>\x0A\x09<Execute public=\"1\" set=\"method\" line=\"62\"><f a=\"\"><d/></f></Execute>\x0A\x09<Register public=\"1\" set=\"method\" line=\"66\"><f a=\"context\">\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></Register>\x0A\x09<Queue public=\"1\" set=\"method\" line=\"70\"><f a=\"queue\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A</f></Queue>\x0A\x09<Bulk public=\"1\" set=\"method\" line=\"75\"><f a=\"bulk\">\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A</f></Bulk>\x0A\x09<ReadValue public=\"1\" set=\"method\" line=\"80\"><f a=\"\"><d/></f></ReadValue>\x0A\x09<ReadTable public=\"1\" set=\"method\" line=\"85\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\x0A\x09<Read public=\"1\" params=\"T\" set=\"method\" line=\"90\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"Read.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"Array\"><c path=\"Read.T\"/></c>\x0A</f></Read>\x0A\x09<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"95\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"ReadOne.T\"/>\x0A</f></ReadOne>\x0A\x09<new public=\"1\" set=\"method\" line=\"19\"><f a=\"CurrentDDL:TableName\">\x0A\x09<c path=\"nMorph.framework.orm.lang.DDL\"/>\x0A\x09<c path=\"String\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var DDL
	 */
	public $CurrentDDL;
	/**
	 * @var string
	 */
	public $TableName;

	/**
	 * @param DDL $CurrentDDL
	 * @param string $TableName
	 * 
	 * @return void
	 */
	public function __construct ($CurrentDDL, $TableName) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:20: characters 9-37
		$this->CurrentDDL = $CurrentDDL;
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:21: characters 9-35
		$this->TableName = $TableName;
	}

	/**
	 * @param BulkRun $bulk
	 * 
	 * @return BulkRun
	 */
	public function Bulk ($bulk) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:76: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:77: characters 9-20
		return null;
	}

	/**
	 * @return mixed
	 */
	public function Execute () {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:63: characters 9-36
		return $this->CurrentDDL->Execute();
	}

	/**
	 * @param QueueItem[]|\Array_hx $queue
	 * 
	 * @return QueueItem[]|\Array_hx
	 */
	public function Queue ($queue) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:71: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:72: characters 9-20
		return null;
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public function Read ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:91: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:92: characters 9-20
		return null;
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed
	 */
	public function ReadOne ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:96: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:97: characters 9-20
		return null;
	}

	/**
	 * @return QueryTable
	 */
	public function ReadTable () {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:86: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:87: characters 9-20
		return null;
	}

	/**
	 * @return mixed
	 */
	public function ReadValue () {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:81: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:82: characters 9-20
		return null;
	}

	/**
	 * @param Context $context
	 * 
	 * @return void
	 */
	public function Register ($context) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:67: characters 9-62
		ExceptionHelper::LogicException(1, "Not Valid Method");
	}

	/**
	 * @return string
	 */
	public function SCRIPT () {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:25: characters 9-40
		return $this->CurrentDDL->GenerateAll();
	}

	/**
	 * @param string $args
	 * 
	 * @return void
	 */
	public function SCRIPT_PART ($args = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:29: characters 9-23
		$Part = "";
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:31: characters 16-45
		$__hx__switch = ($this->CurrentDDL->getCurrentEngine()->index);
		if ($__hx__switch === 0) {
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:53: lines 53-55
			$Part = ($Part??'null') . "SELECT COUNT(*) AS EXIST " . "FROM information_schema.tables " . "WHERE table_name='";
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:56: characters 17-37
			$Part = ($Part??'null') . ($this->TableName??'null') . "'";
		} else if ($__hx__switch === 1) {
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:44: lines 44-46
			$Part = ($Part??'null') . "select count(*) AS EXIST " . "from all_tables " . "where table_name= ('";
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:47: characters 17-38
			$Part = ($Part??'null') . ($this->TableName??'null') . "')";
		} else if ($__hx__switch === 2) {
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:38: lines 38-40
			$Part = ($Part??'null') . "SELECT count(*) AS EXIST " . "FROM information_schema.tables " . "WHERE table_name = '";
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:41: characters 17-36
			$Part = ($Part??'null') . ($this->TableName??'null') . "'";
		} else if ($__hx__switch === 3) {
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:50: characters 17-34
			$Part = ($Part??'null') . "SELECT ";
		} else if ($__hx__switch === 4) {
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:33: lines 33-34
			$Part = ($Part??'null') . "SELECT COUNT(CAST(table_name as varchar)) AS EXIST " . "FROM INFORMATION_SCHEMA.TABLES WHERE  table_name= '";
			#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:35: characters 17-38
			$Part = ($Part??'null') . ($this->TableName??'null') . "'";
		}
		#5_framework\orm\src/nMorph/framework/orm/common/ddl/ExistClause.hx:59: characters 9-34
		$this->CurrentDDL->AddBlock($Part);
	}
}

Boot::registerClass(ExistClause::class, 'nMorph.framework.orm.common.ddl.ExistClause');