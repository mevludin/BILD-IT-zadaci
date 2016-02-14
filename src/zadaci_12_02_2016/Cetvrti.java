package zadaci_12_02_2016;

import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		int broj;
		int index;
		Scanner unos = new Scanner(System.in);
		int[] brojevi = new int[100];// niz
		for (int i = 0; i < 100; i++) {
			broj = (int) (Math.random() * 10);// generator brojeva
			brojevi[i] = broj;// upis brojeva u niz
		}
		System.out.println("Izaberite jedan broj iz niza od 100 brojeva: ");
		try {
			index = unos.nextInt();// unos indexa
			System.out.println("Izabrali ste broj: " + brojevi[index]);
			unos.close();
			// ako je index veci od br clanova niza izbacuje gresku Out of
			// boubds
		} catch (ArrayIndexOutOfBoundsException i) {
			System.out.println("Out of Bounds");
			main(args);
		}
	}

}
