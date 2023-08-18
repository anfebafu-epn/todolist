// Generated by Haxe 4.2.2
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Timer extends haxe.lang.HxObject
{
	public Timer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Timer(int time_ms)
	{
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		haxe.Timer.__hx_ctor_haxe_Timer(this, time_ms);
	}
	
	
	protected static void __hx_ctor_haxe_Timer(haxe.Timer __hx_this, int time_ms)
	{
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		__hx_this.run = ( (( haxe.Timer___hx_ctor_haxe_Timer_129__Fun.__hx_current != null )) ? (haxe.Timer___hx_ctor_haxe_Timer_129__Fun.__hx_current) : (haxe.Timer___hx_ctor_haxe_Timer_129__Fun.__hx_current = ((haxe.Timer___hx_ctor_haxe_Timer_129__Fun) (new haxe.Timer___hx_ctor_haxe_Timer_129__Fun()) )) );
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 75 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			__hx_this.thread = ((sys.thread._Thread.HaxeThread) (sys.thread._Thread.HaxeThread.get(java.lang.Thread.currentThread())) );
			//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			haxe.Timer _gthis = __hx_this;
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			__hx_this.eventHandler = sys.thread._Thread.Thread_Impl_.get_events(__hx_this.thread).repeat(new haxe.Timer___hx_ctor_haxe_Timer_76__Fun(_gthis), time_ms);
		}
		
	}
	
	
	public static haxe.Timer delay(haxe.lang.Function f, int time_ms)
	{
		//line 141 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		haxe.Timer t = new haxe.Timer(((int) (time_ms) ));
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		t.run = new haxe.Timer_delay_142__Fun(t, f);
		//line 146 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		return t;
	}
	
	
	public static <T> T measure(haxe.lang.Function f, java.lang.Object pos)
	{
		//line 161 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		double t0 = haxe.root.Sys.time();
		//line 162 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		T r = ((T) (f.__hx_invoke0_o()) );
		//line 163 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, ( haxe.lang.Runtime.toString(( haxe.root.Sys.time() - t0 )) + "s" ), 0.0, pos);
		//line 164 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		return r;
	}
	
	
	public static double stamp()
	{
		//line 188 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		return haxe.root.Sys.time();
	}
	
	
	public sys.thread._Thread.HaxeThread thread;
	
	public sys.thread._EventLoop.RegularEvent eventHandler;
	
	public void stop()
	{
		//line 106 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		sys.thread._Thread.Thread_Impl_.get_events(this.thread).cancel(this.eventHandler);
	}
	
	
	public haxe.lang.Function run;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (( field != null )) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("run")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							this.run = ((haxe.lang.Function) (value) );
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return value;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
					case -874443254:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("thread")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							this.thread = ((sys.thread._Thread.HaxeThread) (value) );
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return value;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
					case 1601059664:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("eventHandler")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							this.eventHandler = ((sys.thread._EventLoop.RegularEvent) (value) );
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return value;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (( field != null )) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("run")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return this.run;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
					case -874443254:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("thread")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return this.thread;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
					case 3540994:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("stop")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
					case 1601059664:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("eventHandler")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							return this.eventHandler;
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (( field != null )) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				switch (field.hashCode())
				{
					case 3540994:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						if (field.equals("stop")) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							__temp_executeDef1 = false;
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
							this.stop();
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("run");
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("eventHandler");
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("thread");
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Timer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

