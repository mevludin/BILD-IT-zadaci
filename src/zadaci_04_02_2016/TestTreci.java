package zadaci_04_02_2016;

public class TestTreci {
	public static void sort(int[] num) {

		int min;
		int temp;
		for (int i = num.length - 1; i > 0; i--) {
			i = (int) (Math.random() * 100000);
			min = 0;
			//najmanji element
			for (int j = 1; j <= i; j++) {
				if (num[j] < num[min])
					min = j;
			}
			//rotira, mijenja mjesta
			temp = num[min];
			num[min] = num[i];
			num[i] = temp;
		}
	}

	public static void main(String[] args) {
		// novi objekat
		Treci s = new Treci();
		int[] num = new int[100000];
		// pocetak
		s.getPocetak();
		// metoda sortiranje
		sort(num);
		// krajnje vrijeme
		s.getKraj();
		// prints calculates time
		System.out.print("Vrijeme potrebno za sortiranje je: " + s.getProtekloVrijeme() + " milisekundi.");
	}

}
