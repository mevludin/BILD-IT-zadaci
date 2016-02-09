package zadaci_08_02_2016;

import java.math.BigInteger;

public class Prvi {

	public static void main(String[] args) {

		String numString = "1";
		// dodaje 49 nula na jedinicu
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}
		BigInteger broj = new BigInteger(numString);

		// Brojac brojeva koji su djeljivi sa 2 i li sa 3
		int brojac = 0;
		while (brojac < 10) {
			// provjerava da li je broj djeljiv sa 2 ili sa 3
			if (broj.mod(new BigInteger("2")).equals(new BigInteger("0"))
					|| broj.mod(new BigInteger("3"))
							.equals(new BigInteger("0"))) {
				// povecaj brojac ako je broj deljiv sa 2 ili 3
				brojac++;
				System.out.println(broj);
			}
			// Povecaj vrijednost broja za 1
			broj = broj.add(new BigInteger("1"));
		}
	}
}
