<?php
/**
 * Generated by Haxe 4.2.2
 */

namespace nMorph\core\db\zhungo_core;

use \nMorph\framework\orm\lang\SQL;
use \nMorph\framework\orm\interfaces\ICondition;
use \nMorph\framework\orm\common\sentences\Val;
use \nMorph\framework\orm\client\ModelObject;
use \php\Boot;
use \nMorph\framework\orm\common\enums\Op;
use \nMorph\framework\orm\interfaces\ISource;
use \nMorph\framework\orm\common\conditions\Condition;
use \nMorph\framework\orm\common\sources\ViewSource;
use \nMorph\framework\orm\common\clauses\WhereClause;
use \nMorph\framework\orm\client\ChangeItem;
use \nMorph\framework\common\datatypes\UUID;
use \nMorph\framework\orm\common\fields\UUIDSentence;
use \nMorph\framework\orm\common\enums\NullableEnum;

/**
 * ...
 * @author Smartwork
 */
class SC_Update extends ModelObject {
	/**
	 * @var string
	 */
	static public $__rtti = "<class path=\"nMorph.core.db.zhungo_core.SC_Update\" params=\"\">\x0A\x09<extends path=\"nMorph.framework.orm.client.ModelObject\"/>\x0A\x09<view public=\"1\" expr=\"new ViewSource(&quot;SC_Update&quot;)\" line=\"33\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new ViewSource(\"SC_Update\")</e></m></meta>\x0A\x09\x09<haxe_doc>* referencia a vista para consultas</haxe_doc>\x0A\x09</view>\x0A\x09<col_LapsoID public=\"1\" expr=\"new UUIDSentence(&quot;SC_Update&quot;, &quot;LapsoID&quot;, NullableEnum.NOTNULL, true)\" line=\"37\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_Update\", \"LapsoID\", NullableEnum.NOTNULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna LapsoID</haxe_doc>\x0A\x09</col_LapsoID>\x0A\x09<col_ProductoID public=\"1\" expr=\"new UUIDSentence(&quot;SC_Update&quot;, &quot;ProductoID&quot;, NullableEnum.NOTNULL, false)\" line=\"42\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_Update\", \"ProductoID\", NullableEnum.NOTNULL, false)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna ProductoID</haxe_doc>\x0A\x09</col_ProductoID>\x0A\x09<col_IdRenovacion public=\"1\" expr=\"new UUIDSentence(&quot;SC_Update&quot;, &quot;IdRenovacion&quot;, NullableEnum.NULL, true)\" line=\"47\" static=\"1\">\x0A\x09\x09<c path=\"nMorph.framework.orm.common.fields.UUIDSentence\"/>\x0A\x09\x09<meta><m n=\":value\"><e>new UUIDSentence(\"SC_Update\", \"IdRenovacion\", NullableEnum.NULL, true)</e></m></meta>\x0A\x09\x09<haxe_doc>* Referencia a columna IdRenovacion</haxe_doc>\x0A\x09</col_IdRenovacion>\x0A\x09<WHERE public=\"1\" set=\"method\" line=\"55\" static=\"1\">\x0A\x09\x09<f a=\"Condition\">\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* inicio rápido de filtro\x0A\x09 * @param\x09Filtro\x0A\x09 * @return objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</WHERE>\x0A\x09<BYPK public=\"1\" set=\"method\" line=\"64\" static=\"1\">\x0A\x09\x09<f a=\"val_LapsoID:val_IdRenovacion\">\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09\x09<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\x0A\x09\x09</f>\x0A\x09\x09<haxe_doc>* filtro por clave primaria\x0A\x09 * @param\x09valor de clave primaria\x0A\x09 * @return  objeto para aplicar otras condiciones o ejecutar el query</haxe_doc>\x0A\x09</BYPK>\x0A\x09<LapsoID get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</LapsoID>\x0A\x09<get_LapsoID public=\"1\" set=\"method\" line=\"70\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_LapsoID>\x0A\x09<ProductoID get=\"accessor\" set=\"accessor\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</ProductoID>\x0A\x09<get_ProductoID public=\"1\" set=\"method\" line=\"77\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_ProductoID>\x0A\x09<set_ProductoID public=\"1\" set=\"method\" line=\"81\"><f a=\"value\">\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A</f></set_ProductoID>\x0A\x09<IdRenovacion get=\"accessor\" set=\"null\">\x0A\x09\x09<c path=\"nMorph.framework.common.datatypes.UUID\"/>\x0A\x09\x09<meta><m n=\":isVar\"/></meta>\x0A\x09</IdRenovacion>\x0A\x09<get_IdRenovacion public=\"1\" set=\"method\" line=\"91\"><f a=\"\"><c path=\"nMorph.framework.common.datatypes.UUID\"/></f></get_IdRenovacion>\x0A\x09<new public=\"1\" set=\"method\" line=\"25\">\x0A\x09\x09<f a=\"\"><x path=\"Void\"/></f>\x0A\x09\x09<haxe_doc>* Constructor de la clase SC_Update que tiene equivalencia con la tabla de la base de datos</haxe_doc>\x0A\x09</new>\x0A\x09<haxe_doc>* ...\x0A * @author Smartwork</haxe_doc>\x0A\x09<meta>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
	/**
	 * @var UUIDSentence
	 * Referencia a columna IdRenovacion
	 */
	static public $col_IdRenovacion;
	/**
	 * @var UUIDSentence
	 * Referencia a columna LapsoID
	 */
	static public $col_LapsoID;
	/**
	 * @var UUIDSentence
	 * Referencia a columna ProductoID
	 */
	static public $col_ProductoID;
	/**
	 * @var ISource
	 * referencia a vista para consultas
	 */
	static public $view;

	/**
	 * @var UUID
	 */
	public $IdRenovacion;
	/**
	 * @var UUID
	 */
	public $LapsoID;
	/**
	 * @var UUID
	 */
	public $ProductoID;

	/**
	 * filtro por clave primaria
	 * @param	valor de clave primaria
	 * @return  objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param UUID $val_LapsoID
	 * @param UUID $val_IdRenovacion
	 * 
	 * @return WhereClause
	 */
	public static function BYPK ($val_LapsoID, $val_IdRenovacion) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:65: characters 3-163
		return SQL::SELECT()->FROM(SC_Update::$view)->WHERE(Condition::SET(SC_Update::$col_LapsoID, Op::Equal(), Val::uuid($val_LapsoID))->AND_Ex(SC_Update::$col_IdRenovacion, Op::Equal(), Val::uuid($val_IdRenovacion)));
	}

	/**
	 * inicio rápido de filtro
	 * @param	Filtro
	 * @return objeto para aplicar otras condiciones o ejecutar el query
	 * 
	 * @param ICondition $Condition
	 * 
	 * @return WhereClause
	 */
	public static function WHERE ($Condition) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:56: characters 3-50
		return SQL::SELECT()->FROM(SC_Update::$view)->WHERE($Condition);
	}

	/**
	 * Constructor de la clase SC_Update que tiene equivalencia con la tabla de la base de datos
	 * 
	 * @return void
	 */
	public function __construct () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:27: characters 3-10
		parent::__construct();
	}

	/**
	 * @return UUID
	 */
	public function get_IdRenovacion () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:92: characters 3-22
		return $this->IdRenovacion;
	}

	/**
	 * @return UUID
	 */
	public function get_LapsoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:71: characters 3-17
		return $this->LapsoID;
	}

	/**
	 * @return UUID
	 */
	public function get_ProductoID () {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:78: characters 3-20
		return $this->ProductoID;
	}

	/**
	 * @param UUID $value
	 * 
	 * @return UUID
	 */
	public function set_ProductoID ($value) {
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:84: characters 3-114
		if ($this->get_TrackChanges() && ($this->get_ProductoID() !== $value)) {
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:84: characters 74-88
			$tmp = SC_Update::$col_ProductoID;
			#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:84: characters 49-114
			$this->AddChange(new ChangeItem($tmp, $this->get_ProductoID(), $value));
		}
		#3_data\db\src/nMorph/core/db/zhungo_core/SC_Update.hx:85: characters 3-26
		return $this->ProductoID = $value;
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


		self::$view = new ViewSource("SC_Update");
		self::$col_LapsoID = new UUIDSentence("SC_Update", "LapsoID", NullableEnum::NOTNULL(), true);
		self::$col_ProductoID = new UUIDSentence("SC_Update", "ProductoID", NullableEnum::NOTNULL(), false);
		self::$col_IdRenovacion = new UUIDSentence("SC_Update", "IdRenovacion", NullableEnum::NULL(), true);
	}
}

Boot::registerClass(SC_Update::class, 'nMorph.core.db.zhungo_core.SC_Update');
Boot::registerGetters('nMorph\\core\\db\\zhungo_core\\SC_Update', [
	'IdRenovacion' => true,
	'ProductoID' => true,
	'LapsoID' => true
]);
Boot::registerSetters('nMorph\\core\\db\\zhungo_core\\SC_Update', [
	'ProductoID' => true
]);
SC_Update::__hx__init();