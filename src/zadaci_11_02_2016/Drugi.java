package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Drugi {
	// metoda sortira listu
	public static void sort(ArrayList<Integer> list) {
		System.out.println("\nNe sortirana lista: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		Collections.sort(list);// sortiranje liste
		// ispis
		System.out.println("\nSortirana lista: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	public static void main(String[] args) {
		int broj;
		// unos br u list
		ArrayList<Integer> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pet cijelih brojeva u listu");
		try {
			for (int i = 0; i < 5; i++) {
				broj = unos.nextInt();
				list.add(broj);
			}
			sort(list);
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!!!");
			main(args);
		}
		unos.close();
	}

}
