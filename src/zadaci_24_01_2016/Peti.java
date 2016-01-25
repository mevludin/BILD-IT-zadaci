package zadaci_24_01_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//unos dva stringa
		System.out.print("Unesite string S1: ");
		String s1 = unos.next();
		System.out.print("Unesite string S2: ");
		String s2 = unos.next();
		//pronalazak substringa
		boolean substrings2 = s1.toLowerCase().contains( s2.toLowerCase() );
		boolean substrings1 = s2.toLowerCase().contains( s1.toLowerCase() );
		if(substrings2) {
		    System.out.println("S2 je substring stringa S1");
		}
		else if(substrings1) {
		    System.out.println("S1 je substring stringa S2");
		}else{
			System.out.println("Nema substringova!");
		}
		unos.close();

	}

}
