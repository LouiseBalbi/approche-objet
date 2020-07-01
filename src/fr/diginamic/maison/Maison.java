package fr.diginamic.maison;

public class Maison {

	private Piece[] tab = {};

	// m�thode qui permet d'ajouter une pi�ce au tableau
	public void ajouterPiece(Piece a) {

		if (a == null || a.getSuperficie() < 0 || a.getNumeroEtage() < 0) {
			System.out.println("Erreur, pi�ce incorrecte");
		}
		Piece tmp[] = new Piece[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tmp[i] = tab[i];
		}
		tmp[tmp.length - 1] = a;
		tab = tmp;

	}

	// m�thode qui retourne la sup�rficie totale de la maison
	public double superficieTotale() {
		// initialisation d'une variable superficieTemp � 0
		double superficieTemp = 0;

		for (int i = 0; i < tab.length; i++) {
			// pour chaque pi�ce contenue dans le tableau, on r�cup�re sa superficie
			// et on l'ajoute � la variable superficieTemp
			superficieTemp += tab[i].getSuperficie();
		}
		return superficieTemp;
	}

	// m�thode qui retourne la sup�rficie d'un �tage
	public double superficieEtage(int numeroEtage) {
		// initialisation d'une variable superficieEtage � 0
		double superficieEtage = 0;

		for (int i = 0; i < tab.length; i++) {
			// pour chaque pi�ce contenue dans le tableau, on r�cup�re l'�tage correspondant
			// � la pi�ce
			// et s'il correspond � l'�tage entr� en param�tre, la superficie est ajout�e �
			// la variable superficieEtage
			int etage = tab[i].getNumeroEtage();
			if (etage == numeroEtage) {
				superficieEtage += tab[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	// m�thode qui retourne la superficie globale pour un type de pi�ce donn�
	public double superficieTypePiece(String typePiece) {

		double superficieTemp = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getTypePiece() == typePiece && typePiece != null) {
				superficieTemp += tab[i].getSuperficie();
			}
		}
		return superficieTemp;
	}

	// m�thode qui retourne le nombre de pi�ce d'un type donn�
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
