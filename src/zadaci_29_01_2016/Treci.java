package zadaci_29_01_2016;

public class Treci {

	public static void main(String[] args) {
		double sum=0;
		int i=1;
	    int j=3;
		double[] niz1 = new double[50];//brojnik
		double[] niz2 = new double[50];//nazivnik
		for (int a = 0; a < 50; a++) {
			
				niz1[a] = i;
				i+=2;//povecaj za dva brojnik
			
				niz2[a] = j;
				j+=2;//povecaj za dva nazivnik
			
		}
		for (int a=0;a<49;a++){
			sum+=niz1[a]/niz2[a];//dodaj sumi koliènik
			System.out.print(niz1[a]+"/"+niz2[a]+" + ");
		}
System.out.println("\nUkupno: "+sum);//ispis rezultata
	}

}
