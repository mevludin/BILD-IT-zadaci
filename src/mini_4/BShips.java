package mini_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BShips {
	public static void pozicije(){
		int [][] brod =new int [10][10];//polja ispod kojih se kriju brodiæi
		//ispis polja
		for (int brodY = 0; brodY < brod.length; brodY++) {
			for (int brodX = 0; brodX < brod.length; brodX++) {
				brod[brodY][brodX]=0;
				System.out.print(brod[brodY][brodX]+" ");
			}
			System.out.println();
		}
	}
	//pozicija broda 0 akonije pogoðena, 1 ako je pogoðena
	public static void pozicijeB(int brodX,int brodY){
		int [][] brod =new int [10][10];
		for (int Y = 0; Y < brod.length; Y++) {
			for (int X = 0; X < brod.length; X++) {
				brod[brodY][brodX]=0;
				if(Y==brodY&&X==brodX){
					brod[Y][X]=1;
				}else{
					brod[Y][X]=0;
				}
				System.out.print(brod[Y][X]+" ");
			}
			System.out.println();
		}
	}
	//koordinate broda, provjerava da li unesene koord odgovaraju koord broda
	public static void koordBroda(int brodX,int brodY){
		int [][] brod =new int [10][10];
		int pogodak=0;
		
		int brX=(int)(Math.random()*10);
		int brY=(int)(Math.random()*10);
		if((brodX==brX)&&(brodY==brY)){
			System.out.println("\nPogodak");
			pozicijeB(brodX, brodY);
			pogodak++;
		}else{
			System.out.println("Promašaj, ciljaj bolje");
			pozicijeB(brodX, brodY);
		}
		if (pogodak>0){
			System.out.println("Pogodili ste ukupno "+pogodak+" brodova.");
		}
		
	}
	public static void main(String[] args) {
		int granate=20;
		System.out.println("Moguæe pozicije brodova: ");
		pozicije();//prekrivena polja
		Scanner unos=new Scanner (System.in);
		System.out.println("Gaðate brodove, imate ukupno: "+granate+" granata.");
		try{
		while(granate>0){
		System.out.println("\nUnesite koordinatu X: ");
		int brodX=unos.nextInt();
		System.out.println("\nUnesite koordinatu Y: ");
		int brodY=unos.nextInt();
		koordBroda(brodX,brodY);//poziv funkcije
		granate--;
		System.out.println("\nOstalo vam je još: "+granate+" granata.");
		}
		}catch(InputMismatchException e){
			System.out.println("Greska...ponovite unos!!!");
			main(args);
			
		}
		System.out.println("\nPotrošili ste sve granate!!!");
		unos.close();
	}

}
