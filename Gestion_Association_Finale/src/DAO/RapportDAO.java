package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;

import persistance.HibernateUtil;



import beans.Administrateur;
import beans.Chef_de_Groupe;
import beans.Mission;
import beans.Mission_Membre;
import beans.Rapport;
import beans.RapportJustifier;



public class RapportDAO extends DAO<Rapport>{

	
	public RapportDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
		public void create( Rapport r) {
		
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(r);
			tx.commit();
			session.close();
			
	
		}
	/*
	public void create( RapportJustifier rj) {
		
		org.hibernate.Session session=sessionFactory.openSession();
		Transaction tx=((SharedSessionContract) session).beginTransaction();
		session.save(rj);
		tx.commit();
		session.close();
		
	}*/
		
		public void delete( Rapport r,int idR) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			r =(Rapport)session.get(Rapport.class,idR);
			session.delete(r);
			tx.commit();
			session.close();
		
		}
		
		public void update( Rapport rr, int idR) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Rapport r =(Rapport)session.get(Rapport.class,idR);
			r.setDescription(rr.getDescription());
			r.setLieu_mission(rr.getLieu_mission());
			r.setDate_mission(rr.getDate_mission());
			r.setDuree_mission(rr.getDuree_mission());
			r.setBudget_totale(rr.getBudget_totale());
			r.setBudget_hebergement(rr.getBudget_hebergement());
			r.setBudget_nourriture(rr.getBudget_nourriture());
			r.setBudget_transport(rr.getBudget_transport());
			r.setDons(rr.getDons());
			r.setAutre_depence(rr.getAutre_depence());
			//session.update(r);
			tx.commit();
			session.close();
		
		}
		public  Rapport find(int idR) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Rapport r = (Rapport) session.get(Rapport.class, idR);
			System.out.println("Id: "+r.getIdRapport());
			System.out.println("Description: "+r.getDescription());
			System.out.println("Lieu: "+r.getLieu_mission());
			System.out.println("Date: "+r.getDate_mission());
			System.out.println("Durée: "+r.getDuree_mission());
			System.out.println("Budget_totale: "+r.getBudget_totale());
			System.out.println("Budget_h: "+r.getBudget_hebergement());
			System.out.println("Budget_N: "+r.getBudget_nourriture());
			System.out.println("Budget_T: "+r.getBudget_transport());
			System.out.println("Budget_D: "+r.getDons());
			System.out.println("Budget_A: "+r.getAutre_depence());
			return r;
		}
		
		
			
			public List<Rapport> Afficher(){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
				List req= session.createQuery("from Rapport").list();
				tx.commit();
				session.close();
				return req;
			}
	
			
			public void Ajout_Mis_TO_Cat (int idM , int idCA){
			
			}
			
			public void Affichage(Rapport r){
				
			}
			

			public Rapport Charger(int idR){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
	      		Rapport r =(Rapport)session.get(Rapport.class,idR);
	      		tx.commit();
				session.close();
	      		return r;
			}
			
			public  void Ajout_Mem_TO_Miss (int idMem , int idMiss , String a){
				
			}
			
			public void Chef_Mission(){
							
						}
			
			public void Budget_Rapport(){
				
			}
			
			public void Admin_Mission(){
				
			}
			public void Budget_Mission(){
				
			}
			
            public  void Budget_Mission2(){
        		
        	}
	
}
