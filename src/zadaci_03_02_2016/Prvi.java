package zadaci_03_02_2016;

import java.util.Scanner;

public class Prvi {
	public static double sumRows(double[][] matrix) {
		double sum = 0;
		System.out.println("Vaša matrica izgleda ovako:");
		// ispis matrice
		for (int row = 0; row < matrix.length; row++) {
			System.out.println("Radnik "+row+".  ");
			for (int column = 0; column < matrix[row].length; column++) {
				
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();
		}

		int row = 0; 
		while(row < matrix.length){
			for (int column = 0; column < matrix[row].length; column++) {
			sum += matrix[row][column];// raèunanje sume  reda

		}
			System.out.println("Radnik "+row+". ima ukupno sati: "+sum);
			row++;
			sum=0;
		}
		
		return sum;
		
	}

	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// formiranje matrice i uèitavanje brojeva, nasumièno unju
		double[][] matrix = new double[8][7];
		//System.out.println("Unesite radne sate radnika:");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 10);

			}
		}
		
		sumRows(matrix);
		
		unos.close();
	}

	

}
