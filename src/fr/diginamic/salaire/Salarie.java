package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaire;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	
	// redéfinission de la méthode getSalaire
	@Override
	public double getSalaire() {
		return salaire;
	}
	
	// redéfinission de la méthode getStatus
	@Override
	public String getStatus() {
		return "salarie";
	}
	

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
