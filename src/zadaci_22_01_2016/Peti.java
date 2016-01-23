package zadaci_22_01_2016;

public class Peti {
		public static void convertMillis(int millis) {
			// racunanje sekundi, minuta, sati
			int sekunde = (millis / 1000) % 60;
			int minute = (millis / (1000 * 60) % 60);
			int sati = (millis / (1000 * 60 * 60) % 60);
			System.out.print(sati + ":" + minute + ":" + sekunde);

		}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite mlisekunde: ");
		int number = input.nextInt();//unos
		input.close();
		convertMillis(number);//poziv metode


	}

}
