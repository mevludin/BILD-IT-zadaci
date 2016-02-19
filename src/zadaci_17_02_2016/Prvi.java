package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Prvi {
	public static void main(String[] args) throws FileNotFoundException {
		//url adresa
		String URL = "http://cs.armstrong.edu/liang/data/Salary.txt";
		String radnoMj;
		//varijable plate osoblja
		double docent =0;
		double vanrP = 0;
		double redP = 0;
		double ukupno = 0;
		// brojaci osoblja
		int brDoc = 0;
		int brRed = 0;
		int brVanr = 0;
		// smestamo podatke sa weba u fajl
		File file = new File("webfile.txt");
		PrintWriter pw = new PrintWriter(file);
		try {
			URL url = new URL(URL);
			//uèitavamo iz fajla
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				pw.println((input.nextLine() + " "));
				//ime i prezime nije bitno
				input.next();
				input.next();
				// ucitavamo zvanje zaposlenog.
				radnoMj = input.next();
				// Ako je zaposleni docent,
				if (radnoMj.equals("assistant")) {
					// dodaj njegovu platu
					docent += input.nextDouble();
					// Uvecavamo brojac.
					brDoc++;
					// Ako je zaposleni vanredni profesor,
				} else if (radnoMj.equals("associate")) {
					// dodaj platu i uvecaj brojac.
					vanrP += input.nextDouble();
					brVanr++;
				} else {
					//redovni prof
					redP += input.nextDouble();
					brRed++;
				}

			}
			input.close();
			ukupno = docent + vanrP + redP;
			// Prikazujemo koliko je zaposlenih na fakultetu.
			System.out.println("Fakultet ima: " + (brDoc + brVanr + brRed)
					+ " uposlenika");

			// Prikazujemo ukupnu platu i prosjek plata
			System.out.printf("\nUkupna plata docenata je:%10.2f$", docent);
			System.out.printf("\nšto u prosjeku po uposleniku iznosi:%10.2f$",
					(docent / brDoc));
			System.out.printf("\n\nUkupna plata vanrednih prof je:%10.2f$ ",
					vanrP);
			System.out.printf(
					"$, \nšto u prosjeku po uposleniku iznosi:%10.2f$",
					(vanrP / brVanr));
			System.out.printf("\n\nUkupna plata redovnih prof je:%10.2f$", redP);
			System.out.printf(
					"$, \nšto u prosjeku po uposleniku iznosi:%10.2f$",
					(redP / brRed));

			// ukupne godisnje plate svih zaposlenih
			System.out
					.printf("\n\nUkupna plata uposlenika na godišnjem nivou je: %10.2f$\n",
							ukupno);
			// prosjecna godisnja plata jednog zaposlenika
			System.out.printf("Prosjecno po uposleniku to je: %5.2f$\n",
					(ukupno / (brDoc + brVanr + brRed)));
			// ako je greska
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("Greska");
		}
		pw.close();
	}
}
