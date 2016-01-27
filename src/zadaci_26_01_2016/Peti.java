package zadaci_26_01_2016;

public class Peti {

	public static void main(String[] args) {
		int[] niz = new int[100];//niz u koji upisujemo brojeve
		//Unos nasumiènih brojeva u niz
		for (int i = 0; i < niz.length; i++) {
			int br = (int) (Math.random() * 100);
			niz[i] = br;
		}
		java.util.Arrays.sort(niz);//sortiranje niza radi lakse provjere ispravnosti rada prog
		int brojac = 1;//broji ponavljanja
		int pon = 0;//broji brojeve u redu
		System.out.println("Niz brojeva..");
		//ispis sortiranog niza

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
			pon++;
			if (pon == 10) {
				System.out.println();
				pon = 0;
			}
		}
		System.out.println("\n");
		//koliko se koji broj pojavljuje u nizu
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] == niz[i - 1]) {
				brojac++;
			} else {
				System.out.println(niz[i - 1] + " se pojavljuje: " + brojac
						+ " puta.");
				brojac = 1;
			}
			
		}

	}

}
