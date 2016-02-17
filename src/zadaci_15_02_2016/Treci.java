package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Treci {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		// napravimo fajl
		File file = new File("fascikla.txt");
		// print writer fajla
		PrintWriter pw = new PrintWriter(file);

		try {
			System.out.println("Unesi text u file: ");
			// unos korisnika
			String unesi = unos.nextLine();
			// upisivanje u fajl
			pw.println(unesi);
			// ako ima gresaka uhvati gr
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}
		pw.close();// zatvori pw

		System.out.println("Neku rije� �eli� izbrisati: ");
		// unesi �ta hoces izbrisat
		String rijec = unos.nextLine();
		String rj = "";

		// reads from file
		Scanner citanje = new Scanner(file);// scanner za citanje fajla
		while (citanje.hasNext()) {
			// pro�itano se unosi u string
			rj = citanje.nextLine();
		}
		// bri�e rije� kju smo upisali
		rj = rj.replace(rijec, "");
		// ispisuje strng kad je rijec izbrisana
		System.out.println(rj);
		citanje.close();// zatvara scanner
		// upisiva�-�ato
		PrintWriter Wv = new PrintWriter(file);
		// upisuje novi string u fajl
		Wv.print(rj);
		// zatvori sve �to je otvoreno
		Wv.close();
		unos.close();

	}

}
