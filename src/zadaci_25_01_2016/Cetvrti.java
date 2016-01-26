package zadaci_25_01_2016;

public class Cetvrti {
	public static void convertMinutes(int min) {
		// racunanje sekundi, minuta, sati
		int dani = (min / 60) / 24;
		int godine = (dani / 365);
		int daniOst = dani % 365;
		System.out.print("Godine i dani: " + godine + ":" + daniOst);

	}

	public static void main(String[] args) {// main metoda
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite minute: ");
		int number = input.nextInt();
		input.close();
		convertMinutes(number);

	}

}
