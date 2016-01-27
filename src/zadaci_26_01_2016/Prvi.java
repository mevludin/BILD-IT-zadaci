package zadaci_26_01_2016;

public class Prvi {

	public static void main(String[] args) {
		String  slova = "QWERTZUIOPASDFGHJKLYXCVBNM";//moguca slova na tablici
		//nasumican izbor slova
		for (int i=0;i<3;i++){
			int j=(int)(Math.random()*26);
			System.out.print(slova.charAt(j));
		}
		System.out.print("-");
		//nasumican izbor brojeva
		for (int i=0;i<4;i++){
			int j=(int)(Math.random()*10);
			System.out.print(j);
		}
		

	}

}
