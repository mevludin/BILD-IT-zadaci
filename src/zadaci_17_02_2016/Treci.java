package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		int god = 0; // year
		boolean q = true; // for while loop
		while (q) {
			// unos godine
			try {
				System.out.print("Unesite godinu izmeðu (1880-2014): ");
				god = unos.nextInt();
				q = false;
			} catch (InputMismatchException e) {
				System.out.println("Greska");
				unos.nextLine();
			}
		}
		// unos imena
		System.out.print("Enter name: ");
		String ime = unos.next();
		// Prvo slovo imena mora biti veliko
		ime = Character.toUpperCase(ime.charAt(0)) + ime.substring(1);
		unos.close();
		// provjera
		File file = new File("babynames//yob" + god + ".txt");
		
		
		if (!file.exists()) {		

			System.out.println("Nema za unesenu godinu.");
			System.exit(1);
		}

		int brLin = 0; // broj linija proèitanih
		int temp = 0;
		//èitamo liniju po liniju dok ne nadjemo ime
		try {
			Scanner cita = new Scanner(file);
			while (cita.hasNext()) {
				String s = cita.nextLine();
				brLin++; // broji linije
				// ako pronaðemo ime prekida petlju
				if (s.contains(ime)) {
					break;
				}
				else {
					temp++;
				}
			}
			cita.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// ispis
		if (brLin == temp) {
			System.out.println("Ime " + ime + " nije na spisku za " + god+" godinu.");
		} else {
			System.out.println(ime + " je #" + brLin + " na listi za  " + god+" godinu.");
		}

	}

}
