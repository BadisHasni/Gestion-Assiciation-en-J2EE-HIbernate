package DAO;

import java.sql.Connection;

import org.hibernate.SessionFactory;

import persistance.*;;

public class DAOFactory extends AbstractDAOFactory {

	protected static final SessionFactory conn = (SessionFactory) HibernateUtil.getSessionFactory();
	
	
	    public DAO getAdministrateurDAO(){
		return new AdministrateurDAO(conn);
		}
		public DAO getMissionDAO(){
		return new MissionDAO(conn);
		}
		 public DAO getChefDAO(){
		return new ChefDAO(conn);
		}
		
		public DAO getCategorieDAO(){
		return new CategorieDAO(conn);
		}
		public DAO getMembreDAO(){
		return new MembreDAO(conn);
			}
		
		
		
		
		public DAO getRapport() {
			
			return new RapportDAO(conn);
		}
		
		public DAO getMission_Membre() {
			
			return new Mission_MembreDAO(conn);
		}
		
		

}
