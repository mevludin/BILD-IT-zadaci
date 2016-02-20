package zadaci_18_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

class GemoetricObject implements Comparable<GemoetricObject> {

	private int sirina;
	private int duzina;

	public GemoetricObject(int sirina, int duzina) {
		this.sirina = sirina;
		this.duzina = duzina;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

	public int getDuzina() {
		return duzina;
	}

	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}

	public double getPovrsina() {
		return sirina * duzina;
	}

	@Override
	public int compareTo(GemoetricObject obj) {
		return (getPovrsina() > obj.getPovrsina()) ? 1 : (getPovrsina() == obj
				.getPovrsina()) ? 0 : -1;
	}

	public int max(GemoetricObject ob) {
		return compareTo(ob);

	}
}

public class Drugi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {
			//unos poluprecnika za prvi
			System.out.println("Unesite dimenzije prvougaonika: ");
			System.out.println("Pravougaonik 1 ");
			System.out.print("Strana a: ");
			int a1 = unos.nextInt();
			System.out.print("Strana b: ");
			int b1 = unos.nextInt();
			//unos poluprecnika za drugi
			System.out.println("Pravougaonik 2 ");
			System.out.print("Strana a: ");
			int a2 = unos.nextInt();
			System.out.print("Strana b: ");
			int b2 = unos.nextInt();
			// dva objekta
			GemoetricObject objekat1 = new GemoetricObject(a1, b1);
			GemoetricObject objekat2 = new GemoetricObject(a2, b2);

			// komparacija i ispis poruke
			System.out.printf(
					"%s  ",
					(objekat1.max(objekat2) == 1) ? "Prvi pravougaonik je veci " : (objekat1
							.max(objekat2) == -1) ? "Drugi pravougaonik je veci"
							: "Jednaki su");

		} catch (InputMismatchException e) {
			System.out.println("Greska");
			main(args);
		}
		unos.close();
	}

}
