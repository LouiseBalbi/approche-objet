package fr.diginamic.essais;

import entites.Personne;
import fr.diginamic.entites.CompteBancaire;

public class TestCompteBancaire {

	public static void main(String[] args) {
		// Instance de la classe Personne
		Personne personne1 = new Personne("Dupont", "Roger");
		
		// Instance de CompteBancaire
		CompteBancaire compteCourant = new CompteBancaire("1234B", 100.5, personne1);
		
		// affichage du compteCourant
		System.out.println(compteCourant);
		System.out.println("--------------");
		
		// crédit et débit de deux montants différents sur le compteCourant
		compteCourant.setSolde(compteCourant.crediterMontant(500));
		compteCourant.setSolde(compteCourant.debiterMontant(200.7));
		
		// affichage du compteCourant après les changements de solde
		System.out.println(compteCourant);
		
	}

}
