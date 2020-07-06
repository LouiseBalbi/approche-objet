package fr.diginamic.parseur;

public class Expression {

	private String membreGauche;
	private String operateur;
	private String membreDroite;
	/**
	 * @param membreGauche
	 * @param operateur
	 * @param membreDroite
	 */
	public Expression(String membreGauche, String operateur, String membreDroite) {
		super();
		this.membreGauche = membreGauche;
		this.operateur = operateur;
		this.membreDroite = membreDroite;
	}
	
	// méthode evaluer
	public double evaluer(String inconnue, double valeur) {
		return valeur;
	}
	
	/**
	 * @return the membreGauche
	 */
	public String getMembreGauche() {
		return membreGauche;
	}
	/**
	 * @param membreGauche the membreGauche to set
	 */
	public void setMembreGauche(String membreGauche) {
		this.membreGauche = membreGauche;
	}
	/**
	 * @return the operateur
	 */
	public String getOperateur() {
		return operateur;
	}
	/**
	 * @param operateur the operateur to set
	 */
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	/**
	 * @return the membreDroite
	 */
	public String getMembreDroite() {
		return membreDroite;
	}
	/**
	 * @param membreDroite the membreDroite to set
	 */
	public void setMembreDroite(String membreDroite) {
		this.membreDroite = membreDroite;
	}
	
	
}
