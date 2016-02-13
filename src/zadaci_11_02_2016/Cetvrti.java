package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cetvrti {
	// metoda za eliminaciju duplih èlanova liste
	public static void removeDuplicate(ArrayList<Integer> list) {
		// prvobitna, izvorna
		System.out.println("\nUnesena lista: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		int a = 0;
		Collections.sort(list);
		// provjerava ima li duplikata
		for (int i = 0; i < list.size() - 1; i++) {

			if ((list.get(a) == list.get(a + 1))) {
				list.remove(i);
			}
			a++;

		}
		// ispis eliminisanih
		System.out.println("\nEliminisani duplikati: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

	}

	public static void main(String[] args) {
		int broj;
		ArrayList<Integer> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite deset cijelih brojeva u listu:");
		try {
			for (int i = 0; i < 10; i++) {
				broj = unos.nextInt();// unos manuelni
				list.add(broj);
			}
			removeDuplicate(list);
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!!!");
			main(args);
		}
		unos.close();

	}

}
