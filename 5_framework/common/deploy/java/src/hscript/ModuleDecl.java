// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ModuleDecl extends haxe.lang.ParamEnum
{
	public ModuleDecl(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"DPackage", "DImport", "DClass", "DTypedef"};
	
	public static hscript.ModuleDecl DPackage(haxe.root.Array<java.lang.String> path)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.ModuleDecl(0, new java.lang.Object[]{path});
	}
	
	
	public static hscript.ModuleDecl DImport(haxe.root.Array<java.lang.String> path, java.lang.Object everything)
	{
		//line 125 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.ModuleDecl(1, new java.lang.Object[]{path, everything});
	}
	
	
	public static hscript.ModuleDecl DClass(java.lang.Object c)
	{
		//line 126 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.ModuleDecl(2, new java.lang.Object[]{c});
	}
	
	
	public static hscript.ModuleDecl DTypedef(java.lang.Object c)
	{
		//line 127 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return new hscript.ModuleDecl(3, new java.lang.Object[]{c});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 123 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return hscript.ModuleDecl.__hx_constructs[this.index];
	}
	
	
}


