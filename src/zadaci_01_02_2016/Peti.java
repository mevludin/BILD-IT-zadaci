package zadaci_01_02_2016;

import java.util.Scanner;
import java.util.*;
public class Peti {

	public static void main(String[] args) {
		int []brojevi=new int[10];
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite 10 brojeva: ");
		for (int i=0;i<brojevi.length;i++){
			brojevi[i]=unos.nextInt();
		}
		//definisanje set liste brojeva
		Set<Integer> unikat = new HashSet<Integer>();
		for (int i = 0; i < brojevi.length; i++) {
			// ako se neki broj vec pojavio nece ga dodati
		    if (!unikat.contains(brojevi[i])) {
		    	unikat.add(brojevi[i]);//dodaje unikate u listu
		        continue;
		    }
		}
		for(int i : unikat) {
			System.out.print(i + " ");
		}
		unos.close();

	}

}
