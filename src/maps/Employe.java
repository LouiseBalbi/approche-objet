package maps;

public class Employe {
	
	private String prenom;
	private double salaire;
	/**
	 * @param prenom
	 * @param salaire
	 */
	public Employe(String prenom, double salaire) {
		super();
		this.prenom = prenom;
		this.salaire = salaire;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
