// Generated by Haxe 4.2.2
package nMorph.framework.orm.tools;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BulkRun extends haxe.lang.HxObject
{
	static
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		nMorph.framework.orm.tools.BulkRun.__rtti = "<class path=\"nMorph.framework.orm.tools.BulkRun\" params=\"\">\n\t<queue public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</queue>\n\t<get_queue set=\"method\" line=\"17\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c></f></get_queue>\n\t<set_queue set=\"method\" line=\"22\"><f a=\"value\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></set_queue>\n\t<Execute public=\"1\" set=\"method\" line=\"31\"><f a=\"\"><x path=\"Void\"/></f></Execute>\n\t<new public=\"1\" set=\"method\" line=\"27\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<haxe_doc>* Clase utilizada para encolar varias llamadas para ejecuci\u00f3n masiva unificada\n * @author Smartwork</haxe_doc>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keep\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public BulkRun(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BulkRun()
	{
		//line 26 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		nMorph.framework.orm.tools.BulkRun.__hx_ctor_nMorph_framework_orm_tools_BulkRun(this);
	}
	
	
	protected static void __hx_ctor_nMorph_framework_orm_tools_BulkRun(nMorph.framework.orm.tools.BulkRun __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue;
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> get_queue()
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		return this.queue;
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> set_queue(haxe.root.Array<nMorph.framework.orm.client.QueueItem> value)
	{
		//line 23 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		return this.queue = value;
	}
	
	
	public void Execute()
	{
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		nMorph.framework.orm.client.Connector.ExecuteQueue(this.get_queue());
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		{
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (( field != null )) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				switch (field.hashCode())
				{
					case 107944209:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							if (handleProperties) 
							{
								//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
								this.set_queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (value) ));
								//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
								return value;
							}
							else
							{
								//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
								this.queue = ((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (value) );
								//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
								return value;
							}
							
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		{
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (( field != null )) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				switch (field.hashCode())
				{
					case 345083733:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("Execute")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Execute")) );
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
					case 107944209:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return ( (handleProperties) ? (this.get_queue()) : (this.queue) );
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
					case 930277108:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("set_queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_queue")) );
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
					case 1144894184:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("get_queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_queue")) );
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		{
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (( field != null )) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				switch (field.hashCode())
				{
					case 345083733:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("Execute")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							this.Execute();
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
					case 1144894184:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("get_queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return this.get_queue();
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
					case 930277108:
					{
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						if (field.equals("set_queue")) 
						{
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							__temp_executeDef1 = false;
							//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
							return this.set_queue(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		baseArr.push("queue");
		//line 10 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\tools\\BulkRun.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


