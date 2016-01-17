package zadaci_16_01_2016;

import java.util.Scanner;

public class Peti {
	public static void pismoGlava(int k){
	//brojaci pisma i glave
		int pismo = 0;
	int glava = 0;
	//petlja za simulacuju bacanja
	for (int i = 0; i < k; i++) {
		int a = (int) (Math.random() * 2);
		if (a == 1) {//ako je 1 onda je pismo, ako nije onda je glava
			pismo++;
		} else {
			glava++;
		}
	}
	//ispis poruke
	System.out.println("Pismo se pojavilo " + pismo + " puta, a glava "
			+ glava + " puta.");

}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("Unesite broj bacanja: ");
		int k = input.nextInt();//unos broja bacanja od strane korisnika
		input.close();
		pismoGlava(k);
}
}
