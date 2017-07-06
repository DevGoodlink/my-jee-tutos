package webWithAnnotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servelet
 */
@WebServlet(
		urlPatterns = { "/servelet" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "Admin"), 
				@WebInitParam(name = "pwd", value = "1234567")
		})
public class servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String initParamUser;
    private String initParamPwd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init();
		initParamUser = config.getInitParameter("user");
		initParamPwd=config.getInitParameter("pwd");
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
						initParamUser+" <br>- Password = "+
						initParamPwd);
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
