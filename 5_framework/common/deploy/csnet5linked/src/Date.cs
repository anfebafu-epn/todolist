// Generated by Haxe 4.2.1+bf9ff69

#pragma warning disable 109, 114, 219, 429, 168, 162
public class Date : global::haxe.lang.HxObject {
	public Date() { }

	public Date(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Date(global::System.DateTime native) {
		#line 46 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		global::Date.__hx_ctor__Date(((global::Date) (this) ), ((global::System.DateTime) (native) ));
	}
	#line default
	
	public Date(int year, int month, int day, int hour, int min, int sec) {
		#line 37 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		global::Date.__hx_ctor__Date(((global::Date) (this) ), ((int) (year) ), ((int) (month) ), ((int) (day) ), ((int) (hour) ), ((int) (min) ), ((int) (sec) ));
	}
	#line default
	
	protected static void __hx_ctor__Date(global::Date __hx_this, global::System.DateTime native) {
		#line 47 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		if (( native.Kind == global::System.DateTimeKind.Utc )) {
			#line 48 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			__hx_this.dateUTC = native;
			__hx_this.date = __hx_this.dateUTC.ToLocalTime();
		}
		else {
			#line 51 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			__hx_this.date = native;
			__hx_this.dateUTC = __hx_this.date.ToUniversalTime();
		}
		
	}
	#line default
	
	protected static void __hx_ctor__Date(global::Date __hx_this, int year, int month, int day, int hour, int min, int sec) {
		unchecked {
			#line 38 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			if (( day <= 0 )) {
				#line 39 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
				day = 1;
			}
			
			#line 40 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			if (( year <= 0 )) {
				#line 41 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
				year = 1;
			}
			
			#line 42 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			__hx_this.date = new global::System.DateTime(((int) (year) ), ((int) (( month + 1 )) ), ((int) (day) ), ((int) (hour) ), ((int) (min) ), ((int) (sec) ), ((global::System.DateTimeKind) (global::System.DateTimeKind.Local) ));
			__hx_this.dateUTC = __hx_this.date.ToUniversalTime();
		}
		#line default
	}
	
	
	public static readonly long epochTicks = new global::System.DateTime(((int) (1970) ), ((int) (1) ), ((int) (1) )).Ticks;
	
	public static global::Date now() {
		#line 129 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return new global::Date(((global::System.DateTime) (global::System.DateTime.Now) ));
	}
	#line default
	
	public static global::Date fromTime(double t) {
		#line 134 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return new global::Date(((global::System.DateTime) (global::System.TimeZone.CurrentTimeZone.ToLocalTime(((global::System.DateTime) (new global::System.DateTime(((long) (( ((long) (( t * ((double) (global::System.TimeSpan.TicksPerMillisecond) ) )) ) + ((long) (global::Date.epochTicks) ) )) ))) ))) ));
	}
	#line default
	
	public static global::Date fromString(string s) {
		unchecked {
			#line 142 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			switch (s.Length) {
				case 8:
				{
					#line 144 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					global::Array<string> k = global::haxe.lang.StringExt.split(s, ":");
					return new global::Date(((global::System.DateTime) (new global::System.DateTime(((int) (1970) ), ((int) (1) ), ((int) (1) ), (global::Std.parseInt(k[0])).@value, (global::Std.parseInt(k[1])).@value, (global::Std.parseInt(k[2])).@value, ((global::System.DateTimeKind) (global::System.DateTimeKind.Utc) ))) ));
				}
				
				
				case 10:
				{
					#line 147 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					global::Array<string> k1 = global::haxe.lang.StringExt.split(s, "-");
					return new global::Date(((global::System.DateTime) (new global::System.DateTime((global::Std.parseInt(k1[0])).@value, (global::Std.parseInt(k1[1])).@value, (global::Std.parseInt(k1[2])).@value, ((int) (0) ), ((int) (0) ), ((int) (0) ), ((global::System.DateTimeKind) (global::System.DateTimeKind.Local) ))) ));
				}
				
				
				case 19:
				{
					#line 150 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					global::Array<string> k2 = global::haxe.lang.StringExt.split(s, " ");
					global::Array<string> y = global::haxe.lang.StringExt.split(k2[0], "-");
					#line 152 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					global::Array<string> t = global::haxe.lang.StringExt.split(k2[1], ":");
					return new global::Date(((global::System.DateTime) (new global::System.DateTime((global::Std.parseInt(y[0])).@value, (global::Std.parseInt(y[1])).@value, (global::Std.parseInt(y[2])).@value, (global::Std.parseInt(t[0])).@value, (global::Std.parseInt(t[1])).@value, (global::Std.parseInt(t[2])).@value, ((global::System.DateTimeKind) (global::System.DateTimeKind.Local) ))) ));
				}
				
				
				default:
				{
					#line 155 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					throw ((global::System.Exception) (global::haxe.Exception.thrown(global::haxe.lang.Runtime.concat("Invalid date format : ", s))) );
				}
				
			}
			
		}
		#line default
	}
	
	
	public static global::Date fromNative(global::System.DateTime d) {
		#line 160 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return new global::Date(((global::System.DateTime) (d) ));
	}
	#line default
	
	public global::System.DateTime date;
	
	public global::System.DateTime dateUTC;
	
	public double getTime() {
		#line 58 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return ( ((double) (((long) (( ((long) (global::System.TimeZone.CurrentTimeZone.ToUniversalTime(((global::System.DateTime) (this.date) )).Ticks) ) - ((long) (global::Date.epochTicks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) );
	}
	#line default
	
	public int getHours() {
		#line 65 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.Hour;
	}
	#line default
	
	public int getMinutes() {
		#line 69 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.Minute;
	}
	#line default
	
	public int getSeconds() {
		#line 73 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.Second;
	}
	#line default
	
	public int getFullYear() {
		#line 77 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.Year;
	}
	#line default
	
	public int getMonth() {
		unchecked {
			#line 81 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			return ( this.date.Month - 1 );
		}
		#line default
	}
	
	
	public int getDate() {
		#line 85 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.Day;
	}
	#line default
	
	public int getDay() {
		#line 89 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return ((int) (global::haxe.lang.Runtime.toInt(((object) (this.date.DayOfWeek) ))) );
	}
	#line default
	
	public int getUTCHours() {
		#line 93 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.dateUTC.Hour;
	}
	#line default
	
	public int getUTCMinutes() {
		#line 97 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.dateUTC.Minute;
	}
	#line default
	
	public int getUTCSeconds() {
		#line 101 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.dateUTC.Second;
	}
	#line default
	
	public int getUTCFullYear() {
		#line 105 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.dateUTC.Year;
	}
	#line default
	
	public int getUTCMonth() {
		unchecked {
			#line 109 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			return ( this.dateUTC.Month - 1 );
		}
		#line default
	}
	
	
	public int getUTCDate() {
		#line 113 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.dateUTC.Day;
	}
	#line default
	
	public int getUTCDay() {
		#line 117 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return ((int) (global::haxe.lang.Runtime.toInt(((object) (this.dateUTC.DayOfWeek) ))) );
	}
	#line default
	
	public int getTimezoneOffset() {
		#line 121 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return ((int) (( ( ((double) (((long) (( ((long) (this.dateUTC.Ticks) ) - ((long) (this.date.Ticks) ) )) )) ) / ((double) (global::System.TimeSpan.TicksPerMillisecond) ) ) / 60000.0 )) );
	}
	#line default
	
	public virtual string toString() {
		#line 125 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		return this.date.ToString(((string) ("yyyy-MM-dd HH\\:mm\\:ss") ));
	}
	#line default
	
	public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
		unchecked {
			#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			switch (hash) {
				case 343868310:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					this.dateUTC = ((global::System.DateTime) (@value) );
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return @value;
				}
				
				
				case 1113806382:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					this.date = ((global::System.DateTime) (@value) );
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return @value;
				}
				
				
				default:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return base.__hx_setField(field, hash, @value, handleProperties);
				}
				
			}
			
		}
		#line default
	}
	
	
	public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
		unchecked {
			#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			switch (hash) {
				case 946786476:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "toString", 946786476)) );
				}
				
				
				case 1171620962:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getTimezoneOffset", 1171620962)) );
				}
				
				
				case 1312666830:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCDay", 1312666830)) );
				}
				
				
				case 666925948:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCDate", 666925948)) );
				}
				
				
				case 1484998194:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCMonth", 1484998194)) );
				}
				
				
				case 2029008698:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCFullYear", 2029008698)) );
				}
				
				
				case 365188593:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCSeconds", 365188593)) );
				}
				
				
				case 253048465:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCMinutes", 253048465)) );
				}
				
				
				case 2005380545:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getUTCHours", 2005380545)) );
				}
				
				
				case 589000550:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getDay", 589000550)) );
				}
				
				
				case 350619108:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getDate", 350619108)) );
				}
				
				
				case 1815533258:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getMonth", 1815533258)) );
				}
				
				
				case 172955042:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getFullYear", 172955042)) );
				}
				
				
				case 703544457:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getSeconds", 703544457)) );
				}
				
				
				case 591404329:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getMinutes", 591404329)) );
				}
				
				
				case 188431961:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getHours", 188431961)) );
				}
				
				
				case 528448451:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "getTime", 528448451)) );
				}
				
				
				case 343868310:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.dateUTC;
				}
				
				
				case 1113806382:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.date;
				}
				
				
				default:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
				}
				
			}
			
		}
		#line default
	}
	
	
	public override object __hx_invokeField(string field, int hash, object[] dynargs) {
		unchecked {
			#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
			switch (hash) {
				case 946786476:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.toString();
				}
				
				
				case 1171620962:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getTimezoneOffset();
				}
				
				
				case 1312666830:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCDay();
				}
				
				
				case 666925948:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCDate();
				}
				
				
				case 1484998194:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCMonth();
				}
				
				
				case 2029008698:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCFullYear();
				}
				
				
				case 365188593:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCSeconds();
				}
				
				
				case 253048465:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCMinutes();
				}
				
				
				case 2005380545:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getUTCHours();
				}
				
				
				case 589000550:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getDay();
				}
				
				
				case 350619108:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getDate();
				}
				
				
				case 1815533258:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getMonth();
				}
				
				
				case 172955042:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getFullYear();
				}
				
				
				case 703544457:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getSeconds();
				}
				
				
				case 591404329:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getMinutes();
				}
				
				
				case 188431961:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getHours();
				}
				
				
				case 528448451:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return this.getTime();
				}
				
				
				default:
				{
					#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
					return base.__hx_invokeField(field, hash, dynargs);
				}
				
			}
			
		}
		#line default
	}
	
	
	public override void __hx_getFields(global::Array<string> baseArr) {
		#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		baseArr.push("dateUTC");
		#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		baseArr.push("date");
		#line 31 "C:\\HaxeToolkit\\haxe\\std\\cs\\_std\\Date.hx"
		base.__hx_getFields(baseArr);
	}
	#line default
	
	public override string ToString(){
		return this.toString();
	}
	
	
}


