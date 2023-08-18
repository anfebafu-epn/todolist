/// <reference path="assets/js/web.ts" />
var ui;
(function (ui) {
    class Workarea {
        /*
         * Inicialización de la página en renderización actual
         * */
        static Init() {
            head.load("config.js?v=" + new Date().getTime().toString(), // Hace que este archivo nunca haga caché, siempre lea la última configuración
            function () {
                head.load("lib/jquery/jquery-3.7.0.min.js", //"https://code.jquery.com/jquery-3.7.0.min.js",
                "lib/jsviews/jsviews-1.0.11.min.js", //"https://cdnjs.cloudflare.com/ajax/libs/jsviews/1.0.11/jsviews.min.js",
                //"lib/kendoui/js/kendo.all.min.js",
                //"lib/kendoui/js/cultures/kendo.culture.es-EC.min.js",
                //"lib/kendoui/js/messages/kendo.messages.es-EC.min.js",
                //"lib/kendoui/styles/default-main.css",
                "assets/css/main.min.css?v=" + current_version, "assets/js/web.js?v=" + current_version, "assets/js/Base.js?v=" + current_version, "assets/js/proxy.js?v=" + current_version, "workarea.css?v=" + current_version, "workarea.js?v=" + current_version, function () {
                    Workarea.Load();
                });
            });
        }
        static Load() {
        }
    }
    ui.Workarea = Workarea;
})(ui || (ui = {}));
ui.Workarea.Init();
//# sourceMappingURL=workarea.js.map