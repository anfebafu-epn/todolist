// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.client {
	public class QueryParameter : global::haxe.lang.HxObject {
		
		static QueryParameter() {
			global::nMorph.framework.orm.client.QueryParameter.__rtti = "<class path=\"nMorph.framework.orm.client.QueryParameter\" params=\"\">\n\t<SET public=\"1\" set=\"method\" line=\"14\" static=\"1\"><f a=\"DataType:Value\">\n\t<e path=\"nMorph.framework.orm.common.enums.DBTypeEnum\"/>\n\t<d/>\n\t<c path=\"nMorph.framework.orm.client.QueryParameter\"/>\n</f></SET>\n\t<DataType public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<e path=\"nMorph.framework.orm.common.enums.DBTypeEnum\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</DataType>\n\t<ParameterDirection public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<e path=\"nMorph.framework.orm.common.enums.ParameterDirectionEnum\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</ParameterDirection>\n\t<ParameterName public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</ParameterName>\n\t<Value public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<d/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</Value>\n\t<get_DataType set=\"method\" line=\"28\"><f a=\"\"><e path=\"nMorph.framework.orm.common.enums.DBTypeEnum\"/></f></get_DataType>\n\t<set_DataType set=\"method\" line=\"33\"><f a=\"value\">\n\t<e path=\"nMorph.framework.orm.common.enums.DBTypeEnum\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.DBTypeEnum\"/>\n</f></set_DataType>\n\t<set_ParameterDirection set=\"method\" line=\"38\"><f a=\"value\">\n\t<e path=\"nMorph.framework.orm.common.enums.ParameterDirectionEnum\"/>\n\t<e path=\"nMorph.framework.orm.common.enums.ParameterDirectionEnum\"/>\n</f></set_ParameterDirection>\n\t<get_ParameterDirection set=\"method\" line=\"43\"><f a=\"\"><e path=\"nMorph.framework.orm.common.enums.ParameterDirectionEnum\"/></f></get_ParameterDirection>\n\t<set_ParameterName set=\"method\" line=\"48\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_ParameterName>\n\t<get_ParameterName set=\"method\" line=\"53\"><f a=\"\"><c path=\"String\"/></f></get_ParameterName>\n\t<get_Value set=\"method\" line=\"58\"><f a=\"\"><d/></f></get_Value>\n\t<set_Value set=\"method\" line=\"63\"><f a=\"value\">\n\t<d/>\n\t<unknown/>\n</f></set_Value>\n\t<new public=\"1\" set=\"method\" line=\"10\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public QueryParameter(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public QueryParameter() {
			global::nMorph.framework.orm.client.QueryParameter.__hx_ctor_nMorph_framework_orm_client_QueryParameter(this);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_client_QueryParameter(global::nMorph.framework.orm.client.QueryParameter __hx_this) {
		}
		
		
		public static string __rtti;
		
		public static global::nMorph.framework.orm.client.QueryParameter SET(global::nMorph.framework.orm.common.enums.DBTypeEnum DataType, object Value) {
			global::nMorph.framework.orm.client.QueryParameter p = new global::nMorph.framework.orm.client.QueryParameter();
			p.set_Value(Value);
			p.set_DataType(DataType);
			p.set_ParameterDirection(global::nMorph.framework.orm.common.enums.ParameterDirectionEnum.INPUT);
			return p;
		}
		
		
		public global::nMorph.framework.orm.common.enums.DBTypeEnum DataType;
		
		public global::nMorph.framework.orm.common.enums.ParameterDirectionEnum ParameterDirection;
		
		public string ParameterName;
		
		public object Value;
		
		public virtual global::nMorph.framework.orm.common.enums.DBTypeEnum get_DataType() {
			return this.DataType;
		}
		
		
		public virtual global::nMorph.framework.orm.common.enums.DBTypeEnum set_DataType(global::nMorph.framework.orm.common.enums.DBTypeEnum @value) {
			return this.DataType = @value;
		}
		
		
		public virtual global::nMorph.framework.orm.common.enums.ParameterDirectionEnum set_ParameterDirection(global::nMorph.framework.orm.common.enums.ParameterDirectionEnum @value) {
			return this.ParameterDirection = @value;
		}
		
		
		public virtual global::nMorph.framework.orm.common.enums.ParameterDirectionEnum get_ParameterDirection() {
			return this.ParameterDirection;
		}
		
		
		public virtual string set_ParameterName(string @value) {
			return this.ParameterName = @value;
		}
		
		
		public virtual string get_ParameterName() {
			return this.ParameterName;
		}
		
		
		public virtual object get_Value() {
			return this.Value;
		}
		
		
		public virtual object set_Value(object @value) {
			return this.Value = @value;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1155919697:
					{
						if (handleProperties) {
							this.set_Value(@value);
							return @value;
						}
						else {
							this.Value = ((object) (@value) );
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
					case 1155919697:
					{
						if (handleProperties) {
							this.set_Value(@value);
							return @value;
						}
						else {
							this.Value = ((object) (@value) );
							return @value;
						}
						
					}
					
					
					case 1743760500:
					{
						if (handleProperties) {
							this.set_ParameterName(global::haxe.lang.Runtime.toString(@value));
							return @value;
						}
						else {
							this.ParameterName = global::haxe.lang.Runtime.toString(@value);
							return @value;
						}
						
					}
					
					
					case 1658827638:
					{
						if (handleProperties) {
							this.set_ParameterDirection(((global::nMorph.framework.orm.common.enums.ParameterDirectionEnum) (@value) ));
							return @value;
						}
						else {
							this.ParameterDirection = ((global::nMorph.framework.orm.common.enums.ParameterDirectionEnum) (@value) );
							return @value;
						}
						
					}
					
					
					case 1714327076:
					{
						if (handleProperties) {
							this.set_DataType(((global::nMorph.framework.orm.common.enums.DBTypeEnum) (@value) ));
							return @value;
						}
						else {
							this.DataType = ((global::nMorph.framework.orm.common.enums.DBTypeEnum) (@value) );
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
					case 1809856436:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_Value", 1809856436)) );
					}
					
					
					case 143608744:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_Value", 143608744)) );
					}
					
					
					case 1851766731:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_ParameterName", 1851766731)) );
					}
					
					
					case 298684375:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_ParameterName", 298684375)) );
					}
					
					
					case 1014246591:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_ParameterDirection", 1014246591)) );
					}
					
					
					case 1881123123:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_ParameterDirection", 1881123123)) );
					}
					
					
					case 809592225:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_DataType", 809592225)) );
					}
					
					
					case 457720365:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_DataType", 457720365)) );
					}
					
					
					case 1155919697:
					{
						return ( (handleProperties) ? (this.get_Value()) : (this.Value) );
					}
					
					
					case 1743760500:
					{
						return ( (handleProperties) ? (this.get_ParameterName()) : (this.ParameterName) );
					}
					
					
					case 1658827638:
					{
						return ( (handleProperties) ? (this.get_ParameterDirection()) : (this.ParameterDirection) );
					}
					
					
					case 1714327076:
					{
						return ( (handleProperties) ? (this.get_DataType()) : (this.DataType) );
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
					case 1155919697:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(( (handleProperties) ? (this.get_Value()) : (this.Value) ))) );
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
					case 1809856436:
					{
						return this.set_Value(dynargs[0]);
					}
					
					
					case 143608744:
					{
						return this.get_Value();
					}
					
					
					case 1851766731:
					{
						return this.get_ParameterName();
					}
					
					
					case 298684375:
					{
						return this.set_ParameterName(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 1014246591:
					{
						return this.get_ParameterDirection();
					}
					
					
					case 1881123123:
					{
						return this.set_ParameterDirection(((global::nMorph.framework.orm.common.enums.ParameterDirectionEnum) (dynargs[0]) ));
					}
					
					
					case 809592225:
					{
						return this.set_DataType(((global::nMorph.framework.orm.common.enums.DBTypeEnum) (dynargs[0]) ));
					}
					
					
					case 457720365:
					{
						return this.get_DataType();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("Value");
			baseArr.push("ParameterName");
			baseArr.push("ParameterDirection");
			baseArr.push("DataType");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}

