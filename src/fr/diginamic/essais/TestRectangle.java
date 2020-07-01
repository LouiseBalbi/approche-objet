package fr.diginamic.essais;

import fr.diginamic.entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// Instances de 2 rectangles différents 
		Rectangle rectangle1 = new Rectangle(5, 3.5);
		Rectangle rectangle2 = new Rectangle(12, 10.3);
		
		//calcul de périmètre et de calcul de surface.
		System.out.println("Le périmètre du rectangle1 est : " + rectangle1.perimetre());
		System.out.println("La surface du rectangle1 est : " + rectangle1.surface() + "\n");
		
		System.out.println("Le périmètre du rectangle2 est : " + rectangle2.perimetre());
		System.out.println("La surface du rectangle2 est : " + rectangle2.surface());
	}

}
