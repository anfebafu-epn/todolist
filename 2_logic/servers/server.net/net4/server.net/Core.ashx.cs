using nMorph.framework.svc.exceptions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace nMorph.core.nest.net4
{
    /// <summary>
    /// Summary description for Core
    /// </summary>
    public class Core : IHttpHandler
    {
        /// <summary>
        /// Método de procesamiento de pedidos Nativo Haxe
        /// </summary>
        /// <param name="context"></param>
        public void ProcessRequest(HttpContext context)
        {
            String ResData;
            String PostData = "";
            try
            {
                // lee el contenido plano de la ejecución
                PostData = System.Text.Encoding.UTF8.GetString(context.Request.BinaryRead(context.Request.ContentLength));

                // sino está vacío
                if (PostData == "")
                {
                    context.Response.Clear();
                    context.Response.ClearHeaders();
                    context.Response.ContentType = "text/plain";
                    context.Response.AddHeader("Access-Control-Allow-Origin", "*");
                    context.Response.Write("nMorph Service");
                    context.Response.Flush();
                    //context.Response.End();
                    return;
                }

                // procesa el pedido y obtiene la respuesta de la lógica
                ResData = nMorph.framework.svc.transport.Router.Process(PostData);
            }
            catch (System.Exception ex)
            {
                {
                    global::haxe.NativeStackTrace.exception = ((global::System.Exception)(((object)(ex))));
                }

                global::haxe.Exception _g3 = global::haxe.Exception.caught(ex);
                object _g4 = _g3.unwrap();
                {
                    global::haxe.Exception ex2 = _g3;
                    ResData = global::nMorph.framework.svc.exceptions.ExceptionManager.HandleException(ex2, PostData, null, null, null, null, null);
                }

                return;
            }

            context.Response.Clear();
            context.Response.ClearHeaders();
            context.Response.ContentType = "text/plain";
            context.Response.AddHeader("Access-Control-Allow-Origin", "*");
            context.Response.Write(ResData);
            context.Response.Flush();
            context.Response.End();
        }

        /// <summary>
        /// El servicio es reusable (es sessionless)
        /// </summary>
        public bool IsReusable
        {
            get
            {
                return true;
            }
        }
    }
}