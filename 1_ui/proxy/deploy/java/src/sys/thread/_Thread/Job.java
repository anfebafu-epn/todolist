// Generated by Haxe 4.2.2
package sys.thread._Thread;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Job extends haxe.lang.HxObject implements java.lang.Runnable
{
	public Job(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Job(haxe.lang.Function job)
	{
		//line 182 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		sys.thread._Thread.Job.__hx_ctor_sys_thread__Thread_Job(this, job);
	}
	
	
	protected static void __hx_ctor_sys_thread__Thread_Job(sys.thread._Thread.Job __hx_this, haxe.lang.Function job)
	{
		//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		__hx_this.job = job;
	}
	
	
	public haxe.lang.Function job;
	
	public void run()
	{
		//line 187 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		this.job.__hx_invoke0_o();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (( field != null )) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				switch (field.hashCode())
				{
					case 105405:
					{
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("job")) 
						{
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							this.job = ((haxe.lang.Function) (value) );
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							return value;
						}
						
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (( field != null )) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("run")) 
						{
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
						}
						
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
					case 105405:
					{
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("job")) 
						{
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							return this.job;
						}
						
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		{
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			boolean __temp_executeDef1 = true;
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (( field != null )) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						if (field.equals("run")) 
						{
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							__temp_executeDef1 = false;
							//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
							this.run();
						}
						
						//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
			if (__temp_executeDef1) 
			{
				//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		baseArr.push("job");
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Thread.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


