package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MissionService;
import beans.Administrateur;
import beans.Mission;


@WebServlet("/Servlet_consulter_mission")
public class Servlet_Consulter_Mission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    MissionService ms = new MissionService();
	
    public Servlet_Consulter_Mission() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Mission> tableau = new ArrayList<Mission>();

		// liste des administrateur
				List<Mission> ad = ms.Affichage();
				int i=0;
				for (Mission mission : ad){
					
					
					tableau.add(mission);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMission.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
