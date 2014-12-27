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
import Services.ChefService;
import Services.MissionService;
import beans.Administrateur;
import beans.Chef_de_Groupe;
import beans.Mission;


@WebServlet("/Servlet_ajouter_mission")
public class Servlet_Ajouter_Mission extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
   
	MissionService s = new MissionService();
	AdministrateurService as = new AdministrateurService();
	ChefService cs = new ChefService();

   
    public Servlet_Ajouter_Mission() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		ArrayList<Administrateur> tableau = new ArrayList<Administrateur>();
		ArrayList<Chef_de_Groupe> tableau2 = new ArrayList<Chef_de_Groupe>();

// liste des administrateur
		List<Administrateur> ad = as.Affichage();
		int i=0;
		for (Administrateur admin : ad){
			
			
			tableau.add(admin);
		
            			
			i++;
			
		}
//liste des chefs de groupes		
		List<Chef_de_Groupe> ch = cs.Affichage();
		int i1=0;
		for (Chef_de_Groupe chef : ch){
			
			
			tableau2.add(chef);
		

            			
			i1++;
			
		}
		request.setAttribute("tableau",tableau);
		request.setAttribute("tableau2",tableau2);
	  
		
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutMission.jsp").forward( request, response );

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nommission = request.getParameter("nommission");
		String descmission = request.getParameter("descmission");
		String lieumission = request.getParameter("lieumission");
		String datemission = request.getParameter("datemission");
		String budgetmission = request.getParameter("budgetmission");
		Integer adminmission = (Integer.parseInt(request.getParameter("adminmission")));
		Integer chefmission = (Integer.parseInt(request.getParameter("chefmission")));
		
		Session session=sessionfactory.openSession();	
		Transaction tx=session.beginTransaction();
  		Administrateur a =(Administrateur)session.get(Administrateur.class, adminmission);
  		Chef_de_Groupe c =(Chef_de_Groupe)session.get(Chef_de_Groupe.class, chefmission);


		
		Mission m =  new Mission();
   		
   		m.setnomMission(nommission);
   		m.setBudget(budgetmission);
   		m.setlieuMission(lieumission);
   		m.setdescription(descmission);
   		m.setdateMission(datemission);
   		m.setAdministrateur(a);
   		m.setChef(c);
   		
   		s.enregistrer(m);
	    response.sendRedirect(request.getContextPath() +"/Servlet_consulter_mission");


		
	}

}
