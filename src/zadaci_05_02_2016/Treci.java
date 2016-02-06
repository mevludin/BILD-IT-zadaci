package zadaci_05_02_2016;

import java.util.Scanner;

class QuadraticEquation {
	// polje podataka
	private int a;
	private int b;
	private int c;

	// konstruktor sa tri variable
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// geteri i seteri
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	// metoda vraca diskriminantu
	public double getDiscriminant() {
		return ((b * b) - 4 * a * c);
	}

	// vraca rjesenje x1
	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		} else {
			return ((-b + Math.sqrt(((b * b) - 4 * a * c))) / (2 * a));
		}
	}

	// vraca rjesenje x2
	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		} else {
			return ((-b - Math.sqrt(((b * b) - 4 * a * c))) / (2 * a));
		}
	}

}

public class Treci {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		try {
			// unos nepoznatih
			System.out.print("Unesite a : ");
			int a = unos.nextInt();
			System.out.print("Unesite b : ");
			int b = unos.nextInt();
			System.out.print("Unesite c : ");
			int c = unos.nextInt();
			// kvadratna jednacina
			QuadraticEquation jednacina = new QuadraticEquation(a, b, c);
			// ispis rezultata
			System.out.println("Rezultat kvadratne jednacine je: ");
			System.out.printf("x1 = " + jednacina.getRoot1() + "\nx2 = "
					+ jednacina.getRoot2());

		} catch (Exception e) {
			System.out.println("Greska...ponovi unos");
			main(args);
		}
		unos.close();
	}

}
