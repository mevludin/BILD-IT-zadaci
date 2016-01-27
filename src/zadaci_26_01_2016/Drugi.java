package zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drugi {
	public static void main(String[] args) {
		System.out.println("Unesite dva broja: ");
	try(Scanner input = new Scanner(System.in);) {
		
	
	int a = input.nextInt();
	int b = input.nextInt();
	int minDjelilac = 1;
	int maxDjelilac = 1;
//ako je unos nula
	while(a==0 || b==0){
		System.out.println("Birani broj je nula, unesi veci!");
		if(a==0){
			a = input.nextInt();
		}else{
			b = input.nextInt();
		}
	}
		//najveci djelilac
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && a % i == 0) {
				maxDjelilac = i;
			}
		}
		//najmanji djelilac
		for (int i = b; i >= 2; i--) {
			if (b % i == 0 && a % i == 0) {
				minDjelilac = i;
			}

		}
		
	//poruke
	System.out.println("Najveci djelilac je: " + maxDjelilac);
	System.out.println("Najmanji djelilac je: " + minDjelilac);
	input.close();
	} catch (InputMismatchException e) {
		System.out.println("Greška: ");
		
	}
	
}
}
