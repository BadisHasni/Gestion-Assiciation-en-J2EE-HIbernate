package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Categorie;
import beans.Mission;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class MissionService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Mission> missionDao = abs.getMissionDAO();
	
	
    
    //Constructeur
	public MissionService() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Les getres et les setres
	public DAO<Mission> getMissionDao() {
		return missionDao;
	}

	public void setMissionDao(DAO<Mission> missionDao) {
		this.missionDao = missionDao;
	}


	
	//M�thode d'ajout
		public void enregistrer(Mission m) {
			missionDao.create(m);
			
		}
		
		//M�thode d'affichage
		public List<Mission> Affichage(){
			return missionDao.Afficher();
			
		}


		
		//M�thode de suupression
		public void supprimer(Mission mission,int idA){
			missionDao.delete(mission, idA);
		}
	
	
	
	//M�thode de modification
		public void modification(Mission mission,int idA){
			missionDao.update(mission, idA);
		}

/*
		//M�thode d'affichage des chefs des missions
		public List<Object> Chef_des_mission(){
			return missionDao.Chef_Mission();
			
		}

	*/
	
	
	
	
	
	
	
	
	
	
}
