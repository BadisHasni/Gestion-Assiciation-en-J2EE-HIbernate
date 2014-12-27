package beans;

public class Adresse {

	private String rue;
	private int numero;
	private int codePostal;
	private Chef_de_Groupe chef;


	//Constructeur
	public Adresse() {
		super();

	}

	
	public Adresse(String rue, int numero, int codePostal) {
		super();
		this.rue = rue;
		this.numero = numero;
		this.codePostal = codePostal;
	}


	//Les getrs et les setrs
	public Chef_de_Groupe getChef() {
		return chef;
	}


	public void setChef(Chef_de_Groupe chef) {
		this.chef = chef;
	}
	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	
}
