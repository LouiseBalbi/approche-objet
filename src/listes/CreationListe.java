package listes;

import java.util.List;
import java.util.ArrayList;


public class CreationListe {

	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<>();

		for(int i = 0; i <= 100; i++) {
			array.add(i);
		}

		System.out.println(array.size());
		
	}

}
