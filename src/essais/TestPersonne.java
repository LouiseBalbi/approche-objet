package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
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
		
		// instance de la classe Personne	
		Personne personne1 = new Personne();
		personne1.nom = "Dupont";
		personne1.prénom = "Julie";
		personne1.adresse = adresse1;
		
		
		Personne personne2 = new Personne();
		personne1.nom = "Boulanger";
		personne1.prénom = "Julien";
		personne1.adresse = adresse2;

	}

}
