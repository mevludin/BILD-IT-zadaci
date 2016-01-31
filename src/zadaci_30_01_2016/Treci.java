package zadaci_30_01_2016;

import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
			
			String mod = "^\\d{3}-\\d{2}-\\d{4}$";//model unosa
			String str="";
			try{
			while(!str.matches(mod)){//unosi broj dok ne bude tacna forma
				System.out.print("Unesite vas SSN : ");
				str = unos.next();
				if(!str.matches(mod)){//ako je razlicita forma ispis poruke
					System.out.println("Pokusajte ponovo");
				}
			}
			//ako je unos tacan ispis poruke i kraj programa
			System.out.printf("Vas SSN je:"+str);
		}
		catch (Exception e) {
			System.out.println("Greska.");
			main(args);
		}
	unos.close();

	}

}
