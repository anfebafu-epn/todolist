// Generated by Haxe 4.2.2
package haxe.crypto;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BaseCode extends haxe.lang.HxObject
{
	public BaseCode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BaseCode(haxe.io.Bytes base)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.crypto.BaseCode.__hx_ctor_haxe_crypto_BaseCode(this, base);
	}
	
	
	protected static void __hx_ctor_haxe_crypto_BaseCode(haxe.crypto.BaseCode __hx_this, haxe.io.Bytes base)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int len = base.length;
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int nbits = 1;
		//line 36 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		while (( len > ( 1 << nbits ) ))
		{
			//line 37 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			 ++ nbits;
		}
		
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		if (( ( nbits > 8 ) || ( len != ( 1 << nbits ) ) )) 
		{
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown("BaseCode : base length must be a power of two.")) );
		}
		
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		__hx_this.base = base;
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		__hx_this.nbits = nbits;
	}
	
	
	public static java.lang.String encode(java.lang.String s, java.lang.String base)
	{
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.crypto.BaseCode b = new haxe.crypto.BaseCode(((haxe.io.Bytes) (haxe.io.Bytes.ofString(base, null)) ));
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return b.encodeString(s);
	}
	
	
	public static java.lang.String decode(java.lang.String s, java.lang.String base)
	{
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.crypto.BaseCode b = new haxe.crypto.BaseCode(((haxe.io.Bytes) (haxe.io.Bytes.ofString(base, null)) ));
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return b.decodeString(s);
	}
	
	
	public haxe.io.Bytes base;
	
	public int nbits;
	
	public haxe.root.Array<java.lang.Object> tbl;
	
	public haxe.io.Bytes encodeBytes(haxe.io.Bytes b)
	{
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int nbits = this.nbits;
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.io.Bytes base = this.base;
		//line 50 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int size = ((int) (( ((double) (( b.length * 8 )) ) / nbits )) );
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.io.Bytes out = haxe.io.Bytes.alloc(( size + (( (( ( ( b.length * 8 ) % nbits ) == 0 )) ? (0) : (1) )) ));
		//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int buf = 0;
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int curbits = 0;
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int mask = ( (( 1 << nbits )) - 1 );
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int pin = 0;
		//line 56 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int pout = 0;
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		while (( pout < size ))
		{
			//line 58 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			while (( curbits < nbits ))
			{
				//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				curbits += 8;
				//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				buf <<= 8;
				//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				buf |= ( b.b[pin++] & 255 );
			}
			
			//line 63 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			curbits -= nbits;
			//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			out.b[pout++] = ((byte) (( base.b[( ( buf >> curbits ) & mask )] & 255 )) );
		}
		
		//line 66 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		if (( curbits > 0 )) 
		{
			//line 67 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			out.b[pout++] = ((byte) (( base.b[( ( buf << ( nbits - curbits ) ) & mask )] & 255 )) );
		}
		
		//line 68 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return out;
	}
	
	
	public void initTable()
	{
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.root.Array<java.lang.Object> tbl = new haxe.root.Array<java.lang.Object>();
		//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			int _g = 0;
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			while (( _g < 256 ))
			{
				//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				int i = _g++;
				//line 75 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				int __temp_expr1 = ((int) (haxe.lang.Runtime.toInt(tbl.__set(i, -1))) );
			}
			
		}
		
		//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			int _g1 = 0;
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			int _g2 = this.base.length;
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			while (( _g1 < _g2 ))
			{
				//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				int i1 = _g1++;
				//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				int __temp_expr2 = ((int) (haxe.lang.Runtime.toInt(tbl.__set(( this.base.b[i1] & 255 ), i1))) );
			}
			
		}
		
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		this.tbl = tbl;
	}
	
	
	public haxe.io.Bytes decodeBytes(haxe.io.Bytes b)
	{
		//line 85 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int nbits = this.nbits;
		//line 86 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.io.Bytes base = this.base;
		//line 87 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		if (( this.tbl == null )) 
		{
			//line 88 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			this.initTable();
		}
		
		//line 89 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.root.Array<java.lang.Object> tbl = this.tbl;
		//line 90 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int size = ( ( b.length * nbits ) >> 3 );
		//line 91 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		haxe.io.Bytes out = haxe.io.Bytes.alloc(size);
		//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int buf = 0;
		//line 93 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int curbits = 0;
		//line 94 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int pin = 0;
		//line 95 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		int pout = 0;
		//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		while (( pout < size ))
		{
			//line 97 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			while (( curbits < 8 ))
			{
				//line 98 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				curbits += nbits;
				//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				buf <<= nbits;
				//line 100 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				int i = ((int) (haxe.lang.Runtime.toInt(tbl.__get(( b.b[pin++] & 255 )))) );
				//line 101 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				if (( i == -1 )) 
				{
					//line 102 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown("BaseCode : invalid encoded char")) );
				}
				
				//line 103 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				buf |= i;
			}
			
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			curbits -= 8;
			//line 106 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			out.b[pout++] = ((byte) (( ( buf >> curbits ) & 255 )) );
		}
		
		//line 108 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return out;
	}
	
	
	public java.lang.String encodeString(java.lang.String s)
	{
		//line 116 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return this.encodeBytes(haxe.io.Bytes.ofString(s, null)).toString();
	}
	
	
	public java.lang.String decodeString(java.lang.String s)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return this.decodeBytes(haxe.io.Bytes.ofString(s, null)).toString();
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				switch (field.hashCode())
				{
					case 104611444:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("nbits")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							this.nbits = ((int) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				switch (field.hashCode())
				{
					case 114622:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("tbl")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							this.tbl = ((haxe.root.Array<java.lang.Object>) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 3016401:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("base")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							this.base = ((haxe.io.Bytes) (value) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 104611444:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("nbits")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							this.nbits = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return value;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				switch (field.hashCode())
				{
					case -2001259617:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("decodeString")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "decodeString")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 3016401:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("base")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.base;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case -864869945:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("encodeString")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "encodeString")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 104611444:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("nbits")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.nbits;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 1166820125:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("decodeBytes")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "decodeBytes")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 114622:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("tbl")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.tbl;
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case -268398434:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("initTable")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initTable")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 1896214517:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("encodeBytes")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "encodeBytes")) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				switch (field.hashCode())
				{
					case 104611444:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("nbits")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return ((double) (this.nbits) );
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		{
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (( field != null )) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				switch (field.hashCode())
				{
					case -2001259617:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("decodeString")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.decodeString(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 1896214517:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("encodeBytes")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.encodeBytes(((haxe.io.Bytes) (dynargs[0]) ));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case -864869945:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("encodeString")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.encodeString(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case -268398434:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("initTable")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							this.initTable();
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
					case 1166820125:
					{
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						if (field.equals("decodeBytes")) 
						{
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							__temp_executeDef1 = false;
							//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
							return this.decodeBytes(((haxe.io.Bytes) (dynargs[0]) ));
						}
						
						//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		baseArr.push("tbl");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		baseArr.push("nbits");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		baseArr.push("base");
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\crypto\\BaseCode.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


