package zadaci_22_01_2016;

public class Treci {

	public static void main(String[] args) {
		int brojac=0;
		for (int i=100;i<1000;i++){//od do
			if ((i%5==0)&&(i%6==0)){//djeljivo sa 5 i 6
				System.out.print(i+" ");//ispis
				brojac++;
				if (brojac==10){//prelaz u novi red
					System.out.println();
					brojac=0;
				}
			}
			
		}

	}

}
