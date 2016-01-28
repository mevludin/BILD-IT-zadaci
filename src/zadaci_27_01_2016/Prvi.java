package zadaci_27_01_2016;

import java.util.Scanner;

public class Prvi {
	//metoda za izracun napojnice 
public static double napojnica(int a, double proc){
	double ukupno;
	double napojnica;
	ukupno=a*((proc/100)+1);//formula za ukupnu cijenu sa napojnicom
	napojnica=ukupno-a;//sama napojnica
	System.out.println("Ukupno za platit: "+ukupno+" KM");
	System.out.println("Npojnica je: "+napojnica+" KM");
	return napojnica;
}
	public static void main(String[] args) {
		int a=0;
		double proc=0;
		Scanner unos = new Scanner(System.in);
		try{
			System.out.println("Unesite iznos racuna:");
			a=unos.nextInt();
			System.out.println("Unesite procentialni iznos napojnice: ");
			proc=unos.nextInt();
			
		}catch(Exception e){
			System.out.println("Greska, moraju biti brojne vrijednosti, ponovite unos: ");
			main(args);
			
		}
		unos.close();
		
		napojnica(a,proc);
	}

}
