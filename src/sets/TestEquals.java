package sets;

public class TestEquals {

	public static void main(String[] args) {

		Pays p1 = new Pays("USA", 328_200_000, 62_794.6);
		Pays p2 = new Pays("France", 328_200_000, 62_794.6);
		
		// utilisation de la méthode equals
		boolean result = p1.equals(p2);
		System.out.println(result);
		
		// méthode avec == qui ne fonctionne pas :
		if(p1 == p2) {
			System.out.println("Les pays sont identiques");
		} else {
			System.out.println("Les pays sont différents");
		}
		
		// méthode pour retourner true avec ==
		p2 = p1;
		if(p1 == p2) {
			System.out.println("Les pays sont identiques");
		} else {
			System.out.println("Les pays sont différents");
		}
		
	}

}
