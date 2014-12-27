package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.CategorieService;
import beans.Administrateur;
import beans.Categorie;


@WebServlet("/Servlet_supprimer_categorie")
public class Servlet_Supprimer_Categorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CategorieService cs = new CategorieService();

    
    public Servlet_Supprimer_Categorie() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		//this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterCategorie.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
        Categorie c = new Categorie();
		cs.supprimer(c, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_categorie");
	}

}
