// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Interp_initOps_108__Fun extends haxe.lang.Function
{
	public Interp_initOps_108__Fun(hscript.Interp me)
	{
		//line 108 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Interp.hx"
		super(2, 1);
		//line 108 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Interp.hx"
		this.me = me;
	}
	
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 108 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Interp.hx"
		java.lang.Object e2 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (((java.lang.Object) (__fn_dyn2) )) );
		//line 108 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Interp.hx"
		java.lang.Object e1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 108 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Interp.hx"
		return ((double) (( ((int) (haxe.lang.Runtime.toInt(this.me.expr(e1))) ) >>> ((int) (haxe.lang.Runtime.toInt(this.me.expr(e2))) ) )) );
	}
	
	
	public hscript.Interp me;
	
}


