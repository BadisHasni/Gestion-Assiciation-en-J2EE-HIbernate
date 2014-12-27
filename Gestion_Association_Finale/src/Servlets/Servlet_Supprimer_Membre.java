package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MembreService;
import beans.Administrateur;
import beans.Membre;


@WebServlet("/Servlet_supprimer_membre")
public class Servlet_Supprimer_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    MembreService ms = new MembreService();
	
    public Servlet_Supprimer_Membre() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMembre.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		 Membre m = new Membre();
		 ms.supprimer(m, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_membre");
	
	}

}
