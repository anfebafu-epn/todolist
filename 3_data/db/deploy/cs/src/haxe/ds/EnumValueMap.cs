// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds {
	public class EnumValueMap<K, V> : global::haxe.ds.BalancedTree<K, V>, global::haxe.ds.EnumValueMap, global::haxe.IMap<K, V> {
		
		public EnumValueMap(global::haxe.lang.EmptyObject empty) : base(global::haxe.lang.EmptyObject.EMPTY) {
		}
		
		
		public EnumValueMap() : base(global::haxe.lang.EmptyObject.EMPTY) {
			global::haxe.ds.EnumValueMap<object, object>.__hx_ctor_haxe_ds_EnumValueMap<K, V>(((global::haxe.ds.EnumValueMap<K, V>) (this) ));
		}
		
		
		protected static void __hx_ctor_haxe_ds_EnumValueMap<K_c, V_c>(global::haxe.ds.EnumValueMap<K_c, V_c> __hx_this) {
			global::haxe.ds.BalancedTree<object, object>.__hx_ctor_haxe_ds_BalancedTree<K_c, V_c>(((global::haxe.ds.BalancedTree<K_c, V_c>) (__hx_this) ));
		}
		
		
		public static new object __hx_cast<K_c_c, V_c_c>(global::haxe.ds.EnumValueMap me) {
			return ( (( me != null )) ? (me.haxe_ds_EnumValueMap_cast<K_c_c, V_c_c>()) : default(object) );
		}
		
		
		global::haxe.IMap<K, V> global::haxe.IMap<K, V>.copy() {
			return ((global::haxe.IMap<K, V>) (this.copy()) );
		}
		
		
		public virtual object haxe_ds_EnumValueMap_cast<K_c, V_c>() {
			if (( global::haxe.lang.Runtime.eq(typeof(K), typeof(K_c)) && global::haxe.lang.Runtime.eq(typeof(V), typeof(V_c)) )) {
				return this;
			}
			
			global::haxe.ds.EnumValueMap<K_c, V_c> new_me = new global::haxe.ds.EnumValueMap<K_c, V_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public override object haxe_IMap_cast<K_c, V_c>() {
			return this.haxe_ds_EnumValueMap_cast<K, V>();
		}
		
		
		public override object haxe_ds_BalancedTree_cast<K_c, V_c>() {
			return this.haxe_ds_EnumValueMap_cast<K, V>();
		}
		
		
		public override int compare(K __temp_k11, K __temp_k22) {
			object k2 = ((object) (__temp_k22) );
			object k1 = ((object) (__temp_k11) );
			int d = ( global::Type.enumIndex(k1) - global::Type.enumIndex(k2) );
			if (( d != 0 )) {
				return d;
			}
			
			global::Array p1 = global::Type.enumParameters(k1);
			global::Array p2 = global::Type.enumParameters(k2);
			if (( ( ((int) (global::haxe.lang.Runtime.getField_f(p1, "length", 520590566, true)) ) == 0 ) && ( ((int) (global::haxe.lang.Runtime.getField_f(p2, "length", 520590566, true)) ) == 0 ) )) {
				return 0;
			}
			
			return this.compareArgs(p1, p2);
		}
		
		
		public virtual int compareArgs(global::Array a1, global::Array a2) {
			int ld = ( ((int) (global::haxe.lang.Runtime.getField_f(a1, "length", 520590566, true)) ) - ((int) (global::haxe.lang.Runtime.getField_f(a2, "length", 520590566, true)) ) );
			if (( ld != 0 )) {
				return ld;
			}
			
			{
				int _g = 0;
				int _g1 = ((int) (global::haxe.lang.Runtime.getField_f(a1, "length", 520590566, true)) );
				while (( _g < _g1 )) {
					int i = _g++;
					int d = this.compareArg(a1[i], a2[i]);
					if (( d != 0 )) {
						return d;
					}
					
				}
				
			}
			
			return 0;
		}
		
		
		public virtual int compareArg(object v1, object v2) {
			if (( global::Reflect.isEnumValue(v1) && global::Reflect.isEnumValue(v2) )) {
				return this.compare(global::haxe.lang.Runtime.genericCast<K>(v1), global::haxe.lang.Runtime.genericCast<K>(v2));
			}
			else if (( ( v1 is global::Array ) && ( v2 is global::Array ) )) {
				return this.compareArgs(((global::Array) (v1) ), ((global::Array) (v2) ));
			}
			else {
				return global::Reflect.compare<object>(((object) (v1) ), ((object) (v2) ));
			}
			
		}
		
		
		public override global::haxe.ds.BalancedTree<K, V> copy() {
			global::haxe.ds.EnumValueMap<K, V> copied = new global::haxe.ds.EnumValueMap<K, V>();
			copied.root = this.root;
			return copied;
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1103412149:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "copy", 1103412149)) );
					}
					
					
					case 244830897:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "compareArg", 244830897)) );
					}
					
					
					case 910198946:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "compareArgs", 910198946)) );
					}
					
					
					case 57219237:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "compare", 57219237)) );
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
					case 57219237:
					case 1103412149:
					{
						return global::haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					
					case 244830897:
					{
						return this.compareArg(dynargs[0], dynargs[1]);
					}
					
					
					case 910198946:
					{
						return this.compareArgs(((global::Array) (dynargs[0]) ), ((global::Array) (dynargs[1]) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.ds.EnumValueMap<object, object>))]
	public interface EnumValueMap : global::haxe.lang.IHxObject, global::haxe.ds.BalancedTree, global::haxe.lang.IGenericObject {
		
		object haxe_ds_EnumValueMap_cast<K_c, V_c>();
		
		object haxe_ds_BalancedTree_cast<K_c, V_c>();
		
		int compareArgs(global::Array a1, global::Array a2);
		
		int compareArg(object v1, object v2);
		
	}
}


