package weblayer.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.businesslogiclayer.NoteDAO;
import weblayer.bean.BeanNote;
import modele.businesslogiclayer.*;

/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet("/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vue =null;
		String numIns = request.getParameter("numIns");
		if(numIns==null){
			vue="/weblayer/vue/vueNotes.jsp";
		}else{
			if(numIns.equals("")){
				vue="/weblayer/vue/Erreur.jsp";
			}else{
				BeanNote beanNote = new BeanNote();
				beanNote.setNumIns(numIns);
				NoteDAO dao = new NoteDAO();
				beanNote.setNotes(dao.findByNumInsEle(numIns));
				HttpSession session = request.getSession();
				session.setAttribute("beanNote", beanNote);
				vue="/weblayer/vue/vueNotes.jsp";
			}
			
			
		}
		//transfére du controle à la vue
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
