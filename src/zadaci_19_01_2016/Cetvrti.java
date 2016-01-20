package zadaci_19_01_2016;

public class Cetvrti {

	public static void main(String[] args) {
		int [] brojevi=new int [10];
		System.out.println("Uneseni niz:\n");
		for (int i=0;i<brojevi.length;i++ ){
			brojevi[i]=(int)(Math.random()*10);//nasumicni upis brojeva u niz
			System.out.printf("%2d",brojevi[i]);
		}
		System.out.println("\nNaopako niz:\n");
		for(int i=brojevi.length-1;i>=0;i--){//obrnuti ispis brojeva
			System.out.printf("%2d", brojevi[i]);
		}

	}

}
