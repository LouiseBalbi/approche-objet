package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		// retourne un tableau avec toutes les valeurs énumérées
		Saison[] saisons = Saison.values();

		// affichage des résultats
		for(Saison saison : saisons) {
			System.out.println(saison);
		}
		
		System.out.println("-------------------------");
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom));
		
		System.out.println("-------------------------");
		
		

	}

}
