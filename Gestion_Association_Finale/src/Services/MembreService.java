package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Membre;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class MembreService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Membre> membreDao = abs.getMembreDAO();
	
	//private DAO adminDAO;
	
    
    
//Constructeur
	public MembreService() {
		super();
	}
    
    
	//Les getres et les setres
	public DAO<Membre> getMembreDao() {
		return membreDao;
	}

	public void setMembreDao(DAO<Membre> membreDao) {
		this.membreDao = membreDao;
	}

		//M�thode d'ajout
		public void enregistrer(Membre membre) {
			membreDao.create(membre);
			
		}

		//M�thode d'affichage
				public List<Membre> Affichage(){
					return membreDao.Afficher();
					
				}
				
				//M�thode de suupression
				public void supprimer(Membre membre,int idA){
					membreDao.delete(membre, idA);
				}
			
			
			
			//M�thode de modification
				public void modification(Membre membre,int idA){
					membreDao.update(membre, idA);
				}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
