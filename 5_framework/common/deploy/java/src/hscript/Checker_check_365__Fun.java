// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Checker_check_365__Fun extends haxe.lang.Function
{
	public Checker_check_365__Fun(hscript.TType ft, java.lang.Object[] e, hscript.Checker _gthis)
	{
		//line 365 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		super(0, 0);
		//line 365 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.ft = ft;
		//line 365 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.e = e;
		//line 365 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 366 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis.currentFunType = this.ft;
		//line 367 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis.typeExpr(this.e[0], hscript._Checker.WithType.NoValue);
		//line 368 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		return this.ft;
	}
	
	
	public hscript.TType ft;
	
	public java.lang.Object[] e;
	
	public hscript.Checker _gthis;
	
}

