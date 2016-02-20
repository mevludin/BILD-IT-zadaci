package zadaci_18_02_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		// nazivi mjeseci
		String[] mjeseci = { "", "Jan", "Feb", "Mar", "Apr", "Maj", "Jun",
				"Jul", "Avg", "Sep", "Okt", "Nov", "Dec" };

		int mjesec;
		int godina;

		Scanner unos = new Scanner(System.in);
		try {
			System.out.println("<<<<  KALENDAR   >>>>");
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
		} catch (InputMismatchException e) {
			main(args);
		}
		unos.close();
	}

}
