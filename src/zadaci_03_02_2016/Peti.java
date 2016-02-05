package zadaci_03_02_2016;

public class Peti {

	public static void main(String[] args) {
		int sum = 0;
		int[][] matrix = new int[6][6];//unos brojeva u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);

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

		System.out.println("\nZbir clanova kolona:\n");
		for (int column = 0; column < matrix.length; column++) {
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][column];//broji jedinice u koloni
			}
			System.out.println(column + ". =" + sum + "");//ispisuje koliko ima
			if (sum % 2 == 0) {
				System.out.println("     Paran broj jedinica!!!");
			} else {
				System.out.println("     Neparan broj jedinica!!!");
			}
			sum = 0;
		}

		System.out.println("\n\nZbir clanova redova:\n");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				sum += matrix[row][column];//broji jedinice u redu
			}
			System.out.println(row + ". =" + sum);//ispisuje koliko ima
			if (sum % 2 == 0) {
				System.out.println("     Paran broj jedinica!!!");
			} else {
				System.out.println("     Neparan broj jedinica!!!");
			}
			sum = 0;
		}

	}
}
