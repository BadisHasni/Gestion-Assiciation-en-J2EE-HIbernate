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
import Services.MissionService;
import beans.Categorie;
import beans.Mission;


@WebServlet("/Servlet_affecter_categorie")
public class Servlet_Affecter_Categorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MissionService ms = new MissionService();

	CategorieService s = new CategorieService();
   
    public Servlet_Affecter_Categorie() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Mission> tableau = new ArrayList<Mission>();
		ArrayList<Categorie> tableau2 = new ArrayList<Categorie>();

		// liste des missions
				List<Mission> ad = ms.Affichage();
				int i=0;
				for (Mission Mission : ad){
					
					
					tableau.add(Mission);
				
		            			
					i++;
					
				}
				

				// liste des missions
						List<Categorie> ad1 = s.Affichage();
						int i1=0;
						for (Categorie categorie : ad1){
							
							
							tableau2.add(categorie);
						
				            			
							i1++;
							
						}
				request.setAttribute("tableau",tableau);
				request.setAttribute("tableau2",tableau2);
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/affecterCategorie.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int mission = (Integer.parseInt(request.getParameter("mission")));
		int categorie = (Integer.parseInt(request.getParameter("categorie")));
		
		
				
			s.Affecter_une_cat(mission, categorie);
			
			response.sendRedirect(request.getContextPath() +"/Servlet_consulter_categorie");

		
	}

}
