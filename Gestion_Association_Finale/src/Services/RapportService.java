package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Rapport;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class RapportService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Rapport> rapportDao = abs.getRapport();
	
//Constructeur
    public RapportService() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
	//Les getres et les setres
	public DAO<Rapport> getRapportDao() {
		return rapportDao;
	}

	public void setRapportDao(DAO<Rapport> rapportDao) {
		this.rapportDao = rapportDao;
	}

	
	
		//M�thode d'ajout
		public void enregistrer(Rapport r) {
			rapportDao.create(r);
			
		}

	
		
		//M�thode d'affichage
				public List<Rapport> Affichage(){
					return rapportDao.Afficher();
					
				}
			
	
				//M�thode de suupression
				public void supprimer(Rapport rapport,int idA){
					rapportDao.delete(rapport, idA);
				}
			
			
			
			//M�thode de modification
				public void modification(Rapport rapport,int idA){
					rapportDao.update(rapport, idA);
				}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
