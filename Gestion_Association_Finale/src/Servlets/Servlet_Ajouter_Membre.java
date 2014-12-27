package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Membre;

import Services.MembreService;


@WebServlet("/Servlet_ajouter_membre")
public class Servlet_Ajouter_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MembreService s = new MembreService();
	
   
    public Servlet_Ajouter_Membre() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutMembre.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nommembre = request.getParameter("nommembre");
		String prenommembre = request.getParameter("prenommembre");
		String mailmembre = request.getParameter("mailmembre");
		String datemembre = request.getParameter("datemembre");
		String loginmembre = request.getParameter("loginmembre");
		String pwdmembre = request.getParameter("pwdmembre");
		Integer agemembre = (Integer.parseInt(request.getParameter("agemembre")));
		String  civilité = request.getParameter("civilité");
		
		
		  Membre mm = new Membre();
    	    mm.setNom(nommembre);
    	    mm.setPrenom(prenommembre);
    	    mm.setAge(agemembre);
    	    mm.setMail(mailmembre);
    	    mm.setDate_naissance(datemembre);
    	    mm.setMdp(pwdmembre);
    	    mm.setLogin(loginmembre);
    	    mm.setSexe(civilité);
    		
    		
    	   s.enregistrer(mm);
    	    
    	   response.sendRedirect(request.getContextPath() +"/Servlet_consulter_membre");
		
	}

}
