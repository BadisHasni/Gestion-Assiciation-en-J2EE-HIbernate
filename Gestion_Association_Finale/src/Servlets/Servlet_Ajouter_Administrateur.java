package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import DAO.AbstractDAOFactory;
import DAO.DAO;
import Services.AdministrateurService;
import beans.Administrateur;


@WebServlet("/Servlet_ajouter_administrateur")
public class Servlet_Ajouter_Administrateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
		AdministrateurService s = new AdministrateurService();
   
	
    public Servlet_Ajouter_Administrateur() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutAdmin.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
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
			
			
			
			s.enregistrer(adm);
  		

  			response.sendRedirect(request.getContextPath() +"/Servlet_consulter_administrateur");
	}
	

}
