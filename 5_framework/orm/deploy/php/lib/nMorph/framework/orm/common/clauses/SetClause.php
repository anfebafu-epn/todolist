<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\clauses;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ISet;
use \nMorph\framework\orm\interfaces\ICondition;
use \php\Boot;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\interfaces\IClause;
use \nMorph\framework\orm\tools\BulkRun;
use \nMorph\framework\orm\client\QueryTable;
use \nMorph\framework\orm\client\QueueItem;
use \nMorph\framework\orm\tools\Context;

class SetClause implements IClause {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.common.clauses.SetClause\" params=\"\">\x0A\x09<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\x0A\x09<Sets><c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.ISet\"/></c></Sets>\x0A\x09<FROM public=\"1\" set=\"method\" line=\"31\"><f a=\"Source\">\x0A\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09<c path=\"nMorph.framework.orm.common.clauses.FromClause\"/>\x0A</f></FROM>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"37\"><f a=\"Condition\">\x0A\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A</f></WHERE>\x0A\x09<SCRIPT public=\"1\" set=\"method\" line=\"43\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\x0A\x09<SCRIPT_PART public=\"1\" set=\"method\" line=\"47\"><f a=\"?args\">\x0A\x09<c path=\"String\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></SCRIPT_PART>\x0A\x09<Execute public=\"1\" set=\"method\" line=\"117\"><f a=\"\"><d/></f></Execute>\x0A\x09<Register public=\"1\" set=\"method\" line=\"121\"><f a=\"context\">\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></Register>\x0A\x09<Queue public=\"1\" set=\"method\" line=\"125\"><f a=\"queue\">\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\x0A</f></Queue>\x0A\x09<Bulk public=\"1\" set=\"method\" line=\"129\"><f a=\"bulk\">\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A\x09<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\x0A</f></Bulk>\x0A\x09<ReadValue public=\"1\" set=\"method\" line=\"134\"><f a=\"\"><d/></f></ReadValue>\x0A\x09<ReadTable public=\"1\" set=\"method\" line=\"138\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\x0A\x09<Read public=\"1\" params=\"T\" set=\"method\" line=\"142\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"Read.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"Array\"><c path=\"Read.T\"/></c>\x0A</f></Read>\x0A\x09<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"146\"><f a=\"cl:?context\">\x0A\x09<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\x0A\x09<c path=\"nMorph.framework.orm.tools.Context\"/>\x0A\x09<c path=\"ReadOne.T\"/>\x0A</f></ReadOne>\x0A\x09<new public=\"1\" set=\"method\" line=\"22\"><f a=\"CurrentSQL:Sets\">\x0A\x09<c path=\"nMorph.framework.orm.lang.SQL\"/>\x0A\x09<c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.ISet\"/></c>\x0A\x09<x path=\"Void\"/>\x0A</f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var SQL
	 */
	public $CurrentSQL;
	/**
	 * @var ISet[]|\Array_hx
	 */
	public $Sets;

	/**
	 * @param SQL $CurrentSQL
	 * @param ISet[]|\Array_hx $Sets
	 * 
	 * @return void
	 */
	public function __construct ($CurrentSQL, $Sets) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:23: characters 9-37
		$this->CurrentSQL = $CurrentSQL;
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:24: characters 9-25
		$this->Sets = $Sets;
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:26: lines 26-28
		$_g = 0;
		while ($_g < $Sets->length) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:26: characters 13-16
			$set = ($Sets->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:26: lines 26-28
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:27: characters 13-42
			$set->RegisterQuery($CurrentSQL);
		}
	}

	/**
	 * @param BulkRun $bulk
	 * 
	 * @return BulkRun
	 */
	public function Bulk ($bulk) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:130: characters 9-50
		$bulk->set_queue($this->CurrentSQL->Queue($bulk->get_queue()));
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:131: characters 9-20
		return $bulk;
	}

	/**
	 * @return mixed
	 */
	public function Execute () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:118: characters 9-36
		return $this->CurrentSQL->Execute();
	}

	/**
	 * @param ISource $Source
	 * 
	 * @return FromClause
	 */
	public function FROM ($Source) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:32: characters 9-53
		$fc = new FromClause($this->CurrentSQL, $Source);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:33: characters 9-33
		$this->CurrentSQL->AddClause($fc);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:34: characters 9-18
		return $fc;
	}

	/**
	 * @param QueueItem[]|\Array_hx $queue
	 * 
	 * @return QueueItem[]|\Array_hx
	 */
	public function Queue ($queue) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:126: characters 9-39
		return $this->CurrentSQL->Queue($queue);
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public function Read ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:143: characters 9-44
		return $this->CurrentSQL->Read($cl, $context);
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed
	 */
	public function ReadOne ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:147: characters 9-47
		return $this->CurrentSQL->ReadOne($cl, $context);
	}

	/**
	 * @return QueryTable
	 */
	public function ReadTable () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:139: characters 9-38
		return $this->CurrentSQL->ReadTable();
	}

	/**
	 * @return mixed
	 */
	public function ReadValue () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:135: characters 9-38
		return $this->CurrentSQL->ReadValue();
	}

	/**
	 * @param Context $context
	 * 
	 * @return void
	 */
	public function Register ($context) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:122: characters 9-56
		$context->set_Queue($this->CurrentSQL->Queue($context->get_Queue()));
	}

	/**
	 * @return string
	 */
	public function SCRIPT () {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:44: characters 9-40
		return $this->CurrentSQL->GenerateAll();
	}

	/**
	 * @param string $args
	 * 
	 * @return void
	 */
	public function SCRIPT_PART ($args = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:48: characters 16-45
		$__hx__switch = ($this->CurrentSQL->getCurrentEngine()->index);
		if ($__hx__switch === 0) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:101: characters 17-44
			$this->CurrentSQL->AddBlock("SET ");
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:102: lines 102-105
			$_g = 0;
			$_g1 = $this->Sets;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:102: characters 22-25
				$set = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:102: lines 102-105
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:103: characters 21-38
				$set->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:104: characters 6-31
				$this->CurrentSQL->AddBlock(", ");
			}
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:106: lines 106-108
			if ($this->Sets->length > 0) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:107: characters 6-34
				$this->CurrentSQL->RemoveLastBlock();
			}
		} else if ($__hx__switch === 1) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:77: characters 17-44
			$this->CurrentSQL->AddBlock("SET ");
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:78: lines 78-81
			$_g = 0;
			$_g1 = $this->Sets;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:78: characters 22-25
				$set = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:78: lines 78-81
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:79: characters 21-38
				$set->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:80: characters 6-31
				$this->CurrentSQL->AddBlock(", ");
			}
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:82: lines 82-84
			if ($this->Sets->length > 0) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:83: characters 6-34
				$this->CurrentSQL->RemoveLastBlock();
			}
		} else if ($__hx__switch === 2) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:65: characters 17-44
			$this->CurrentSQL->AddBlock("SET ");
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:66: lines 66-69
			$_g = 0;
			$_g1 = $this->Sets;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:66: characters 22-25
				$set = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:66: lines 66-69
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:67: characters 21-38
				$set->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:68: characters 6-31
				$this->CurrentSQL->AddBlock(", ");
			}
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:70: lines 70-72
			if ($this->Sets->length > 0) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:71: characters 6-34
				$this->CurrentSQL->RemoveLastBlock();
			}
		} else if ($__hx__switch === 3) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:89: characters 17-44
			$this->CurrentSQL->AddBlock("SET ");
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:90: lines 90-93
			$_g = 0;
			$_g1 = $this->Sets;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:90: characters 22-25
				$set = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:90: lines 90-93
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:91: characters 21-38
				$set->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:92: characters 6-31
				$this->CurrentSQL->AddBlock(", ");
			}
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:94: lines 94-96
			if ($this->Sets->length > 0) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:95: characters 6-34
				$this->CurrentSQL->RemoveLastBlock();
			}
		} else if ($__hx__switch === 4) {
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:51: characters 17-44
			$this->CurrentSQL->AddBlock("SET ");
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:52: lines 52-55
			$_g = 0;
			$_g1 = $this->Sets;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:52: characters 22-25
				$set = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:52: lines 52-55
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:53: characters 21-38
				$set->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:54: characters 6-31
				$this->CurrentSQL->AddBlock(", ");
			}
			#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:56: lines 56-58
			if ($this->Sets->length > 0) {
				#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:57: characters 6-34
				$this->CurrentSQL->RemoveLastBlock();
			}
		}
	}

	/**
	 * @param ICondition $Condition
	 * 
	 * @return WhereClause
	 */
	public function WHERE ($Condition) {
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:38: characters 9-69
		$wc = new WhereClause($this->CurrentSQL, $Condition);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:39: characters 9-33
		$this->CurrentSQL->AddClause($wc);
		#5_framework\orm\src/nMorph/framework/orm/common/clauses/SetClause.hx:40: characters 9-18
		return $wc;
	}
}

Boot::registerClass(SetClause::class, 'nMorph.framework.orm.common.clauses.SetClause');
