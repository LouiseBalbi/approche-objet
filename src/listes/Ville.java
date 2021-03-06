package listes;

import java.util.List;
import java.util.ArrayList;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private int nbHabitants;
	
	
	
	/**
	 * @param nom
	 * @param nbHabitants
	 * @param array
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}


	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}



	@Override
	public int compareTo(Ville autre) {
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		if(this.nbHabitants < autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}



	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}



}
