package zadaci_08_02_2016;

import java.math.BigInteger;

public class Cetvrti {
	// metoda za proonalazak prostih br
	public static boolean jeProst(int p) {

		if (p >= 2 && p % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int p = 2;
		// definišemo varijablu broj i postavimo je kao konstantu
		final BigInteger broj = new BigInteger("2");
		// ispis poruke sta racunamo
		System.out.println("2^p – 1");
		// petlja radi dok je p manje ili jednako 100
		while (p <= 100) {

			if (jeProst(p)) {
				// ako je p prosta onda uvrti u formulu
				BigInteger broj1 = broj.pow(p).subtract(new BigInteger("1"));
				System.out.print("\n" + broj1);
			}
			// povecava vrijednost p
			p++;
		}
	}

}
