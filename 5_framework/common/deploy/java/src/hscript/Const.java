// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Const extends haxe.lang.ParamEnum
{
	public Const(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"CInt", "CFloat", "CString"};
	
	public static hscript.Const CInt(int v)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.Const(0, new java.lang.Object[]{v});
	}
	
	
	public static hscript.Const CFloat(double f)
	{
		//line 26 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.Const(1, new java.lang.Object[]{f});
	}
	
	
	public static hscript.Const CString(java.lang.String s)
	{
		//line 27 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.Const(2, new java.lang.Object[]{s});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 24 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return hscript.Const.__hx_constructs[this.index];
	}
	
	
}


