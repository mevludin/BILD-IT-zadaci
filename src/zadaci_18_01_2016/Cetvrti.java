package zadaci_18_01_2016;

public class Cetvrti {
	public static void print() {
		System.out.println("Velika slova:");
int b=0;
		for (int i = 1; i <= 100; i++) {
			//pretvara brojeve ASCI u karakter
			int slova = (int) (Math.random() * 26) + 65;
			b++;
			if (b==10) {//prelazak u novu liniju

				System.out.printf("%2c\n", (char) (slova));
				b=0;
			} else {
				System.out.printf("%2c", (char) (slova));
			}
		}

		System.out.println("\nBrojevi:");
int c=0;
		for (int i = 1; i <= 100; i++) {
			int brojevi = (int) (Math.random() * 10);
			c++;
			if (c==10) {//prelazak u novu liniju

				System.out.printf("%2d\n", brojevi);
				c=0;
			} else {
				System.out.printf("%2d", brojevi);
			}
		}
	}

	public static void main(String[] args) {

		// pozivamo metodu
		print();
	}
	

}
