<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\framework\orm\common\fields;

use \nMorph\framework\orm\common\sentences\Val;
use \php\Boot;
use \nMorph\framework\orm\common\enums\Op;
use \nMorph\framework\orm\common\enums\DBTypeEnum;
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\sentences\FieldSentence;
use \nMorph\framework\orm\common\enums\HaxeTypeEnum;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\enums\NullableEnum;

class UUIDSentence extends FieldSentence {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.framework.orm.common.fields.UUIDSentence\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\x0A\x09<eq public=\"1\" set=\"method\" line=\"18\"><f a=\"UUIDValue\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\x0A</f></eq>\x0A\x09<new public=\"1\" set=\"method\" line=\"14\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"String\"/>\x0A\x09<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\x0A\x09<x path=\"Bool\"/>\x0A\x09<x path=\"Void\"/>\x0A</f></new>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keep\"/>\x0A\x09</meta>\x0A</class>";

	/**
	 * @param string $FieldTable
	 * @param string $FieldName
	 * @param NullableEnum $Nullable
	 * @param bool $IsPrimaryKey
	 * 
	 * @return void
	 */
	public function __construct ($FieldTable, $FieldName, $Nullable, $IsPrimaryKey) {
		#5_framework\orm\src/nMorph/framework/orm/common/fields/UUIDSentence.hx:15: characters 9-109
		parent::__construct($FieldTable, $FieldName, DBTypeEnum::UUID(), HaxeTypeEnum::UUID(), null, null, $Nullable, $IsPrimaryKey);
	}

	/**
	 * @param UUID $UUIDValue
	 * 
	 * @return Condition
	 */
	public function eq ($UUIDValue) {
		#5_framework\orm\src/nMorph/framework/orm/common/fields/UUIDSentence.hx:19: characters 9-66
		return Condition::SET($this, Op::Equal(), Val::uuid($UUIDValue));
	}
}

Boot::registerClass(UUIDSentence::class, 'nMorph.framework.orm.common.fields.UUIDSentence');
