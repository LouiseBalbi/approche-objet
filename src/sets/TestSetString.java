package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestSetString {

	public static void main(String[] args) {
		
		// création du set
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		

		// recherche du pays avec le plus grand nombre de lettres
		String ref = set.iterator().next();
		for(String s: set) {
			if(s.length() > ref.length()) {
				ref = s;
			}
		}

		// suppression de pays avec le plus de lettre
		set.remove(ref);
		
		// affichage du résultat
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
		String i = iterator.next();
		System.out.println(i);
		}
	}

}
