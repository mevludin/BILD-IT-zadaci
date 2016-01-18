package zadaci_17_01_2016;

import java.util.Scanner;

public class Peti {
	public static double[][] sortRows(double[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array.length; column++) {
//sortiranje reda
				java.util.Arrays.sort(array[column]);
				System.out.print(array[row][column] + " ");
			}
			System.out.println();
		}
		
		return array;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dimenzije matrice/2Dniza:");

		int n = unos.nextInt();
		unos.close();
		double[][] array = new double[n][n];
		// upisivanje elemenata matrice
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = (int) (Math.random() * 10);

			}

		}

		sortRows(array);
	}

}
