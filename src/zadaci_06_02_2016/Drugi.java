package zadaci_06_02_2016;

class MyInteger {
	// podatak
	private int value;

	// konstruktor sa osobinama
	public MyInteger(int value) {
		this.value = value;
	}

	// no arg konstruktor
	public int getValue() {
		return value;
	}

	// metode koje provjeravaju da li je vrijednost objekta parna, neperna ili
	// prost br
	public boolean isEven() {
		return this.value % 2 == 0;
	}

	public boolean isOdd() {
		return this.value % 2 != 0;
	}

	public boolean isPrime() {
		if (this.value < 2)
			return false;

		if (this.value > 2 && this.value % 2 == 0)
			return false;

		for (int i = 2; i < this.value; i++) {
			if (this.value % 2 == 0)
				return false;
		}

		return true;
	}

	// statik metode koje uzimaju unesenu vrij i provjeravaju da li je
	// vrijednost parna, neperna ili prost br
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;

		if (n > 2 && n % 2 == 0)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % 2 == 0)
				return false;
		}

		return true;
	}

	// statik metode koje uzimaju specifiènu vrij i provjeravaju da li je
	// vrijednost parna, neperna ili prost br
	public static boolean isEven(MyInteger a) {
		return (a.getValue() % 2 == 0);
	}

	public static boolean isOdd(MyInteger a) {
		return (a.getValue() % 2 != 0);
	}

	public static boolean isPrime(MyInteger a) {
		if (a.getValue() < 2)
			return false;

		if (a.getValue() > 2 && a.getValue() % 2 == 0)
			return false;

		for (int i = 2; i < a.getValue(); i++) {
			if (a.getValue() % 2 == 0)
				return false;
		}

		return true;
	}

	// metodaporeðenja
	public boolean equals(MyInteger a) {
		if (this == a)
			return true;
		if (a == null)
			return false;
		if (getClass() != a.getClass())
			return false;
		MyInteger other = (MyInteger) a;
		if (value != other.value)
			return false;
		return true;
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public static int parseInt(char[] s) {
		return Integer.parseInt(s.toString());
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
}

public class Drugi {
	// test metoda, testira metode navedene u klasi MyInteger
	public static void main(String[] args) {

		MyInteger broj = new MyInteger(100);
		int n = 10;
		if (broj.isEven()) {
			System.out.println("Broj: " + broj.getValue() + " je paran!");
		} else {
			System.out.println("Broj: " + broj.getValue() + " nije paran!");
		}
		if (broj.isOdd()) {
			System.out.println("Broj: " + broj.getValue() + " je paran!");
		} else {
			System.out.println("Broj: " + broj.getValue() + " nije paran!");
		}

		if (broj.isPrime()) {
			System.out.println("Broj: " + broj.getValue() + " je prost!");
		} else {
			System.out.println("Broj: " + broj.getValue() + " nije prost!");
		}

		if (MyInteger.isEven(n)) {
			System.out.println("Broj: " + n + " je paran!");
		} else {
			System.out.println("Broj: " + n + " nije paran!");
		}
		if (MyInteger.isPrime(n)) {
			System.out.println("Broj: " + n + " je prost!");
		} else {
			System.out.println("Broj: " + n + " nije prost!");
		}

		String str = "222";

		System.out.println("\nString u broj: " + MyInteger.parseInt(str));

		MyInteger broj1 = new MyInteger(13);
		int broj2 = 13;
		if (broj1.equals(broj2)) {
			System.out.println("Brojevi su jednaki");
		} else {
			System.out.println("Brojevi nisu jednaki");
		}

	}

}
