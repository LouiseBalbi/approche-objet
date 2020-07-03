package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {

		// création d'une arraylist à partir de la classe ville
		List<Ville> array2 = new ArrayList<>();
		Ville ville1 = new Ville("Nice", 343000);
		array2.add(ville1);
		Ville ville2 = new Ville("Carcassonne", 47800);
		array2.add(ville2);
		Ville ville3 = new Ville("Narbonne", 53400);
		array2.add(ville3);
		Ville ville5 = new Ville("Lyon", 484000);
		array2.add(ville5);
		Ville ville6 = new Ville("Foix", 9700);
		array2.add(ville6);
		Ville ville7 = new Ville("Pau", 77200);
		array2.add(ville7);
		Ville ville8 = new Ville("Marseille", 850700);
		array2.add(ville8);
		Ville ville9 = new Ville("Tarbes", 40600);
		array2.add(ville9);

		// recherche et affichage la ville la plus peuplée
		int nbHab = 0;
		String villePlusPeuplee = null;

		for (Ville ville : array2) {
			if (ville.getNbHabitants() > nbHab) {
				nbHab = ville.getNbHabitants();
				villePlusPeuplee = ville.getNom();
			}
		}
		System.out.println("Ville la plus peuplée : " + villePlusPeuplee);
		System.out.println("-----------------------");

		// recherche et affichage de la ville la plus peuplée
		String villeMoinsPeuplee = null;

		for (Ville ville : array2) {
			if (ville.getNbHabitants() < nbHab) {
				nbHab = ville.getNbHabitants();
				villeMoinsPeuplee = ville.getNom();
			}
		}
		
		array2.remove(villeMoinsPeuplee);
		System.out.println("ville la moins peuplée : " + villeMoinsPeuplee);
		System.out.println("-----------------------");

		
		for (Ville ville : array2) {
			if(ville.getNbHabitants() > 100000);{
			ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		for(int i =0; i<array2.size(); i++) {
			System.out.println(array2.get(i));
		}
		
	}
}
