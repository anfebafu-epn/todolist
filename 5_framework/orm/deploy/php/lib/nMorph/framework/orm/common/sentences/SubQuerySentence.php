<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\sentences;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ISentence;
use \php\Boot;
use \nMorph\framework\orm\interfaces\IClause;
use \nMorph\framework\orm\interfaces\ILang;

class SubQuerySentence implements ISentence {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.common.sentences.SubQuerySentence\" params=\"\">\x0A\x09<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\x0A\x09<SET public=\"1\" set=\"method\" line=\"24\" static=\"1\"><f a=\"InnerClause\">\x0A\x09<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\x0A</f></SET>\x0A\x09<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\x0A\x09<InnerClause><c path=\"nMorph.framework.orm.interfaces.IClause\"/></InnerClause>\x0A\x09<IsNullValue public=\"1\" set=\"method\" line=\"20\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\x0A\x09<RegisterQuery public=\"1\" set=\"method\" line=\"29\"><f a=\"CurrentSQL\">\x0A\x09<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></RegisterQuery>\x0A\x09<SCRIPT_PART public=\"1\" set=\"method\" line=\"33\"><f a=\"?args\">\x0A\x09<c path=\"String\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></SCRIPT_PART>\x0A\x09<new public=\"1\" set=\"method\" line=\"16\"><f a=\"InnerClause\">\x0A\x09<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @var SQL
	 */
	public $CurrentSQL;
	/**
	 * @var IClause
	 */
	public $InnerClause;

	/**
	 * @param IClause $InnerClause
	 * 
	 * @return ISentence
	 */
	public static function SET ($InnerClause) {
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:25: characters 9-70
		$sqs = new SubQuerySentence($InnerClause);
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:26: characters 9-19
		return $sqs;
	}

	/**
	 * @param IClause $InnerClause
	 * 
	 * @return void
	 */
	public function __construct ($InnerClause) {
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:17: characters 9-39
		$this->InnerClause = $InnerClause;
	}

	/**
	 * @return bool
	 */
	public function IsNullValue () {
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:21: characters 9-21
		return false;
	}

	/**
	 * @param ILang $CurrentSQL
	 * 
	 * @return void
	 */
	public function RegisterQuery ($CurrentSQL) {
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:30: characters 9-48
		$this->CurrentSQL = Boot::typedCast(Boot::getClass(SQL::class), $CurrentSQL);
	}

	/**
	 * @param string $args
	 * 
	 * @return void
	 */
	public function SCRIPT_PART ($args = null) {
		#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:35: characters 16-45
		$__hx__switch = ($this->CurrentSQL->getCurrentEngine()->index);
		if ($__hx__switch === 0) {
			#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:46: characters 17-70
			$this->CurrentSQL->AddBlock("(" . ($this->InnerClause->SCRIPT()??'null') . ")");
		} else if ($__hx__switch === 1) {
			#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:42: characters 17-70
			$this->CurrentSQL->AddBlock("(" . ($this->InnerClause->SCRIPT()??'null') . ")");
		} else if ($__hx__switch === 2) {
			#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:40: characters 17-70
			$this->CurrentSQL->AddBlock("(" . ($this->InnerClause->SCRIPT()??'null') . ")");
		} else if ($__hx__switch === 3) {
			#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:44: characters 17-70
			$this->CurrentSQL->AddBlock("(" . ($this->InnerClause->SCRIPT()??'null') . ")");
		} else if ($__hx__switch === 4) {
			#5_framework\orm\src/nMorph/framework/orm/common/sentences/SubQuerySentence.hx:38: characters 17-70
			$this->CurrentSQL->AddBlock("(" . ($this->InnerClause->SCRIPT()??'null') . ")");
		}
	}
}

Boot::registerClass(SubQuerySentence::class, 'nMorph.framework.orm.common.sentences.SubQuerySentence');