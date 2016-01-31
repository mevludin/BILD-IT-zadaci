package zadaci_30_01_2016;

import java.util.Scanner;

public class Peti {
	public static void ispisPiramide(int n) {
//preuzeta petlja ispisa piramide
		for (int i = 1; i <= n; i++) {

			for (int j = n; j > i; j--) {
				// Petlja printa prazna mjesta dok ne bude trebalo printati broj
				System.out.printf("%3s", " ");
			}

			for (int j = i; j > 1; j--) {
				// Petlja printa potrebne brojeve s lijeva
				System.out.printf("%3d", j);
			}

			for (int j = 1; j <= i; j++) {
				// Petlja printa potrebne brojeve od sredine ka desno
				System.out.printf("%3d", j);
			}

			// Kad zavrsi printanje ide novi red
			System.out.println();
		}

		
	}

	public static void main(String[] args) {
		int n;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj stepenica piramide: ");
		try {
			n = unos.nextInt();//unos max broja tj broja stepenica
			ispisPiramide(n);//poziv metode
		} catch (Exception e) {
			System.out.println("Greska, unesite broj ponovo!");
			main(args);
		}
		unos.close();
	}

}
