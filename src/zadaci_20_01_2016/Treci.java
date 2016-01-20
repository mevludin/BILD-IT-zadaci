package zadaci_20_01_2016;

import java.util.Scanner;

public class Treci {
	//metoda obrnutog redoslijeda cifara
	public static int reverse(int number){
		for(int i=0;i<3;i++){
			System.out.print(number%10);
			number=number/10;
		}
		return number;		
	}
	//metoda palindrom
	public static boolean isPalindrome(int number){
	boolean palindrom=false;
		int num1=number%10;
	int num2=number/100;
	if (num1==num2){
		palindrom=true;
		System.out.println("\nBroj koji ste unijeli je palindrom");
	}else{
		System.out.println("\nBroj koji ste unijeli nije palindrom");
	}
	return palindrom;
	
	}
	public static void main(String[] args) {
		//unos korisnika
		System.out.println("Unesite neki trocifren broj: ");
		Scanner unos=new Scanner(System.in);
		
		int number=unos.nextInt();
		unos.close();
		reverse(number);
		isPalindrome(number);

	}

}
