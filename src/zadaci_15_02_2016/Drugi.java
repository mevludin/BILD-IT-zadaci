package zadaci_15_02_2016;

public class Drugi {

	public static void main(String[] args) {
		try {
			int [] i = new int [ Integer.MAX_VALUE];
			//ako je vrijednost prevelika izbacuje grecku
			System.out.println(i);
		} catch (OutOfMemoryError e) {
			System.err.println("Greska");
			System.exit(0);
		}

	}

}
