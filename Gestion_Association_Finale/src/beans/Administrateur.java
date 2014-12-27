package beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Administrateur {

	private Integer idAdministrateur;
	private String nom;
	private String prenom;
	private String mail;
	private String date_naissance;
	private String mdp;
	private String login;
	
	
	private Set<Mission> mission=new HashSet<Mission>();


	
	//Constructeur vide
	public Administrateur() {
		super();
	}
	
	
	//Constructeur
	public Administrateur(String nom, String prenom, String mail,String date_naissance, String mdp, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.date_naissance = date_naissance;
		this.mdp = mdp;
		this.login = login;
	}



	//Les getrs et les setrs
	public Integer getIdAdministrateur() {
		return idAdministrateur;
	}
	public void setIdAdministrateur(Integer idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public Set<Mission> getMission() {
		return mission;
	}


	public void setMission(Set<Mission> mission) {
		this.mission = mission;
	}


			
	
}
