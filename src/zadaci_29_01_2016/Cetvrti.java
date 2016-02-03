package zadaci_29_01_2016;

import java.util.Scanner;

public class Cetvrti {
	public static int sumDigits(long n){
		int sum=0;
		//odvaja cifre i dodaje sumi
		while(n>0){
			sum+=n%10;
			n=n/10;
		}
		//ispis
		System.out.println("\nSuma cifara unesenog broja je: "+sum);
		return sum;
	}
	public static void main(String[] args) {
		long n;
		Scanner unos=new Scanner(System.in);
		try{
			//unos broja i poziv metode
		System.out.println("Unesite neki cijeli broj:  ");
		n=unos.nextLong();
		sumDigits(n);
		}catch(Exception e){
			System.out.println("Greska, ponovite:");//ako ima gresaka
			main(args);
		}
unos.close();
	}

}
