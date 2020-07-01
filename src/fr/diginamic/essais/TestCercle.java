package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		// Instances cercle1 et cerlce2 de la classe Cercle
		Cercle cercle1 = new Cercle(3.5);
		Cercle cercle2 = new Cercle(10.8);
		
		// Affichage des résultats des méthodes de calcul de périmètre et surface
		System.out.println("Perimètre du cerlce 1 : " + cercle1.perimetre());
		System.out.println("Surface du cerlce 1 : " + cercle1.surface() + "\n");
		
		System.out.println("Perimètre du cerlce 2 : " + cercle2.perimetre());
		System.out.println("Surface du cerlce 2 : " + cercle2.surface());
		
		
		// création de nouveaux cercles en faisant appel à la classe CercleFactory
		Cercle cercle3 = CercleFactory.creerCercle(4.6);
		
		System.out.println(cercle3.toString());
	}

}
