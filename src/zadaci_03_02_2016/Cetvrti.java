package zadaci_03_02_2016;

import java.util.Arrays;

public class Cetvrti {
	public static void sort(int m[][]) { 
		int[] niz = new int[m.length];//niz saèinjen od elemenata prve kolone
		int[] niz1 = new int[m.length];//niz saèinjen od elemenata druge kolone
		for (int row = 0; row < m.length; row++) {
			niz[row] = m[row][0];//unos èlanova niza
			niz1[row] = m[row][1];
		}
		//sortiranje nizova
		Arrays.sort(niz);
		Arrays.sort(niz1);
		//ispis sortirane matrice
		System.out.println("Sortirana matrica:");
		for (int row = 0; row < m.length; row++) {

			m[row][0] = niz[row];
			m[row][1] = niz1[row];
		}

		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print(m[row][column] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Matrica 6x2:");
		int[][] m = new int[6][2];
		// uèitavanje brojeva u matricu, umjesto ruèno korištena math random
		// metoda
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				m[row][column] = (int) (Math.random() * 10);
			}
		}//ispis matrice
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print(m[row][column] + " ");

			}
			System.out.println();
		}

		sort(m);//metoda

	}

}
