package zadaci_21_01_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite password: ");
		String password = unos.nextLine();
		password.toLowerCase();

		String valja = "^(?=.{2,}\\d).{8,24}$";//preuzeto, zašto ne kad je jednostavno

		// provjera passworda
		if (password.matches(valja)) {
			System.out.println("Password prihvaæen");
		} else {
			System.out.println("Password nije prihvaæen: ");
			System.out
					.println("1. Password mora biti saèinjen od najmanje 8 karaktera. \n2. Password smije da se sastoji samo od slova i brojeva. \n3. Password mora sadržati najmanje 2 broja.");
		}
		unos.close();
	}

}
