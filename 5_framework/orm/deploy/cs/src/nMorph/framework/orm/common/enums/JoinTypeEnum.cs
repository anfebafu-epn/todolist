// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.enums {
	public class JoinTypeEnum : global::haxe.lang.Enum {
		
		protected JoinTypeEnum(int index) : base(index) {
		}
		
		
		public static readonly global::nMorph.framework.orm.common.enums.JoinTypeEnum INNERJOIN = new global::nMorph.framework.orm.common.enums.JoinTypeEnum_INNERJOIN();
		
		public static readonly global::nMorph.framework.orm.common.enums.JoinTypeEnum LEFTJOIN = new global::nMorph.framework.orm.common.enums.JoinTypeEnum_LEFTJOIN();
		
		public static readonly global::nMorph.framework.orm.common.enums.JoinTypeEnum RIGHTJOIN = new global::nMorph.framework.orm.common.enums.JoinTypeEnum_RIGHTJOIN();
		
		protected static readonly string[] __hx_constructs = new string[]{"INNERJOIN", "LEFTJOIN", "RIGHTJOIN"};
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.enums {
	public sealed class JoinTypeEnum_INNERJOIN : global::nMorph.framework.orm.common.enums.JoinTypeEnum {
		
		public JoinTypeEnum_INNERJOIN() : base(0) {
		}
		
		
		public override string getTag() {
			return "INNERJOIN";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.enums {
	public sealed class JoinTypeEnum_LEFTJOIN : global::nMorph.framework.orm.common.enums.JoinTypeEnum {
		
		public JoinTypeEnum_LEFTJOIN() : base(1) {
		}
		
		
		public override string getTag() {
			return "LEFTJOIN";
		}
		
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.enums {
	public sealed class JoinTypeEnum_RIGHTJOIN : global::nMorph.framework.orm.common.enums.JoinTypeEnum {
		
		public JoinTypeEnum_RIGHTJOIN() : base(2) {
		}
		
		
		public override string getTag() {
			return "RIGHTJOIN";
		}
		
		
	}
}


