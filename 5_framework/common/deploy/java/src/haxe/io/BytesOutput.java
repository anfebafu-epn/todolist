// Generated by Haxe 4.2.2
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BytesOutput extends haxe.io.Output
{
	public BytesOutput(haxe.lang.EmptyObject empty)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BytesOutput()
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		haxe.io.BytesOutput.__hx_ctor_haxe_io_BytesOutput(this);
	}
	
	
	protected static void __hx_ctor_haxe_io_BytesOutput(haxe.io.BytesOutput __hx_this)
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		__hx_this.b = new haxe.io.BytesBuffer();
	}
	
	
	public haxe.io.BytesBuffer b;
	
	
	
	public final int get_length()
	{
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		return this.b.b.size();
	}
	
	
	@Override public void writeByte(int c)
	{
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		try 
		{
			//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			this.b.b.write(((int) (c) ));
		}
		catch (java.lang.Throwable typedException)
		{
			//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	@Override public int writeBytes(haxe.io.Bytes buf, int pos, int len)
	{
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		try 
		{
			//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			{
				//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				haxe.io.BytesBuffer _this = this.b;
				//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > buf.length ) )) 
				{
					//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.OutsideBounds)) );
				}
				
				//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				_this.b.write(((byte[]) (buf.b) ), ((int) (pos) ), ((int) (len) ));
			}
			
			//line 67 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			return len;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public haxe.io.Bytes getBytes()
	{
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		return this.b.getBytes();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		{
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (( field != null )) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				switch (field.hashCode())
				{
					case 98:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("b")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							this.b = ((haxe.io.BytesBuffer) (value) );
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return value;
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		{
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (( field != null )) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				switch (field.hashCode())
				{
					case 1950049973:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("getBytes")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBytes")) );
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case 98:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("b")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return this.b;
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case -662729780:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("writeBytes")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case -1106363674:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("length")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return this.get_length();
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case -1406851705:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("writeByte")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case 974314479:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("get_length")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_length")) );
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		{
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (( field != null )) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				switch (field.hashCode())
				{
					case -1106363674:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("length")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return ((double) (this.get_length()) );
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		{
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			int __temp_hash2 = field.hashCode();
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (( field != null )) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				switch (__temp_hash2)
				{
					case -662729780:
					case -1406851705:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (( (( ( __temp_hash2 == -662729780 ) && field.equals("writeBytes") )) || field.equals("writeByte") )) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case 974314479:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("get_length")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return this.get_length();
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
					case 1950049973:
					{
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						if (field.equals("getBytes")) 
						{
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							__temp_executeDef1 = false;
							//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
							return this.getBytes();
						}
						
						//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		baseArr.push("length");
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		baseArr.push("b");
		//line 25 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\BytesOutput.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


