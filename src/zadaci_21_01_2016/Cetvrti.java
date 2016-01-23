package zadaci_21_01_2016;

public class Cetvrti {

	public static void main(String[] args) {
		System.out.println("Trazimo savrseni broj");
	
		for (int i = 2; i < 10000; i++) {//brojevi do 10000
			int sum = 0;
			for (int j = 1; j < i; j++) {//nazivnik
				if (i % j == 0) {//ako nema ostatka dodaj sumi
					sum += j;
			
				}
			}
				if (sum ==i) {//ako je suma jednaka brojniku, onda je savršeno
					System.out.println(i + "je savršen broj");//ispis
					sum = 0;
				} else {
					sum = 0;
				}
			}
		}
	}


