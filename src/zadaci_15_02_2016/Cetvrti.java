package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) throws IOException {
		int brojac = 0;
		int znakovi = 0;
		int rijeci = 0;
		//pozicija fajla
		File file = new File("src/zadaci_15_02_2016/fascikla");
		Scanner citac = new Scanner(file);// scanner za citanje filea
		while (citac.hasNext()) {// vrti dok ima slova
			String chars = citac.next();
			brojac = chars.length();
			if (brojac > 0) {// ako je brojac veci od nula
				// brioji karaktere
				znakovi += brojac;
				// broji rijeèi
				rijeci++;
			}
		}
		// stavlja br linije u tekstu fajla
		LineNumberReader lines = new LineNumberReader(new FileReader(file));
		String line = "";
		try {
			// vrti dok ima linija
			while ((line = lines.readLine()) != null) {
				// ispisuje tekst sa naznacenim linijama
				System.out.println("Line " + lines.getLineNumber() + ": "
						+ line);
			}
			// ispisuje tražene podatke br rijeci, br znakova, br linija
			System.out.println("\nRijeci ima: " + rijeci);
			System.out.println("Linija ima: " + lines.getLineNumber() + ": ");
			System.out.println("Znakova/karaktera ima : " + znakovi);
			// ako fajl nije pronaðen izbacuje gresku
		} catch (FileNotFoundException ex) {
			System.out.println("Nema fajla:");
			main(args);
		}
		citac.close();
		lines.close();

	}

}
