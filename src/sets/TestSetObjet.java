package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetObjet {

	public static void main(String[] args) {
		
		Set<Pays> set = new HashSet<>();
		Pays pays1 = new Pays("USA", 328_200_000, 62_794.6);
		set.add(pays1);
		Pays pays2 = new Pays("France", 66_990_000, 41_463.6);
		set.add(pays2);
		Pays pays3 = new Pays("Allemagne", 83_020_000, 47_603.03);
		set.add(pays3);
		Pays pays4 = new Pays("UK", 66_650_000, 42_943.9);
		set.add(pays4);
		Pays pays5 = new Pays("Italie", 60_360_000, 34_483.2);
		set.add(pays5);
		Pays pays6 = new Pays("Japon", 126_500_000, 39_289.96);
		set.add(pays6);
		Pays pays7 = new Pays("Chine", 1_393_000_000, 9_770.85);
		set.add(pays7);
		Pays pays8 = new Pays("Russie", 144_000_000, 11_288.87);
		set.add(pays8);
		Pays pays9 = new Pays("Inde", 1_353_000_000, 2009.98);
		set.add(pays9);
		
		// recherche du Pays avec le PIB le plus important
		Pays ref = set.iterator().next();
		for(Pays p : set) {
			if(p.getPibParHabitants() > ref.getPibParHabitants()) {
				ref = p;
			}
		}
		System.out.println("Pays avec le PIB le plus important : " + ref);
		
		// recherhce du pays avec le PIB total le plus important
		Pays ref2 = set.iterator().next();
		for(Pays p : set) {
			if(p.getPibParHabitants() * p.getNbHabitants() > ref2.getPibParHabitants() * ref2.getNbHabitants()) {
				ref2 = p;
			}
		}
		
		System.out.println("Pays avec le PIB total le plus important : " + ref2);
		
		
		// mettre en majuscule le pays avec le PIB total le plus petit
		Pays ref3 = set.iterator().next();
		for(Pays p : set) {
			if(p.getPibParHabitants() * p.getNbHabitants() < ref3.getPibParHabitants() * ref3.getNbHabitants()) {
				ref3 = p;
			}
		}
		
		ref3.setNom(ref3.getNom().toUpperCase());
		System.out.println("Pays avec le PIB total le plus petit : " + ref3);
		
		// suppression du pays avec le plus petit PIB total
		set.remove(ref3);
		
		System.out.println("----------------------------");
		
		// affichage du set final
		Iterator<Pays> iterator = set.iterator();
		while (iterator.hasNext()) {
		Pays i = iterator.next();
		System.out.println(i);
		}
	}

}
