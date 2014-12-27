package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MembreService;
import beans.Administrateur;
import beans.Membre;


@WebServlet("/Servlet_consulter_membre")
public class Servlet_Consulter_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    MembreService ms = new MembreService();
	
    public Servlet_Consulter_Membre() {
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
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMembre.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
