package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	// méthode abstraite qui retourne le salaire : 
	public abstract double getSalaire();
	
	// méthode abstraite qui retourne le status :
	public abstract String getStatus();
	
	
	// méthode qui retourne toutes les données concernant un ontervenant
	public void afficherDonnees() {
		System.out.println(toString() + "Salaire : " + getSalaire() + " €, " + " statut : " + getStatus());
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Intervenant : nom = " + nom + ", prenom = " + prenom + ", ";
	}


}
