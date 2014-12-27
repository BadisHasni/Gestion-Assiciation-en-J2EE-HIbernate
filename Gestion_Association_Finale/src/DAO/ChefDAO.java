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
import beans.Adresse;
import beans.Chef_de_Groupe;



public class ChefDAO extends DAO<Chef_de_Groupe>{

	
	public ChefDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
		public void create( Chef_de_Groupe chef) {
		
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(chef);
			tx.commit();
			session.close();
			
	
		}
		
		public void delete( Chef_de_Groupe chef,int idCE) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			 chef =(Chef_de_Groupe)session.get(Chef_de_Groupe.class,idCE);
			session.delete(chef);
			tx.commit();
			session.close();
		
		}
		
		public void update( Chef_de_Groupe chef , int idCE) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Chef_de_Groupe che =(Chef_de_Groupe)session.get(Chef_de_Groupe.class,idCE);
			che.setNom(chef.getNom());
			che.setPrenom(chef.getPrenom());
			che.setMail(chef.getMail());
			che.setMdp(chef.getMdp());
			che.setLogin(chef.getLogin());
			che.setSexe(chef.getSexe());
			che.setAge(chef.getAge());
			che.setDate_naissance(chef.getDate_naissance());
			
			che.getMonAdresse().setRue(chef.getMonAdresse().getRue()) ;
			che.getMonAdresse().setNumero(chef.getMonAdresse().getNumero()) ;
			che.getMonAdresse().setCodePostal(chef.getMonAdresse().getCodePostal()) ;

			tx.commit();
			session.close();
		
		}
		public  Chef_de_Groupe find(int idC) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Chef_de_Groupe c = (Chef_de_Groupe) session.get(Chef_de_Groupe.class, idC);
			System.out.println("Id: "+c.getIdChef());
			System.out.println("Nom: "+c.getNom());
			System.out.println("Prenom: "+c.getPrenom());
			System.out.println("Login: "+c.getLogin());
			System.out.println("Age: "+c.getAge());
			System.out.println("Mail: "+c.getMail());
			System.out.println("Date_Naiss: "+c.getDate_naissance());
			System.out.println("Sexe: "+c.getSexe());
			System.out.println("Rue: "+c.getMonAdresse().getRue());
			System.out.println("Numéro: "+c.getMonAdresse().getNumero());
			System.out.println("Code_Postal: "+c.getMonAdresse().getCodePostal());
			return c;
		}
		
		
			
			public List<Chef_de_Groupe> Afficher(){
				org.hibernate.Session session8=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session8).beginTransaction();
				List req = session8.createQuery("from Chef_de_Groupe").list();
				tx.commit();
				session8.close();
		  
				return req;
			}
			
			public Chef_de_Groupe Charger(int idC){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
	      		Chef_de_Groupe c =(Chef_de_Groupe)session.get(Chef_de_Groupe.class,idC);
	      		tx.commit();
				session.close();
	      		return c;

			}
	
			public void Ajout_Mis_TO_Cat (int idM , int idCA){
				
			}
			
			public void Affichage(Chef_de_Groupe c){
				
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
