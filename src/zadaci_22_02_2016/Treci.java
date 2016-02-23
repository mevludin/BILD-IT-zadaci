package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Treci {
	public static double sumaRazlomaka(int i) {
		// ako je 1 zaustavlja se
		if (i == 1) {
			return 1;
		} else {
			// uslov u zadatku
			return (double) 1 / i + sumaRazlomaka(i - 1);
		}

	}

	public static void main(String[] args) {
		// varijable
		int i;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj razlomaka koji se sabiraju: ");
		try {
			i = unos.nextInt();
			// ispis
			System.out.println("Suma  brojeva (1/i) je: " + sumaRazlomaka(i));
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!");
			main(args);
		}
		unos.close();

	}

}
