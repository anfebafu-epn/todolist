// Generated by Haxe 4.2.2
package haxe._Unserializer;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DefaultResolver extends haxe.lang.HxObject
{
	public DefaultResolver(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DefaultResolver()
	{
		//line 512 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		haxe._Unserializer.DefaultResolver.__hx_ctor_haxe__Unserializer_DefaultResolver(this);
	}
	
	
	protected static void __hx_ctor_haxe__Unserializer_DefaultResolver(haxe._Unserializer.DefaultResolver __hx_this)
	{
	}
	
	
	public final java.lang.Class resolveClass(java.lang.String name)
	{
		//line 515 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		return haxe.root.Type.resolveClass(name);
	}
	
	
	public final java.lang.Class resolveEnum(java.lang.String name)
	{
		//line 518 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		return haxe.root.Type.resolveEnum(name);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		{
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (( field != null )) 
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				switch (field.hashCode())
				{
					case 1952363789:
					{
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						if (field.equals("resolveEnum")) 
						{
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							__temp_executeDef1 = false;
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resolveEnum")) );
						}
						
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						break;
					}
					
					
					case 391809772:
					{
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						if (field.equals("resolveClass")) 
						{
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							__temp_executeDef1 = false;
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resolveClass")) );
						}
						
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		{
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (( field != null )) 
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				switch (field.hashCode())
				{
					case 1952363789:
					{
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						if (field.equals("resolveEnum")) 
						{
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							__temp_executeDef1 = false;
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							return this.resolveEnum(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						break;
					}
					
					
					case 391809772:
					{
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						if (field.equals("resolveClass")) 
						{
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							__temp_executeDef1 = false;
							//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
							return this.resolveClass(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 511 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


