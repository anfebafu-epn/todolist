/// <reference path="assets/js/web.ts" />
var ui;
(function (ui) {
    class Category {
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
                "assets/css/main.min.css?v=" + current_version, "assets/js/web.js?v=" + current_version, "assets/js/Base.js?v=" + current_version, "assets/js/proxy.js?v=" + current_version, "category.css?v=" + current_version, "category.js?v=" + current_version, function () {
                    Category.Load();
                });
            });
        }
        static Load() {
            var psession = sessionStorage.getItem("p");
            if (psession == null) {
                window.location.assign("index.html");
            }
            Category.LoggedUser = nMorph.core.proxy.tools.Packager.Unserialize(psession);
            // Esta pantalla no puede ser vista por el usuario ejecutor
            if (Category.LoggedUser.Role == 1) {
                window.location.assign("task.html");
            }
            // Evento para cerrar la ventana modal cuando se hace clic en el botón de cerrar (×)
            $(document).on('click', '.close', function () {
                Category.closeModal();
            });
            // Evento para cerrar la ventana modal cuando se hace clic fuera de ella
            $(window).on('click', function (event) {
                const modal = $('#editModal');
                if (event.target == modal[0]) {
                    Category.closeModal();
                }
            });
            // Evento para mostrar la ventana modal al hacer clic en el botón de edición de categoría
            $(document).on('click', '.editButton', function () {
                const categoryId = $(this).data('categoryid');
                const category = Category.getCategoryById(categoryId, (n) => {
                    Category.openModal(n);
                });
            });
            // Manejar el envío del formulario de edición de categoría
            $('#btn_Save').click(function (event) {
                event.preventDefault();
                const categoryId = $('#categoryId').val();
                const categoryName = $('#categoryName').val();
                // Aquí puedes realizar validaciones de los campos antes de enviarlos al servidor
                if (categoryName == null || categoryName == "") {
                    return alert("Category name is required.");
                }
                // Objeto con los datos de la categoría
                var categoryData = new nMorph.core.db.sw_todolist.Category();
                categoryData.CategoryId = categoryId == "" ? nMorph.framework.common.datatypes.UUID.newUUID() : nMorph.framework.common.datatypes.UUID.fromString(categoryId);
                categoryData.CategoryName = categoryName;
                // Llamar al método saveCategory de la clase Proxy para guardar o actualizar la categoría
                ui.assets.js.Proxy.Category_Save(categoryData, function () {
                    // mensaje de notificacion
                    Category.showNotification("Saved");
                    // Cerrar la ventana modal después de guardar
                    Category.closeModal();
                    // Recargar las categorías después de guardar o actualizar
                    Category.fetchCategories();
                });
            });
            $('#btn_Delete').click(function (event) {
                event.preventDefault();
                if (window.confirm("Are you sure to delete this record?")) {
                    const categoryId = $('#categoryId').val();
                    const categoryName = $('#categoryName').val();
                    ui.assets.js.Proxy.Category_Delete(nMorph.framework.common.datatypes.UUID.fromString(categoryId), () => {
                        // mensaje de notificacion
                        Category.showNotification("Deleted!");
                        // Cerrar la ventana modal después de guardar
                        Category.closeModal();
                        // Recargar las categorías después de guardar o actualizar
                        Category.fetchCategories();
                    });
                }
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#searchButton').click(function () {
                const searchTerm = $('#searchInput').val();
                Category.searchCategories(searchTerm);
            });
            // Boton que limpia la busqueda
            $('#clearButton').click(function () {
                $('#searchInput').val("");
                Category.searchCategories("");
            });
            // Manejar la búsqueda al hacer clic en el botón de búsqueda
            $('#newButton').click(function () {
                Category.openModal(null);
            });
            // Cargar las categorías al iniciar la página
            Category.fetchCategories();
        }
        // Función para mostrar las categorías en la interfaz
        static showCategories(categories) {
            const categoriesContainer = $('#categoriesContainer');
            categoriesContainer.empty();
            categories.forEach(category => {
                const categoryDiv = $('<div class="dataItem">');
                categoryDiv.html(`
                            <label>Category Name:</label> <span>${category.CategoryName}</span>
                            <button data-categoryid="${category.CategoryId}" class="editButton">Edit</button>
                          `);
                categoriesContainer.append(categoryDiv);
            });
        }
        // Función para abrir la ventana modal con los detalles de la categoría para editar
        static openModal(category) {
            const modal = $('#editModal');
            const categoryIdInput = $('#categoryId');
            const categoryNameInput = $('#categoryName');
            if (category != null) {
                categoryIdInput.val(category.CategoryId.toString().toString());
                categoryNameInput.val(category.CategoryName);
            }
            else {
                categoryIdInput.val("");
                categoryNameInput.val("");
            }
            modal.show();
        }
        // Función para cerrar la ventana modal
        static closeModal() {
            const modal = $('#editModal');
            modal.hide();
        }
        // Función para obtener las categorías del servidor y mostrarlas
        static fetchCategories() {
            ui.assets.js.Proxy.Category_Search('', function (categories) {
                Category.showCategories(categories);
            });
        }
        static searchCategories(searchTerm) {
            // Llamar al método getCategories de la clase Proxy para obtener las categorías que coincidan con el término de búsqueda
            ui.assets.js.Proxy.Category_Search(searchTerm, function (categories) {
                Category.showCategories(categories);
            });
        }
        // Función para obtener los detalles de la categoría por su ID
        static getCategoryById(categoryId, callback) {
            ui.assets.js.Proxy.Category_GetByID(nMorph.framework.common.datatypes.UUID.fromString(categoryId), (n) => {
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
    ui.Category = Category;
})(ui || (ui = {}));
ui.Category.Init();
//# sourceMappingURL=category.js.map