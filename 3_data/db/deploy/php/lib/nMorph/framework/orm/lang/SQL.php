<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\lang;

use \nMorph\framework\orm\interfaces\ISentence;
use \php\Boot;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\common\clauses\JoinClause;
use \nMorph\framework\orm\configuration\DatabaseEngineEnum;
use \nMorph\framework\orm\common\clauses\CustomClause;
use \nMorph\framework\orm\client\QueryBlock;
use \nMorph\framework\orm\client\QueryParameter;
use \nMorph\framework\orm\configuration\Configuration;
use \nMorph\framework\orm\interfaces\IClause;
use \nMorph\framework\orm\common\clauses\UpdateClause;
use \nMorph\framework\orm\interfaces\ILang;
use \nMorph\framework\orm\common\clauses\InsertIntoClause;
use \nMorph\framework\orm\client\QueryTable;
use \nMorph\framework\orm\common\clauses\UnionClause;
use \nMorph\framework\orm\common\clauses\SelectClause;
use \nMorph\framework\orm\client\QueueItem;
use \nMorph\framework\orm\common\clauses\DeleteClause;
use \haxe\ds\StringMap;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\client\Connector;
use \nMorph\framework\orm\tools\Context;

/**
 * ...
 * @author ...
 */
class SQL implements ILang {
	/**
	 * @var ISentence[]|\Array_hx
	 */
	static public $AllColumns;

	/**
	 * @var IClause[]|\Array_hx
	 */
	public $Clauses;
	/**
	 * @var string[]|\Array_hx
	 */
	public $GeneratedBlocks;
	/**
	 * @var QueryParameter[]|\Array_hx
	 */
	public $Parameters;
	/**
	 * @var QueryBlock[]|\Array_hx
	 */
	public $QueryBlocks;
	/**
	 * @var UUID
	 */
	public $UniqueQueryNumber;
	/**
	 * @var Configuration
	 */
	public $cf;

	/**
	 * @param StringMap $CustomQueries
	 * @param QueryParameter[]|\Array_hx $Parameters
	 * 
	 * @return CustomClause
	 */
	public static function CUSTOM ($CustomQueries, $Parameters) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:101: characters 3-30
		$CurrentSQL = new SQL();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:102: characters 3-80
		$cc = new CustomClause($CurrentSQL, $CustomQueries, $Parameters);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:103: characters 3-27
		$CurrentSQL->AddClause($cc);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:104: characters 3-12
		return $cc;
	}

	/**
	 * @param UUID $UniqueQueryNumber
	 * 
	 * @return DeleteClause
	 */
	public static function DELETE ($UniqueQueryNumber = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:91: characters 3-30
		$CurrentSQL = new SQL();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:93: characters 3-55
		$dc = new DeleteClause($CurrentSQL);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:94: characters 3-27
		$CurrentSQL->AddClause($dc);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:95: characters 3-51
		$CurrentSQL->UniqueQueryNumber = $UniqueQueryNumber;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:97: characters 3-12
		return $dc;
	}

	/**
	 * @param ISource $Into
	 * @param UUID $UniqueQueryNumber
	 * 
	 * @return InsertIntoClause
	 */
	public static function INSERT ($Into, $UniqueQueryNumber = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:66: characters 3-30
		$CurrentSQL = new SQL();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:68: characters 3-69
		$ic = new InsertIntoClause($CurrentSQL, $Into);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:70: characters 3-27
		$CurrentSQL->AddClause($ic);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:71: characters 3-51
		$CurrentSQL->UniqueQueryNumber = $UniqueQueryNumber;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:73: characters 3-12
		return $ic;
	}

	/**
	 * @param ISentence[]|\Array_hx $Sentences
	 * @param UUID $UniqueQueryNumber
	 * 
	 * @return SelectClause
	 */
	public static function SELECT ($Sentences = null, $UniqueQueryNumber = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:49: characters 3-30
		$CurrentSQL = new SQL();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:52: lines 52-53
		if ($Sentences === null) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:53: characters 4-18
			$Sentences = new \Array_hx();
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:55: characters 3-65
		$sc = new SelectClause($CurrentSQL, $Sentences);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:57: characters 3-27
		$CurrentSQL->AddClause($sc);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:58: characters 3-51
		$CurrentSQL->UniqueQueryNumber = $UniqueQueryNumber;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:60: characters 3-12
		return $sc;
	}

	/**
	 * @param ISource $UpdateSource
	 * @param UUID $UniqueQueryNumber
	 * 
	 * @return UpdateClause
	 */
	public static function UPDATE ($UpdateSource, $UniqueQueryNumber = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:79: characters 3-30
		$CurrentSQL = new SQL();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:81: characters 3-69
		$uc = new UpdateClause($CurrentSQL, $UpdateSource);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:83: characters 3-27
		$CurrentSQL->AddClause($uc);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:84: characters 3-51
		$CurrentSQL->UniqueQueryNumber = $UniqueQueryNumber;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:85: characters 3-12
		return $uc;
	}

	/**
	 * @return void
	 */
	public function __construct () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:35: characters 39-43
		$this->UniqueQueryNumber = null;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:34: characters 47-66
		$this->GeneratedBlocks = new \Array_hx();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:33: characters 46-69
		$this->QueryBlocks = new \Array_hx();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:32: characters 49-76
		$this->Parameters = new \Array_hx();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:31: characters 39-59
		$this->Clauses = new \Array_hx();
	}

	/**
	 * @param string $Block
	 * 
	 * @return void
	 */
	public function AddBlock ($Block) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:126: characters 3-30
		$_this = $this->GeneratedBlocks;
		$_this->arr[$_this->length++] = $Block;
	}

	/**
	 * @param IClause $Clause
	 * 
	 * @return void
	 */
	public function AddClause ($Clause) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:109: characters 3-23
		$_this = $this->Clauses;
		$_this->arr[$_this->length++] = $Clause;
	}

	/**
	 * @param QueryParameter $p
	 * 
	 * @return string
	 */
	public function AddParameter ($p) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:114: characters 3-21
		$_this = $this->Parameters;
		$_this->arr[$_this->length++] = $p;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:116: characters 3-52
		$p->set_ParameterName("P" . (UUID::newUUID()->getShort()??'null'));
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:117: characters 3-25
		return $p->get_ParameterName();
	}

	/**
	 * @param QueryBlock $b
	 * 
	 * @return void
	 */
	public function AddQueryBlock ($b) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:122: characters 3-22
		$_this = $this->QueryBlocks;
		$_this->arr[$_this->length++] = $b;
	}

	/**
	 * @param Class $t
	 * 
	 * @return bool
	 */
	public function ContainsClause ($t) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:130: lines 130-133
		$_g = 0;
		$_g1 = $this->Clauses;
		while ($_g < $_g1->length) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:130: characters 8-14
			$clause = ($_g1->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:130: lines 130-133
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:131: lines 131-132
			if (\Type::getClass($clause) === $t) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:132: characters 4-15
				return true;
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:134: characters 3-15
		return false;
	}

	/**
	 * @return mixed
	 */
	public function Execute () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:225: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:226: characters 3-53
		return Connector::Execute($GeneratedSQL, $this->Parameters);
	}

	/**
	 * @return string
	 */
	public function GenerateAll () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:147: characters 11-76
		$__hx__switch = (Configuration::$Data->get_CurrentDatabaseConnection()->get_DatabaseEngine()->index);
		if ($__hx__switch === 0) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:190: characters 5-21
			$Script = "";
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:192: lines 192-196
			$_g = 0;
			$_g1 = $this->Clauses;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:192: characters 10-16
				$clause = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:192: lines 192-196
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:194: characters 6-26
				$clause->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:195: characters 6-20
				$this->AddBlock("\x0A");
			}
		} else if ($__hx__switch === 1) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:170: characters 5-21
			$Script = "";
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:172: lines 172-176
			$_g = 0;
			$_g1 = $this->Clauses;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:172: characters 10-16
				$clause = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:172: lines 172-176
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:174: characters 6-26
				$clause->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:175: characters 6-20
				$this->AddBlock("\x0A");
			}
		} else if ($__hx__switch === 2) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:160: characters 5-21
			$Script = "";
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:162: lines 162-166
			$_g = 0;
			$_g1 = $this->Clauses;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:162: characters 10-16
				$clause = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:162: lines 162-166
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:164: characters 6-26
				$clause->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:165: characters 6-20
				$this->AddBlock("\x0A");
			}
		} else if ($__hx__switch === 3) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:180: characters 5-21
			$Script = "";
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:182: lines 182-186
			$_g = 0;
			$_g1 = $this->Clauses;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:182: characters 10-16
				$clause = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:182: lines 182-186
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:184: characters 6-26
				$clause->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:185: characters 6-20
				$this->AddBlock("\x0A");
			}
		} else if ($__hx__switch === 4) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:150: characters 5-21
			$Script = "";
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:152: lines 152-156
			$_g = 0;
			$_g1 = $this->Clauses;
			while ($_g < $_g1->length) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:152: characters 10-16
				$clause = ($_g1->arr[$_g] ?? null);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:152: lines 152-156
				++$_g;
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:154: characters 6-26
				$clause->SCRIPT_PART();
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:155: characters 6-20
				$this->AddBlock("\x0A");
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:203: characters 3-24
		$FinalScript = "";
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:205: lines 205-218
		$_g = 0;
		$_g1 = $this->GeneratedBlocks;
		while ($_g < $_g1->length) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:205: characters 8-17
			$CodeBlock = ($_g1->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:205: lines 205-218
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:209: lines 209-217
			if (\StringTools::startsWith($CodeBlock, "{{")) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:210: characters 22-71
				$_this = $this->QueryBlocks;
				$result = [];
				$data = $_this->arr;
				$_g_current = 0;
				$_g_length = \count($data);
				$_g_data = $data;
				while ($_g_current < $_g_length) {
					$item = $_g_data[$_g_current++];
					if ($item->get_BlockName() === $CodeBlock) {
						$result[] = $item;
					}
				}
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:210: characters 5-72
				$BlockFound = \Array_hx::wrap($result);
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:211: lines 211-213
				if ($BlockFound->length > 0) {
					#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:212: characters 6-34
					$FinalScript = ($FinalScript??'null') . \Std::string(($BlockFound->arr[0] ?? null));
				}
			} else {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:216: characters 5-29
				$FinalScript = ($FinalScript??'null') . ($CodeBlock??'null');
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:220: characters 3-21
		return $FinalScript;
	}

	/**
	 * @param QueueItem[]|\Array_hx $queue
	 * 
	 * @return QueueItem[]|\Array_hx
	 */
	public function Queue ($queue) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:231: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:232: characters 3-58
		return Connector::Queue($GeneratedSQL, $this->Parameters, $queue);
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed[]|\Array_hx
	 */
	public function Read ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:254: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:258: characters 3-35
		$MultipleTables = false;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:260: lines 260-275
		$_g = 0;
		$_g1 = $this->Clauses;
		while ($_g < $_g1->length) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:260: characters 8-14
			$clause = ($_g1->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:260: lines 260-275
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:263: lines 263-272
			if (\Type::getClass($clause) === Boot::getClass(JoinClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:264: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(UnionClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:266: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(InsertIntoClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:268: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(UpdateClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:270: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(DeleteClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:272: characters 5-26
				$MultipleTables = true;
			}
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:274: characters 4-29
			if ($MultipleTables) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:274: characters 24-29
				break;
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:277: lines 277-283
		if ($MultipleTables) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:279: characters 4-61
			return Connector::Read($GeneratedSQL, $this->Parameters, $cl, null);
		} else {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:282: characters 4-64
			return Connector::Read($GeneratedSQL, $this->Parameters, $cl, $context);
		}
	}

	/**
	 * @param Class $cl
	 * @param Context $context
	 * 
	 * @return mixed
	 */
	public function ReadOne ($cl, $context = null) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:293: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:295: characters 3-35
		$MultipleTables = false;
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:297: lines 297-311
		$_g = 0;
		$_g1 = $this->Clauses;
		while ($_g < $_g1->length) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:297: characters 8-14
			$clause = ($_g1->arr[$_g] ?? null);
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:297: lines 297-311
			++$_g;
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:299: lines 299-308
			if (\Type::getClass($clause) === Boot::getClass(JoinClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:300: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(UnionClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:302: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(InsertIntoClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:304: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(UpdateClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:306: characters 5-26
				$MultipleTables = true;
			} else if (\Type::getClass($clause) === Boot::getClass(DeleteClause::class)) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:308: characters 5-26
				$MultipleTables = true;
			}
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:310: characters 4-29
			if ($MultipleTables) {
				#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:310: characters 24-29
				break;
			}
		}
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:313: lines 313-319
		if ($MultipleTables) {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:315: characters 4-64
			return Connector::ReadOne($GeneratedSQL, $this->Parameters, $cl, null);
		} else {
			#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:318: characters 4-67
			return Connector::ReadOne($GeneratedSQL, $this->Parameters, $cl, $context);
		}
	}

	/**
	 * @return QueryTable
	 */
	public function ReadTable () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:243: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:244: characters 3-55
		return Connector::ReadTable($GeneratedSQL, $this->Parameters);
	}

	/**
	 * @return mixed
	 */
	public function ReadValue () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:237: characters 3-36
		$GeneratedSQL = $this->GenerateAll();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:238: characters 3-55
		return Connector::ReadValue($GeneratedSQL, $this->Parameters);
	}

	/**
	 * @param Context $context
	 * 
	 * @return void
	 */
	public function Register ($context) {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:340: characters 3-38
		$queue = new \Array_hx();
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:341: characters 3-23
		$queue = $this->Queue($queue);
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:342: characters 3-30
		$context->get_Queue()->concat($queue);
	}

	/**
	 * @return void
	 */
	public function RemoveLastBlock () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:138: characters 3-24
		$_this = $this->GeneratedBlocks;
		if ($_this->length > 0) {
			$_this->length--;
		}
		\array_pop($_this->arr);
	}

	/**
	 * @return DatabaseEngineEnum
	 */
	public function getCurrentEngine () {
		#5_framework\orm\src/nMorph/framework/orm/lang/SQL.hx:324: characters 3-75
		return Configuration::$Data->get_CurrentDatabaseConnection()->get_DatabaseEngine();
	}

	/**
	 * @internal
	 * @access private
	 */
	static public function __hx__init ()
	{
		static $called = false;
		if ($called) return;
		$called = true;


		self::$AllColumns = new \Array_hx();
	}
}

Boot::registerClass(SQL::class, 'nMorph.framework.orm.lang.SQL');
SQL::__hx__init();
