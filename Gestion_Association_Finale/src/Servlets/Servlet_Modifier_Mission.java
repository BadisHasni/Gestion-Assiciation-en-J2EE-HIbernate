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

import Services.ChefService;
import Services.MissionService;
import beans.Administrateur;
import beans.Chef_de_Groupe;
import beans.Mission;


@WebServlet("/Servlet_modifier_mission")
public class Servlet_Modifier_Mission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	MissionService ms = new MissionService();
    ChefService cs = new ChefService();
	
    public Servlet_Modifier_Mission() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Chef_de_Groupe> tableau2 = new ArrayList<Chef_de_Groupe>();
		
		//liste des chefs de groupes		
				List<Chef_de_Groupe> ch = cs.Affichage();
				int i1=0;
				for (Chef_de_Groupe chef : ch){
					
					
					tableau2.add(chef);
				

		            			
					i1++;
					
				}
				request.setAttribute("tableau2",tableau2);
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierMission.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String nommission = request.getParameter("nommission");
		String descmission = request.getParameter("descmission");
		String lieumission = request.getParameter("lieumission");
		String datemission = request.getParameter("datemission");
		String budgetmission = request.getParameter("budgetmission");
		int chefmission = (Integer.parseInt(request.getParameter("chefmission")));
		
		Session session=sessionfactory.openSession();	
		Transaction tx=session.beginTransaction();
  	
  		Chef_de_Groupe c =(Chef_de_Groupe)session.get(Chef_de_Groupe.class, chefmission);
				
          Mission m =  new Mission();
   		
   		m.setnomMission(nommission);
   		m.setBudget(budgetmission);
   		m.setlieuMission(lieumission);
   		m.setdescription(descmission);
   		m.setdateMission(datemission);
   		m.setChef(c);
   		
   		ms.modification(m, id);
	    response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mission");
		
	}

}
