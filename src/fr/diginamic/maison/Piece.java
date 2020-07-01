package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int numeroEtage;
	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Piece(double superficie, int numeroEtage) {
		super();
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
	}
	
	// méthode qui retourne le type de pièce
	public abstract String getTypePiece();
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}
	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	/**
	 * @return the numeroEtage
	 */
	public int getNumeroEtage() {
		return numeroEtage;
	}
	/**
	 * @param numeroEtage the numeroEtage to set
	 */
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	
	

}
