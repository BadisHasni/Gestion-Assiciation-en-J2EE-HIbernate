package DAO;

public abstract class AbstractDAOFactory {

	
	public static final int DAO_FACTORY = 0;
	//public static final int XML_DAO_FACTORY = 1;
	
	
	//Les Méthodes abstarct
	public abstract DAO getAdministrateurDAO();
	public abstract DAO getMissionDAO();
	public abstract DAO getChefDAO();
	public abstract DAO getCategorieDAO();
	public abstract DAO getMembreDAO();
	public abstract DAO getRapport();
	public abstract DAO getMission_Membre();

	
	
	public static AbstractDAOFactory getFactory(int type){
	switch(type){
	case DAO_FACTORY:
	return new DAOFactory();
	
	default:
	return null;
	}
	}

}
