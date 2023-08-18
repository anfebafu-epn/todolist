/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.toggleinputbase.js";import"./kendo.html.input.js";var __meta__={id:"radiobutton",name:"RadioButton",category:"web",description:"The RadioButton widget is used to display an input of type radio.",depends:["toggleinputbase","html.input"]};!function(e,t){var n=window.kendo,i=n.ui,o=i.ToggleInputBase,d=o.extend({init:function(e,t){o.fn.init.call(this,e,t),t&&t.value&&t.value.length&&this.element.attr("value",t.value)},options:{name:"RadioButton",checked:null,value:"",enabled:!0,encoded:!0,label:null,size:"medium"},RENDER_INPUT:n.html.renderRadioButton,NS:".kendoRadioButton"});n.cssProperties.registerPrefix("RadioButton","k-radio-"),i.plugin(d)}(window.kendo.jQuery);
//# sourceMappingURL=kendo.radiobutton.js.map
