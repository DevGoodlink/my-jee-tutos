

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serveletInfo
 */
@WebServlet("/serveletInfo")
public class serveletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.log("ok");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Servelet Info</title></head>");
		out.println("<body>");
		out.println(new Date());
		out.println("<h1>Exemple d'information sur la requête </h1>");
		out.println("<ul>");
		out.println("<li>");out.println("Methode : "+request.getMethod()+"</li>");
		out.println("<li>");out.println("Request URI : "+request.getRequestURI()+"</li>");
		out.println("<li>");out.println("Protocole : "+request.getProtocol()+"</li>");
		out.println("<li>");out.println("Pathinfo : "+request.getPathInfo()+"</li>");
		out.println("<li>");out.println("Remote Addresse : "+request.getRemoteAddr()+"</li>");
		out.println("</ul>");
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
