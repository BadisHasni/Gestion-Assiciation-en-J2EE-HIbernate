package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.CategorieService;
import beans.Categorie;


@WebServlet("/Servlet_modifier_categorie")
public class Servlet_Modifier_Categorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CategorieService cs = new CategorieService();

    
    public Servlet_Modifier_Categorie() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierCategorie.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String nomcat = request.getParameter("nomcat");
		String desccat = request.getParameter("desccat");
		
		Categorie c = new Categorie();
		c.setNomCategorie(nomcat);
		c.setDescription(desccat);
		
		cs.modification(c, id);
		
		
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_categorie");

	}

}
