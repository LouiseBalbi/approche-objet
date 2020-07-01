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

	
	// red�finission de la m�thode getSalaire
	@Override
	public double getSalaire() {
		return salaire;
	}
	
	// red�finission de la m�thode getStatus
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
