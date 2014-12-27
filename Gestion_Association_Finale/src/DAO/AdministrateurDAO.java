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



public class AdministrateurDAO extends DAO<Administrateur>{

	
	public AdministrateurDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
	
		public void create( Administrateur admin) {
		
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(admin);
			tx.commit();
			session.close();
			
	
		}
		
		public void delete( Administrateur admin,int idA) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			admin =(Administrateur)session.get(Administrateur.class,idA);
			session.delete(admin);
			tx.commit();
			session.close();
		
		}
		
		public void update( Administrateur admin ,int idA) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Administrateur a =(Administrateur)session.get(Administrateur.class,idA);
			a.setNom(admin.getNom());
			a.setPrenom(admin.getPrenom());
			a.setDate_naissance(admin.getDate_naissance());
			a.setLogin(admin.getLogin());
			a.setMail(admin.getMail());
			a.setMdp(admin.getMdp());
			//session.update(admin);
			tx.commit();
			session.close();
		
		}
		public  Administrateur find(int idA) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
            Administrateur adm = (Administrateur) session.get(Administrateur.class, idA);
            System.out.println("Id: "+adm.getIdAdministrateur());
			System.out.println("Nom: "+adm.getNom());
			System.out.println("Prenom: "+adm.getPrenom());
			System.out.println("Mail: "+adm.getMail());
			System.out.println("Date_Naiss: "+adm.getDate_naissance());
			System.out.println("Login: "+adm.getLogin());
			return adm;
		}
		
		
			
			public List<Administrateur> Afficher(){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
				List req= session.createQuery("from Administrateur").list();
				tx.commit();
				session.close();
				return req;
			}
			
			
			//méthode d'affichage
			public void Affichage(Administrateur adm){
				
				//Administrateur adm = new Administrateur();
				System.out.println("* " + adm.getNom() + " - " + adm.getIdAdministrateur() +" . ");
			}
			
			public Administrateur Charger(int idC){
				Administrateur adm = new Administrateur();
				return adm;
			}
			
	
			public void Ajout_Mis_TO_Cat (int idM , int idCA){
				
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
