package entites;

public class Personne {

		public String nom;
		public String prénom;
		public AdressePostale adresse;
		
		// premier constructeur qui prend en paramètre nom et prénom
		public Personne(String nom, String prénom) {
			this.nom = nom;
			this.prénom = prénom;
		}

		// second constructeur qui prend en compte les 3 paramètres nom, prénom et adresse
		public Personne(String nom, String prénom, AdressePostale adresse) {
			this.nom = nom;
			this.prénom = prénom;
			this.adresse = adresse;
		}
		
		// méthode qui affiche le nom en majuscule et le prénom
		public void afficherNomEntier() {
			System.out.println(nom.toUpperCase() + " " + prénom);

		}
		
		// méthode qui permet de modifier la variable d'instance nom de Personne
		public void modifierNom(String nomModif) {
			nom = nomModif;
		}
		
		// méthode qui permet de modifier la variable d'instance prénom de Personne
		public void modifierPrenom(String prénomModif) {
			prénom = prénomModif;
		}
		
		// méthode qui permet de modifier la variable d'instance adresse de Personne
		public void modifierAdresse(AdressePostale adresseModif) {
			adresse = adresseModif;
		}
		
		// méthode qui retourne le nom
		public String returnNom() {
			return nom;
		}
		
		// méthode qui retourne le prénom
		public String returnPrénom() {
			return prénom;
		}
		
		// méthode qui retourne l'adresse
		public AdressePostale returnAdresse() {
			return adresse;
		}
		

}
