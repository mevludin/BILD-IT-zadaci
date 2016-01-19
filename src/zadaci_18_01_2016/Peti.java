package zadaci_18_01_2016;

import java.util.ArrayList;

import java.util.Scanner;

public class Peti {

	public static void main(String[] args) {
		int broj = 1;//da omoguæi ulazak u petlju
		int brojac = 0;//broji èlanove liste
		int sum = 0;
		double prosjek;
		int brojiVece = 0;
		int brojiManje = 0;
		ArrayList<Integer> brojevi = new ArrayList<>();

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi brojeve: ");
		while (broj != 0 && brojac < 100) {//uslov prekida petlje
			broj = unos.nextInt();//unos
			brojevi.add(broj);//dodavanje listi
			brojac++;
		}
		unos.close();
		for (int i = 0; i < brojevi.size(); i++) {
			sum += brojevi.get(i);
		}
		prosjek = sum / brojevi.size();//prosjek

		for (int i = 0; i < brojevi.size(); i++) {
			if (brojevi.get(i) >= prosjek) {
				brojiVece++;
			} else {
				brojiManje++;
			}
		}
//poruke
		System.out.println("Prosjek unesenih brojeva je: " + prosjek);
		System.out.println("Brojeva vecih od prosjeka ima: " + brojiVece);
		System.out.println("Brojeva manjih od prosjeka ima: " + brojiManje);

	}
}
