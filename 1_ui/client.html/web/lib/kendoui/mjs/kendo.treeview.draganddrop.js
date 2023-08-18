/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.data.js";import"./kendo.draganddrop.js";var __meta__={id:"treeview.draganddrop",name:"Hierarchical Drag & Drop",category:"framework",depends:["core","draganddrop"],advanced:!0};!function(t,i){var o=window.kendo,e=o.ui,s=t.extend,n="visibility",r="k-drag-status",a=`<span class="${r}"></span>`,d="k-hover";e.HierarchicalDragAndDrop=o.Class.extend({init:function(i,n){this.element=i,this.hovered=i,this.options=s({dragstart:t.noop,drag:t.noop,drop:t.noop,dragend:t.noop},n),this._draggable=new e.Draggable(i,{ignore:"input,a:not(.k-in),textarea,.k-multiselect-wrap,select,button,a.k-button>.k-icon,button.k-button>.k-icon,span.k-toggle-icon,a.k-button>.k-svg-icon,button.k-button>.k-svg-icon",filter:n.filter,autoScroll:n.autoScroll,cursorOffset:{left:10,top:o.support.mobileOS?-40/o.support.zoomLevel():10},hint:this._hint.bind(this),dragstart:this.dragstart.bind(this),dragcancel:this.dragcancel.bind(this),drag:this.drag.bind(this),dragend:this.dragend.bind(this),$angular:n.$angular,holdToDrag:n.holdToDrag})},_hint:function(t){return"<div class='k-drag-clue'>"+a+this.options.hintText(t)+"</div>"},_removeTouchHover:function(){o.support.touch&&this.hovered&&(this.hovered.find("."+d).removeClass(d),this.hovered=!1)},_hintStatus:function(t){var i=this._draggable.hint.find(`.${r}`);t?(this.status=t,e.icon(i,{icon:t})):(this.status="",i.replaceWith(a))},dragstart:function(i){this.source=i.currentTarget.closest(this.options.itemSelector),this.options.dragstart(this.source)&&i.preventDefault(),this.options.reorderable?this.dropHint=t("<div class='k-drop-hint k-drop-hint-h'><div class='k-drop-hint-start'></div><div class='k-drop-hint-line'></div></div>").css(n,"hidden").appendTo(this.element):this.dropHint=t()},drag:function(i){var e,s,r,a,h,l,c,p,g,v,u,m=this.options,_=this.source,b=this.dropTarget=t(o.eventTarget(i)),f=b.closest(m.allowedContainers);f.length?_[0]==b[0]||m.contains(_[0],b[0])?u="cancel":(u="insert-middle",(e=(g=m.itemFromTarget(b)).item).length?(this._removeTouchHover(),s=o._outerHeight(e),a=g.content,m.reorderable?(h=s/(a.length>0?4:2),r=o.getOffset(e).top,l=i.y.location<r+h,c=r+s-h<i.y.location,p=a.length&&!l&&!c):(p=!0,l=!1,c=!1),this.hovered=!!p&&f,this.dropHint.css(n,p?"hidden":"visible"),this._lastHover&&this._lastHover[0]!=a[0]&&this._lastHover.removeClass(d),this._lastHover=a.toggleClass(d,p),p?u="plus":((v=e.position()).top+=l?0:s,this.dropHint.css(v)[l?"prependTo":"appendTo"](m.dropHintContainer(e)),l&&g.first&&(u="insert-top"),c&&g.last&&(u="insert-bottom"))):b[0]!=this.dropHint[0]&&(this._lastHover&&this._lastHover.removeClass(d),u=t.contains(this.element[0],f[0])?"cancel":"plus")):(u="cancel",this._removeTouchHover()),this.options.drag({originalEvent:i.originalEvent,source:_,target:b,pageY:i.y.location,pageX:i.x.location,status:u,setStatus:function(t){u=t}}),0!==u.indexOf("insert")&&this.dropHint.css(n,"hidden"),this._hintStatus(u)},dragcancel:function(){this.dropHint.remove()},dragend:function(t){var i,o,e,s="over",r=this.source,a=this.dropHint,h=this.dropTarget;"visible"==a.css(n)?(s=this.options.dropPositionFrom(a),i=a.closest(this.options.itemSelector)):h&&((i=h.closest(this.options.itemSelector)).length||(i=h.closest(this.options.allowedContainers))),o={originalEvent:t.originalEvent,source:r[0],destination:i[0],valid:"cancel"!=this.status,setValid:function(t){this.valid=t},dropTarget:h[0],position:s},e=this.options.drop(o),a.remove(),this._removeTouchHover(),this._lastHover&&this._lastHover.removeClass(d),o.valid&&!e?(this._draggable.dropped=!0,this.options.dragend({originalEvent:t.originalEvent,source:r,destination:i,position:s})):this._draggable.dropped=o.valid},destroy:function(){this._lastHover=this.hovered=null,this._draggable.destroy()}})}(window.kendo.jQuery);
//# sourceMappingURL=kendo.treeview.draganddrop.js.map