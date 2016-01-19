package zadaci_18_01_2016;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj=unos.nextInt();//korisnikov unos
		unos.close();
		int podijeli=2;
		System.out.println("Najmanji faktori upisanog broja su: ");
		while(broj>1){
		//pronalazak najmanjih faktora
			if (broj%podijeli==0){
			System.out.print(podijeli+",");
			broj=broj/podijeli;
		}else{
			podijeli++;
			
		}
		}

	}

}
