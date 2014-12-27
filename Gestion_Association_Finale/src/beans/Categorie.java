package beans;

import java.util.HashSet;
import java.util.Set;

public class Categorie {

	private Integer idCategorie;
	private String nomCategorie;
	private String description;
	
	private Set<Mission> mission =new HashSet<Mission>();
	
	

	//constructeur vide
	public Categorie() {
		super();
	}
	

	//Les getrs et les setrs
	
	public Categorie(String nomCategorie, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
	}



	
    //les getrs et les setrs
	public Set<Mission> getMission() {
		return mission;
	}

	public void setMission(Set<Mission> mission) {
		this.mission = mission;
	}
	
	
	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getNomCategorie() {
		return nomCategorie;
	}


	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


}
