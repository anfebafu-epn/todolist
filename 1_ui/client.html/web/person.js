/// <reference path="assets/js/web.ts" />
var ui;
(function (ui) {
    class Person {
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
                "assets/css/main.min.css?v=" + current_version, "assets/js/web.js?v=" + current_version, "assets/js/Base.js?v=" + current_version, "assets/js/proxy.js?v=" + current_version, "person.css?v=" + current_version, "person.js?v=" + current_version, function () {
                    Person.Load();
                });
            });
        }
        static Load() {
            var psession = sessionStorage.getItem("p");
            if (psession == null) {
                window.location.assign("index.html");
            }
            Person.LoggedUser = nMorph.core.proxy.tools.Packager.Unserialize(psession);
            // Esta pantalla no puede ser vista por el usuario ejecutor
            if (Person.LoggedUser.Role == 1) {
                window.location.assign("task.html");
            }
            // Evento para cerrar la ventana modal cuando se hace clic en el botón de cerrar (×)
            $(document).on('click', '.close', function () {
                Person.closeModal();
            });
            // Evento para cerrar la ventana modal cuando se hace clic fuera de ella
            $(window).on('click', function (event) {
                const modal = $('#editModal');
                if (event.target == modal[0]) {
                    Person.closeModal();
                }
            });
            // Evento para mostrar la ventana modal al hacer clic en el botón de edición de persona
            $(document).on('click', '.editButton', function () {
                const personId = $(this).data('personid');
                const person = Person.getPersonById(personId, (n) => {
                    Person.openModal(n);
                });
            });
            // Manejar el envío del formulario de edición de persona
            $('#btn_Save').click(function (event) {
                event.preventDefault();
                const personId = $('#personId').val();
                const personFullName = $('#personFullName').val();
                const personEmail = $('#personEmail').val();
                const personPassword = $('#personPassword').val();
                const personRole = $('#personRole').val();
                // Aquí puedes realizar validaciones de los campos antes de enviarlos al servidor
                if (personFullName == null || personFullName == "") {
                    return alert("Fullname is required.");
                }
                if (personEmail == null || personEmail == "") {
                    return alert("E-mail is required.");
                }
                if (ui.assets.js.Utils.validateEmailFormat(personEmail) == false) {
                    return alert("Invalid e-mail format");
                }
                if (personPassword == null || personPassword == "") {
                    return alert("Password is required.");
                }
                // Objeto con los datos de la persona
                var personData = new nMorph.core.db.sw_todolist.Person();
                personData.PersonId = personId == "" ? nMorph.framework.common.datatypes.UUID.newUUID() : nMorph.framework.common.datatypes.UUID.fromString(personId);
                personData.FullName = personFullName;
                personData.Email = personEmail;
                personData.PasswordHash = personPassword;
                personData.Role = parseInt(personRole);
                // Llamar al método savePerson de la clase Proxy para guardar o actualizar la persona
                ui.assets.js.Proxy.Person_Save(personData, function () {
                    // mensaje de notificacion
                    Person.showNotification("Saved");
                    // Cerrar la ventana modal después de guardar
                    Person.closeModal();
                    // Recargar las personas después de guardar o actualizar
                    Person.fetchPersons();
                });
            });
            $('#btn_Delete').click(function (event) {
                event.preventDefault();
                if (window.confirm("Are you sure to delete this record?")) {
                    const personId = $('#personId').val();
                    ui.assets.js.Proxy.Person_Delete(nMorph.framework.common.datatypes.UUID.fromString(personId), () => {
                        // mensaje de notificacion
                        Person.showNotification("Deleted!");
                        // Cerrar la ventana modal después de guardar
                        Person.closeModal();
                        // Recargar las personas después de guardar o actualizar
                        Person.fetchPersons();
                    });
                }
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#searchButton').click(function () {
                const searchTerm = $('#searchInput').val();
                Person.searchPersons(searchTerm);
            });
            // Boton que limpia la busqueda
            $('#clearButton').click(function () {
                $('#searchInput').val("");
                Person.searchPersons("");
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#newButton').click(function () {
                Person.openModal(null);
            });
            // Cargar las personas al iniciar la página
            Person.fetchPersons();
        }
        // Función para mostrar las personas en la interfaz
        static showPersons(persons) {
            const PersonsContainer = $('#usersContainer');
            PersonsContainer.empty();
            persons.forEach(person => {
                var p = person;
                const personDiv = $('<div class="dataItem">');
                personDiv.html(`
                            <label>Name:</label> <span>${p.FullName}</span>
                            <label>E-mail:</label> <span>${p.Email}</span>
                            <label>Role:</label> <span>${p.Role == 1 ? "Executor" : "Supervisor"}</span>
                            <button data-personid="${person.PersonId}" class="editButton">Edit</button>
                          `);
                PersonsContainer.append(personDiv);
            });
        }
        // Función para abrir la ventana modal con los detalles de la persona para editar
        static openModal(person) {
            const modal = $('#editModal');
            const personIdInput = $('#personId');
            const personFullName = $('#personFullName');
            const personEmail = $('#personEmail');
            const personPassword = $('#personPassword');
            const personRole = $('#personRole');
            if (person != null) {
                personIdInput.val(person.PersonId.toString().toString());
                personFullName.val(person.FullName);
                personEmail.val(person.Email);
                personPassword.val(person.PasswordHash);
                personRole.val(person.Role.toString());
            }
            else {
                personIdInput.val("");
                personFullName.val("");
                personEmail.val("");
                personPassword.val("");
                personRole.val("1");
            }
            modal.show();
        }
        // Función para cerrar la ventana modal
        static closeModal() {
            const modal = $('#editModal');
            modal.hide();
        }
        // Función para obtener las personas del servidor y mostrarlas
        static fetchPersons() {
            ui.assets.js.Proxy.Person_Search('', function (persons) {
                Person.showPersons(persons);
            });
        }
        static searchPersons(searchTerm) {
            // Llamar al método getpersons de la clase Proxy para obtener las personas que coincidan con el término de búsqueda
            ui.assets.js.Proxy.Person_Search(searchTerm, function (persons) {
                Person.showPersons(persons);
            });
        }
        // Función para obtener los detalles de la persona por su ID
        static getPersonById(personId, callback) {
            ui.assets.js.Proxy.Person_GetByID(nMorph.framework.common.datatypes.UUID.fromString(personId), (n) => {
                if (callback) {
                    callback(n);
                }
            });
        }
        static showNotification(message) {
            const notificationContainer = document.getElementById('notificationContainer');
            const notificationMessage = document.getElementById('notificationMessage');
            if (notificationContainer && notificationMessage) {
                notificationMessage.innerText = message;
                notificationContainer.classList.remove('hidden');
                setTimeout(() => {
                    notificationContainer.classList.add('hidden');
                }, 5000); // Hide after x seconds
            }
        }
        ;
        static CloseSession() {
            // limpia la sesion y regresa al ingreso del sistema
            sessionStorage.clear();
            window.location.assign("index.html");
        }
    }
    ui.Person = Person;
})(ui || (ui = {}));
ui.Person.Init();
//# sourceMappingURL=person.js.map