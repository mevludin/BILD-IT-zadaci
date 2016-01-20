package zadaci_19_01_2016;

import java.util.Scanner;

public class Treci {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite dva stringa: ");
		String prvi=unos.nextLine();
		String drugi=unos.nextLine();
		unos.close();
		System.out.println("Najveci zajednicki prefiks je: ");
		
		for (int i=0;i<prvi.length();i++){
			if (prvi.charAt(i)==drugi.charAt(i)){//poredi karaktere u tringovima
					System.out.print(prvi.charAt(i));
				
			}else{
				break;//prekida ako naiðe na razliku
			}
		}

	}

}
