package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {

		List<String> array = new ArrayList<>();
		array.add("Nice");
		array.add("Carcassone");
		array.add("Narbonne");
		array.add("Lyon");
		array.add("Foix");
		array.add("Pau");
		array.add("Marseille");
		array.add("Tarbes");

		// recherche de la ville qui a le plus grand nombre de lettre
		int nbLettres = 0;
		String ville = null;

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).length() > nbLettres) {
				nbLettres = array.get(i).length();
				ville = array.get(i);
			}
		}
		System.out.println("Ville avec le plus grand nombre de lettres : " + ville);
		System.out.println("------------------------");

		//mettre tous les noms de ville en majuscule
		for (int i = 0; i < array.size(); i++) {
			String villeMaj = array.get(i);
			array.set(i, villeMaj.toUpperCase());
			System.out.println(array.get(i).toUpperCase());
		}

		
		System.out.println("------------------------");
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).startsWith("N")) {
				array.remove(array.get(i));
			}
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
	}
}
