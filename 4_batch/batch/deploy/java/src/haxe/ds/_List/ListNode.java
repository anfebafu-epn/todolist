// Generated by Haxe 4.2.2
package haxe.ds._List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ListNode<T> extends haxe.lang.HxObject
{
	public ListNode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ListNode(T item, haxe.ds._List.ListNode<T> next)
	{
		//line 266 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		haxe.ds._List.ListNode.__hx_ctor_haxe_ds__List_ListNode(((haxe.ds._List.ListNode<T>) (this) ), ((T) (item) ), ((haxe.ds._List.ListNode<T>) (next) ));
		//line 266 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_ds__List_ListNode(haxe.ds._List.ListNode<T_c> __hx_this, T_c item, haxe.ds._List.ListNode<T_c> next)
	{
		//line 267 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		__hx_this.item = item;
		//line 268 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		__hx_this.next = next;
	}
	
	
	public T item;
	
	public haxe.ds._List.ListNode<T> next;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3242771:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("item")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.item = ((T) (((java.lang.Object) (value) )) );
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("next")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.next = ((haxe.ds._List.ListNode<T>) (value) );
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return value;
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 3242771:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("item")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							this.item = ((T) (value) );
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return value;
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("next")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.next;
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
					case 3242771:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("item")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return this.item;
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		{
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			boolean __temp_executeDef1 = true;
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (( field != null )) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				switch (field.hashCode())
				{
					case 3242771:
					{
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						if (field.equals("item")) 
						{
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							__temp_executeDef1 = false;
							//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (this.item) ))) );
						}
						
						//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
			if (__temp_executeDef1) 
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		baseArr.push("next");
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		baseArr.push("item");
		//line 262 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\List.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


