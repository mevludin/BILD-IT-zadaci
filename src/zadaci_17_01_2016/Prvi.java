package zadaci_17_01_2016;

import java.util.Scanner;

public class Prvi {
	public static void prosti(int a,int b, int c){
	int brojac=0;
	System.out.println("Prosti brojevi su: ");
	
	//pronalazak prostih brojeva
	for (int i = a; i <= b; i++)
		if (i == 2 || i == 3 || i == 5 || i == 7) {
			if(brojac == c){
				System.out.println();
				brojac=0;
			}
			System.out.print(i+",");
			brojac++;
		} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

		} else{
			//prelazak u novi red/liniju
			if(brojac == c){
				System.out.println();
				brojac=0;
			}
			System.out.print(i + ",");
			brojac++;
			
		}
	}
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		//parametri
		int a;
		int b;
		int c;
		//unos parametara
		System.out.println("Unesite pocetni broj: ");
		 a=unos.nextInt();
		System.out.println("Unesite krajnji broj: " );
		 b=unos.nextInt();
		System.out.println("Unesite koliko elemenata u ispisu zelite: ");
		 c=unos.nextInt();
		unos.close();
		//poziv metode
		prosti(a,b,c);
	}

}
