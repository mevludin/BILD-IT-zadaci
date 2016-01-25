package zadaci_24_01_2016;



public class Treci {

	public static void main(String[] args) {
		int brojac=0;
		int a=2;//da nmamo kombinacije istih brojeva
		for (int i=1;i<=6;i++){
			for (int j=a;j<=7;j++){
				System.out.print(i+""+j+",");//ispis
				brojac++;//brojac kombinacija
			}
			a=2+i;//da se ne ponavljaju kombinacije
		}
System.out.println("\nBroj kombinacija je: "+brojac);
		
	
	}

}
