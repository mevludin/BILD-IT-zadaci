package zadaca_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Treci {

	public static Integer listSize(ArrayList<Integer> list) {
		// ako je lista prazna, vraca null
		if (list.isEmpty()) {
			return null;
		} else {
			// koristicemo kolekciju, koja vraca max element u listi
			int max = Collections.max(list);
			return max;
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// lista
		ArrayList<Integer> br = new ArrayList<>();

		try {
			System.out.println("Unesite brojeve, prekidate sa 0 : ");
			int num = unos.nextInt();
			// while p-unosi dok du br razliciti od 0
			while (num != 0) {
				br.add(num);
				num = unos.nextInt();
			}
			// prints max value
			System.out.println("Max value: " + listSize(br));
			unos.close();
		} catch (Exception e) {
			System.out.println("Greska...ponovi unos");
			main(args);
		}
	}

}
