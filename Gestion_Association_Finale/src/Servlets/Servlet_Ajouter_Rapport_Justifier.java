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
import beans.RapportJustifier;


@WebServlet("/Servlet_ajouter_rapport_justifier")
public class Servlet_Ajouter_Rapport_Justifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	   
		RapportService s = new RapportService();
		MissionService ms = new MissionService();
   
	
    public Servlet_Ajouter_Rapport_Justifier() {
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
		
		
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutRapportJustifier.jsp").forward( request, response );

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
		String justification = request.getParameter("justification");

		
		Integer mission = (Integer.parseInt(request.getParameter("mission")));
		
		Session session1=sessionfactory.openSession();	
		Transaction tx1=session1.beginTransaction();
		Mission a =(Mission)session1.get(Mission.class, mission);
		tx1.commit();
		session1.close();
		
		RapportJustifier rj = new RapportJustifier();  
		
		    rj.setDescription(descchef);
		    rj.setLieu_mission(lieuchef);
		    rj.setDate_mission(datechef);
		    rj.setDuree_mission(durrechef);
	  		rj.setBudget_totale(BTchef);
	  		rj.setBudget_hebergement(BHchef);
	  		rj.setBudget_nourriture(BNchef);
	  		rj.setBudget_transport(BTRchef);
	  		rj.setDons(donchef);
	  		rj.setAutre_depence(ADchef);
	  		rj.setMission(a);
	  		rj.setJustifier(justification);
  		
	  		s.enregistrer(rj);
	  		
	  		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_rapport_par_chef");
		//	this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterRapport.jsp").forward( request, response );

	}
	

}
