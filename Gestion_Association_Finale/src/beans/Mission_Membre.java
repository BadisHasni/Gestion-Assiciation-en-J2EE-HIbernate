package beans;

import java.io.Serializable;


public class Mission_Membre {

	//Class ID
public static class Id implements Serializable{
		
		private Integer idMission;
		private Integer idMembre;
		public Id(){}
		public Id(Integer idMission, Integer idMembre) {
			super();
			this.idMission = idMission;
			this.idMembre = idMembre;
		}
		public Integer getIdMission() {
			return idMission;
		}
		public void setIdMission(Integer idMission) {
			this.idMission = idMission;
		}
		public Integer getIdMembre() {
			return idMembre;
		}
		public void setIdMembre(Integer idMembre) {
			this.idMembre = idMembre;
		}

	}


	private Id id=new Id();
	private String durree;
	private Mission mission;
	private Membre membre;
	
	
	
	
	//Les contructeur
	
	public Mission_Membre() {
		super();
	}

	public Mission_Membre(String durree, Mission mission, Membre membre) {
		super();
		this.durree = durree;
		this.mission = mission;
		this.membre = membre;
		
		this.id.idMission=mission.getIdMission();
		this.id.idMembre=membre.getIdMembre();
		mission.getAssocie().add(this);
		membre.getAssocie().add(this);
	}


	//Les getrs et les setrs
	public Id getId() {
		return id;
	}


	public void setId(Id id) {
		this.id = id;
	}


	public String getDurree() {
		return durree;
	}


	public void setDurree(String durree) {
		this.durree = durree;
	}


	public Mission getMission() {
		return mission;
	}


	public void setMission(Mission mission) {
		this.mission = mission;
	}


	public Membre getMembre() {
		return membre;
	}


	public void setMembre(Membre membre) {
		this.membre = membre;
	}


	
}
