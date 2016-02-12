package mini_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vjesalo {
	
	//metoda vjesalo - preuzeta
	public static void ispisVjesala(int brojacGr) {
		if (brojacGr == 0) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
		}
		if (brojacGr == 1) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");

		}
		if (brojacGr == 2) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println("    |       |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");

		}
		if (brojacGr == 3) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println("    |___    |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");

		}
		if (brojacGr == 4) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println(" ___|___    |");
			System.out.println("            |");
			System.out.println("            |");
			System.out.println("            |");

		}
		if (brojacGr == 5) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println(" ___|___    |");
			System.out.println("    |       |");
			System.out.println("    |       |");
			System.out.println("            |");

		}
		if (brojacGr == 6) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println(" ___|___    |");
			System.out.println("    |       |");
			System.out.println("    |       |");
			System.out.println("   (-)      |");
			System.out.println("     |      |");

		}
		if (brojacGr == 7) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println(" ___|___    |");
			System.out.println("    |       |");
			System.out.println("    |       |");
			System.out.println("   (-)      |");
			System.out.println("     |      |");
			System.out.println("     |      |");
			System.out.println("     O      |");

		}
		if (brojacGr == 8) {
			System.out.println(" --------------");
			System.out.println("    |       |");
			System.out.println("   ( )      |");
			System.out.println(" ___|___    |");
			System.out.println("    |       |");
			System.out.println("    |       |");
			System.out.println("   (-)      |");
			System.out.println("   | |      |");
			System.out.println("   | |      |");
			System.out.println("   O O      |");
			System.out.println("OBJEŠEN SI :) ");

		}
	}

	public static void main(String[] args) {
		char[] slova;//niz karaktera
		int brojac = 0;//brijac pogoðenih karaktera
		int i;//izbor rijeci
		int brojacGr = 0;//brojac gresaka
		String rijec;//odabrana rijec iz niza stringova
		boolean tacno = false;
		//niz stringova / rijeci
		String[] rijeci = { "ucenik", "kuca", "auto", "kamion", "java",
				"bumerang", "kurs", "sreæa", "virus", "gripa" };
		Scanner unos = new Scanner(System.in);
		//izbor predefinisanih rijeci, moglo se i random al' eto
		System.out.println("Izaberite rijec unosom broja od 0 do 9: ");
		try{
		i = unos.nextInt();
		rijec = rijeci[i];//izabrana rijec
		//ispisuje crtice koliko ima slova u rijeci
		for (int j = 0; j < rijec.length(); j++) {
			System.out.print("_ ");
		}
		//while rti do 89 gresaka ili do ispisa rijeci
		while (brojacGr < 9 || brojac == rijec.length()) {
			System.out.println("\nUnesite slovo: ");
			//unos slova
			char slovo = (char) unos.next().charAt(0);
			//definišemo broj èlanova niza
			slova = new char[rijec.length()];
			for (int j = 0; j < rijec.length(); j++) {
				//provjerava da li unijeto slovo odgovara nekom u rijeci
				if (slovo == rijec.charAt(j)) {
					slova[j] = slovo;//slovo dodjeljuje nizu
					System.out.println(slova[j]);
					brojac++;//broji tacne
					tacno = true;
				} else {
					System.out.print("_ ");
				}
			}
			//ako je tacnih jednako kao broj slova rijeci
			if (brojac == rijec.length()) {
				System.out.println("POBJEDA!!!");
				break;
			}
			//ispis vjesala
			if (!tacno) {
				brojacGr++;
				System.out.println();
				ispisVjesala(brojacGr);
				tacno = false;
			} else {
				System.out.println();
				ispisVjesala(brojacGr);
				tacno = false;
			}
			if (brojacGr == 8) {
				System.out.println("Izgubili ste!!!");
				break;
			}
		}
		}catch(InputMismatchException e){//ako je greska unosa ponovi
			System.out.println("Greka...ponovi unos!!!");
			main(args);
			
		}
		unos.close();
	}

}
