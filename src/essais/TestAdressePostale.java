package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		// instance de la classe AdressePostale
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 5;
		adresse1.libelleRue = "rue de l'aiguelongue";
		adresse1.codePostal = 34000;
		adresse1.ville = "Montpellier";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 10;
		adresse2.libelleRue = "rue de la répblique";
		adresse2.codePostal = 69000;
		adresse2.ville = "Lyon";
		

	}

}
