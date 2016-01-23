package zadaci_21_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		System.out.println("Unesite taèan zbir sljedeæih brojeva: ");
		Scanner unos = new Scanner(System.in);
		int[] broj = new int[3];//koristio niz tri broja radi jednostavnosti
		int zbir = 0;
		int rezultat = 1;
		try {
			while (rezultat != zbir) {
				for (int i = 0; i < broj.length; i++) {
					broj[i] = (int) (Math.random() * 10);//generira nasumicne brojevi
					zbir += broj[i];
					
				}
				System.out.print(broj[0]+"+"+broj[1]+"+"+broj[2]+"=");//ispis
				rezultat = unos.nextInt();

				if (rezultat != zbir) {
					System.out.println("Pogresno, pokusajte ponovo!");//vraæa ako je rezultat pogresan
					zbir = 0;
				}

			}
			System.out.println("Bravo, taèan odgovor!");//ako je tacno prekida upitnik

		} catch (InputMismatchException ex) {
			System.out.println("greska");

		}
		unos.close();
		return;

	}

}
