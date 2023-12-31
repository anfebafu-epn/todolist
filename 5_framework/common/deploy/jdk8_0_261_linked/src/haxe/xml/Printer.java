// Generated by Haxe 4.2.2
package haxe.xml;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Printer extends haxe.lang.HxObject
{
	public Printer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Printer(boolean pretty)
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		haxe.xml.Printer.__hx_ctor_haxe_xml_Printer(this, pretty);
	}
	
	
	protected static void __hx_ctor_haxe_xml_Printer(haxe.xml.Printer __hx_this, boolean pretty)
	{
		//line 45 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		__hx_this.output = new haxe.root.StringBuf();
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		__hx_this.pretty = pretty;
	}
	
	
	public static java.lang.String print(haxe.root.Xml xml, java.lang.Object pretty)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		java.lang.Object pretty1 = ( (haxe.lang.Runtime.eq(pretty, null)) ? (((java.lang.Object) (false) )) : (pretty) );
		//line 36 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		haxe.xml.Printer printer = new haxe.xml.Printer(haxe.lang.Runtime.toBool(((java.lang.Boolean) (pretty1) )));
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		printer.writeNode(xml, "");
		//line 38 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		return printer.output.toString();
	}
	
	
	public haxe.root.StringBuf output;
	
	public boolean pretty;
	
	public void writeNode(haxe.root.Xml value, java.lang.String tabs)
	{
		//line 50 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		switch (value.nodeType)
		{
			case 0:
			{
				//line 68 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				this.output.add(haxe.lang.Runtime.toString(( tabs + "<" )));
				//line 68 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
				//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (( value.nodeType != haxe.root.Xml.Element )) 
					{
						//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, expected Element but found " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
					}
					
					//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(value.nodeName));
					//line 69 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
				}
				
				//line 70 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 70 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object attribute = value.attributes();
					//line 70 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(attribute, "hasNext", null)) )))
					{
						//line 70 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.String attribute1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(attribute, "next", null));
						//line 71 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString(( ( " " + attribute1 ) + "=\"" )));
						//line 71 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
						//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						{
							//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							java.lang.String input = haxe.root.StringTools.htmlEscape(value.get(attribute1), true);
							//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.output.add(haxe.lang.Runtime.toString(input));
							//line 72 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
						}
						
						//line 73 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString("\""));
						//line 73 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
					}
					
				}
				
				//line 75 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (this.hasChildren(value)) 
				{
					//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(">"));
					//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr8 = ((java.lang.Object) (null) );
					//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (this.pretty) 
					{
						//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString("\n"));
						//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr9 = ((java.lang.Object) (null) );
					}
					
					//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					{
						//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (( ( value.nodeType != haxe.root.Xml.Document ) && ( value.nodeType != haxe.root.Xml.Element ) )) 
						{
							//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, expected Element or Document but found " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
						}
						
						//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						int _g_current = 0;
						//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						haxe.root.Array<haxe.root.Xml> _g_array = value.children;
						//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						while (( _g_current < _g_array.length ))
						{
							//line 78 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							haxe.root.Xml child = _g_array.__get(_g_current++);
							//line 79 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.writeNode(child, ( (this.pretty) ? (( tabs + "\t" )) : (tabs) ));
						}
						
					}
					
					//line 81 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(( tabs + "</" )));
					//line 81 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr10 = ((java.lang.Object) (null) );
					//line 82 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					{
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (( value.nodeType != haxe.root.Xml.Element )) 
						{
							//line 82 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, expected Element but found " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
						}
						
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString(value.nodeName));
						//line 82 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr11 = ((java.lang.Object) (null) );
					}
					
					//line 83 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(">"));
					//line 83 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr12 = ((java.lang.Object) (null) );
					//line 84 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (this.pretty) 
					{
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString("\n"));
						//line 84 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr13 = ((java.lang.Object) (null) );
					}
					
				}
				else
				{
					//line 86 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString("/>"));
					//line 86 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
					//line 87 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (this.pretty) 
					{
						//line 87 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString("\n"));
						//line 87 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
					}
					
				}
				
				//line 67 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 1:
			{
				//line 90 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (( ( value.nodeType == haxe.root.Xml.Document ) || ( value.nodeType == haxe.root.Xml.Element ) )) 
				{
					//line 90 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
				}
				
				//line 90 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.String nodeValue = value.nodeValue;
				//line 91 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (( nodeValue.length() != 0 )) 
				{
					//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					{
						//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.String input1 = ( tabs + haxe.root.StringTools.htmlEscape(nodeValue, null) );
						//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString(input1));
						//line 92 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr14 = ((java.lang.Object) (null) );
					}
					
					//line 93 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (this.pretty) 
					{
						//line 93 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						this.output.add(haxe.lang.Runtime.toString("\n"));
						//line 93 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						java.lang.Object __temp_expr15 = ((java.lang.Object) (null) );
					}
					
				}
				
				//line 89 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 2:
			{
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				this.output.add(haxe.lang.Runtime.toString(( tabs + "<![CDATA[" )));
				//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.Object __temp_expr16 = ((java.lang.Object) (null) );
				//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (( ( value.nodeType == haxe.root.Xml.Document ) || ( value.nodeType == haxe.root.Xml.Element ) )) 
					{
						//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
					}
					
					//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(value.nodeValue));
					//line 53 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr17 = ((java.lang.Object) (null) );
				}
				
				//line 54 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				this.output.add(haxe.lang.Runtime.toString("]]>"));
				//line 54 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.Object __temp_expr18 = ((java.lang.Object) (null) );
				//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (this.pretty) 
				{
					//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString("\n"));
					//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr19 = ((java.lang.Object) (null) );
				}
				
				//line 51 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 3:
			{
				//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (( ( value.nodeType == haxe.root.Xml.Document ) || ( value.nodeType == haxe.root.Xml.Element ) )) 
				{
					//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
				}
				
				//line 57 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.String commentContent = value.nodeValue;
				//line 58 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				commentContent = new haxe.root.EReg(haxe.lang.Runtime.toString("[\n\r\t]+"), haxe.lang.Runtime.toString("g")).replace(commentContent, "");
				//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				commentContent = ( ( "<!--" + commentContent ) + "-->" );
				//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				this.output.add(haxe.lang.Runtime.toString(tabs));
				//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				java.lang.Object __temp_expr20 = ((java.lang.Object) (null) );
				//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.String input2 = ((java.lang.String) (((java.lang.Object) (commentContent) )) ).trim();
					//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(input2));
					//line 61 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr21 = ((java.lang.Object) (null) );
				}
				
				//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (this.pretty) 
				{
					//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString("\n"));
					//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr22 = ((java.lang.Object) (null) );
				}
				
				//line 56 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 4:
			{
				//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (( ( value.nodeType == haxe.root.Xml.Document ) || ( value.nodeType == haxe.root.Xml.Element ) )) 
					{
						//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
					}
					
					//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(( ( "<!DOCTYPE " + value.nodeValue ) + ">" )));
					//line 99 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr23 = ((java.lang.Object) (null) );
				}
				
				//line 100 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (this.pretty) 
				{
					//line 100 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString("\n"));
					//line 100 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr24 = ((java.lang.Object) (null) );
				}
				
				//line 98 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 5:
			{
				//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				{
					//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					if (( ( value.nodeType == haxe.root.Xml.Document ) || ( value.nodeType == haxe.root.Xml.Element ) )) 
					{
						//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
					}
					
					//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString(( ( "<?" + value.nodeValue ) + "?>" )));
					//line 96 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr25 = ((java.lang.Object) (null) );
				}
				
				//line 97 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (this.pretty) 
				{
					//line 97 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.output.add(haxe.lang.Runtime.toString("\n"));
					//line 97 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					java.lang.Object __temp_expr26 = ((java.lang.Object) (null) );
				}
				
				//line 95 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
			case 6:
			{
				//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				if (( ( value.nodeType != haxe.root.Xml.Document ) && ( value.nodeType != haxe.root.Xml.Element ) )) 
				{
					//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, expected Element or Document but found " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
				}
				
				//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				int _g_current1 = 0;
				//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				haxe.root.Array<haxe.root.Xml> _g_array1 = value.children;
				//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				while (( _g_current1 < _g_array1.length ))
				{
					//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					haxe.root.Xml child1 = _g_array1.__get(_g_current1++);
					//line 65 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
					this.writeNode(child1, tabs);
				}
				
				//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				break;
			}
			
			
		}
		
	}
	
	
	public final void write(java.lang.String input)
	{
		//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		this.output.add(haxe.lang.Runtime.toString(input));
		//line 105 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	public final void newline()
	{
		//line 109 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		if (this.pretty) 
		{
			//line 110 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			this.output.add(haxe.lang.Runtime.toString("\n"));
			//line 110 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		}
		
	}
	
	
	public boolean hasChildren(haxe.root.Xml value)
	{
		//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		{
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (( ( value.nodeType != haxe.root.Xml.Document ) && ( value.nodeType != haxe.root.Xml.Element ) )) 
			{
				//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, expected Element or Document but found " + _Xml.XmlType_Impl_.toString(value.nodeType) ))) );
			}
			
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			int _g_current = 0;
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			haxe.root.Array<haxe.root.Xml> _g_array = value.children;
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			while (( _g_current < _g_array.length ))
			{
				//line 115 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				haxe.root.Xml child = _g_array.__get(_g_current++);
				//line 116 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				switch (child.nodeType)
				{
					case 0:
					case 1:
					{
						//line 118 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						return true;
					}
					
					
					case 2:
					case 3:
					{
						//line 120 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (( ( child.nodeType == haxe.root.Xml.Document ) || ( child.nodeType == haxe.root.Xml.Element ) )) 
						{
							//line 120 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( "Bad node type, unexpected " + _Xml.XmlType_Impl_.toString(child.nodeType) ))) );
						}
						
						//line 120 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (( haxe.root.StringTools.ltrim(child.nodeValue).length() != 0 )) 
						{
							//line 121 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return true;
						}
						
						//line 120 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					default:
					{
						//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
				}
				
			}
			
		}
		
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		{
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (( field != null )) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				switch (field.hashCode())
				{
					case -980096906:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("pretty")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.pretty = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return value;
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case -1005512447:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("output")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.output = ((haxe.root.StringBuf) (value) );
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return value;
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		{
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (( field != null )) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				switch (field.hashCode())
				{
					case 239016633:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("hasChildren")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasChildren")) );
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case -1005512447:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("output")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return this.output;
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case 1845922196:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("newline")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "newline")) );
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case -980096906:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("pretty")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return this.pretty;
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case 113399775:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("write")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "write")) );
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case -1406504319:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("writeNode")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeNode")) );
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		{
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			boolean __temp_executeDef1 = true;
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (( field != null )) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				switch (field.hashCode())
				{
					case 239016633:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("hasChildren")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							return this.hasChildren(((haxe.root.Xml) (dynargs[0]) ));
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case -1406504319:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("writeNode")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.writeNode(((haxe.root.Xml) (dynargs[0]) ), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case 1845922196:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("newline")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.newline();
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
					case 113399775:
					{
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						if (field.equals("write")) 
						{
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							__temp_executeDef1 = false;
							//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
							this.write(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
			if (__temp_executeDef1) 
			{
				//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		baseArr.push("pretty");
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		baseArr.push("output");
		//line 29 "C:\\HaxeToolkit\\haxe\\std\\haxe\\xml\\Printer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


