package zadaci_21_01_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		String[] mjeseci = { "", "Januar", "Februar", "Mart", "April", "Maj", "Juni",
				"Juli", "Avgust", "Sepembar", "Oktobar", "Novembar", "Decembar" };//niz stringova, nazivi mjeseci
		String[] dani = { "", "31", "28", "31", "30", "31", "30",
				"31", "31", "30", "31", "30", "31" };//dani
		System.out.println("APLIKACIJA ZA PROVJERU DANA U MJESECU");
		System.out.println("Unesite redni broj mjeseca:");
		int mjesec=unos.nextInt();
		System.out.println("Unesite godinu:");
		int godina=unos.nextInt();
		unos.close();
		System.out.print(mjeseci[mjesec]+" "+godina+". godine je imao ");//poruka
		if  ((godina%400==0||godina%4==0&&godina%100!=0)&&mjesec==2){//provjerava da li je godina prestupna

			System.out.print(" 29 dana");
			System.out.println();
			System.out.println(godina+". je prestupna godina!");
		}else{
			System.out.println(dani[mjesec]+" dana");//ako nije printa standardno
		}

	}

}
