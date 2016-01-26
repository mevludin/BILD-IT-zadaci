package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Peti {
	public static ArrayList<Integer> unosBrojeva() {
		ArrayList<Integer> brojevi = new ArrayList<>();//array lista
		try (Scanner unos = new Scanner(System.in)) {
			System.out
					.println("Unesite brojeva koliko vam volja, unos prekidate nulom");
			int broj = 1;
			// unos.close();
			while (broj != 0) {
				broj = unos.nextInt();//unos brojeva od strane korisnika

				brojevi.add(broj);//unos u listu
			}
		} catch (InputMismatchException e) {
			System.out.println("Samo brojeve unisiit!");
		}
		return brojevi;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nekiBrojevi = unosBrojeva();
		int brojacPlus = 0;
		int brojacMinus = 0;
		int sum = 0;
		double prosjek;
		
		System.out.println("Unijeti brojevi su: ");
		for (int i = 0; i < nekiBrojevi.size(); i++) {
			sum += nekiBrojevi.get(i);
			System.out.print(nekiBrojevi.get(i));//ispis brojeva
			if (nekiBrojevi.get(i)>0){
				brojacPlus++;//broji pozitivne
			}else if (nekiBrojevi.get(i)<0){
				brojacMinus++;//broji negativne
			}
		}
		prosjek=sum/(nekiBrojevi.size()-1);//prosjek
//ispis
		System.out.println("Prosjek brojeva je: " + prosjek);
		System.out.println("Pozitivnih brojeva ima: " + brojacPlus);
		System.out.println("Negativnih brojeva ima: " + brojacMinus);
	}
}
