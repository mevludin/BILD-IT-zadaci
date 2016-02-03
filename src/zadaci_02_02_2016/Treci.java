package zadaci_02_02_2016;

import java.util.Scanner;

public class Treci {
	public static boolean isConsecutiveFour(int[] values) {

		int brojac = 1;// Counter of consecutive equal numbers

		// Loop for counting
		for (int i = 0; i < values.length-1; i++) {
			if (values[i] - values[i + 1] == 0) {
				brojac++;
			}
		}
		// If there was 4 consecutive equal numbers method return is true
		if (brojac >= 4) {
			return true;
		} else {
			return false;
		}

	}


	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int n;
			// ispis pitanje koliki ce biti niz?
			System.out.print("Unesite velicinu niza brojeva : ");
			try{
			n = unos.nextInt();
			// napravi novi niz velicine nizBrojeva
			int niz[] = new int[n];
			// unos brojeva u niz
			System.out.print("Unesite brojeve  : ");
			while (n != 0) {
				niz[n - 1] = unos.nextInt();
				n--;
			}
			// sadrzil niz 4 ista broja u nizu
			if(isConsecutiveFour(niz)){
				System.out.println("Pojavljuju se èetiri uzastopna broja: ");
			}else{
				System.out.println("Ne pojavljuju se èetiri uzastopna broja: ");
			}
			// nova linija
			System.out.println("\nUnijeti brjevi su:");
			// ispis niza
			for (int i : niz) {
				System.out.print(i + " ");
			}
			}catch(Exception e){
				System.out.println("Greska, ponovi unos!");
				main(args);
			}
unos.close();
		
	}

}
