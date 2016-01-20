package zadaci_19_01_2016;

import java.util.Scanner;

public class Peti {
	public static int countLetters(String s) {
		
		String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZÈÆŠŽÐ";//string slova za usporedbu
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
//ugnijezdena ptlja, poredi svaki karakter unesenog stringa sa predefinisanim stringom slova
		for (int j = 0; j < slova.length(); j++) {
				if (s.charAt(i) == slova.charAt(j)) {
					brojac++;
				}
			}
		}
		//ispis
		System.out.println("Slova u stringu ima: " + brojac);
		return brojac;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");

		String unesiSlova = unos.nextLine();//unos stringa
		unos.close();
		String s=unesiSlova.toUpperCase();//pretvara uneseni string u velika slova
		countLetters(s);

	}

}
