<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\clauses;

use \nMorph\framework\orm\lang\SQL;
use \php\Boot;
use \nMorph\framework\orm\interfaces\IClause;
use \nMorph\framework\orm\tools\BulkRun;
use \nMorph\framework\orm\client\QueryTable;
use \nMorph\framework\orm\client\QueueItem;
use \nMorph\framework\orm\common\enums\UnionTypeEnum;
use \nMorph\framework\orm\tools\Context;

class UnionClause implements IClause {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.common.clauses.UnionClause\" params=\"\">\x0A\x09<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<UnionType><e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/></UnionType>\x0A\x09<InnerClause><c path=\"nMorph.framework.orm.interfaces.IClause\"/></InnerClause>\x0A\x09<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\x0A\x09<UNION public=\"1\" set=\"method\" line=\"26\"><f a=\"UnionType:Clause\">\x0A\x09<e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/>\x0A\x09<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<c path=\"nMorph.framework.orm.common.clauses.UnionClause\"/>\x0A</f></UNION>\x0A\x09<SCRIPT public=\"1\" set=\"method\" line=\"32\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\x0A\x09<SCRIPT_PART public=\"1\" set=\"method\" line=\"36\"><f a=\"?args\">\x0A\x09<c path=\"String\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></SCRIPT_PART>\x0A\x09<Execute public=\"1\" set=\"method\" line=\"97\"><f a=\"\"><d/></f></Execute>\x0A\x09<Register public=\"1\" set=\"method\" line=\"101\"><f a=\"context\">\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></Register>\x0A\x09<Queue public=\"1\" set=\"method\" line=\"105\"><f a=\"queue\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A</f></Queue>\x0A\x09<Bulk public=\"1\" set=\"method\" line=\"109\"><f a=\"bulk\">\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A</f></Bulk>\x0A\x09<ReadValue public=\"1\" set=\"method\" line=\"114\"><f a=\"\"><d/></f></ReadValue>\x0A\x09<ReadTable public=\"1\" set=\"method\" line=\"118\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\x0A\x09<Read public=\"1\" params=\"T\" set=\"method\" line=\"122\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"Read.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"Array\"><c path=\"Read.T\"/></c>\x0A</f></Read>\x0A\x09<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"126\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"ReadOne.T\"/>\x0A</f></ReadOne>\x0A\x09<new public=\"1\" set=\"method\" line=\"20\"><f a=\"CurrentSQL:UnionType:InnerClause\">\x0A\x09<c path=\"nMorph.framework.orm.lang.SQL\"/>\x0A\x09<e path=\"nMorph.framework.orm.common.enums.UnionTypeEnum\"/>\x0A\x09<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var SQL
	 */
	public $CurrentSQL;
	/**
	 * @var IClause
	 */
	public $InnerClause;
	/**
	 * @var UnionTypeEnum
	 */
	public $UnionType;

	/**
	 * @param SQL $CurrentSQL
	 * @param UnionTypeEnum $UnionType
	 * @param IClause $InnerClause
	 * 
	 * @return void
	 */
	public function __construct ($CurrentSQL, $UnionType, $InnerClause) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:21: characters 9-35
		$this->UnionType = $UnionType;
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:22: characters 9-39
		$this->InnerClause = $InnerClause;
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:23: characters 9-37
		$this->CurrentSQL = $CurrentSQL;
	}

	/**
	 * @param BulkRun $bulk
	 * 
	 * @return BulkRun
	 */
	public function Bulk ($bulk) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:110: characters 9-50
		$bulk->set_queue($this->CurrentSQL->Queue($bulk->get_queue()));
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:111: characters 9-20
		return $bulk;
	}

	/**
	 * @return mixed
	 */
	public function Execute () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:98: characters 9-36
		return $this->CurrentSQL->Execute();
	}

	/**
	 * @param QueueItem[]|\Array_hx $queue
	 * 
	 * @return QueueItem[]|\Array_hx
	 */
	public function Queue ($queue) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:106: characters 9-39
		return $this->CurrentSQL->Queue($queue);
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public function Read ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:123: characters 9-44
		return $this->CurrentSQL->Read($cl, $context);
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed
	 */
	public function ReadOne ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:127: characters 9-47
		return $this->CurrentSQL->ReadOne($cl, $context);
	}

	/**
	 * @return QueryTable
	 */
	public function ReadTable () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:119: characters 9-38
		return $this->CurrentSQL->ReadTable();
	}

	/**
	 * @return mixed
	 */
	public function ReadValue () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:115: characters 9-38
		return $this->CurrentSQL->ReadValue();
	}

	/**
	 * @param Context $context
	 * 
	 * @return void
	 */
	public function Register ($context) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:102: characters 9-56
		$context->set_Queue($this->CurrentSQL->Queue($context->get_Queue()));
	}

	/**
	 * @return string
	 */
	public function SCRIPT () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:33: characters 9-40
		return $this->CurrentSQL->GenerateAll();
	}

	/**
	 * @param string $args
	 * 
	 * @return void
	 */
	public function SCRIPT_PART ($args = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:38: characters 16-45
		$__hx__switch = ($this->CurrentSQL->getCurrentEngine()->index);
		if ($__hx__switch === 0) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:84: characters 17-31
			$Part = "";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:86: characters 24-33
			$_g = $this->UnionType;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:89: characters 25-43
			$Part = ($Part??'null') . " UNION (";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:90: characters 25-53
			$Part = ($Part??'null') . ($this->InnerClause->SCRIPT()??'null');
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:91: characters 25-37
			$Part = ($Part??'null') . ") ";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:93: characters 17-42
			$this->CurrentSQL->AddBlock($Part);
		} else if ($__hx__switch === 1) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:62: characters 17-31
			$Part = "";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:64: characters 24-33
			$_g = $this->UnionType;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:67: characters 25-43
			$Part = ($Part??'null') . " UNION (";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:68: characters 25-53
			$Part = ($Part??'null') . ($this->InnerClause->SCRIPT()??'null');
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:69: characters 25-37
			$Part = ($Part??'null') . ") ";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:71: characters 17-42
			$this->CurrentSQL->AddBlock($Part);
		} else if ($__hx__switch === 2) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:51: characters 17-31
			$Part = "";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:53: characters 24-33
			$_g = $this->UnionType;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:56: characters 25-43
			$Part = ($Part??'null') . " UNION (";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:57: characters 25-53
			$Part = ($Part??'null') . ($this->InnerClause->SCRIPT()??'null');
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:58: characters 25-37
			$Part = ($Part??'null') . ") ";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:60: characters 17-42
			$this->CurrentSQL->AddBlock($Part);
		} else if ($__hx__switch === 3) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:73: characters 17-31
			$Part = "";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:75: characters 24-33
			$_g = $this->UnionType;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:78: characters 25-43
			$Part = ($Part??'null') . " UNION (";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:79: characters 25-53
			$Part = ($Part??'null') . ($this->InnerClause->SCRIPT()??'null');
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:80: characters 25-37
			$Part = ($Part??'null') . ") ";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:82: characters 17-42
			$this->CurrentSQL->AddBlock($Part);
		} else if ($__hx__switch === 4) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:40: characters 17-31
			$Part = "";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:42: characters 24-33
			$_g = $this->UnionType;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:45: characters 25-43
			$Part = ($Part??'null') . " UNION (";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:46: characters 25-53
			$Part = ($Part??'null') . ($this->InnerClause->SCRIPT()??'null');
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:47: characters 25-37
			$Part = ($Part??'null') . ") ";
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:49: characters 17-42
			$this->CurrentSQL->AddBlock($Part);
		}
	}

	/**
	 * @param UnionTypeEnum $UnionType
	 * @param IClause $Clause
	 * 
	 * @return UnionClause
	 */
	public function UNION ($UnionType, $Clause) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:27: characters 9-77
		$uc = new UnionClause($this->CurrentSQL, $UnionType, $Clause);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:28: characters 9-33
		$this->CurrentSQL->AddClause($uc);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/UnionClause.hx:29: characters 9-18
		return $uc;
	}
}

Boot::registerClass(UnionClause::class, 'nMorph.framework.orm.common.clauses.UnionClause');
