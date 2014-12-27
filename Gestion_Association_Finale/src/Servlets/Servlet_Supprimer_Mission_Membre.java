package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Administrateur;
import beans.Mission_Membre;

import Services.AdministrateurService;
import Services.Mission_MembreService;


@WebServlet("/Servlet_supprimer_mission_membre")
public class Servlet_Supprimer_Mission_Membre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Mission_MembreService s =new Mission_MembreService();
    
    public Servlet_Supprimer_Mission_Membre() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int idMM = Integer.parseInt(request.getParameter("idMM"));
		
		 Mission_Membre mm = new Mission_Membre();
		 s.supprimer(mm, idMM);
		 
	 	response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mem_miss");
		
	}

}
