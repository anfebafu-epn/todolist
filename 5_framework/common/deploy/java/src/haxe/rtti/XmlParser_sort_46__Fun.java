// Generated by Haxe 4.2.2
package haxe.rtti;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class XmlParser_sort_46__Fun extends haxe.lang.Function
{
	public XmlParser_sort_46__Fun()
	{
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		super(2, 1);
	}
	
	
	public static haxe.rtti.XmlParser_sort_46__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		haxe.rtti.TypeTree e2 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.rtti.TypeTree) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.rtti.TypeTree) (__fn_dyn2) )) );
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		haxe.rtti.TypeTree e1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.rtti.TypeTree) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.rtti.TypeTree) (__fn_dyn1) )) );
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		java.lang.String n1 = null;
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		switch (e1.index)
		{
			case 0:
			{
				//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				java.lang.String _g = haxe.lang.Runtime.toString(e1.params[1]);
				//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				haxe.root.Array<haxe.rtti.TypeTree> _g1 = ((haxe.root.Array<haxe.rtti.TypeTree>) (e1.params[2]) );
				//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				java.lang.String p = haxe.lang.Runtime.toString(e1.params[0]);
				//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				n1 = ( " " + p );
				//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				break;
			}
			
			
			default:
			{
				//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				n1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.rtti.TypeApi.typeInfos(e1), "path", true));
				//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				break;
			}
			
		}
		
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		java.lang.String n2 = null;
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		switch (e2.index)
		{
			case 0:
			{
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				java.lang.String _g2 = haxe.lang.Runtime.toString(e2.params[1]);
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				haxe.root.Array<haxe.rtti.TypeTree> _g3 = ((haxe.root.Array<haxe.rtti.TypeTree>) (e2.params[2]) );
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				java.lang.String p1 = haxe.lang.Runtime.toString(e2.params[0]);
				//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				n2 = ( " " + p1 );
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				break;
			}
			
			
			default:
			{
				//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				n2 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.rtti.TypeApi.typeInfos(e2), "path", true));
				//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
				break;
			}
			
		}
		
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		if (( n1.compareTo(n2) > 0 )) 
		{
			//line 56 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
			return ((double) (1) );
		}
		
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\XmlParser.hx"
		return ((double) (-1) );
	}
	
	
}


