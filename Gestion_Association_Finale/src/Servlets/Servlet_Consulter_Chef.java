package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Categorie;
import beans.Chef_de_Groupe;

import Services.ChefService;


@WebServlet("/Servlet_consulter_chef")
public class Servlet_Consulter_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ChefService cs = new ChefService();
	
    public Servlet_Consulter_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Chef_de_Groupe> tableau = new ArrayList<Chef_de_Groupe>();

		// liste des Categories
				List<Chef_de_Groupe> ad = cs.Affichage();
				int i=0;
				for (Chef_de_Groupe chef : ad){
					
					
					tableau.add(chef);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
