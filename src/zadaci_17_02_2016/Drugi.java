package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		// niz kao brojac slova.
				int[] brojac = new int[26];
				String linija = "";
				File file = new File("src/zadaci_17_02_2016/Lincoln.txt");
				Scanner citac=null;
				try{
				// Kreiramo citac.
					citac = new Scanner(file);
					// U petlji se ucitavaju linije teksta pri svakoj iteraciji i
					// provjerava se svako slovo u ucitanoj liniji.
					while (citac.hasNext()) {
						// ucitavamo text iz filea i konvertujemo u velika slova
						linija = citac.nextLine().toUpperCase();
						for (int i = 0; i < linija.length(); i++) {
							// trenutni karakter.
							char ch = linija.charAt(i);
							// Ako je karakter veliko slovo,
							if (ch >= 'A' && ch <= 'Z') {
								/* povecaj brojaz za jedan indeks se odredjuje tako sto se uzme vrijednost
								char i oduzme od 65, zbog pozicije u ASCII
								tabeli. npr. 'A' - 65 je nula i vrijednost na indeksu se povecava za jedan*/
								
								brojac[ch - 65]++;
							}
						}
					}

					// Ispisujemo rezultat.
					for (int i = 0; i < brojac.length; i++) {
						// prikazujemo slovo i vrijednost u nizu
						// ako je i = 1 onda je 'A' + i = B
						System.out.println("Slova: " + (char) ('A' + i) + " ima: " + brojac[i]);
					}

				} catch (FileNotFoundException e) {
					
					System.out.println("File " + file + "ne postoji.");
				} finally {
					// Zatvaramo citac.
					if (citac != null) {
						citac.close();
					}
				}

	}

}
