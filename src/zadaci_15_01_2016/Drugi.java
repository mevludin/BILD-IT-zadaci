package zadaci_15_01_2016;

import java.util.Scanner;

public class Drugi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// kreiranja scannera
		System.out.println("Unesite neku recenicu:");
		String recenica = input.nextLine();// unos stringa od strane korisnika
		System.out.println("Napisali ste: " + recenica);// ispis stringa
		int samoglasnici = 0;// brojaci
		int suglasnici = 0;
		input.close();
		// provjera samoglasnika i suglasnika i njihovo brojanje
		for (int i = 0; i < recenica.length(); i++) {

			String s = "AaEeIiOoUu";
			String sug = "BbCcÈèÆæDdÐðFfGgHhJjKkLlMmNnPpRrSsŠšTtVvWwYyZz";
			for (int j = 0; j < s.length(); j++) {
				if (recenica.charAt(i) == s.charAt(j)) {
					samoglasnici++;
				}
			}
			for (int k = 0; k < sug.length(); k++) {
				if (recenica.charAt(i) == sug.charAt(k)) {
					suglasnici++;
				}

			}
		}
		// ispis poruke
		System.out.println("U Vašoj reèenici ima " + samoglasnici
				+ " samoglasnika\ni " + suglasnici + " suglasnika.");

	}

}
