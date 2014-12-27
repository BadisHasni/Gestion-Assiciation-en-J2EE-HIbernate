package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.RapportService;
import beans.Administrateur;
import beans.Rapport;


@WebServlet("/Servlet_consulter_rapport_par_chef")
public class Servlet_Consulter_Rapport_Par_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    RapportService rs = new RapportService();
	
    public Servlet_Consulter_Rapport_Par_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		ArrayList<Rapport> tableau = new ArrayList<Rapport>();

		// liste des rapports
				List<Rapport> ad = rs.Affichage();
				int i=0;
				for (Rapport rapport : ad){
					
					
					tableau.add(rapport);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);	
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterRapportParChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
