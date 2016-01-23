package zadaci_22_01_2016;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		// pitaj korisnika da unese broj dana:
		System.out.print("Unesite broj od 0 do 6 za danasnji dan: ");
		// dodijeli korisnikov unos varijabli
		int danasnjiDan = unos.nextInt();

		if (danasnjiDan == 0) {
			System.out.print("Danas je ponedjeljak! ");
		} else if (danasnjiDan == 1) {
			System.out.print("Danas je utorak! ");
		} else if (danasnjiDan == 2) {
			System.out.print("Danas je srijeda! ");
		} else if (danasnjiDan == 3) {
			System.out.print("Danas je cetvrtak! ");
		} else if (danasnjiDan == 4) {
			System.out.print("Danas je petak! ");
		} else if (danasnjiDan == 5) {
			System.out.print("Danas je subota! ");
		} else if (danasnjiDan == 6) {
			System.out.print("Danas je nedjelja! ");
		}
		System.out.print("\nUnesite redni broj sljedeceg dana od danas: ");
		int danB = unos.nextInt();
		int trazeniDan;
		//Formula za racunanje trazenog dana
		trazeniDan = (danasnjiDan + danB) % 7;
		if (trazeniDan == 0) {
			System.out.print("To je ponedjeljak! ");
		} else if (trazeniDan == 1) {
			System.out.print("To je utorak! ");
		} else if (trazeniDan == 2) {
			System.out.print("To je srijeda! ");
		} else if (trazeniDan == 3) {
			System.out.print("To je èetvrtak! ");
		} else if (trazeniDan == 4) {
			System.out.print("To je petak! ");
		} else if (trazeniDan == 5) {
			System.out.print("To je subota! ");
		} else if (trazeniDan == 6) {
			System.out.print("To je nedjelja! ");
		}
unos.close();

	}

}
