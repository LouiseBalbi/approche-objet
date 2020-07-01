package fr.diginamic.maison;

public class Wc extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Wc(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}
	
	public String getTypePiece() {
		return "WC";
	}

}
