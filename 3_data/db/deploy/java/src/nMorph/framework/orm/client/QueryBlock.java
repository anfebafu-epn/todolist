// Generated by Haxe 4.2.2
package nMorph.framework.orm.client;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class QueryBlock extends haxe.lang.HxObject
{
	static
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		nMorph.framework.orm.client.QueryBlock.__rtti = "<class path=\"nMorph.framework.orm.client.QueryBlock\" params=\"\">\n\t<SET public=\"1\" set=\"method\" line=\"17\" static=\"1\"><f a=\"BlockName:BlockCode\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.client.QueryBlock\"/>\n</f></SET>\n\t<BlockName public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</BlockName>\n\t<get_BlockName set=\"method\" line=\"27\"><f a=\"\"><c path=\"String\"/></f></get_BlockName>\n\t<set_BlockName set=\"method\" line=\"32\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_BlockName>\n\t<BlockCode get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"String\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</BlockCode>\n\t<get_BlockCode set=\"method\" line=\"40\"><f a=\"\"><c path=\"String\"/></f></get_BlockCode>\n\t<set_BlockCode set=\"method\" line=\"45\"><f a=\"value\">\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n</f></set_BlockCode>\n\t<new public=\"1\" set=\"method\" line=\"12\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<haxe_doc>* ...\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public QueryBlock(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public QueryBlock()
	{
		//line 11 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		nMorph.framework.orm.client.QueryBlock.__hx_ctor_nMorph_framework_orm_client_QueryBlock(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_client_QueryBlock(nMorph.framework.orm.client.QueryBlock __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public static nMorph.framework.orm.client.QueryBlock SET(java.lang.String BlockName, java.lang.String BlockCode)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		nMorph.framework.orm.client.QueryBlock b = new nMorph.framework.orm.client.QueryBlock();
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		b.set_BlockName(BlockName);
		//line 20 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		b.set_BlockCode(BlockCode);
		//line 21 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		return b;
	}
	
	
	public java.lang.String BlockName;
	
	public java.lang.String get_BlockName()
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		return this.BlockName;
	}
	
	
	public java.lang.String set_BlockName(java.lang.String value)
	{
		//line 33 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		return this.BlockName = value;
	}
	
	
	public java.lang.String BlockCode;
	
	public java.lang.String get_BlockCode()
	{
		//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		return this.BlockCode;
	}
	
	
	public java.lang.String set_BlockCode(java.lang.String value)
	{
		//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		return this.BlockCode = value;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		{
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (( field != null )) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				switch (field.hashCode())
				{
					case -1419053062:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							if (handleProperties) 
							{
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								this.set_BlockCode(haxe.lang.Runtime.toString(value));
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								return value;
							}
							else
							{
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								this.BlockCode = haxe.lang.Runtime.toString(value);
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								return value;
							}
							
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -1418738536:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							if (handleProperties) 
							{
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								this.set_BlockName(haxe.lang.Runtime.toString(value));
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								return value;
							}
							else
							{
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								this.BlockName = haxe.lang.Runtime.toString(value);
								//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
								return value;
							}
							
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		{
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (( field != null )) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				switch (field.hashCode())
				{
					case -130081699:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("set_BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_BlockCode")) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -1418738536:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ( (handleProperties) ? (this.get_BlockName()) : (this.BlockName) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -904212911:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("get_BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_BlockCode")) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -903898385:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("get_BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_BlockName")) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -1419053062:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ( (handleProperties) ? (this.get_BlockCode()) : (this.BlockCode) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -129767173:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("set_BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_BlockName")) );
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		{
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (( field != null )) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				switch (field.hashCode())
				{
					case -130081699:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("set_BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return this.set_BlockCode(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -903898385:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("get_BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return this.get_BlockName();
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -904212911:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("get_BlockCode")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return this.get_BlockCode();
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
					case -129767173:
					{
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						if (field.equals("set_BlockName")) 
						{
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							__temp_executeDef1 = false;
							//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
							return this.set_BlockName(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		baseArr.push("BlockCode");
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		baseArr.push("BlockName");
		//line 8 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\QueryBlock.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

