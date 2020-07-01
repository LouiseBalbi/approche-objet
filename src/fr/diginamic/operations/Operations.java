package fr.diginamic.operations;

public class Operations {

	// constructeur
	public Operations() {		
	}

	// méthode qui réalise un calcul entre a et b en fonction de l'opérateur
	public static double calcul(double a,  double b, char c) {
		if (c == '+') {
			return a + b;
		} else if (c == '-') {
			return a - b;
		} else if (c == '*') {
			return a * b;
		} else if (c == '/') {
			return a / b;
		}else {
			// si le caractère ne correspond à aucun des 4 : +, -, * et /; c'est une erreur et on affiche 0 
			System.out.println("Mauvais opérateur");
			return 0.0 ;
		}
	}
	
	

}
