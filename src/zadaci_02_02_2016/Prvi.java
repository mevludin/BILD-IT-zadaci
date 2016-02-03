package zadaci_02_02_2016;

public class Prvi {

	public static void main(String[] args) {
		int broj = 0;
		int brojac = 0;
		int[] niz = new int[100];// niz 100 elemenata
		for (int i = 0; i < 100; i++) {
			niz[i] = (int) (Math.random() * 10);// unos nasumiènog br u niz
		}
		while (broj < 10) {// da bismo provjerili ponavlajnje svake cifre
			for (int i = 0; i < 100; i++) {
				if (niz[i] == broj) {
					brojac++;// broji ponavljanja
				}
			}
			System.out.println("Broj " + broj + " se pojavljuje " + brojac
					+ " puta.");
			brojac = 0;
			broj++;
		}

	}

}
