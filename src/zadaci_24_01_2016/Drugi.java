package zadaci_24_01_2016;

import java.util.ArrayList;

public class Drugi {
	public static void prosti() {
		int brojac = 0;
		ArrayList<Integer> brojevi = new ArrayList<>();//kreiranje array liste u koju se upisuju prosti brojevi
		System.out.println("Twin prime brojevi su: ");

		// pronalazak prostih brojeva
		for (int i = 0; i <= 10000; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {

				brojevi.add(i);

			} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

			} else {

				brojevi.add(i);

			}
		}
		
		//pronalazak i ispist twin prime brojeva
		for (int i = 1; i <= brojevi.size(); i++) {

			try {
				if ((brojevi.get(i) - brojevi.get(i - 1)) == 2) {
					System.out.print(brojevi.get(i - 1) + " i "
							+ brojevi.get(i) + ",");
					brojac++;
				}
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}
			} catch (Exception e) {
				System.out.println("\nGreska");
			}

		}
	}

	public static void main(String[] args) {

		prosti();

	}

}
