package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) throws FileNotFoundException {
		// korisniku da unese url adresu
		System.out.print("Unesi URL: ");
		Scanner unos = new Scanner(System.in);
		String URL;

		//
		URL = unos.nextLine();
		// smestamo podatke sa weba u fajl
		File file = new File("webfile.txt");
		PrintWriter pw = new PrintWriter(file);
		try {
			URL url = new URL(URL);
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				pw.println((input.nextLine() + " "));

			}
			input.close();
			// ako je greska
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("Greska");
		}
		pw.close();
		// varijable
		double sum = 0;
		double brojac = 0;

		// uzimaju se podaci iz fajla
		File file1 = new File("webfile.txt");
		Scanner input = new Scanner(file1);
		while (input.hasNext()) {
			sum += Double.parseDouble(input.next());
			brojac++;
		}
		// rezultat za zbir
		System.out.println("Zbir rezultata je : " + sum + ".");
		// racunamo prosek
		double prosjek = sum / brojac;
		// stampamo rezultat proseka
		System.out.println("Prosjek je: " + prosjek + ".");
		input.close();
		unos.close();
	}

}
