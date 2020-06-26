package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		// instance de la classe Compte
		Compte comptePerso = new Compte("12345N", 50.5);
		
		String numComptePerso = comptePerso.getNumCompte();
		double soldeComptePerso = comptePerso.getSoldeCompte();
		
		System.out.println(comptePerso);

	}

}
