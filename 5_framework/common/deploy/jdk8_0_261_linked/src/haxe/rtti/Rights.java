// Generated by Haxe 4.2.2
package haxe.rtti;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Rights extends haxe.lang.ParamEnum
{
	public Rights(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"RNormal", "RNo", "RCall", "RMethod", "RDynamic", "RInline"};
	
	public static final haxe.rtti.Rights RNormal = new haxe.rtti.Rights(0, null);
	
	public static final haxe.rtti.Rights RNo = new haxe.rtti.Rights(1, null);
	
	public static haxe.rtti.Rights RCall(java.lang.String m)
	{
		//line 81 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\CType.hx"
		return new haxe.rtti.Rights(2, new java.lang.Object[]{m});
	}
	
	
	public static final haxe.rtti.Rights RMethod = new haxe.rtti.Rights(3, null);
	
	public static final haxe.rtti.Rights RDynamic = new haxe.rtti.Rights(4, null);
	
	public static final haxe.rtti.Rights RInline = new haxe.rtti.Rights(5, null);
	
	@Override public java.lang.String getTag()
	{
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\rtti\\CType.hx"
		return haxe.rtti.Rights.__hx_constructs[this.index];
	}
	
	
}


