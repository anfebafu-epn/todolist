// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.interfaces {
	public interface IClause : global::haxe.lang.IHxObject {
		
		void SCRIPT_PART(string args);
		
		string SCRIPT();
		
		object Execute();
		
		void Register(global::nMorph.framework.orm.tools.Context context);
		
		global::Array<object> Queue(global::Array<object> queue);
		
		global::nMorph.framework.orm.tools.BulkRun Bulk(global::nMorph.framework.orm.tools.BulkRun bulk);
		
		object ReadValue();
		
		global::nMorph.framework.orm.client.QueryTable ReadTable();
		
		global::Array<T> Read<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context);
		
		T ReadOne<T>(global::System.Type cl, global::nMorph.framework.orm.tools.Context context);
		
	}
}


