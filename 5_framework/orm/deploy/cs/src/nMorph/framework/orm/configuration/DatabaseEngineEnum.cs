// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public class DatabaseEngineEnum : global::haxe.lang.Enum {
		
		protected DatabaseEngineEnum(int index) : base(index) {
		}
		
		
		public static readonly global::nMorph.framework.orm.configuration.DatabaseEngineEnum SQLSERVER = new global::nMorph.framework.orm.configuration.DatabaseEngineEnum_SQLSERVER();
		
		public static readonly global::nMorph.framework.orm.configuration.DatabaseEngineEnum ORACLE = new global::nMorph.framework.orm.configuration.DatabaseEngineEnum_ORACLE();
		
		public static readonly global::nMorph.framework.orm.configuration.DatabaseEngineEnum MYSQL = new global::nMorph.framework.orm.configuration.DatabaseEngineEnum_MYSQL();
		
		public static readonly global::nMorph.framework.orm.configuration.DatabaseEngineEnum POSTGRESQL = new global::nMorph.framework.orm.configuration.DatabaseEngineEnum_POSTGRESQL();
		
		public static readonly global::nMorph.framework.orm.configuration.DatabaseEngineEnum GENERIC = new global::nMorph.framework.orm.configuration.DatabaseEngineEnum_GENERIC();
		
		protected static readonly string[] __hx_constructs = new string[]{"SQLSERVER", "ORACLE", "MYSQL", "POSTGRESQL", "GENERIC"};
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public sealed class DatabaseEngineEnum_SQLSERVER : global::nMorph.framework.orm.configuration.DatabaseEngineEnum {
		
		public DatabaseEngineEnum_SQLSERVER() : base(0) {
		}
		
		
		public override string getTag() {
			return "SQLSERVER";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public sealed class DatabaseEngineEnum_ORACLE : global::nMorph.framework.orm.configuration.DatabaseEngineEnum {
		
		public DatabaseEngineEnum_ORACLE() : base(1) {
		}
		
		
		public override string getTag() {
			return "ORACLE";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public sealed class DatabaseEngineEnum_MYSQL : global::nMorph.framework.orm.configuration.DatabaseEngineEnum {
		
		public DatabaseEngineEnum_MYSQL() : base(2) {
		}
		
		
		public override string getTag() {
			return "MYSQL";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public sealed class DatabaseEngineEnum_POSTGRESQL : global::nMorph.framework.orm.configuration.DatabaseEngineEnum {
		
		public DatabaseEngineEnum_POSTGRESQL() : base(3) {
		}
		
		
		public override string getTag() {
			return "POSTGRESQL";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.configuration {
	public sealed class DatabaseEngineEnum_GENERIC : global::nMorph.framework.orm.configuration.DatabaseEngineEnum {
		
		public DatabaseEngineEnum_GENERIC() : base(4) {
		}
		
		
		public override string getTag() {
			return "GENERIC";
		}
		
		
	}
}

