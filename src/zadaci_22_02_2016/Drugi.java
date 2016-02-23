package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drugi {
	// funkcija sa rekurzijom;
	public static int gcd(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			// rekurzija
			return gcd(n, m % n);
		}

	}

	public static void main(String[] args) {
		// varijable
		int m;
		int n;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dva broja za koji tražite NZD: ");
		try {
			m = unos.nextInt();
			n = unos.nextInt();
			// ispis
			System.out.println("NZD brojeva " + m + " i " + n + " je: "
					+ gcd(m, n));
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!");
			main(args);
		}
		unos.close();

	}

}
