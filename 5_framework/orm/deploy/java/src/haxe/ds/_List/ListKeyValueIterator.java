// Generated by Haxe 4.2.2
package haxe.ds._List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ListKeyValueIterator<T> extends haxe.lang.HxObject
{
	public ListKeyValueIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ListKeyValueIterator(haxe.ds._List.ListNode<T> head)
	{
		//line 299 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		haxe.ds._List.ListKeyValueIterator.__hx_ctor_haxe_ds__List_ListKeyValueIterator(((haxe.ds._List.ListKeyValueIterator<T>) (this) ), ((haxe.ds._List.ListNode<T>) (head) ));
		//line 299 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_ds__List_ListKeyValueIterator(haxe.ds._List.ListKeyValueIterator<T_c> __hx_this, haxe.ds._List.ListNode<T_c> head)
	{
		//line 300 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		__hx_this.head = head;
		//line 301 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		__hx_this.idx = 0;
	}
	
	
	public int idx;
	
	public haxe.ds._List.ListNode<T> head;
	
	public final boolean hasNext()
	{
		//line 305 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		return ( this.head != null );
	}
	
	
	public final java.lang.Object next()
	{
		//line 309 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		T val = this.head.item;
		//line 310 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		this.head = this.head.next;
		//line 311 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 311 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			int __temp_odecl1 = this.idx++;
			//line 311 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{"value"}, new java.lang.Object[]{val}, new java.lang.String[]{"key"}, new double[]{((double) (((double) (__temp_odecl1) )) )});
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 104125:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("idx")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.idx = ((int) (value) );
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return value;
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3198432:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("head")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.head = ((haxe.ds._List.ListNode<T>) (value) );
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return value;
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 104125:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("idx")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.idx = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return value;
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("next")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 104125:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("idx")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.idx;
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("hasNext")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 3198432:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("head")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.head;
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 104125:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("idx")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return ((double) (this.idx) );
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("next")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.next();
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("hasNext")) 
						{
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.hasNext();
						}
						
						//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		baseArr.push("head");
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		baseArr.push("idx");
		//line 295 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


