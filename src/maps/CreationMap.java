package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		Employe employe1 = new Employe("Paul", 1750);
		Employe employe2 = new Employe("Hicham", 1825);
		Employe employe3 = new Employe("Yu", 2250);
		Employe employe4 = new Employe("Ingrid", 2015);
		Employe employe5 = new Employe("Chantal", 2418);

		// remplissage de la map
		Map<String, Employe> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", employe1);
		mapSalaires.put("Hicham", employe2);
		mapSalaires.put("Yu", employe3);
		mapSalaires.put("Ingrid", employe4);
		mapSalaires.put("Chantal", employe5);
		
		// affichage de la taille de la map
		System.out.println(mapSalaires.size());
	}


}
