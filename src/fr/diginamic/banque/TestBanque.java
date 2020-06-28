package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		// instance de la classe Compte
		Compte comptePerso = new Compte("12345N", 50.5);
		
		String numComptePerso = comptePerso.getNumCompte();
		double soldeComptePerso = comptePerso.getSoldeCompte();
		
		System.out.println(comptePerso.toString());
		
		System.out.println("----------------");
		
		// tableau contenant deux comptes
		Compte tabComptes[] = new Compte [2];
		tabComptes[0] = new Compte("AZE34", 456.5); // compte normal
		tabComptes[1] = new CompteTaux("4567T", 12.3, 1.2); // compte avec taux
		

		for (int i = 0; i <= tabComptes.length - 1; i++) {
			System.out.println(tabComptes[i]);
		}
		

	}

}
