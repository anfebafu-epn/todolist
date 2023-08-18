// Generated by Haxe 4.2.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Date extends haxe.lang.HxObject
{
	public Date(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Date(int year, int month, int day, int hour, int min, int sec)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date.__hx_ctor__Date(this, year, month, day, hour, min, sec);
	}
	
	
	protected static void __hx_ctor__Date(haxe.root.Date __hx_this, int year, int month, int day, int hour, int min, int sec)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		__hx_this.date = new java.util.GregorianCalendar(((int) (year) ), ((int) (month) ), ((int) (day) ), ((int) (hour) ), ((int) (min) ), ((int) (sec) ));
		//line 36 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		__hx_this.dateUTC = new java.util.GregorianCalendar(((java.util.TimeZone) (java.util.TimeZone.getTimeZone(haxe.lang.Runtime.toString("UTC"))) ));
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		__hx_this.dateUTC.setTimeInMillis(((long) (__hx_this.date.getTimeInMillis()) ));
	}
	
	
	public static haxe.root.Date now()
	{
		//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date d = new haxe.root.Date(((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ));
		//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		d.date = java.util.Calendar.getInstance();
		//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		d.dateUTC.setTimeInMillis(((long) (d.date.getTimeInMillis()) ));
		//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return d;
	}
	
	
	public static haxe.root.Date fromTime(double t)
	{
		//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date d = new haxe.root.Date(((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ), ((int) (0) ));
		//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		d.date.setTimeInMillis(((long) (t) ));
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		d.dateUTC.setTimeInMillis(((long) (t) ));
		//line 127 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return d;
	}
	
	
	public static haxe.root.Date fromString(java.lang.String s)
	{
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		switch (s.length())
		{
			case 8:
			{
				//line 133 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				haxe.root.Array<java.lang.String> k = haxe.lang.StringExt.split(s, ":");
				//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return haxe.root.Date.fromTime(( ( ( ((double) (haxe.lang.Runtime.toDouble(haxe.root.Std.parseInt(k.__get(0)))) ) * ((double) (3600000.) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(haxe.root.Std.parseInt(k.__get(1)))) ) * ((double) (60000.) ) ) ) + ( ((double) (haxe.lang.Runtime.toDouble(haxe.root.Std.parseInt(k.__get(2)))) ) * ((double) (1000.) ) ) ));
			}
			
			
			case 10:
			{
				//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				haxe.root.Array<java.lang.String> k1 = haxe.lang.StringExt.split(s, "-");
				//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return new haxe.root.Date(((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k1.__get(0)))) ), ((int) (( ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k1.__get(1)))) ) - ((int) (1) ) )) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k1.__get(2)))) ), ((int) (0) ), ((int) (0) ), ((int) (0) ));
			}
			
			
			case 19:
			{
				//line 139 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				haxe.root.Array<java.lang.String> k2 = haxe.lang.StringExt.split(s, " ");
				//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				haxe.root.Array<java.lang.String> y = haxe.lang.StringExt.split(k2.__get(0), "-");
				//line 141 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				haxe.root.Array<java.lang.String> t = haxe.lang.StringExt.split(k2.__get(1), ":");
				//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return new haxe.root.Date(((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(0)))) ), ((int) (( ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(1)))) ) - ((int) (1) ) )) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(2)))) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(0)))) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(1)))) ), ((int) (haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(2)))) ));
			}
			
			
			default:
			{
				//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Invalid date format : " + s ))) );
			}
			
		}
		
	}
	
	
	public java.util.Calendar date;
	
	public java.util.Calendar dateUTC;
	
	public final double getTime()
	{
		//line 41 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return ((double) (this.date.getTimeInMillis()) );
	}
	
	
	public final int getHours()
	{
		//line 45 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.HOUR_OF_DAY) ));
	}
	
	
	public final int getMinutes()
	{
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.MINUTE) ));
	}
	
	
	public final int getSeconds()
	{
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.SECOND) ));
	}
	
	
	public final int getFullYear()
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.YEAR) ));
	}
	
	
	public final int getMonth()
	{
		//line 61 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.MONTH) ));
	}
	
	
	public final int getDate()
	{
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.date.get(((int) (java.util.Calendar.DAY_OF_MONTH) ));
	}
	
	
	public final int getDay()
	{
		//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return ( this.date.get(((int) (java.util.Calendar.DAY_OF_WEEK) )) - 1 );
	}
	
	
	public final int getUTCHours()
	{
		//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.HOUR_OF_DAY) ));
	}
	
	
	public final int getUTCMinutes()
	{
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.MINUTE) ));
	}
	
	
	public final int getUTCSeconds()
	{
		//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.SECOND) ));
	}
	
	
	public final int getUTCFullYear()
	{
		//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.YEAR) ));
	}
	
	
	public final int getUTCMonth()
	{
		//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.MONTH) ));
	}
	
	
	public final int getUTCDate()
	{
		//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return this.dateUTC.get(((int) (java.util.Calendar.DAY_OF_MONTH) ));
	}
	
	
	public final int getUTCDay()
	{
		//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return ( this.dateUTC.get(((int) (java.util.Calendar.DAY_OF_WEEK) )) - 1 );
	}
	
	
	public final int getTimezoneOffset()
	{
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return  - (((int) (( ((double) (this.date.get(((int) (java.util.Calendar.ZONE_OFFSET) ))) ) / 60000 )) )) ;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		int m = ( this.date.get(((int) (java.util.Calendar.MONTH) )) + 1 );
		//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		int d = this.date.get(((int) (java.util.Calendar.DAY_OF_MONTH) ));
		//line 109 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		int h = this.date.get(((int) (java.util.Calendar.HOUR_OF_DAY) ));
		//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		int mi = this.date.get(((int) (java.util.Calendar.MINUTE) ));
		//line 111 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		int s = this.date.get(((int) (java.util.Calendar.SECOND) ));
		//line 112 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		return ( ( ( ( ( ( ( ( ( ( this.date.get(((int) (java.util.Calendar.YEAR) )) + "-" ) + (( (( m < 10 )) ? (( "0" + m )) : (( "" + m )) )) ) + "-" ) + (( (( d < 10 )) ? (( "0" + d )) : (( "" + d )) )) ) + " " ) + (( (( h < 10 )) ? (( "0" + h )) : (( "" + h )) )) ) + ":" ) + (( (( mi < 10 )) ? (( "0" + mi )) : (( "" + mi )) )) ) + ":" ) + (( (( s < 10 )) ? (( "0" + s )) : (( "" + s )) )) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (( field != null )) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				switch (field.hashCode())
				{
					case 1443304214:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("dateUTC")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							this.dateUTC = ((java.util.Calendar) (value) );
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return value;
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 3076014:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("date")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							this.date = ((java.util.Calendar) (value) );
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return value;
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (( field != null )) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("toString")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 3076014:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("date")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.date;
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -493762846:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getTimezoneOffset")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTimezoneOffset")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1443304214:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("dateUTC")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.dateUTC;
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 830298702:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCDay")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCDay")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -75121853:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getTime")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTime")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -30544068:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCDate")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCDate")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1955294553:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getHours")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getHours")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -938142542:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCMonth")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCMonth")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 2101762217:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getMinutes")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMinutes")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 798017530:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCFullYear")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCFullYear")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -1288010167:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getSeconds")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getSeconds")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1121613873:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCSeconds")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCSeconds")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -885883678:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getFullYear")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFullYear")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 216418961:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCMinutes")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCMinutes")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1959905482:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getMonth")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMonth")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -942753471:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCHours")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUTCHours")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -75605980:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getDate")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDate")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -1249364890:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getDay")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDay")) );
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (( field != null )) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("toString")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.toString();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -75121853:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getTime")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getTime();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -493762846:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getTimezoneOffset")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getTimezoneOffset();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1955294553:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getHours")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getHours();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 830298702:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCDay")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCDay();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 2101762217:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getMinutes")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getMinutes();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -30544068:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCDate")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCDate();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -1288010167:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getSeconds")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getSeconds();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -938142542:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCMonth")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCMonth();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -885883678:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getFullYear")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getFullYear();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 798017530:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCFullYear")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCFullYear();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1959905482:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getMonth")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getMonth();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 1121613873:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCSeconds")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCSeconds();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -75605980:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getDate")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getDate();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case 216418961:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCMinutes")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCMinutes();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -1249364890:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getDay")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getDay();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
					case -942753471:
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						if (field.equals("getUTCHours")) 
						{
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							__temp_executeDef1 = false;
							//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
							return this.getUTCHours();
						}
						
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		baseArr.push("dateUTC");
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		baseArr.push("date");
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Date.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


