package fr.diginamic.maison;

public class Chambre extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public Chambre(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}
	
	public String getTypePiece() {
		return "Chambre";
	}

}
