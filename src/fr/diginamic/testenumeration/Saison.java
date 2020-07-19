package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int numeroOrdre;
	/**
	 * @param libelle
	 * @param numeroOrdre
	 */
	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}

	
	
	public static Saison createSaison(String libelle) {
		return Saison.valueOf(libelle);
	}
	

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the numeroOrdre
	 */
	public int getNumeroOrdre() {
		return numeroOrdre;
	}
	/**
	 * @param numeroOrdre the numeroOrdre to set
	 */
	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}
	
	
	
}
