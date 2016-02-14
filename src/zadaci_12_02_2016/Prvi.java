package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prvi {
	//metoda za racunanje povrsine
	public static void povrsina(double[] X, double[] Y) {
		double povrsina;
		double suma = 0;
		for (int i = 0; i < X.length - 1; i++) {
			suma += (X[i] * Y[i + 1]) - (Y[i] * X[i + 1]);
		}
		povrsina = Math.abs(suma) / 2;
		System.out.println("Povrsina upisanog poligona je: "+povrsina+" m^2");
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int kX;
		int kY;
		int brTac;
		System.out.println("Unesite broj tacaka poligona:");
		try{
		brTac = unos.nextInt();
		//niz kooX i kooY predstavljaju unesene koordinate, gdje se Xkoordinata unosi u koordX
		//a Y u koordY, redom tako da je prva tacka (koordX[0],koordY[0])
		double[] koordX = new double[brTac];
		double[] koordY = new double[brTac];
		for (int i = 0; i < brTac; i++) {
			System.out.println("Unesite koordinatu X: ");
			kX = unos.nextInt();
			koordX[i] = kX;
			System.out.println("Unesite koordinatu Y: ");
			kY = unos.nextInt();
			koordY[i] = kY;
		}
		povrsina(koordX, koordY);
		unos.close();
		}catch(InputMismatchException e){
			//ako je pogresan unos izbaci gresku
			System.out.println("Greska...ponovi unos!!!");
			main(args);
		}
	}

}
