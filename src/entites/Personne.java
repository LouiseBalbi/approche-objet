package entites;

public class Personne {

		public String nom;
		public String pr�nom;
		public AdressePostale adresse;
		
		// premier constructeur qui prend en param�tre nom et pr�nom
		public Personne(String nom, String pr�nom) {
			this.nom = nom;
			this.pr�nom = pr�nom;
		}

		// second constructeur qui prend en compte les 3 param�tres nom, pr�nom et adresse
		public Personne(String nom, String pr�nom, AdressePostale adresse) {
			this.nom = nom;
			this.pr�nom = pr�nom;
			this.adresse = adresse;
		}
		
		// m�thode qui affiche le nom en majuscule et le pr�nom
		public void afficherNomEntier() {
			System.out.println(nom.toUpperCase() + " " + pr�nom);

		}
		
		// m�thode qui permet de modifier la variable d'instance nom de Personne
		public void modifierNom(String nomModif) {
			nom = nomModif;
		}
		
		// m�thode qui permet de modifier la variable d'instance pr�nom de Personne
		public void modifierPrenom(String pr�nomModif) {
			pr�nom = pr�nomModif;
		}
		
		// m�thode qui permet de modifier la variable d'instance adresse de Personne
		public void modifierAdresse(AdressePostale adresseModif) {
			adresse = adresseModif;
		}
		
		// m�thode qui retourne le nom
		public String returnNom() {
			return nom;
		}
		
		// m�thode qui retourne le pr�nom
		public String returnPr�nom() {
			return pr�nom;
		}
		
		// m�thode qui retourne l'adresse
		public AdressePostale returnAdresse() {
			return adresse;
		}
		

}
