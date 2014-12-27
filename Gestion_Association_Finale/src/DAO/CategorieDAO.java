package DAO;

import java.sql.Connection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;

import beans.Administrateur;
import beans.Categorie;
import beans.Mission;



public class CategorieDAO extends DAO<Categorie>{

	
	public CategorieDAO(SessionFactory sessionfactory) {
		super(sessionfactory);
		}
	
	
	
	
		public void create(Categorie c) {
	
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
			
		}
		
		
		
		public void delete(Categorie c,int idC) {
	
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			c =(Categorie)session.get(Categorie.class,idC);
			session.delete(c);
			tx.commit();
			session.close();
		}
		
		
		public void update(Categorie c,int idCA) {

			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Categorie c1 = (Categorie) session.get(Categorie.class, idCA);
			c1.setNomCategorie(c.getNomCategorie());
			c1.setDescription(c.getDescription());
			//session.update(c1);
			tx.commit();
			session.close();	
			
		}
		
		
		public Categorie find(int idCA) {

			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			Categorie c = (Categorie) session.get(Categorie.class, idCA);
			System.out.println("Id: "+c.getIdCategorie());
			System.out.println("Nom: "+c.getNomCategorie());
			System.out.println("Description: "+c.getDescription());
			return c;
		}
		
		public List<Categorie> Afficher(){


			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			return session.createQuery("from Categorie").list();
		
		}
		
		public void Ajout_Mis_TO_Cat (int idM , int idCA){
			org.hibernate.Session session=sessionFactory.openSession();
			Transaction tx=((SharedSessionContract) session).beginTransaction();
			//Chargement de Catégorie et d'une mission de la base
			Categorie c = (Categorie) session.load(Categorie.class, idCA);
			    System.out.println(c.getIdCategorie());
			Mission m = (Mission) session.load(Mission.class, idM);
			    System.out.println(m.getIdMission());
			//affectation d'une mission a une catégorie
			c.getMission().add(m);
			//affectation une catégorie a une mission
			m.getCategorie().add(c);
			
			//session.save(c);
			//session.save(m);
			
			tx.commit();
			session.close();
			
		}
		
		public void Affichage(Categorie c){
			
		}
		
		public Categorie Charger(int idC){
			Categorie adm = new Categorie();
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
