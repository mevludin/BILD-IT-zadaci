package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cetvrti {
	public static double sumaR(int i) {
		// ako je 0 zaustavlja se
		if (i == 0) {
			return 0;
		} else {
			// uslov u zadatku
			return (double) i / (2 * i + 1) + sumaR(i - 1);
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
			System.out.println("Suma  brojeva (1/i) je: " + sumaR(i));
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!");
			main(args);
		}
		unos.close();

	}

}
