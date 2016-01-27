package zadaci_26_01_2016;



public class Treci {
	public static int isPrime(int j){
		//pronalazak svih prostih br u rasponu
		for ( int i = j; i <= 100000; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {

				System.out.print(i+",");//ispis

			} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

			} else {

				System.out.print(i+",");//ispis

			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		int j=0;
		
			isPrime(j);//poziv metode
		
		

	}

}
