// Generated by Haxe 4.2.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Reflect extends haxe.lang.HxObject
{
	public Reflect(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Reflect()
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		haxe.root.Reflect.__hx_ctor__Reflect(this);
	}
	
	
	protected static void __hx_ctor__Reflect(haxe.root.Reflect __hx_this)
	{
	}
	
	
	public static boolean hasField(java.lang.Object o, java.lang.String field)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ( ! (haxe.lang.Runtime.eq(((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, true, false), haxe.lang.Runtime.undefined)) );
		}
		
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowHasField(o, field);
	}
	
	
	public static java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, false);
		}
		
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, false);
		}
		else
		{
			//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Runtime.slowSetField(o, field, value);
		}
		
	}
	
	
	public static java.lang.Object getProperty(java.lang.Object o, java.lang.String field)
	{
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( ( o == null ) || ( field == null ) )) 
		{
			//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return null;
		}
		
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ((haxe.lang.IHxObject) (o) ).__hx_getField(field, false, false, true);
		}
		
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (haxe.lang.Runtime.slowHasField(o, ( "get_" + field ))) 
		{
			//line 61 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return haxe.lang.Runtime.slowCallField(o, ( "get_" + field ), null);
		}
		
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.slowGetField(o, field, false);
	}
	
	
	public static void setProperty(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		//line 67 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 68 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_setField(field, value, true);
		}
		else
		{
			//line 69 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if (haxe.lang.Runtime.slowHasField(o, ( "set_" + field ))) 
			{
				//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.lang.Runtime.slowCallField(o, ( "set_" + field ), ((java.lang.Object[]) (new java.lang.Object[]{((java.lang.Object) (value) )}) ));
			}
			else
			{
				//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.lang.Runtime.slowSetField(o, field, value);
			}
			
		}
		
	}
	
	
	public static java.lang.Object callMethod(java.lang.Object o, java.lang.Object func, haxe.root.Array args)
	{
		//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		java.lang.Object[] ret = new java.lang.Object[args.length];
		//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		{
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			int _g = 0;
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			int _g1 = args.length;
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			while (( _g < _g1 ))
			{
				//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				int i = _g++;
				//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				ret[i] = args.__get(i);
			}
			
		}
		
		//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		java.lang.Object[] args1 = ret;
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ((haxe.lang.Function) (func) ).__hx_invokeDynamic(args1);
	}
	
	
	public static haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.IHxObject )) 
		{
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			//line 85 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			((haxe.lang.IHxObject) (o) ).__hx_getFields(ret);
			//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ret;
		}
		else
		{
			//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if (( o instanceof java.lang.Class )) 
			{
				//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return haxe.root.Type.getClassFields(((java.lang.Class) (o) ));
			}
			else
			{
				//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			}
			
		}
		
	}
	
	
	public static boolean isFunction(java.lang.Object f)
	{
		//line 95 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ( f instanceof haxe.lang.Function );
	}
	
	
	public static <T> int compare(T a, T b)
	{
		//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return haxe.lang.Runtime.compare(a, b);
	}
	
	
	public static boolean compareMethods(java.lang.Object f1, java.lang.Object f2)
	{
		//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (haxe.lang.Runtime.eq(f1, f2)) 
		{
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return true;
		}
		
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( ( f1 instanceof haxe.lang.Closure ) && ( f2 instanceof haxe.lang.Closure ) )) 
		{
			//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Closure f1c = ((haxe.lang.Closure) (f1) );
			//line 109 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.lang.Closure f2c = ((haxe.lang.Closure) (f2) );
			//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if (haxe.lang.Runtime.refEq(f1c.obj, f2c.obj)) 
			{
				//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return haxe.lang.Runtime.valEq(f1c.field, f2c.field);
			}
			else
			{
				//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return false;
			}
			
		}
		
		//line 112 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return false;
	}
	
	
	public static boolean isObject(java.lang.Object v)
	{
		//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( ! (( v == null )) )) 
		{
			//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return  ! ((( ( ( ( ( v instanceof haxe.lang.Enum ) || ( v instanceof haxe.lang.Function ) ) || ( v instanceof java.lang.Enum ) ) || ( v instanceof java.lang.Number ) ) || ( v instanceof java.lang.Boolean ) ))) ;
		}
		else
		{
			//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return false;
		}
		
	}
	
	
	public static boolean isEnumValue(java.lang.Object v)
	{
		//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( ! (( v == null )) )) 
		{
			//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			if ( ! (( v instanceof haxe.lang.Enum )) ) 
			{
				//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return ( v instanceof java.lang.Enum );
			}
			else
			{
				//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				return true;
			}
			
		}
		else
		{
			//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return false;
		}
		
	}
	
	
	public static boolean deleteField(java.lang.Object o, java.lang.String field)
	{
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o instanceof haxe.lang.DynamicObject )) 
		{
			//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return ((haxe.lang.DynamicObject) (o) ).__hx_deleteField(field);
		}
		else
		{
			//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return false;
		}
		
	}
	
	
	public static <T> java.lang.Object copy(java.lang.Object o)
	{
		//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		if (( o == null )) 
		{
			//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			return null;
		}
		
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		java.lang.Object o2 = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		{
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			int _g = 0;
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(o);
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
			while (( _g < _g1.length ))
			{
				//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				java.lang.String f = _g1.__get(_g);
				//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				 ++ _g;
				//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
				haxe.root.Reflect.setField(o2, f, haxe.root.Reflect.field(o, f));
			}
			
		}
		
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return ((java.lang.Object) (o2) );
	}
	
	
	public static java.lang.Object makeVarArgs(haxe.lang.Function f)
	{
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Reflect.hx"
		return new haxe.lang.VarArgsFunction(f);
	}
	
	
}


