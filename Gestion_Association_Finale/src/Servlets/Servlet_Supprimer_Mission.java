package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MissionService;
import beans.Administrateur;
import beans.Mission;


@WebServlet("/Servlet_supprimer_mission")
public class Servlet_Supprimer_Mission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MissionService ms = new MissionService();
	
    
    public Servlet_Supprimer_Mission() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMission.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		 Mission a1 = new Mission();
		 ms.supprimer(a1, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mission");
	}

}
