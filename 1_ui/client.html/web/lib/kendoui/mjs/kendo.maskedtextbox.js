/**
 * Kendo UI v2023.2.606 (http://www.telerik.com/kendo-ui)
 * Copyright 2023 Progress Software Corporation and/or one of its subsidiaries or affiliates. All rights reserved.
 *
 * Kendo UI commercial licenses may be obtained at
 * http://www.telerik.com/purchase/license-agreement/kendo-ui-complete
 * If you do not own a commercial license, this file shall be governed by the trial license terms.
 */
import"./kendo.core.js";import"./kendo.floatinglabel.js";import"./kendo.icons.js";var __meta__={id:"maskedtextbox",name:"MaskedTextBox",category:"web",description:"The MaskedTextBox widget allows to specify a mask type on an input field.",depends:["core","floatinglabel","icons"]};!function(e,t){var n=window,a=n.Math.min,i=n.kendo,s=i.caret,l=i.keys,o=i.ui,r=o.Widget,u=".kendoMaskedTextBox",d=e.isPlainObject,p=window.setTimeout,_="k-disabled",m="k-invalid",h="k-focus",c="disabled",f="readonly",v="change",g="mouseup",k="drop",b="keydown",w="paste",y="input";function C(e){return e+u}var x=C(i.support.propertyChangeEvent?"propertychange":y);var I=r.extend({init:function(t,n){var a,l=this;r.fn.init.call(l,t,n),l._rules=e.extend({},l.rules,l.options.rules),t=l.element,a=t[0],l._wrapper(),l._tokenize(),l._form(),l.element.addClass("k-input-inner").attr("autocomplete","off").on("focus"+u,(function(){var e=a.value;e?l._togglePrompt(!0):a.value=l._old=l._emptyMask,l._oldValue=e,l.wrapper.addClass(h),l._timeoutId=p((function(){s(t,0,e?l._maskLength:0)}))})).on("focusout"+u,(function(){var e=t.val();clearTimeout(l._timeoutId),a.value=l._old="",e!==l._emptyMask&&(a.value=l._old=e),l.wrapper.removeClass(h),l._change(),l._togglePrompt()})),l.options.mask&&l.options.mask.length>0&&l.element.attr("aria-placeholder",l.options.mask),t.is("[disabled]")||e(l.element).parents("fieldset").is(":disabled")?l.enable(!1):l.readonly(t.is("[readonly]")),l._validationIcon=e(i.ui.icon({icon:"exclamation-circle",iconClass:"k-input-validation-icon k-hidden"})).insertAfter(t),l.value(l.options.value||t.val()),l._label(),l._applyCssClasses(),i.notify(l)},options:{name:"MaskedTextBox",clearPromptChar:!1,unmaskOnPost:!1,promptChar:"_",culture:"",rules:{},value:"",mask:"",label:null,size:"medium",fillMode:"solid",rounded:"medium"},events:[v],rules:{0:/\d/,9:/\d|\s/,"#":/\d|\s|\+|\-/,L:/[a-zA-Z]/,"?":/[a-zA-Z]|\s/,"&":/\S/,C:/./,A:/[a-zA-Z0-9]/,a:/[a-zA-Z0-9]|\s/},setOptions:function(t){var n=this;r.fn.setOptions.call(n,t),n._rules=e.extend({},n.rules,n.options.rules),n._tokenize(),this._unbindInput(),this._bindInput(),n.value(n.element.val())},destroy:function(){var e=this;e.floatingLabel&&e.floatingLabel.destroy(),e.element.off(u),e._formElement&&(e._formElement.off("reset",e._resetHandler),e._formElement.off("submit",e._submitHandler)),r.fn.destroy.call(e)},raw:function(){return this._unmask(this.element.val(),0).replace(new RegExp(L(this.options.promptChar),"g"),"")},value:function(e){var n=this.element,a=this._emptyMask;return e===t?this.element.val():(null===e&&(e=""),a?(e=this._unmask(e+""),n.val(e?a:""),this._mask(0,this._maskLength,e),this._unmaskedValue=null,e=n.val(),this._oldValue=e,i._activeElement()!==n&&(e===a?n.val(""):this._togglePrompt()),void(this.floatingLabel&&this.floatingLabel.refresh())):(this._oldValue=e,void n.val(e)))},_togglePrompt:function(e){var t=this.element[0],n=t.value;this.options.clearPromptChar&&(n=e?this._oldValue:n.replace(new RegExp(L(this.options.promptChar),"g")," "),t.value=this._old=n)},readonly:function(e){this._editable({readonly:e===t||e,disable:!1}),this.floatingLabel&&this.floatingLabel.readonly(e===t||e)},enable:function(e){this._editable({readonly:!1,disable:!(e=e===t||e)}),this.floatingLabel&&this.floatingLabel.enable(e=e===t||e)},_bindInput:function(){var e=this;if(e._maskLength&&(e.options.$angular&&e.element.off(y),e.element.on(C(b),e._keydown.bind(e)).on(C(k),e._drop.bind(e)).on(C(v),e._trackChange.bind(e)).on(x,e._inputHandler.bind(e)),i.support.browser.msie)){var t=i.support.browser.version;if(t>8&&t<11){var n=[C(g),C(k),C(b),C(w)].join(" ");e.element.on(n,e._legacyIEInputHandler.bind(e))}}},_unbindInput:function(){var e=[x,C(b),C(g),C(k),C(w)].join(" ");this.element.off(e)},_editable:function(e){var t=this,n=t.element,a=t.wrapper,i=e.disable,s=e.readonly;t._unbindInput(),s||i?(n.attr(c,i).attr(f,s),a.toggleClass(_,i)):(n.prop(c,!1).prop(f,!1),a.removeClass(_),t._bindInput())},_change:function(){var e=this,t=e.value();t!==e._oldValue?(e._oldValue=t,e.trigger(v),e.element.trigger(v)):""===t&&e.__changing&&e.element.trigger(v)},inputChange:function(e){var t=this,n=t._old,l=t.element[0],o=l.value,r=s(l)[1],u=o.length-n.length,d=i.support.mobileOS;if(!(t.__dropping&&u<0)){-1===u&&d.android&&"chrome"===d.browser&&(e=!0);var p=a(r,function(e,t){for(var n=0;n<t.length&&e[n]===t[n];)n++;return n}(o,n)),_=o.substring(p,r);l.value=o.substring(0,p)+t._emptyMask.substring(p);var m=t._mask(p,r,_),h=t._trimStartPromptChars(o.substring(r),a(u,m-p)),c=t._unmask(h,n.length-h.length);t._mask(m,m,c),e&&(m=t._findCaretPosBackwards(p)),s(l,m),t.__dropping=!1}},_trimStartPromptChars:function(e,t){for(var n=this.options.promptChar;t-- >0&&0===e.indexOf(n);)e=e.substring(1);return e},_findCaretPosBackwards:function(e){var t=this._find(e,!0);return t<e&&(t+=1),t},_inputHandler:function(){i._activeElement()===this.element[0]&&this.inputChange(this.__backward)},_legacyIEInputHandler:function(e){var t=this,n=t.element[0],a=n.value,i=e.type;t.__pasting="paste"===i,p((function(){"mouseup"===i&&t.__pasting||n.value&&n.value!==a&&t.inputChange(t.__backward)}))},_trackChange:function(){var e=this;e.__changing=!0,p((function(){e.__changing=!1}))},_form:function(){var t=this,n=t.element,a=n.attr("form"),i=a?e("#"+a):n.closest("form");i[0]&&(t._resetHandler=function(){p((function(){t.value(n[0].value)}))},t._submitHandler=function(){t.element[0].value=t._old=t.raw()},t.options.unmaskOnPost&&i.on("submit",t._submitHandler),t._formElement=i.on("reset",t._resetHandler))},_keydown:function(e){var t=e.keyCode;this.__backward=t===l.BACKSPACE,t===l.ENTER&&this._change()},_drop:function(){this.__dropping=!0},_find:function(e,t){var n=this.element.val()||this._emptyMask,a=1;for(!0===t&&(a=-1);e>-1||e<=this._maskLength;){if(n.charAt(e)!==this.tokens[e])return e;e+=a}return-1},_mask:function(e,n,a,l){var o,r,u,d,p=this.element[0],_=p.value||this._emptyMask,m=this.options.promptChar,h=0;for((e=this._find(e,l))>n&&(n=e),r=this._unmask(_.substring(n),n),o=(a=this._unmask(a,e)).length,a&&(r=r.replace(new RegExp("^_{0,"+o+"}"),"")),a+=r,_=_.split(""),u=a.charAt(h);e<this._maskLength;)_[e]=u||m,u=a.charAt(++h),d===t&&h>o&&(d=e),e=this._find(e+1);return p.value=this._old=_.join(""),i._activeElement()===p&&(d===t&&(d=this._maskLength),s(p,d)),d},_unmask:function(e,t){if(!e)return"";if(this._unmaskedValue===e)return this._unmaskedValue;var n,a;e=(e+"").split("");for(var s=0,l=t||0,o=this.options.promptChar,r=e.length,u=this.tokens.length,d="";l<u&&((n=e[s])===(a=this.tokens[l])||n===o?(d+=n===o?o:"",s+=1,l+=1):"string"!=typeof a?(a&&a.test&&a.test(n)||i.isFunction(a)&&a(n)?(d+=n,l+=1):1===r&&this._blinkInvalidState(),s+=1):l+=1,!(s>=r)););return this._unmaskedValue=d,d},_label:function(){var t,n,a=this,s=a.element,l=a.options,o=s.attr("id");null!==l.label&&(t=!!d(l.label)&&l.label.floating,n=d(l.label)?l.label.content:l.label,t&&(a._floatingLabelContainer=a.wrapper.wrap("<span></span>").parent(),a.floatingLabel=new i.ui.FloatingLabel(a._floatingLabelContainer,{widget:a})),i.isFunction(n)&&(n=n.call(a)),n||(n=""),o||(o=l.name+"_"+i.guid(),s.attr("id",o)),a._inputLabel=e("<label class='k-label k-input-label' for='"+o+"'>"+n+"</label>'").insertBefore(a.wrapper))},_wrapper:function(){var e=this.element,t=e[0],n=e.wrap("<span class='k-input k-maskedtextbox'></span>").parent();n[0].style.cssText=t.style.cssText,t.style.width="100%",this.wrapper=n.addClass(t.className).removeClass("input-validation-error")},_blinkInvalidState:function(){var e=this;e._addInvalidState(),clearTimeout(e._invalidStateTimeout),e._invalidStateTimeout=p(e._removeInvalidState.bind(e),100)},_addInvalidState:function(){this.wrapper.addClass(m),this._validationIcon.removeClass("k-hidden")},_removeInvalidState:function(){var e=this;e.wrapper.removeClass(m),e._validationIcon.addClass("k-hidden"),e._invalidStateTimeout=null},_tokenize:function(){for(var e,t,n=[],a=0,s=(this.options.mask||"").split(""),l=s.length,o=0,r="",u=this.options.promptChar,d=i.getCulture(this.options.culture).numberFormat,p=this._rules;o<l;o++)if(t=p[e=s[o]])n[a]=t,r+=u,a+=1;else{"."===e||","===e?e=d[e]:"$"===e?e=d.currency.symbol:"\\"===e&&(e=s[o+=1]);for(var _=0,m=(e=e.split("")).length;_<m;_++)n[a]=e[_],r+=e[_],a+=1}this.tokens=n,this._emptyMask=r,this._maskLength=r.length}});function L(e){return e.replace(/[-[\]{}()*+?.,\\^$|#\s]/g,"\\$&")}i.cssProperties.registerPrefix("MaskedTextBox","k-input-"),i.cssProperties.registerValues("MaskedTextBox",[{prop:"rounded",values:i.cssProperties.roundedValues.concat([["full","full"]])}]),o.plugin(I)}(window.kendo.jQuery);
//# sourceMappingURL=kendo.maskedtextbox.js.map