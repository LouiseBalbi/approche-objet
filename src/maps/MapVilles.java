package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import listes.Ville;

public class MapVilles {

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

		// map permettant de stocker les villes
		HashMap<String, Ville> map = new HashMap<String, Ville>();
		for(Ville v : array2) {
			map.put(v.getNom(), v);
		}
		
		System.out.println(map);
		System.out.println("-----------------");
	
		// initialisation d'une variable temporaire res à un élément de la map, elle définira la ville la moins peuplée 
		Ville res = map.entrySet().iterator().next().getValue();
		

		// recherche de la ville la moins peuplée
		for (Ville ville : map.values()) {
			if (ville.getNbHabitants() < res.getNbHabitants()) {
				res = ville;
			}
		}
	
		// suppression de la ville la moins peuplée
		map.remove(res.getNom());
		
		// affichage du résultat
		System.out.println(map);
		
		}
			
	}

