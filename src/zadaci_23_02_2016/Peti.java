package zadaci_23_02_2016;

import java.util.Scanner;

public class Peti {
	public static int i = 0;
	public static int j = 0;

	public static void array(int[] brojevi) {
//j su indeksi niza
		while (j < brojevi.length) {
			//ako je broj na indeksu veæi od i postavi da je i max
			if (brojevi[j] > i) {
				i = brojevi[j];
			}
			j++;//poveæava indeks
			array(brojevi);
		}
	}

	public static void main(String[] args) {
		//unos elemenata niza od strane korisnika
		int[] niz = new int[8];
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite èlanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}
		array(niz);
		System.out.println("Najveci u nizu je: " + i);
		unos.close();

	}

}
