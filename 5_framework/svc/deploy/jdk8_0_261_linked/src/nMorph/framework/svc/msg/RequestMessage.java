// Generated by Haxe 4.2.2
package nMorph.framework.svc.msg;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class RequestMessage extends haxe.lang.HxObject
{
	public RequestMessage(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public RequestMessage()
	{
		//line 7 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		nMorph.framework.svc.msg.RequestMessage.__hx_ctor_nMorph_framework_svc_msg_RequestMessage(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_svc_msg_RequestMessage(nMorph.framework.svc.msg.RequestMessage __hx_this)
	{
	}
	
	
	public int RequestSeq;
	
	public java.lang.String SessionID;
	
	public haxe.root.Array<nMorph.framework.svc.transport.MethodCall> Calls;
	
	public int set_RequestSeq(int value)
	{
		//line 16 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.RequestSeq = value;
	}
	
	
	public int get_RequestSeq()
	{
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.RequestSeq;
	}
	
	
	public java.lang.String get_SessionID()
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.SessionID;
	}
	
	
	public java.lang.String set_SessionID(java.lang.String value)
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.SessionID = value;
	}
	
	
	public haxe.root.Array<nMorph.framework.svc.transport.MethodCall> get_Calls()
	{
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.Calls;
	}
	
	
	public haxe.root.Array<nMorph.framework.svc.transport.MethodCall> set_Calls(haxe.root.Array<nMorph.framework.svc.transport.MethodCall> value)
	{
		//line 36 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		return this.Calls = value;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		{
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				switch (field.hashCode())
				{
					case 2030563184:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							if (handleProperties) 
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.set_RequestSeq(((int) (value) ));
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							else
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.RequestSeq = ((int) (value) );
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		{
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				switch (field.hashCode())
				{
					case 64872885:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							if (handleProperties) 
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.set_Calls(((haxe.root.Array<nMorph.framework.svc.transport.MethodCall>) (value) ));
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							else
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.Calls = ((haxe.root.Array<nMorph.framework.svc.transport.MethodCall>) (value) );
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 2030563184:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							if (handleProperties) 
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.set_RequestSeq(((int) (haxe.lang.Runtime.toInt(value)) ));
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							else
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.RequestSeq = ((int) (haxe.lang.Runtime.toInt(value)) );
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -1683202543:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							if (handleProperties) 
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.set_SessionID(haxe.lang.Runtime.toString(value));
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							else
							{
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								this.SessionID = haxe.lang.Runtime.toString(value);
								//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
								return value;
							}
							
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		{
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				switch (field.hashCode())
				{
					case 887205784:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_Calls")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 2030563184:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ( (handleProperties) ? (this.get_RequestSeq()) : (this.RequestSeq) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 1101822860:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_Calls")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -1683202543:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ( (handleProperties) ? (this.get_SessionID()) : (this.SessionID) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -394231180:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_SessionID")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 64872885:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ( (handleProperties) ? (this.get_Calls()) : (this.Calls) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -1168362392:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_SessionID")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -960997523:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_RequestSeq")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 810738681:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_RequestSeq")) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		{
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				switch (field.hashCode())
				{
					case 2030563184:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return ((double) (( (handleProperties) ? (this.get_RequestSeq()) : (this.RequestSeq) )) );
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		{
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (( field != null )) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				switch (field.hashCode())
				{
					case 887205784:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.set_Calls(((haxe.root.Array<nMorph.framework.svc.transport.MethodCall>) (dynargs[0]) ));
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -960997523:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.set_RequestSeq(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 1101822860:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_Calls")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.get_Calls();
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case 810738681:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_RequestSeq")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.get_RequestSeq();
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -394231180:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("set_SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.set_SessionID(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
					case -1168362392:
					{
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						if (field.equals("get_SessionID")) 
						{
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							__temp_executeDef1 = false;
							//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
							return this.get_SessionID();
						}
						
						//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		baseArr.push("Calls");
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		baseArr.push("SessionID");
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		baseArr.push("RequestSeq");
		//line 6 "C:\\TodoList\\nMorph\\5_framework\\svc\\src\\nMorph\\framework\\svc\\msg\\RequestMessage.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


