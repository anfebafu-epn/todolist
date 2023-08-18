// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.conditions {
	public class ConditionGroup : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.ICondition {
		
		static ConditionGroup() {
			global::nMorph.framework.orm.common.conditions.ConditionGroup.__rtti = "<class path=\"nMorph.framework.orm.common.conditions.ConditionGroup\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<SET public=\"1\" set=\"method\" line=\"25\" static=\"1\"><f a=\"cond\">\n\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.ConditionGroup\"/>\n</f></SET>\n\t<LogicOperator><e path=\"nMorph.framework.orm.common.enums.LogicOperatorEnum\"/></LogicOperator>\n\t<InnerCondition><c path=\"nMorph.framework.orm.interfaces.ICondition\"/></InnerCondition>\n\t<ConditionGroups expr=\"new Array&lt;ConditionGroup&gt;()\" line=\"15\">\n\t\t<c path=\"Array\"><c path=\"nMorph.framework.orm.common.conditions.ConditionGroup\"/></c>\n\t\t<meta><m n=\":value\"><e><![CDATA[new Array<ConditionGroup>()]]></e></m></meta>\n\t</ConditionGroups>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<AddConditionGroup public=\"1\" set=\"method\" line=\"31\"><f a=\"cg\">\n\t<c path=\"nMorph.framework.orm.common.conditions.ConditionGroup\"/>\n\t<x path=\"Void\"/>\n</f></AddConditionGroup>\n\t<get_LogicOperator public=\"1\" set=\"method\" line=\"35\"><f a=\"\"><e path=\"nMorph.framework.orm.common.enums.LogicOperatorEnum\"/></f></get_LogicOperator>\n\t<get_InnerCondition public=\"1\" set=\"method\" line=\"39\"><f a=\"\"><c path=\"nMorph.framework.orm.interfaces.ICondition\"/></f></get_InnerCondition>\n\t<AND public=\"1\" set=\"method\" line=\"43\"><f a=\"cond\">\n\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.ConditionGroup\"/>\n</f></AND>\n\t<OR public=\"1\" set=\"method\" line=\"50\"><f a=\"cond\">\n\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<c path=\"nMorph.framework.orm.common.conditions.ConditionGroup\"/>\n</f></OR>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"57\"><f a=\"CurrentSQL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"67\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<new public=\"1\" set=\"method\" line=\"20\"><f a=\"InnerCondition:LogicOperator\">\n\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.LogicOperatorEnum\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public ConditionGroup(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ConditionGroup(global::nMorph.framework.orm.interfaces.ICondition InnerCondition, global::nMorph.framework.orm.common.enums.LogicOperatorEnum LogicOperator) {
			global::nMorph.framework.orm.common.conditions.ConditionGroup.__hx_ctor_nMorph_framework_orm_common_conditions_ConditionGroup(this, InnerCondition, LogicOperator);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_conditions_ConditionGroup(global::nMorph.framework.orm.common.conditions.ConditionGroup __hx_this, global::nMorph.framework.orm.interfaces.ICondition InnerCondition, global::nMorph.framework.orm.common.enums.LogicOperatorEnum LogicOperator) {
			__hx_this.ConditionGroups = new global::Array<object>();
			{
				__hx_this.InnerCondition = InnerCondition;
				__hx_this.LogicOperator = LogicOperator;
			}
			
		}
		
		
		public static string __rtti;
		
		public static global::nMorph.framework.orm.common.conditions.ConditionGroup SET(global::nMorph.framework.orm.interfaces.ICondition cond) {
			global::nMorph.framework.orm.common.conditions.ConditionGroup cg = new global::nMorph.framework.orm.common.conditions.ConditionGroup(((global::nMorph.framework.orm.interfaces.ICondition) (cond) ), ((global::nMorph.framework.orm.common.enums.LogicOperatorEnum) (global::nMorph.framework.orm.common.enums.LogicOperatorEnum.START) ));
			cg.AddConditionGroup(cg);
			return cg;
		}
		
		
		public global::nMorph.framework.orm.common.enums.LogicOperatorEnum LogicOperator;
		
		public global::nMorph.framework.orm.interfaces.ICondition InnerCondition;
		
		public global::Array<object> ConditionGroups;
		
		public global::nMorph.framework.orm.lang.SQL CurrentSQL;
		
		public virtual void AddConditionGroup(global::nMorph.framework.orm.common.conditions.ConditionGroup cg) {
			this.ConditionGroups.push(cg);
		}
		
		
		public virtual global::nMorph.framework.orm.common.enums.LogicOperatorEnum get_LogicOperator() {
			return this.LogicOperator;
		}
		
		
		public virtual global::nMorph.framework.orm.interfaces.ICondition get_InnerCondition() {
			return this.InnerCondition;
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.ConditionGroup AND(global::nMorph.framework.orm.interfaces.ICondition cond) {
			global::nMorph.framework.orm.common.conditions.ConditionGroup cg = new global::nMorph.framework.orm.common.conditions.ConditionGroup(((global::nMorph.framework.orm.interfaces.ICondition) (cond) ), ((global::nMorph.framework.orm.common.enums.LogicOperatorEnum) (global::nMorph.framework.orm.common.enums.LogicOperatorEnum.AND) ));
			cond.RegisterQuery(this.CurrentSQL);
			this.AddConditionGroup(cg);
			return this;
		}
		
		
		public virtual global::nMorph.framework.orm.common.conditions.ConditionGroup OR(global::nMorph.framework.orm.interfaces.ICondition cond) {
			global::nMorph.framework.orm.common.conditions.ConditionGroup cg = new global::nMorph.framework.orm.common.conditions.ConditionGroup(((global::nMorph.framework.orm.interfaces.ICondition) (cond) ), ((global::nMorph.framework.orm.common.enums.LogicOperatorEnum) (global::nMorph.framework.orm.common.enums.LogicOperatorEnum.OR) ));
			cond.RegisterQuery(this.CurrentSQL);
			this.AddConditionGroup(cg);
			return this;
		}
		
		
		public virtual void RegisterQuery(global::nMorph.framework.orm.interfaces.ILang CurrentSQL) {
			this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (CurrentSQL) );
			this.InnerCondition.RegisterQuery(CurrentSQL);
			{
				int _g = 0;
				global::Array<object> _g1 = this.ConditionGroups;
				while (( _g < _g1.length )) {
					global::nMorph.framework.orm.common.conditions.ConditionGroup cg = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g1[_g]) );
					 ++ _g;
					if (( cg != this )) {
						cg.RegisterQuery(CurrentSQL);
					}
					
				}
				
			}
			
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentSQL.getCurrentEngine()._hx_index) {
					case 0:
					{
						int _g = 0;
						global::Array<object> _g1 = this.ConditionGroups;
						while (( _g < _g1.length )) {
							global::nMorph.framework.orm.common.conditions.ConditionGroup cg = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g1[_g]) );
							 ++ _g;
							switch (cg.get_LogicOperator()._hx_index) {
								case 0:
								{
									break;
								}
								
								
								case 1:
								{
									this.CurrentSQL.AddBlock(" AND ");
									break;
								}
								
								
								case 2:
								{
									this.CurrentSQL.AddBlock(" OR ");
									break;
								}
								
								
							}
							
							this.CurrentSQL.AddBlock("(");
							cg.get_InnerCondition().SCRIPT_PART(null);
							this.CurrentSQL.AddBlock(") ");
						}
						
						break;
					}
					
					
					case 1:
					{
						int _g2 = 0;
						global::Array<object> _g3 = this.ConditionGroups;
						while (( _g2 < _g3.length )) {
							global::nMorph.framework.orm.common.conditions.ConditionGroup cg1 = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g3[_g2]) );
							 ++ _g2;
							switch (cg1.get_LogicOperator()._hx_index) {
								case 0:
								{
									break;
								}
								
								
								case 1:
								{
									this.CurrentSQL.AddBlock(" AND ");
									break;
								}
								
								
								case 2:
								{
									this.CurrentSQL.AddBlock(" OR ");
									break;
								}
								
								
							}
							
							this.CurrentSQL.AddBlock("(");
							cg1.get_InnerCondition().SCRIPT_PART(null);
							this.CurrentSQL.AddBlock(") ");
						}
						
						break;
					}
					
					
					case 2:
					{
						int _g4 = 0;
						global::Array<object> _g5 = this.ConditionGroups;
						while (( _g4 < _g5.length )) {
							global::nMorph.framework.orm.common.conditions.ConditionGroup cg2 = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g5[_g4]) );
							 ++ _g4;
							switch (cg2.get_LogicOperator()._hx_index) {
								case 0:
								{
									break;
								}
								
								
								case 1:
								{
									this.CurrentSQL.AddBlock(" AND ");
									break;
								}
								
								
								case 2:
								{
									this.CurrentSQL.AddBlock(" OR ");
									break;
								}
								
								
							}
							
							this.CurrentSQL.AddBlock("(");
							cg2.get_InnerCondition().SCRIPT_PART(null);
							this.CurrentSQL.AddBlock(") ");
						}
						
						break;
					}
					
					
					case 3:
					{
						int _g6 = 0;
						global::Array<object> _g7 = this.ConditionGroups;
						while (( _g6 < _g7.length )) {
							global::nMorph.framework.orm.common.conditions.ConditionGroup cg3 = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g7[_g6]) );
							 ++ _g6;
							switch (cg3.get_LogicOperator()._hx_index) {
								case 0:
								{
									break;
								}
								
								
								case 1:
								{
									this.CurrentSQL.AddBlock(" AND ");
									break;
								}
								
								
								case 2:
								{
									this.CurrentSQL.AddBlock(" OR ");
									break;
								}
								
								
							}
							
							this.CurrentSQL.AddBlock("(");
							cg3.get_InnerCondition().SCRIPT_PART(null);
							this.CurrentSQL.AddBlock(") ");
						}
						
						break;
					}
					
					
					case 4:
					{
						int _g8 = 0;
						global::Array<object> _g9 = this.ConditionGroups;
						while (( _g8 < _g9.length )) {
							global::nMorph.framework.orm.common.conditions.ConditionGroup cg4 = ((global::nMorph.framework.orm.common.conditions.ConditionGroup) (_g9[_g8]) );
							 ++ _g8;
							switch (cg4.get_LogicOperator()._hx_index) {
								case 0:
								{
									break;
								}
								
								
								case 1:
								{
									this.CurrentSQL.AddBlock(" AND ");
									break;
								}
								
								
								case 2:
								{
									this.CurrentSQL.AddBlock(" OR ");
									break;
								}
								
								
							}
							
							this.CurrentSQL.AddBlock("(");
							cg4.get_InnerCondition().SCRIPT_PART(null);
							this.CurrentSQL.AddBlock(") ");
						}
						
						break;
					}
					
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1038308213:
					{
						this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (@value) );
						return @value;
					}
					
					
					case 206581807:
					{
						this.ConditionGroups = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1398032709:
					{
						this.InnerCondition = ((global::nMorph.framework.orm.interfaces.ICondition) (@value) );
						return @value;
					}
					
					
					case 548310786:
					{
						this.LogicOperator = ((global::nMorph.framework.orm.common.enums.LogicOperatorEnum) (@value) );
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
					
					
					case 17699:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "OR", 17699)) );
					}
					
					
					case 3249847:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "AND", 3249847)) );
					}
					
					
					case 1861102094:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_InnerCondition", 1861102094)) );
					}
					
					
					case 656317017:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_LogicOperator", 656317017)) );
					}
					
					
					case 600499589:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "AddConditionGroup", 600499589)) );
					}
					
					
					case 1038308213:
					{
						return this.CurrentSQL;
					}
					
					
					case 206581807:
					{
						return this.ConditionGroups;
					}
					
					
					case 1398032709:
					{
						return this.InnerCondition;
					}
					
					
					case 548310786:
					{
						return this.LogicOperator;
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
					
					
					case 17699:
					{
						return this.OR(((global::nMorph.framework.orm.interfaces.ICondition) (dynargs[0]) ));
					}
					
					
					case 3249847:
					{
						return this.AND(((global::nMorph.framework.orm.interfaces.ICondition) (dynargs[0]) ));
					}
					
					
					case 1861102094:
					{
						return this.get_InnerCondition();
					}
					
					
					case 656317017:
					{
						return this.get_LogicOperator();
					}
					
					
					case 600499589:
					{
						this.AddConditionGroup(((global::nMorph.framework.orm.common.conditions.ConditionGroup) (dynargs[0]) ));
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
			baseArr.push("CurrentSQL");
			baseArr.push("ConditionGroups");
			baseArr.push("InnerCondition");
			baseArr.push("LogicOperator");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}

