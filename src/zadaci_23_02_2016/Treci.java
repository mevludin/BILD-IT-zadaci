package zadaci_23_02_2016;

import java.util.Scanner;

public class Treci {
	public static int count(String str, char a){
		int br = 0;
		if(str.length() == 0)
			return 0;
		else{
			if(str.charAt(str.length()-1) == a)
				br++;
			return br+count(str.substring(0,str.length()-1), a);		
		}
	}
	public static void main(String[] args) {
		//varijabla
		String value;
		char a;
		Scanner unos=new Scanner (System.in);
		System.out.println("Unesite string: ");
		try{
			//unos od strane korisnika
		value=unos.nextLine();
		a=(char)unos.next().charAt(0);
		System.out.println("Slovo >>"+a+"<< u rijeci >>"+value+"<< se ponavlja "+count(value,a)+" puta.");
		}catch(Exception e){
			System.out.println("Greska...ponovite unos!!!");
			main(args);
		}
		unos.close();
	}

}
