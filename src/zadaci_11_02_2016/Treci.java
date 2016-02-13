package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Treci {
	// metoda za sumiranje liste
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		System.out.println("\nLista izgleda ovako: ");
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);// sumira clanove list
			System.out.print(list.get(i) + " ");
		}
		// ispis sume
		System.out.println("\n\nSuma liste je: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		double broj;
		ArrayList<Double> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pet cijelih brojeva u listu: ");
		try {
			// manuelni unos
			for (int i = 0; i < 5; i++) {
				broj = unos.nextDouble();
				list.add(broj);
			}
			sum(list);
		} catch (InputMismatchException e) {
			System.out.println("Greska...ponovi unos!!!");
			main(args);
		}
		unos.close();
	}

}