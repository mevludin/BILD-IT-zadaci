package zadaci_30_01_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		String str;//verijabla
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		str = unos.nextLine();//unos stringa od korisnika
		//ispis duzine i prvog slova
		System.out.println("Duzina stringa je: " + str.length() + ", a prvo slovo je: "
				+ str.charAt(0));
		unos.close();
	}

}
