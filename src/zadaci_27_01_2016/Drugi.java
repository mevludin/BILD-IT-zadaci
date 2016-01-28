package zadaci_27_01_2016;

import java.util.Scanner;


public class Drugi {
	 public static void reverse(int number){
		 //ispis obrnutim radoslijedom
		 while(number!=0){
			int i = number%10;
			System.out.print(i);
			number=number/10;
		 }
		
	 }
	public static void main(String[] args) {
		int number=0;
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite neki cijeli broj: ");
		 try{
			
			 number=unos.nextInt();//unos broja
			 
			 reverse(number);//poziv metode
			
		 }catch(Exception e){
			 System.out.println("Greska, brojevi!!!");
			 main(args);//ako je greska ponovi sve
		 }
		unos.close();
		

	}

}
