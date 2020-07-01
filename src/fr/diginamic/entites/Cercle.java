package fr.diginamic.entites;

public class Cercle {
	//Cette classe a un seul attribut d’instance : son rayon de type double	
	private double rayon;

	// constructeur
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	
	//méthode qui retourne le périmètre du cercle
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	//Créez une méthode qui retourne la surface du cercle.
	public double surface() {
		return Math.PI*(rayon*rayon);
	}
	
	// getter
	public double getRayon() {
		return rayon;
	}

	// setter
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}



	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}
	
	

}
