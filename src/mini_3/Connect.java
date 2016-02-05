package mini_3;

import java.util.Scanner;

public class Connect {
	public static void ispis(char[][] matrix) {// ispis matrice
		System.out.println();
		for (int row = 0; row < 6; row++) {
			System.out.print("|");
			for (int column = 0; column < 7; column++) {
				System.out.print(matrix[row][column] + "|");
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println("|0|1|2|3|4|5|6|");// broj kolona radi lakseg citanja
	}

	public static boolean pobjeda(char[][] matrix) {// uslovi pobjede

		// Provjera za redove
		for (int i = 5; i >= 0; i--) {
			int brojac = 1;
			for (int j = 0; j < 6; j++) {
				if (matrix[i][j] != ' ' && matrix[i][j] == matrix[i][(j + 1)])
					brojac++;
				else
					brojac = 1;
				if (brojac == 4)
					return true;
			}
		}

		// Provjera za kolone
		for (int j = 0; j < 7; j++) {
			int brojac = 1;
			for (int i = 6; i >= 1; i--) {
				if (matrix[i][j] != ' ' && matrix[i][j] == matrix[(i - 1)][j])
					brojac++;
				else
					brojac = 1;
				if (brojac == 4)
					return true;
			}
		}

		// Provjera za dijaonale /
		for (int i = 5; i >= 3; i--) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i][j] != ' '
						&& matrix[i][j] == matrix[(i - 1)][(j + 1)]
						&& matrix[i][j] == matrix[(i - 2)][(j + 2)]
						&& matrix[i][j] == matrix[(i - 3)][(j + 3)])
					return true;
			}
		}

		// Provjera za dijagonale \
		for (int i = 5; i >= 3; i--) {
			for (int j = 3; j < 7; j++) {
				if (matrix[i][j] != ' '
						&& matrix[i][j] == matrix[(i - 1)][(j - 1)]
						&& matrix[i][j] == matrix[(i - 2)][(j - 2)]
						&& matrix[i][j] == matrix[(i - 3)][(j - 3)])
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		char slovo1 = 'R';
		char slovo2 = 'Y';
		char[][] matrix = new char[6][7];
		int row;
		int column;
		int brojac;
		try {

			ispis(matrix);// poziva ispis

			brojac = 0;
			row = 5;
			while (row >= 0) { // vrti dok ima redova
				if (brojac > 6) {
					row--;
					brojac = 0;
				}
				System.out.println("Igraè R:");
				System.out.println("Izaberite kolonu 0-6 :");
				System.out.println("Brojac" + brojac);
				System.out.println("Row" + row);
				column = unos.nextInt();
				// provjerava da li je mjesto popunjeno
				if ((matrix[row][column] == 'R')
						|| (matrix[row][column] == 'Y')) {
					System.out.println("Mjesto popunjeno!!!");
					// ako nije upisuje u matricu
				} else {
					matrix[row][column] = slovo1;
					brojac++;
				}

				ispis(matrix);// ponovo ispis

				if (pobjeda(matrix)) {
					System.out.println("Vasa pobjeda!!!");
				}

				System.out.println("Igraè Y:");
				System.out.println("Izaberite kolonu 0-6:");
				System.out.println("Brojac" + brojac);
				System.out.println("Row" + row);

				column = unos.nextInt();
				// provjera popunjenosti
				if ((matrix[row][column] == 'R')
						|| (matrix[row][column] == 'Y')) {
					System.out.println("Mjesto popunjeno!!!");
				} else {
					matrix[row][column] = slovo2;
					brojac++;
				}

				ispis(matrix);
				if (pobjeda(matrix)) {
					System.out.println("Vasa pobjeda!!!");
				}

			}

			// ako je greska

		} catch (Exception e) {
			System.out.println("Greska, pokusajte ponovo: ");
			main(args);
		}
		unos.close();
	}

}
