// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AsyncInterp_split_497__Fun extends haxe.lang.Function
{
	public AsyncInterp_split_497__Fun(haxe.lang.Function rest, int[] count)
	{
		//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		super(1, 0);
		//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		this.rest = rest;
		//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		this.count = count;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 497 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		java.lang.Object _1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		if ((  -- this.count[0] == 0 )) 
		{
			//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
			this.rest.__hx_invoke1_o(0.0, null);
		}
		
		//line 498 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Async.hx"
		return null;
	}
	
	
	public haxe.lang.Function rest;
	
	public int[] count;
	
}


