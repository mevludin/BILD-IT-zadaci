package zadaci_29_01_2016;

import java.util.Scanner;

public class Drugi {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int ponovo=0;
		String[]pbm={"papir","bunar","makaze"};//moguæe opcije
		int racunar=(int)(Math.random()*3);//nasumicno racunar
		try{
		System.out.println("Unesite: 0, 1 ili 2: >>");
		int korisnik=unos.nextInt();//unos korisnika
		System.out.println("Racunar: "+pbm[racunar]);//ispis
		System.out.println("Vi:      "+pbm[korisnik]+"\n");
		//sve moguæe kombinacije
		if((pbm[racunar])=="papir"&&(pbm[korisnik]=="papir")){
			System.out.println("Nerijeseno");
		}if((pbm[racunar])=="papir"&&(pbm[korisnik]=="bunar")){
			System.out.println("Izgubili ste");
		}if((pbm[racunar])=="papir"&&(pbm[korisnik]=="makaze")){
			System.out.println("Pobjeda");
		}if((pbm[racunar])=="bunar"&&(pbm[korisnik]=="bunar")){
			System.out.println("Nerijeseno");
		}if((pbm[racunar])=="bunar"&&(pbm[korisnik]=="papir")){
			System.out.println("Pobjeda");
		}if((pbm[racunar])=="bunar"&&(pbm[korisnik]=="makaze")){
			System.out.println("Izgubili ste");
		}if((pbm[racunar])=="makaze"&&(pbm[korisnik]=="makaze")){
			System.out.println("Nerijeseno");
		}if((pbm[racunar])=="makaze"&&(pbm[korisnik]=="papir")){
			System.out.println("Izgubili ste");
		}if((pbm[racunar])=="makaze"&&(pbm[korisnik]=="bunar")){
			System.out.println("Pobjeda");
		}
		//opciono ako neko želi ponovo
		System.out.println("\nAko želite ponovi birajte 1: ");
		ponovo=unos.nextInt();
		if(ponovo==1){
			main(args);
		}else{
			
		}
		}catch(Exception e){
			System.out.println("\nGreska, morate ponovo!");//ako ima gresaka
			main(args);
		}
unos.close();
	}

}
