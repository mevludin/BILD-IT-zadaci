package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		//varijable
		int a;
		int b;
		int sum;
		Scanner unos=new Scanner (System.in);
		try{//try - catch blok
		System.out.println("Unesie broj a: ");
		a=unos.nextInt();//unos var a
		System.out.println("Unesie broj a: ");
		b=unos.nextInt();//unos var b
		sum=a+b;//suma
		System.out.println("Suma brojeva "+a+" i "+b+" je: "+sum); 
		}catch(InputMismatchException e){
			//ako je pogresan unos izbacuje gresku
			System.out.println("Greska...Ponovi unos!!!");
			main(args);
		}
		unos.close();
	}

}
