package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Membre;
import beans.Mission;
import beans.Mission_Membre;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class Mission_MembreService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Mission_Membre> mission_membreDao = abs.getMission_Membre();
	
	
    //Costructeur
    public Mission_MembreService() {
		super();
	}

    
    
	//Les getres et les setres
    public DAO<Mission_Membre> getMission_membreDao() {
		return mission_membreDao;
	}

	public void setMission_membreDao(DAO<Mission_Membre> mission_membreDao) {
		this.mission_membreDao = mission_membreDao;
	}


	
		//Méthode d'ajout
		public void enregistrer(Mission_Membre mm) {
			mission_membreDao.create(mm);
			
		}

		//Méthode d'affichage
				public List<Mission_Membre> Affichage(){
					return mission_membreDao.Afficher();
					
				}
				
				//Méthode de suupression
				public void supprimer(Mission_Membre mm,int idA){
					mission_membreDao.delete(mm, idA);
				}
		
		//Méthode d'affectation
				public void Affecter_Membre(int idMM,int idM, String duree) {
					mission_membreDao.Ajout_Mem_TO_Miss(idMM, idM,duree );
					
				}
				
				//Méthode de modification
				public void Modifier_Membre_Mission(Mission_Membre mm,int id) {
					mission_membreDao.update(mm, id);
					
				}
		

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
