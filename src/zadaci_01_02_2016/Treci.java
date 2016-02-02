package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj;
		int brL;
		System.out.println("Unesite broj: ");
		try {
			broj = unos.nextInt();
			ArrayList<Integer> brojevi = new ArrayList<>();//za cifre binarnog broja
			//pretvaranje decimalnog broja u binarni
			while (broj != 0) {
				brL = broj % 2;
				brojevi.add(brL);
				broj = broj / 2;
			}
			System.out.println("Short: ");
			for (int i = 0; i < 16 - brojevi.size(); i++) {//ispis nula
				System.out.print(0);
			}
			for (int i = brojevi.size() - 1; i >= 0; i--) {//ispis binarnog broja
				System.out.print(brojevi.get(i));
			}
			System.out.println("\n\nAko želite novi unos birajte 0: ");
			broj = unos.nextInt();//unos br
			if (broj == 0) {
				main(args);
			}
		} catch (Exception e) {
			System.out.println("Greska, ponovi unos!!!");//ako je greska
			main(args);
		}
		unos.close();
	}

}
