package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/connexion")
public class Connexion extends HttpServlet{

	
	
	    public static final String VUE = "/WEB-INF/index.jsp";
	  
	  
    
	    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	        /* Affichage de la page de connexion */
	        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	    }

	    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	       
	    	

	        /* Récupération de la session depuis la requête */
	        HttpSession session = request.getSession();
	    
	        String login =request.getParameter("login");
			String pwd=request.getParameter("pwd");
	        String categorie=request.getParameter("categorie");
	       
	        
			if(login.equals("badis") && pwd.equals("badis")) {
				
				session.setAttribute("login", login);
				session.setAttribute("pwd", pwd);
				response.sendRedirect(request.getContextPath() +"/ServletAdmin");
	        

	        }else if(login.equals("safar") && pwd.equals("safar")){
	        	
	        	session.setAttribute("login", login);
				session.setAttribute("pwd", pwd);
				response.sendRedirect(request.getContextPath() +"/ServletChef");
	        
	        }else if(login.equals("hasni") && pwd.equals("hasni")) {
	        	
	        	session.setAttribute("login", login);
				session.setAttribute("pwd", pwd);
				response.sendRedirect(request.getContextPath() +"/ServletMembre");

	        	
	        	
	        }else{
	        	
	        	session.setAttribute("login", login);
		         
	            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	        }
			

	    }
	
}
