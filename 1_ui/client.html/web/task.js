/// <reference path="assets/js/web.ts" />
var ui;
(function (ui) {
    class Task {
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
                "assets/css/main.min.css?v=" + current_version, "assets/js/web.js?v=" + current_version, "assets/js/Base.js?v=" + current_version, "assets/js/proxy.js?v=" + current_version, "task.css?v=" + current_version, "task.js?v=" + current_version, function () {
                    Task.Load();
                });
            });
        }
        static Load() {
            // Llenado de los combos
            Task.CurrentPersonID = nMorph.framework.common.datatypes.UUID.empty();
            Task.CurrentCategoryID = nMorph.framework.common.datatypes.UUID.empty();
            var psession = sessionStorage.getItem("p");
            if (psession == null) {
                window.location.assign("index.html");
            }
            Task.LoggedUser = nMorph.core.proxy.tools.Packager.Unserialize(psession);
            // Si es ejecutor, deshabilita las herramientas de configuración principal
            if (Task.LoggedUser.Role == 1) {
                $('a[href="person.html"]').hide();
                $('a[href="category.html"]').hide();
                Task.CurrentPersonID = Task.LoggedUser.PersonId;
            }
            if (Task.LoggedUser.Role == 2) {
                $('#personList').append('<button class="filterPerson selected" data-id="' + nMorph.framework.common.datatypes.UUID.empty().toString().toString() + '">All</button>');
                ui.assets.js.Proxy.Person_Search("", (n) => {
                    n.forEach((value) => {
                        $('#taskPersonId').append('<option value="' + value.PersonId.toString().toString() + '">' + value.FullName + '</option>');
                        $('#personList').append('<button class="filterPerson unselected" data-id="' + value.PersonId.toString().toString() + '">' + value.FullName + '</button>');
                    });
                    // Aplicación del filtro cuando hace click en el botón (Person)
                    $('.filterPerson').click((e) => {
                        var PersonId = $(e.target).attr("data-id");
                        Task.CurrentPersonID = nMorph.framework.common.datatypes.UUID.fromString(PersonId);
                        $('.filterPerson.selected').removeClass("selected").addClass("unselected");
                        $(e.target).addClass('selected');
                        Task.fetchTasks();
                    });
                });
            }
            else {
                $('#personList').hide();
                $('#taskPersonId').append('<option value="' + Task.LoggedUser.PersonId.toString().toString() + '">' + Task.LoggedUser.FullName + '</option>');
            }
            $('#categoryList').append('<button class="filterCategory selected" data-id="' + nMorph.framework.common.datatypes.UUID.empty().toString().toString() + '">All</button>');
            ui.assets.js.Proxy.Category_Search("", (n) => {
                n.forEach((value) => {
                    $('#taskCategoryId').append('<option value="' + value.CategoryId.toString().toString() + '">' + value.CategoryName + '</option>');
                    $('#categoryList').append('<button class="filterCategory unselected" data-id="' + value.CategoryId.toString().toString() + '">' + value.CategoryName + '</button>');
                });
                // Aplicación del filtro cuando hace click en el botón (Category)
                $('.filterCategory').click((e) => {
                    var CategoryId = $(e.target).attr("data-id");
                    Task.CurrentCategoryID = nMorph.framework.common.datatypes.UUID.fromString(CategoryId);
                    $('.filterCategory.selected').removeClass("selected").addClass("unselected");
                    $(e.target).addClass('selected');
                    Task.fetchTasks();
                });
            });
            // Evento para cerrar la ventana modal cuando se hace clic en el botón de cerrar (×)
            $(document).on('click', '.close', function () {
                Task.closeModal();
            });
            // Evento para cerrar la ventana modal cuando se hace clic fuera de ella
            $(window).on('click', function (event) {
                const modal = $('#editModal');
                if (event.target == modal[0]) {
                    Task.closeModal();
                }
            });
            // Evento para mostrar la ventana modal al hacer clic en el botón de edición de taska
            $(document).on('click', '.editButton', function () {
                const taskId = $(this).data('taskid');
                const task = Task.getTaskById(taskId, (n) => {
                    Task.openModal(n);
                });
            });
            $(document).on('click', '.completeButton', function () {
                const taskId = $(this).data('taskid');
                if (window.confirm("Are you sure to set this item complete?") == true) {
                    ui.assets.js.Proxy.Task_SetComplete(nMorph.framework.common.datatypes.UUID.fromString(taskId), () => {
                        Task.showNotification("Completed!!");
                        // Recargar las taskas después de guardar o actualizar
                        Task.fetchTasks();
                    });
                }
            });
            // Manejar el envío del formulario de edición de taska
            $('#btn_Save').click(function (event) {
                event.preventDefault();
                const taskId = $('#taskId').val();
                const taskPersonId = $('#taskPersonId').val(); // lectura diferente SELECT
                const taskCategoryId = $('#taskCategoryId').val(); // lectura diferente SELECT
                const taskTitle = $('#taskTitle').val();
                const taskDescription = $('#taskDescription').val();
                const taskDueDate = new Date($('#taskDueDate').val());
                const taskIsCompleted = $('#taskIsCompleted').prop('checked');
                //// Aquí puedes realizar validaciones de los campos antes de enviarlos al servidor
                //if (taskFullName == null || taskFullName == "") {
                //    return alert("Fullname is required.");
                //}
                //if (taskEmail == null || taskEmail == "") {
                //    return alert("E-mail is required.");
                //}
                //if (ui.assets.js.Utils.validateEmailFormat(taskEmail) == false) {
                //    return alert("Invalid e-mail format");
                //}
                //if (taskPassword == null || taskPassword == "") {
                //    return alert("Password is required.");
                //}
                // Objeto con los datos de la taska
                var taskData = new nMorph.core.db.sw_todolist.Task();
                taskData.TaskId = taskId == "" ? nMorph.framework.common.datatypes.UUID.newUUID() : nMorph.framework.common.datatypes.UUID.fromString(taskId);
                taskData.PersonId = nMorph.framework.common.datatypes.UUID.fromString(taskPersonId);
                taskData.CategoryId = nMorph.framework.common.datatypes.UUID.fromString(taskCategoryId);
                taskData.Title = taskTitle;
                taskData.Description = taskDescription;
                taskData.DueDate = taskDueDate;
                taskData.IsCompleted = taskIsCompleted;
                // Llamar al método saveTask de la clase Proxy para guardar o actualizar la taska
                ui.assets.js.Proxy.Task_Save(taskData, function () {
                    // mensaje de notificacion
                    Task.showNotification("Saved");
                    // Cerrar la ventana modal después de guardar
                    Task.closeModal();
                    // Recargar las taskas después de guardar o actualizar
                    Task.fetchTasks();
                });
            });
            $('#btn_Delete').click(function (event) {
                event.preventDefault();
                if (window.confirm("Are you sure to delete this record?")) {
                    const taskId = $('#taskId').val();
                    ui.assets.js.Proxy.Task_Delete(nMorph.framework.common.datatypes.UUID.fromString(taskId), () => {
                        // mensaje de notificacion
                        Task.showNotification("Deleted!");
                        // Cerrar la ventana modal después de guardar
                        Task.closeModal();
                        // Recargar las taskas después de guardar o actualizar
                        Task.fetchTasks();
                    });
                }
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#searchButton').click(function () {
                Task.fetchTasks();
            });
            // Boton que limpia la busqueda
            $('#clearButton').click(function () {
                $('#searchInput').val("");
                Task.fetchTasks();
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#newButton').click(function () {
                Task.openModal(null);
            });
            // Cargar las taskas al iniciar la página
            Task.fetchTasks();
        }
        // Función para mostrar las taskas en la interfaz
        static showTasks(tasks) {
            const TasksContainer = $('#tasksContainer');
            TasksContainer.empty();
            tasks.forEach(task => {
                var p = task;
                const taskDiv = $('<div class="dataItem">');
                taskDiv.html(`
                            <span class="itemTitle">${p.Title}</span> 
                            <label>Due Date:</label> <span>${ui.assets.js.Utils.DateStringDDMMYYY(p.DueDate)}</span>
                            <label>Assigned To:</label> <span>${p.FullName}</span>
                            <label>Category:</label> <span>${p.CategoryName}</span>
                            <button data-taskid="${task.TaskId}" class="editButton">Edit</button>
                            <button data-taskid="${task.TaskId}" class="completeButton">Set Complete</button>
                          `);
                TasksContainer.append(taskDiv);
            });
        }
        // Función para abrir la ventana modal con los detalles de la taska para editar
        static openModal(task) {
            const modal = $('#editModal');
            const taskIdInput = $('#taskId');
            const taskPersonId = $('#taskPersonId'); // lectura diferente SELECT
            const taskCategoryId = $('#taskCategoryId'); // lectura diferente SELECT
            const taskTitle = $('#taskTitle');
            const taskDescription = $('#taskDescription');
            const taskDueDate = $('#taskDueDate');
            const taskIsCompleted = $('#taskIsCompleted');
            if (task != null) {
                taskIdInput.val(task.TaskId.toString().toString());
                taskPersonId.val(task.PersonId.toString().toString());
                taskCategoryId.val(task.CategoryId.toString().toString());
                taskTitle.val(task.Title);
                taskDescription.val(task.Description);
                taskDueDate.val(ui.assets.js.Utils.setDateInputValue(task.DueDate));
                taskIsCompleted.prop("checked", task.IsCompleted);
            }
            else {
                taskIdInput.val("");
                taskPersonId.val("0");
                taskCategoryId.val("0");
                taskTitle.val("");
                taskDescription.val("");
                taskDueDate.val("");
                taskIsCompleted.prop("checked", false);
            }
            modal.show();
        }
        // Función para cerrar la ventana modal
        static closeModal() {
            const modal = $('#editModal');
            modal.hide();
        }
        // Función para obtener las taskas del servidor y mostrarlas
        static fetchTasks() {
            const searchTerm = $('#searchInput').val();
            ui.assets.js.Proxy.Task_Search(searchTerm, Task.CurrentCategoryID, Task.CurrentPersonID, function (tasks) {
                Task.showTasks(tasks);
            });
        }
        // Función para obtener los detalles de la taska por su ID
        static getTaskById(taskId, callback) {
            ui.assets.js.Proxy.Task_GetByID(nMorph.framework.common.datatypes.UUID.fromString(taskId), (n) => {
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
    ui.Task = Task;
})(ui || (ui = {}));
ui.Task.Init();
//# sourceMappingURL=task.js.map