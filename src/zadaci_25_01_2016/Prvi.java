package zadaci_25_01_2016;


import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj gradova koji cete unijeti:");
		int n=unos.nextInt();
		//posto korisnik treba unijeti 3 grada i velicina niza je 3
		String[] gradovi = new String[n];
		System.out.println("Unesite "+n+" grada: ");
		
		for (int i = 0; i <gradovi.length; i++) {
			gradovi[i] = unos.nextLine();
		}
		
		// sortiranje gradova
		java.util.Arrays.sort(gradovi);
		System.out.println("Gradovi koje ste unijeli su: ");
		// izbacivanje sortiranih gradova
		for (int i = 0; i <gradovi.length; i++) {
			System.out.println(gradovi[i]);
		
		}

		unos.close();
	}

}
