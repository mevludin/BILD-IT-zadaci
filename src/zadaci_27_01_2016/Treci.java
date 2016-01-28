package zadaci_27_01_2016;

import java.util.ArrayList;

public class Treci {

	public static void main(String[] args) {
		ArrayList<Integer> brojevi = new ArrayList<>();//upisujemo proste br u ar listu
		int brojac = 0;
		//prosti br
		for (int i = 1; i <= 10000; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				brojevi.add(i);

			} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

			} else {
				brojevi.add(i);

			}
		}
		//emirp nije bas zgodno ali funkcioniše do bolje formulacije
		for (int i = 0; i < brojevi.size() - 1; i++) {
			for (int j = 1; j < brojevi.size(); j++) {
				if ((((brojevi.get(i) % 10) == (brojevi.get(j) / 10)) && ((brojevi
						.get(i) / 10) == (brojevi.get(j) % 10)))
						|| (((brojevi.get(i) % 10) == (brojevi.get(j) / 100))
								&& ((brojevi.get(i) / 100) == (brojevi.get(j) % 10)) && (((brojevi
								.get(i) / 10) % 10) == ((brojevi.get(j) / 10) % 10)))
						|| (((brojevi.get(i) % 10) == (brojevi.get(j) / 1000))
								&& ((brojevi.get(i) / 1000) == (brojevi.get(j) % 10))
								&& (((brojevi.get(i) / 10) % 10) == ((brojevi
										.get(j) / 100) % 10)) && ((brojevi
								.get(i) / 100) % 10) == ((brojevi.get(j) / 10) % 10))) {

					{
						//ispis parova
						System.out.println(brojevi.get(j) + ","
								+ brojevi.get(i));
						brojac++;
					}
				}
			}
			//prekida kad ispise 100 br
			if (brojac == 100) {
				break;
			}

		}
		System.out.println("Ukupno: " + brojac);
	}
}
