package zadaca_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Peti {

	public static void shuffle(ArrayList<Integer> list) {
		// unutar kolekcija imamo shuffle
		Collections.shuffle(list);
		// ispis
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).intValue() + " ");
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// lista
		ArrayList<Integer> numbers = new ArrayList<>();

		try {
			System.out.println("Unesite brojeve, prekid nulom");
			int num = unos.nextInt();
			// ako unesemo nulu petlja se zaustavlja
			while (num != 0) {
				numbers.add(num);
				num = unos.nextInt();
			}
			// ispis
			for (int i = 0; i < numbers.size(); i++) {
				System.out.print(numbers.get(i).intValue() + " ");
			}

			shuffle(numbers);

		} catch (Exception e) {
			main(args);
		}
		unos.close();
	}

}
