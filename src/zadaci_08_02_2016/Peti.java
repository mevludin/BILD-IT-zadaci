package zadaci_08_02_2016;

import java.math.BigInteger;

public class Peti {

	public static void main(String[] args) {
		// broj cija je vrijednost MAX VALUE
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		// brojevi pet, sest i nula kojui nam trebaju za uslov
		BigInteger pet = new BigInteger("5");
		BigInteger sest = new BigInteger("6");
		BigInteger nula = new BigInteger("0");
		int brojac = 0;
		// ulov da ispise samo pet br
		while (brojac < 5) {
			// ako je djeljivo sa pet i sa sest ispisi
			if ((broj.mod(pet).equals(nula)) || (broj.mod(sest).equals(nula))) {
				System.out.println(broj);
				// povecaj brojac
				brojac++;
			}
			// povecaj big broj za 1
			broj = broj.add(new BigInteger("1"));
		}

	}

}
