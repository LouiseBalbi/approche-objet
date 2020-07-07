package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;


public class Application {

	public static void main(String[] args) {

		try {
			// création d'une variable de type file
			File file = new File("C:\\Users\\louis\\Desktop\\Diginamic\\recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			// création d'une arraylist pour stocker toutes les villes
			List<Ville> listeVilles = new ArrayList<>();

			// parcours de la liste lignes, l'index initial est mis à 1 pour ne pas prendre
			// en compte la première
			// ligne du talbeau excel qui ne correspond pas à une ville
			for (int i = 1; i < lignes.size(); i++) {
				// les lignes sont séparées en différents morceaux
				String[] morceaux = lignes.get(i).split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				// conversion de population en int et suppression des espaces dans le nombre
				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

				// instance de la classe ville
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);
				// ville est ensuite ajoutée à l'arraylist listeVilles
				listeVilles.add(ville);
			}

			// recherche et affichage des données de Montpellier
			for (Ville ville : listeVilles) {
				if (ville.getNomCommune().equals("Montpellier")) {
					System.out.println(ville);
				}
			}
			System.out.println("---------------------------");

			// afficher la population de tout le département de l’Hérault
			// création d'une liste contenant toutes les villes de l'Herault
			List<Ville> villesHerault = new ArrayList<>();
			for (Ville ville : listeVilles) {
				if (ville.getCodeDepartement().equals("34")) {
					villesHerault.add(ville);
				}
			}

			int nbHabitantsDepartement = 0;
			for (Ville ville : villesHerault) {
				nbHabitantsDepartement += ville.getPopulationTotale();
			}
			System.out.println("Nombre d'habitants dans l'Herault : " + nbHabitantsDepartement);

			System.out.println("---------------------------");

			// recherche de la plus petite ville de l'Herault
			Ville plusPetiteVille = villesHerault.get(0);
			for (Ville ville : villesHerault) {
				if (ville.getPopulationTotale() < plusPetiteVille.getPopulationTotale()) {
					plusPetiteVille = ville;
				}
			}
			System.out.println("Plus petite ville de l'Herault : " + plusPetiteVille);

			System.out.println("---------------------------");

			// instance d'un comparator qui compare des villes
			ComparatorVillePlusGrande comparator1 = new ComparatorVillePlusGrande();
			// tri de la liste villesHerault de la ville la moins peuplée à la villes la
			// plus peuplée
			Collections.sort(villesHerault, comparator1);

			// affichage des 10 villes les plus grandes
			System.out.println("10 plus grandes villes : ");
			int i = villesHerault.size() - 1;
			while (i > villesHerault.size() - 11) {
				System.out.println(villesHerault.get(i));
				i--;
			}

			System.out.println("---------------------------");

			// affichage des 10 villes les plus petites
			System.out.println("10 plus petites villes : ");
			int j = 0;
			while (j < 10) {
				System.out.println(villesHerault.get(j));
				j++;
			}

			System.out.println("---------------------------");

			// création d'une liste contenant toutes les villes d'Occitanie
			List<Ville> villesOccitanie = new ArrayList<>();
			for (Ville ville : listeVilles) {
				if (ville.getCodeRegion().equals("76")) {
					villesOccitanie.add(ville);
				}
			}

			// calcul de la population de la region occitanie
			int nbHabitantsRegion = 0;
			for (Ville ville : villesOccitanie) {
				nbHabitantsRegion += ville.getPopulationTotale();
			}
			// affichage du résultat
			System.out.println("Nombre habitants en Occitanie : " + nbHabitantsRegion);

			System.out.println("---------------------------");

			// tri de la liste
			Collections.sort(villesOccitanie, comparator1);

			// affichage des 10 villes les plus grandes d'Occitanie
			System.out.println("10 plus grandes villes d'Occitanie : ");
			int k = villesOccitanie.size() - 1;
			while (k > villesOccitanie.size() - 11) {
				System.out.println(villesOccitanie.get(k));
				k--;
			}

			System.out.println("---------------------------");

			HashMap<String, Integer> departementOccitanie = new HashMap<String, Integer>();

			for (Ville v : villesOccitanie) {

				// vérifier qu'un compteur existe pour le département
				String departementActuel = v.getCodeDepartement();

				// s'il le compteur est null on ajoute le département de la ville avec un
				// compteur du nombre d'habitants de la ville
				if (departementOccitanie.get(departementActuel) == null) {
					departementOccitanie.put(v.getCodeDepartement(), v.getPopulationTotale());
				}
				// sinon on incrémente le compteur avec la nouvelle valeur d'habitants
				else {
					int habitantsDepartement = departementOccitanie.get(departementActuel) + v.getPopulationTotale();
					departementOccitanie.put(departementActuel, habitantsDepartement);
				}

			}

			String departementPlusPeuple = departementOccitanie.entrySet().iterator().next().getKey();

			for (String key : departementOccitanie.keySet()) {
				if (departementOccitanie.get(departementPlusPeuple) < departementOccitanie.get(key)) {
					departementPlusPeuple = key;
				}
			}

			System.out.println("Departement le plus peuplé d'Occitanie : " + departementPlusPeuple);

			System.out.println("---------------------------");
			System.out.println("---------------------------");

			// 10 régions les plus peuplées de France

			HashMap<String, Integer> regionsPopulation = new HashMap<String, Integer>();

			for (Ville v : listeVilles) {

				// vérifier que la région existe dans le hashmap
				String regionActuelle = v.getNomRegion();

				// si la région n'est pas présente dans le hasmap, on l'ajoute ainsi que le
				// nombre
				// d'habitants de la ville en cours
				if (regionsPopulation.get(regionActuelle) == null) {
					regionsPopulation.put(v.getNomRegion(), v.getPopulationTotale());
				}
				// sinon on ajoute le nombre d'habitants de la ville au nombre d'habitants de la
				// région
				else {
					int habitantsRegion = regionsPopulation.get(regionActuelle) + v.getPopulationTotale();
					regionsPopulation.put(regionActuelle, habitantsRegion);
				}

			}

			// tri des valeurs du hashmap en utilisant un linkedHashMap
			LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

			regionsPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue())
					.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
			
			// affichage des 10 régions les plus peuplées de la LinkedHashMap
			System.out.println("10 régions les plus peuplées : ");
			int indexStart = sortedMap.size()-11;
			int index = 0;
			for (String key : sortedMap.keySet()) {
				if (index > indexStart) {
					
					System.out.println(key);
				}
				index ++;
			}

			
			System.out.println("---------------------------");

			// les 10 départements les plus peuplés de France

			HashMap<String, Integer> departementPopulation = new HashMap<String, Integer>();

			for (Ville v : listeVilles) {

				// vérifier que le département existe dans le hashmap
				String departementActuel = v.getCodeDepartement();

				// si le département n'est pas présent dans le hasmap, on l'ajoute ainsi que le
				// nombre
				// d'habitants de la ville en cours
				if (departementPopulation.get(departementActuel) == null) {
					departementPopulation.put(v.getCodeDepartement(), v.getPopulationTotale());
				}
				// sinon on ajoute le nombre d'habitants de la ville au nombre d'habitants du
				// département
				else {
					int habitantsDepartement = departementPopulation.get(departementActuel) + v.getPopulationTotale();
					departementPopulation.put(departementActuel, habitantsDepartement);
				}

			}


			// tri des valeurs du hashmap en utilisant un linkedHashMap
			LinkedHashMap<String, Integer> departementTrie = new LinkedHashMap<>();

			departementPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue())
					.forEachOrdered(x -> departementTrie.put(x.getKey(), x.getValue()));
			
			// affichage des 10 départements les plus peuplés de la LinkedHashMap
			System.out.println("10 départements les plus peuplés : ");
			int indexStart2 = departementTrie.size()-11;
			int index2 = 0;
			for (String key : departementTrie.keySet()) {
				if (index2 > indexStart2) {					
					System.out.println(key);
				}
				index2 ++;
			}
			

			
			System.out.println("---------------------------");

			// 10 villes les plus peuplées de France
			// tri de la liste
			Collections.sort(listeVilles, comparator1);

			// affichage des 10 villes les plus grandes d'Occitanie
			System.out.println("10 plus grandes villes de France : ");
			int o = listeVilles.size() - 1;
			while (o > listeVilles.size() - 11) {
				System.out.println(listeVilles.get(o));
				o--;
			}

		} catch (IOException e) {
			// traitement des exceptions
			System.out.println(e.getMessage());
		}

	}

}
