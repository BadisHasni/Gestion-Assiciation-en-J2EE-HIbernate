package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.AdministrateurService;
import beans.Administrateur;


@WebServlet("/Servlet_modifier_administrateur")
public class Servlet_Modifier_Administrateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdministrateurService s = new AdministrateurService();

    
    public Servlet_Modifier_Administrateur() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);

		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierAdmin.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		String nomadmin = request.getParameter("nomadmin");
		String prenomadmin = request.getParameter("prenomadmin");
		String mailadmin = request.getParameter("mailadmin");
		String dateadmin = request.getParameter("dateadmin");
		String Loginadmin = request.getParameter("loginadmin");
		String mdpadmin = request.getParameter("mdpadmin");
		
		Administrateur adm=new Administrateur();
			adm.setNom(nomadmin);
			adm.setPrenom(prenomadmin);
			adm.setDate_naissance(dateadmin);
			adm.setLogin(Loginadmin);
			adm.setMail(mailadmin);
			adm.setMdp(mdpadmin);
			
			
			
			s.modification(adm, id);
		
		
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_administrateur");
 		//this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterAdmin.jsp").forward( request, response );

	}

}
