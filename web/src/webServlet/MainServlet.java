package webServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(
		urlPatterns = { "/MainServlet" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "admin"), 
				@WebInitParam(name = "pwd", value = "1234567")
		})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String userInitParam;
	private String pwdInitParam;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		super.init();
		//récupérer les valeurs des paramètres d'initialisation de la servlet
		userInitParam = this.getInitParameter("user");
		pwdInitParam = this.getInitParameter("pwd");
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"+
						"<head>"+
							"<title>Exemple getInitParameter()</title>"+
						"</head>"+
						"<body>Récupération des paramètres d'initialisation de la servlet"+
						" à partir du fichier web.xml : objet ServletConfig : <br>" + "- User = "+
						userInitParam+" <br>- Password = "+
						pwdInitParam);
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
