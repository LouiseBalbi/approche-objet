package interface_TP5;

public class Rectangle implements ObjetGeometrique {

	private double longueur;
	private double largeur;
	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		return 2 * longueur + 2 * largeur;
	}
	
	@Override
	public double surface() {
		return longueur * largeur;
	}
	
	@Override
	public String getType() {
		return "Rectangle";
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
