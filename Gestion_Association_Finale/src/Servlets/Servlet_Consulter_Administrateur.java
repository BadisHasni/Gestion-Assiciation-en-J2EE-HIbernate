package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.AdministrateurService;
import beans.Administrateur;


@WebServlet("/Servlet_consulter_administrateur")
public class Servlet_Consulter_Administrateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AdministrateurService as = new AdministrateurService();
    
    public Servlet_Consulter_Administrateur() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Administrateur> tableau = new ArrayList<Administrateur>();

		// liste des administrateur
				List<Administrateur> ad = as.Affichage();
				int i=0;
				for (Administrateur admin : ad){
					
					
					tableau.add(admin);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);

 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterAdmin.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
