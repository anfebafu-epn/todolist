// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.clauses {
	public class SetClause : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.IClause {
		
		static SetClause() {
			global::nMorph.framework.orm.common.clauses.SetClause.__rtti = "<class path=\"nMorph.framework.orm.common.clauses.SetClause\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<Sets><c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.ISet\"/></c></Sets>\n\t<FROM public=\"1\" set=\"method\" line=\"31\"><f a=\"Source\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISource\"/>\n\t<c path=\"nMorph.framework.orm.common.clauses.FromClause\"/>\n</f></FROM>\n\t<WHERE public=\"1\" set=\"method\" line=\"37\"><f a=\"Condition\">\n\t<c path=\"nMorph.framework.orm.interfaces.ICondition\"/>\n\t<c path=\"nMorph.framework.orm.common.clauses.WhereClause\"/>\n</f></WHERE>\n\t<SCRIPT public=\"1\" set=\"method\" line=\"43\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"47\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<Execute public=\"1\" set=\"method\" line=\"117\"><f a=\"\"><d/></f></Execute>\n\t<Register public=\"1\" set=\"method\" line=\"121\"><f a=\"context\">\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Register>\n\t<Queue public=\"1\" set=\"method\" line=\"125\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<Bulk public=\"1\" set=\"method\" line=\"129\"><f a=\"bulk\">\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t<ReadValue public=\"1\" set=\"method\" line=\"134\"><f a=\"\"><d/></f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"138\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"142\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"146\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<new public=\"1\" set=\"method\" line=\"22\"><f a=\"CurrentSQL:Sets\">\n\t<c path=\"nMorph.framework.orm.lang.SQL\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.ISet\"/></c>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public SetClause(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public SetClause(global::nMorph.framework.orm.lang.SQL CurrentSQL, global::Array<object> Sets) {
			global::nMorph.framework.orm.common.clauses.SetClause.__hx_ctor_nMorph_framework_orm_common_clauses_SetClause(this, CurrentSQL, Sets);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_clauses_SetClause(global::nMorph.framework.orm.common.clauses.SetClause __hx_this, global::nMorph.framework.orm.lang.SQL CurrentSQL, global::Array<object> Sets) {
			__hx_this.CurrentSQL = CurrentSQL;
			__hx_this.Sets = Sets;
			{
				int _g = 0;
				while (( _g < Sets.length )) {
					global::nMorph.framework.orm.interfaces.ISet @set = ((global::nMorph.framework.orm.interfaces.ISet) (Sets[_g]) );
					 ++ _g;
					@set.RegisterQuery(CurrentSQL);
				}
				
			}
			
		}
		
		
		public static string __rtti;
		
		public global::nMorph.framework.orm.lang.SQL CurrentSQL;
		
		public global::Array<object> Sets;
		
		public virtual global::nMorph.framework.orm.common.clauses.FromClause FROM(global::nMorph.framework.orm.interfaces.ISource Source) {
			global::nMorph.framework.orm.common.clauses.FromClause fc = new global::nMorph.framework.orm.common.clauses.FromClause(((global::nMorph.framework.orm.lang.SQL) (this.CurrentSQL) ), ((global::nMorph.framework.orm.interfaces.ISource) (Source) ));
			this.CurrentSQL.AddClause(fc);
			return fc;
		}
		
		
		public virtual global::nMorph.framework.orm.common.clauses.WhereClause WHERE(global::nMorph.framework.orm.interfaces.ICondition Condition) {
			global::nMorph.framework.orm.common.clauses.WhereClause wc = new global::nMorph.framework.orm.common.clauses.WhereClause(((global::nMorph.framework.orm.lang.SQL) (this.CurrentSQL) ), ((global::nMorph.framework.orm.interfaces.ICondition) (Condition) ));
			this.CurrentSQL.AddClause(wc);
			return wc;
		}
		
		
		public virtual string SCRIPT() {
			return this.CurrentSQL.GenerateAll();
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentSQL.getCurrentEngine()._hx_index) {
					case 0:
					{
						this.CurrentSQL.AddBlock("SET ");
						{
							int _g = 0;
							global::Array<object> _g1 = this.Sets;
							while (( _g < _g1.length )) {
								global::nMorph.framework.orm.interfaces.ISet @set = ((global::nMorph.framework.orm.interfaces.ISet) (_g1[_g]) );
								 ++ _g;
								@set.SCRIPT_PART(null);
								this.CurrentSQL.AddBlock(", ");
							}
							
						}
						
						if (( this.Sets.length > 0 )) {
							this.CurrentSQL.RemoveLastBlock();
						}
						
						break;
					}
					
					
					case 1:
					{
						this.CurrentSQL.AddBlock("SET ");
						{
							int _g2 = 0;
							global::Array<object> _g3 = this.Sets;
							while (( _g2 < _g3.length )) {
								global::nMorph.framework.orm.interfaces.ISet set1 = ((global::nMorph.framework.orm.interfaces.ISet) (_g3[_g2]) );
								 ++ _g2;
								set1.SCRIPT_PART(null);
								this.CurrentSQL.AddBlock(", ");
							}
							
						}
						
						if (( this.Sets.length > 0 )) {
							this.CurrentSQL.RemoveLastBlock();
						}
						
						break;
					}
					
					
					case 2:
					{
						this.CurrentSQL.AddBlock("SET ");
						{
							int _g4 = 0;
							global::Array<object> _g5 = this.Sets;
							while (( _g4 < _g5.length )) {
								global::nMorph.framework.orm.interfaces.ISet set2 = ((global::nMorph.framework.orm.interfaces.ISet) (_g5[_g4]) );
								 ++ _g4;
								set2.SCRIPT_PART(null);
								this.CurrentSQL.AddBlock(", ");
							}
							
						}
						
						if (( this.Sets.length > 0 )) {
							this.CurrentSQL.RemoveLastBlock();
						}
						
						break;
					}
					
					
					case 3:
					{
						this.CurrentSQL.AddBlock("SET ");
						{
							int _g6 = 0;
							global::Array<object> _g7 = this.Sets;
							while (( _g6 < _g7.length )) {
								global::nMorph.framework.orm.interfaces.ISet set3 = ((global::nMorph.framework.orm.interfaces.ISet) (_g7[_g6]) );
								 ++ _g6;
								set3.SCRIPT_PART(null);
								this.CurrentSQL.AddBlock(", ");
							}
							
						}
						
						if (( this.Sets.length > 0 )) {
							this.CurrentSQL.RemoveLastBlock();
						}
						
						break;
					}
					
					
					case 4:
					{
						this.CurrentSQL.AddBlock("SET ");
						{
							int _g8 = 0;
							global::Array<object> _g9 = this.Sets;
							while (( _g8 < _g9.length )) {
								global::nMorph.framework.orm.interfaces.ISet set4 = ((global::nMorph.framework.orm.interfaces.ISet) (_g9[_g8]) );
								 ++ _g8;
								set4.SCRIPT_PART(null);
								this.CurrentSQL.AddBlock(", ");
							}
							
						}
						
						if (( this.Sets.length > 0 )) {
							this.CurrentSQL.RemoveLastBlock();
						}
						
						break;
					}
					
					
				}
				
			}
		}
		
		
		public virtual object Execute() {
			return this.CurrentSQL.Execute();
		}
		
		
		public virtual void Register(global::nMorph.framework.orm.tools.Context context) {
			context.set_Queue(this.CurrentSQL.Queue(context.get_Queue()));
		}
		
		
		public virtual global::Array<object> Queue(global::Array<object> queue) {
			return this.CurrentSQL.Queue(queue);
		}
		
		
		public virtual global::nMorph.framework.orm.tools.BulkRun Bulk(global::nMorph.framework.orm.tools.BulkRun bulk) {
			bulk.set_queue(this.CurrentSQL.Queue(bulk.get_queue()));
			return bulk;
		}
		
		
		public virtual object ReadValue() {
			return this.CurrentSQL.ReadValue();
		}
		
		
		public virtual global::nMorph.framework.orm.client.QueryTable ReadTable() {
			return this.CurrentSQL.ReadTable();
		}
		
		
		public virtual global::Array<T> Read<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			return this.CurrentSQL.Read<T>(((global::System.Type) (cl) ), ((global::nMorph.framework.orm.tools.Context) (context) ));
		}
		
		
		public virtual T ReadOne<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			return this.CurrentSQL.ReadOne<T>(((global::System.Type) (cl) ), ((global::nMorph.framework.orm.tools.Context) (context) ));
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 925482673:
					{
						this.Sets = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
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
					case 1344235664:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "ReadOne", 1344235664)) );
					}
					
					
					case 914388854:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Read", 914388854)) );
					}
					
					
					case 2107499704:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "ReadTable", 2107499704)) );
					}
					
					
					case 611494939:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "ReadValue", 611494939)) );
					}
					
					
					case 737753906:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Bulk", 737753906)) );
					}
					
					
					case 1897397617:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Queue", 1897397617)) );
					}
					
					
					case 709976707:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Register", 709976707)) );
					}
					
					
					case 425603605:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "Execute", 425603605)) );
					}
					
					
					case 2032371175:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT_PART", 2032371175)) );
					}
					
					
					case 2044918283:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT", 2044918283)) );
					}
					
					
					case 1202223047:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "WHERE", 1202223047)) );
					}
					
					
					case 780365162:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "FROM", 780365162)) );
					}
					
					
					case 925482673:
					{
						return this.Sets;
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
					case 1344235664:
					{
						return this.ReadOne<object>(((global::System.Type) (dynargs[0]) ), ((global::nMorph.framework.orm.tools.Context) (( (( dynargs.Length > 1 )) ? (dynargs[1]) : (null) )) ));
					}
					
					
					case 914388854:
					{
						return this.Read<object>(((global::System.Type) (dynargs[0]) ), ((global::nMorph.framework.orm.tools.Context) (( (( dynargs.Length > 1 )) ? (dynargs[1]) : (null) )) ));
					}
					
					
					case 2107499704:
					{
						return this.ReadTable();
					}
					
					
					case 611494939:
					{
						return this.ReadValue();
					}
					
					
					case 737753906:
					{
						return this.Bulk(((global::nMorph.framework.orm.tools.BulkRun) (dynargs[0]) ));
					}
					
					
					case 1897397617:
					{
						return this.Queue(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (dynargs[0]) ))) ));
					}
					
					
					case 709976707:
					{
						this.Register(((global::nMorph.framework.orm.tools.Context) (dynargs[0]) ));
						break;
					}
					
					
					case 425603605:
					{
						return this.Execute();
					}
					
					
					case 2032371175:
					{
						this.SCRIPT_PART(global::haxe.lang.Runtime.toString(( (( dynargs.Length > 0 )) ? (dynargs[0]) : (null) )));
						break;
					}
					
					
					case 2044918283:
					{
						return this.SCRIPT();
					}
					
					
					case 1202223047:
					{
						return this.WHERE(((global::nMorph.framework.orm.interfaces.ICondition) (dynargs[0]) ));
					}
					
					
					case 780365162:
					{
						return this.FROM(((global::nMorph.framework.orm.interfaces.ISource) (dynargs[0]) ));
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
			baseArr.push("Sets");
			baseArr.push("CurrentSQL");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}

