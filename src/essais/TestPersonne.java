package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// instances de la classe AdressePostale
		AdressePostale adresse1 = new AdressePostale(5, "rue de l'aiguelongue", 34000, "Montpellier");
		
		AdressePostale adresse2 = new AdressePostale(10, "rue de la r�pblique", 69000, "Lyon");
		
		// instances de la classe Personne	
		Personne personne1 = new Personne("Dupont", "Julie", adresse1);
		
		
		Personne personne2 = new Personne("Boulanger","Julien", adresse2);

		// affichage du nom et pr�nom de personne1
		personne1.afficherNomEntier();
		// affichage de pr�nom de personne1
		System.out.println(personne1.returnPrenom());
		// modification de nom de personne1
		personne1.modifierNom("Martin");
		// affichage du nom modifi� et pr�nom de personne1
		personne1.afficherNomEntier();
		
		personne1.modifierAdresse(adresse2);
		
	}

}
