package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] tab = {};

	// constructeur
	public CalculMoyenne() {
	}
	
	// méthode qui permet d'ajouter un nombre au tableau
	public void ajout(double nb) {
		
		double tmp[] = new double[tab.length + 1];
		for (int i =0; i<tab.length && tab.length > 0; i++) {
			tmp[i] = tab[i];			
		}
		tmp[tmp.length - 1] = nb;
		tab = tmp;
	
	}
	
	// méthode qui permet de calculer la moyenne
	public double calcul() {
		double somme = 0;
		for(int j = 0; j < tab.length; j++) {
			somme += tab[j];
		}
		double moyenne = somme / tab.length;
		return moyenne;
	}


	/**
	 * @return the tab
	 */
	public double[] getTab() {
		return tab;
	}


	/**
	 * @param tab the tab to set
	 */
	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
	
}
