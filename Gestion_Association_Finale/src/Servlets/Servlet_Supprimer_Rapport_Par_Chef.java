package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.RapportService;
import beans.Mission;
import beans.Rapport;


@WebServlet("/Servlet_supprimer_rapport_par_chef")
public class Servlet_Supprimer_Rapport_Par_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	RapportService rs = new RapportService();
    
    public Servlet_Supprimer_Rapport_Par_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		//this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterRapport.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		 Rapport a1 = new Rapport();
		 rs.supprimer(a1, id);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_rapport_par_chef");
	}

}
