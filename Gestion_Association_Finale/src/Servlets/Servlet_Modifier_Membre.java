package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MembreService;
import beans.Membre;


@WebServlet("/Servlet_modifier_membre")
public class Servlet_Modifier_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MembreService ms = new MembreService();
    
    public Servlet_Modifier_Membre() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierMembre.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
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
    		
    		
    	   ms.modification(mm, id);
		
		
		
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_membre");
 		//this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMembre.jsp").forward( request, response );

	}

}
