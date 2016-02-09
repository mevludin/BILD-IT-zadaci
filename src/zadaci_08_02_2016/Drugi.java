package zadaci_08_02_2016;

import java.math.BigInteger;

public class Drugi {
	public static void main(String[] args) {
		// broj cija je vrijednost MAX VALUE
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);
		int brojac = 0;
		// da ispise samo 10 brojeva
		while (brojac < 10) {
			// varijabli brojKv se dodjeljuje vrijednost kvadrirane varijable
			// "broj"
			BigInteger brojKv = broj.pow(2);
			// povecaj brojac
			brojac++;
			System.out.println(brojKv);

			// povecaj big broj za 1
			broj = broj.add(new BigInteger("1"));
		}
	}
}
