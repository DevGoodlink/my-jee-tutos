package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletCount
 */
@WebServlet("/ServletCount")
public class ServletCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
       
	@Override
	public void init() throws ServletException {
		super.init();
		context = this.getServletContext();
		context.setAttribute("Compteur", new Integer(0));
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		out.println("<html>"+
				"<head>"+
					"<title>Exemple compteur de session</title>"+
				"</head>"+
				"<body>");
		
		
		if(hs.isNew()){
			int cpt = (int) context.getAttribute("Compteur");
			cpt=cpt+1;
			context.setAttribute("Comtpeur", new Integer(cpt));
	
		}else{
			out.println("Déja connecté");
		}
		out.println("<p>Nombre de personne connecté = "+(int) context.getAttribute("Compteur"));
		out.println("</p><a href='Deconnecter?dec=ok'>Se déconnecter  <a/>");
		out.println("</body></html>");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
