// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.sentences {
	public class FielIndexDefinitionSentences : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.ISentence {
		
		static FielIndexDefinitionSentences() {
			global::nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences.__rtti = "<class path=\"nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<FieldName public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</FieldName>\n\t<FieldTable public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</FieldTable>\n\t<CurrentDDL public=\"1\" get=\"accessor\" set=\"null\">\n\t\t<c path=\"nMorph.framework.orm.lang.DDL\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</CurrentDDL>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"23\"><f a=\"CurrentDDL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<IsNullValue public=\"1\" set=\"method\" line=\"28\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\n\t<get_FieldName set=\"method\" line=\"33\"><f a=\"\"><c path=\"String\"/></f></get_FieldName>\n\t<get_FieldTable set=\"method\" line=\"38\"><f a=\"\"><c path=\"String\"/></f></get_FieldTable>\n\t<get_CurrentDDL set=\"method\" line=\"43\"><f a=\"\"><c path=\"nMorph.framework.orm.lang.DDL\"/></f></get_CurrentDDL>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"47\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<new public=\"1\" set=\"method\" line=\"17\"><f a=\"FieldTable:FieldName\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public FielIndexDefinitionSentences(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public FielIndexDefinitionSentences(string FieldTable, string FieldName) {
			global::nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences.__hx_ctor_nMorph_framework_orm_common_sentences_FielIndexDefinitionSentences(this, FieldTable, FieldName);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_sentences_FielIndexDefinitionSentences(global::nMorph.framework.orm.common.sentences.FielIndexDefinitionSentences __hx_this, string FieldTable, string FieldName) {
			__hx_this.FieldName = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("\"", FieldName), "\"");
			__hx_this.FieldTable = global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("\"", FieldTable), "\"");
		}
		
		
		public static string __rtti;
		
		public string FieldName;
		
		public string FieldTable;
		
		public global::nMorph.framework.orm.lang.DDL CurrentDDL;
		
		public virtual void RegisterQuery(global::nMorph.framework.orm.interfaces.ILang CurrentDDL) {
			this.CurrentDDL = ((global::nMorph.framework.orm.lang.DDL) (CurrentDDL) );
		}
		
		
		public virtual bool IsNullValue() {
			return false;
		}
		
		
		public virtual string get_FieldName() {
			return this.FieldName;
		}
		
		
		public virtual string get_FieldTable() {
			return this.FieldTable;
		}
		
		
		public virtual global::nMorph.framework.orm.lang.DDL get_CurrentDDL() {
			return this.CurrentDDL;
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.get_CurrentDDL().getCurrentEngine()._hx_index) {
					case 0:
					{
						if (( args != null )) {
							if (( args == "ONLYNAME" )) {
								this.get_CurrentDDL().AddBlock(this.get_FieldName());
							}
							else if (( args == "WITHTABLE" )) {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							else {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							
						}
						else {
							this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
						}
						
						break;
					}
					
					
					case 1:
					{
						if (( args != null )) {
							if (( args == "ONLYNAME" )) {
								this.get_CurrentDDL().AddBlock(this.get_FieldName());
							}
							else if (( args == "WITHTABLE" )) {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							else {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							
						}
						else {
							this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
						}
						
						break;
					}
					
					
					case 2:
					{
						if (( args != null )) {
							if (( args == "ONLYNAME" )) {
								this.get_CurrentDDL().AddBlock(this.get_FieldName());
							}
							else if (( args == "WITHTABLE" )) {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							else {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							
						}
						else {
							this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
						}
						
						break;
					}
					
					
					case 3:
					{
						if (( args != null )) {
							if (( args == "ONLYNAME" )) {
								this.get_CurrentDDL().AddBlock(this.get_FieldName());
							}
							else if (( args == "WITHTABLE" )) {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							else {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							
						}
						else {
							this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
						}
						
						break;
					}
					
					
					case 4:
					{
						if (( args != null )) {
							if (( args == "ONLYNAME" )) {
								this.get_CurrentDDL().AddBlock(this.get_FieldName());
							}
							else if (( args == "WITHTABLE" )) {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							else {
								this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
							}
							
						}
						else {
							this.get_CurrentDDL().AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(this.get_FieldTable(), "("), this.get_FieldName()), ")"));
						}
						
						break;
					}
					
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1037559379:
					{
						this.CurrentDDL = ((global::nMorph.framework.orm.lang.DDL) (@value) );
						return @value;
					}
					
					
					case 1326920980:
					{
						this.FieldTable = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 35715077:
					{
						this.FieldName = global::haxe.lang.Runtime.toString(@value);
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
					
					
					case 869101212:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_CurrentDDL", 869101212)) );
					}
					
					
					case 1158462813:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_FieldTable", 1158462813)) );
					}
					
					
					case 1132776412:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_FieldName", 1132776412)) );
					}
					
					
					case 150705664:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "IsNullValue", 150705664)) );
					}
					
					
					case 457416069:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "RegisterQuery", 457416069)) );
					}
					
					
					case 1037559379:
					{
						return ( (handleProperties) ? (this.get_CurrentDDL()) : (this.CurrentDDL) );
					}
					
					
					case 1326920980:
					{
						return ( (handleProperties) ? (this.get_FieldTable()) : (this.FieldTable) );
					}
					
					
					case 35715077:
					{
						return ( (handleProperties) ? (this.get_FieldName()) : (this.FieldName) );
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
					
					
					case 869101212:
					{
						return this.get_CurrentDDL();
					}
					
					
					case 1158462813:
					{
						return this.get_FieldTable();
					}
					
					
					case 1132776412:
					{
						return this.get_FieldName();
					}
					
					
					case 150705664:
					{
						return this.IsNullValue();
					}
					
					
					case 457416069:
					{
						this.RegisterQuery(((global::nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
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
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("CurrentDDL");
			baseArr.push("FieldTable");
			baseArr.push("FieldName");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


