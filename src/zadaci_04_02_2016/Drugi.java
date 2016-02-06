package zadaci_04_02_2016;



public class Drugi {
	public static boolean equals(int[][] m1, int[][] m2) {
		// checks if the arrays are identical
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				// if they are returns true
				if ((m1[i][j]) == (m2[i][j])) {
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];//unos brojeva u matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 10);

			}
		}
		System.out.println("Matrica 1 izgleda ovako: \n");
		// ispis matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");

			}
			System.out.println();
		}
		
		int[][] matrix1 = new int[3][3];//unos brojeva u matricu
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = (int) (Math.random() * 10);

			}
		}
		System.out.println("\nMatrica 2 izgleda ovako: \n");
		// ispis matrice
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				System.out.print(matrix1[row][column] + " ");

			}
			System.out.println();
		}
		
		if (equals(matrix, matrix1)){
			System.out.println("\nMatrice su identiène");
		}else{
			System.out.println("\nMatrice nisu identiène");
		}
	}

}
