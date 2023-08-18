/// <reference path="../../config.ts" />
/// <reference path="./Base.d.ts" />
/// <reference path="../../lib/jquery/jquery.d.ts" />
/// <reference path="../../lib/headjs/headjs.d.ts" />
/// <reference path="../../lib/jsviews/index.d.ts" />
/// <reference path="../../lib/kendoui/typescript/kendo.all.d.ts" />
/// <reference path="proxy.ts" />
var ui;
(function (ui) {
    var assets;
    (function (assets) {
        var js;
        (function (js) {
            class Utils {
                /**
                 * Obtiene un parametro del QueryString actual
                 * @param name
                 * @param url
                 */
                static getQueryStringParameter(name, url = window.location.href) {
                    name = name.replace(/[\[\]]/g, '\\$&');
                    var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'), results = regex.exec(url);
                    if (!results)
                        return null;
                    if (!results[2])
                        return '';
                    return decodeURIComponent(results[2].replace(/\+/g, ' '));
                }
                static padTo2Digits(num) {
                    return num.toString().padStart(2, '0');
                }
                // format as DD/MM/YYYY
                static DateStringDDMMYYY(date) {
                    return ([
                        this.padTo2Digits(date.getDate()),
                        this.padTo2Digits(date.getMonth() + 1),
                        date.getFullYear(),
                    ].join('/'));
                }
                static validateEmailFormat(email) {
                    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
                    return emailRegex.test(email);
                }
                static setDateInputValue(date) {
                    const year = date.getFullYear();
                    const month = (date.getMonth() + 1).toString().padStart(2, '0');
                    const day = date.getDate().toString().padStart(2, '0');
                    const formattedDate = `${year}-${month}-${day}`;
                    return formattedDate;
                    //$('#' + inputId).val(formattedDate);
                }
            }
            js.Utils = Utils;
        })(js = assets.js || (assets.js = {}));
    })(assets = ui.assets || (ui.assets = {}));
})(ui || (ui = {}));
//# sourceMappingURL=web.js.map