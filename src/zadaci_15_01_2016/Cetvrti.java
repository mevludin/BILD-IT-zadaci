package zadaci_15_01_2016;

public class Cetvrti {
	public static void main(String[] args) {
		// definisanje varijabli
		int nula = 0;
		int jedan = 0;
		int dva = 0;
		int tri = 0;
		int cetiri = 0;
		int pet = 0;
		int sest = 0;
		int sedam = 0;
		int osam = 0;
		int devet = 0;
		System.out.println("Nasumicni brojevi: ");
		// generisanje nasumicnih brojeva
		for (int i = 0; i < 100; i++) {

			int nasumicniBroj = (int) (Math.random() * 10);
			// provjera i brojanje
			if (nasumicniBroj == 1) {
				jedan++;
			} else if (nasumicniBroj == 2) {
				dva++;
			} else if (nasumicniBroj == 3) {
				tri++;
			} else if (nasumicniBroj == 4) {
				cetiri++;
			} else if (nasumicniBroj == 5) {
				pet++;
			} else if (nasumicniBroj == 6) {
				sest++;
			} else if (nasumicniBroj == 7) {
				sedam++;
			} else if (nasumicniBroj == 8) {
				osam++;
			} else if (nasumicniBroj == 9) {
				devet++;
			} else if (nasumicniBroj == 0) {
				nula++;
			}
			// ispis poruke
			System.out.print(nasumicniBroj + ",");
		}
		System.out.println();
		System.out.println("Brojevi se ponavljaju na sljedeci nacin: \n");
		System.out.println("0 " + nula + " puta");
		System.out.println("1 " + jedan + " puta");
		System.out.println("2 " + dva + " puta");
		System.out.println("3 " + tri + " puta");
		System.out.println("4 " + cetiri + " puta");
		System.out.println("5 " + pet + " puta");
		System.out.println("6 " + sest + " puta");
		System.out.println("7 " + sedam + " puta");
		System.out.println("8 " + osam + " puta");
		System.out.println("9 " + devet + " puta");

	}

}
