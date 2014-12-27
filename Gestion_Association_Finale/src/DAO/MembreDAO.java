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

import beans.Categorie;
import beans.Membre;
import beans.Mission;



public class MembreDAO extends DAO<Membre>{

	
	public MembreDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
		public void create( Membre membre) {
		
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(membre);
			tx.commit();
			session.close();
			
	
		}
		
		public void delete( Membre membre,int idM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			membre =(Membre)session.get(Membre.class,idM);
		    //membre =(Membre)session.get(Membre.class,1);
			session.delete(membre);
			tx.commit();
			session.close();
		
		}
		
		public void update( Membre membre , int idM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Membre memb =(Membre)session.get(Membre.class,idM);
			memb.setNom(membre.getNom());
			memb.setPrenom(membre.getPrenom());
			memb.setAge(membre.getAge());
			memb.setMail(membre.getMail());
			memb.setLogin(membre.getLogin());
			memb.setMdp(membre.getMdp());
			memb.setSexe(membre.getSexe());
			memb.setDate_naissance(membre.getDate_naissance());
			//session.update(membre);
			tx.commit();
			session.close();
		
		}
		public  Membre find(int idMM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Membre mm = (Membre) session.get(Membre.class, idMM);
			System.out.println("Id: "+mm.getIdMembre());
			System.out.println("Nom: "+mm.getNom());
			System.out.println("Prenom: "+mm.getPrenom());
			System.out.println("Age: "+mm.getAge());
			System.out.println("Mail: "+mm.getMail());
			System.out.println("Date_Naiss: "+mm.getDate_naissance());
			System.out.println("Mdp: "+mm.getMdp());
			System.out.println("Login: "+mm.getLogin());
			System.out.println("Sexe: "+mm.getSexe());
			return mm;
		}
		
		
			
			public List<Membre> Afficher(){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
				return session.createQuery("from Membre").list();
			}
	
			public void Ajout_Mis_TO_Cat (int idM , int idCA){
				
			}
			
			public void Affichage(Membre m){
				
			}
			
			public Membre Charger(int idC){
				Membre adm = new Membre();
				return adm;
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
