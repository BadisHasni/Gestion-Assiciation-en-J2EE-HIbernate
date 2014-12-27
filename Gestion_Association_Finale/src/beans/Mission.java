package beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class Mission {

	

	private Integer idMission;
	private String nomMission;
	//private String chef_de_groupe;
	//private String membres;
	private String description;
	private String lieuMission;
	private String dateMission;
	private String budget;

	
	
	private Administrateur administrateur;
	
	private Rapport rapport;
	
	private Chef_de_Groupe chef;
	
	
	private Set<Mission_Membre>  associe=new HashSet<Mission_Membre>();
	
	private Set<Categorie> categorie =new HashSet<Categorie>();
	

	
	//constructeur vide
	public Mission() {
		super();
	}
	
	public Mission(String nomMission, 
			String description, String lieuMission, String dateMission,
			String budget) {
		super();
		this.nomMission = nomMission;
		//this.chef_de_groupe = chef_de_groupe;
		//this.membres = membres;
		this.description = description;
		this.lieuMission = lieuMission;
		this.dateMission = dateMission;
		this.budget = budget;
	}


	//Les getrs et les setrs
	
	public Chef_de_Groupe getChef() {
		return chef;
	}

	public void setChef(Chef_de_Groupe chef) {
		this.chef = chef;
	}
	
	public Set<Categorie> getCategorie() {
		return categorie;
	}

	public void setCategorie(Set<Categorie> categorie) {
		this.categorie = categorie;
	}

	
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	public Rapport getRapport() {
		return rapport;
	}

	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}
	
	
	public Set<Mission_Membre> getAssocie() {
		return associe;
	}

	public void setAssocie(Set<Mission_Membre> associe) {
		this.associe = associe;
	}
	
	
	public Integer getIdMission() {
		return idMission;
	}
	public void setIdMission(Integer idMission) {
		this.idMission = idMission;
	}
	public String getnomMission() {
		return nomMission;
	}
	public void setnomMission(String nomMission) {
		this.nomMission = nomMission;
	}
	/*
	public String getChef_de_groupe() {
		return chef_de_groupe;
	}

	public void setChef_de_groupe(String chef_de_groupe) {
		this.chef_de_groupe = chef_de_groupe;
	}

	public String getMembres() {
		return membres;
	}

	public void setMembres(String membres) {
		this.membres = membres;
	}*/

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public String getlieuMission() {
		return lieuMission;
	}

	public void setlieuMission(String lieuMission) {
		this.lieuMission = lieuMission;
	}

	public String getdateMission() {
		return dateMission;
	}

	public void setdateMission(String dateMission) {
		this.dateMission = dateMission;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	
}
