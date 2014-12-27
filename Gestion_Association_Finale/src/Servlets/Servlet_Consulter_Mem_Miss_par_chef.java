package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.AdministrateurService;
import Services.Mission_MembreService;
import beans.Administrateur;
import beans.Mission_Membre;


@WebServlet("/Servlet_consulter_mem_miss_par_chef")
public class Servlet_Consulter_Mem_Miss_par_chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       Mission_MembreService mim = new Mission_MembreService();
       
    public Servlet_Consulter_Mem_Miss_par_chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Mission_Membre> tableau = new ArrayList<Mission_Membre>();

		// liste des Mission_Membre
				List<Mission_Membre> ad = mim.Affichage();
				int i=0;
				for (Mission_Membre mm : ad){
					
					
					tableau.add(mm);
				
		            			
					i++;
					
				}
		
				request.setAttribute("tableau",tableau);

 		this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterMissionMembreParChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
