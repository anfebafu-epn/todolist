// Generated by Haxe 4.2.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sys extends haxe.lang.HxObject
{
	public Sys(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Sys()
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		haxe.root.Sys.__hx_ctor__Sys(this);
	}
	
	
	protected static void __hx_ctor__Sys(haxe.root.Sys __hx_this)
	{
	}
	
	
	public static java.lang.String[] _args;
	
	public static haxe.ds.StringMap<java.lang.String> _env;
	
	public static java.lang.String _sysName;
	
	public static void print(java.lang.Object v)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.lang.System.out.print(((java.lang.Object) (v) ));
	}
	
	
	public static void println(java.lang.Object v)
	{
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.lang.System.out.println(((java.lang.Object) (v) ));
	}
	
	
	public static haxe.root.Array<java.lang.String> args()
	{
		//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.root.Sys._args == null )) 
		{
			//line 43 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		}
		
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.java.Lib.array_String(haxe.root.Sys._args);
	}
	
	
	public static java.lang.String getEnv(java.lang.String s)
	{
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return java.lang.System.getenv(haxe.lang.Runtime.toString(s));
	}
	
	
	public static void putEnv(java.lang.String s, java.lang.String v)
	{
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw new haxe.exceptions.NotImplementedException(haxe.lang.Runtime.toString("Not implemented in this platform"), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Sys", "Sys.hx", "putEnv"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (53) )) )})) ));
	}
	
	
	public static haxe.ds.StringMap<java.lang.String> environment()
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.root.Sys._env != null )) 
		{
			//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return ((haxe.ds.StringMap<java.lang.String>) (haxe.root.Sys._env) );
		}
		
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		haxe.ds.StringMap<java.lang.String> _env = haxe.root.Sys._env = new haxe.ds.StringMap<java.lang.String>();
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		{
			//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> mv = java.lang.System.getenv().entrySet().iterator();
			//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			while (mv.hasNext())
			{
				//line 60 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				java.util.Map.Entry<java.lang.String, java.lang.String> mv1 = mv.next();
				//line 61 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				_env.set(mv1.getKey(), mv1.getValue());
			}
			
		}
		
		//line 64 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return ((haxe.ds.StringMap<java.lang.String>) (_env) );
	}
	
	
	public static void sleep(double seconds)
	{
		//line 69 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 69 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.lang.Thread.sleep(((long) (( seconds * 1000 )) ));
		}
		catch (java.lang.Throwable _g)
		{
			//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			{
				//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				haxe.NativeStackTrace.exception.set(((java.lang.Throwable) (_g) ));
			}
			
			//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 71 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public static boolean setTimeLocale(java.lang.String loc)
	{
		//line 75 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return false;
	}
	
	
	public static java.lang.String getCwd()
	{
		//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.lang.StringExt.substr(new java.io.File(haxe.lang.Runtime.toString(".")).getAbsolutePath(), 0, -1);
	}
	
	
	public static void setCwd(java.lang.String s)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw new haxe.exceptions.NotImplementedException(haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Sys", "Sys.hx", "setCwd"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (84) )) )})) ));
	}
	
	
	public static java.lang.String systemName()
	{
		//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.root.Sys._sysName != null )) 
		{
			//line 89 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return haxe.root.Sys._sysName;
		}
		
		//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.lang.String sname = java.lang.System.getProperty(haxe.lang.Runtime.toString("os.name")).toLowerCase();
		//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "win", null) >= 0 )) 
		{
			//line 92 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return haxe.root.Sys._sysName = "Windows";
		}
		
		//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "mac", null) >= 0 )) 
		{
			//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return haxe.root.Sys._sysName = "Mac";
		}
		
		//line 95 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nux", null) >= 0 )) 
		{
			//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return haxe.root.Sys._sysName = "Linux";
		}
		
		//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nix", null) >= 0 )) 
		{
			//line 98 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return haxe.root.Sys._sysName = "BSD";
		}
		
		//line 100 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.root.Sys._sysName = java.lang.System.getProperty(haxe.lang.Runtime.toString("os.name"));
	}
	
	
	public static int command(java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.lang.ProcessBuilder pb = sys.io.Process.createProcessBuilder(cmd, args);
			//line 106 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			pb.redirectErrorStream(haxe.lang.Runtime.toBool(((java.lang.Boolean) (true) )));
			//line 111 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.lang.Process proc = pb.start();
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			haxe.java.io.NativeInput reader = new haxe.java.io.NativeInput(((java.io.InputStream) (proc.getInputStream()) ));
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			try 
			{
				//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				while (true)
				{
					//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					java.lang.String ln = reader.readLine();
					//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					java.lang.System.out.println(((java.lang.Object) (ln) ));
				}
				
			}
			catch (java.lang.Throwable _g)
			{
				//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				{
					//line 119 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					haxe.NativeStackTrace.exception.set(((java.lang.Throwable) (_g) ));
				}
				
				//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				if ( ! (( ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) ) instanceof haxe.io.Eof )) ) 
				{
					//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					throw _g;
				}
				
			}
			
			
			//line 121 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			proc.waitFor();
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			int exitCode = proc.exitValue();
			//line 123 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			proc.destroy();
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return exitCode;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static void exit(int code)
	{
		//line 128 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.lang.System.exit(((int) (code) ));
	}
	
	
	public static double time()
	{
		//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return ( ((double) (java.lang.System.currentTimeMillis()) ) / 1000 );
	}
	
	
	public static double cpuTime()
	{
		//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return ( ((double) (java.lang.System.nanoTime()) ) / 1000000000 );
	}
	
	
	public static java.lang.String executablePath()
	{
		//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.root.Sys.getCwd();
	}
	
	
	public static java.lang.String programPath()
	{
		//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 144 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return ((java.lang.Class) (((java.lang.Class) (haxe.root.Sys.class) )) ).getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		}
		catch (java.lang.Throwable typedException)
		{
			//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static int getChar(boolean echo)
	{
		//line 149 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw new haxe.exceptions.NotImplementedException(haxe.lang.Runtime.toString(null), ((haxe.Exception) (null) ), ((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Sys", "Sys.hx", "getChar"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (149) )) )})) ));
	}
	
	
	public static haxe.io.Input stdin()
	{
		//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.io.InputStream _in = ((java.io.InputStream) (haxe.lang.Runtime.getField(java.lang.System.class, "in", false)) );
		//line 154 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeInput(((java.io.InputStream) (_in) ));
	}
	
	
	public static haxe.io.Output stdout()
	{
		//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.out) ));
	}
	
	
	public static haxe.io.Output stderr()
	{
		//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.err) ));
	}
	
	
}

