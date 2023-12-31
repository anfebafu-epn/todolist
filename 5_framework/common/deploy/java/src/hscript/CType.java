// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CType extends haxe.lang.ParamEnum
{
	public CType(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"CTPath", "CTFun", "CTAnon", "CTParent", "CTOpt", "CTNamed"};
	
	public static hscript.CType CTPath(haxe.root.Array<java.lang.String> path, haxe.root.Array<hscript.CType> params)
	{
		//line 80 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(0, new java.lang.Object[]{path, params});
	}
	
	
	public static hscript.CType CTFun(haxe.root.Array<hscript.CType> args, hscript.CType ret)
	{
		//line 81 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(1, new java.lang.Object[]{args, ret});
	}
	
	
	public static hscript.CType CTAnon(haxe.root.Array<java.lang.Object> fields)
	{
		//line 82 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(2, new java.lang.Object[]{fields});
	}
	
	
	public static hscript.CType CTParent(hscript.CType t)
	{
		//line 83 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(3, new java.lang.Object[]{t});
	}
	
	
	public static hscript.CType CTOpt(hscript.CType t)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(4, new java.lang.Object[]{t});
	}
	
	
	public static hscript.CType CTNamed(java.lang.String n, hscript.CType t)
	{
		//line 85 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.CType(5, new java.lang.Object[]{n, t});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 79 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return hscript.CType.__hx_constructs[this.index];
	}
	
	
}


