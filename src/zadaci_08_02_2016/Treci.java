package zadaci_08_02_2016;

import java.math.BigInteger;

public class Treci {

	public static void main(String[] args) {
		// broj cija je vrijednost MAX VALUE
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		int brojac = 0;
		//da ispise samo 10 brojeva
		while (brojac < 5) {
			//ako je prost broj ipiši
			if (broj.isProbablePrime(7)) {
				System.out.println(broj);
				// povecaj brojac
				brojac++;
			}
			// povecaj big broj za 1
			broj = broj.add(new BigInteger("1"));
		}
	}

}
