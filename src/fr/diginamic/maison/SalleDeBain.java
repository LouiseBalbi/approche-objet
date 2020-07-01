package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	/**
	 * @param superficie
	 * @param numeroEtage
	 */
	public SalleDeBain(double superficie, int numeroEtage) {
		super(superficie, numeroEtage);
	}

	public String getTypePiece() {
		return "Salle de bain";
	}
	
}
