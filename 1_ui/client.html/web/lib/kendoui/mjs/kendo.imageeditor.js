/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.dropdownlist.js";import"./kendo.toolbar.js";import"./kendo.core.js";import"./kendo.form.js";import"./kendo.html.button.js";import"./kendo.buttongroup.js";import"./kendo.draganddrop.js";import"./kendo.upload.js";!function(e,t){var o=window.kendo,i=e.extend,a=o.Class,n=".k-imageeditor-pane",r="k-imageeditor-pane-form",d="k-imageeditor-pane-button",s="k-imageeditor-pane-confirm-button",m="k-imageeditor-crop-overlay",l="k-imageeditor-crop",c="k-resize-handle",h="k-resize-",g=function(e){return Math.round(1e3*e)/1e3},p=a.extend({init:function(t){var o=this;o.imageeditor=t,o.imageeditor.currentPaneTool&&o.imageeditor.currentPaneTool.destroy(),o.element=e("<div role='form' aria-label='Image edit pane.'></div>").addClass(r)},open:function(){var e=this,t=e.imageeditor,a=t.options.messages.common;t.paneWrapper.append(e.element),e.formWidget=new o.ui.Form(e.element,i(e.formSettings(),{buttonsTemplate:()=>o.html.renderButton(`<button class='${d} ${s}' data-action='confirm'>${a.confirm}</button>`,{icon:"check",themeColor:"primary"})+o.html.renderButton(`<button class='${d}' data-action='cancel'>${a.cancel}</button>`,{icon:"cancel-outline"})})),e.bindButtonEvents(),t.paneWrapper.show(),t.currentPaneTool=e},bindButtonEvents:function(){var e=this,t=e.formWidget.element.find("."+d);e._clickHandler=e._click.bind(e),t.on("click"+n,e._clickHandler)},_click:function(t){var o=e(t.target).closest("."+d).data("action");this[o]&&this[o]()},cancel:function(){this.imageeditor.toolbar.element.find("[tabindex=0]").trigger("focus"),this.destroy()},confirm:function(){window.console.error("Pane's confirm method is not implemented!"),this.destroy()},refresh:function(){},destroy:function(){var e=this,t=e.imageeditor;e.formWidget.element.find("."+d).off(n),e.formWidget.destroy(),t.paneWrapper.html(""),t.paneWrapper.hide(),delete t.currentPaneTool}}),u=p.extend({init:function(e){var t=this;p.fn.init.call(t,e),t.buildCropModel(),t.canvasUI()},confirm:function(){var e=this,t=e.formWidget._model.toJSON();e.destroy(),e.imageeditor.executeCommand({command:"CropImageEditorCommand",options:t})},formSettings:function(){var e=this,t=e.imageeditor.options.messages.panes.crop,o=e.imageeditor.options.messages.common,i=t.aspectRatioItems,a=[];if(i)for(var n in i)a.push({value:n,text:i[n]});else a=[{value:"originalRatio",text:"Original ratio"},{value:"1:1",text:"1:1 (Square)"},{value:"4:5",text:"4:5 (8:10)"},{value:"5:7",text:"5:7"},{value:"2:3",text:"2:3 (4:6)"},{value:"16:9",text:"16:9"}];return{formData:e._model,change:e.onChange.bind(e),items:[{type:"group",label:t.title||"Crop Image",layout:"grid",grid:{cols:2,gutter:"0 8px"},items:[{label:t.aspectRatio||"Aspect ratio:",field:"aspectRatio",editor:"DropDownList",editorOptions:{dataValueField:"value",dataTextField:"text",dataSource:a},colSpan:2},{label:t.orientation,field:"orientation",editor:e._orientationEditor.bind(e),colSpan:2},{label:o.width||"Width:",field:"width",attributes:{style:"max-width: 100px;"},editor:"NumericTextBox",editorOptions:{format:"n0",max:e._model.width,min:0},colSpan:1},{label:o.height||"Height:",field:"height",attributes:{style:"max-width: 100px;"},editor:"NumericTextBox",editorOptions:{format:"n0",max:e._model.height,min:0},colSpan:1},{label:o.lockAspectRatio||"Lock aspect ratio",field:"lockAspectRatio",colSpan:2}]}]}},_orientationEditor:function(t,o){var i=this.imageeditor.options.messages.panes.crop,a=o.model[o.field];this._orientationWidget=e("<div name='"+o.field+"'></div>").appendTo(t).kendoButtonGroup({items:[{text:i.portrait||"Portrait",attributes:{"data-value":"portrait"},selected:"portrait"===a},{text:i.landscape||"Landscape",attributes:{"data-value":"landscape"},selected:"landscape"===a}],select:function(e){var t=e.sender.wrapper.find(".k-selected").data("value");o.model.set(o.field,t)}}).data("kendoButtonGroup")},buildCropModel:function(){var e=this.imageeditor.getCanvasElement(),t=e.width,o=e.height;this._model={top:0,left:0,aspectRatio:"originalRatio",width:t,height:o,orientation:t-o<0?"portrait":"landscape",lockAspectRatio:!0}},canvasUI:function(){for(var t=this,i=t.imageeditor,a=t.imageeditor.canvasContainer,n=e("<div></div>").addClass(m),r=e("<div></div>").addClass(l),d="<span class='"+c+"'></span>",s=["nw","n","ne","w","e","sw","s","se"],g=i.getZoomLevel(),p=0;p<s.length;p++){var u=e(d).addClass(h+s[p]).attr("data-orientation",s[p]);t._initResizeHandle(u),r.append(u)}t.cropElement=r,t._canvasUI=n.append(r).appendTo(a);var f=Math.round(t._model.width*g),v=Math.round(t._model.height*g),w=parseInt(t.cropElement.css("border-top-width"),10);t.cropElement.css({width:f,height:v,backgroundImage:"url('"+i._image.src+"')",backgroundSize:o.format("{0}px {1}px",f,v),backgroundClip:"content-box",backgroundPosition:o.format("-{0}px -{0}px",w)}),t.cropElement.kendoDraggable({ignore:"."+c,drag:function(e){t._adjustTopLeft(e.target.offsetTop+e.y.delta,e.target.offsetLeft+e.x.delta)}})},refresh:function(){var e=this,t=e.formWidget._model,i=e.imageeditor.getZoomLevel(),a=Math.round(t.width*i),n=Math.round(t.height*i),r=Math.round(t.top*i),d=Math.round(t.left*i),s=parseInt(e.cropElement.css("border-top-width"),10);e.cropElement.css({top:r,left:d,width:a,height:n,backgroundSize:o.format("{0}px {1}px",e._model.width*i,e._model.height*i),backgroundPosition:o.format("-{0}px -{1}px",d+s,r+s)})},_initResizeHandle:function(t){var o=this;t.kendoDraggable({drag:function(t){var i=e(t.sender.element),a=o.formWidget._model,n=o._model,r=i.data("orientation"),d={},s=o.imageeditor.getZoomLevel(),m=a.left*s,l=a.top*s;r.indexOf("w")>=0?(d.left=o.cropElement[0].offsetLeft+t.x.delta,d.width=o.cropElement[0].offsetWidth-t.x.delta):r.indexOf("e")>=0&&(d.width=o.cropElement[0].offsetWidth+t.x.delta),r.indexOf("n")>=0?(d.top=o.cropElement[0].offsetTop+t.y.delta,d.height=o.cropElement[0].offsetHeight-t.y.delta):r.indexOf("s")>=0&&(d.height=o.cropElement[0].offsetHeight+t.y.delta),d.width&&(d.left||m)+d.width<=n.width*s&&a.set("width",Math.round(d.width/s)),d.height&&(d.top||l)+d.height<=n.height*s&&a.set("height",Math.round(d.height/s)),(d.top||d.left)&&o._adjustTopLeft(d.top,d.left)}})},_adjustTopLeft:function(e,t,o){var i=this,a=o||i.formWidget._model,n=i.formWidget._model,r=i._model,d=i.imageeditor.getZoomLevel();e>=0&&e/d+a.height<=r.height&&n.set("top",Math.round(e/d)),t>=0&&t/d+a.width<=r.width&&n.set("left",Math.round(t/d))},onChange:function(e){var t=this,a=t.imageeditor.getZoomLevel(),n=e.sender._model,r=t._model,d=r.width,s=r.height,m=(r.width,r.height),l=t._gcd(r.width,r.height);if(m=r.width/l+":"+r.height/l,"aspectRatio"===e.field&&"originalRatio"===e.value)n.set("top",0),n.set("left",0),n.set("orientation",r.orientation),n.set("width",r.width),n.set("height",r.height);else if("orientation"===e.field){var c=i({},n,{width:n.height,height:n.width}),h=t._calcSize(c,m,d,s);n.set("width",h.width),n.set("height",h.height),t._orientationWidget.select("portrait"===e.value?0:1)}else if(n.lockAspectRatio){var g=e.field,p=t._calcSize(n,m,d,s,g);n.set("width",p.width),n.set("height",p.height)}var u=Math.round(n.width*a),f=Math.round(n.height*a),v=Math.round(n.top*a),w=Math.round(n.left*a),x=parseInt(t.cropElement.css("border-top-width"),10);t.cropElement.css({top:v,left:w,width:u,height:f,backgroundPosition:o.format("-{0}px -{1}px",w+x,v+x)})},_calcSize:function(e,t,o,i,a){var n=Math.min(e.width,o),r=Math.min(e.height,i),d="portrait"===e.orientation,s=e.aspectRatio;s.indexOf(":")<0&&(s=t),s=s.split(":").map((function(e){return parseInt(e,10)}));var m=d?Math.min(s[0],s[1]):Math.max(s[0],s[1]),l=d?Math.max(s[0],s[1]):Math.min(s[0],s[1]),c=g(m/l),h=g(n/r),p={width:Math.round(r*c),height:Math.round(n/c)};return"width"===a?{width:n,height:p.height}:"height"===a?{width:p.width,height:r}:(h>c?n=p.width:h<c&&(r=p.height),{width:n,height:r})},_gcd:function(e,t){return 0===t?e:this._gcd(t,e%t)},destroy:function(){o.destroy(this._canvasUI),this._canvasUI.remove(),p.fn.destroy.call(this)}}),f=p.extend({init:function(e){p.fn.init.call(this,e),this.buildResizeModel()},confirm:function(){var e=this,t=e._model.width,o=e._model.height,i=e.formWidget._model.toJSON();"percents"===i.measure&&(i.width=t*(i.width/100),i.height=o*(i.height/100)),e.imageeditor.executeCommand({command:"ResizeImageEditorCommand",options:i}),e.destroy()},formSettings:function(){var e=this,t=e.imageeditor.options.messages.panes.resize,o=e.imageeditor.options.messages.common;return{formData:e._model,change:e.onChange.bind(e),items:[{type:"group",label:t.title||"Resize image",layout:"grid",grid:{cols:2,gutter:"0 8px"},items:[{label:o.width||"Width:",field:"width",attributes:{style:"max-width: 100px;"},editor:"NumericTextBox",editorOptions:{format:"n0",min:0},colSpan:1},{field:"measureW",editor:"DropDownList",attributes:{style:"max-width: 100px;"},label:{text:"&nbsp;",encoded:!1},editorOptions:{dataTextField:"text",dataValueField:"value",dataSource:[{text:t.pixels||"Pixels",value:"pixels"},{text:t.percents||"Percents",value:"percents"}]},colSpan:1},{label:o.height||"Height:",field:"height",attributes:{style:"max-width: 100px;"},editor:"NumericTextBox",editorOptions:{format:"n0",min:0},colSpan:1},{field:"measureH",label:{text:"&nbsp;",encoded:!1},attributes:{style:"max-width: 100px;"},editor:"DropDownList",editorOptions:{dataTextField:"text",dataValueField:"value",dataSource:[{text:t.pixels||"Pixels",value:"pixels"},{text:t.percents||"Percents",value:"percents"}]},colSpan:1},{label:o.lockAspectRatio||"Lock aspect ratio",field:"lockAspectRatio",colSpan:2}]}]}},buildResizeModel:function(){var e=this.imageeditor.getCanvasElement(),t=e.width,o=e.height;this._model={width:t,height:o,measure:"pixels",measureW:"pixels",measureH:"pixels",lockAspectRatio:!0,ratio:g(t/o)}},onChange:function(e){var t=this,o=e.sender._model,i=o.lockAspectRatio;"measureW"===e.field||"measureH"===e.field?(o.set("measureW",e.value),o.set("measureH",e.value),o.set("measure",e.value)):"measure"===e.field?t.resetNumericsTo(e.value):"width"===e.field&&i&&!t._preventChange?o.set("height",o.width/o.ratio):"height"===e.field&&i&&!t._preventChange&&o.set("width",o.height*o.ratio),o.set("ratio",g(o.width/o.height))},resetNumericsTo:function(e){var t=this,o=t._model.width,i=t._model.height,a=t.formWidget,n=a._model,r=a.element.find("[name=width]").data("kendoNumericTextBox"),d=a.element.find("[name=height]").data("kendoNumericTextBox"),s="percents"===e,m={percents:{format:"#\\%"},pixels:{format:"n0"}};r.setOptions(m[e]),d.setOptions(m[e]),t._preventChange=!0,n.set("width",s?o/r.value()*100:o*(r.value()/100)),n.set("height",s?i/d.value()*100:i*(d.value()/100)),t._preventChange=!1}});i(o.ui,{imageeditor:{ImageEditorPane:p,panes:{crop:u,resize:f}}})}(window.kendo.jQuery),function(e,t){var o=window.kendo,i=o.ui.imageeditor,a=e.extend,n=o.Class.extend({init:function(e){this.options=a({},e,this.options),this.imageeditor=e.imageeditor}}),r=n.extend({init:function(e){n.fn.init.call(this,e)},exec:function(){var e=this.imageeditor,t=new i.panes[this.options.value](e);t.open(),t.element.find(":kendoFocusable").first().trigger("focus")}}),d=n.extend({options:{zoomStep:.05,spacing:20},init:function(e){n.fn.init.call(this,e)},exec:function(){var t,o=this,i=o.options.value,a=o.imageeditor,n=a._image.height,r=a.getZoomLevel(),d="zoomIn"===i||"zoomOut"===i;isNaN(i)?"string"==typeof i&&(i=o._processStringValue(i,r)):i=parseFloat(i),(t=Math.round(n*i))>0&&(e(a._canvas).css("height",t),a._zoomLevel=i),a.currentPaneTool&&a.currentPaneTool.refresh(),d&&a.toolbar.element.find("[tabindex=0]").trigger("focus")},_processStringValue:function(e,t){var o=this.options,i=this.imageeditor,a=i._image.height,n=i.canvasWrapper.height()-o.spacing,r=o.zoomStep;switch(e){case"zoomIn":return t+r;case"zoomOut":return t-r;case"fitToScreen":return Math.round(n/a*100)/100;default:return 1}}}),s=n.extend({init:function(e){n.fn.init.call(this,e)},exec:function(){var e=this.options,t=this.imageeditor,o=t.getCanvasElement(),i=t.getCurrent2dContext(),a=i.getImageData(e.left,e.top,e.width,e.height);i.clearRect(0,0,o.width,o.height),o.width=e.width,o.height=e.height,i.putImageData(a,0,0),t.drawImage(o.toDataURL()).done((function(e){t.drawCanvas(e),t.toolbar.element.find("[tabindex=0]").trigger("focus")})).fail((function(e){t.trigger("error",e)}))}}),m=n.extend({init:function(e){n.fn.init.call(this,e)},exec:function(){var e=this.options,t=this.imageeditor,o=t.getCanvasElement(),i=t.getCurrent2dContext(),a=t.getCurrentImage();i.clearRect(0,0,o.width,o.height),o.width=e.width,o.height=e.height,i.drawImage(a,0,0,e.width,e.height),t.drawImage(o.toDataURL()).done((function(e){t.drawCanvas(e),t.toolbar.element.find("[tabindex=0]").trigger("focus")})).fail((function(e){t.trigger("error",e)}))}}),l=n.extend({exec:function(){var e=this.imageeditor,t=e.getCanvasElement(),o=e.getCurrent2dContext(),i=e.undoStack.pop();i&&(e.redoStack.push(e.getCurrentImage()),delete e._image,o.clearRect(0,0,t.width,t.height),t.width=i.width,t.height=i.height,o.drawImage(i,0,0,i.width,i.height),e.drawImage(t.toDataURL()).done((function(t){e.drawCanvas(t),e.toolbar.element.find("[tabindex=0]").trigger("focus")})).fail((function(t){e.trigger("error",t)})))}}),c=n.extend({exec:function(){var e=this.imageeditor,t=e.getCanvasElement(),o=e.getCurrent2dContext(),i=e.redoStack.pop();i&&(e.undoStack.push(e.getCurrentImage()),delete e._image,o.clearRect(0,0,t.width,t.height),t.width=i.width,t.height=i.height,o.drawImage(i,0,0,i.width,i.height),e.drawImage(t.toDataURL()).done((function(t){e.drawCanvas(t),e.toolbar.element.find("[tabindex=0]").trigger("focus")})).fail((function(t){e.trigger("error",t)})))}}),h=n.extend({exec:function(){var e=this.imageeditor,t=e.getCanvasElement();o.saveAs(a({},e.options.saveAs,{dataURI:t.toDataURL()})),e.toolbar.element.find("[data-command=SaveImageEditorCommand]").trigger("focus")}}),g=n.extend({exec:function(){var t=this,o=t.imageeditor,i=o._upload;if(!i){var a=e("<input type='file' />");a.kendoUpload({select:t.onSelect.bind(t),error:t.onError.bind(t),multiple:!1,validation:{allowedExtensions:[".jpg",".jpeg",".gif",".png",".bmp",".tiff",".webp"]}}),o._upload=i=a.getKendoUpload()}i.element.click()},onSelect:function(e){var t=this.imageeditor,o=e.files[0].rawFile,i=new FileReader;i.addEventListener("load",(function(){t.drawImage(i.result).done((function(e){t.trigger("imageLoaded",{image:e})||(t.drawCanvas(e),t._initUndoRedoStack(),t._toggleTools())})).fail((function(e){t.trigger("error",e)}))}),!1),o&&i.readAsDataURL(o)},onError:function(e){this.imageeditor.trigger("error",e)}});a(o.ui.imageeditor,{ImageEditorCommand:n,commands:{OpenPaneImageEditorCommand:r,ZoomImageEditorCommand:d,CropImageEditorCommand:s,ResizeImageEditorCommand:m,UndoImageEditorCommand:l,RedoImageEditorCommand:c,SaveImageEditorCommand:h,OpenImageEditorCommand:g}})}(window.kendo.jQuery);var __meta__={id:"imageeditor",name:"ImageEditor",category:"web",depends:["core","toolbar","dropdownlist"]};!function(e,t){var o=window.kendo,i=e.extend,a=e.isPlainObject,n=o.ui.Widget,r=o.ui,d=".kendoImageEditor",s=o._outerHeight,m="error",l="imageLoaded",c="imageRendered",h="execute",g=e=>`<canvas role='img' aria-label='${e}'>Canvas element</canvas>`,p="k-widget k-imageeditor",u="k-imageeditor-header",f="k-imageeditor-toolbar",v="k-imageeditor-action-pane",w="k-imageeditor-content",x="k-imageeditor-canvas-container",b="k-imageeditor-canvas",C=n.extend({init:function(t,i){var a=this;n.fn.init.call(a,t,i),i=e.extend(!0,{},i),a._wrapper(),a._renderHeader(),a._contentWrapper(),a._keyHandler(),i.imageUrl&&a._drawCanvas(),a._initUndoRedoStack(),a._toggleTools(),o.notify(a)},options:{name:"ImageEditor",width:"100%",height:570,imageUrl:"",imageLabel:"",toolbar:{},saveAs:{fileName:"image.png"},messages:{toolbar:{open:"Open Image",save:"Save Image",undo:"Undo",redo:"Redo",crop:"Crop",resize:"Resize",zoomIn:"Zoom In",zoomOut:"Zoom Out",zoomDropdown:"Zoom options",zoomActualSize:"Show actual size",zoomFitToScreen:"Fit to screen"},panes:{crop:{title:"Crop Image",aspectRatio:"Aspect Ratio:",aspectRatioItems:{originalRatio:"Original ratio","1:1":"1:1 (Square)","4:5":"4:5 (8:10)","5:7":"5:7","2:3":"2:3 (4:6)","16:9":"16:9"},orientation:"Orientation:",portrait:"Portrait",landscape:"Landscape"},resize:{title:"Resize image",pixels:"Pixels",percents:"Percents"}},common:{width:"Width:",height:"Height:",cancel:"Cancel",confirm:"Confirm",lockAspectRatio:"Lock aspect ratio"}}},events:[m,l,c,h],defaultTools:{open:{type:"button",icon:"upload",name:"open",command:"OpenImageEditorCommand",showText:"overflow"},save:{type:"button",icon:"download",name:"save",command:"SaveImageEditorCommand",showText:"overflow",toggleCondition:"canExport"},separator:{type:"separator"},undo:{type:"button",icon:"undo",name:"undo",command:"UndoImageEditorCommand",showText:"overflow",toggleCondition:"undo"},redo:{type:"button",icon:"redo",name:"redo",command:"RedoImageEditorCommand",showText:"overflow",toggleCondition:"redo"},separator1:{type:"separator"},crop:{type:"button",icon:"crop",name:"crop",command:"OpenPaneImageEditorCommand",options:"crop",showText:"overflow",toggleCondition:"canExport"},resize:{type:"button",icon:"image-resize",name:"resize",command:"OpenPaneImageEditorCommand",options:"resize",showText:"overflow",toggleCondition:"canExport"},zoomIn:{type:"button",icon:"zoom-in",name:"zoomIn",command:"ZoomImageEditorCommand",showText:"overflow",options:"zoomIn",toggleCondition:"enable"},zoomOut:{type:"button",icon:"zoom-out",name:"zoomOut",command:"ZoomImageEditorCommand",showText:"overflow",options:"zoomOut",toggleCondition:"enable"},zoomDropdown:{type:"component",name:"zoomDropdown",command:"ZoomImageEditorCommand",toggleCondition:"enable",overflow:"never",component:"DropDownList",componentOptions:{placeholder:"Search",icon:"search",dataSource:[{name:"zoomActualSize",icon:"zoom-actual-size",value:"actualSize"},{name:"zoomFitToScreen",icon:"zoom-best-fit",value:"fitToScreen"}],dataTextField:"text",dataValueField:"value",valuePrimitive:!0,template:({icon:e,text:t})=>`${o.ui.icon(o.htmlEncode(e))} ${o.htmlEncode(t)}`,commandOn:"change",optionLabel:"Zoom options",dataBound:e=>{e.sender.list.find(".k-list-optionlabel").hide()}}}},_wrapper:function(){var e=this,t=e.options,i=t.width,a=t.height;e.wrapper=e.element.addClass(p),i&&e.wrapper.width(i),a&&e.wrapper.height(a),e._resizeHandler=o.onResize((function(){e.resize(!0)}))},_renderHeader:function(){var t=this,o=t.options;t.header=e("<div />").addClass(u),t.wrapper.append(t.header),o.toolbar&&(t._initToolbar(),t.toolbar._tabIndex())},_initToolbar:function(){var t=this,a=t.options,n=e("<div></div>").addClass(f),r=i({},a.toolbar),d=r.items?r.items:Object.keys(t.defaultTools);return r.tools=d,r.defaultTools=t.defaultTools,r.parentMessages=t.options.messages.toolbar,t.header.append(n),t.toolbar=new o.ui.ToolBar(n,r),t.options.toolbar=t.toolbar.options,t.toolbar.toggleTools(),t.toolbar.bind("click",t._toolbarClick.bind(t)),t.toolbar.bind("toggle",t._toolbarClick.bind(t)),t.toolbar.bind("change",t._toolbarClick.bind(t)),t.toolbar},_toolbarClick:function(t){var o=e(t.target).data("command"),i=e(t.target).data("options");i=e(t.target).val()||i,o&&this.executeCommand({command:o,options:i})},_contentWrapper:function(){var t=this,o=e("<div></div>").addClass(w),i=e("<div></div>").addClass(x),a=e("<div></div>").addClass(b),n=e("<div></div>").addClass(v).hide(),r=s(t.header);t.canvasWrapper=i,t.canvasContainer=a,t.paneWrapper=n,i.append(a),o.height(s(t.wrapper)-r),o.append(i).append(n),t.wrapper.append(o)},_keyHandler:function(){var e=this,t=!1;e.wrapper.on("keydown"+d,(function(o){if(o.ctrlKey){switch(o.keyCode){case 48:e.executeCommand({command:"ZoomImageEditorCommand",options:"fitToScreen"}),t=!0;break;case 189:e.executeCommand({command:"ZoomImageEditorCommand",options:"zoomOut"}),t=!0;break;case 187:e.executeCommand({command:"ZoomImageEditorCommand",options:"zoomIn"}),t=!0;break;case 90:e.executeCommand({command:"UndoImageEditorCommand"}),t=!0;break;case 89:e.executeCommand({command:"RedoImageEditorCommand"}),t=!0}t&&o.preventDefault()}}))},_drawCanvas:function(){var e=this,t=e.options.imageUrl;e.drawImage(t).done((function(t){e.trigger(l,{image:t})||e.drawCanvas(t)})).fail((function(t){e.trigger(m,t)}))},_initUndoRedoStack:function(){this.undoStack=[],this.redoStack=[]},_toggleTools:function(){var e=this,t=e.redoStack.length>0,o=e.undoStack.length>0,i=!!e._image,a=!0;try{e._canvas.toDataURL()}catch(e){a=!1}e.toolbar&&e.toolbar.toggleTools({redo:t,undo:o,enable:i,canExport:a})},drawImage:function(t){var i=this,a=new e.Deferred,n=new Image;return n.onload=function(){o.ui.progress(i.canvasContainer,!1),a.resolve(n)},n.onerror=function(){o.ui.progress(i.canvasContainer,!1),a.reject(arguments)},o.ui.progress(i.canvasContainer,!0),n.src=t,a.promise()},drawCanvas:function(t){var i=this,a=e(o.template(g)(i.options.imageLabel))[0],n=a.getContext("2d");i._canvas&&e(i._canvas).remove(),i._image&&i.undoStack.push(i._image),i._canvas=a,i._ctx=n,i._image=t,a.width=t.width,a.height=t.height,n.drawImage(t,0,0),i.canvasContainer.append(a),t.height>i.canvasWrapper.height()?i.executeCommand({command:"ZoomImageEditorCommand",options:"fitToScreen"}):i.executeCommand({command:"ZoomImageEditorCommand",options:i.getZoomLevel()}),i.trigger(c,{canvas:a,ctx:n,image:t}),i._toggleTools()},getCanvasElement:function(){return this._canvas},getCurrent2dContext:function(){return this._ctx},getCurrentImage:function(){return this._image},executeCommand:function(e){var t=e.command,o=i({imageeditor:this},a(e.options)?e.options:{value:e.options}),n=new r.imageeditor.commands[t](o);if(!this.trigger(h,e))return this._toggleTools(),n.exec()},getZoomLevel:function(){return this._zoomLevel||1},destroy:function(){var e=this;e.element.off(d),e.currentPaneTool&&e.currentPaneTool.destroy(),e.toolbar&&e.toolbar.destroy(),e._upload&&e._upload.destroy(),n.fn.destroy.call(e)}});r.plugin(C)}(window.kendo.jQuery);
//# sourceMappingURL=kendo.imageeditor.js.map