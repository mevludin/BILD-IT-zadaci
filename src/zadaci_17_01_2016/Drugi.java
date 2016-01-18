package zadaci_17_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drugi {
	public static double min(double[] array) {
		double temp = 100000000;//neka vrijednost za usporedbu
		//pronalazak najmanjeg elementa
		for (int i = 0; i < array.length; i++) {

			if (array[i] < temp) {
				temp = array[i];
			}
		}
		System.out.println("Najmanji elmenat niza je: " + temp);
		return temp;
	}

	public static void main(String[] args) {
//kreiranje niza
		double[] array = new double[10];
		array = new double[10];
		try (Scanner unos = new Scanner(System.in)) {
			//Unos elemenata niza
			System.out.println("Unesite 10 double elmenata niza: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = unos.nextDouble();
			}
			unos.close();

		} catch (InputMismatchException e) {
			System.err.println("samo brojevi ");
			System.exit(0);
		}

		min(array);
	}

}
