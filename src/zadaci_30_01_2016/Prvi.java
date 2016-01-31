package zadaci_30_01_2016;

import java.util.Scanner;

public class Prvi {
	public static boolean isPalindrom(int n) {
		int prva = 0;
		int zadnja = 0;

		prva = n / 100;// prva cifra
		zadnja = n % 10;// zadnja cifra
		if (prva == zadnja) {// ako su prva i zadnja iste to je palindrom
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int broj;
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite trocifren cijeli broj: ");
		try {
			broj = unos.nextInt();// unos broja
			isPalindrom(broj);

			// ispis poruka
			if (isPalindrom(broj) == true) {
				System.out.println("Broj " + broj + " je palindrom.");
			} else {
				System.out.println("Broj " + broj + " nije palindrom.");
			}
		} catch (Exception e) {
			System.out.println("Greska, ponovo unesite broj: ");
			main(args);
		}
		unos.close();
	}

}
