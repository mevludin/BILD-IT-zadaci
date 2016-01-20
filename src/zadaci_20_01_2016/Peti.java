package zadaci_20_01_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		//unos korisnika
		System.out.println("Unesite brzinu aviona: ");
		double brzina=unos.nextDouble();
		System.out.println("Unesite ubrzanje aviona: ");
		double ubrzanje=unos.nextDouble();
		unos.close();
		//formula iz postavke zadatka
		double duzina=(brzina*brzina)/(2*ubrzanje);
		//ispis
		System.out.println("Minimalna duzina piste mora biti: "+duzina+" metara.");

	}

}
