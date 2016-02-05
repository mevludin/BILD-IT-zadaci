package zadaci_03_02_2016;

import java.util.Scanner;

public class Drugi {
	
	public static double[][] addMatrix(double[][] matrix1, double[][] matrix2,
			double[][] matrix3) {
		System.out.println("Vaše matrice izgledaju ovako:");
		System.out.println("\nPrva matrica: ");
		// ispis prve matrice
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				System.out.print(matrix1[row][column] + " ");

			}
			System.out.println();
		}
		System.out.println("\nDruga matrica: ");
		// ispis druge matrice
		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				System.out.print(matrix2[row][column] + " ");

			}
			System.out.println();
		}

		System.out.println("\nMatrica proizvoda:");
		// ispis zbirne matrice
		for (int row = 0; row < matrix3.length; row++) {
			for (int column = 0; column < matrix3[row].length; column++) {
				System.out.print(matrix3[row][column] + " ");

			}
			System.out.println();
		}
		return matrix3;

	}

	public static void main(String[] args) {
		int n;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite dimenzije matrica:  ");
		try {
			n = unos.nextInt();// velièina kvadratne matrice
			double[][] matrix1 = new double[n][n];
			// uèitavanje brojeva u matricu, umjesto ruèno korištena math random
			// metoda
			for (int row = 0; row < matrix1.length; row++) {
				for (int column = 0; column < matrix1[row].length; column++) {
					matrix1[row][column] = (int) (Math.random() * 10);

				}
			}
			// uèitavanje brojeva u matricu, umjesto ruèno korištena math random
			// metoda
			double[][] matrix2 = new double[n][n];
			for (int row = 0; row < matrix2.length; row++) {
				for (int column = 0; column < matrix2[row].length; column++) {
					matrix2[row][column] = (int) (Math.random() * 10);

				}
			}
			// elementi matrice proizvoda
			double[][] matrix3 = new double[n][n];
			double sum=0;
			int i=0;
			for (int row = 0; row < matrix3.length; row++) {
				
				for (int column = 0; column < matrix3[row].length; column++) {
					while(i<n){
					sum += ((matrix1[row][i]) * (matrix2[i][column]));
					i++;
					}
					matrix3[row][column]=sum;
					sum=0;
					i=0;
				}
				}
		
				
			
			addMatrix(matrix1, matrix2, matrix3);// poziv funkcije
		} catch (Exception e) {
			System.out.println("Greska, ponovi unos:");
			main(args);
		}
		unos.close();
	}

}
