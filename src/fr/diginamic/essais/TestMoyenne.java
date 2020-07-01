package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		// instance de la classe CalculMoyenne
		CalculMoyenne moyenne1 = new CalculMoyenne();

		// ajout de différents nombres au tableau
		moyenne1.ajout(3);
		moyenne1.ajout(8);
		moyenne1.ajout(12);		
			
		// affichage de la moyenne
		System.out.println("La moyenne est de : " + moyenne1.calcul());
		
	}

}
