// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.sentences {
	public class SubQuerySentence : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.ISentence {
		
		static SubQuerySentence() {
			global::nMorph.framework.orm.common.sentences.SubQuerySentence.__rtti = "<class path=\"nMorph.framework.orm.common.sentences.SubQuerySentence\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<SET public=\"1\" set=\"method\" line=\"24\" static=\"1\"><f a=\"InnerClause\">\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></SET>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<InnerClause><c path=\"nMorph.framework.orm.interfaces.IClause\"/></InnerClause>\n\t<IsNullValue public=\"1\" set=\"method\" line=\"20\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"29\"><f a=\"CurrentSQL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"33\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<new public=\"1\" set=\"method\" line=\"16\"><f a=\"InnerClause\">\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public SubQuerySentence(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public SubQuerySentence(global::nMorph.framework.orm.interfaces.IClause InnerClause) {
			global::nMorph.framework.orm.common.sentences.SubQuerySentence.__hx_ctor_nMorph_framework_orm_common_sentences_SubQuerySentence(this, InnerClause);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_sentences_SubQuerySentence(global::nMorph.framework.orm.common.sentences.SubQuerySentence __hx_this, global::nMorph.framework.orm.interfaces.IClause InnerClause) {
			__hx_this.InnerClause = InnerClause;
		}
		
		
		public static string __rtti;
		
		public static global::nMorph.framework.orm.interfaces.ISentence SET(global::nMorph.framework.orm.interfaces.IClause InnerClause) {
			global::nMorph.framework.orm.common.sentences.SubQuerySentence sqs = new global::nMorph.framework.orm.common.sentences.SubQuerySentence(((global::nMorph.framework.orm.interfaces.IClause) (InnerClause) ));
			return sqs;
		}
		
		
		public global::nMorph.framework.orm.lang.SQL CurrentSQL;
		
		public global::nMorph.framework.orm.interfaces.IClause InnerClause;
		
		public virtual bool IsNullValue() {
			return false;
		}
		
		
		public virtual void RegisterQuery(global::nMorph.framework.orm.interfaces.ILang CurrentSQL) {
			this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (CurrentSQL) );
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentSQL.getCurrentEngine()._hx_index) {
					case 0:
					{
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("(", this.InnerClause.SCRIPT()), ")"));
						break;
					}
					
					
					case 1:
					{
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("(", this.InnerClause.SCRIPT()), ")"));
						break;
					}
					
					
					case 2:
					{
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("(", this.InnerClause.SCRIPT()), ")"));
						break;
					}
					
					
					case 3:
					{
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("(", this.InnerClause.SCRIPT()), ")"));
						break;
					}
					
					
					case 4:
					{
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("(", this.InnerClause.SCRIPT()), ")"));
						break;
					}
					
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1380175813:
					{
						this.InnerClause = ((global::nMorph.framework.orm.interfaces.IClause) (@value) );
						return @value;
					}
					
					
					case 1038308213:
					{
						this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (@value) );
						return @value;
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
					case 2032371175:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT_PART", 2032371175)) );
					}
					
					
					case 457416069:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "RegisterQuery", 457416069)) );
					}
					
					
					case 150705664:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "IsNullValue", 150705664)) );
					}
					
					
					case 1380175813:
					{
						return this.InnerClause;
					}
					
					
					case 1038308213:
					{
						return this.CurrentSQL;
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
					case 2032371175:
					{
						this.SCRIPT_PART(global::haxe.lang.Runtime.toString(( (( dynargs.Length > 0 )) ? (dynargs[0]) : (null) )));
						break;
					}
					
					
					case 457416069:
					{
						this.RegisterQuery(((global::nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						break;
					}
					
					
					case 150705664:
					{
						return this.IsNullValue();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("InnerClause");
			baseArr.push("CurrentSQL");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


