package fr.diginamic.operations;

public class Operations {

	// constructeur
	public Operations() {		
	}

	// m�thode qui r�alise un calcul entre a et b en fonction de l'op�rateur
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
			// si le caract�re ne correspond � aucun des 4 : +, -, * et /; c'est une erreur et on affiche 0 
			System.out.println("Mauvais op�rateur");
			return 0.0 ;
		}
	}
	
	

}
