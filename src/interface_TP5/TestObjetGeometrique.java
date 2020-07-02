package interface_TP5;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// création d'un tableau d'ObjetGeometrique
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		
		// création d'instances des classes Cercles et Rectangles
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(7, 4);
		
		// assignation de cercle et rectangle dans le tableau
		tab[0] = cercle;
		tab[1] = rectangle;
		
		// affichage du périmètre et de la surface de chaque objet
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].getType());
			System.out.println("Le perimetre est de " + tab[i].perimetre() + " cm");
			System.out.println("La surface est de : " + tab[i].surface() + " cm2");
			System.out.println("-----------------");
		}

	}

}
