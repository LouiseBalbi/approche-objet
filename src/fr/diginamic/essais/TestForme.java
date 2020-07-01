package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	

	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle(8);
		Rectangle rectangle1 = new Rectangle(4, 6);
		Carre carre1 = new Carre(5);
		
		AffichageForme affichage = new AffichageForme();
		
		affichage.afficher(cercle1);
		affichage.afficher(rectangle1);
		affichage.afficher(carre1);

	}

}
