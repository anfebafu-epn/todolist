// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.client {
	public class Connector : global::haxe.lang.HxObject {
		
		static Connector() {
			global::nMorph.framework.orm.client.Connector.__rtti = "<class path=\"nMorph.framework.orm.client.Connector\" params=\"\">\n\t<Execute public=\"1\" set=\"method\" line=\"14\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></Execute>\n\t<Queue public=\"1\" set=\"method\" line=\"19\" static=\"1\"><f a=\"SQL:Parameters:queue\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<ExecuteQueue public=\"1\" set=\"method\" line=\"34\" static=\"1\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<x path=\"Void\"/>\n</f></ExecuteQueue>\n\t<ReadValue public=\"1\" set=\"method\" line=\"42\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"47\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"nMorph.framework.orm.client.QueryTable\"/>\n</f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"53\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"59\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public Connector(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Connector() {
			global::nMorph.framework.orm.client.Connector.__hx_ctor_nMorph_framework_orm_client_Connector(this);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_client_Connector(global::nMorph.framework.orm.client.Connector __hx_this) {
		}
		
		
		public static string __rtti;
		
		public static object Execute(string SQL, global::Array<object> Parameters) {
			return null;
		}
		
		
		public static global::Array<object> Queue(string SQL, global::Array<object> Parameters, global::Array<object> queue) {
			if (( queue == null )) {
				queue = new global::Array<object>();
			}
			
			global::nMorph.framework.orm.client.QueueItem item = new global::nMorph.framework.orm.client.QueueItem();
			item.set_SQL(SQL);
			item.set_Parameters(Parameters);
			queue.push(item);
			return queue;
		}
		
		
		public static void ExecuteQueue(global::Array<object> queue) {
			int _g = 0;
			while (( _g < queue.length )) {
				global::nMorph.framework.orm.client.QueueItem item = ((global::nMorph.framework.orm.client.QueueItem) (queue[_g]) );
				 ++ _g;
				global::nMorph.framework.orm.client.Connector.Execute(item.get_SQL(), item.get_Parameters());
			}
			
		}
		
		
		public static object ReadValue(string SQL, global::Array<object> Parameters) {
			return null;
		}
		
		
		public static global::nMorph.framework.orm.client.QueryTable ReadTable(string SQL, global::Array<object> Parameters) {
			global::nMorph.framework.orm.client.QueryTable dt = new global::nMorph.framework.orm.client.QueryTable();
			return dt;
		}
		
		
		public static global::Array<T> Read<T>(string SQL, global::Array<object> Parameters, global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			global::Array<T> arr = new global::Array<T>();
			return arr;
		}
		
		
		public static T ReadOne<T>(string SQL, global::Array<object> Parameters, global::System.Type cl, global::nMorph.framework.orm.tools.Context context) {
			return default(T);
		}
		
		
	}
}

