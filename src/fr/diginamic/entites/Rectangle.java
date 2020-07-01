package fr.diginamic.entites;

public class Rectangle {
	//Cette classe a 2 attributs d’instance : sa longueur et sa largeur
	private double longueur;
	private double largeur;
	
	// Constructeur permettant de valoriser la longueur et la largeur du rectangle.
	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	//Méthode qui retourne le périmètre du rectangle
	public double perimetre() {
		return 2*longueur + 2*largeur;
	}
	
	//Méthode qui retourne la surface du rectangle.
	public double surface() {
		return longueur*largeur;
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	

}
