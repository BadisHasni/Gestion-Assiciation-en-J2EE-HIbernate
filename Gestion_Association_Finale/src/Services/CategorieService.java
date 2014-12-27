package Services;

import java.util.List;

import org.hibernate.SessionFactory;

import persistance.HibernateUtil;

import beans.Administrateur;
import beans.Categorie;
import DAO.AbstractDAOFactory;
import DAO.DAO;

public class CategorieService {

	
	SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
    DAO<Categorie> categorieDao = abs.getCategorieDAO();
	
	
    
    //Constructeur
	public CategorieService() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Les getres et les setres
    public DAO<Categorie> getCategorieDao() {
		return categorieDao;
	}

	public void setCategorieDao(DAO<Categorie> categorieDao) {
		this.categorieDao = categorieDao;
	}
	
	
	
	
	//Méthode d'ajout
		public void enregistrer(Categorie cat) {
			categorieDao.create(cat);
			
		}

		
		//Méthode d'affichage
				public List<Categorie> Affichage(){
					return categorieDao.Afficher();
					
				}
				
				//Méthode de suupression
				public void supprimer(Categorie cat,int idA){
					categorieDao.delete(cat, idA);
				}
			
			
			
			//Méthode de modification
				public void modification(Categorie cat,int idA){
					categorieDao.update(cat, idA);
				}
		
	
	
				//Méthode d'affectation
				public void Affecter_une_cat(int idB,int idA){
					categorieDao.Ajout_Mis_TO_Cat(idB, idA);
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
