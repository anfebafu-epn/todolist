// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.iterators {
	public class RestKeyValueIterator<T> : global::haxe.lang.HxObject, global::haxe.iterators.RestKeyValueIterator {
		
		public RestKeyValueIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public RestKeyValueIterator(object args) {
			global::haxe.iterators.RestKeyValueIterator<object>.__hx_ctor_haxe_iterators_RestKeyValueIterator<T>(((global::haxe.iterators.RestKeyValueIterator<T>) (this) ), ((object) (args) ));
		}
		
		
		protected static void __hx_ctor_haxe_iterators_RestKeyValueIterator<T_c>(global::haxe.iterators.RestKeyValueIterator<T_c> __hx_this, object args) {
			__hx_this.current = 0;
			{
				__hx_this.args = ((T_c[]) (((object) (args) )) );
			}
			
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.iterators.RestKeyValueIterator me) {
			return ( (( me != null )) ? (me.haxe_iterators_RestKeyValueIterator_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_iterators_RestKeyValueIterator_cast<T_c>() {
			unchecked {
				if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
					return this;
				}
				
				global::haxe.iterators.RestKeyValueIterator<T_c> new_me = new global::haxe.iterators.RestKeyValueIterator<T_c>(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
				global::Array<string> fields = global::Reflect.fields(this);
				int i = 0;
				while (( i < fields.length )) {
					string field = fields[i++];
					switch (field) {
						case "args":
						{
							if (( this.args != null )) {
								T_c[] __temp_new_arr1 = new T_c[this.args.Length];
								int __temp_i2 = -1;
								while ((  ++ __temp_i2 < this.args.Length )) {
									object __temp_obj3 = ((object) (this.args[__temp_i2]) );
									if (( __temp_obj3 != null )) {
										__temp_new_arr1[__temp_i2] = global::haxe.lang.Runtime.genericCast<T_c>(__temp_obj3);
									}
									
								}
								
								new_me.args = __temp_new_arr1;
							}
							else {
								new_me.args = null;
							}
							
							break;
						}
						
						
						default:
						{
							global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
							break;
						}
						
					}
					
				}
				
				return new_me;
			}
		}
		
		
		public T[] args;
		
		public int current;
		
		public bool hasNext() {
			return ( this.current < ( ((T[]) (this.args) ) as global::System.Array ).Length );
		}
		
		
		public object next() {
			int tmp = this.current;
			{
				T __temp_odecl1 = global::haxe.lang.Runtime.genericCast<T>(((T[]) (this.args) )[this.current++]);
				return new global::haxe.lang.DynamicObject(new int[]{834174833}, new object[]{__temp_odecl1}, new int[]{5343647}, new double[]{((double) (tmp) )});
			}
			
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1273207865:
					{
						this.current = ((int) (@value) );
						return @value;
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
					case 1273207865:
					{
						this.current = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 1081380189:
					{
						this.args = ((T[]) (@value) );
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
					case 1224901875:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "next", 1224901875)) );
					}
					
					
					case 407283053:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "hasNext", 407283053)) );
					}
					
					
					case 1273207865:
					{
						return this.current;
					}
					
					
					case 1081380189:
					{
						return this.args;
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
					case 1273207865:
					{
						return ((double) (this.current) );
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
					case 1224901875:
					{
						return this.next();
					}
					
					
					case 407283053:
					{
						return this.hasNext();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("current");
			baseArr.push("args");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.iterators {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.iterators.RestKeyValueIterator<object>))]
	public interface RestKeyValueIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_iterators_RestKeyValueIterator_cast<T_c>();
		
		bool hasNext();
		
		object next();
		
	}
}


