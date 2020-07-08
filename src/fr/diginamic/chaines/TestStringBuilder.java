package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		
		long debut = System.currentTimeMillis();
		
		// instance d'un stringBuilder
		StringBuilder sb = new StringBuilder();
		
		// ajout des entiers de 1 � 100 dans sb
		for(int i = 1; i <= 100000; i++) {
			sb.append(i);
		}	
		String resultat = sb.toString();
		
		// chronom�trage de l'op�ration
		long fin = System.currentTimeMillis();
		System.out.println("Temps �coul� en millisecondes :" + (fin - debut));
		
		System.out.println("----------------------------");
		
		
		long debut2 = System.currentTimeMillis();
		
		String message = "";
		// ajout des entiers de 1 � 100 
		for(int i = 1; i <= 100000; i++) {
			message = message + i;
		}
		
		// chronom�trage de l'op�ration
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps �coul� en millisecondes :" + (fin2 - debut2));


	}

}
