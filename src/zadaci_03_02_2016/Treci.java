package zadaci_03_02_2016;


public class Treci {
	public static void main(String[] args) {
		int sum=0;
		//upis u matricu
		int[][] matrix = new int[5][5];
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
		int[] nizC = new int[matrix.length];//niz ciji su clanovi sume kolona
		int[] nizR = new int[matrix.length];//niz ciji su clanovi sume redova

		System.out.println("Zbir clanova kolona:\n");
		for (int column = 0; column < matrix.length; column++) {
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][column];
			}
			System.out.println(column + ". =" + sum);
			nizC[column] = sum;//dodjeljivanje nizu
			sum = 0;
		}
		int max = 0;
		int poz = 0;//pozicija red ili kolona
		for (int i = 0; i < nizC.length; i++) {
//pronalazak maksimuma
			if (nizC[i] > max) {
				max = nizC[i];
				poz = i;//pozicija maksimuma
			}

		}
		System.out.println("Max vrijednost colone je: " + max
				+ " na pozicijama: \n");
		for (int i = 0; i < nizC.length; i++) {
			if (nizC[i] == max) {
				System.out.print(i + " ");
			}

		}
		max = 0;

		System.out.println("\nZbir clanova redova:\n");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				sum += matrix[row][column];
			}
			System.out.println(row + ". =" + sum);
			nizR[row] = sum;
			sum = 0;
		}
		for (int i = 0; i < nizR.length; i++) {
//pronalazak max
			if (nizR[i] > max) {
				max = nizR[i];
				poz = i;//pozicija max

			}

		}
		System.out
				.println("Max vrijednodt reda je: " + max + " na pozicijama:\n");
		for (int i = 0; i < nizR.length; i++) {

			if (nizR[i] == max) {
				System.out.print(i + " ");

			}

		}
	}

}
