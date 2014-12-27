package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Chef_de_Groupe;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class ChefService {


	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Chef_de_Groupe> chefDao = abs.getChefDAO();
	
//Constructeur
	public ChefService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
	//Les getres et les setres
    public DAO<Chef_de_Groupe> getChefDao() {
		return chefDao;
	}

	public void setChefDao(DAO<Chef_de_Groupe> chefDao) {
		this.chefDao = chefDao;
	}

	
	
	
	
	//M�thode d'ajout
		public void enregistrer(Chef_de_Groupe chef) {
			chefDao.create(chef);
			
		}

		//M�thode d'affichage
				public List<Chef_de_Groupe> Affichage(){
					return chefDao.Afficher();
					
				}	

		
	
				//M�thode de suupression
				public void supprimer(Chef_de_Groupe chef,int idA){
					chefDao.delete(chef, idA);
				}
			
			
			
			//M�thode de modification
				public void modification(Chef_de_Groupe chef,int idA){
					chefDao.update(chef, idA);
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
