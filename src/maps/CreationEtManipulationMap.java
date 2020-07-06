package maps;

import java.util.HashMap;

import listes.Ville;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// ajout à la map de Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");		
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// affichage des clés
		for(Integer key : mapVilles.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("------------------------");
		
		// affichage des valeurs
		for(String ville : mapVilles.values()) {
			System.out.println(ville);
		}

		System.out.println("------------------------");
		// affichage de la taille de la map
		System.out.println("Taille de la map : " + mapVilles.size());

	}

}
