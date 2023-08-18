// Generated by Haxe 4.2.2
package haxe._Int64;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Int64_Impl_
{
	public static long make(int high, int low)
	{
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this1 = ( ( ((long) (high) ) << 32 ) | ( ((long) (low) ) & 0xffffffffL ) );
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this1) );
	}
	
	
	public static long _new(long x)
	{
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this1 = x;
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this1) );
	}
	
	
	
	
	public static long get_val(long this1)
	{
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long set_val(long this1, long x)
	{
		//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 = x;
		//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	
	
	public static int get_high(long this1)
	{
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (( this1 >> 32 )) );
	}
	
	
	
	
	public static int get_low(long this1)
	{
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (this1) );
	}
	
	
	public static long copy(long this1)
	{
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this2 = this1;
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this2) );
	}
	
	
	public static long ofInt(int x)
	{
		//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (x) );
	}
	
	
	public static boolean is(java.lang.Object val)
	{
		//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( val instanceof java.lang.Long );
	}
	
	
	public static boolean isInt64(java.lang.Object val)
	{
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( val instanceof java.lang.Long );
	}
	
	
	public static int toInt(long x)
	{
		//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ( ((long) (x) ) < -2147483648 ) || ( ((long) (x) ) > 2147483647 ) )) 
		{
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown("Overflow")) );
		}
		
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (((long) (x) )) );
	}
	
	
	public static int getHigh(long x)
	{
		//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (( ((long) (x) ) >> 32 )) );
	}
	
	
	public static int getLow(long x)
	{
		//line 85 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (((long) (x) )) );
	}
	
	
	public static boolean isNeg(long x)
	{
		//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (x) ) < 0 );
	}
	
	
	public static boolean isZero(long x)
	{
		//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (x) ) == 0 );
	}
	
	
	public static int compare(long a, long b)
	{
		//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) < ((long) (b) ) )) 
		{
			//line 95 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return -1;
		}
		
		//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) > ((long) (b) ) )) 
		{
			//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return 1;
		}
		
		//line 98 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return 0;
	}
	
	
	public static int ucompare(long a, long b)
	{
		//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) < 0 )) 
		{
			//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			if (( ((long) (b) ) < 0 )) 
			{
				//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				if (( ((long) (a) ) < ((long) (b) ) )) 
				{
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return -1;
				}
				else
				{
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					if (( ((long) (a) ) > ((long) (b) ) )) 
					{
						//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
						return 1;
					}
					else
					{
						//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
						return 0;
					}
					
				}
				
			}
			else
			{
				//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				return 1;
			}
			
		}
		
		//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (b) ) < 0 )) 
		{
			//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return -1;
		}
		else
		{
			//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			if (( ((long) (a) ) < ((long) (b) ) )) 
			{
				//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				return -1;
			}
			else
			{
				//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				if (( ((long) (a) ) > ((long) (b) ) )) 
				{
					//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return 1;
				}
				else
				{
					//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return 0;
				}
				
			}
			
		}
		
	}
	
	
	public static java.lang.String toStr(long x)
	{
		//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( "" + haxe.root.Std.string(((long) (x) )) );
	}
	
	
	public static java.lang.Object divMod(long dividend, long divisor)
	{
		//line 111 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return new haxe.lang.DynamicObject(new java.lang.String[]{"modulus", "quotient"}, new java.lang.Object[]{((long) (( ((long) (dividend) ) % ((long) (divisor) ) )) ), ((long) (( ((long) (dividend) ) / ((long) (divisor) ) )) )}, new java.lang.String[]{}, new double[]{});
	}
	
	
	public static java.lang.String toString(long this1)
	{
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( "" + haxe.root.Std.string(this1) );
	}
	
	
	public static long parseString(java.lang.String sParam)
	{
		//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return haxe.Int64Helper.parseString(sParam);
	}
	
	
	public static long fromFloat(double f)
	{
		//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return haxe.Int64Helper.fromFloat(f);
	}
	
	
	public static long neg(long x)
	{
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return  - (((long) (x) )) ;
	}
	
	
	public static long preIncrement(long this1)
	{
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 += ((long) (1) );
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long postIncrement(long this1)
	{
		//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 += ((long) (1) );
		//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( this1 - 1 );
	}
	
	
	public static long preDecrement(long this1)
	{
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 -= ((long) (1) );
		//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long postDecrement(long this1)
	{
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 -= ((long) (1) );
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( this1 + 1 );
	}
	
	
	public static long add(long a, long b)
	{
		//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) + ((long) (b) ) );
	}
	
	
	public static long addInt(long a, int b)
	{
		//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) + b );
	}
	
	
	public static long sub(long a, long b)
	{
		//line 147 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) - ((long) (b) ) );
	}
	
	
	public static long subInt(long a, int b)
	{
		//line 150 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) - b );
	}
	
	
	public static long intSub(int a, long b)
	{
		//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a - ((long) (b) ) );
	}
	
	
	public static long mul(long a, long b)
	{
		//line 156 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) * ((long) (b) ) );
	}
	
	
	public static long mulInt(long a, int b)
	{
		//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) * b );
	}
	
	
	public static long div(long a, long b)
	{
		//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) / ((long) (b) ) );
	}
	
	
	public static long divInt(long a, int b)
	{
		//line 165 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) / b );
	}
	
	
	public static long intDiv(int a, long b)
	{
		//line 168 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a / ((long) (b) ) );
	}
	
	
	public static long mod(long a, long b)
	{
		//line 171 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) % ((long) (b) ) );
	}
	
	
	public static long modInt(long a, int b)
	{
		//line 174 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) % b );
	}
	
	
	public static long intMod(int a, long b)
	{
		//line 177 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a % ((long) (b) ) );
	}
	
	
	public static boolean eq(long a, long b)
	{
		//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) == ((long) (b) ) );
	}
	
	
	public static boolean eqInt(long a, int b)
	{
		//line 183 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) == b );
	}
	
	
	public static boolean neq(long a, long b)
	{
		//line 186 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) != ((long) (b) ) );
	}
	
	
	public static boolean neqInt(long a, int b)
	{
		//line 189 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) != b );
	}
	
	
	public static boolean lt(long a, long b)
	{
		//line 192 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) < ((long) (b) ) );
	}
	
	
	public static boolean ltInt(long a, int b)
	{
		//line 195 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) < b );
	}
	
	
	public static boolean intLt(int a, long b)
	{
		//line 198 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a < ((long) (b) ) );
	}
	
	
	public static boolean lte(long a, long b)
	{
		//line 201 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) <= ((long) (b) ) );
	}
	
	
	public static boolean lteInt(long a, int b)
	{
		//line 204 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) <= b );
	}
	
	
	public static boolean intLte(int a, long b)
	{
		//line 207 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a <= ((long) (b) ) );
	}
	
	
	public static boolean gt(long a, long b)
	{
		//line 210 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) > ((long) (b) ) );
	}
	
	
	public static boolean gtInt(long a, int b)
	{
		//line 213 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) > b );
	}
	
	
	public static boolean intGt(int a, long b)
	{
		//line 216 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a > ((long) (b) ) );
	}
	
	
	public static boolean gte(long a, long b)
	{
		//line 219 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >= ((long) (b) ) );
	}
	
	
	public static boolean gteInt(long a, int b)
	{
		//line 222 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >= b );
	}
	
	
	public static boolean intGte(int a, long b)
	{
		//line 225 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a >= ((long) (b) ) );
	}
	
	
	public static long complement(long x)
	{
		//line 228 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return  ~ (((long) (x) )) ;
	}
	
	
	public static long and(long a, long b)
	{
		//line 231 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) & ((long) (b) ) );
	}
	
	
	public static long or(long a, long b)
	{
		//line 234 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) | ((long) (b) ) );
	}
	
	
	public static long xor(long a, long b)
	{
		//line 237 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) ^ ((long) (b) ) );
	}
	
	
	public static long shl(long a, int b)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) << b );
	}
	
	
	public static long shr(long a, int b)
	{
		//line 243 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >> b );
	}
	
	
	public static long ushr(long a, int b)
	{
		//line 246 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >>> b );
	}
	
	
}

