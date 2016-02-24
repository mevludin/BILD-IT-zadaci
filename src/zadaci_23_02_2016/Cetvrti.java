package zadaci_23_02_2016;

import java.util.Scanner;

public class Cetvrti {
	public static int sum=0;
	public static void reverseDisplay(int value) {
		// uslov da se zaustavi rekurzija 
		if (value != 0) {
			sum+=(value%10);
			reverseDisplay(value / 10);//rekurzija
		}
	}
	public static void main(String[] args) {
		//varijabla
				int value;
				Scanner unos=new Scanner (System.in);
				System.out.println("Unesite broj: ");
				try{
					//unos od strane korisnika
				value=unos.nextInt();
				reverseDisplay(value);
				System.out.print("Suma cifara unesenog broja je: "+sum);
				}catch(IncompatibleClassChangeError e){
					System.out.println("Greska...ponovite unos!!!");
					main(args);
				}
				unos.close();

	}

}
