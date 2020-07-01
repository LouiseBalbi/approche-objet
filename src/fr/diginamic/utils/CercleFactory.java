package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle creerCercle (double r) {
		return new Cercle(r);
	}

}
