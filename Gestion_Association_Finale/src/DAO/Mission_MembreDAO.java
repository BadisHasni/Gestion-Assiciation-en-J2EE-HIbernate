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
import beans.Chef_de_Groupe;
import beans.Membre;
import beans.Mission;
import beans.Mission_Membre;
import beans.Mission_Membre.Id;



public class Mission_MembreDAO extends DAO<Mission_Membre>{

	
	public Mission_MembreDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
		public void create( Mission_Membre mim) {
		
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(mim);
			tx.commit();
			session.close();
			
	
		}
		
		public void delete( Mission_Membre mim,int idMM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			
			Id i =mim.getId();
						
			 mim =(Mission_Membre)session.get(Mission_Membre.class,i);
			session.delete(mim);
			tx.commit();
			session.close();
		
		}
		
		public void update( Mission_Membre mim , int idMM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			
			Id i =mim.getId();
			
			 Mission_Membre mim1 =(Mission_Membre)session.get(Mission_Membre.class,i);
			 
			 mim1.setDurree(mim.getDurree());
			 
			//session.update(mim);
			tx.commit();
			session.close();
		
		}
		public  Mission_Membre find(int idMIM) {
			
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Mission_Membre mim = (Mission_Membre) session.get(Mission_Membre.class, idMIM);
			System.out.println("Durrée: "+mim.getDurree());
			return mim;
		}
		
		
			
			public List<Mission_Membre> Afficher(){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
				return session.createQuery("from Mission_Membre").list();
			}
	
			public void Ajout_Mis_TO_Cat (int idM , int idCA){
				
			}
			
			public void Affichage(Mission_Membre mm){
				
			}
	
			public Mission_Membre Charger(int idC){
				Mission_Membre adm = new Mission_Membre();
				return adm;
			}
			
			public  void Ajout_Mem_TO_Miss (int idMem , int idMiss , String date){
				org.hibernate.Session session=sessionFactory.openSession();
				Transaction tx=((SharedSessionContract) session).beginTransaction();
				//Chargement de Membre et d'une mission de la base
				Membre mem = (Membre) session.load(Membre.class, idMem);
	            Mission m = (Mission) session.load(Mission.class, idMiss);
	            
	            Mission_Membre mim = new Mission_Membre(date, m,mem );
	            
	            session.save(mim);
	    		
	            tx.commit();
				session.close();
				   
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
