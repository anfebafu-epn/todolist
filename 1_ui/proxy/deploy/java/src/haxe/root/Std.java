// Generated by Haxe 4.2.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean is(java.lang.Object v, java.lang.Object t)
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return haxe.root.Std.isOfType(v, t);
	}
	
	
	public static boolean isOfType(java.lang.Object v, java.lang.Object t)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( v == null )) 
		{
			//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( t == null )) 
		{
			//line 36 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return false;
		}
		
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.String name = clt.getName();
		//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		{
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				switch (__temp_hash3)
				{
					case 344809556:
					case 64711720:
					{
						//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
						{
							//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							return v instanceof java.lang.Boolean;
						}
						
						//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 1063877011:
					{
						//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if (__temp_svar1.equals("java.lang.Object")) 
						{
							//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							return true;
						}
						
						//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 761287205:
					case -1325958191:
					{
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
						{
							//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							return haxe.lang.Runtime.isDouble(v);
						}
						
						//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case -2056817302:
					case 104431:
					{
						//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
						{
							//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							return haxe.lang.Runtime.isInt(v);
						}
						
						//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		java.lang.Class clv = v.getClass();
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static int _int(double x)
	{
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return ((int) (x) );
	}
	
	
	public static java.lang.Object parseInt(java.lang.String x)
	{
		//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		try 
		{
			//line 67 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (( x == null )) 
			{
				//line 68 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				return null;
			}
			
			//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int base = 10;
			//line 71 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int len = x.length();
			//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int foundCount = 0;
			//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int sign = 0;
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int firstDigitIndex = 0;
			//line 75 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int lastDigitIndex = -1;
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int previous = 0;
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			{
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				int _g = 0;
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				int _g1 = len;
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				label1:
				while (( _g < _g1 ))
				{
					//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					int i = _g++;
					//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					int c = ( (( i < x.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (x) )) ).charAt(i)) )) : (-1) );
					//line 80 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (( ( ( c > 8 ) && ( c < 14 ) ) || ( c == 32 ) )) 
					{
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if (( foundCount > 0 )) 
						{
							//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							return null;
						}
						
						//line 85 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						continue;
					}
					else
					{
						//line 80 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						switch (c)
						{
							case 43:
							{
								//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 89 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									sign = 1;
								}
								else
								{
									//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break;
							}
							
							
							case 45:
							{
								//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									sign = -1;
								}
								else
								{
									//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break;
							}
							
							
							case 48:
							{
								//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if ( ! ((( ( foundCount == 0 ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) ))) ) 
								{
									//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break;
							}
							
							
							case 88:
							case 120:
							{
								//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if (( ( previous == 48 ) && (( ( ( foundCount == 1 ) && ( sign == 0 ) ) || ( ( foundCount == 2 ) && ( sign != 0 ) ) )) )) 
								{
									//line 92 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									base = 16;
								}
								else
								{
									//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break;
							}
							
							
							default:
							{
								//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
								{
									//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
									if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
									{
										//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
										break label1;
									}
									
								}
								
								//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break;
							}
							
						}
						
					}
					
					//line 98 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					if (( ( ( foundCount == 0 ) && ( sign == 0 ) ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) )) 
					{
						//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						firstDigitIndex = i;
					}
					
					//line 101 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					 ++ foundCount;
					//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					lastDigitIndex = i;
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					previous = c;
				}
				;
			}
			
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (( firstDigitIndex <= lastDigitIndex )) 
			{
				//line 106 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				java.lang.String digits = haxe.lang.StringExt.substring(x, ( firstDigitIndex + (( (( base == 16 )) ? (2) : (0) )) ), ( lastDigitIndex + 1 ));
				//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				try 
				{
					//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					return ( (( (( sign == -1 )) ? (-1) : (1) )) * java.lang.Integer.parseInt(haxe.lang.Runtime.toString(digits), ((int) (base) )) );
				}
				catch (java.lang.NumberFormatException e)
				{
					//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					return null;
				}
				
				
			}
			
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return null;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static double parseFloat(java.lang.String x)
	{
		//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( x == null )) 
		{
			//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return java.lang.Double.NaN;
		}
		
		//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		x = haxe.root.StringTools.ltrim(x);
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean found = false;
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasDot = false;
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasSign = false;
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasE = false;
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasESign = false;
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		boolean hasEData = false;
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		int i = -1;
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		label1:
		while ((  ++ i < x.length() ))
		{
			//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			int chr = ((int) (x.charAt(i)) );
			//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (( ( chr >= 48 ) && ( chr <= 57 ) )) 
			{
				//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				if (hasE) 
				{
					//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
					hasEData = true;
				}
				
				//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				found = true;
			}
			else
			{
				//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				switch (chr)
				{
					case 43:
					case 45:
					{
						//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if ((  ! (found)  &&  ! (hasSign)  )) 
						{
							//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							hasSign = true;
						}
						else
						{
							//line 145 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							if (( ( ( found &&  ! (hasESign)  ) && hasE ) &&  ! (hasEData)  )) 
							{
								//line 146 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								hasESign = true;
							}
							else
							{
								//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
								break label1;
							}
							
						}
						
						//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 46:
					{
						//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if ( ! (hasDot) ) 
						{
							//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							hasDot = true;
						}
						else
						{
							//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break label1;
						}
						
						//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					case 69:
					case 101:
					{
						//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						if ( ! (hasE) ) 
						{
							//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							hasE = true;
						}
						else
						{
							//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
							break label1;
						}
						
						//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break;
					}
					
					
					default:
					{
						//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
						break label1;
					}
					
				}
				
			}
			
		}
		;
		//line 151 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( hasE &&  ! (hasEData)  )) 
		{
			//line 152 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			 -- i;
			//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			if (hasESign) 
			{
				//line 154 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				 -- i;
			}
			
		}
		
		//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( i != x.length() )) 
		{
			//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			x = haxe.lang.StringExt.substr(x, 0, i);
		}
		
		//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		try 
		{
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return java.lang.Double.parseDouble(haxe.lang.Runtime.toString(x));
		}
		catch (java.lang.Throwable _g)
		{
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			{
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
				haxe.NativeStackTrace.exception.set(((java.lang.Throwable) (_g) ));
			}
			
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return java.lang.Double.NaN;
		}
		
		
	}
	
	
	public static <T, S> S downcast(T value, java.lang.Class c)
	{
		//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (haxe.root.Std.isOfType(value, c)) 
		{
			//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return ((S) (((java.lang.Object) (value) )) );
		}
		else
		{
			//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return null;
		}
		
	}
	
	
	public static <T, S> S instance(T value, java.lang.Class c)
	{
		//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (haxe.root.Std.isOfType(value, c)) 
		{
			//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return ((S) (((java.lang.Object) (value) )) );
		}
		else
		{
			//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return null;
		}
		
	}
	
	
	public static int random(int x)
	{
		//line 173 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		if (( x <= 0 )) 
		{
			//line 174 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
			return 0;
		}
		
		//line 175 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Std.hx"
		return ((int) (( java.lang.Math.random() * x )) );
	}
	
	
}


