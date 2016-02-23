package zadaci_22_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

//Fibonachi
public class Prvi {
	public static long fib(long n) {
		// nilti i prvi
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		// petlja za traženje broja na indeksu, izvrti sve èlanove niza do
		// traženog br
		for (int i = 1; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}

		return f1;
	}

	public static void main(String[] args) {
		// klasika
		Scanner unos = new Scanner(System.in);
		int index;
		try {
			System.out
					.println("Unesite indeks broja u Fibonachi nizu, koji zelite vidjeti: ");
			index = unos.nextInt();

			System.out.println("Broj na indeksu koji ste trazili je: "
					+ fib(index));
		} catch (InputMismatchException e) {
			System.out.println("Greska pri unosu...ponovi.");
			main(args);
		}
		unos.close();

	}

}
