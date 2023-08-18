// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.fields {
	public class DateTimeSentence : global::nMorph.framework.orm.common.sentences.FieldSentence {
		
		static DateTimeSentence() {
			global::nMorph.framework.orm.common.fields.DateTimeSentence.__rtti = "<class path=\"nMorph.framework.orm.common.fields.DateTimeSentence\" params=\"\">\n\t<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t<ValidateDBCompatibility public=\"1\" set=\"method\" line=\"20\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<x path=\"Void\"/>\n</f></ValidateDBCompatibility>\n\t<Equals public=\"1\" set=\"method\" line=\"30\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Equals>\n\t<Different public=\"1\" set=\"method\" line=\"35\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Different>\n\t<LessThan public=\"1\" set=\"method\" line=\"40\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThan>\n\t<LessThanAndEquals public=\"1\" set=\"method\" line=\"45\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></LessThanAndEquals>\n\t<MoreThan public=\"1\" set=\"method\" line=\"50\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThan>\n\t<MoreThanAndEquals public=\"1\" set=\"method\" line=\"55\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></MoreThanAndEquals>\n\t<IsNull public=\"1\" set=\"method\" line=\"60\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNull>\n\t<IsNotNull public=\"1\" set=\"method\" line=\"64\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNotNull>\n\t<SET public=\"1\" set=\"method\" line=\"68\"><f a=\"DateValue\">\n\t<c path=\"Date\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISet\"/>\n</f></SET>\n\t<new public=\"1\" set=\"method\" line=\"16\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\n\t<x path=\"Bool\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keep\"/>\n\t</meta>\n</class>";
		}
		
		
		public DateTimeSentence(global::haxe.lang.EmptyObject empty) : base(global::haxe.lang.EmptyObject.EMPTY) {
		}
		
		
		public DateTimeSentence(string FieldTable, string FieldName, global::nMorph.framework.orm.common.enums.NullableEnum Nullable, bool IsPrimaryKey) : base(global::haxe.lang.EmptyObject.EMPTY) {
			global::nMorph.framework.orm.common.fields.DateTimeSentence.__hx_ctor_nMorph_framework_orm_common_fields_DateTimeSentence(this, FieldTable, FieldName, Nullable, IsPrimaryKey);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_fields_DateTimeSentence(global::nMorph.framework.orm.common.fields.DateTimeSentence __hx_this, string FieldTable, string FieldName, global::nMorph.framework.orm.common.enums.NullableEnum Nullable, bool IsPrimaryKey) {
			global::nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, global::nMorph.framework.orm.common.enums.DBTypeEnum.DATETIME, global::nMorph.framework.orm.common.enums.HaxeTypeEnum.DATE, default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>), Nullable, IsPrimaryKey);
		}
		
		
		public static new string __rtti;
		
		public virtual void ValidateDBCompatibility(global::Date DateValue) {
			unchecked {
				if (( DateValue.date.Year < 1753 )) {
					global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(50006, "Date not compatible with Database, Date is less than year 1753");
				}
				
				if (( DateValue.date.Year > 9999 )) {
					global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(50007, "Date not compatible with Database, Date is more than year 9999");
				}
				
			}
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition Equals(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Equal, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition Different(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Different, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition LessThan(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.LessThan, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition LessThanAndEquals(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.LessThanAndEquals, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition MoreThan(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.MoreThan, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition MoreThanAndEquals(global::Date DateValue) {
			this.ValidateDBCompatibility(DateValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.MoreThanAndEquals, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition IsNull() {
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Equal, global::nMorph.framework.orm.common.sentences.Val.date(null));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition IsNotNull() {
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Different, global::nMorph.framework.orm.common.sentences.Val.date(null));
		}
		
		
		public virtual global::nMorph.framework.orm.interfaces.ISet SET(global::Date DateValue) {
			global::nMorph.framework.orm.interfaces.ISet asg = global::nMorph.framework.orm.common.sentences.Assign.SET(this, global::nMorph.framework.orm.common.sentences.Val.date(DateValue));
			return asg;
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 4142978:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SET", 4142978)) );
					}
					
					
					case 1678411344:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "IsNotNull", 1678411344)) );
					}
					
					
					case 453629873:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "IsNull", 453629873)) );
					}
					
					
					case 1253923808:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "MoreThanAndEquals", 1253923808)) );
					}
					
					
					case 804763062:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "MoreThan", 804763062)) );
					}
					
					
					case 979246492:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "LessThanAndEquals", 979246492)) );
					}
					
					
					case 1290148730:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "LessThan", 1290148730)) );
					}
					
					
					case 1256505177:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Different", 1256505177)) );
					}
					
					
					case 1955029599:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Equals", 1955029599)) );
					}
					
					
					case 475410908:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "ValidateDBCompatibility", 475410908)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, object[] dynargs) {
			unchecked {
				switch (hash) {
					case 4142978:
					{
						return this.SET(((global::Date) (dynargs[0]) ));
					}
					
					
					case 1678411344:
					{
						return this.IsNotNull();
					}
					
					
					case 453629873:
					{
						return this.IsNull();
					}
					
					
					case 1253923808:
					{
						return this.MoreThanAndEquals(((global::Date) (dynargs[0]) ));
					}
					
					
					case 804763062:
					{
						return this.MoreThan(((global::Date) (dynargs[0]) ));
					}
					
					
					case 979246492:
					{
						return this.LessThanAndEquals(((global::Date) (dynargs[0]) ));
					}
					
					
					case 1290148730:
					{
						return this.LessThan(((global::Date) (dynargs[0]) ));
					}
					
					
					case 1256505177:
					{
						return this.Different(((global::Date) (dynargs[0]) ));
					}
					
					
					case 1955029599:
					{
						return this.Equals(((global::Date) (dynargs[0]) ));
					}
					
					
					case 475410908:
					{
						this.ValidateDBCompatibility(((global::Date) (dynargs[0]) ));
						break;
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
	}
}


