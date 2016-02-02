package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrti {
	public static String format(int number, int width) {
		ArrayList<String> brojevi = new ArrayList<>();//za nule
		int n = number;//da bi na kraju ispisao prvobitnu vrijednost
		int brojac = 0;//broji cifre unesenog broja
		while (number != 0) {
			number = number / 10;
			brojac++;
		}
		for (int i = 0; i < width - brojac; i++) {//unos nula u listu
			brojevi.add("0");
		}
		for (int i = 0; i < brojevi.size(); i++) {//ispis nula
			System.out.print(brojevi.get(i));
		}
		return Integer.toString(n);

	}

	public static void main(String[] args) {
		int num;
		int w;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		try{
		num = unos.nextInt();//unos broja
		System.out.println("Unesite širinu ispisa: ");
		w = unos.nextInt();//unos sirine   
		//poziv funk
		System.out.println(format(num, w));
		}catch(Exception e){
			System.out.println("Greska, ponovi unos!");//ako je greska
			main(args);
		}
		unos.close();
	}

}
