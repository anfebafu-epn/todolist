// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace sys.thread {
	public class Mutex : global::haxe.lang.HxObject {
		
		public Mutex(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Mutex() {
			global::sys.thread.Mutex.__hx_ctor_sys_thread_Mutex(this);
		}
		
		
		protected static void __hx_ctor_sys_thread_Mutex(global::sys.thread.Mutex __hx_this) {
			__hx_this.native = new global::System.Threading.Mutex();
			{
			}
			
		}
		
		
		public global::System.Threading.Mutex native;
		
		public virtual void acquire() {
			( this.native as global::System.Threading.WaitHandle ).WaitOne();
		}
		
		
		public virtual bool tryAcquire() {
			return ( this.native as global::System.Threading.WaitHandle ).WaitOne(((int) (0) ));
		}
		
		
		public virtual void release() {
			this.native.ReleaseMutex();
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 572311959:
					{
						this.native = ((global::System.Threading.Mutex) (@value) );
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
					case 1491961287:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "release", 1491961287)) );
					}
					
					
					case 474773467:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "tryAcquire", 474773467)) );
					}
					
					
					case 887376854:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "acquire", 887376854)) );
					}
					
					
					case 572311959:
					{
						return this.native;
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
					case 1491961287:
					{
						this.release();
						break;
					}
					
					
					case 474773467:
					{
						return this.tryAcquire();
					}
					
					
					case 887376854:
					{
						this.acquire();
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
			baseArr.push("native");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


