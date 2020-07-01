package fr.diginamic.maison;

public class Salon extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Salon(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	
	}
	
	public String getTypePiece() {
		return "Salon";
	}


}
