package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import persistance.HibernateUtil;

import DAO.AbstractDAOFactory;
import DAO.DAO;
import Services.AdministrateurService;
import Services.MissionService;
import Services.RapportService;
import beans.Administrateur;
import beans.Mission;
import beans.RapportInterAdmin;


@WebServlet("/Servlet_ajouter_rapport_IA")
public class Servlet_Ajouter_Rapport_IA extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	   
		RapportService s = new RapportService();
		MissionService ms = new MissionService();
   
	
    public Servlet_Ajouter_Rapport_IA() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Mission> tableau = new ArrayList<Mission>();

		// liste des missions
				List<Mission> ad = ms.Affichage();
				int i=0;
				for (Mission Mission : ad){
					
					
					tableau.add(Mission);
				
		            			
					i++;
					
				}
				request.setAttribute("tableau",tableau);
		
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutRapportIAdmin.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String descchef = request.getParameter("descchef");
		String lieuchef = request.getParameter("lieuchef");
		String datechef = request.getParameter("datechef");
		String durrechef = request.getParameter("durrechef");
		Integer BTchef = (Integer.parseInt(request.getParameter("BTchef")));
		Integer BHchef = (Integer.parseInt(request.getParameter("BHchef")));
		Integer BNchef = (Integer.parseInt(request.getParameter("BNchef")));
		Integer BTRchef = (Integer.parseInt(request.getParameter("BTRchef")));
		Integer donchef = (Integer.parseInt(request.getParameter("donchef")));
		Integer ADchef = (Integer.parseInt(request.getParameter("ADchef")));
		String Rqadmin = request.getParameter("Rqadmin");

		
		Integer mission = (Integer.parseInt(request.getParameter("mission")));
		
		Session session1=sessionfactory.openSession();	
		Transaction tx1=session1.beginTransaction();
		Mission a =(Mission)session1.get(Mission.class, mission);
		tx1.commit();
		session1.close();
		
		  
		    RapportInterAdmin ri = new RapportInterAdmin();
		    ri.setDescription(descchef);
		    ri.setLieu_mission(lieuchef);
		    ri.setDate_mission(datechef);
		    ri.setDuree_mission(durrechef);
	  		ri.setBudget_totale(BTchef);
	  		ri.setBudget_hebergement(BHchef);
	  		ri.setBudget_nourriture(BNchef);
	  		ri.setBudget_transport(BTRchef);
	  		ri.setDons(donchef);
	  		ri.setAutre_depence(ADchef);
	  		ri.setMission(a);
	  		ri.setRemarqueAdm(Rqadmin);
  		
	  		s.enregistrer(ri);
	  		
	  		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_rapport_par_chef");
		//	this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterRapport.jsp").forward( request, response );

	}
	

}
