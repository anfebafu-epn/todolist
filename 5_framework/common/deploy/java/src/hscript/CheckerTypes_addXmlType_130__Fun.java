// Generated by Haxe 4.2.2
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CheckerTypes_addXmlType_130__Fun extends haxe.lang.Function
{
	public CheckerTypes_addXmlType_130__Fun(java.lang.Object cl, java.lang.Object c, hscript.CheckerTypes _gthis)
	{
		//line 130 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		super(0, 0);
		//line 130 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.cl = cl;
		//line 130 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this.c = c;
		//line 130 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		haxe.ds.StringMap<hscript.TType> _g = new haxe.ds.StringMap<hscript.TType>();
		//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		{
			//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			int _g1 = 0;
			//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			haxe.root.Array<hscript.TType> _g2 = ((haxe.root.Array<hscript.TType>) (haxe.lang.Runtime.getField(this.cl, "params", true)) );
			//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			while (( _g1 < _g2.length ))
			{
				//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				hscript.TType t = _g2.__get(_g1);
				//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				 ++ _g1;
				//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				_g.set(( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.c, "path", true)) + "." ) + hscript.Checker.typeStr(t) ), t);
			}
			
		}
		
		//line 131 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis.localParams = _g;
		//line 132 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		if (( ! (( haxe.lang.Runtime.getField(this.c, "superClass", true) == null )) )) 
		{
			//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			hscript.CheckerTypes _gthis1 = this._gthis;
			//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			java.lang.String c1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(haxe.lang.Runtime.getField(this.c, "superClass", true), "path", true));
			//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			haxe.root.Array<hscript.TType> _g3 = new haxe.root.Array<hscript.TType>(new hscript.TType[]{});
			//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			{
				//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				int _g4 = 0;
				//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				haxe.root.Array<haxe.rtti.CType> _g5 = ((haxe.root.Array<haxe.rtti.CType>) (haxe.lang.Runtime.getField(haxe.lang.Runtime.getField(this.c, "superClass", true), "params", true)) );
				//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				while (( _g4 < _g5.length ))
				{
					//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.rtti.CType t1 = _g5.__get(_g4);
					//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					 ++ _g4;
					//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					_g3.push(this._gthis.makeXmlType(t1));
				}
				
			}
			
			//line 133 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			hscript.TType __temp_expr3 = ((hscript.TType) (haxe.lang.Runtime.setField(this.cl, "superClass", _gthis1.getType(c1, _g3))) );
		}
		
		//line 134 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		if (( ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(this.c, "interfaces", true)) ) != null )) 
		{
			//line 135 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			haxe.root.Array<hscript.TType> __temp_expr4 = ((haxe.root.Array<hscript.TType>) (haxe.lang.Runtime.setField(this.cl, "interfaces", new haxe.root.Array<hscript.TType>(new hscript.TType[]{}))) );
			//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			{
				//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				int _g6 = 0;
				//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				haxe.root.Array<java.lang.Object> _g7 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(this.c, "interfaces", true)) );
				//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				while (( _g6 < _g7.length ))
				{
					//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					java.lang.Object i = _g7.__get(_g6);
					//line 136 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					 ++ _g6;
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.root.Array<hscript.TType> cl1 = ((haxe.root.Array<hscript.TType>) (haxe.lang.Runtime.getField(this.cl, "interfaces", true)) );
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					hscript.CheckerTypes _gthis2 = this._gthis;
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					java.lang.String i1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(i, "path", true));
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.root.Array<hscript.TType> _g8 = new haxe.root.Array<hscript.TType>(new hscript.TType[]{});
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					{
						//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						int _g9 = 0;
						//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						haxe.root.Array<haxe.rtti.CType> _g10 = ((haxe.root.Array<haxe.rtti.CType>) (haxe.lang.Runtime.getField(i, "params", true)) );
						//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						while (( _g9 < _g10.length ))
						{
							//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							haxe.rtti.CType t2 = _g10.__get(_g9);
							//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							 ++ _g9;
							//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							_g8.push(this._gthis.makeXmlType(t2));
						}
						
					}
					
					//line 137 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					cl1.push(_gthis2.getType(i1, _g8));
				}
				
			}
			
		}
		
		//line 139 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		haxe.root.Array<java.lang.String> pkeys = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		{
			//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			int _g11 = 0;
			//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			haxe.root.Array<java.lang.Object> _g12 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(this.c, "fields", true)) );
			//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
			while (( _g11 < _g12.length ))
			{
				//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				java.lang.Object f = _g12.__get(_g11);
				//line 140 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				 ++ _g11;
				//line 141 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				if (( ( haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.getField(f, "isOverride", true)) )) || haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true)), 0, 4), "get_")) )) ) || haxe.lang.Runtime.valEq(haxe.lang.StringExt.substr(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true)), 0, 4), "set_") )) 
				{
					//line 141 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					continue;
				}
				
				//line 142 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				boolean skip = false;
				//line 143 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				boolean complete =  ! (((java.lang.String) (((java.lang.Object) (haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true))) )) ).startsWith(haxe.lang.Runtime.toString("__"))) ;
				//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				{
					//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					int _g13 = 0;
					//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.root.Array<java.lang.Object> _g14 = ((haxe.root.Array<java.lang.Object>) (haxe.lang.Runtime.getField(f, "meta", true)) );
					//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					while (( _g13 < _g14.length ))
					{
						//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						java.lang.Object m = _g14.__get(_g13);
						//line 144 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						 ++ _g13;
						//line 145 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(m, "name", true)), ":noScript")) 
						{
							//line 146 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							skip = true;
							//line 147 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							break;
						}
						
						//line 149 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(m, "name", true)), ":noCompletion")) 
						{
							//line 150 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
							complete = false;
						}
						
					}
					
				}
				
				//line 152 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				if (skip) 
				{
					//line 152 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					continue;
				}
				
				//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				haxe.rtti.Rights _g15 = ((haxe.rtti.Rights) (haxe.lang.Runtime.getField(f, "set", true)) );
				//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				boolean fl = false;
				//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				switch (_g15.index)
				{
					case 0:
					case 4:
					{
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						fl = true;
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						break;
					}
					
					
					case 2:
					{
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						java.lang.String _g16 = haxe.lang.Runtime.toString(_g15.params[0]);
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						fl = true;
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						break;
					}
					
					
					default:
					{
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						fl = false;
						//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						break;
					}
					
				}
				
				//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				java.lang.Object fl1 = null;
				//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				{
					//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					boolean __temp_odecl1 = haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.getField(f, "isPublic", true)) ));
					//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					java.lang.String __temp_odecl2 = haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true));
					//line 153 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					fl1 = new haxe.lang.DynamicObject(new java.lang.String[]{"canWrite", "complete", "isPublic", "name", "params", "t"}, new java.lang.Object[]{fl, complete, __temp_odecl1, __temp_odecl2, new haxe.root.Array<hscript.TType>(new hscript.TType[]{}), null}, new java.lang.String[]{}, new double[]{});
				}
				
				//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				{
					//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					int _g17 = 0;
					//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.root.Array<java.lang.String> _g18 = ((haxe.root.Array<java.lang.String>) (haxe.lang.Runtime.getField(f, "params", true)) );
					//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					while (( _g17 < _g18.length ))
					{
						//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						java.lang.String p = _g18.__get(_g17);
						//line 154 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						 ++ _g17;
						//line 155 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						hscript.TType pt = hscript.TType.TParam(p);
						//line 156 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						java.lang.String key = ( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true)) + "." ) + p );
						//line 157 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						pkeys.push(key);
						//line 158 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						((haxe.root.Array<hscript.TType>) (haxe.lang.Runtime.getField(fl1, "params", true)) ).push(pt);
						//line 159 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
						((haxe.ds.StringMap<hscript.TType>) (((haxe.IMap<java.lang.String, hscript.TType>) (this._gthis.localParams) )) ).set(key, pt);
					}
					
				}
				
				//line 161 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				hscript.TType __temp_expr5 = ((hscript.TType) (haxe.lang.Runtime.setField(fl1, "t", this._gthis.makeXmlType(((haxe.rtti.CType) (haxe.lang.Runtime.getField(f, "type", true)) )))) );
				//line 162 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				while (( pkeys.length > 0 ))
				{
					//line 163 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					((haxe.ds.StringMap<hscript.TType>) (((haxe.IMap<java.lang.String, hscript.TType>) (this._gthis.localParams) )) ).remove(haxe.lang.Runtime.toString(pkeys.pop()));
				}
				
				//line 164 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
				if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(fl1, "name", true)), "new")) 
				{
					//line 165 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					haxe.lang.Runtime.setField(this.cl, "constructor", fl1);
				}
				else
				{
					//line 167 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
					((haxe.ds.StringMap<java.lang.Object>) (((haxe.IMap<java.lang.String, java.lang.Object>) (haxe.lang.Runtime.getField(this.cl, "fields", true)) )) ).set(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(f, "name", true)), fl1);
				}
				
			}
			
		}
		
		//line 169 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		this._gthis.localParams = null;
		//line 130 "C:\\HaxeToolkit\\haxe\\lib\\hscript\\2,5,0\\hscript\\Checker.hx"
		return null;
	}
	
	
	public java.lang.Object cl;
	
	public java.lang.Object c;
	
	public hscript.CheckerTypes _gthis;
	
}


