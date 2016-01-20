package zadaci_19_01_2016;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		// pitaj korisnika da unese vrijdnost mjeseène štednje:
		System.out.print("Unesite vrijednost mjeseène štednje: ");
		// dodijeli korisnikov unos varijabli
		double KM = unos.nextInt();
		// pitaj korisnika da unese period štednje:
		System.out.print("Unesite broj mjeseci: ");
		// dodijeli korisnikov unos varijabli
		int mjeseci = unos.nextInt();
		unos.close();
		double ukupno = KM;
//izracunavanje iznosa
		for (int i = 0; i < mjeseci; i++) {
			if (i == 0) {
				ukupno = ukupno * 1.00417;
			} else {
				ukupno = (100 + ukupno) * 1.00417;
			}
		}
		System.out.print("Iznos vaseg racuna ce biti: " + ukupno + " KM");
	}
}
