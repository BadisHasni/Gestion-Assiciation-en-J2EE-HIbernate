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

import Services.AdministrateurService;
import Services.MissionService;
import Services.RapportService;
import beans.Administrateur;
import beans.Chef_de_Groupe;
import beans.Mission;
import beans.Rapport;
import beans.RapportInterAdmin;


@WebServlet("/Servlet_modifier_rapport_par_chef")
public class Servlet_Modifier_Rapport_Par_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
    RapportService rs = new RapportService();
    MissionService ms = new MissionService();
    
    public Servlet_Modifier_Rapport_Par_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
        ArrayList<Mission> tableau2 = new ArrayList<Mission>();
		
		//liste des Missions		
				List<Mission> ch = ms.Affichage();
				int i1=0;
				for (Mission miss : ch){
					
					
					tableau2.add(miss);
				

		            			
					i1++;
					
				}
				request.setAttribute("tableau2",tableau2);
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);

		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierRapportParChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
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
        int mission = (Integer.parseInt(request.getParameter("mission")));
		
		Session session=sessionfactory.openSession();	
		Transaction tx=session.beginTransaction();
  	
  		Mission c =(Mission)session.get(Mission.class, mission);
		
		  Rapport r = new Rapport();
		    r.setDescription(descchef);
		    r.setLieu_mission(lieuchef);
		    r.setDate_mission(datechef);
		    r.setDuree_mission(durrechef);
	  		r.setBudget_totale(BTchef);
	  		r.setBudget_hebergement(BHchef);
	  		r.setBudget_nourriture(BNchef);
	  		r.setBudget_transport(BTRchef);
	  		r.setDons(donchef);
	  		r.setAutre_depence(ADchef);
	  		r.setMission(c);
	  		
	  		rs.modification(r, id);
		
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_rapport_par_chef");

	}

}
