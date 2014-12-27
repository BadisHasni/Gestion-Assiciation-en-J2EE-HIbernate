package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.CategorieService;
import beans.Categorie;


@WebServlet("/Servlet_ajouter_categorie")
public class Servlet_Ajouter_Categorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	CategorieService s = new CategorieService();
   
    public Servlet_Ajouter_Categorie() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutCategorie.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomcat = request.getParameter("nomcat");
		String desccat = request.getParameter("desccat");
		
		Categorie c = new Categorie();
			c.setNomCategorie(nomcat);
			c.setDescription(desccat);
				
			s.enregistrer(c);
			
			response.sendRedirect(request.getContextPath() +"/Servlet_consulter_categorie");

		
	}

}
