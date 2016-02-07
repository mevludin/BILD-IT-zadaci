package zadaci_06_02_2016;

import java.util.Stack;

public class Peti {
	//metoda za pronalazak prostog broja
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		
		if (n > 2 && n % 2 == 0)
			return false;
		
		for (int i = 2; i <n ; i++) {
			if (n %2 == 0)
				return false;
		}

		return true;
	}
	public static void main(String[] args) {
		Stack<Integer> brojevi = new Stack<>();
		for (int i=0;i<120;i++){
			if (isPrime(i)){//ako je prost dodaj u stack
				brojevi.push(i);
			}
			
			
		}
		for (int i=0;i<brojevi.size();i++){
			System.out.print(brojevi.get(i)+",");//ispis
		}
	}

}
