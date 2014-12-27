package DAO;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;


import beans.Administrateur;
import beans.Chef_de_Groupe;
import beans.Mission;
import beans.Mission_Membre;
import beans.Rapport;



public class MissionDAO extends DAO<Mission>{

	
	public MissionDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
	
		public void create(Mission m) {
	
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(m);
			tx.commit();
			session.close();
			
		}
		
		
		
		public void delete(Mission m ,int idM) {
	
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			m =(Mission)session.get(Mission.class,idM);
			session.delete(m);
			tx.commit();
			session.close();
		}
		
		
		public void update(Mission m ,int idM) {

			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Mission mm =(Mission)session.get(Mission.class,idM);
			
			mm.setnomMission(m.getnomMission());
			mm.setdescription(m.getdescription());
			mm.setlieuMission(m.getlieuMission());
			mm.setdateMission(m.getdateMission());
			mm.setBudget(m.getBudget());
			mm.getChef().setNom(m.getChef().getNom());
			
			
			
			
				
			//session.update(m);
			tx.commit();
			session.close();	
			
		}
		
		
		public Mission find(int idM) {

			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
            Mission m = (Mission) session.get(Mission.class, idM);
			System.out.println("Id: "+m.getIdMission());
			System.out.println("Nom: "+m.getnomMission());
			System.out.println("Description: "+m.getdescription());
			System.out.println("Lieu: "+m.getlieuMission());
			System.out.println("Date: "+m.getdateMission());
			System.out.println("Budget: "+m.getBudget());
			System.out.println("Id Admin: "+m.getAdministrateur().getIdAdministrateur());
			System.out.println("Id Chef: "+m.getChef().getIdChef());





			return m;
		}
		
		public List<Mission> Afficher(){


			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			return session.createQuery("from Mission").list();
		
		}
		
		
		public void Ajout_Mis_TO_Cat (int idM , int idCA){
			
		}
		
		public void Affichage(Mission m){
			
		}
		

		public Mission Charger(int idC){
			Mission adm = new Mission();
			return adm;
		}
		
		public  void Ajout_Mem_TO_Miss (int idMem , int idMiss , String a){
			
		}
		
		
		public void Chef_Mission(){
				
			
		org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			
			
			Query q=  session.createQuery("from Chef_de_Groupe c join c.mission cm " +
					"where cm.budget>20 ");
					 List l=q.list();
					
					Iterator i=l.iterator();
					while(i.hasNext()){
					Object[] o=(Object[]) i.next();
					Chef_de_Groupe c=(Chef_de_Groupe)o[0];
					Mission cm=(Mission)o[1];
					System.out.println("Le chef : "+c.getNom()+ " est affecté pour la mission "+ cm.getIdMission()+" qui a un budget >20 dinars");
				}
			
			

			
		}
		
		
		public void Budget_Rapport(){
			
			Session session9=sessionFactory.openSession();	
    		Transaction tx=session9.beginTransaction();
			
    		Query q=session9.createQuery("Select r.idRapport , r.description  from Rapport r " +
    				"where r.budget_totale between 1 and 500");
    				List l=q.list();
    				Iterator i=l.iterator();
    				while(i.hasNext()){
    				Object[] o=(Object[]) i.next();
    				Integer id=(Integer)o[0];
    				String d=(String)o[1];
    				
    				System.out.println("id de rapport :" +id+" et sa description est "+d);
    				}	
		}
		
		public void Admin_Mission(){
			
			Session session10=sessionFactory.openSession();	
    		Transaction tx=session10.beginTransaction();
	 
			
			Query q=session10.createQuery("from Mission m join m.administrateur cm " );
					List l=q.list();
					Iterator i=l.iterator();
					while(i.hasNext()){
					Object[] o=(Object[]) i.next();
					Mission c=(Mission)o[0];
					Administrateur cm=(Administrateur)o[1];
					System.out.println("La Mission : "+c.getIdMission()+ " est affecté par l'administrateur "+ cm.getNom()+".");
					}
		}
		
		public void Budget_Mission(){
			
			Session session11=sessionFactory.openSession();	
    		Transaction tx=session11.beginTransaction();
    		
    		Query q=session11.createQuery("from Mission m join m.rapport cm " + "where m.budget < cm.budget_totale");
			List l=q.list();
			Iterator i=l.iterator();
			while(i.hasNext()){
			Object[] o=(Object[]) i.next();
			Mission c=(Mission)o[0];
			Rapport cm=(Rapport)o[1];
			int a=cm.getBudget_totale()-Integer.parseInt(c.getBudget());
			System.out.println("La Mission : "+c.getIdMission()+ ":" +c.getnomMission() +" qui a le budget  :"+ cm.getBudget_totale()+" a dépassé son budget par "+ a +".");
			
			}
			
		}
		
            public void Budget_Mission2(){
			
			Session session11=sessionFactory.openSession();	
    		Transaction tx=session11.beginTransaction();
    		
    		Query q=session11.createQuery("from Mission m join m.rapport cm " + "where m.budget > cm.budget_totale");
			List l=q.list();
			Iterator i=l.iterator();
			while(i.hasNext()){
			Object[] o=(Object[]) i.next();
			Mission c=(Mission)o[0];
			Rapport cm=(Rapport)o[1];
			System.out.println("La Mission : "+c.getIdMission()+ ":" +c.getnomMission() +" qui a le budget  :"+c.getBudget()+" n'est pas dépasé son budget initiale  "+ cm.getBudget_totale()+".");
			}
			
		}

}
