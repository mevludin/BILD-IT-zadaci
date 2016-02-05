package mini_3;

import java.util.Scanner;

public class Tic_tac_toe {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		String slovo1 = new String();
		String slovo2 = new String();
		String[][] matrix = new String[3][3];
		int row;
		int column;
		int brojac = 0;
		try {
			while (brojac < 9) { // vrti dok ima mjesta
				System.out.println("Igraè X:");
				System.out
						.println("Unesite koordinate (red)(kolona) - 0 ili 1 ili 2:");
				row = unos.nextInt();// koordinata reda
				column = unos.nextInt();// koordinata kolone
				slovo1 = "X";
				if (matrix[row][column] == null) {
					matrix[row][column] = slovo1;// unos u matricu
					brojac++;
				} else {
					System.out.println("Mjesto popunjeno!!!");
				}
				System.out.println("-------");
				for (row = 0; row < matrix.length; row++) {
					System.out.print("|");
					for (column = 0; column < matrix[row].length; column++) {
						System.out.print(matrix[row][column] + "|");

					}
					System.out.println();
					System.out.println("-------");
				}
				// uslovi pobjede
				if (((matrix[0][0]) != null && (matrix[0][0]) == (matrix[0][1]) && (matrix[0][0]) == (matrix[0][2]))
						|| ((matrix[1][0]) != null
								&& (matrix[1][0]) == (matrix[1][1]) && (matrix[1][0]) == (matrix[1][2]))
						|| ((matrix[2][0]) != null
								&& (matrix[2][0]) == (matrix[2][1]) && (matrix[2][0]) == (matrix[2][2]))
						|| ((matrix[0][0]) != null
								&& (matrix[0][0]) == (matrix[1][0]) && (matrix[0][0]) == (matrix[2][0]))
						|| ((matrix[0][1]) != null
								&& (matrix[0][1]) == (matrix[1][1]) && (matrix[0][1]) == (matrix[2][1]))
						|| ((matrix[0][2]) != null
								&& (matrix[0][2]) == (matrix[1][2]) && (matrix[0][2]) == (matrix[2][2]))
						|| ((matrix[0][0]) != null
								&& (matrix[0][0]) == (matrix[1][1]) && (matrix[0][0]) == (matrix[2][2]))
						|| ((matrix[2][0]) != null
								&& (matrix[2][0]) == (matrix[1][1]) && (matrix[2][0]) == (matrix[0][2]))) {
					System.out.println("Vi ste pobjednik!!!");
					break;
				}
				// sve isto i za igraèa O
				System.out.println("Igraè O:");
				System.out
						.println("Unesite koordinate (red)(kolona) - 0 ili 1 ili 2:");
				row = unos.nextInt();
				column = unos.nextInt();
				slovo2 = "O";
				if (matrix[row][column] == null) {
					matrix[row][column] = slovo2;
					brojac++;
				} else {
					System.out.println("Mjesto popunjeno!!!");
				}
				System.out.println("-------");
				for (row = 0; row < matrix.length; row++) {
					System.out.print("|");
					for (column = 0; column < matrix[row].length; column++) {
						System.out.print(matrix[row][column] + "|");

					}
					System.out.println();
					System.out.println("-------");
				}

				if (((matrix[0][0]) != null && (matrix[0][0]) == (matrix[0][1]) && (matrix[0][0]) == (matrix[0][2]))
						|| ((matrix[1][0]) != null
								&& (matrix[1][0]) == (matrix[1][1]) && (matrix[1][0]) == (matrix[1][2]))
						|| ((matrix[2][0]) != null
								&& (matrix[2][0]) == (matrix[2][1]) && (matrix[2][0]) == (matrix[2][2]))
						|| ((matrix[0][0]) != null
								&& (matrix[0][0]) == (matrix[1][0]) && (matrix[0][0]) == (matrix[2][0]))
						|| ((matrix[0][1]) != null
								&& (matrix[0][1]) == (matrix[1][1]) && (matrix[0][1]) == (matrix[2][1]))
						|| ((matrix[0][2]) != null
								&& (matrix[0][2]) == (matrix[1][2]) && (matrix[0][2]) == (matrix[2][2]))
						|| ((matrix[0][0]) != null
								&& (matrix[0][0]) == (matrix[1][1]) && (matrix[0][0]) == (matrix[2][2]))
						|| ((matrix[2][0]) != null
								&& (matrix[2][0]) == (matrix[1][1]) && (matrix[2][0]) == (matrix[0][2]))) {
					System.out.println("Vi ste pobjednik!!!"
							+ matrix[row][column]);
					break;
				}
			}

			// ako ima grešaka

		} catch (Exception e) {
			System.out.println("Greska, pokusajte ponovo: ");
			main(args);
		}
		unos.close();
	}
}
