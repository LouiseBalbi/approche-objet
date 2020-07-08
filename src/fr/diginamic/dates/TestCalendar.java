package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		// création d'une instance de date
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		// choix du format
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");	
		String chaine1 = formateur.format(date);
		
		// affichage de la date
		System.out.println(chaine1);
		System.out.println("-----------------------");
		
		
		// création d'une instance à la date du jour
		
		Calendar calJour = Calendar.getInstance();
		Date dateDuJour = calJour.getTime();
		// choix du format
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	
		String chaine2 = formateur2.format(dateDuJour);
		
		System.out.println(chaine2);
		System.out.println("-----------------------");
		
		// choix du format différent, locale français
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.FRANCE);	
		String chaine3 = formateur3.format(dateDuJour);
		
		System.out.println(chaine3);
		System.out.println("-----------------------");
		
		// choix du format différent, locale russe
		Locale russe = new Locale("ru", "RU");
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", russe);	
		String chaine4 = formateur4.format(dateDuJour);
		
		System.out.println(chaine4);
		System.out.println("-----------------------");


		// choix du format différent, locale chinois
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.CHINESE);	
		String chaine5 = formateur5.format(dateDuJour);
		
		System.out.println(chaine5);
		System.out.println("-----------------------");
		
		// choix du format différent, locale allemand
		SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss", Locale.GERMAN);	
		String chaine6 = formateur6.format(dateDuJour);
		
		System.out.println(chaine6);


	}

}
