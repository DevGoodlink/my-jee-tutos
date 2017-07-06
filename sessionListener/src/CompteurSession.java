

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompteurSession
 */
@WebServlet("/CompteurSession")
public class CompteurSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CompteurSession() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.getSession().setMaxInactiveInterval(25);
		
		response.setContentType("text/html");
		out.println("<html>"+
				"<head>"+
					"<title>Exemple compteur de session avec httpSessionListener</title>"+
				"</head>"+
				"<body>");
		out.println("<p> Nombre de personne connectées est = "+SessionListner.compteur);
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
