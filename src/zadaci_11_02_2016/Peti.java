package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Peti {
	// metoda za dodavanje liste na listu
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// prva lista
		System.out.println("\nUnesena lista 1: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i));
		}
		// druga lista
		System.out.println("\n\nUnesena lista 2: ");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i));
		}
		// dodavanje
		for (int i = 0; i < list2.size(); i++) {

			list1.add(list2.get(i));

		}
		// nova lista
		System.out.println("\n\nNova lista: ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i));
		}
		return list1;
	}

	public static void main(String[] args) {
		int broj;
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pet cijelih brojeva u listu 1:");
		try {
			// unos prve
			for (int i = 0; i < 5; i++) {
				broj = unos.nextInt();
				list1.add(broj);
			}
			System.out.println("\nUnesite pet cijelih brojeva u listu 2:");
			// unos druge
			for (int i = 0; i < 5; i++) {
				broj = unos.nextInt();
				list2.add(broj);
			}
			union(list1, list2);
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!!!");
			main(args);
		}
		unos.close();

	}

}
