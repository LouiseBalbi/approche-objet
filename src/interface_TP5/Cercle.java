package interface_TP5;

public class Cercle implements ObjetGeometrique {
	
	private double rayon;

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	
	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	@Override
	public String getType() {
		return "Cercle";
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
