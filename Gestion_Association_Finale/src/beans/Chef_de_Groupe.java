package beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Chef_de_Groupe {

	private Integer idChef;
	private String nom;
	private String prenom;
	private Integer age;
	private String mail;
	private String date_naissance;
	private String mdp;
	private String login;
	private String sexe;
	
	

	private Set<Mission> mission=new HashSet<Mission>();
	
	private Adresse monAdresse;
	
	//Constructeur vide
	public Chef_de_Groupe() {
		super();
	}

	//Constructeur
	public Chef_de_Groupe(String nom, String prenom, Integer age, String mail,
			String date_naissance, String login, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.mail = mail;
		this.date_naissance = date_naissance;
		this.login = login;
		this.sexe = sexe;
	}
	
	//Les getrs et les setrs
	
	public Set<Mission> getMission() {
		return mission;
	}

	public void setMission(Set<Mission> mission) {
		this.mission = mission;
	}
	
	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	public Adresse getMonAdresse() {
		return monAdresse;
	}

	public void setMonAdresse(Adresse monAdresse) {
		this.monAdresse = monAdresse;
	}


	public Integer getIdChef() {
		return idChef;
	}

	public void setIdChef(Integer idChef) {
		this.idChef = idChef;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
		
	
	
}
