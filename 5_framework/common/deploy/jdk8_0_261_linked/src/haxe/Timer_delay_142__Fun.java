// Generated by Haxe 4.2.2
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Timer_delay_142__Fun extends haxe.lang.Function
{
	public Timer_delay_142__Fun(haxe.Timer t, haxe.lang.Function f)
	{
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		super(0, 0);
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		this.t = t;
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		this.f = f;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		this.t.stop();
		//line 144 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		this.f.__hx_invoke0_o();
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		return null;
	}
	
	
	public haxe.Timer t;
	
	public haxe.lang.Function f;
	
}


