package entites;

public class Personne {

		public String nom;
		public String pr�nom;
		public AdressePostale adresse;
		
		// premier constructeur qui prend en param�tre nom et pr�nom
		public Personne(String nom, String pr�nom) {
			super();
			this.nom = nom;
			this.pr�nom = pr�nom;
		}

		// second constructeur qui prend en compte les 3 param�tres nom, pr�nom et adresse
		public Personne(String nom, String pr�nom, AdressePostale adresse) {
			super();
			this.nom = nom;
			this.pr�nom = pr�nom;
			this.adresse = adresse;
		}
		
		

	

}
