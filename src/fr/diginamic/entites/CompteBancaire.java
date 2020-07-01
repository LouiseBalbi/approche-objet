package fr.diginamic.entites;

import entites.Personne;

public class CompteBancaire {

	private String numeroCompte;
	private double solde;
	private Personne personne;

	/**
	 * @param numeroCompte
	 * @param solde
	 * @param personne
	 */
	public CompteBancaire(String numeroCompte, double solde, Personne personne) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.personne = personne;
	}

	// méthode permettant de créditer le compte d'un certain montant
	public double crediterMontant(double montant) {
		return solde + montant;
	}

	// méthode permettant de débiter le compte d'un certain montant
	public double debiterMontant(double montant) {
		return solde - montant;
	}
	
	@Override
	public String toString() {
		return personne.returnNom() + " " + personne.returnPrénom() + "\n" + "Numéro de compte : " + numeroCompte + "\n" + "Solde : " + solde + " ";
	}

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}

	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	

}
