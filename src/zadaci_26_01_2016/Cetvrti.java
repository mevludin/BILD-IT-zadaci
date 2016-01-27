package zadaci_26_01_2016;

import java.util.Scanner;

public class Cetvrti {
public static void rastuci (int a, int b, int c){
	int []brojevi=new int[3];
	//dodijeli brojeve nizu
	brojevi[0]=a;
	brojevi[1]=b;
	brojevi[2]=c;
	java.util.Arrays.sort(brojevi);//sortiranje niza
	System.out.println("Unijeli ste brojeve:");
	//ispis niza
	for (int i=0;i<brojevi.length;i++){
		System.out.print(brojevi[i]+" ");
	}
	
}
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int a;
		int b;
		int c;
		try{
			//unos korisnika
			System.out.println("Uneiste tri broja: ");
			a=unos.nextInt();
			b=unos.nextInt();
			c=unos.nextInt();
			rastuci (a,b,c);
		}catch(Exception e){
			System.out.println("Greska, unesite broj:");//ako je graska
			main(args);
			
		}
		unos.close();
		
		
	}

}
