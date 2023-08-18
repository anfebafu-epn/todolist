/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.core.js";import"./kendo.icons.js";var __meta__={id:"badge",name:"Badge",category:"web",description:"The Badge decorates avatars, navigation menus, or other components in the application when visual notification is needed",depends:["core","icons"]};!function(e,t){var n=window.kendo,o=n.ui.Widget,i=n.ui,s=({icon:t})=>n.ui.icon(e("<span class='k-badge-icon'></span>"),{icon:t}),a=({icon:e})=>`<span class='k-badge-icon k-svg-icon'>${e}</span>`,l=o.extend({init:function(e,t){var i=this;o.fn.init.call(i,e,t),i._content(),i._appearance(),n.notify(i)},destroy:function(){o.fn.destroy.call(this)},options:{name:"Badge",cutoutBorder:!1,data:{},fillMode:"solid",icon:"",max:1/0,position:"inline",align:"",rounded:"medium",roundings:{small:"sm",medium:"md",large:"lg",full:"full"},sizes:{small:"sm",medium:"md",large:"lg"},size:"medium",template:null,text:"",themeColor:"secondary",visible:!0,_classNames:[]},_content:function(){var e=this,t=e.options.text,o=e.options.template,i=e.options.data,s=e.options.icon;if(null!==o)return e._text=t,e._template=n.template(o).bind(e),void e.element.html(e._template(i));""===s?""===t?e.text(e.element.html()):e.text(t):e.icon(s)},_appearance:function(){var e=this;e._themeColor=e.options.themeColor,e._shape=e.options.shape,e._sizes=e.options.sizes,e._size=e.options.size,e._fillMode=e.options.fillMode,e._rounded=e.options.rounded,e._roundings=e.options.roundings,e._cutoutBorder=e.options.cutoutBorder,e._align=e.options.align,e._position=e.options.position,e._visible=e.options.visible,e._updateClassNames()},_updateClassNames:function(){var e=this,n=["k-badge"],o=e.options._classNames,i=e._themeColor,s=e._shape,a=e._sizes,l=e._size,d=a[l]===t?l:a[l],r=e._fillMode,p=e._rounded,u=e._roundings,m=u[p]===t?p:u[p],c=e._cutoutBorder,h=e._align,_=e._position,g=e._visible;e.element.removeClass((function(t,n){0===n.indexOf("k-")&&-1===o.indexOf(n)&&e.element.removeClass(n)})),"string"==typeof r&&""!==r&&n.push("k-badge-"+r),"string"==typeof i&&""!==i&&n.push("k-badge-"+r+"-"+i),"string"==typeof l&&""!==l&&n.push("k-badge-"+d),"string"==typeof p&&""!==p&&n.push("k-rounded-"+m),"string"==typeof s&&""!==s&&n.push("k-badge-"+s),"boolean"==typeof c&&!0===c&&n.push("k-badge-border-cutout"),"string"==typeof _&&""!==_&&n.push("k-badge-"+_),"string"==typeof _&&""!==_&&"inline"!==_&&"string"==typeof h&&2==h.split(" ").length&&n.push("k-"+h.replace(" ","-")),!1===g&&n.push("k-hidden"),e.element.addClass(n.join(" "))},setOptions:function(e){var t=this;t.element.removeClass((function(e,n){n.indexOf("k-")>=0&&t.element.removeClass(n)})),o.fn.setOptions.call(t,e),t._content(),t._appearance()},text:function(e){var n=this,o=n.options.max;if(0===arguments.length||e===t)return n._text;n._text=e,!0!==e&&!1!==e&&null!==e?"string"!=typeof e?"number"!=typeof e?"object"==typeof e&&"toString"in e&&n.element.html(e.toString()):e>o?n.element.html(o+"+"):n.element.html(e):n.element.html(e):n.element.html("")},icon:function(e){var o,i=this;return 0===arguments.length||e===t?i._icon:(i._icon=e,0===e.indexOf("<svg")?(o=n.template(a),void i.element.html(o({icon:e}))):(o=n.template(s),void i.element.html(o({icon:e}))))},themeColor:function(e){var n=this;if(0===arguments.length||e===t)return n._themeColor;n._themeColor=e,n._updateClassNames()},rounded:function(e){var n=this;if(0===arguments.length||e===t)return n._rounded;n._rounded=e,n._updateClassNames()},hide:function(){this._visible=!1,this._updateClassNames()},show:function(){this._visible=!0,this._updateClassNames()}});i.plugin(l)}(window.kendo.jQuery);
//# sourceMappingURL=kendo.badge.js.map
