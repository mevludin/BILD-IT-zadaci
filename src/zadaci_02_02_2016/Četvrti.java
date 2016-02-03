package zadaci_02_02_2016;

import java.util.Scanner;

public class �etvrti {
	public static double sumColumn(double[][] matrix, int columnIndex) {
		double sum = 0;
		System.out.println("Va�a matrica izgleda ovako:");
		// ispis matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();
		}

		for (int row = 0; row < matrix.length; row++) {
			int column = columnIndex;
			sum += matrix[row][column];// ra�unanje sume odabrane kolone

		}

		return sum;

	}

	public static void main(String[] args) {
		int brColone;
		Scanner unos = new Scanner(System.in);
		// formiranje matrice i u�itavanje brojeva, nasumi�no unju
		double[][] matrix = new double[5][5];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 10);

			}
		}
		try {
			System.out.println("Unesite broj kolone, brojevi izmedju 0 i "
					+ (matrix.length - 1));
			brColone = unos.nextInt();
			// ispis poruke
			System.out.println("Suma �lanova " + brColone + ". kolone je "
					+ sumColumn(matrix, brColone));
		} catch (Exception e) {
			System.out.println("Gre�ka, ponovi unos:");
			main(args);
		}
		unos.close();
	}

}
