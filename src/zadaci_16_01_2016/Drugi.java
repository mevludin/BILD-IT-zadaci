package zadaci_16_01_2016;

import java.util.Scanner;

public class Drugi{
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite koliko hocete oitanja: ");
		int a=unos.nextInt();
		//unos.close();
		int tacan=0;//brojac tacnih odg
		int netacan=0;//broajc netacnih odg
		int brojac=0;//brojac ukupno postavljenih pitanja
		//nizovi brojeva iz kojih se crpe pitanja
		int []prviBroj=new int [a];
		int []drugiBroj=new int [a];
		//rezultantni niz
		int []rezultat=new int [a];
		
		//petlja za punjenje nizova
		for (int i=0;i<a;i++){
			prviBroj[i]=(int)(Math.random()*100);
		
			drugiBroj[i]=(int)(Math.random()*100);
		
			rezultat[i]=prviBroj[i]-drugiBroj[i];
		}
		System.out.println();
		//petlj za postavljanje pitanja
		while(brojac!=a){
		System.out.println("Unesite redni broj pitanja!");
		int p=unos.nextInt();
		System.out.println(p+". Koliko je: "+prviBroj[p]+"-"+drugiBroj[p]);
		int o=unos.nextInt();
		unos.close();
		//uslov taènosti
		if(o==rezultat[p]){
			tacan++;
		}else{
			netacan++;
		}
		brojac++;
		}
		System.out.println("Tacnih odgovora imate: "+tacan+", a netacnih "+netacan);
	

	}
}
