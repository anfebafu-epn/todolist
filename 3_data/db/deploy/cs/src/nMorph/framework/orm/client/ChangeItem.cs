// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.client {
	public class ChangeItem : global::haxe.lang.HxObject {
		
		static ChangeItem() {
			global::nMorph.framework.orm.client.ChangeItem.__rtti = "<class path=\"nMorph.framework.orm.client.ChangeItem\" params=\"\">\n\t<Field public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</Field>\n\t<OldValue public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<d/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</OldValue>\n\t<NewValue public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<d/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</NewValue>\n\t<set_Field set=\"method\" line=\"17\"><f a=\"value\">\n\t<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n</f></set_Field>\n\t<get_Field set=\"method\" line=\"21\"><f a=\"\"><c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/></f></get_Field>\n\t<set_OldValue set=\"method\" line=\"25\"><f a=\"value\">\n\t<d/>\n\t<unknown/>\n</f></set_OldValue>\n\t<get_OldValue set=\"method\" line=\"29\"><f a=\"\"><d/></f></get_OldValue>\n\t<get_NewValue set=\"method\" line=\"33\"><f a=\"\"><d/></f></get_NewValue>\n\t<set_NewValue set=\"method\" line=\"37\"><f a=\"value\">\n\t<d/>\n\t<unknown/>\n</f></set_NewValue>\n\t<new public=\"1\" set=\"method\" line=\"7\"><f a=\"?Field:?OldValue:?NewValue\">\n\t<c path=\"nMorph.framework.orm.common.sentences.FieldSentence\"/>\n\t<d/>\n\t<d/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public ChangeItem(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ChangeItem(global::nMorph.framework.orm.common.sentences.FieldSentence Field, object OldValue, object NewValue) {
			global::nMorph.framework.orm.client.ChangeItem.__hx_ctor_nMorph_framework_orm_client_ChangeItem(this, Field, OldValue, NewValue);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_client_ChangeItem(global::nMorph.framework.orm.client.ChangeItem __hx_this, global::nMorph.framework.orm.common.sentences.FieldSentence Field, object OldValue, object NewValue) {
			__hx_this.set_Field(Field);
			__hx_this.set_OldValue(OldValue);
			__hx_this.set_NewValue(NewValue);
		}
		
		
		public static string __rtti;
		
		public global::nMorph.framework.orm.common.sentences.FieldSentence Field;
		
		public object OldValue;
		
		public object NewValue;
		
		public virtual global::nMorph.framework.orm.common.sentences.FieldSentence set_Field(global::nMorph.framework.orm.common.sentences.FieldSentence @value) {
			return this.Field = @value;
		}
		
		
		public virtual global::nMorph.framework.orm.common.sentences.FieldSentence get_Field() {
			return this.Field;
		}
		
		
		public virtual object set_OldValue(object @value) {
			return this.OldValue = @value;
		}
		
		
		public virtual object get_OldValue() {
			return this.OldValue;
		}
		
		
		public virtual object get_NewValue() {
			return this.NewValue;
		}
		
		
		public virtual object set_NewValue(object @value) {
			return this.NewValue = @value;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 783580945:
					{
						if (handleProperties) {
							this.set_NewValue(@value);
							return @value;
						}
						else {
							this.NewValue = ((object) (@value) );
							return @value;
						}
						
					}
					
					
					case 1916097898:
					{
						if (handleProperties) {
							this.set_OldValue(@value);
							return @value;
						}
						else {
							this.OldValue = ((object) (@value) );
							return @value;
						}
						
					}
					
					
					default:
					{
						return base.__hx_setField_f(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 783580945:
					{
						if (handleProperties) {
							this.set_NewValue(@value);
							return @value;
						}
						else {
							this.NewValue = ((object) (@value) );
							return @value;
						}
						
					}
					
					
					case 1916097898:
					{
						if (handleProperties) {
							this.set_OldValue(@value);
							return @value;
						}
						else {
							this.OldValue = ((object) (@value) );
							return @value;
						}
						
					}
					
					
					case 331416730:
					{
						if (handleProperties) {
							this.set_Field(((global::nMorph.framework.orm.common.sentences.FieldSentence) (@value) ));
							return @value;
						}
						else {
							this.Field = ((global::nMorph.framework.orm.common.sentences.FieldSentence) (@value) );
							return @value;
						}
						
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2026329742:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_NewValue", 2026329742)) );
					}
					
					
					case 1674457882:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_NewValue", 1674457882)) );
					}
					
					
					case 659491187:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_OldValue", 659491187)) );
					}
					
					
					case 1011363047:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_OldValue", 1011363047)) );
					}
					
					
					case 1466589425:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_Field", 1466589425)) );
					}
					
					
					case 985353469:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_Field", 985353469)) );
					}
					
					
					case 783580945:
					{
						return ( (handleProperties) ? (this.get_NewValue()) : (this.NewValue) );
					}
					
					
					case 1916097898:
					{
						return ( (handleProperties) ? (this.get_OldValue()) : (this.OldValue) );
					}
					
					
					case 331416730:
					{
						return ( (handleProperties) ? (this.get_Field()) : (this.Field) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override double __hx_getField_f(string field, int hash, bool throwErrors, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 783580945:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(( (handleProperties) ? (this.get_NewValue()) : (this.NewValue) ))) );
					}
					
					
					case 1916097898:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(( (handleProperties) ? (this.get_OldValue()) : (this.OldValue) ))) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, object[] dynargs) {
			unchecked {
				switch (hash) {
					case 2026329742:
					{
						return this.set_NewValue(dynargs[0]);
					}
					
					
					case 1674457882:
					{
						return this.get_NewValue();
					}
					
					
					case 659491187:
					{
						return this.get_OldValue();
					}
					
					
					case 1011363047:
					{
						return this.set_OldValue(dynargs[0]);
					}
					
					
					case 1466589425:
					{
						return this.get_Field();
					}
					
					
					case 985353469:
					{
						return this.set_Field(((global::nMorph.framework.orm.common.sentences.FieldSentence) (dynargs[0]) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("NewValue");
			baseArr.push("OldValue");
			baseArr.push("Field");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


