package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private double joursParMois;
	private double montantJournalier;
	

	/**
	 * @param nom
	 * @param prenom
	 * @param joursParMois
	 * @param montantJournalier
	 */
	public Pigiste(String nom, String prenom, double joursParMois, double montantJournalier) {
		super(nom, prenom);
		this.joursParMois = joursParMois;
		this.montantJournalier = montantJournalier;
	}


	// red�finission de la m�thode getSalaire
	@Override
	public double getSalaire() {
		return joursParMois * montantJournalier;	
	
	}

	// red�finission de la m�thode getStatus
	@Override
	public String getStatus() {
		return "ind�pendant";
	}

	/**
	 * @return the joursParMois
	 */
	public double getJoursParMois() {
		return joursParMois;
	}



	/**
	 * @param joursParMois the joursParMois to set
	 */
	public void setJoursParMois(double joursParMois) {
		this.joursParMois = joursParMois;
	}



	/**
	 * @return the montantJournalier
	 */
	public double getMontantJournalier() {
		return montantJournalier;
	}



	/**
	 * @param montantJournalier the montantJournalier to set
	 */
	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
