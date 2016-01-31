package zadaci_30_01_2016;

import java.util.Date;

public class Cetvrti {
	public static String datumVrijeme(){
		Date datum = new Date(System.currentTimeMillis());//klasa koja vraca datum, vrijeme, dan, mjesec
		return datum.toString();
		
	}
	public static void main(String[] args) {
		System.out.println("Tacno vrijeme je:\n\n"+datumVrijeme());//poziv metode i ispis

	}

}
