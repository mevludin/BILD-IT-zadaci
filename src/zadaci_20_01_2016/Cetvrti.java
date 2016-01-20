package zadaci_20_01_2016;

import java.util.Scanner;

public class Cetvrti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//Unos korisnika
		System.out.println("Unesite neku poruku: ");
		String poruka = unos.nextLine();
		unos.close();
		for (int i = 0; i < poruka.length(); i++) {
			//Uslov za ispis neparnih karaktera stringa
			if (i % 2 == 0) {
				System.out.print(poruka.charAt(i));
			}
		}

	}

}
