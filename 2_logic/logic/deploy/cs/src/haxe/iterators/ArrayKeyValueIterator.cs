// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.iterators {
	public class ArrayKeyValueIterator<T> : global::haxe.lang.HxObject, global::haxe.iterators.ArrayKeyValueIterator {
		
		public ArrayKeyValueIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ArrayKeyValueIterator(global::Array<T> array) {
			global::haxe.iterators.ArrayKeyValueIterator<object>.__hx_ctor_haxe_iterators_ArrayKeyValueIterator<T>(((global::haxe.iterators.ArrayKeyValueIterator<T>) (this) ), ((global::Array<T>) (array) ));
		}
		
		
		protected static void __hx_ctor_haxe_iterators_ArrayKeyValueIterator<T_c>(global::haxe.iterators.ArrayKeyValueIterator<T_c> __hx_this, global::Array<T_c> array) {
			__hx_this.current = 0;
			{
				__hx_this.array = array;
			}
			
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.iterators.ArrayKeyValueIterator me) {
			return ( (( me != null )) ? (me.haxe_iterators_ArrayKeyValueIterator_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_iterators_ArrayKeyValueIterator_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::haxe.iterators.ArrayKeyValueIterator<T_c> new_me = new global::haxe.iterators.ArrayKeyValueIterator<T_c>(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public int current;
		
		public global::Array<T> array;
		
		public bool hasNext() {
			return ( this.current < this.array.length );
		}
		
		
		public object next() {
			T tmp = this.array[this.current];
			{
				int __temp_odecl1 = this.current++;
				return new global::haxe.lang.DynamicObject(new int[]{834174833}, new object[]{tmp}, new int[]{5343647}, new double[]{((double) (__temp_odecl1) )});
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
					case 630156697:
					{
						this.array = ((global::Array<T>) (global::Array<object>.__hx_cast<T>(((global::Array) (@value) ))) );
						return @value;
					}
					
					
					case 1273207865:
					{
						this.current = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					
					
					case 630156697:
					{
						return this.array;
					}
					
					
					case 1273207865:
					{
						return this.current;
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
			baseArr.push("array");
			baseArr.push("current");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.iterators {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.iterators.ArrayKeyValueIterator<object>))]
	public interface ArrayKeyValueIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_iterators_ArrayKeyValueIterator_cast<T_c>();
		
		bool hasNext();
		
		object next();
		
	}
}

