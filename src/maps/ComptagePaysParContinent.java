package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import listes.Ville;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		// création d'une arraylist de pays
		List<Pays> list = new ArrayList<>();
		Pays pays1 = new Pays("France", 65_000_000, "Europe");
		list.add(pays1);
		Pays pays2 = new Pays("Allemagne", 80_000_000, "Europe");
		list.add(pays2);
		Pays pays3 = new Pays("Belgique", 10_000_000, "Europe");
		list.add(pays3);
		Pays pays4 = new Pays("Russie", 150_000_000, "Asie");
		list.add(pays4);
		Pays pays5 = new Pays("Chine", 1_400_000_000, "Asie");
		list.add(pays5);
		Pays pays6 = new Pays("Indonésie", 220_000_000, "Océanie");
		list.add(pays6);
		Pays pays7 = new Pays("Australie", 20_000_000, "Océanie");
		list.add(pays7);

		// map permettant pour réaliser un comptage du nombre de pays par continent
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (Pays p : list) {

			// vérifier qu'un compteur existe pour le pays
			Integer compteur = map.get(p.getContinent());

			// s'il le compteur est null on ajoute le pays avec un compteur de 1
			if (compteur == null) {
				map.put(p.getContinent(), 1);
			}
			// sinon on incrémente de le compteur
			else {
				compteur++;
				map.put(p.getContinent(), compteur);
			}

		}

		System.out.println(map);
	}

}
