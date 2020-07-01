package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;	
	
	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	
	
	@Override
	public double calculerSurface() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}	

}
