package zadaci_23_02_2016;

import java.util.Scanner;

public class Drugi {
	public static void reverseDisplay(String value){
		if(value.length() == 0){
			// uslov da se zaustavi rekurzija 
		}
		else{
			System.out.print(value.charAt(value.length()-1));
			reverseDisplay(value.substring(0, value.length()-1));
			
		}
	}
	
	public static void main(String[] args) {
		//varijabla
				String value;
				Scanner unos=new Scanner (System.in);
				System.out.println("Unesite string: ");
				try{
					//unos od strane korisnika
				value=unos.nextLine();
				reverseDisplay(value);
				}catch(Exception e){
					System.out.println("Greska...ponovite unos!!!");
					main(args);
				}
				unos.close();
			}

		}
