// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.sources {
	public class AliasSource : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.ISource {
		
		static AliasSource() {
			global::nMorph.framework.orm.common.sources.AliasSource.__rtti = "<class path=\"nMorph.framework.orm.common.sources.AliasSource\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t<Alias get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</Alias>\n\t<CurrentSQL>\n\t\t<c path=\"nMorph.framework.orm.lang.SQL\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</CurrentSQL>\n\t<InnerSource get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</InnerSource>\n\t<get_Alias set=\"method\" line=\"15\"><f a=\"\"><c path=\"String\"/></f></get_Alias>\n\t<set_Alias set=\"method\" line=\"19\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_Alias>\n\t<get_InnerSource set=\"method\" line=\"23\"><f a=\"\"><c path=\"nMorph.framework.orm.interfaces.ISource\"/></f></get_InnerSource>\n\t<set_InnerSource set=\"method\" line=\"27\"><f a=\"value\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n</f></set_InnerSource>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"36\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"56\"><f a=\"CurrentSQL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<new public=\"1\" set=\"method\" line=\"31\"><f a=\"Alias:InnerSource\">\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public AliasSource(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public AliasSource(string Alias, global::nMorph.framework.orm.interfaces.ISource InnerSource) {
			global::nMorph.framework.orm.common.sources.AliasSource.__hx_ctor_nMorph_framework_orm_common_sources_AliasSource(this, Alias, InnerSource);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_sources_AliasSource(global::nMorph.framework.orm.common.sources.AliasSource __hx_this, string Alias, global::nMorph.framework.orm.interfaces.ISource InnerSource) {
			__hx_this.set_Alias(Alias);
			__hx_this.set_InnerSource(InnerSource);
		}
		
		
		public static string __rtti;
		
		public string Alias;
		
		public global::nMorph.framework.orm.lang.SQL CurrentSQL;
		
		public global::nMorph.framework.orm.interfaces.ISource InnerSource;
		
		public virtual string get_Alias() {
			return this.Alias;
		}
		
		
		public virtual string set_Alias(string @value) {
			return this.Alias = @value;
		}
		
		
		public virtual global::nMorph.framework.orm.interfaces.ISource get_InnerSource() {
			return this.InnerSource;
		}
		
		
		public virtual global::nMorph.framework.orm.interfaces.ISource set_InnerSource(global::nMorph.framework.orm.interfaces.ISource @value) {
			return this.InnerSource = @value;
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentSQL.getCurrentEngine()._hx_index) {
					case 0:
					{
						this.get_InnerSource().SCRIPT_PART(args);
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(" as ", this.get_Alias()));
						break;
					}
					
					
					case 1:
					{
						this.get_InnerSource().SCRIPT_PART(args);
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(" as ", this.get_Alias()));
						break;
					}
					
					
					case 2:
					{
						this.get_InnerSource().SCRIPT_PART(args);
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(" as ", this.get_Alias()));
						break;
					}
					
					
					case 3:
					{
						this.get_InnerSource().SCRIPT_PART(args);
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(" as ", this.get_Alias()));
						break;
					}
					
					
					case 4:
					{
						this.get_InnerSource().SCRIPT_PART(args);
						this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(" as ", this.get_Alias()));
						break;
					}
					
					
				}
				
			}
		}
		
		
		public virtual void RegisterQuery(global::nMorph.framework.orm.interfaces.ILang CurrentSQL) {
			this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (CurrentSQL) );
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2137211633:
					{
						if (handleProperties) {
							this.set_InnerSource(((global::nMorph.framework.orm.interfaces.ISource) (@value) ));
							return @value;
						}
						else {
							this.InnerSource = ((global::nMorph.framework.orm.interfaces.ISource) (@value) );
							return @value;
						}
						
					}
					
					
					case 1038308213:
					{
						this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (@value) );
						return @value;
					}
					
					
					case 884916592:
					{
						if (handleProperties) {
							this.set_Alias(global::haxe.lang.Runtime.toString(@value));
							return @value;
						}
						else {
							this.Alias = global::haxe.lang.Runtime.toString(@value);
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
					case 457416069:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "RegisterQuery", 457416069)) );
					}
					
					
					case 2032371175:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT_PART", 2032371175)) );
					}
					
					
					case 1007712148:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_InnerSource", 1007712148)) );
					}
					
					
					case 1078262408:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_InnerSource", 1078262408)) );
					}
					
					
					case 1538853331:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_Alias", 1538853331)) );
					}
					
					
					case 2020089287:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_Alias", 2020089287)) );
					}
					
					
					case 2137211633:
					{
						return ( (handleProperties) ? (this.get_InnerSource()) : (this.InnerSource) );
					}
					
					
					case 1038308213:
					{
						return this.CurrentSQL;
					}
					
					
					case 884916592:
					{
						return ( (handleProperties) ? (this.get_Alias()) : (this.Alias) );
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
					case 457416069:
					{
						this.RegisterQuery(((global::nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						break;
					}
					
					
					case 2032371175:
					{
						this.SCRIPT_PART(global::haxe.lang.Runtime.toString(( (( dynargs.Length > 0 )) ? (dynargs[0]) : (null) )));
						break;
					}
					
					
					case 1007712148:
					{
						return this.set_InnerSource(((global::nMorph.framework.orm.interfaces.ISource) (dynargs[0]) ));
					}
					
					
					case 1078262408:
					{
						return this.get_InnerSource();
					}
					
					
					case 1538853331:
					{
						return this.set_Alias(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 2020089287:
					{
						return this.get_Alias();
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
			baseArr.push("InnerSource");
			baseArr.push("CurrentSQL");
			baseArr.push("Alias");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}

