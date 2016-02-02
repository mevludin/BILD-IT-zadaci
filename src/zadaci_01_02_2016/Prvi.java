package zadaci_01_02_2016;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		int broj;
		Scanner unos=new Scanner(System.in);
		try{
		System.out.println("Unesite broj izmeðu 0 i 127 : ");
		broj=unos.nextInt();//unos
		//pretvaranje i ispis u ASCII
		System.out.println("Upisani broj u ASCII kodu predstavlja znak: "+(char)broj);
		}catch(Exception e){
			System.out.println("Greska, pokusajte ponovo!");//ako je greska
			main(args);//poziv main funkcije
		}
		unos.close();

	}

}
