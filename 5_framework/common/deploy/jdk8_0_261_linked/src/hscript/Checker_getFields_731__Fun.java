// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Checker_getFields_731__Fun extends haxe.lang.Function
{
	public Checker_getFields_731__Fun(java.lang.Object[] c, haxe.root.Array<hscript.TType> args, hscript.Checker _gthis)
	{
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		super(1, 0);
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.c = c;
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.args = args;
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		hscript.TType t = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((hscript.TType) (((java.lang.Object) (__fn_float1) )) )) : (((hscript.TType) (__fn_dyn1) )) );
		//line 731 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		return this._gthis.apply(t, ((haxe.root.Array<hscript.TType>) (haxe.lang.Runtime.getField(this.c[0], "params", true)) ), this.args);
	}
	
	
	public java.lang.Object[] c;
	
	public haxe.root.Array<hscript.TType> args;
	
	public hscript.Checker _gthis;
	
}


