package entites;

public class Personne {

		public String nom;
		public String prénom;
		public AdressePostale adresse;
		
		// premier constructeur qui prend en paramètre nom et prénom
		public Personne(String nom, String prénom) {
			super();
			this.nom = nom;
			this.prénom = prénom;
		}

		// second constructeur qui prend en compte les 3 paramètres nom, prénom et adresse
		public Personne(String nom, String prénom, AdressePostale adresse) {
			super();
			this.nom = nom;
			this.prénom = prénom;
			this.adresse = adresse;
		}
		
		

	

}
