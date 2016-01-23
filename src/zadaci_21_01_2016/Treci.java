package zadaci_21_01_2016;

import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		String[] mj = { "", "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul",
				"Avg", "Sep", "Okt", "Nov", "Dec" };//niz sa nazivima mjeseci sa po tri slova radi provjere
		String[] mjeseci = { "", "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "Avgust", "Sepembar", "Oktobar", "Novembar",
				"Decembar" };//puni naziv mj
		String[] dani = { "", "31", "28", "31", "30", "31", "30", "31", "31",
				"30", "31", "30", "31" };//dani u mj
		System.out.println("APLIKACIJA ZA PROVJERU DANA U MJESECU");
		System.out.println("\nUnesite prva tri slova mjeseca:");
		String mjesec = unos.nextLine();
		System.out.println("Unesite godinu:");
		int godina = unos.nextInt();
		unos.close();
		int brojac = 0;
		for (int i = 1; i <= 12; i++) {
			for (int j = 0; j < 3; j++) {
				String a=mj[i].toLowerCase();//sve u mala slova
				String b=mjesec.toLowerCase();//sve u mala slova
				if (a.charAt(j) == b.charAt(j)) {//usporeðuje naziv mjeseca ukucanog sa nizom
					brojac++;//broji iste karaktere
					
				}
					
			}
			if (brojac == 3) {//ako se poklapaju sva tri karaktera ispisuje

				System.out.print(mjeseci[i] + " " + godina
						+ ". godine je imao ");
				if ((godina % 400 == 0 || godina % 4 == 0 && godina % 100 != 0)
						&& i == 2) {

					System.out.print(" 29 dana");
					System.out.println();
					System.out.println(godina + ". je prestupna godina!");
				} else {
					System.out.println(dani[i] + " dana");
				}
				brojac = 0;
			}
			
			
		}
		
	}

}
