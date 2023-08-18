// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe {
	public class NativeStackTrace : global::haxe.lang.HxObject {
		
		public NativeStackTrace(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public NativeStackTrace() {
			global::haxe.NativeStackTrace.__hx_ctor_haxe_NativeStackTrace(this);
		}
		
		
		protected static void __hx_ctor_haxe_NativeStackTrace(global::haxe.NativeStackTrace __hx_this) {
		}
		
		
		[System.ThreadStaticAttribute]
		public static global::System.Exception exception;
		
		public static void saveStack(object e) {
			global::haxe.NativeStackTrace.exception = ((global::System.Exception) (((object) (e) )) );
		}
		
		
		public static global::System.Diagnostics.StackTrace callStack() {
			unchecked {
				return new global::System.Diagnostics.StackTrace(((int) (1) ), ((bool) (true) ));
			}
		}
		
		
		public static global::System.Diagnostics.StackTrace exceptionStack() {
			global::System.Exception _g = global::haxe.NativeStackTrace.exception;
			if (( _g == null )) {
				return null;
			}
			else {
				global::System.Exception e = _g;
				return new global::System.Diagnostics.StackTrace(((global::System.Exception) (e) ), ((bool) (true) ));
			}
			
		}
		
		
		public static global::Array<object> toHaxe(global::System.Diagnostics.StackTrace native, global::haxe.lang.Null<int> skip) {
			int skip1 = ( ( ! (skip.hasValue) ) ? (0) : ((skip).@value) );
			global::Array<object> stack = new global::Array<object>(new object[]{});
			if (( native == null )) {
				return stack;
			}
			
			int cnt = 0;
			{
				int _g = 0;
				int _g1 = native.FrameCount;
				while (( _g < _g1 )) {
					int i = _g++;
					global::System.Diagnostics.StackFrame frame = native.GetFrame(((int) (i) ));
					global::System.Reflection.MethodBase m = frame.GetMethod();
					if (( m == null )) {
						continue;
					}
					
					if (( skip1 > cnt++ )) {
						continue;
					}
					
					global::haxe.StackItem method = global::haxe.StackItem.Method(( m as global::System.Reflection.MemberInfo ).ReflectedType.ToString(), ( m as global::System.Reflection.MemberInfo ).Name);
					string fileName = frame.GetFileName();
					int lineNumber = frame.GetFileLineNumber();
					if (( ( fileName != null ) || ( lineNumber >= 0 ) )) {
						stack.push(global::haxe.StackItem.FilePos(method, fileName, lineNumber, default(global::haxe.lang.Null<int>)));
					}
					else {
						stack.push(method);
					}
					
				}
				
			}
			
			return stack;
		}
		
		
	}
}


