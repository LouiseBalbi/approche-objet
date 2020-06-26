package fr.diginamic.banque.entites;

public class Compte {
	
	private String numCompte;
	private double soldeCompte;
	
	// constructeur :
	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	// getter et setter :
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	
	

}
