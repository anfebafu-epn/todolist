// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Error extends haxe.lang.HxObject
{
	public Error(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Error(hscript.ErrorDef e, int pmin, int pmax, java.lang.String origin, int line)
	{
		//line 95 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		hscript.Error.__hx_ctor_hscript_Error(this, e, pmin, pmax, origin, line);
	}
	
	
	protected static void __hx_ctor_hscript_Error(hscript.Error __hx_this, hscript.ErrorDef e, int pmin, int pmax, java.lang.String origin, int line)
	{
		//line 96 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		__hx_this.e = e;
		//line 97 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		__hx_this.pmin = pmin;
		//line 98 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		__hx_this.pmax = pmax;
		//line 99 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		__hx_this.origin = origin;
		//line 100 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		__hx_this.line = line;
	}
	
	
	public hscript.ErrorDef e;
	
	public int pmin;
	
	public int pmax;
	
	public java.lang.String origin;
	
	public int line;
	
	@Override public java.lang.String toString()
	{
		//line 103 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		return hscript.Printer.errorToString(this);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			boolean __temp_executeDef1 = true;
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (( field != null )) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				switch (field.hashCode())
				{
					case 3321844:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("line")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.line = ((int) (value) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444706:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.pmin = ((int) (value) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444468:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmax")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.pmax = ((int) (value) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (__temp_executeDef1) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			boolean __temp_executeDef1 = true;
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (( field != null )) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				switch (field.hashCode())
				{
					case 3321844:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("line")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.line = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 101:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("e")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.e = ((hscript.ErrorDef) (value) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case -1008619738:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("origin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.origin = haxe.lang.Runtime.toString(value);
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444706:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.pmin = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444468:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmax")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							this.pmax = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return value;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (__temp_executeDef1) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			boolean __temp_executeDef1 = true;
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (( field != null )) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("toString")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 101:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("e")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.e;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3321844:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("line")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.line;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444706:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.pmin;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case -1008619738:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("origin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.origin;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444468:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmax")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.pmax;
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (__temp_executeDef1) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			boolean __temp_executeDef1 = true;
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (( field != null )) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				switch (field.hashCode())
				{
					case 3321844:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("line")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return ((double) (this.line) );
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444706:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmin")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return ((double) (this.pmin) );
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
					case 3444468:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("pmax")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return ((double) (this.pmax) );
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (__temp_executeDef1) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			boolean __temp_executeDef1 = true;
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (( field != null )) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						if (field.equals("toString")) 
						{
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							__temp_executeDef1 = false;
							//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
							return this.toString();
						}
						
						//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
			if (__temp_executeDef1) 
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		baseArr.push("line");
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		baseArr.push("origin");
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		baseArr.push("pmax");
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		baseArr.push("pmin");
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		baseArr.push("e");
		//line 89 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Expr.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


