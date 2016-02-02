package zadaci_01_02_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		char znak;
		Scanner unos=new Scanner(System.in);
		try{
		System.out.println("Unesite neki znak : ");
		znak = (char)unos.next().charAt(0);//unos znaka
		//pretvaranje i ispis u Unicodu
		System.out.println("Upisani znak u Unicodu predstavlja broj: "+(byte)znak);
		}catch(Exception e){
			System.out.println("Greska, pokusajte ponovo!");//ako je greska
			main(args);//poziv main funkcije
		}
		unos.close();

	}

}
