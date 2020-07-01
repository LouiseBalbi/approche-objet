package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		// tests de toutes les opérations
		System.out.println(Operations.calcul(5, 6, '+'));	
		System.out.println(Operations.calcul(23, 5, '-'));
		System.out.println(Operations.calcul(5, 7, '*'));
		System.out.println(Operations.calcul(36, 4, '/'));		
	}

}
