package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		// instance de la classe maison
		Maison maison = new Maison();
		
		// ajouts de diff�rentes pi�ces � maison
		maison.ajouterPiece(new Chambre(12, 1));
		maison.ajouterPiece(new Chambre(10, 1));
		maison.ajouterPiece(new Salon(18, 0));
		maison.ajouterPiece(new Cuisine(10, 0));
		maison.ajouterPiece(new SalleDeBain(4, 1));
		maison.ajouterPiece(new Wc(1, 0));

		
		// affichage des r�sultats
		System.out.println("Superficie totale : " + maison.superficieTotale() + " m2");
		System.out.println("Superficie rez de chauss�e : " + maison.superficieEtage(0)+ " m2");
		System.out.println("Superficie �tage 1 : " + maison.superficieEtage(1)+ " m2");
		
		System.out.println("La superficie totale des chambres est de : " + maison.superficieTypePiece("Chambre") + " m2");
		System.out.println("Il y a " + maison.nbPieceType("Chambre") + " chambres.");
	}

}
