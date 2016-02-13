package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		ArrayList<Integer> sumRed = new ArrayList<>();// upisujemo listi
														// sumirnih vrijednosti
														// redova
		ArrayList<Integer> sumKolona = new ArrayList<>();// upisujemo listi
															// sumirnih
															// vrijednosti
															// kolona
		int n;
		System.out.println("Unesite velicinu marice: ");
		try {
			n = unos.nextInt();
			int[][] matrix = new int[n][n];
			int sum = 0;
			// generisu se vrijednosti u matrici
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					matrix[row][column] = (int) (Math.random() * 2);
					sum += matrix[row][column];// sabira redove
				}
				sumRed.add(sum);// pohranjuje se suma u niz
				sum = 0;// nulira sumu
			}
			// ispis matrice
			System.out.println("Izgled matrice:");
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					System.out.print(matrix[row][column]);
				}
				System.out.println();
			}
			// na kojem indexu se nalazi najveci red
			System.out.println("\nNajveci red je na indeksu: "
					+ sumRed.indexOf(Collections.max(sumRed)) + ".");
			sum = 0;
			for (int column = 0; column < matrix.length; column++) {
				for (int row = 0; row < matrix.length; row++) {
					sum += matrix[row][column];
				}
				sumKolona.add(sum);
				// ponistavanje sume
				sum = 0;

			}
			// na kojem indexu se nalazi najveci red
			System.out.println("\nNajveca kolona je na indeksu: "
					+ sumKolona.indexOf(Collections.max(sumKolona)) + ".");
		} catch (InputMismatchException e) {
			System.out.println("Greska...unesite ponovo!!!");
			main(args);
		}
		unos.close();
	}

}
