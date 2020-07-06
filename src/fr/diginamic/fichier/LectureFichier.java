package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) {

		try {
			// création d'une variable de type file
			File file = new File("C:\\Users\\louis\\Desktop\\Diginamic\\recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			// affichage de la liste
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {
			// traitement des exceptions
			System.out.println(e.getMessage());
		}

	}

}
