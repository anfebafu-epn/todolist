// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.svc.msg {
	public class ResponseMessage : global::haxe.lang.HxObject {
		
		public ResponseMessage(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ResponseMessage() {
			global::nMorph.framework.svc.msg.ResponseMessage.__hx_ctor_nMorph_framework_svc_msg_ResponseMessage(this);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_svc_msg_ResponseMessage(global::nMorph.framework.svc.msg.ResponseMessage __hx_this) {
		}
		
		
		public global::Array<object> Results;
		
		public int RequestSeq;
		
		public string Message;
		
		public string AttentionCode;
		
		public virtual global::Array<object> set_Results(global::Array<object> @value) {
			return this.Results = @value;
		}
		
		
		public virtual global::Array<object> get_Results() {
			return this.Results;
		}
		
		
		public virtual int set_RequestSeq(int @value) {
			return this.RequestSeq = @value;
		}
		
		
		public virtual int get_RequestSeq() {
			return this.RequestSeq;
		}
		
		
		public virtual string set_Message(string @value) {
			return this.Message = @value;
		}
		
		
		public virtual string get_Message() {
			return this.Message;
		}
		
		
		public virtual string get_AttentionCode() {
			return this.AttentionCode;
		}
		
		
		public virtual string set_AttentionCode(string @value) {
			return this.AttentionCode = @value;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2008593328:
					{
						if (handleProperties) {
							this.set_RequestSeq(((int) (@value) ));
							return @value;
						}
						else {
							this.RequestSeq = ((int) (@value) );
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
					case 1140502987:
					{
						if (handleProperties) {
							this.set_AttentionCode(global::haxe.lang.Runtime.toString(@value));
							return @value;
						}
						else {
							this.AttentionCode = global::haxe.lang.Runtime.toString(@value);
							return @value;
						}
						
					}
					
					
					case 1734499751:
					{
						if (handleProperties) {
							this.set_Message(global::haxe.lang.Runtime.toString(@value));
							return @value;
						}
						else {
							this.Message = global::haxe.lang.Runtime.toString(@value);
							return @value;
						}
						
					}
					
					
					case 2008593328:
					{
						if (handleProperties) {
							this.set_RequestSeq(((int) (global::haxe.lang.Runtime.toInt(@value)) ));
							return @value;
						}
						else {
							this.RequestSeq = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
							return @value;
						}
						
					}
					
					
					case 950567126:
					{
						if (handleProperties) {
							this.set_Results(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) ));
							return @value;
						}
						else {
							this.Results = ((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (@value) ))) );
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
					case 1842910510:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_AttentionCode", 1842910510)) );
					}
					
					
					case 1248509218:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_AttentionCode", 1248509218)) );
					}
					
					
					case 1834794430:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_Message", 1834794430)) );
					}
					
					
					case 2009711818:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_Message", 2009711818)) );
					}
					
					
					case 1840135161:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_RequestSeq", 1840135161)) );
					}
					
					
					case 231613549:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_RequestSeq", 231613549)) );
					}
					
					
					case 1050861805:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "get_Results", 1050861805)) );
					}
					
					
					case 1225779193:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "set_Results", 1225779193)) );
					}
					
					
					case 1140502987:
					{
						return ( (handleProperties) ? (this.get_AttentionCode()) : (this.AttentionCode) );
					}
					
					
					case 1734499751:
					{
						return ( (handleProperties) ? (this.get_Message()) : (this.Message) );
					}
					
					
					case 2008593328:
					{
						return ( (handleProperties) ? (this.get_RequestSeq()) : (this.RequestSeq) );
					}
					
					
					case 950567126:
					{
						return ( (handleProperties) ? (this.get_Results()) : (this.Results) );
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
					case 2008593328:
					{
						return ((double) (( (handleProperties) ? (this.get_RequestSeq()) : (this.RequestSeq) )) );
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
					case 1842910510:
					{
						return this.set_AttentionCode(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 1248509218:
					{
						return this.get_AttentionCode();
					}
					
					
					case 1834794430:
					{
						return this.get_Message();
					}
					
					
					case 2009711818:
					{
						return this.set_Message(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 1840135161:
					{
						return this.get_RequestSeq();
					}
					
					
					case 231613549:
					{
						return this.set_RequestSeq(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					case 1050861805:
					{
						return this.get_Results();
					}
					
					
					case 1225779193:
					{
						return this.set_Results(((global::Array<object>) (global::Array<object>.__hx_cast<object>(((global::Array) (dynargs[0]) ))) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("AttentionCode");
			baseArr.push("Message");
			baseArr.push("RequestSeq");
			baseArr.push("Results");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


