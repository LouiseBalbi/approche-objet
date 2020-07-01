package fr.diginamic.formes;

public abstract class Forme {

	public abstract double calculerSurface();
	
	public abstract double calculerPerimetre();

	@Override
	public String toString() {
		return "Forme [Surface  =" + calculerSurface() + ", Perimetre = " + calculerPerimetre() + "]";
	}
}
