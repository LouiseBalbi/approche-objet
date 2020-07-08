package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		
		// création d'un HashSet
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
			
		// affichage du set
		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
		double i = iterator.next();
		System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		// recherche du plus grand élément
		double elementPlusGrand = set.iterator().next();
		for(double d : set) {
			if(d > elementPlusGrand) {
				elementPlusGrand = d;
			}
		}
		System.out.println("L'élément le plus grand du set est : " + elementPlusGrand);
		
		System.out.println("---------------------");
		
		// recherche du plus petit élément
		double elementPlusPetit = set.iterator().next();
		for(double d : set) {
			if(d < elementPlusPetit) {
				elementPlusPetit= d;
			}
		}
		
		// suppression du plus petit élément
		set.remove(elementPlusPetit);
		
		// affichage du set
		Iterator<Double> iterator3 = set.iterator();
		while (iterator3.hasNext()) {
		double i = iterator3.next();
		System.out.println(i);
		}


	}

}
