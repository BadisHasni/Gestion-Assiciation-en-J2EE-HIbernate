package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.CategorieService;
import Services.MembreService;
import Services.MissionService;
import Services.Mission_MembreService;
import beans.Categorie;
import beans.Membre;
import beans.Mission;


@WebServlet("/Servlet_affecter_membre")
public class Servlet_Affecter_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MissionService ms = new MissionService();
    MembreService mms = new MembreService();
	Mission_MembreService s = new Mission_MembreService();
   
    public Servlet_Affecter_Membre() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Mission> tableau = new ArrayList<Mission>();
		ArrayList<Membre> tableau2 = new ArrayList<Membre>();

		// liste des missions
				List<Mission> ad = ms.Affichage();
				int i=0;
				for (Mission Mission : ad){
					
					
					tableau.add(Mission);
				
		            			
					i++;
					
				}
				

				// liste des membre
						List<Membre> ad1 = mms.Affichage();
						int i1=0;
						for (Membre membre : ad1){
							
							
							tableau2.add(membre);
						
				            			
							i1++;
							
						}
				request.setAttribute("tableau",tableau);
				request.setAttribute("tableau2",tableau2);
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/affecterMembre.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int mission = (Integer.parseInt(request.getParameter("mission")));
		int membre = (Integer.parseInt(request.getParameter("membre")));
		String durree = request.getParameter("durree");
		
		
				
			s.Affecter_Membre(membre, mission, durree);
			
			response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mem_miss");

		
	}

}
