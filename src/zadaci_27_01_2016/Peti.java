package zadaci_27_01_2016;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double t1;
		double t2;
		double c1;
		double c2;
		double cGR1;
		double cGR2;
		try {
			System.out.println("Unesite tezinu prvog pakovanja u gramima: ");
			t1 = unos.nextDouble();
			System.out.println("Unesite cijenu prvog pakovanja u KM: ");
			c1 = unos.nextDouble();
			System.out.println("Unesite tezinu drugog pakovanja u gramima: ");
			t2 = unos.nextDouble();
			System.out.println("Unesite cijenu drugog pakovanja u KM: ");
			c2 = unos.nextDouble();
			cGR1 = c1 / t1;//raèuna cijenu jednog grama prvog paketa
			cGR2 = c2 / t2;//raèuna cijenu jednog grama drugog paketa
			if (cGR1 < cGR2) {
				System.out
						.println("Cijena prvog pakovanja je prihvatljivija!!!");
			} else {
				System.out
						.println("Cijena drugog pakovanja je prihvatljivija!!!");
			}
		} catch (Exception e) {
			System.out.println("Greska, brojeve unositi!!!");
			main(args);//ako je greska sve ponovo
		}
		unos.close();
	}

}
