// Generated by Haxe 4.2.2
package nMorph.framework.orm.client;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ModelItem<T> extends haxe.lang.HxObject
{
	static
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		nMorph.framework.orm.client.ModelItem.__rtti = "<class path=\"nMorph.framework.orm.client.ModelItem\" params=\"T\">\n\t<it public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"nMorph.framework.orm.client.ModelItem.T\"/>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</it>\n\t<set_it set=\"method\" line=\"17\"><f a=\"value\">\n\t<c path=\"nMorph.framework.orm.client.ModelItem.T\"/>\n\t<c path=\"nMorph.framework.orm.client.ModelItem.T\"/>\n</f></set_it>\n\t<get_it set=\"method\" line=\"21\"><f a=\"\"><c path=\"nMorph.framework.orm.client.ModelItem.T\"/></f></get_it>\n\t<Include public=\"1\" set=\"method\" line=\"26\"><f a=\"clause:laClase:context\">\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<d/>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Include>\n\t<Save public=\"1\" set=\"method\" line=\"49\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Save>\n\t<Clear public=\"1\" set=\"method\" line=\"58\"><f a=\"\"><x path=\"Void\"/></f></Clear>\n\t<new public=\"1\" set=\"method\" line=\"66\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public ModelItem(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ModelItem()
	{
		//line 66 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		nMorph.framework.orm.client.ModelItem.__hx_ctor_nMorph_framework_orm_client_ModelItem(((nMorph.framework.orm.client.ModelItem<T>) (this) ));
		//line 66 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_nMorph_framework_orm_client_ModelItem(nMorph.framework.orm.client.ModelItem<T_c> __hx_this)
	{
	}
	
	
	public static java.lang.String __rtti;
	
	public T it;
	
	public T set_it(T value)
	{
		//line 18 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		return this.it = value;
	}
	
	
	public T get_it()
	{
		//line 22 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		return this.it;
	}
	
	
	public void Include(nMorph.framework.orm.interfaces.IClause clause, java.lang.Object laClase, nMorph.framework.orm.tools.Context context)
	{
		//line 28 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		java.lang.Class clase = ((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (laClase) ))) );
		//line 29 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		java.lang.String name = haxe.root.Type.getClassName(clase);
		//line 31 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		java.lang.Class type = haxe.root.Type.resolveClass(name);
		//line 32 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		T item = ((T) (clause.ReadOne(((java.lang.Class) (type) ), ((nMorph.framework.orm.tools.Context) (context) ))) );
		//line 35 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		this.set_it(item);
		//line 38 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		if (haxe.root.Std.isOfType(this.get_it(), nMorph.framework.orm.client.ModelObject.class)) 
		{
			//line 39 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (this.get_it()) )) );
			//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			mo.set_TrackChanges(true);
			//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			mo.set_ObjectEditType(nMorph.framework.orm.common.enums.ObjectEditTypeEnum.NOCHANGE);
			//line 42 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			mo.set_ObjectSource(nMorph.framework.orm.common.enums.ObjectSourceTypeEnum.DB);
		}
		else
		{
			//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
		}
		
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Save(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		if (( this.get_it() == null )) 
		{
			//line 50 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			return queue;
		}
		
		//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		if (haxe.root.Std.isOfType(this.get_it(), nMorph.framework.orm.client.ModelObject.class)) 
		{
			//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (this.get_it()) )) );
			//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			queue = mo.Save(queue);
		}
		
		//line 55 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		return queue;
	}
	
	
	public void Clear()
	{
		//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		if (( this.get_it() == null )) 
		{
			//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			return ;
		}
		
		//line 60 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		if (haxe.root.Std.isOfType(this.get_it(), nMorph.framework.orm.client.ModelObject.class)) 
		{
			//line 61 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (this.get_it()) )) );
			//line 62 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			mo.Clear();
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				switch (field.hashCode())
				{
					case 3371:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							if (handleProperties) 
							{
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								this.set_it(((T) (((java.lang.Object) (value) )) ));
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
							}
							else
							{
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								this.it = ((T) (((java.lang.Object) (value) )) );
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
							}
							
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				switch (field.hashCode())
				{
					case 3371:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							if (handleProperties) 
							{
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								this.set_it(((T) (value) ));
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								return value;
							}
							else
							{
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								this.it = ((T) (value) );
								//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
								return value;
							}
							
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				switch (field.hashCode())
				{
					case 65193517:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Clear")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Clear")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case 3371:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ( (handleProperties) ? (this.get_it()) : (this.it) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case 2569629:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Save")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Save")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -905788888:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("set_it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_it")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -687739768:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Include")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Include")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -1249338700:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("get_it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_it")) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				switch (field.hashCode())
				{
					case 3371:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (( (handleProperties) ? (this.get_it()) : (this.it) )) ))) );
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		{
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (( field != null )) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				switch (field.hashCode())
				{
					case 65193517:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Clear")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							this.Clear();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -905788888:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("set_it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return this.set_it(((T) (dynargs[0]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case 2569629:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Save")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return this.Save(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -1249338700:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("get_it")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							return this.get_it();
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
					case -687739768:
					{
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						if (field.equals("Include")) 
						{
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							__temp_executeDef1 = false;
							//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
							this.Include(((nMorph.framework.orm.interfaces.IClause) (dynargs[0]) ), dynargs[1], ((nMorph.framework.orm.tools.Context) (dynargs[2]) ));
						}
						
						//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		baseArr.push("it");
		//line 13 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelItem.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


