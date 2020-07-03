package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		// affichage des �l�ments de la liste
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Taille de la liste : " + list.size());

		// Recherche et affichage du plus grand �l�ment de la liste
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println("Le nombre maximal de la liste est : " + max);

		// trouver le plus petit �l�ment de la liste
		int min = max;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("Le plus petit nombre de la liste est : " + min);
		System.out.println("-------------------");
		
		// suppression du plus petit �l�ment
		list.remove(Collections.min(list));
		
		// affichage des �l�ments de la liste apr�s suppression du min
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------");
		
		//Recherchez tous les �l�ments n�gatifs et modifiez les de mani�re � ce qu�ils deviennent
		//positifs.
		for (int i = 0; i < list.size(); i++) {
			int elt = list.get(i);
			if (list.get(i) < 0) {
				list.set(i,  -elt);
			}
		}
		
		// affichage de la liste r�sultante
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
