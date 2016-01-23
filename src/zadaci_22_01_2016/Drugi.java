package zadaci_22_01_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//unos koordinata
		System.out.println("Unesite geografsku širinu za prvu taèku: ");
		double x1=(double) Math.toRadians(unos.nextFloat());
		System.out.println("Unesite geografsku dužinu za prvu taèku: ");
		double y1=(double) Math.toRadians(unos.nextFloat());
		System.out.println("Unesite geografsku širinu za drugu taèku: ");
		double x2=(double) Math.toRadians(unos.nextFloat());
		System.out.println("Unesite geografsku dužinu za drugu taèku: ");
		double y2=(double) Math.toRadians(unos.nextFloat());
		unos.close();
		//formula data u postavci
		double d = (double) Math.acos(Math.sin(x1) * Math.sin(x2)  +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
	     //izracunavanje udaljenosti
	     double daljina = (6.37101 * d) * 1000;
	     //ispis
	     System.out.println("Udaljenost je: "+ daljina+ " km");
	}

}
