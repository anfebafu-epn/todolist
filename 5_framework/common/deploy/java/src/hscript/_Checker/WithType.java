// Generated by Haxe 4.2.2
package hscript._Checker;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WithType extends haxe.lang.ParamEnum
{
	public WithType(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"NoValue", "Value", "WithType"};
	
	public static final hscript._Checker.WithType NoValue = new hscript._Checker.WithType(0, null);
	
	public static final hscript._Checker.WithType Value = new hscript._Checker.WithType(1, null);
	
	public static hscript._Checker.WithType WithType(hscript.TType t)
	{
		//line 32 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		return new hscript._Checker.WithType(2, new java.lang.Object[]{t});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		return hscript._Checker.WithType.__hx_constructs[this.index];
	}
	
	
}


