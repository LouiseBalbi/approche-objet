package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import listes.Ville;

public class TriListe {

	public static void main(String[] args) {

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

		// tri de la liste en utilisant comparable
		Collections.sort(array2);

		// affichage du résultat
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i));
		}

		System.out.println("------------------------");

		///////////////////////////////

		// tri par ordre croissant de nombre d'habitants en utilisant Comparator
		ComparatorHabitant comparator1 = new ComparatorHabitant();
		Collections.sort(array2, comparator1);

		// affichage du résultat
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i));
		}

		System.out.println("------------------------");

		///////////////////////////////

		// tri par ordre alphabétique en utilisant Comparator
		ComparatorNom comparator2 = new ComparatorNom();
		Collections.sort(array2, comparator2);

		// affichage du résultat
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i));
		}

	}
}


