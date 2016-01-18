package zadaci_17_01_2016;

public class Cetvrti {
	public static int[ ] locateLargest(double[ ][ ] a){
		int []niz=new int [2];
		int max=0;
		int row1 = 0;
		int column1=0;
		int[][] matrix = new int[4][4];
		//upisivanje elemenata matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 50);

			}
		}

		// Ispisivanje matrice u konzoli
		System.out.println("Vaša matrica izgleda ovako: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
				if (matrix[row][column]>max){//pronalazak najveæeg elementa
					max=matrix[row][column];
					//Pozicija elementa u matrici
					row1=row;
					column1=column;
				}

			}
			System.out.println();
		}
		System.out.println("Najveci element matrice je: "+max+"["+row1+"]["+column1+"]");
		//return locateLargest(a);
		return  niz;
	}
	public static void main(String[] args) {
		double[][] a={};
		locateLargest(a);

	}

}
