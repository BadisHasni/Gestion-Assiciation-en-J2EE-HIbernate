package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Mission;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class AdministrateurService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Administrateur> administrateurDao = abs.getAdministrateurDAO();
	
	
    
    
	//Les getres et les setres
    public DAO<Administrateur> getAdministrateurDao() {
		return administrateurDao;
	}

	public void setAdministrateurDao(DAO<Administrateur> administrateurDao) {
		this.administrateurDao = administrateurDao;
	}	

	
	
	
	
	//M�thode d'ajout
		public void enregistrer(Administrateur admin) {
			administrateurDao.create(admin);
			
		}

		//M�thode d'affichage
		public List<Administrateur> Affichage(){
			return administrateurDao.Afficher();
			
		}
		
		//M�thode de suupression
		public void supprimer(Administrateur admin,int idA){
			administrateurDao.delete(admin, idA);
		}
	
	
	
	//M�thode de modification
		public void modification(Administrateur admin,int idA){
			administrateurDao.update(admin, idA);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
