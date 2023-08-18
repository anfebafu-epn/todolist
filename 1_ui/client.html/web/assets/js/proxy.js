/// <reference path="../../../web/assets/js/web.ts" />
var ui;
(function (ui) {
    var assets;
    (function (assets) {
        var js;
        (function (js) {
            class Proxy {
                static Call_Task_Search(SearchTerm, CategoryID, PersonID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.task.TaskLogic");
                    mcc.set_LogicMethod("Task_Search");
                    mcc.set_LogicParams([SearchTerm, CategoryID, PersonID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Task_Search(SearchTerm, CategoryID, PersonID, callback) {
                    return this.ServiceCall(Proxy.Call_Task_Search(SearchTerm, CategoryID, PersonID, 'N'), callback);
                }
                static Call_Task_GetByID(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.task.TaskLogic");
                    mcc.set_LogicMethod("Task_GetByID");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Task_GetByID(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Task_GetByID(ID, 'N'), callback);
                }
                static Call_Task_SetComplete(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.task.TaskLogic");
                    mcc.set_LogicMethod("Task_SetComplete");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Task_SetComplete(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Task_SetComplete(ID, 'N'), callback);
                }
                static Call_Task_Save(UpdatedObj, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.task.TaskLogic");
                    mcc.set_LogicMethod("Task_Save");
                    mcc.set_LogicParams([UpdatedObj]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Task_Save(UpdatedObj, callback) {
                    return this.ServiceCall(Proxy.Call_Task_Save(UpdatedObj, 'N'), callback);
                }
                static Call_Task_Delete(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.task.TaskLogic");
                    mcc.set_LogicMethod("Task_Delete");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Task_Delete(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Task_Delete(ID, 'N'), callback);
                }
                static Call_Person_Login(Email, password, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.person.PersonLogic");
                    mcc.set_LogicMethod("Person_Login");
                    mcc.set_LogicParams([Email, password]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Person_Login(Email, password, callback) {
                    return this.ServiceCall(Proxy.Call_Person_Login(Email, password, 'N'), callback);
                }
                static Call_Person_Search(SearchTerm, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.person.PersonLogic");
                    mcc.set_LogicMethod("Person_Search");
                    mcc.set_LogicParams([SearchTerm]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Person_Search(SearchTerm, callback) {
                    return this.ServiceCall(Proxy.Call_Person_Search(SearchTerm, 'N'), callback);
                }
                static Call_Person_GetByID(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.person.PersonLogic");
                    mcc.set_LogicMethod("Person_GetByID");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Person_GetByID(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Person_GetByID(ID, 'N'), callback);
                }
                static Call_Person_Save(UpdatedObj, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.person.PersonLogic");
                    mcc.set_LogicMethod("Person_Save");
                    mcc.set_LogicParams([UpdatedObj]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Person_Save(UpdatedObj, callback) {
                    return this.ServiceCall(Proxy.Call_Person_Save(UpdatedObj, 'N'), callback);
                }
                static Call_Person_Delete(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.person.PersonLogic");
                    mcc.set_LogicMethod("Person_Delete");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Person_Delete(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Person_Delete(ID, 'N'), callback);
                }
                static Call_Query(name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.category.CategoryLogic");
                    mcc.set_LogicMethod("Query");
                    mcc.set_LogicParams([]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Query(callback) {
                    return this.ServiceCall(Proxy.Call_Query('N'), callback);
                }
                static Call_Category_Search(SearchTerm, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.category.CategoryLogic");
                    mcc.set_LogicMethod("Category_Search");
                    mcc.set_LogicParams([SearchTerm]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Category_Search(SearchTerm, callback) {
                    return this.ServiceCall(Proxy.Call_Category_Search(SearchTerm, 'N'), callback);
                }
                static Call_Category_GetByID(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.category.CategoryLogic");
                    mcc.set_LogicMethod("Category_GetByID");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Category_GetByID(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Category_GetByID(ID, 'N'), callback);
                }
                static Call_Category_Save(UpdatedObj, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.category.CategoryLogic");
                    mcc.set_LogicMethod("Category_Save");
                    mcc.set_LogicParams([UpdatedObj]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Category_Save(UpdatedObj, callback) {
                    return this.ServiceCall(Proxy.Call_Category_Save(UpdatedObj, 'N'), callback);
                }
                static Call_Category_Delete(ID, name) {
                    var mcc = new nMorph.framework.svc.transport.MethodCall();
                    mcc.set_LogicModule("nMorph.core.logic");
                    mcc.set_LogicClass("nMorph.core.logic.category.CategoryLogic");
                    mcc.set_LogicMethod("Category_Delete");
                    mcc.set_LogicParams([ID]);
                    mcc.set_Name(name);
                    return mcc;
                }
                static Category_Delete(ID, callback) {
                    return this.ServiceCall(Proxy.Call_Category_Delete(ID, 'N'), callback);
                }
                static ConnectionURL() {
                    return Services[0];
                }
                static ServiceCall(Call, callback, fail) {
                    var req = new nMorph.framework.svc.msg.RequestMessage();
                    req.set_RequestSeq(100);
                    req.set_SessionID("");
                    req.set_Calls([]);
                    req.get_Calls().push(Call);
                    // Serializo objetos utilizando serialización nativa
                    var PostSend = nMorph.core.proxy.tools.Packager.Serialize(req);
                    // hago la llamada al servicio y obtengo el encriptado de retorno
                    $.ajax({
                        url: this.ConnectionURL(),
                        type: 'POST',
                        dataType: 'text',
                        data: PostSend,
                        contentType: 'text/plain; charset=UTF-8',
                        mimeType: 'text/plain',
                        crossDomain: true,
                        cache: false,
                    })
                        .done(function (PostReturn) {
                        if (!PostReturn || PostReturn == "") {
                            alert("No se ha recibido respuesta del servidor.");
                            if (fail != null)
                                fail();
                            return;
                        }
                        var res = new nMorph.framework.svc.msg.ResponseMessage();
                        // Deserializa respuesta utilizando serializador Nativo
                        res = nMorph.core.proxy.tools.Packager.Unserialize(PostReturn);
                        // Si es una excepción de infraestructura
                        if (res.get_RequestSeq() == -3) {
                            alert("Ha ocurrido un error en el procesamiento de su pedido. Por favor tome contacto con el administrador del sistema y proporciónele el siguiente código de error: " + res.get_AttentionCode());
                            if (fail != null)
                                fail();
                            return;
                        }
                        // Si es una excepción de logica
                        if (res.get_RequestSeq() == -1) {
                            alert(res.get_Message() + ' (#: ' + res.get_AttentionCode() + ')');
                            if (fail != null)
                                fail();
                            return;
                        }
                        // Si es una excepción de seguridad
                        if (res.get_RequestSeq() == -2) {
                            alert(res.get_Message() + ' (#: ' + res.get_AttentionCode() + ')');
                            if (fail != null)
                                fail();
                            return;
                        }
                        // devuelvo el objeto de respuesta
                        if (typeof callback === "function") {
                            if (res.get_Results().length == 1) {
                                callback(res.get_Results()[0].get_ReturnObject());
                            }
                        }
                    })
                        .fail(function (jqXHR, textStatus, errorThrown) {
                        alert('No se ha podido establecer comunicación con el servidor, #: ' + jqXHR.status);
                        if (fail != null)
                            fail();
                        return;
                        //throw (errorThrown);
                        // registro y búsqueda de servidor alternativo
                    })
                        .always(function () {
                    });
                }
                static ServiceMultiCall(Calls, callback, fail) {
                    var req = new nMorph.framework.svc.msg.RequestMessage();
                    req.set_RequestSeq(100);
                    req.set_SessionID("");
                    req.set_Calls(Calls);
                    // Serializo objetos utilizando serialización nativa
                    var PostSend = nMorph.core.proxy.tools.Packager.Serialize(req);
                    // hago la llamada al servicio y obtengo el encriptado de retorno
                    $.ajax({
                        url: this.ConnectionURL(),
                        type: 'POST',
                        dataType: 'text',
                        data: PostSend,
                        contentType: 'text/plain; charset=UTF-8',
                        mimeType: 'text/plain',
                        crossDomain: true,
                        cache: false,
                    })
                        .done(function (PostReturn) {
                        if (!PostReturn || PostReturn == "") {
                            alert("No se ha recibido respuesta del servidor.");
                            fail();
                            return;
                        }
                        var res = new nMorph.framework.svc.msg.ResponseMessage();
                        // Deserializa respuesta utilizando serializador Nativo
                        res = nMorph.core.proxy.tools.Packager.Unserialize(PostReturn);
                        // Si es una excepción de infraestructura
                        if (res.get_RequestSeq() == -3) {
                            alert("Ha ocurrido un error en el procesamiento de su pedido. Por favor tome contacto con el administrador del sistema y proporciónele el siguiente código de error: " + res.get_AttentionCode());
                            fail();
                            return;
                        }
                        // Si es una excepción de logica
                        if (res.get_RequestSeq() == -1) {
                            alert(res.get_Message() + ' (#: ' + res.get_AttentionCode() + ')');
                            fail();
                            return;
                        }
                        // Si es una excepción de seguridad
                        if (res.get_RequestSeq() == -2) {
                            alert(res.get_Message() + ' (#: ' + res.get_AttentionCode() + ')');
                            fail();
                            return;
                        }
                        // devuelvo el objeto de respuesta
                        if (typeof callback === "function") {
                            for (var i = 0; i <= res.get_Results().length - 1; i++) {
                                callback(res.get_Results()[i].get_ReturnObject(), res.get_Results()[i].get_Name());
                            }
                        }
                    })
                        .fail(function (jqXHR, textStatus, errorThrown) {
                        alert('No se ha podido establecer comunicación con el servidor, #: ' + jqXHR.status);
                        fail();
                        return;
                    })
                        .always(function () {
                    });
                }
            }
            js.Proxy = Proxy;
        })(js = assets.js || (assets.js = {}));
    })(assets = ui.assets || (ui.assets = {}));
})(ui || (ui = {}));
var nMorph;
(function (nMorph) {
    var core;
    (function (core) {
        var db;
        (function (db) {
            var sw_todolist;
            (function (sw_todolist) {
                class Task_VTA {
                }
                sw_todolist.Task_VTA = Task_VTA;
            })(sw_todolist = db.sw_todolist || (db.sw_todolist = {}));
        })(db = core.db || (core.db = {}));
    })(core = nMorph.core || (nMorph.core = {}));
})(nMorph || (nMorph = {}));
$hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Task_VTA"] = nMorph.core.db.sw_todolist.Task_VTA;
var nMorph_core_db_sw_todolist_Task_VTA = $hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Task_VTA"] = function () { };
$hx_exports["nMorph.core.db.sw_todolist.Task_VTA"] = nMorph.core.db.sw_todolist.Task_VTA;
$hxc["nMorph.core.db.sw_todolist.Task_VTA"] = nMorph.core.db.sw_todolist.Task_VTA;
nMorph.core.db.sw_todolist.Task_VTA.__name__ = "nMorph.core.db.sw_todolist.Task_VTA";
nMorph.core.db.sw_todolist.Task_VTA.prototype = {
    TaskId: null,
    PersonId: null,
    FullName: null,
    Email: null,
    CategoryId: null,
    CategoryName: null,
    Title: null,
    Description: null,
    CreatedAt: null,
    DueDate: null,
    IsCompleted: null,
    __class__: nMorph.core.db.sw_todolist.Task_VTA
};
(function (nMorph) {
    var core;
    (function (core) {
        var db;
        (function (db) {
            var sw_todolist;
            (function (sw_todolist) {
                class Task {
                }
                sw_todolist.Task = Task;
            })(sw_todolist = db.sw_todolist || (db.sw_todolist = {}));
        })(db = core.db || (core.db = {}));
    })(core = nMorph.core || (nMorph.core = {}));
})(nMorph || (nMorph = {}));
$hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Task"] = nMorph.core.db.sw_todolist.Task;
var nMorph_core_db_sw_todolist_Task = $hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Task"] = function () { };
$hx_exports["nMorph.core.db.sw_todolist.Task"] = nMorph.core.db.sw_todolist.Task;
$hxc["nMorph.core.db.sw_todolist.Task"] = nMorph.core.db.sw_todolist.Task;
nMorph.core.db.sw_todolist.Task.__name__ = "nMorph.core.db.sw_todolist.Task";
nMorph.core.db.sw_todolist.Task.prototype = {
    TaskId: null,
    PersonId: null,
    CategoryId: null,
    Title: null,
    Description: null,
    CreatedAt: null,
    DueDate: null,
    IsCompleted: null,
    __class__: nMorph.core.db.sw_todolist.Task
};
(function (nMorph) {
    var core;
    (function (core) {
        var db;
        (function (db) {
            var sw_todolist;
            (function (sw_todolist) {
                class Person {
                }
                sw_todolist.Person = Person;
            })(sw_todolist = db.sw_todolist || (db.sw_todolist = {}));
        })(db = core.db || (core.db = {}));
    })(core = nMorph.core || (nMorph.core = {}));
})(nMorph || (nMorph = {}));
$hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Person"] = nMorph.core.db.sw_todolist.Person;
var nMorph_core_db_sw_todolist_Person = $hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Person"] = function () { };
$hx_exports["nMorph.core.db.sw_todolist.Person"] = nMorph.core.db.sw_todolist.Person;
$hxc["nMorph.core.db.sw_todolist.Person"] = nMorph.core.db.sw_todolist.Person;
nMorph.core.db.sw_todolist.Person.__name__ = "nMorph.core.db.sw_todolist.Person";
nMorph.core.db.sw_todolist.Person.prototype = {
    PersonId: null,
    FullName: null,
    Email: null,
    PasswordHash: null,
    Role: null,
    __class__: nMorph.core.db.sw_todolist.Person
};
(function (nMorph) {
    var core;
    (function (core) {
        var db;
        (function (db) {
            var sw_todolist;
            (function (sw_todolist) {
                class Category {
                }
                sw_todolist.Category = Category;
            })(sw_todolist = db.sw_todolist || (db.sw_todolist = {}));
        })(db = core.db || (core.db = {}));
    })(core = nMorph.core || (nMorph.core = {}));
})(nMorph || (nMorph = {}));
$hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Category"] = nMorph.core.db.sw_todolist.Category;
var nMorph_core_db_sw_todolist_Category = $hx_exports["nMorph"]["core"]["db"]["sw_todolist"]["Category"] = function () { };
$hx_exports["nMorph.core.db.sw_todolist.Category"] = nMorph.core.db.sw_todolist.Category;
$hxc["nMorph.core.db.sw_todolist.Category"] = nMorph.core.db.sw_todolist.Category;
nMorph.core.db.sw_todolist.Category.__name__ = "nMorph.core.db.sw_todolist.Category";
nMorph.core.db.sw_todolist.Category.prototype = {
    CategoryId: null,
    CategoryName: null,
    __class__: nMorph.core.db.sw_todolist.Category
};
//# sourceMappingURL=proxy.js.map