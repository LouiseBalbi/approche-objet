package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		// création d'une instance de Date à la date du jour
		Date d1 = new Date();
		
		// choix du format avec lequel on veut afficher la date
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");	
		String chaine1 = formateur.format(d1);
		
		// affichage de la date
		System.out.println(chaine1);
		
		System.out.println("-------------------------");
		
		// instance de Date
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
			
		// choix du format avec lequel on veut afficher la date
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	
		String chaine2 = formateur2.format(d2);
		
		// affichage de la date
		System.out.println(chaine2);
		
		// date du jour
		Date d3 = new Date();
		String chaine3 = formateur2.format(d3);
		System.out.println(chaine3);

	}

}
