package zadaci_17_01_2016;

import java.util.Scanner;

public class Treci {
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		boolean povrat=false;
		int brojac=0;//brojac za usporedbu sa brojem elemenata
		//provjera jednakosti
		for (int i=0;i<niz1.length;i++){
			if (niz1[i]==niz2[i]){
				povrat=true;
				brojac++;
			
			}
			
		}
		if(brojac==niz1.length){
			System.out.println("Nizovi su striktno identièni!");
		}else{
			System.out.println("Nizovi nisu identièni");
		}
		
		return povrat;
	}
	public static void main(String[] args) {
		//definišemo dva niza
		int []niz1=new int [5];
		int []niz2=new int [5];
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite niz brojeva: ");
		//upis vrijednosti niza
		for (int i=0;i<niz1.length;i++){
			niz1[i]=unos.nextInt();
			niz2[i]=unos.nextInt();
		}
		unos.close();
		equals(niz1,niz2);

	}

}
