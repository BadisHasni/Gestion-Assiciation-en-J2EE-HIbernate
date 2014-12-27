package beans;

import java.util.Date;

public class Rapport {

	private Integer idRapport;
	
	private String description;
	private String lieu_mission;
	private String date_mission;
	private String duree_mission;
	private Integer budget_totale;
	private Integer budget_hebergement;
	private Integer budget_nourriture;
	private Integer budget_transport;
	private Integer dons;
	private Integer autre_depence;
	
    private Mission mission;
	
	

	//constructeur vide
	public Rapport() {
		super();
		
	}
	
	//constructeur 
	
	public Rapport(String description, String lieu_mission, String date_mission,
			String duree_mission, Integer budget_totale,
			Integer budget_hebergement, Integer budget_nourriture,
			Integer budget_transport, Integer dons, Integer autre_depence) {
		super();
		//this.nom_mission = nom_mission;
		//this.nom_chef = nom_chef;
		//this.noms_membres = noms_membres;
		this.description = description;
		this.lieu_mission = lieu_mission;
		this.date_mission = date_mission;
		this.duree_mission = duree_mission;
		this.budget_totale = budget_totale;
		this.budget_hebergement = budget_hebergement;
		this.budget_nourriture = budget_nourriture;
		this.budget_transport = budget_transport;
		this.dons = dons;
		this.autre_depence = autre_depence;
	}


	//Les getrs et les setrs
	public Integer getIdRapport() {
		return idRapport;
	}


	public void setIdRapport(Integer idRapport) {
		this.idRapport = idRapport;
	}
	/*
	public String getNom_mission() {
		return nom_mission;
	}
	public void setNom_mission(String nom_mission) {
		this.nom_mission = nom_mission;
	}
	public String getNom_chef() {
		return nom_chef;
	}
	public void setNom_chef(String nom_chef) {
		this.nom_chef = nom_chef;
	}
	public String getNoms_membres() {
		return noms_membres;
	}
	public void setNoms_membres(String noms_membres) {
		this.noms_membres = noms_membres;
	}
*/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLieu_mission() {
		return lieu_mission;
	}

	public void setLieu_mission(String lieu_mission) {
		this.lieu_mission = lieu_mission;
	}

	public String getDate_mission() {
		return date_mission;
	}

	public void setDate_mission(String date_mission) {
		this.date_mission = date_mission;
	}

	public String getDuree_mission() {
		return duree_mission;
	}

	public void setDuree_mission(String duree_mission) {
		this.duree_mission = duree_mission;
	}

	public Integer getBudget_totale() {
		return budget_totale;
	}

	public void setBudget_totale(Integer budget_totale) {
		this.budget_totale = budget_totale;
	}

	public Integer getBudget_hebergement() {
		return budget_hebergement;
	}

	public void setBudget_hebergement(Integer budget_hebergement) {
		this.budget_hebergement = budget_hebergement;
	}

	public Integer getBudget_nourriture() {
		return budget_nourriture;
	}

	public void setBudget_nourriture(Integer budget_nourriture) {
		this.budget_nourriture = budget_nourriture;
	}

	public Integer getBudget_transport() {
		return budget_transport;
	}

	public void setBudget_transport(Integer budget_transport) {
		this.budget_transport = budget_transport;
	}

	public Integer getDons() {
		return dons;
	}

	public void setDons(Integer dons) {
		this.dons = dons;
	}

	public Integer getAutre_depence() {
		return autre_depence;
	}

	public void setAutre_depence(Integer autre_depence) {
		this.autre_depence = autre_depence;
	}
	
	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}
	


	
}
