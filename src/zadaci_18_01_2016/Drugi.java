package zadaci_18_01_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		int[] dx = new int[9];//prvi niz
		int[] da = new int[1];//drugi niz
		String[] dy = new String[1];//niz stringova
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite 9 cifara ISBN koda: ");
		int sum = 0;//suma
		int x = 0;//zadnja cifra
		//unos cifara u niz
		for (int i = 0; i < dx.length; i++) {
			dx[i] = unos.nextInt();
			sum += dx[i] * i;
		}
		unos.close();
		if (sum % 11 == 10) {//uslov kada je zadnja x
			dy[0] = "X";
			System.out.print("Vas ISDN code izgleda ovako: ");
			for (int i = 0; i < dx.length; i++) {
				System.out.print(dx[i]);
			}
			System.out.print(dy[0]);
		} else {
			//kada je zadnja broj
			x = sum % 11;
			da[0] = x;
			System.out.print("Vas ISDN code izgleda ovako: ");
			for (int i = 0; i < dx.length; i++) {
				System.out.print(dx[i]);
			}
			System.out.print(da[0]);
		}

	}

}
