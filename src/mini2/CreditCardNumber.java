package mini2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCardNumber {
	//metode redom kao u knjizi
	/** Return true if the card number is valid */
	public static boolean isValid(long number){//provjera validnosti
				int suma = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

				if ((suma % 10 == 0) && ((prefixMatched(number, 1))) && (getSize(number) >= 13)
						&& (getSize(number) <= 16)) {
					return true;
				} else {
					return false;
				}
	}
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number){//parne cifre, sabiraju se
		int rezultat = 0;
		long drugi = 0;
		long cifra=0;
		long n1;
		long n2;
		while (number > 0) {
			drugi= number /10;
			cifra = (drugi%10)*2;
			rezultat+=getDigit((int)cifra);
			number = number / 100;
			
		}

		return rezultat;
	
	}
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number){//cifre, ako je dvocifren pravi se jedna cifra sabiranjem cifara
		if (number>9){
			int n1=number%10;
			int n2=number/10;
			return n1+n2;
			
		}else{
		return number;
		}
	}
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number){//neparne cifre, sabiraju se
		int rezultat = 0;
		while (number != 0) {
			long cifra = number % 10;
			rezultat = rezultat + (int) cifra;
			number = number / 100;
		}

		return rezultat;
		
	}
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d){//prefiks, govori koji je tip kartice
		
		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5)
				|| (getPrefix(number, d) == 37) || (getPrefix(number, d) == 6)) {

			if (getPrefix(number, d) == 4) {
				System.out.print("\nVISA ELECTRON");
			} else if (getPrefix(number, d) == 5) {
				System.out.print("\nMASTERCARD");
			} else if (getPrefix(number, d) == 37) {
				System.out.print("\nAMERICAN EXPRESS");
			} else if (getPrefix(number, d) == 6) {
				System.out.print("\nDISCOVER");
			}

			return true;

		} else {

			return false;

		}
	}
	/** Return the number of digits in d */
	public static int getSize(long d){//velicina broja kartice, tj koliko ima cifara
		int brojac = 0;

		while (d > 0) {
			d = d / 10;

			brojac++;
		}

		return brojac;
	}
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k){//vraca prvi
		if (getSize(number) < k) {
			return number;
		} else {

			int velicina = (int) getSize(number);

			for (int i = 0; i < (velicina - k); i++) {
				number = number / 10;
			}

			return number;

		}
	}
	
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int biranje;
		try {
			// unos broja i ispis rezultata
			System.out.print("Unesite broj kartice: ");
			long broj = unos.nextLong();

			if (isValid(broj)) {
				System.out.println("\nKartica sa brojem: " + "'" + broj + "'"
						+ " je VALIDNA. ");
			} else {
				System.out.println("\nKartica sa brojem: " + "'" + broj + "'"
						+ " NIJE VALIDNA. ");
			}
			
		} catch (InputMismatchException ex) {
			System.out.println("Greška,unosite samo brojeve!");//ako je greska ponovi
			main(args);
		}
		System.out.println("\nAko želite ponovni unos birajte broj 1, ili 0 za izlaz: ");//opciono ponovno biranje
		biranje=unos.nextInt();
		if (biranje==1){
			main(args);
		}else{
			
		}
		unos.close();
	}

}
