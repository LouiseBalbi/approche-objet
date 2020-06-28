package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemuneration;

	// constructeur :
	public CompteTaux(String numCompte, double soldeCompte, double tauxRemuneration) {
		super(numCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	// redéfinission de la méthode toString
	@Override
	public String toString() {
		return super.toString() + "\n" + "Taux de rémunération : " + tauxRemuneration;
	}

	// getter
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	// setter
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
