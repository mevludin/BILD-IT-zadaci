package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		// Kreiranje liste
				ArrayList<Integer> niz = new ArrayList<>();
				// pohranjivanje max vrijednosti niza
				int max = 0;
				int j = 1;// osiguravanje ulaska u petlju
				Scanner input = new Scanner(System.in);// kreiranje Scannera
				System.out.println("Unesi brojeve: ");
				// unos elemenata niza, koji se prekida unosom nule
				while (j != 0) {
					j = input.nextInt();
					niz.add(j);

				}
				input.close();
				// pronalazak max elementa niza
				for (int i = 0; i < niz.size(); i++) {

					if (niz.get(i) > max) {
						max = niz.get(i);
					}

				}

				int brojac = 0;// broji ponavljanje max elementa
				// ispis niza
				System.out.println("Unijeli ste sljedeæi niz: ");
				for (int i = 0; i < niz.size(); i++) {
					System.out.print(niz.get(i) + ",");
					if (niz.get(i) == max) {
						brojac++;
					}

				}
				// ispis poruke max i broj ponavljanja maxa
				System.out.println("najveci je: " + max + "\ni ponavlja se " + brojac
						+ " puta");


	}

}
