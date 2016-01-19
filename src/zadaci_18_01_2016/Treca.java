package zadaci_18_01_2016;

import java.util.Scanner;

public class Treca {
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double[] niz = new double[3];
		niz[0]=num1;
		niz[1]=num2;
		niz[2]=num3;
		
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] > niz[j]) { // poredi sa prvi iz podniza (index i) sa
										// svim iz podniza
					double b = niz[i]; // zamjena mjesta
					niz[i] = niz[j];
					niz[j] = b;
				}
			}
		}
		//ispis
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i]+",");
		}
	}

	public static void main(String[] args) {
		System.out.println("Unesite tri broja: ");
		Scanner unos = new Scanner(System.in);
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		double c = unos.nextDouble();
		unos.close();
		displaySortedNumbers(a, b, c);

	}

}
