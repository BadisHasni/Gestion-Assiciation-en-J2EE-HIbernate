package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.ChefService;
import beans.Categorie;
import beans.Chef_de_Groupe;


@WebServlet("/Servlet_supprimer_chef")
public class Servlet_Supprimer_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ChefService cs = new ChefService();
    
    public Servlet_Supprimer_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		//this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        int id = Integer.parseInt(request.getParameter("id"));
		
        Chef_de_Groupe c = new Chef_de_Groupe();
		cs.supprimer(c, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_chef");
		
	}

}
