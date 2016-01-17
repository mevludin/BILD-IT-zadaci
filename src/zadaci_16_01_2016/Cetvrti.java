package zadaci_16_01_2016;

public class Cetvrti {
	public static void printMatrix(int n) {
//kreiranje matrice-2d niza
		int[][] matrix = new int[n][n];
		//upisivanje elemenata matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);

			}
		}

		// Ispisivanje niza u konzoli
		System.out.println("Vaša matrica izgleda ovako: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite dimenziju kvadratne matrice:");
		//unos dimenzije matrice
		int n = input.nextInt();
		input.close();

		printMatrix(n);
	}

}
