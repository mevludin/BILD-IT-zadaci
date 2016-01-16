package zadaci_15_01_2016;

import java.util.Scanner;

public class Treci {
	public static int nzd(int brojA, int brojB){
		//sve dok drugi broj ne postane 0
		while(brojB!=0){
			//temp 
			int temp = brojB;
			//broj b ostatak djeljenja dva broja
			brojB = brojA % brojB;
			// broj a je broj b po ulazu /brC
			brojA = temp;
		}
		//vrati brojA
		return brojA;
	}
	public static void main(String[] args) {
		System.out.println("Unesite dva broja: ");
		//Kreiranje Scannera
		Scanner insert=new Scanner(System.in);
		//Unos brojeva od starne korisnika
		int brojA=insert.nextInt();
		int brojB=insert.nextInt();
		insert.close();
		//ispis poruke i nzd
		System.out.println("Najveci zajednicki djelilac unesenih brojeva je:\n"+nzd(brojA, brojB));
	}

	
}
