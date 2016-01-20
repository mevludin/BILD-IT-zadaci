package zadaci_19_01_2016;

import java.util.Scanner;



public class Drugi {

	public static void main(String[] args) {
		//niz naziv karte
		String [] karta ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
		//niz tip karte
		String [] znak ={"Srce","Pik","Djetelina","Kocka"};
		Scanner unos=new Scanner(System.in);
		System.out.println("Protosnite nulu za izvlacenje karte: ");
		for (int i=0;i<52;i++){//52 karte u špilu
			int izvlacenje=unos.nextInt();
			int kartaBr=(int)(Math.random()*13);//odabir karte
			int znakBr=(int)(Math.random()*4);//tip karte
			System.out.println("Izvukli ste: "+karta[kartaBr]+" "+znak[znakBr]);
		}
		unos.close();
		}

	}

