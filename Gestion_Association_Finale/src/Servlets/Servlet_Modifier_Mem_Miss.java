package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.AdministrateurService;
import Services.Mission_MembreService;
import beans.Administrateur;
import beans.Mission_Membre;


@WebServlet("/Servlet_modifier_mem_miss")
public class Servlet_Modifier_Mem_Miss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Mission_MembreService s = new Mission_MembreService();
    
    public Servlet_Modifier_Mem_Miss() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idMM = Integer.parseInt(request.getParameter("idMM"));
		int idM = Integer.parseInt(request.getParameter("idM"));
		request.setAttribute("idMM", idMM);
		request.setAttribute("idM", idM);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierMembreMission.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idMM = Integer.parseInt(request.getParameter("idMM"));
		int idM = Integer.parseInt(request.getParameter("idM"));
		String durree = request.getParameter("durree");
		
		
		Mission_Membre m = new Mission_Membre();
		    m.getId().setIdMembre(idMM);
		    m.getId().setIdMission(idM);
		    
		    m.setDurree(durree);
		    
		    s.Modifier_Membre_Mission(m, 0);
	
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mem_miss");

	}

}
