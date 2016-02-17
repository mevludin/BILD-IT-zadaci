package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Treci {

	public static void main(String[] args) throws FileNotFoundException {
		int brojac = 0;

		// èita file
		File file = new File("src/zadaci_15_02_2016/fascikla");
		Scanner unos = new Scanner(file);
		while (unos.hasNext()) {
			// pomoæni string
			String s = unos.next();
			brojac++;// broji rijeci
		}
		unos.close();
		// ispis
		System.out.println("U tekstu ima " + brojac + " rijeci.");

	}

}
