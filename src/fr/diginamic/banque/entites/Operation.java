package fr.diginamic.banque.entites;

public abstract class Operation {

	private String date;
	private double montant;
	
	// constructeur
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	
	@Override
	public String toString() {
		return "date=" + date + ", montant=" + montant + ", type =" + getType() ;
	}

	
	public abstract String getType();
		

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
		
	
}
