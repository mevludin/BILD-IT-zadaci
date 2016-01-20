package zadaci_20_01_2016;

import java.util.Scanner;

public class Prvi {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		//Unos
		System.out.println("Unesi iznos investicije: ");
		double iznosInvesticije=unos.nextDouble();
		System.out.println("Unesi broj godina: ");
		int brojGodina=unos.nextInt();
		System.out.println("Unesi godisnju interesnu stopu; ");
		double godisnjaInteresnaStopa = unos.nextDouble();
		unos.close();
		//kako se dobije mjesecna iz godisnje
		double mjesecnaInteresnaStopa = (godisnjaInteresnaStopa / 100) / 12;
	//formula iz postavke zadatka
		double buducaVrijednostInvesticije = iznosInvesticije
				* (Math.pow((1 + mjesecnaInteresnaStopa), (brojGodina * 12)));
		//ispis rezultata
		System.out.println("Buduæa virjednost investicije iznosi: "+buducaVrijednostInvesticije);
	}
	}


