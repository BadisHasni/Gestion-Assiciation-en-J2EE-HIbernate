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
import beans.Administrateur;
import beans.Categorie;


@WebServlet("/Servlet_consulter_categorie")
public class Servlet_Consulter_Categorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	CategorieService cs = new CategorieService();
	
    public Servlet_Consulter_Categorie() {
        super();
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Categorie> tableau = new ArrayList<Categorie>();

		// liste des Categories
				List<Categorie> ad = cs.Affichage();
				int i=0;
				for (Categorie cat : ad){
					
					
					tableau.add(cat);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterCategorie.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
