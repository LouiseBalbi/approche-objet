package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		
		String chaine = "12";
		
		// conversion de la variable chaine de type chaine de caractère en variable de type entier
		int i = Integer.parseInt(chaine);
		// affichage de l'entier i
		System.out.println(i);
		
		int a = 2;
		int b = 4;
		// affichage du nombre maximum entre a et b
		System.out.println("Le plus grand est " + Integer.max(a, b));

	}

}
