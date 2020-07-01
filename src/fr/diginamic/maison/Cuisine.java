package fr.diginamic.maison;

public class Cuisine extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Cuisine(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
		
	}

	public String getTypePiece() {
		return "Cuisine";
	}
}
