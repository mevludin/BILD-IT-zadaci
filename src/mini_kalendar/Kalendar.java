package mini_kalendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Kalendar {

	public static void main(String[] args) {
		// nazivi mjeseci
		String[] mjeseci = { "", "Jan", "Feb", "Mar", "Apr", "Maj", "Jun",
				"Jul", "Avg", "Sep", "Okt", "Nov", "Dec" };

		int mjesec;
		int godina;

		Scanner unos = new Scanner(System.in);

		System.out.println(">>>>>DOBRO DOSLI<<<<<");
		int izbor = 10;
		while (izbor != 0) {
			// glavni meni
			System.out.println("\nIzaberite neku od mogucih opcija: ");
			System.out.println("1. Kalendr");
			System.out.println("2. Zabiljeske");
			// izbor iz glavnog menija
			izbor = unos.nextInt();
			if (izbor == 1) {
				System.out.println("Unesite mjesec:");
				mjesec = unos.nextInt();

				System.out.println("Unesite godinu:");
				godina = unos.nextInt();
				// metodakalendar
				Calendar kalendar = new GregorianCalendar(godina, mjesec, 0);
				System.out.printf("%18s", mjeseci[mjesec] + "  " + godina);
				System.out.println("\n______________________________");
				System.out.print(" Pon Uto Sri Cet Pet Sub Ned\n");
				System.out.println();
				// formula za odreðivanja poèetnog dana u mjesecu (preuzeto,
				// nije originalno djelo autora aplikacije:) )
				int a = godina - (14 - mjesec) / 12;
				int b = a + a / 4 - a / 100 + a / 400;
				int c = mjesec + 12 * ((14 - mjesec) / 12) - 2;
				int d = (b + (31 * c) / 12) % 7;
				for (int i = 0; i < d; i++)
					System.out.print("    ");
				// ispis dana po pozicijama
				for (int i = 1; i <= kalendar
						.getActualMaximum(kalendar.DAY_OF_MONTH); i++) {
					System.out.printf("%4d", i);
					// prelazak u novi rad
					if (((i + d) % 7 == 0)
							|| (i == kalendar
									.getActualMaximum(kalendar.DAY_OF_MONTH)))
						System.out.println();
				}
				// druga opcija sa pod opcijama
			} else if (izbor == 2) {
				int opcija = 10;
				while (opcija != 3) {
					System.out.println("\nOdaberite opciju:");
					System.out.println("1.Upis u podsjetnik.");
					System.out.println("2.Èitanje napomena.");
					System.out.println("3.Glavni meni.");
					System.out.println(">>");
					opcija = unos.nextInt();

					if (opcija == 1) {
						int dan;
						String nap;
						// file klasa
						File file = new File(
								"Podsjetnik.txt");
						// kalendar klasa
						Calendar kalendar = Calendar.getInstance();
						kalendar.clear();
						System.out.println("Unesite napomenu u podsjetnik!");
						nap = unos.next();
						System.out.println("Unesite dan: ");
						dan = unos.nextInt();
						System.out.println("Unesite mjesec: ");
						mjesec = unos.nextInt();
						System.out.println("Unesite godinu: ");
						godina = unos.nextInt();

						kalendar.set(godina, mjesec, dan);

						try {
							// upisivanje u file
							FileWriter upis = new FileWriter(file, true);

							upis.write(dan + "." + mjesec + "." + godina + " "
									+ nap);
							upis.write(System.getProperty("line.separator"));
							upis.close();

						} catch (IOException IO) {
							System.out.println("Greska!");
						}
						System.out.println("Napomena  uspjesno upisana.");
						// moguænost povratka na menije
						System.out
								.println("Unesite 3 za povratak na glavni meni, ili 0 za meni.");
						izbor = unos.nextInt();
						unos.close();
					}

					else if (opcija == 2) {
						// buffer klasa za èitanje iz fajla
						BufferedReader citanje = null;

						try {

							String prikaz;
//C:/Users/Mevludin & Emina/git/BILD-IT-zadaci/src/mini_kalendar/Podsjetnik.txt
							citanje = new BufferedReader(
									new FileReader("Podsjetnik.txt"));
							// upisivanje sadržaja fajla u string i èitanje iz
							// istog
							while ((prikaz = citanje.readLine()) != null) {

								System.out.println(prikaz);

							}

						} catch (IOException e) {
							System.out.println("Greska!");
						} finally {
							try {
								if (citanje != null)

									citanje.close();// zatvaranje Buffera

							} catch (IOException ex) {
								System.out.println("Greska!");
							}
						}
					}

				}
			}
		}

	}

}
