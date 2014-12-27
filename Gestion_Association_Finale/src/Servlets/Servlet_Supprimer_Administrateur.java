package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Administrateur;

import Services.AdministrateurService;


@WebServlet("/Servlet_supprimer_administrateur")
public class Servlet_Supprimer_Administrateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdministrateurService s = new AdministrateurService();
    
    public Servlet_Supprimer_Administrateur() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		 Administrateur a1 = new Administrateur();
		 s.supprimer(a1, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_administrateur");
		
	}

}
