package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args)
			throws ReflectionException, IllegalArgumentException, IllegalAccessException {

		try {

			Pays pays = new Pays("France", 66_990_000, 41_463.6);
			ReflectionUtils.afficherAttributs(pays);

		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}

		try {

			Pays pays = new Pays("France", 66_990_000, 41_463.6);
			ReflectionUtils.afficherAttributs(null);

		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			System.out.println(e.getMessage());
		}

	}

}
