package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Membre;

import Services.MembreService;


@WebServlet("/Servlet_consulter_membre_par_chef")
public class Servlet_Consulter_Membre_Par_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MembreService ms = new MembreService();
	
    public Servlet_Consulter_Membre_Par_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Membre> tableau = new ArrayList<Membre>();

		// liste des administrateur
				List<Membre> ad = ms.Affichage();
				int i=0;
				for (Membre membre : ad){
					
					
					tableau.add(membre);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMembreParChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
