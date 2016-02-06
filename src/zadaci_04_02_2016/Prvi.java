package zadaci_04_02_2016;

import java.util.Arrays;

public class Prvi {
	public static void sort(double m[][]) { 
		double[] niz = new double[m.length];//niz saèinjen od elemenata prve kolone
		double[] niz1 = new double[m.length];//niz saèinjen od elemenata druge kolone
		double[] niz2 = new double[m.length];//niz saèinjen od elemenata trece kolone
		for (int column = 0; column < m.length; column++) {
			niz[column] = m[0][column];//unos èlanova niza
			niz1[column] = m[1][column];
			niz2[column] = m[2][column];
		}
		//sortiranje nizova
		Arrays.sort(niz);
		Arrays.sort(niz1);
		Arrays.sort(niz2);
		//ispis sortirane matrice
		System.out.println("Sortirana matrica:");
		for (int column = 0; column < m.length; column++) {

			m[0][column] = niz[column];
			m[1][column] = niz1[column];
			m[2][column] = niz2[column];
		}

		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print(m[row][column] + " ");
			}
			System.out.println();
		}

		
		
		
	}
	public static void main(String[] args) {
		double[][] matrix = new double[3][3];//unos brojeva u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 10);

			}
		}
		System.out.println("Matrica izgleda ovako: \n");
		// ispis matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();
		}
		
		sort(matrix);
	}
	

}
