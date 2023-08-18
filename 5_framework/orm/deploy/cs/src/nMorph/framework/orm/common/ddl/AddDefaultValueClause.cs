// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.ddl {
	public class AddDefaultValueClause : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.IClause {
		
		static AddDefaultValueClause() {
			global::nMorph.framework.orm.common.ddl.AddDefaultValueClause.__rtti = "<class path=\"nMorph.framework.orm.common.ddl.AddDefaultValueClause\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<CurrentDDL><c path=\"nMorph.framework.orm.lang.DDL\"/></CurrentDDL>\n\t<ColumnName><c path=\"String\"/></ColumnName>\n\t<BaseColumns><c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.IColumnDefinition\"/></c></BaseColumns>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"27\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<SCRIPT public=\"1\" set=\"method\" line=\"105\"><f a=\"\"><c path=\"String\"/></f></SCRIPT>\n\t<Execute public=\"1\" set=\"method\" line=\"109\"><f a=\"\"><d/></f></Execute>\n\t<Register public=\"1\" set=\"method\" line=\"113\"><f a=\"context\">\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Register>\n\t<Queue public=\"1\" set=\"method\" line=\"117\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<Bulk public=\"1\" set=\"method\" line=\"122\"><f a=\"bulk\">\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n\t<c path=\"nMorph.framework.orm.tools.BulkRun\"/>\n</f></Bulk>\n\t<ReadValue public=\"1\" set=\"method\" line=\"127\"><f a=\"\"><d/></f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"132\"><f a=\"\"><c path=\"nMorph.framework.orm.client.QueryTable\"/></f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"137\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"142\"><f a=\"cl:?context\">\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<new public=\"1\" set=\"method\" line=\"20\"><f a=\"CurrentDDL:ColumnName:BaseColumns\">\n\t<c path=\"nMorph.framework.orm.lang.DDL\"/>\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.interfaces.IColumnDefinition\"/></c>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public AddDefaultValueClause(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public AddDefaultValueClause(global::nMorph.framework.orm.lang.DDL CurrentDDL, string ColumnName, global::Array<object> BaseColumns) {
			global::nMorph.framework.orm.common.ddl.AddDefaultValueClause.__hx_ctor_nMorph_framework_orm_common_ddl_AddDefaultValueClause(this, CurrentDDL, ColumnName, BaseColumns);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_ddl_AddDefaultValueClause(global::nMorph.framework.orm.common.ddl.AddDefaultValueClause __hx_this, global::nMorph.framework.orm.lang.DDL CurrentDDL, string ColumnName, global::Array<object> BaseColumns) {
			__hx_this.CurrentDDL = CurrentDDL;
			__hx_this.ColumnName = ColumnName;
			__hx_this.BaseColumns = BaseColumns;
		}
		
		
		public static string __rtti;
		
		public global::nMorph.framework.orm.lang.DDL CurrentDDL;
		
		public string ColumnName;
		
		public global::Array<object> BaseColumns;
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentDDL.getCurrentEngine()._hx_index) {
					case 0:
					{
						this.CurrentDDL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("ADD CONSTRAINT \"PK", this.ColumnName), "\" PRIMARY KEY ("));
						{
							int _g = 0;
							global::Array<object> _g1 = this.BaseColumns;
							while (( _g < _g1.length )) {
								global::nMorph.framework.orm.interfaces.IColumnDefinition basecolumn = ((global::nMorph.framework.orm.interfaces.IColumnDefinition) (_g1[_g]) );
								 ++ _g;
								basecolumn.SCRIPT_PART("OnlyName");
								this.CurrentDDL.AddBlock(", ");
							}
							
						}
						
						if (( this.BaseColumns.length > 0 )) {
							this.CurrentDDL.RemoveLastBlock();
						}
						
						this.CurrentDDL.AddBlock(")");
						break;
					}
					
					
					case 1:
					{
						this.CurrentDDL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("ADD CONSTRAINT \"PK", this.ColumnName), "\" PRIMARY KEY ("));
						{
							int _g2 = 0;
							global::Array<object> _g3 = this.BaseColumns;
							while (( _g2 < _g3.length )) {
								global::nMorph.framework.orm.interfaces.IColumnDefinition basecolumn1 = ((global::nMorph.framework.orm.interfaces.IColumnDefinition) (_g3[_g2]) );
								 ++ _g2;
								basecolumn1.SCRIPT_PART("OnlyName");
								this.CurrentDDL.AddBlock(", ");
							}
							
						}
						
						if (( this.BaseColumns.length > 0 )) {
							this.CurrentDDL.RemoveLastBlock();
						}
						
						this.CurrentDDL.AddBlock(")");
						break;
					}
					
					
					case 2:
					{
						this.CurrentDDL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("ADD CONSTRAINT \"PK", this.ColumnName), "\" PRIMARY KEY ("));
						{
							int _g4 = 0;
							global::Array<object> _g5 = this.BaseColumns;
							while (( _g4 < _g5.length )) {
								global::nMorph.framework.orm.interfaces.IColumnDefinition basecolumn2 = ((global::nMorph.framework.orm.interfaces.IColumnDefinition) (_g5[_g4]) );
								 ++ _g4;
								basecolumn2.SCRIPT_PART("OnlyName");
								this.CurrentDDL.AddBlock(", ");
							}
							
						}
						
						if (( this.BaseColumns.length > 0 )) {
							this.CurrentDDL.RemoveLastBlock();
						}
						
						this.CurrentDDL.AddBlock(")");
						break;
					}
					
					
					case 3:
					{
						this.CurrentDDL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("ADD CONSTRAINT \"PK", this.ColumnName), "\" PRIMARY KEY ("));
						{
							int _g6 = 0;
							global::Array<object> _g7 = this.BaseColumns;
							while (( _g6 < _g7.length )) {
								global::nMorph.framework.orm.interfaces.IColumnDefinition basecolumn3 = ((global::nMorph.framework.orm.interfaces.IColumnDefinition) (_g7[_g6]) );
								 ++ _g6;
								basecolumn3.SCRIPT_PART("OnlyName");
								this.CurrentDDL.AddBlock(", ");
							}
							
						}
						
						if (( this.BaseColumns.length > 0 )) {
							this.CurrentDDL.RemoveLastBlock();
						}
						
						this.CurrentDDL.AddBlock(")");
						break;
					}
					
					
					case 4:
					{
						this.CurrentDDL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("ADD CONSTRAINT \"PK", this.ColumnName), "\" PRIMARY KEY ("));
						{
							int _g8 = 0;
							global::Array<object> _g9 = this.BaseColumns;
							while (( _g8 < _g9.length )) {
								global::nMorph.framework.orm.interfaces.IColumnDefinition basecolumn4 = ((global::nMorph.framework.orm.interfaces.IColumnDefinition) (_g9[_g8]) );
								 ++ _g8;
								basecolumn4.SCRIPT_PART("OnlyName");
								this.CurrentDDL.AddBlock(", ");
							}
							
						}
						
						if (( this.BaseColumns.length > 0 )) {
							this.CurrentDDL.RemoveLastBlock();
						}
						
						this.CurrentDDL.AddBlock(")");
						break;
					}
					
					
				}
				
			}
		}
		
		
		public virtual string SCRIPT() {
			return this.CurrentDDL.GenerateAll();
		}
		
		
		public virtual object Execute() {
			return this.CurrentDDL.Execute();
		}
		
		
		public virtual void Register(global::nMorph.framework.orm.tools.Context context) {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
			}
		}
		
		
		public virtual global::Array<object> Queue(global::Array<object> queue) {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return null;
			}
		}
		
		
		public virtual global::nMorph.framework.orm.tools.BulkRun Bulk(global::nMorph.framework.orm.tools.BulkRun bulk) {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return null;
			}
		}
		
		
		public virtual object ReadValue() {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return null;
			}
		}
		
		
		public virtual global::nMorph.framework.orm.client.QueryTable ReadTable() {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return null;
			}
		}
		
		
		public virtual global::Array<T> Read<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return null;
			}
		}
		
		
		public virtual T ReadOne<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			unchecked {
				global::nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Not Valid Method");
				return default(T);
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 697505964:
					{
						this.BaseColumns = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 194253921:
					{
						this.ColumnName = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1037559379:
					{
						this.CurrentDDL = ((global::nMorph.framework.orm.lang.DDL) (@value) );
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
					
					
					case 2044918283:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT", 2044918283)) );
					}
					
					
					case 2032371175:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT_PART", 2032371175)) );
					}
					
					
					case 697505964:
					{
						return this.BaseColumns;
					}
					
					
					case 194253921:
					{
						return this.ColumnName;
					}
					
					
					case 1037559379:
					{
						return this.CurrentDDL;
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
					
					
					case 2044918283:
					{
						return this.SCRIPT();
					}
					
					
					case 2032371175:
					{
						this.SCRIPT_PART(global::haxe.lang.Runtime.toString(( (( dynargs.Length > 0 )) ? (dynargs[0]) : (null) )));
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
			baseArr.push("BaseColumns");
			baseArr.push("ColumnName");
			baseArr.push("CurrentDDL");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


