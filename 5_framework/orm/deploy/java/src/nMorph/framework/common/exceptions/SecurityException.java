// Generated by Haxe 4.2.2
package nMorph.framework.common.exceptions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SecurityException extends haxe.Exception
{
	public SecurityException(haxe.lang.EmptyObject empty)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SecurityException(int Code, java.lang.String Msg)
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		super(haxe.lang.Runtime.toString(Msg), ((haxe.Exception) (null) ), ((java.lang.Object) (null) ));
		//line 9 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		this.set_Code(Code);
	}
	
	
	public int Code;
	
	public int set_Code(int value)
	{
		//line 15 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		return this.Code = value;
	}
	
	
	public int get_Code()
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		return this.Code;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		{
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (( field != null )) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				switch (field.hashCode())
				{
					case 2105869:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							if (handleProperties) 
							{
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								this.set_Code(((int) (value) ));
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								return value;
							}
							else
							{
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								this.Code = ((int) (value) );
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								return value;
							}
							
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		{
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (( field != null )) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				switch (field.hashCode())
				{
					case 2105869:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							if (handleProperties) 
							{
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								this.set_Code(((int) (haxe.lang.Runtime.toInt(value)) ));
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								return value;
							}
							else
							{
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								this.Code = ((int) (haxe.lang.Runtime.toInt(value)) );
								//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
								return value;
							}
							
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		{
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (( field != null )) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				switch (field.hashCode())
				{
					case 1975218518:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("get_Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_Code")) );
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
					case 2105869:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return ( (handleProperties) ? (this.get_Code()) : (this.Code) );
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
					case 1414106058:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("set_Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_Code")) );
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		{
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (( field != null )) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				switch (field.hashCode())
				{
					case 2105869:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return ((double) (( (handleProperties) ? (this.get_Code()) : (this.Code) )) );
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		{
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			boolean __temp_executeDef1 = true;
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (( field != null )) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				switch (field.hashCode())
				{
					case 1975218518:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("get_Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return this.get_Code();
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
					case 1414106058:
					{
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						if (field.equals("set_Code")) 
						{
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							__temp_executeDef1 = false;
							//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
							return this.set_Code(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
			if (__temp_executeDef1) 
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		baseArr.push("Code");
		//line 5 "C:\\TodoList\\nMorph\\5_framework\\common\\src\\nMorph\\framework\\common\\exceptions\\SecurityException.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

