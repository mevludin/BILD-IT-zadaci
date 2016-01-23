package zadaci_21_01_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite password: ");
		String password = unos.nextLine();
		password.toLowerCase();

		String valja = "^(?=.{2,}\\d).{8,24}$";//preuzeto, za�to ne kad je jednostavno

		// provjera passworda
		if (password.matches(valja)) {
			System.out.println("Password prihva�en");
		} else {
			System.out.println("Password nije prihva�en: ");
			System.out
					.println("1. Password mora biti sa�injen od najmanje 8 karaktera. \n2. Password smije da se sastoji samo od slova i brojeva. \n3. Password mora sadr�ati najmanje 2 broja.");
		}
		unos.close();
	}

}
