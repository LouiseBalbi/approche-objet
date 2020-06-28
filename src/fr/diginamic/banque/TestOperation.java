package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] operations = new Operation[4];

		operations[0] = new Credit("26/05/2020", 345);
		operations[1] = new Debit("12/06/2020", 20.5);
		operations[2] = new Credit("14/05/2020", 120);
		operations[3] = new Debit("9/08/2020", 20.5);

		double solde = 0.0;

		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			if (operations[i].getType().equals("CREDIT")) {
				solde += operations[i].getMontant();
			} else {
				solde -= operations[i].getMontant();
			}
		}
	}
}
