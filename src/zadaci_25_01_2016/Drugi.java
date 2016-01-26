package zadaci_25_01_2016;

import java.util.ArrayList;

public class Drugi {

	public static void main(String[] args) {
		
		ArrayList<Integer> brojevi = new ArrayList<>();
		//prosti brojevi
		for (int i = 2; i <= 1000; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {

				brojevi.add(i);//dodavanje u listu

			} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

			} else {

				brojevi.add(i);//dodavanje u listu

			}
		}
		int brojac=0;
		for (int i = 0; i < brojevi.size(); i++) {

			System.out.print(brojevi.get(i)+" ");//ispis
			brojac++;
				if (brojac==8) {
					System.out.println();//prelaz u novi red
					brojac=0;
				}
			

	}

}
}
