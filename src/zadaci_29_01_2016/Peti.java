package zadaci_29_01_2016;

import java.util.Scanner;

public class Peti {
	public static void printMatrix(int n){
		int[][] matrix = new int[n][n];
//upisivanje nasumicnih elemenata u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);

			}
		}
		
		// Ispisivanje niza u konzoli
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();//prelaz u novi red
		}
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try{
		System.out.print("Unesite dimenzije matrice nxn: ");
		int n = unos.nextInt();
		// Ispisivanje niza u konzoli
		printMatrix(n);
	}catch(Exception e){
		System.out.println("Greska, unesite ponovo!");
		main(args);
	}
	unos.close();
	}

}
