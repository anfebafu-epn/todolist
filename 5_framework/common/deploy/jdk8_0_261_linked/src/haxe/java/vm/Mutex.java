// Generated by Haxe 4.2.2
package haxe.java.vm;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Mutex extends haxe.lang.HxObject
{
	public Mutex(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Mutex()
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		haxe.java.vm.Mutex.__hx_ctor_haxe_java_vm_Mutex(this);
	}
	
	
	protected static void __hx_ctor_haxe_java_vm_Mutex(haxe.java.vm.Mutex __hx_this)
	{
		//line 32 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		__hx_this.lock = new java.util.concurrent.locks.ReentrantLock();
	}
	
	
	public java.util.concurrent.locks.ReentrantLock lock;
	
	public boolean tryAcquire()
	{
		//line 36 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		return this.lock.tryLock();
	}
	
	
	public void acquire()
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		this.lock.lock();
	}
	
	
	public void release()
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		this.lock.unlock();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				switch (field.hashCode())
				{
					case 3327275:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("lock")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							this.lock = ((java.util.concurrent.locks.ReentrantLock) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				switch (field.hashCode())
				{
					case 1090594823:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("release")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "release")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
					case 3327275:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("lock")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return this.lock;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
					case -1164222250:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("acquire")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "acquire")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
					case -285024613:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("tryAcquire")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "tryAcquire")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				switch (field.hashCode())
				{
					case 1090594823:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("release")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							this.release();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
					case -285024613:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("tryAcquire")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							return this.tryAcquire();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
					case -1164222250:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						if (field.equals("acquire")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
							this.acquire();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		baseArr.push("lock");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\thread\\Mutex.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


