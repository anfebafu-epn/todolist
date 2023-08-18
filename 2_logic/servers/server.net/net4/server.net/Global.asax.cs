using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Routing;


namespace nMorph.core.nest.net4
{
    /// <summary>
    /// Clase base de configuración global
    /// </summary>
    public class WebApiApplication : System.Web.HttpApplication
    {
        /// <summary>
        /// Método de inicio de aplicación
        /// </summary>
        protected void Application_Start()
        {
            // Lectura de configuraciones

            //UAT
            //nMorph.core.service.configuration.Initializer.Application_Start(Server.MapPath("~") + "\\..\\config\\");

            //DEV
            nMorph.core.service.configuration.Initializer.Application_Start(Server.MapPath("~") + "..\\..\\..\\config\\");

            // Inicialización de librerías, para que puedan ser vistas por el serializador
            nMorph.core.objects.Objects.main();
            nMorph.core.logic.Logic.main();
            nMorph.core.db.Db.main();
            nMorph.core.service.Service.main();
        }
    }
}
