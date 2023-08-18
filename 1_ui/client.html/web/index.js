/// <reference path="assets/js/web.ts" />
var ui;
(function (ui) {
    class Index {
        /*
         * Inicialización de la página en renderización actual
         * */
        static Init() {
            head.load("config.js?v=" + new Date().getTime().toString(), // Hace que este archivo nunca haga caché, siempre lea la última configuración
            function () {
                head.load("lib/jquery/jquery-3.7.0.min.js", //"https://code.jquery.com/jquery-3.7.0.min.js",
                //"lib/jsviews/jsviews-1.0.11.min.js", //"https://cdnjs.cloudflare.com/ajax/libs/jsviews/1.0.11/jsviews.min.js",
                //"lib/kendoui/js/kendo.all.min.js",
                //"lib/kendoui/styles/default-main.css",
                "assets/css/main.min.css?v=" + current_version, "assets/js/web.js?v=" + current_version, "assets/js/Base.js?v=" + current_version, "assets/js/proxy.js?v=" + current_version, "index.css?v=" + current_version, "index.js?v=" + current_version, function () {
                    Index.Load();
                });
            });
        }
        static Load() {
            // Limpia la historia de navegación para que no haga Back del browser
            window.history.forward();
            // Revisión de si tiene abierta una sesión, ingresa directamente
            //TODO
            // Foco inicial en el campo username para empiece e llenado
            $('#txt_Username').focus();
            // Si presiona Enter, ejecuta el ingreso
            $('#txt_Username').keypress(function (event) {
                var keycode = (event.keyCode ? event.keyCode : event.which);
                if (keycode == 13) {
                    $('#btn_Login').click();
                }
            });
            // Si presiona Enter, ejecuta el ingreso
            $('#txt_Password').keypress(function (event) {
                var keycode = (event.keyCode ? event.keyCode : event.which);
                if (keycode == 13) {
                    $('#btn_Login').click();
                }
            });
            // Evento de control del botón de ingreso
            $('#btn_Login').click(() => {
                var email = $('#txt_Username').val();
                var pass = $('#txt_Password').val();
                ui.assets.js.Proxy.Person_Login(email, pass, (n) => {
                    if (n == null) {
                        return alert('Credenciales incorrectas');
                    }
                    else {
                        sessionStorage.setItem("p", nMorph.core.proxy.tools.Packager.Serialize(n));
                        window.location.assign("task.html");
                    }
                });
                //$('.LoginForm').hide();
                //$('.LostPasswordWindow').hide();
                //$('.ResetPasswordWindow').show();
                //$('#txt_ResetOldPassword').focus();
            });
            // Evento del link de olvidé mi contraseña
            $('#LoginLostPassword').click(() => {
                $('.LoginForm').hide();
                $('.ResetPasswordWindow').hide();
                $('.LostPasswordWindow').show();
                $('#txt_RecoveryUsername').focus();
            });
            $('#LoginLostPasswordBack').click(() => {
                $('#txt_RecoveryUsername').val("");
                $('.LoginForm').show();
                $('.ResetPasswordWindow').hide();
                $('.LostPasswordWindow').hide();
                $('#txt_Username').focus();
            });
            // Evento de control del botón de recuperación de clave
            $('#btn_Recovery').click(() => {
                alert("Si la información enviada es validada, usted recibirá un correo con una nueva contraseña");
                $('.LoginForm').show();
                $('.ResetPasswordWindow').hide();
                $('.LostPasswordWindow').hide();
                $('#txt_Username').focus();
            });
            // Si presiona Enter, ejecuta el ingreso
            $('#txt_RecoveryUsername').keypress(function (event) {
                var keycode = (event.keyCode ? event.keyCode : event.which);
                if (keycode == 13) {
                    $('#btn_Recovery').click();
                }
            });
            // Evento de control del botón de cambio de password
            $('#btn_Reset').click(() => {
                ui.assets.js.Proxy.Query((n) => {
                    alert(n);
                });
                window.location.assign("task.html");
            });
            // Si presiona Enter, ejecuta el ingreso
            $('#txt_ResetRepeatPassword').keypress(function (event) {
                var keycode = (event.keyCode ? event.keyCode : event.which);
                if (keycode == 13) {
                    $('#btn_Reset').click();
                }
            });
            $('#LoginResetPasswordBack').click(() => {
                $('#txt_ResetOldPassword').val("");
                $('#txt_ResetNewPassword').val("");
                $('#txt_ResetRepeatPassword').val("");
                $('.LoginForm').show();
                $('.ResetPasswordWindow').hide();
                $('.LostPasswordWindow').hide();
                $('#txt_Username').focus();
            });
        }
    }
    ui.Index = Index;
})(ui || (ui = {}));
ui.Index.Init();
//# sourceMappingURL=index.js.map