// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.crypto {
	public class Sha1 : global::haxe.lang.HxObject {
		
		public Sha1(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Sha1() {
			global::haxe.crypto.Sha1.__hx_ctor_haxe_crypto_Sha1(this);
		}
		
		
		protected static void __hx_ctor_haxe_crypto_Sha1(global::haxe.crypto.Sha1 __hx_this) {
		}
		
		
		public static string encode(string s) {
			global::haxe.crypto.Sha1 sh = new global::haxe.crypto.Sha1();
			global::Array<int> h = sh.doEncode(global::haxe.crypto.Sha1.str2blks(s));
			return sh.hex(h);
		}
		
		
		public static global::haxe.io.Bytes make(global::haxe.io.Bytes b) {
			unchecked {
				global::Array<int> h = new global::haxe.crypto.Sha1().doEncode(global::haxe.crypto.Sha1.bytes2blks(b));
				global::haxe.io.Bytes @out = global::haxe.io.Bytes.alloc(20);
				int p = 0;
				{
					{
						@out.b[p++] = ((byte) (((int) (( ((uint) (h[0]) ) >> 24 )) )) );
						@out.b[p++] = ((byte) (( ( h[0] >> 16 ) & 255 )) );
						@out.b[p++] = ((byte) (( ( h[0] >> 8 ) & 255 )) );
						@out.b[p++] = ((byte) (( h[0] & 255 )) );
					}
					
					{
						@out.b[p++] = ((byte) (((int) (( ((uint) (h[1]) ) >> 24 )) )) );
						@out.b[p++] = ((byte) (( ( h[1] >> 16 ) & 255 )) );
						@out.b[p++] = ((byte) (( ( h[1] >> 8 ) & 255 )) );
						@out.b[p++] = ((byte) (( h[1] & 255 )) );
					}
					
					{
						@out.b[p++] = ((byte) (((int) (( ((uint) (h[2]) ) >> 24 )) )) );
						@out.b[p++] = ((byte) (( ( h[2] >> 16 ) & 255 )) );
						@out.b[p++] = ((byte) (( ( h[2] >> 8 ) & 255 )) );
						@out.b[p++] = ((byte) (( h[2] & 255 )) );
					}
					
					{
						@out.b[p++] = ((byte) (((int) (( ((uint) (h[3]) ) >> 24 )) )) );
						@out.b[p++] = ((byte) (( ( h[3] >> 16 ) & 255 )) );
						@out.b[p++] = ((byte) (( ( h[3] >> 8 ) & 255 )) );
						@out.b[p++] = ((byte) (( h[3] & 255 )) );
					}
					
					{
						@out.b[p++] = ((byte) (((int) (( ((uint) (h[4]) ) >> 24 )) )) );
						@out.b[p++] = ((byte) (( ( h[4] >> 16 ) & 255 )) );
						@out.b[p++] = ((byte) (( ( h[4] >> 8 ) & 255 )) );
						@out.b[p++] = ((byte) (( h[4] & 255 )) );
					}
					
				}
				
				return @out;
			}
		}
		
		
		public static global::Array<int> str2blks(string s) {
			unchecked {
				global::haxe.io.Bytes s1 = global::haxe.io.Bytes.ofString(s, null);
				int nblk = ( (( ( s1.length + 8 ) >> 6 )) + 1 );
				global::Array<int> blks = new global::Array<int>();
				{
					int _g = 0;
					int _g1 = ( nblk * 16 );
					while (( _g < _g1 )) {
						int i = _g++;
						blks[i] = 0;
					}
					
				}
				
				{
					int _g2 = 0;
					int _g3 = s1.length;
					while (( _g2 < _g3 )) {
						int i1 = _g2++;
						int p = ( i1 >> 2 );
						blks[p] |= ( ((int) (s1.b[i1]) ) << ( 24 - (( (( i1 & 3 )) << 3 )) ) );
					}
					
				}
				
				int i2 = s1.length;
				int p1 = ( i2 >> 2 );
				blks[p1] |= ( 128 << ( 24 - (( (( i2 & 3 )) << 3 )) ) );
				blks[( ( nblk * 16 ) - 1 )] = ( s1.length * 8 );
				return blks;
			}
		}
		
		
		public static global::Array<int> bytes2blks(global::haxe.io.Bytes b) {
			unchecked {
				int nblk = ( (( ( b.length + 8 ) >> 6 )) + 1 );
				global::Array<int> blks = new global::Array<int>();
				{
					int _g = 0;
					int _g1 = ( nblk * 16 );
					while (( _g < _g1 )) {
						int i = _g++;
						blks[i] = 0;
					}
					
				}
				
				{
					int _g2 = 0;
					int _g3 = b.length;
					while (( _g2 < _g3 )) {
						int i1 = _g2++;
						int p = ( i1 >> 2 );
						blks[p] |= ( ((int) (b.b[i1]) ) << ( 24 - (( (( i1 & 3 )) << 3 )) ) );
					}
					
				}
				
				int i2 = b.length;
				int p1 = ( i2 >> 2 );
				blks[p1] |= ( 128 << ( 24 - (( (( i2 & 3 )) << 3 )) ) );
				blks[( ( nblk * 16 ) - 1 )] = ( b.length * 8 );
				return blks;
			}
		}
		
		
		public virtual global::Array<int> doEncode(global::Array<int> x) {
			unchecked {
				global::Array<int> w = new global::Array<int>();
				int a = 1732584193;
				int b = -271733879;
				int c = -1732584194;
				int d = 271733878;
				int e = -1009589776;
				int i = 0;
				while (( i < x.length )) {
					int olda = a;
					int oldb = b;
					int oldc = c;
					int oldd = d;
					int olde = e;
					int j = 0;
					while (( j < 80 )) {
						if (( j < 16 )) {
							w[j] = x[( i + j )];
						}
						else {
							int num = ( ( ( w[( j - 3 )] ^ w[( j - 8 )] ) ^ w[( j - 14 )] ) ^ w[( j - 16 )] );
							w[j] = ( ( num << 1 ) | ((int) (( ((uint) (num) ) >> 31 )) ) );
						}
						
						int t = ( ( ( ( (( ( a << 5 ) | ((int) (( ((uint) (a) ) >> 27 )) ) )) + this.ft(j, b, c, d) ) + e ) + w[j] ) + this.kt(j) );
						e = d;
						d = c;
						c = ( ( b << 30 ) | ((int) (( ((uint) (b) ) >> 2 )) ) );
						b = a;
						a = t;
						 ++ j;
					}
					
					a += olda;
					b += oldb;
					c += oldc;
					d += oldd;
					e += olde;
					i += 16;
				}
				
				return new global::Array<int>(new int[]{a, b, c, d, e});
			}
		}
		
		
		public int rol(int num, int cnt) {
			unchecked {
				return ( ( num << cnt ) | ((int) (( ((uint) (num) ) >> ( 32 - cnt ) )) ) );
			}
		}
		
		
		public virtual int ft(int t, int b, int c, int d) {
			unchecked {
				if (( t < 20 )) {
					return ( ( b & c ) | (  ~ (b)  & d ) );
				}
				
				if (( t < 40 )) {
					return ( ( b ^ c ) ^ d );
				}
				
				if (( t < 60 )) {
					return ( ( ( b & c ) | ( b & d ) ) | ( c & d ) );
				}
				
				return ( ( b ^ c ) ^ d );
			}
		}
		
		
		public virtual int kt(int t) {
			unchecked {
				if (( t < 20 )) {
					return 1518500249;
				}
				
				if (( t < 40 )) {
					return 1859775393;
				}
				
				if (( t < 60 )) {
					return -1894007588;
				}
				
				return -899497514;
			}
		}
		
		
		public virtual string hex(global::Array<int> a) {
			unchecked {
				string str = "";
				{
					int _g = 0;
					while (( _g < a.length )) {
						int num = a[_g];
						 ++ _g;
						str = global::haxe.lang.Runtime.concat(str, global::StringTools.hex(num, new global::haxe.lang.Null<int>(8, true)));
					}
					
				}
				
				return str.ToLowerInvariant();
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 5194459:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "hex", 5194459)) );
					}
					
					
					case 23977:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "kt", 23977)) );
					}
					
					
					case 22862:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "ft", 22862)) );
					}
					
					
					case 5693967:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "rol", 5693967)) );
					}
					
					
					case 234584065:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "doEncode", 234584065)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, object[] dynargs) {
			unchecked {
				switch (hash) {
					case 5194459:
					{
						return this.hex(((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (dynargs[0]) ))) ));
					}
					
					
					case 23977:
					{
						return this.kt(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ));
					}
					
					
					case 22862:
					{
						return this.ft(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[2])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[3])) ));
					}
					
					
					case 5693967:
					{
						return this.rol(((int) (global::haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[1])) ));
					}
					
					
					case 234584065:
					{
						return this.doEncode(((global::Array<int>) (global::Array<object>.__hx_cast<int>(((global::Array) (dynargs[0]) ))) ));
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
	}
}


