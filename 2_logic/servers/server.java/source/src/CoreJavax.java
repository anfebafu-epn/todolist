package nMorph.core.nest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Core
 */
//@WebServlet(description = "nMorph Core Servlet", urlPatterns = { "/Core" })
public class Core extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Core() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// Lectura de configuración desde la carpeta
        nMorph.core.service.configuration.Initializer.Application_Start("C:\\Workspace_Products\\nMorph - Framework\\1. DEV\\nMorph\\2_logic\\servers\\config\\");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("ABF: Served at: ").append(request.getContextPath());
		response.getWriter().append("nMorph Core");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ResData;
        String PostData = "";
        try
        {
            // lee el contenido plano de la ejecución
            PostData = getBody(request);

            // sino está vacío
            if (PostData == "") return;

            // procesa el pedido y obtiene la respuesta de la lógica
            ResData = nMorph.framework.svc.transport.Router.Process(PostData);
        }
        catch (Exception ex)
        {
//            {
//                haxe.NativeStackTrace.exception = ex;
//            }

            haxe.Exception _g3 = haxe.Exception.caught(ex);
            Object _g4 = _g3.unwrap();
            {
                haxe.Exception ex2 = _g3;
                ResData = nMorph.framework.svc.exceptions.ExceptionManager.HandleException(ex2, PostData, null, null, null, null, null);
            }
        }
        
        response.setContentType("text/plain");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.getWriter().append(ResData);
	}
	
	public static String getBody(HttpServletRequest request) throws IOException {

	    String body = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = null;

	    try {
	        InputStream inputStream = request.getInputStream();
	        if (inputStream != null) {
	            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	            char[] charBuffer = new char[128];
	            int bytesRead = -1;
	            while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
	                stringBuilder.append(charBuffer, 0, bytesRead);
	            }
	        } else {
	            stringBuilder.append("");
	        }
	    } catch (IOException ex) {
	        throw ex;
	    } finally {
	        if (bufferedReader != null) {
	            try {
	                bufferedReader.close();
	            } catch (IOException ex) {
	                throw ex;
	            }
	        }
	    }

	    body = stringBuilder.toString();
	    return body;
	}

	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
