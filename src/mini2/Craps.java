package mini2;

import java.util.Scanner;

class Craps {
	//metoda prvo bacanje
	public static void prvoBacanje(int a, int b) {
		int suma = a + b;//sabira pokazivanje dvije kockice
		if ((suma == 7) || (suma == 11)) {//ako je, onda je pobjeda
			System.out.println("POBJEDA!");

		} else if ((suma == 2) || (suma == 3) || (suma == 12)) {//ako je onda gubitak
			System.out.println("Izgubili ste, više srece drugi put!");
		} else {
			System.out.println("Dobili ste poen, idete u sljedeci krug");
		}
	}

	public static void main(String[] args) {
		System.out.println(">>>>>  C R A P S  <<<<<");
		System.out
				.println("\nPass Line - postavlja se prije bacanja kockica u fazi Izlaska (eng. Coming out), \npobjeðujete ako bacite Prirodni eng. Natural zbroj (7 ili 11), \na gubite sa Craps zbrojem (2,3 ili 12) . \nAko ostvarite poen (bacite 4,5,6,8,9), dobijate opkladu ako bacite isti broj kao i poen prije broja 7. \nNa primjer: ako bacit broj 4, ostvarili ste poen, i bacate kockice ponovo sve dok ne bacite broj 4. \nTada dobivate opkladu. Ako u toku ponovnog bacanja kockica bacite broj 7, gubite opkladu. Isplata 1:1");
		Scanner unos = new Scanner(System.in);
		int a;
		int b;
		int bacanje;
		int sum;
		int sum2;
		System.out.println("\n>>> ZAPOÈNITE IGRU <<<");
		System.out.println("\nPritisnite 0 za bacanje: ");
		try {
			bacanje = unos.nextInt();
			//simulator bacanja kockica
			a = (int) ((Math.random() * 6)+1);
			b = (int) ((Math.random() * 6)+1);
			sum = a + b;
			System.out.println(sum);

			prvoBacanje(a, b);
			//drugo bacanje
			if ((sum == 4) || (sum == 5) || (sum == 6) || (sum == 8)
					|| (sum == 9) || (sum == 10)) {
				while (bacanje == 0) {
					System.out.println("Pritisnite nula za bacanje ");

					bacanje = unos.nextInt();
					a = (int) ((Math.random() * 6)+1);
					b = (int) ((Math.random() * 6)+1);
					sum2 = a + b;
					System.out.println(sum2);
					if (sum2 == sum) {
						System.out.println("POBJEDA!!!");
						break;
					} else if (sum2 == 7) {
						System.out.println("Izgubili ste, zadržite svoj novac");
						break;
					} else {
						System.out.println("Bacaj ponovo!");
					}
				}
			}
		//opciono ako se zeli ponovo igrati
		System.out.println("\nAko zelite ispocetka birajte 1, za izlaz birajte 0:");
		bacanje = unos.nextInt();
		if (bacanje == 1) {
			main(args);
		}else{
			
		}
		}catch (Exception e) {
			System.out.println("Greska, samo brojeve unosite!!!");
			main(args);
		}
		unos.close();

	}

}
