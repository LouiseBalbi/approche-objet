package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		// instance de la classe Salarie
		Salarie salarie1 = new Salarie("Martin", "Antoine", 1600.0);		
		// affichage du salaire de salarie1
		System.out.println(salarie1.getSalaire());
		
		// instance de la classe Pigiste
		Pigiste pigiste1 = new Pigiste("Smith", "Billy", 20, 200);
		// affichage du salaire de pigiste1
		System.out.println(pigiste1.getSalaire());
		
		System.out.println("--------------------");

		// affichage des données de salarie1
		salarie1.afficherDonnees();
		
		// affichage des données de pigiste1
		pigiste1.afficherDonnees();
	}

}
