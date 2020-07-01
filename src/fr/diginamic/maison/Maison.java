package fr.diginamic.maison;

public class Maison {

	private Piece[] tab = {};

	// méthode qui permet d'ajouter une pièce au tableau
	public void ajouterPiece(Piece a) {

		if (a == null || a.getSuperficie() < 0 || a.getNumeroEtage() < 0) {
			System.out.println("Erreur, pièce incorrecte");
		}
		Piece tmp[] = new Piece[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tmp[i] = tab[i];
		}
		tmp[tmp.length - 1] = a;
		tab = tmp;

	}

	// méthode qui retourne la supérficie totale de la maison
	public double superficieTotale() {
		// initialisation d'une variable superficieTemp à 0
		double superficieTemp = 0;

		for (int i = 0; i < tab.length; i++) {
			// pour chaque pièce contenue dans le tableau, on récupère sa superficie
			// et on l'ajoute à la variable superficieTemp
			superficieTemp += tab[i].getSuperficie();
		}
		return superficieTemp;
	}

	// méthode qui retourne la supérficie d'un étage
	public double superficieEtage(int numeroEtage) {
		// initialisation d'une variable superficieEtage à 0
		double superficieEtage = 0;

		for (int i = 0; i < tab.length; i++) {
			// pour chaque pièce contenue dans le tableau, on récupère l'étage correspondant
			// à la pièce
			// et s'il correspond à l'étage entré en paramètre, la superficie est ajoutée à
			// la variable superficieEtage
			int etage = tab[i].getNumeroEtage();
			if (etage == numeroEtage) {
				superficieEtage += tab[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	// méthode qui retourne la superficie globale pour un type de pièce donné
	public double superficieTypePiece(String typePiece) {

		double superficieTemp = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getTypePiece() == typePiece && typePiece != null) {
				superficieTemp += tab[i].getSuperficie();
			}
		}
		return superficieTemp;
	}

	// méthode qui retourne le nombre de pièce d'un type donné
	public int nbPieceType(String typePiece) {
		int nbPiece = 0;
		for(int i = 0; i < tab.length; i++) {
			if (tab[i].getTypePiece() == typePiece && typePiece != null) {
				nbPiece += 1;
		}
	}
	return nbPiece;
	
	}
}
