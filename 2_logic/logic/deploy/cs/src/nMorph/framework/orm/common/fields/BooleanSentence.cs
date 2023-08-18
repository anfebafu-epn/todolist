// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.fields {
	public class BooleanSentence : global::nMorph.framework.orm.common.sentences.FieldSentence {
		
		static BooleanSentence() {
			global::nMorph.framework.orm.common.fields.BooleanSentence.__rtti = "<class path=\"nMorph.framework.orm.common.fields.BooleanSentence\" params=\"\">\n\t<extends path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t<ValidateDBCompatibility public=\"1\" set=\"method\" line=\"19\"><f a=\"boolValue\">\n\t<x path=\"Bool\"/>\n\t<x path=\"Void\"/>\n</f></ValidateDBCompatibility>\n\t<Equals public=\"1\" set=\"method\" line=\"23\"><f a=\"boolValue\">\n\t<x path=\"Bool\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.Condition\"/>\n</f></Equals>\n\t<IsNull public=\"1\" set=\"method\" line=\"28\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNull>\n\t<IsNotNull public=\"1\" set=\"method\" line=\"32\"><f a=\"\"><c path=\"nMorph.framework.orm.common.conditions.Condition\"/></f></IsNotNull>\n\t<SET public=\"1\" set=\"method\" line=\"36\"><f a=\"boolValue\">\n\t<x path=\"Bool\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISet\"/>\n</f></SET>\n\t<new public=\"1\" set=\"method\" line=\"15\"><f a=\"FieldTable:FieldName:Nullable:IsPrimaryKey\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.NullableEnum\"/>\n\t<x path=\"Bool\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keep\"/>\n\t</meta>\n</class>";
		}
		
		
		public BooleanSentence(global::haxe.lang.EmptyObject empty) : base(global::haxe.lang.EmptyObject.EMPTY) {
		}
		
		
		public BooleanSentence(string FieldTable, string FieldName, global::nMorph.framework.orm.common.enums.NullableEnum Nullable, bool IsPrimaryKey) : base(global::haxe.lang.EmptyObject.EMPTY) {
			global::nMorph.framework.orm.common.fields.BooleanSentence.__hx_ctor_nMorph_framework_orm_common_fields_BooleanSentence(this, FieldTable, FieldName, Nullable, IsPrimaryKey);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_fields_BooleanSentence(global::nMorph.framework.orm.common.fields.BooleanSentence __hx_this, string FieldTable, string FieldName, global::nMorph.framework.orm.common.enums.NullableEnum Nullable, bool IsPrimaryKey) {
			global::nMorph.framework.orm.common.sentences.FieldSentence.__hx_ctor_nMorph_framework_orm_common_sentences_FieldSentence(__hx_this, FieldTable, FieldName, global::nMorph.framework.orm.common.enums.DBTypeEnum.BOOLEAN, global::nMorph.framework.orm.common.enums.HaxeTypeEnum.BOOL, default(global::haxe.lang.Null<int>), default(global::haxe.lang.Null<int>), Nullable, IsPrimaryKey);
		}
		
		
		public static new string __rtti;
		
		public virtual void ValidateDBCompatibility(bool boolValue) {
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition Equals(bool boolValue) {
			this.ValidateDBCompatibility(boolValue);
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Equal, global::nMorph.framework.orm.common.sentences.Val.@bool(new global::haxe.lang.Null<bool>(boolValue, true)));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition IsNull() {
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Equal, global::nMorph.framework.orm.common.sentences.Val.@bool(default(global::haxe.lang.Null<bool>)));
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.Condition IsNotNull() {
			return global::nMorph.framework.orm.common.conditions.Condition.SET(this, global::nMorph.framework.orm.common.enums.Op.Different, global::nMorph.framework.orm.common.sentences.Val.@bool(default(global::haxe.lang.Null<bool>)));
		}
		
		
		public virtual global::nMorph.framework.orm.interfaces.ISet SET(bool boolValue) {
			global::nMorph.framework.orm.interfaces.ISet asg = global::nMorph.framework.orm.common.sentences.Assign.SET(this, global::nMorph.framework.orm.common.sentences.Val.@bool(new global::haxe.lang.Null<bool>(boolValue, true)));
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
						return this.SET(global::haxe.lang.Runtime.toBool(dynargs[0]));
					}
					
					
					case 1678411344:
					{
						return this.IsNotNull();
					}
					
					
					case 453629873:
					{
						return this.IsNull();
					}
					
					
					case 1955029599:
					{
						return this.Equals(global::haxe.lang.Runtime.toBool(dynargs[0]));
					}
					
					
					case 475410908:
					{
						this.ValidateDBCompatibility(global::haxe.lang.Runtime.toBool(dynargs[0]));
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

