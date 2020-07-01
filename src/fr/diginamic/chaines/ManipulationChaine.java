package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		// affichage du premier caractère de la chaine
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		// affichage de la longueur de la chaine
		System.out.println("La chaine comprend " + chaine.length() + " caractères.");
		
		// affichage de l'index du premier ";" de la chaine		
		int index1=chaine.indexOf(";"); 
		System.out.println("Index : " + index1);
		
		// Définission des indexs de début et de fin pour extraire le nom de famille de chaine
		int index2=chaine.indexOf(";");
		String nomFamille = chaine.substring(0, index2);
		// affichage du nom de famille en majuscule
		System.out.println("Nom de famille : " + nomFamille.toUpperCase());
		
		// affichage du nom de famille en minuscule
		System.out.println("Nom de famille : " + nomFamille.toLowerCase());

		System.out.println("--------------------------");
		// découpe la chaine de caractère en morceaux
		String tab[] = chaine.split(";");
		// affiche le tableau
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		System.out.println("--------------------------");

		// remplace l'espace par rien dans le salaire
		String salaire1 = tab[2].replace(" ", "");
		
		// transformtion d'un type String à double pour le salaire
		double salaire = Double.parseDouble(salaire1);
		System.out.println(salaire);
			
		// instance de Salarie
		Salarie salarie = new Salarie(tab[0], tab[1], salaire);
		
		// affichage de Salarie
		System.out.println(salarie);
	}

}
