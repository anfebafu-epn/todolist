// Generated by Haxe 4.2.2
package nMorph.framework.orm.client;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ModelArray<T> extends haxe.lang.HxObject
{
	static
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		nMorph.framework.orm.client.ModelArray.__rtti = "<class path=\"nMorph.framework.orm.client.ModelArray\" params=\"T\">\n\t<arr public=\"1\" get=\"accessor\" set=\"accessor\">\n\t\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></c>\n\t\t<meta><m n=\":isVar\"/></meta>\n\t</arr>\n\t<set_arr set=\"method\" line=\"18\"><f a=\"value\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></c>\n</f></set_arr>\n\t<get_arr set=\"method\" line=\"23\"><f a=\"\"><c path=\"Array\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></c></f></get_arr>\n\t<Include public=\"1\" set=\"method\" line=\"38\"><f a=\"clause:laClase:context\">\n\t<c path=\"nMorph.framework.orm.interfaces.IClause\"/>\n\t<d/>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<x path=\"Void\"/>\n</f></Include>\n\t<Add public=\"1\" set=\"method\" line=\"65\"><f a=\"x\">\n\t<c path=\"nMorph.framework.orm.client.ModelArray.T\"/>\n\t<x path=\"Int\"/>\n</f></Add>\n\t<Remove public=\"1\" set=\"method\" line=\"74\"><f a=\"x\">\n\t<c path=\"nMorph.framework.orm.client.ModelArray.T\"/>\n\t<x path=\"Bool\"/>\n</f></Remove>\n\t<Insert public=\"1\" set=\"method\" line=\"88\"><f a=\"pos:x\">\n\t<x path=\"Int\"/>\n\t<c path=\"nMorph.framework.orm.client.ModelArray.T\"/>\n\t<x path=\"Void\"/>\n</f></Insert>\n\t<Filter public=\"1\" set=\"method\" line=\"93\"><f a=\"f\">\n\t<f a=\"\">\n\t\t<c path=\"nMorph.framework.orm.client.ModelArray.T\"/>\n\t\t<x path=\"Bool\"/>\n\t</f>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></c>\n</f></Filter>\n\t<iterator public=\"1\" set=\"method\" line=\"98\"><f a=\"\"><t path=\"Iterator\"><c path=\"nMorph.framework.orm.client.ModelArray.T\"/></t></f></iterator>\n\t<Save public=\"1\" set=\"method\" line=\"103\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Save>\n\t<Clear public=\"1\" set=\"method\" line=\"116\"><f a=\"\"><x path=\"Void\"/></f></Clear>\n\t<new public=\"1\" set=\"method\" line=\"138\"><f a=\"\"><x path=\"Void\"/></f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
	}
	
	public ModelArray(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ModelArray()
	{
		//line 137 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		nMorph.framework.orm.client.ModelArray.__hx_ctor_nMorph_framework_orm_client_ModelArray(((nMorph.framework.orm.client.ModelArray<T>) (this) ));
		//line 137 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_nMorph_framework_orm_client_ModelArray(nMorph.framework.orm.client.ModelArray<T_c> __hx_this)
	{
		//line 139 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		__hx_this.set_arr(new haxe.root.Array<T_c>());
	}
	
	
	public static java.lang.String __rtti;
	
	public haxe.root.Array<T> arr;
	
	public haxe.root.Array<T> set_arr(haxe.root.Array<T> value)
	{
		//line 19 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return this.arr = value;
	}
	
	
	public haxe.root.Array<T> get_arr()
	{
		//line 24 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return this.arr;
	}
	
	
	public void Include(nMorph.framework.orm.interfaces.IClause clause, java.lang.Object laClase, nMorph.framework.orm.tools.Context context)
	{
		//line 40 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		java.lang.Class clase = ((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (laClase) ))) );
		//line 41 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		java.lang.String name = haxe.root.Type.getClassName(clase);
		//line 43 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		java.lang.Class type = haxe.root.Type.resolveClass(name);
		//line 45 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		haxe.root.Array<T> DBresult = ((haxe.root.Array<T>) (((haxe.root.Array) (clause.Read(((java.lang.Class) (type) ), ((nMorph.framework.orm.tools.Context) (context) ))) )) );
		//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			int _g = 0;
			//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			while (( _g < DBresult.length ))
			{
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				T item = DBresult.__get(_g);
				//line 46 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				 ++ _g;
				//line 49 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				if (haxe.root.Std.isOfType(item, nMorph.framework.orm.client.ModelObject.class)) 
				{
					//line 51 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (item) )) );
					//line 52 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					mo.set_TrackChanges(true);
					//line 53 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					mo.set_ObjectEditType(nMorph.framework.orm.common.enums.ObjectEditTypeEnum.NOCHANGE);
					//line 54 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					mo.set_ObjectSource(nMorph.framework.orm.common.enums.ObjectSourceTypeEnum.DB);
					//line 55 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					this.Add(item);
				}
				else
				{
					//line 59 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
				}
				
			}
			
		}
		
	}
	
	
	public int Add(T x)
	{
		//line 66 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		if ( ! (haxe.root.Std.isOfType(x, nMorph.framework.orm.client.ModelObject.class)) ) 
		{
			//line 67 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
		}
		
		//line 68 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return this.get_arr().push(x);
	}
	
	
	public boolean Remove(T x)
	{
		//line 75 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		if ( ! (haxe.root.Std.isOfType(x, nMorph.framework.orm.client.ModelObject.class)) ) 
		{
			//line 76 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			nMorph.framework.common.exceptions.ExceptionHelper.LogicException(1, "Objects should be ModelObjects");
		}
		
		//line 78 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (x) )) );
		//line 81 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		mo.set_ObjectEditType(nMorph.framework.orm.common.enums.ObjectEditTypeEnum.DELETE);
		//line 84 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return true;
	}
	
	
	public void Insert(int pos, T x)
	{
		//line 89 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		this.get_arr().insert(pos, x);
	}
	
	
	public haxe.root.Array<T> Filter(haxe.lang.Function f)
	{
		//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		haxe.root.Array<T> _this = this.get_arr();
		//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		haxe.root.Array<T> ret = new haxe.root.Array<T>(( (T[]) (new java.lang.Object[] {}) ));
		//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			int _g = 0;
			//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			int _g1 = _this.length;
			//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			while (( _g < _g1 ))
			{
				//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				int i = _g++;
				//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				T elt = _this.__get(i);
				//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, elt)) ))) 
				{
					//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 94 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return ret;
	}
	
	
	public java.lang.Object iterator()
	{
		//line 99 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return new haxe.iterators.ArrayIterator<T>(((haxe.root.Array<T>) (this.get_arr()) ));
	}
	
	
	public haxe.root.Array<nMorph.framework.orm.client.QueueItem> Save(haxe.root.Array<nMorph.framework.orm.client.QueueItem> queue)
	{
		//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			int _g = 0;
			//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			haxe.root.Array<T> _g1 = this.get_arr();
			//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			while (( _g < _g1.length ))
			{
				//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				T item = _g1.__get(_g);
				//line 104 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				 ++ _g;
				//line 106 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				if (haxe.root.Std.isOfType(item, nMorph.framework.orm.client.ModelObject.class)) 
				{
					//line 108 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (item) )) );
					//line 109 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					queue = mo.Save(queue);
				}
				
			}
			
		}
		
		//line 112 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return queue;
	}
	
	
	public void Clear()
	{
		//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		int _g = 0;
		//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		haxe.root.Array<T> _g1 = this.get_arr();
		//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		while (( _g < _g1.length ))
		{
			//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			T item = _g1.__get(_g);
			//line 117 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			 ++ _g;
			//line 119 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (haxe.root.Std.isOfType(item, nMorph.framework.orm.client.ModelObject.class)) 
			{
				//line 121 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				nMorph.framework.orm.client.ModelObject mo = ((nMorph.framework.orm.client.ModelObject) (((java.lang.Object) (item) )) );
				//line 123 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				if (( mo.get_ObjectEditType() == nMorph.framework.orm.common.enums.ObjectEditTypeEnum.DELETE )) 
				{
					//line 126 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					this.get_arr().remove(item);
				}
				else
				{
					//line 131 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
					mo.Clear();
				}
				
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (( field != null )) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				switch (field.hashCode())
				{
					case 96865:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							if (handleProperties) 
							{
								//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
								this.set_arr(((haxe.root.Array<T>) (value) ));
								//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
								return value;
							}
							else
							{
								//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
								this.arr = ((haxe.root.Array<T>) (value) );
								//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
								return value;
							}
							
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (( field != null )) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				switch (field.hashCode())
				{
					case 65193517:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Clear")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Clear")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 96865:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ( (handleProperties) ? (this.get_arr()) : (this.arr) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 2569629:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Save")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Save")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 1985307908:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("set_arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_arr")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("iterator")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -74801672:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("get_arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_arr")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 2104342424:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Filter")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Filter")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -687739768:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Include")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Include")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -2099925287:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Insert")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Insert")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 65665:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Add")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Add")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -1850743644:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Remove")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "Remove")) );
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		{
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (( field != null )) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				switch (field.hashCode())
				{
					case 65193517:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Clear")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							this.Clear();
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 1985307908:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("set_arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.set_arr(((haxe.root.Array<T>) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 2569629:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Save")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.Save(((haxe.root.Array<nMorph.framework.orm.client.QueueItem>) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -74801672:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("get_arr")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.get_arr();
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("iterator")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.iterator();
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -687739768:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Include")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							this.Include(((nMorph.framework.orm.interfaces.IClause) (dynargs[0]) ), dynargs[1], ((nMorph.framework.orm.tools.Context) (dynargs[2]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 2104342424:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Filter")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.Filter(((haxe.lang.Function) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case 65665:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Add")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.Add(((T) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -2099925287:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Insert")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							this.Insert(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
					case -1850743644:
					{
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						if (field.equals("Remove")) 
						{
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							__temp_executeDef1 = false;
							//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
							return this.Remove(((T) (dynargs[0]) ));
						}
						
						//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		baseArr.push("arr");
		//line 12 "C:\\TodoList\\nMorph\\5_framework\\orm\\src\\nMorph\\framework\\orm\\client\\ModelArray.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


