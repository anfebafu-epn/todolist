/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.checkbox.js";import"./kendo.dropdownlist.js";import"./kendo.datepicker.js";import"./kendo.numerictextbox.js";import"./kendo.validator.js";import"./kendo.binder.js";import"./kendo.icons.js";var __meta__={id:"editable",name:"Editable",category:"framework",depends:["checkbox","dropdownlist","datepicker","numerictextbox","validator","binder","icons"],hidden:!0};!function(t,e){var i=window.kendo,o=i.ui,n=o.Widget,a=t.extend,r=i.isFunction,l=t.isPlainObject,d=t.inArray,s=/("|\%|'|\[|\]|\$|\.|\,|\:|\;|\+|\*|\&|\!|\#|\(|\)|<|>|\=|\?|\@|\^|\{|\}|\~|\/|\||`)/g,u="change",p="equalSet",c=["url","email","number","date","boolean"];function f(t){return(t=null!=t?t:"").type||i.type(t)||"string"}function v(t){var e,o,n=(t.model.fields||t.model)[t.field],a=f(n),s=n?n.validation:{},u=n?n.attributes:{},p=i.attr("type"),v=i.attr("bind"),m={id:t.id||t.field,name:t.field,title:t.title?t.title:t.field};for(e in s){if(o=s[e],d(e,c)>=0)m[p]=e;else if(!r(o)){var k=i.getCulture();if("number"==typeof o&&k.name.length){var b=k.numberFormat,x=o.toString().replace(".",b["."]);m[e]=x}else m[e]=l(o)?o.value||e:o}m[i.attr(e+"-msg")]=o.message,m.autocomplete="off"}for(var h in u)m[h]=u[h];return d(a,c)>=0&&(m[p]=a),m[v]=("boolean"===a?"checked:":"value:")+t.field,m}function m(t,e){var i=t.attr("id");return i&&(e.id=i,t.removeAttr("id")),e}var k=["AutoComplete","CheckBox","CheckBoxGroup","ColorGradient","ColorPicker","ColorPalette","ComboBox","DateInput","DatePicker","DateTimePicker","DropDownTree","Editor","FlatColorPicker","MaskedTextBox","MultiColumnComboBox","MultiSelect","NumericTextBox","RadioGroup","Rating","Slider","Switch","TimePicker","DropDownList","TextBox","TextArea","Captcha","Signature","TimeDurationPicker"],b={hidden:function(e,i){var o=v(i);t('<input type="hidden"/>').attr(o).appendTo(e)},number:function(e,o){var n=v(o);t('<input type="text"/>').attr(n).appendTo(e).kendoNumericTextBox(a({},o.editorOptions,{format:o.format})),t("<span "+i.attr("for")+'="'+o.field+'" class="k-invalid-msg k-hidden"/>').appendTo(e)},date:function(e,o){var n=v(o),r=o.format;r&&(r=i._extractFormat(r)),n[i.attr("format")]=r,t('<input type="text"/>').attr(n).appendTo(e).kendoDatePicker(a({},o.editorOptions,{format:o.format})),t("<span "+i.attr("for")+'="'+o.field+'" class="k-invalid-msg k-hidden"/>').appendTo(e)},string:function(e,i){var o=v(i);t('<input type="text"/>').attr(o).appendTo(e).kendoTextBox(i.editorOptions)},boolean:function(e,i){var o=v(i);g(t('<input type="checkbox" />').attr(o).kendoCheckBox(i.editorOptions).appendTo(e),e,i)},values:function(e,o){var n=v(o),a=i.stringify(function(t){var e,i,o,n,a,r;if(t&&t.length)for(r=[],e=0,i=t.length;e<i;e++)a=(o=t[e]).text||o.value||o,n=null==o.value?o.text||o:o.value,r[e]={text:a,value:n};return r}(o.values));t("<select "+i.attr("text-field")+'="text"'+i.attr("value-field")+'="value"'+i.attr("source")+"='"+(a?a.replace(/\'/g,"&apos;"):a)+"'"+i.attr("size")+'="'+o.editorOptions.size+'"'+i.attr("role")+'="dropdownlist"/>').attr(n).appendTo(e),t("<span "+i.attr("for")+'="'+o.field+'" class="k-invalid-msg  k-hidden"/>').appendTo(e)},kendoEditor:function(e,i){var o=v(i),n=i.editor,a="kendo"+n,r=i.editorOptions,l=function(t,e){if(t.length)return"DropDownTree"===t&&e&&e.checkboxes||"MultiSelect"===t?"<select />":"RadioGroup"===t||"CheckBoxGroup"===t?"<ul />":"Signature"===t?"<div></div>":"Editor"===t||"TextArea"===t?"<textarea />":"<input />"}(n,r);g(t(l).attr(o).appendTo(e)[a](r),e,i)}},x={number:function(e,i){var o=v(i);o=m(e,o),t('<input type="number"/>').attr(o).appendTo(e)},date:function(e,i){var o=v(i);o=m(e,o),t('<input type="date"/>').attr(o).appendTo(e)},string:function(e,i){var o=v(i);o=m(e,o),t('<input type="text" />').attr(o).appendTo(e)},boolean:function(e,i){var o=v(i);o=m(e,o),t('<input type="checkbox" />').attr(o).appendTo(e)},values:function(e,i){var o=v(i),n=i.values,a=t("<select />");for(var r in o=m(e,o),n)t('<option value="'+n[r].value+'">'+n[r].text+"</option>").appendTo(a);a.attr(o).appendTo(e)}};function h(t,e){var i,o,n=t&&t.validation||{};for(i in n)o=n[i],l(o)&&o.value&&(o=o.value),r(o)&&(e[i]=o)}function g(e,i,o){(o&&o.shouldRenderHidden||!1)&&(e.val(!0),i.append(t("<input type='hidden' name='"+o.field+"' value='false' data-skip='true' data-validate='false'/>")))}var y=n.extend({init:function(t,e){var i=this;e.target&&(e.$angular=e.target.options.$angular,e.target.pane&&(i._isMobile=!0)),n.fn.init.call(i,t,e),i._validateProxy=i._validate.bind(i),i.refresh()},events:[u],options:{name:"Editable",editors:b,mobileEditors:x,clearContainer:!0,validateOnBlur:!0,validationSummary:!1,errorTemplate:({message:t})=>'<div class="k-tooltip k-tooltip-error k-validator-tooltip">'+i.ui.icon({icon:"exclamation-circle",iconClass:"k-tooltip-icon"})+`<span class="k-tooltip-content">${t}</span><span class="k-callout k-callout-n"></span></div>`,skipFocus:!1,size:"medium"},editor:function(e,o){var n,r=this,d=r._isMobile?x:r.options.editors,u=l(e),p=u?e.field:e,c=r.options.model||{},v=u&&e.values?"values":f(o),m=u&&"string"==typeof e.editor&&"hidden"===e.editor,b=u&&!m&&e.editor,h=u&&-1!==t.inArray(e.editor,k),g=b?e.editor:d[m?"hidden":v],y=r.element.find("["+i.attr("container-for")+"="+p.replace(s,"\\$1")+"]");g=g||d.string,h?g=d.kendoEditor:b&&"string"==typeof e.editor&&(g=function(t){t.append(e.editor)}),u?(e.editorOptions||(e.editorOptions={}),e.editorOptions=a({},{size:r.options.size},e.editorOptions),n=e):n={field:p,editorOptions:{size:r.options.size}},g(y=y.length?y:r.element,a(!0,{},n,{model:c}))},_validate:function(e){var o,n=this,a=e.value,r=n._validationEventInProgress,l={},d=i.attr("bind"),p=e.field.replace(s,"\\$1"),c=new RegExp("(value|checked)\\s*:\\s*"+p+"\\s*(,|$)");l[e.field]=e.value,(o=t(":input["+d+'*="'+p+'"]',n.element).filter("["+i.attr("validate")+"!='false']").filter((function(){return c.test(t(this).attr(d))}))).length>1&&(o=o.filter((function(){var e=t(this);return!e.is(":radio")||e.val()==a})));try{n._validationEventInProgress=!0,(!n.validatable.validateInput(o)||!r&&n.trigger(u,{values:l}))&&e.preventDefault()}finally{n._validationEventInProgress=!1}},end:function(){return this.validatable.validate()},destroy:function(){var t=this;t.angular("cleanup",(function(){return{elements:t.element}})),n.fn.destroy.call(t),t.options.model.unbind("set",t._validateProxy),t.options.model.unbind(p,t._validateProxy),i.unbind(t.element),t.validatable&&t.validatable.destroy(),i.destroy(t.element),t.element.removeData("kendoValidator"),t.element.is("["+i.attr("role")+"=editable]")&&t.element.removeAttr(i.attr("role"))},refresh:function(){var e,o,n,a,r,d,s=this,u=s.options.fields||[],c=s._container=s.options.clearContainer?s.element.empty():s.element,f=s.options.model||{},v={};for(Array.isArray(u)||(u=[u]),e=0,o=u.length;e<o;e++)n=u[e],a=l(n)?n.field:n,h(r=(f.fields||f)[a],v),s.editor(n,r);if(s.options.target&&s.angular("compile",(function(){return{elements:c,data:c.map((function(){return{dataItem:f}}))}})),!o)for(a in d=f.fields||f)h(d[a],v);!function(e){e.find(":input:not(:button, .k-combobox .k-input, .k-checkbox-list .k-checkbox, .k-radio-list .k-radio, ["+i.attr("role")+"=listbox], ["+i.attr("role")+"=upload], ["+i.attr("skip")+"], [type=file]), ["+i.attr("role")+"=radiogroup]").each((function(){var e=i.attr("bind"),o=this.getAttribute(e)||"",n="checkbox"===this.type||"radio"===this.type?"checked:":"value:",a=this.getAttribute("name")===y.antiForgeryTokenName,r=this.attributes.name&&this.attributes.name.value;-1===o.indexOf(n)&&r&&!a&&(o+=(o.length?",":"")+n+r,t(this).attr(e,o))}))}(c),s.validatable&&s.validatable.destroy(),i.bind(c,s.options.model),s.options.validateOnBlur&&(s.options.model.unbind("set",s._validateProxy).bind("set",s._validateProxy),s.options.model.unbind(p,s._validateProxy).bind(p,s._validateProxy)),s.validatable=new i.ui.Validator(c,{validateOnBlur:s.options.validateOnBlur,validationSummary:s.options.validationSummary,errorTemplate:s.options.errorTemplate||undefined,rules:v}),s.options.skipFocus||(s._focusTimeout=setTimeout((()=>{s._focusEditor()}),1))},_focusEditor:function(){this._container.find(":kendoFocusable").eq(0).trigger("focus")}});y.antiForgeryTokenName="__RequestVerificationToken",o.plugin(y)}(window.kendo.jQuery);
//# sourceMappingURL=kendo.editable.js.map