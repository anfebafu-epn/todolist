// Generated by Haxe 4.2.2
package sys;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Http_request_60__Fun extends haxe.lang.Function
{
	public Http_request_60__Fun(haxe.io.BytesOutput output, haxe.lang.Function old, boolean[] err, sys.Http _gthis)
	{
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		super(1, 0);
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this.output = output;
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this.old = old;
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this.err = err;
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		java.lang.String e = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 61 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this._gthis.responseBytes = this.output.getBytes();
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this.err[0] = true;
		//line 64 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this._gthis.onError = this.old;
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		this._gthis.onError.__hx_invoke1_o(0.0, e);
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\sys\\Http.hx"
		return null;
	}
	
	
	public haxe.io.BytesOutput output;
	
	public haxe.lang.Function old;
	
	public boolean[] err;
	
	public sys.Http _gthis;
	
}


