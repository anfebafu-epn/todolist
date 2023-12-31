// Generated by Haxe 4.2.2
package haxe.iterators;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringIteratorUnicode extends haxe.lang.HxObject
{
	public StringIteratorUnicode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringIteratorUnicode(java.lang.String s)
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		haxe.iterators.StringIteratorUnicode.__hx_ctor_haxe_iterators_StringIteratorUnicode(this, s);
	}
	
	
	protected static void __hx_ctor_haxe_iterators_StringIteratorUnicode(haxe.iterators.StringIteratorUnicode __hx_this, java.lang.String s)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		__hx_this.offset = 0;
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 41 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			__hx_this.s = s;
		}
		
	}
	
	
	public static haxe.iterators.StringIteratorUnicode unicodeIterator(java.lang.String s)
	{
		//line 71 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		return new haxe.iterators.StringIteratorUnicode(haxe.lang.Runtime.toString(s));
	}
	
	
	public int offset;
	
	public java.lang.String s;
	
	public final boolean hasNext()
	{
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		return ( this.offset < this.s.length() );
	}
	
	
	public final int next()
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		java.lang.String s = this.s;
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		int index = this.offset++;
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		int c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		if (( ( c >= 55296 ) && ( c <= 56319 ) )) 
		{
			//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			int index1 = ( index + 1 );
			//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			c = ( ( ( c - 55232 ) << 10 ) | ( (( (( index1 < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index1)) )) : (-1) )) & 1023 ) );
		}
		
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		int c1 = c;
		//line 58 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		if (( c1 >= 65536 )) 
		{
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			this.offset++;
		}
		
		//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		return c1;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				switch (field.hashCode())
				{
					case -1019779949:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("offset")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							this.offset = ((int) (value) );
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				switch (field.hashCode())
				{
					case 115:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("s")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							this.s = haxe.lang.Runtime.toString(value);
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
					case -1019779949:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("offset")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							this.offset = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return value;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("next")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
					case -1019779949:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("offset")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return this.offset;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("hasNext")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
					case 115:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("s")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return this.s;
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				switch (field.hashCode())
				{
					case -1019779949:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("offset")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return ((double) (this.offset) );
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		{
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (( field != null )) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("next")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return this.next();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						if (field.equals("hasNext")) 
						{
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							__temp_executeDef1 = false;
							//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
							return this.hasNext();
						}
						
						//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		baseArr.push("s");
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		baseArr.push("offset");
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\iterators\\StringIteratorUnicode.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


