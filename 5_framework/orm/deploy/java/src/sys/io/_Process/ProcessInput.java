// Generated by Haxe 4.2.2
package sys.io._Process;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ProcessInput extends haxe.java.io.NativeInput
{
	public ProcessInput(haxe.lang.EmptyObject empty)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public ProcessInput(java.io.InputStream stream)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		sys.io._Process.ProcessInput.__hx_ctor_sys_io__Process_ProcessInput(this, stream);
	}
	
	
	protected static void __hx_ctor_sys_io__Process_ProcessInput(sys.io._Process.ProcessInput __hx_this, java.io.InputStream stream)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		haxe.java.io.NativeInput.__hx_ctor_haxe_java_io_NativeInput(__hx_this, stream);
	}
	
	
	public haxe.io.BytesInput chained;
	
	public void bufferContents()
	{
		//line 128 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( this.chained != null )) 
		{
			//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			return ;
		}
		
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		haxe.io.Bytes b = this.readAll(null);
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		this.chained = new haxe.io.BytesInput(((haxe.io.Bytes) (b) ), ((java.lang.Object) (null) ), ((java.lang.Object) (null) ));
	}
	
	
	@Override public int readByte()
	{
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( this.chained != null )) 
		{
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			return this.chained.readByte();
		}
		
		//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		int ret = 0;
		//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		try 
		{
			//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			ret = this.stream.read();
		}
		catch (java.io.IOException e)
		{
			//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.Custom(e))) );
		}
		
		
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( ret == -1 )) 
		{
			//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(new haxe.io.Eof())) );
		}
		
		//line 145 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		return ret;
	}
	
	
	@Override public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 149 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( this.chained != null )) 
		{
			//line 150 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			return this.chained.readBytes(s, pos, len);
		}
		
		//line 152 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		int ret = -1;
		//line 154 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		try 
		{
			//line 154 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			ret = this.stream.read(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
		}
		catch (java.io.EOFException e)
		{
			//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(new haxe.io.Eof())) );
		}
		
		catch (java.io.IOException e1)
		{
			//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.Custom(e1))) );
		}
		
		
		//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( ret == -1 )) 
		{
			//line 163 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(new haxe.io.Eof())) );
		}
		
		//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		return ret;
	}
	
	
	@Override public void close()
	{
		//line 168 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		if (( this.chained != null )) 
		{
			//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			this.chained.close();
		}
		
		//line 171 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		try 
		{
			//line 171 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			this.stream.close();
		}
		catch (java.io.IOException e)
		{
			//line 173 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(haxe.io.Error.Custom(e))) );
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		{
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			boolean __temp_executeDef1 = true;
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (( field != null )) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				switch (field.hashCode())
				{
					case 738801440:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("chained")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							this.chained = ((haxe.io.BytesInput) (value) );
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return value;
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (__temp_executeDef1) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		{
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			boolean __temp_executeDef1 = true;
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (( field != null )) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				switch (field.hashCode())
				{
					case 94756344:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("close")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
					case 738801440:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("chained")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return this.chained;
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
					case -1140063115:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("readBytes")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
					case 640488314:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("bufferContents")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bufferContents")) );
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
					case -868060226:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("readByte")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (__temp_executeDef1) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		{
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			int __temp_hash2 = field.hashCode();
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			boolean __temp_executeDef1 = true;
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (( field != null )) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				switch (__temp_hash2)
				{
					case 94756344:
					case -1140063115:
					case -868060226:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (( (( ( __temp_hash2 == 94756344 ) && field.equals("close") )) || ( (( ( __temp_hash2 == -1140063115 ) && field.equals("readBytes") )) || field.equals("readByte") ) )) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
					case 640488314:
					{
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						if (field.equals("bufferContents")) 
						{
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							__temp_executeDef1 = false;
							//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
							this.bufferContents();
						}
						
						//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
			if (__temp_executeDef1) 
			{
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		baseArr.push("chained");
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\sys\\io\\Process.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


