// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds {
	public class List<T> : global::haxe.lang.HxObject, global::haxe.ds.List {
		
		public List(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public List() {
			global::haxe.ds.List<object>.__hx_ctor_haxe_ds_List<T>(((global::haxe.ds.List<T>) (this) ));
		}
		
		
		protected static void __hx_ctor_haxe_ds_List<T_c>(global::haxe.ds.List<T_c> __hx_this) {
			__hx_this.length = 0;
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.ds.List me) {
			return ( (( me != null )) ? (me.haxe_ds_List_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_ds_List_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::haxe.ds.List<T_c> new_me = new global::haxe.ds.List<T_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public global::haxe.ds._List.ListNode<T> h;
		
		public global::haxe.ds._List.ListNode<T> q;
		
		public int length;
		
		public virtual void @add(T item) {
			global::haxe.ds._List.ListNode<T> next = null;
			global::haxe.ds._List.ListNode<T> x = new global::haxe.ds._List.ListNode<T>(global::haxe.lang.Runtime.genericCast<T>(item), ((global::haxe.ds._List.ListNode<T>) (next) ));
			if (( this.h == null )) {
				this.h = x;
			}
			else {
				this.q.next = x;
			}
			
			this.q = x;
			this.length++;
		}
		
		
		public virtual void push(T item) {
			global::haxe.ds._List.ListNode<T> x = new global::haxe.ds._List.ListNode<T>(global::haxe.lang.Runtime.genericCast<T>(item), ((global::haxe.ds._List.ListNode<T>) (this.h) ));
			this.h = x;
			if (( this.q == null )) {
				this.q = x;
			}
			
			this.length++;
		}
		
		
		public virtual global::haxe.lang.Null<T> first() {
			if (( this.h == null )) {
				return default(global::haxe.lang.Null<T>);
			}
			else {
				return new global::haxe.lang.Null<T>(this.h.item, true);
			}
			
		}
		
		
		public virtual global::haxe.lang.Null<T> last() {
			if (( this.q == null )) {
				return default(global::haxe.lang.Null<T>);
			}
			else {
				return new global::haxe.lang.Null<T>(this.q.item, true);
			}
			
		}
		
		
		public virtual global::haxe.lang.Null<T> pop() {
			if (( this.h == null )) {
				return default(global::haxe.lang.Null<T>);
			}
			
			T x = this.h.item;
			this.h = this.h.next;
			if (( this.h == null )) {
				this.q = null;
			}
			
			this.length--;
			return new global::haxe.lang.Null<T>(x, true);
		}
		
		
		public virtual bool isEmpty() {
			return ( this.h == null );
		}
		
		
		public virtual void clear() {
			this.h = null;
			this.q = null;
			this.length = 0;
		}
		
		
		public virtual bool @remove(T v) {
			global::haxe.ds._List.ListNode<T> prev = null;
			global::haxe.ds._List.ListNode<T> l = this.h;
			while (( l != null )) {
				if (global::haxe.lang.Runtime.eq(l.item, v)) {
					if (( prev == null )) {
						this.h = l.next;
					}
					else {
						prev.next = l.next;
					}
					
					if (( this.q == l )) {
						this.q = prev;
					}
					
					this.length--;
					return true;
				}
				
				prev = l;
				l = l.next;
			}
			
			return false;
		}
		
		
		public global::haxe.ds._List.ListIterator<T> iterator() {
			return new global::haxe.ds._List.ListIterator<T>(((global::haxe.ds._List.ListNode<T>) (this.h) ));
		}
		
		
		public global::haxe.ds._List.ListKeyValueIterator<T> keyValueIterator() {
			return new global::haxe.ds._List.ListKeyValueIterator<T>(((global::haxe.ds._List.ListNode<T>) (this.h) ));
		}
		
		
		public virtual string toString() {
			global::System.Text.StringBuilder s_b = new global::System.Text.StringBuilder();
			bool first = true;
			global::haxe.ds._List.ListNode<T> l = this.h;
			s_b.Append(((string) ("{") ));
			while (( l != null )) {
				if (first) {
					first = false;
				}
				else {
					s_b.Append(((string) (", ") ));
				}
				
				s_b.Append(((string) (global::Std.@string(global::Std.@string(l.item))) ));
				l = l.next;
			}
			
			s_b.Append(((string) ("}") ));
			return s_b.ToString();
		}
		
		
		public virtual string @join(string sep) {
			global::System.Text.StringBuilder s_b = new global::System.Text.StringBuilder();
			bool first = true;
			global::haxe.ds._List.ListNode<T> l = this.h;
			while (( l != null )) {
				if (first) {
					first = false;
				}
				else {
					s_b.Append(((string) (global::Std.@string(sep)) ));
				}
				
				s_b.Append(((string) (global::Std.@string(l.item)) ));
				l = l.next;
			}
			
			return s_b.ToString();
		}
		
		
		public virtual global::haxe.ds.List<T> filter(global::haxe.lang.Function f) {
			global::haxe.ds.List<T> l2 = new global::haxe.ds.List<T>();
			global::haxe.ds._List.ListNode<T> l = this.h;
			while (( l != null )) {
				T v = l.item;
				l = l.next;
				if (global::haxe.lang.Runtime.toBool(f.__hx_invoke1_o(default(double), v))) {
					l2.@add(v);
				}
				
			}
			
			return l2;
		}
		
		
		public virtual global::haxe.ds.List<X> map<X>(global::haxe.lang.Function f) {
			global::haxe.ds.List<X> b = new global::haxe.ds.List<X>();
			global::haxe.ds._List.ListNode<T> l = this.h;
			while (( l != null )) {
				T v = l.item;
				l = l.next;
				b.@add(global::haxe.lang.Runtime.genericCast<X>(f.__hx_invoke1_o(default(double), v)));
			}
			
			return b;
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 520590566:
					{
						this.length = ((int) (@value) );
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
					case 520590566:
					{
						this.length = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
						return @value;
					}
					
					
					case 113:
					{
						this.q = ((global::haxe.ds._List.ListNode<T>) (global::haxe.ds._List.ListNode<object>.__hx_cast<T>(((global::haxe.ds._List.ListNode) (@value) ))) );
						return @value;
					}
					
					
					case 104:
					{
						this.h = ((global::haxe.ds._List.ListNode<T>) (global::haxe.ds._List.ListNode<object>.__hx_cast<T>(((global::haxe.ds._List.ListNode) (@value) ))) );
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
					case 5442204:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "map", 5442204)) );
					}
					
					
					case 87367608:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "filter", 87367608)) );
					}
					
					
					case 1181037546:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "join", 1181037546)) );
					}
					
					
					case 946786476:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toString", 946786476)) );
					}
					
					
					case 1257164128:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "keyValueIterator", 1257164128)) );
					}
					
					
					case 328878574:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "iterator", 328878574)) );
					}
					
					
					case 76061764:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "remove", 76061764)) );
					}
					
					
					case 1213952397:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "clear", 1213952397)) );
					}
					
					
					case 207609411:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "isEmpty", 207609411)) );
					}
					
					
					case 5594513:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "pop", 5594513)) );
					}
					
					
					case 1202522710:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "last", 1202522710)) );
					}
					
					
					case 10319920:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "first", 10319920)) );
					}
					
					
					case 1247875546:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "push", 1247875546)) );
					}
					
					
					case 4846113:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "add", 4846113)) );
					}
					
					
					case 520590566:
					{
						return this.length;
					}
					
					
					case 113:
					{
						return this.q;
					}
					
					
					case 104:
					{
						return this.h;
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
					case 520590566:
					{
						return ((double) (this.length) );
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
					case 5442204:
					{
						return this.map<object>(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					case 87367608:
					{
						return this.filter(((global::haxe.lang.Function) (dynargs[0]) ));
					}
					
					
					case 1181037546:
					{
						return this.@join(global::haxe.lang.Runtime.toString(dynargs[0]));
					}
					
					
					case 946786476:
					{
						return this.toString();
					}
					
					
					case 1257164128:
					{
						return this.keyValueIterator();
					}
					
					
					case 328878574:
					{
						return this.iterator();
					}
					
					
					case 76061764:
					{
						return this.@remove(global::haxe.lang.Runtime.genericCast<T>(dynargs[0]));
					}
					
					
					case 1213952397:
					{
						this.clear();
						break;
					}
					
					
					case 207609411:
					{
						return this.isEmpty();
					}
					
					
					case 5594513:
					{
						return (this.pop()).toDynamic();
					}
					
					
					case 1202522710:
					{
						return (this.last()).toDynamic();
					}
					
					
					case 10319920:
					{
						return (this.first()).toDynamic();
					}
					
					
					case 1247875546:
					{
						this.push(global::haxe.lang.Runtime.genericCast<T>(dynargs[0]));
						break;
					}
					
					
					case 4846113:
					{
						this.@add(global::haxe.lang.Runtime.genericCast<T>(dynargs[0]));
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
			baseArr.push("length");
			baseArr.push("q");
			baseArr.push("h");
			base.__hx_getFields(baseArr);
		}
		
		
		public override string ToString(){
			return this.toString();
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.ds.List<object>))]
	public interface List : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_ds_List_cast<T_c>();
		
		bool isEmpty();
		
		void clear();
		
		string toString();
		
		string @join(string sep);
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	public class ListNode<T> : global::haxe.lang.HxObject, global::haxe.ds._List.ListNode {
		
		public ListNode(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ListNode(T item, global::haxe.ds._List.ListNode<T> next) {
			global::haxe.ds._List.ListNode<object>.__hx_ctor_haxe_ds__List_ListNode<T>(((global::haxe.ds._List.ListNode<T>) (this) ), global::haxe.lang.Runtime.genericCast<T>(item), ((global::haxe.ds._List.ListNode<T>) (next) ));
		}
		
		
		protected static void __hx_ctor_haxe_ds__List_ListNode<T_c>(global::haxe.ds._List.ListNode<T_c> __hx_this, T_c item, global::haxe.ds._List.ListNode<T_c> next) {
			__hx_this.item = item;
			__hx_this.next = next;
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.ds._List.ListNode me) {
			return ( (( me != null )) ? (me.haxe_ds__List_ListNode_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_ds__List_ListNode_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::haxe.ds._List.ListNode<T_c> new_me = new global::haxe.ds._List.ListNode<T_c>(global::haxe.lang.EmptyObject.EMPTY);
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public T item;
		
		public global::haxe.ds._List.ListNode<T> next;
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1170195731:
					{
						this.item = global::haxe.lang.Runtime.genericCast<T>(((object) (@value) ));
						return ((double) (global::haxe.lang.Runtime.toDouble(((object) (@value) ))) );
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
					case 1224901875:
					{
						this.next = ((global::haxe.ds._List.ListNode<T>) (global::haxe.ds._List.ListNode<object>.__hx_cast<T>(((global::haxe.ds._List.ListNode) (@value) ))) );
						return @value;
					}
					
					
					case 1170195731:
					{
						this.item = global::haxe.lang.Runtime.genericCast<T>(@value);
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
						return this.next;
					}
					
					
					case 1170195731:
					{
						return this.item;
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
					case 1170195731:
					{
						return ((double) (global::haxe.lang.Runtime.toDouble(((object) (this.item) ))) );
					}
					
					
					default:
					{
						return base.__hx_getField_f(field, hash, throwErrors, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("next");
			baseArr.push("item");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.ds._List.ListNode<object>))]
	public interface ListNode : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_ds__List_ListNode_cast<T_c>();
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	public class ListIterator<T> : global::haxe.lang.HxObject, global::haxe.ds._List.ListIterator {
		
		public ListIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ListIterator(global::haxe.ds._List.ListNode<T> head) {
			global::haxe.ds._List.ListIterator<object>.__hx_ctor_haxe_ds__List_ListIterator<T>(((global::haxe.ds._List.ListIterator<T>) (this) ), ((global::haxe.ds._List.ListNode<T>) (head) ));
		}
		
		
		protected static void __hx_ctor_haxe_ds__List_ListIterator<T_c>(global::haxe.ds._List.ListIterator<T_c> __hx_this, global::haxe.ds._List.ListNode<T_c> head) {
			__hx_this.head = head;
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.ds._List.ListIterator me) {
			return ( (( me != null )) ? (me.haxe_ds__List_ListIterator_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_ds__List_ListIterator_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::haxe.ds._List.ListIterator<T_c> new_me = new global::haxe.ds._List.ListIterator<T_c>(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public global::haxe.ds._List.ListNode<T> head;
		
		public bool hasNext() {
			return ( this.head != null );
		}
		
		
		public T next() {
			T val = this.head.item;
			this.head = this.head.next;
			return val;
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 1158359328:
					{
						this.head = ((global::haxe.ds._List.ListNode<T>) (global::haxe.ds._List.ListNode<object>.__hx_cast<T>(((global::haxe.ds._List.ListNode) (@value) ))) );
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
					
					
					case 1158359328:
					{
						return this.head;
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
			baseArr.push("head");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.ds._List.ListIterator<object>))]
	public interface ListIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_ds__List_ListIterator_cast<T_c>();
		
		bool hasNext();
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	public class ListKeyValueIterator<T> : global::haxe.lang.HxObject, global::haxe.ds._List.ListKeyValueIterator {
		
		public ListKeyValueIterator(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public ListKeyValueIterator(global::haxe.ds._List.ListNode<T> head) {
			global::haxe.ds._List.ListKeyValueIterator<object>.__hx_ctor_haxe_ds__List_ListKeyValueIterator<T>(((global::haxe.ds._List.ListKeyValueIterator<T>) (this) ), ((global::haxe.ds._List.ListNode<T>) (head) ));
		}
		
		
		protected static void __hx_ctor_haxe_ds__List_ListKeyValueIterator<T_c>(global::haxe.ds._List.ListKeyValueIterator<T_c> __hx_this, global::haxe.ds._List.ListNode<T_c> head) {
			__hx_this.head = head;
			__hx_this.idx = 0;
		}
		
		
		public static object __hx_cast<T_c_c>(global::haxe.ds._List.ListKeyValueIterator me) {
			return ( (( me != null )) ? (me.haxe_ds__List_ListKeyValueIterator_cast<T_c_c>()) : default(object) );
		}
		
		
		public virtual object haxe_ds__List_ListKeyValueIterator_cast<T_c>() {
			if (global::haxe.lang.Runtime.eq(typeof(T), typeof(T_c))) {
				return this;
			}
			
			global::haxe.ds._List.ListKeyValueIterator<T_c> new_me = new global::haxe.ds._List.ListKeyValueIterator<T_c>(((global::haxe.lang.EmptyObject) (global::haxe.lang.EmptyObject.EMPTY) ));
			global::Array<string> fields = global::Reflect.fields(this);
			int i = 0;
			while (( i < fields.length )) {
				string field = fields[i++];
				global::Reflect.setField(new_me, field, global::Reflect.field(this, field));
			}
			
			return new_me;
		}
		
		
		public int idx;
		
		public global::haxe.ds._List.ListNode<T> head;
		
		public bool hasNext() {
			return ( this.head != null );
		}
		
		
		public object next() {
			T val = this.head.item;
			this.head = this.head.next;
			{
				int __temp_odecl1 = this.idx++;
				return new global::haxe.lang.DynamicObject(new int[]{834174833}, new object[]{val}, new int[]{5343647}, new double[]{((double) (__temp_odecl1) )});
			}
			
		}
		
		
		public override double __hx_setField_f(string field, int hash, double @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5243965:
					{
						this.idx = ((int) (@value) );
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
					case 1158359328:
					{
						this.head = ((global::haxe.ds._List.ListNode<T>) (global::haxe.ds._List.ListNode<object>.__hx_cast<T>(((global::haxe.ds._List.ListNode) (@value) ))) );
						return @value;
					}
					
					
					case 5243965:
					{
						this.idx = ((int) (global::haxe.lang.Runtime.toInt(@value)) );
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
					
					
					case 1158359328:
					{
						return this.head;
					}
					
					
					case 5243965:
					{
						return this.idx;
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
					case 5243965:
					{
						return ((double) (this.idx) );
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
			baseArr.push("head");
			baseArr.push("idx");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.ds._List {
	[global::haxe.lang.GenericInterface(typeof(global::haxe.ds._List.ListKeyValueIterator<object>))]
	public interface ListKeyValueIterator : global::haxe.lang.IHxObject, global::haxe.lang.IGenericObject {
		
		object haxe_ds__List_ListKeyValueIterator_cast<T_c>();
		
		bool hasNext();
		
		object next();
		
	}
}


