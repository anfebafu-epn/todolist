// Generated by Haxe 4.2.2
package haxe.xml._Access;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class HasNodeAccess_Impl_
{
	public static boolean resolve(haxe.root.Xml this1, java.lang.String name)
	{
		//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Access.hx"
		return haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(this1.elementsNamed(name), "hasNext", null)) ));
	}
	
	
}


