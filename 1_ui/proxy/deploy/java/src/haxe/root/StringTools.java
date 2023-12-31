// Generated by Haxe 4.2.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	static
	{
		//line 598 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringTools.winMetaCharacters = ((haxe.root.Array<java.lang.Object>) (haxe.SysTools.winMetaCharacters) );
		//line 630 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringTools.MIN_SURROGATE_CODE_POINT = 65536;
	}
	
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	protected static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static java.lang.String urlEncode(java.lang.String s)
	{
		//line 52 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		try 
		{
			//line 52 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.root.StringTools.postProcessUrlEncode(java.net.URLEncoder.encode(haxe.lang.Runtime.toString(s), haxe.lang.Runtime.toString("UTF-8")));
		}
		catch (java.lang.Throwable typedException)
		{
			//line 42 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static java.lang.String postProcessUrlEncode(java.lang.String s)
	{
		//line 75 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 76 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int i = 0;
		//line 76 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int len = s.length();
		//line 77 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( i < len ))
		{
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			char _g = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			{
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				char __temp_switch1 = (_g);
				//line 81 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				if (( __temp_switch1 == 37 )) 
				{
					//line 81 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					if (( i <= ( len - 2 ) )) 
					{
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						char c1 = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						char c2 = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
						//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						{
							//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							char __temp_switch2 = (c1);
							//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							if (( __temp_switch2 == 50 )) 
							{
								//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
								{
									//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									char __temp_switch4 = (c2);
									//line 85 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									if (( __temp_switch4 == 49 )) 
									{
										//line 85 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										ret.addChar(33);
									}
									else
									{
										//line 87 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										if (( __temp_switch4 == 55 )) 
										{
											//line 87 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											ret.addChar(39);
										}
										else
										{
											//line 89 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											if (( __temp_switch4 == 56 )) 
											{
												//line 89 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
												ret.addChar(40);
											}
											else
											{
												//line 91 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
												if (( __temp_switch4 == 57 )) 
												{
													//line 91 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
													ret.addChar(41);
												}
												else
												{
													//line 95 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
													ret.addChar(37);
													//line 96 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
													ret.addChar(((int) (c1) ));
													//line 97 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
													ret.addChar(((int) (c2) ));
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							else
							{
								//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
								if (( __temp_switch2 == 55 )) 
								{
									//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									{
										//line 83 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										char __temp_switch3 = (c2);
										//line 93 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										if (( ( __temp_switch3 == 69 ) || ( __temp_switch3 == 101 ) )) 
										{
											//line 93 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											ret.addChar(126);
										}
										else
										{
											//line 95 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											ret.addChar(37);
											//line 96 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											ret.addChar(((int) (c1) ));
											//line 97 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											ret.addChar(((int) (c2) ));
										}
										
									}
									
								}
								else
								{
									//line 95 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									ret.addChar(37);
									//line 96 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									ret.addChar(((int) (c1) ));
									//line 97 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									ret.addChar(((int) (c2) ));
								}
								
							}
							
						}
						
					}
					else
					{
						//line 99 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						char chr = _g;
						//line 100 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						ret.addChar(((int) (chr) ));
					}
					
				}
				else
				{
					//line 80 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					if (( __temp_switch1 == 43 )) 
					{
						//line 80 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						ret.add(haxe.lang.Runtime.toString("%20"));
						//line 80 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
					}
					else
					{
						//line 99 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						char chr1 = _g;
						//line 100 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						ret.addChar(((int) (chr1) ));
					}
					
				}
				
			}
			
		}
		
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ret.toString();
	}
	
	
	public static java.lang.String urlDecode(java.lang.String s)
	{
		//line 121 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		try 
		{
			//line 121 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return java.net.URLDecoder.decode(haxe.lang.Runtime.toString(s), haxe.lang.Runtime.toString("UTF-8"));
		}
		catch (java.lang.Throwable _g)
		{
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			{
				//line 122 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				haxe.NativeStackTrace.exception.set(((java.lang.Throwable) (_g) ));
			}
			
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 123 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public static java.lang.String htmlEscape(java.lang.String s, java.lang.Object quotes)
	{
		//line 159 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		{
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			int _g_offset = 0;
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			java.lang.String _g_s = s;
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			while (( _g_offset < _g_s.length() ))
			{
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				java.lang.String s1 = _g_s;
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int index = _g_offset++;
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int c = ( (( index < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index)) )) : (-1) );
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				if (( ( c >= 55296 ) && ( c <= 56319 ) )) 
				{
					//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					int index1 = ( index + 1 );
					//line 635 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					c = ( ( ( c - 55232 ) << 10 ) | ( (( (( index1 < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index1)) )) : (-1) )) & 1023 ) );
				}
				
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int c1 = c;
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				if (( c1 >= 65536 )) 
				{
					//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					 ++ _g_offset;
				}
				
				//line 160 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int code = c1;
				//line 161 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				switch (code)
				{
					case 34:
					{
						//line 168 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((quotes)) ))) 
						{
							//line 169 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							buf.add(haxe.lang.Runtime.toString("&quot;"));
							//line 169 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
						}
						else
						{
							//line 173 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							buf.addChar(code);
						}
						
						//line 168 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
					
					case 38:
					{
						//line 163 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&amp;"));
						//line 163 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
						//line 163 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
					
					case 39:
					{
						//line 170 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((quotes)) ))) 
						{
							//line 171 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							buf.add(haxe.lang.Runtime.toString("&#039;"));
							//line 171 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
						}
						else
						{
							//line 173 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							buf.addChar(code);
						}
						
						//line 170 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
					
					case 60:
					{
						//line 165 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&lt;"));
						//line 165 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
						//line 165 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
					
					case 62:
					{
						//line 167 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&gt;"));
						//line 167 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
						//line 167 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
					
					default:
					{
						//line 173 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						buf.addChar(code);
						//line 173 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						break;
					}
					
				}
				
			}
			
		}
		
		//line 176 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return buf.toString();
	}
	
	
	public static java.lang.String htmlUnescape(java.lang.String s)
	{
		//line 194 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(s, "&gt;").join(">"), "&lt;").join("<"), "&quot;").join("\""), "&#039;").join("\'"), "&amp;").join("&");
	}
	
	
	public static boolean contains(java.lang.String s, java.lang.String value)
	{
		//line 215 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ( haxe.lang.StringExt.indexOf(s, value, null) != -1 );
	}
	
	
	public static boolean startsWith(java.lang.String s, java.lang.String start)
	{
		//line 228 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ((java.lang.String) (((java.lang.Object) (s) )) ).startsWith(haxe.lang.Runtime.toString(start));
	}
	
	
	public static boolean endsWith(java.lang.String s, java.lang.String end)
	{
		//line 251 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ((java.lang.String) (((java.lang.Object) (s) )) ).endsWith(end);
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 283 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 284 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if ( ! ((( ( ((int) (haxe.lang.Runtime.toInt(c)) ) > 8 ) && ( ((int) (haxe.lang.Runtime.toInt(c)) ) < 14 ) ))) ) 
		{
			//line 284 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			//line 284 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 300 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int l = s.length();
		//line 301 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int r = 0;
		//line 302 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 303 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			 ++ r;
		}
		
		//line 305 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( r > 0 )) 
		{
			//line 306 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 308 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String rtrim(java.lang.String s)
	{
		//line 325 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int l = s.length();
		//line 326 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int r = 0;
		//line 327 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, ( ( l - r ) - 1 )) ))
		{
			//line 328 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			 ++ r;
		}
		
		//line 330 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( r > 0 )) 
		{
			//line 331 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.substr(s, 0, ( l - r ));
		}
		else
		{
			//line 333 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String trim(java.lang.String s)
	{
		//line 347 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ((java.lang.String) (((java.lang.Object) (s) )) ).trim();
	}
	
	
	public static java.lang.String lpad(java.lang.String s, java.lang.String c, int l)
	{
		//line 366 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( c.length() <= 0 )) 
		{
			//line 367 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
		//line 369 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 370 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		l -= s.length();
		//line 371 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( buf.b.length() < l ))
		{
			//line 372 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			buf.add(haxe.lang.Runtime.toString(c));
			//line 372 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		}
		
		//line 374 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		buf.add(haxe.lang.Runtime.toString(s));
		//line 374 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		//line 375 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return buf.toString();
	}
	
	
	public static java.lang.String rpad(java.lang.String s, java.lang.String c, int l)
	{
		//line 391 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( c.length() <= 0 )) 
		{
			//line 392 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return s;
		}
		
		//line 394 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 395 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		buf.add(haxe.lang.Runtime.toString(s));
		//line 395 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 396 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (( buf.b.length() < l ))
		{
			//line 397 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			buf.add(haxe.lang.Runtime.toString(c));
			//line 397 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		}
		
		//line 399 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return buf.toString();
	}
	
	
	public static java.lang.String replace(java.lang.String s, java.lang.String sub, java.lang.String by)
	{
		//line 414 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( sub.length() == 0 )) 
		{
			//line 415 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.split(s, sub).join(by);
		}
		else
		{
			//line 417 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return ((java.lang.String) (((java.lang.Object) (s) )) ).replace(((java.lang.CharSequence) (sub) ), ((java.lang.CharSequence) (by) ));
		}
		
	}
	
	
	public static java.lang.String hex(int n, java.lang.Object digits)
	{
		//line 440 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.String s = "";
		//line 441 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.String hexChars = "0123456789ABCDEF";
		//line 442 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		while (true)
		{
			//line 443 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			s = ( haxe.lang.StringExt.charAt(hexChars, ( n & 15 )) + s );
			//line 444 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			n >>>= 4;
			//line 442 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			if ( ! ((( n > 0 ))) ) 
			{
				//line 442 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				break;
			}
			
		}
		
		//line 455 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( ! (haxe.lang.Runtime.eq(digits, null)) )) 
		{
			//line 456 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			while (( s.length() < ((int) (haxe.lang.Runtime.toInt(digits)) ) ))
			{
				//line 457 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				s = ( "0" + s );
			}
			
		}
		
		//line 459 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return s;
	}
	
	
	public static int fastCodeAt(java.lang.String s, int index)
	{
		//line 484 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( index < s.length() )) 
		{
			//line 484 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return ((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) );
		}
		else
		{
			//line 484 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return -1;
		}
		
	}
	
	
	public static int unsafeCodeAt(java.lang.String s, int index)
	{
		//line 523 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) );
	}
	
	
	public static haxe.iterators.StringIterator iterator(java.lang.String s)
	{
		//line 551 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return new haxe.iterators.StringIterator(haxe.lang.Runtime.toString(s));
	}
	
	
	public static haxe.iterators.StringKeyValueIterator keyValueIterator(java.lang.String s)
	{
		//line 562 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return new haxe.iterators.StringKeyValueIterator(haxe.lang.Runtime.toString(s));
	}
	
	
	public static boolean isEof(int c)
	{
		//line 576 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ( c == -1 );
	}
	
	
	public static java.lang.String quoteUnixArg(java.lang.String argument)
	{
		//line 590 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (haxe.lang.Runtime.valEq(argument, "")) 
		{
			//line 590 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return "\'\'";
		}
		else
		{
			//line 590 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			if ( ! (new haxe.root.EReg(haxe.lang.Runtime.toString("[^a-zA-Z0-9_@%+=:,./-]"), haxe.lang.Runtime.toString("")).match(argument)) ) 
			{
				//line 590 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				return argument;
			}
			else
			{
				//line 590 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				return ( ( "\'" + haxe.root.StringTools.replace(argument, "\'", "\'\"\'\"\'") ) + "\'" );
			}
			
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.Object> winMetaCharacters;
	
	public static java.lang.String quoteWinArg(java.lang.String argument, boolean escapeMetaCharacters)
	{
		//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		java.lang.String argument1 = argument;
		//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if ( ! (new haxe.root.EReg(haxe.lang.Runtime.toString("^[^ \t\\\\\"]+$"), haxe.lang.Runtime.toString("")).match(argument1)) ) 
		{
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			haxe.root.StringBuf result = new haxe.root.StringBuf();
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			boolean needquote = ( ( ( haxe.lang.StringExt.indexOf(argument1, " ", null) != -1 ) || ( haxe.lang.StringExt.indexOf(argument1, "\t", null) != -1 ) ) || haxe.lang.Runtime.valEq(argument1, "") );
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			if (needquote) 
			{
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				result.add(haxe.lang.Runtime.toString("\""));
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
			}
			
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			haxe.root.StringBuf bs_buf = new haxe.root.StringBuf();
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			{
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int _g = 0;
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int _g1 = argument1.length();
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				while (( _g < _g1 ))
				{
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					int i = _g++;
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					{
						//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						java.lang.Object _g2 = haxe.lang.StringExt.charCodeAt(argument1, i);
						//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						if (haxe.lang.Runtime.eq(_g2, null)) 
						{
							//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							java.lang.Object c = _g2;
							//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							{
								//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
								if (( bs_buf.b.length() > 0 )) 
								{
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									result.add(haxe.lang.Runtime.toString(bs_buf.toString()));
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									bs_buf = new haxe.root.StringBuf();
								}
								
								//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
								result.addChar(((int) (haxe.lang.Runtime.toInt(c)) ));
							}
							
						}
						else
						{
							//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
							switch (((int) (haxe.lang.Runtime.toInt((_g2))) ))
							{
								case 34:
								{
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.String bs = bs_buf.toString();
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									result.add(haxe.lang.Runtime.toString(bs));
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									result.add(haxe.lang.Runtime.toString(bs));
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									bs_buf = new haxe.root.StringBuf();
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									result.add(haxe.lang.Runtime.toString("\\\""));
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									break;
								}
								
								
								case 92:
								{
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									bs_buf.add(haxe.lang.Runtime.toString("\\"));
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									break;
								}
								
								
								default:
								{
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									java.lang.Object c1 = _g2;
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									{
										//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										if (( bs_buf.b.length() > 0 )) 
										{
											//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											result.add(haxe.lang.Runtime.toString(bs_buf.toString()));
											//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
											//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
											bs_buf = new haxe.root.StringBuf();
										}
										
										//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
										result.addChar(((int) (haxe.lang.Runtime.toInt(c1)) ));
									}
									
									//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
									break;
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			result.add(haxe.lang.Runtime.toString(bs_buf.toString()));
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			java.lang.Object __temp_expr8 = ((java.lang.Object) (null) );
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			if (needquote) 
			{
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				result.add(haxe.lang.Runtime.toString(bs_buf.toString()));
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				java.lang.Object __temp_expr9 = ((java.lang.Object) (null) );
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				result.add(haxe.lang.Runtime.toString("\""));
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				java.lang.Object __temp_expr10 = ((java.lang.Object) (null) );
			}
			
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			argument1 = result.toString();
		}
		
		//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (escapeMetaCharacters) 
		{
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			haxe.root.StringBuf result1 = new haxe.root.StringBuf();
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			{
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int _g3 = 0;
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				int _g4 = argument1.length();
				//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
				while (( _g3 < _g4 ))
				{
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					int i1 = _g3++;
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					java.lang.Object c2 = haxe.lang.StringExt.charCodeAt(argument1, i1);
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					if (( haxe.SysTools.winMetaCharacters.indexOf(c2, null) >= 0 )) 
					{
						//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
						result1.addChar(94);
					}
					
					//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
					result1.addChar(((int) (haxe.lang.Runtime.toInt(c2)) ));
				}
				
			}
			
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return result1.toString();
		}
		else
		{
			//line 616 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			return argument1;
		}
		
	}
	
	
	public static char _charAt(java.lang.String str, int idx)
	{
		//line 621 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return ((java.lang.String) (((java.lang.Object) (str) )) ).charAt(idx);
	}
	
	
	public static int MIN_SURROGATE_CODE_POINT;
	
	public static int utf16CodePointAt(java.lang.String s, int index)
	{
		//line 633 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		int c = ( (( index < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index)) )) : (-1) );
		//line 634 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		if (( ( c >= 55296 ) && ( c <= 56319 ) )) 
		{
			//line 635 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			int index1 = ( index + 1 );
			//line 635 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
			c = ( ( ( c - 55232 ) << 10 ) | ( (( (( index1 < s.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s) )) ).charAt(index1)) )) : (-1) )) & 1023 ) );
		}
		
		//line 637 "C:\\HaxeToolkit\\haxe\\std\\StringTools.hx"
		return c;
	}
	
	
}


