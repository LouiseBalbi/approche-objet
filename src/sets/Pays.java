package sets;

public class Pays {
	
	private String nom;
	private double nbHabitants;
	private double pibParHabitants;
	/**
	 * @param nom
	 * @param nbHabitants
	 * @param pibParHabitants
	 */
	public Pays(String nom, double nbHabitants, double pibParHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitants = pibParHabitants;
	}
	
	@Override
	public String toString() {
		return "nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibParHabitants=" + pibParHabitants;
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
	 * @return the nbHabitants
	 */
	public double getNbHabitants() {
		return nbHabitants;
	}
	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	/**
	 * @return the pibParHabitants
	 */
	public double getPibParHabitants() {
		return pibParHabitants;
	}
	/**
	 * @param pibParHabitants the pibParHabitants to set
	 */
	public void setPibParHabitants(double pibParHabitants) {
		this.pibParHabitants = pibParHabitants;
	}
	
	
	

}
