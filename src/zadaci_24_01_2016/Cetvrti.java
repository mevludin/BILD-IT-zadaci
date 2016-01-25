package zadaci_24_01_2016;

import java.util.Scanner;

public class Cetvrti {
	//metoda broji trazeni karakter u stringu
	public static int count(String str, char a){
		int brojac=0;
		for (int i=0;i<str.length();i++){
			if (str.charAt(i)==a){
				brojac++;	
			}
		}
		System.out.println("Broj ponavljanja karaktera - "+a+" - u stringu je: "+brojac);
		return brojac;
	}
	public static void main(String[] args) {
		System.out.println("Unesite string: ");
		Scanner unos=new Scanner(System.in);//unos stringa
		String str=unos.nextLine();
		System.out.println("Unesite slovo koje tražite u stringu");
		String s=unos.nextLine();//unos trazenog karaktera
		unos.close();
		char a=s.charAt(0);
		count(str,a);
		
			
		

	}

}
