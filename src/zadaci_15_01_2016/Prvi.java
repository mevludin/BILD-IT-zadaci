package zadaci_15_01_2016;

import java.util.ArrayList;

public class Prvi {
	public static Integer max(ArrayList<Integer> list) {
		int maxi = 0; // poèetna vrijednost
		
		// provjerava da li je lista null / prazna
		if ((list == null) || (list.isEmpty())) {
			System.out.println("Lista je prazna.");
			return null;
		}
		
		// ako lista nije prazna
		else {
			for (int i=0;i<list.size();i++) {
				if (list.get(i) > maxi) {
					maxi = list.get(i); 
					//ako je broj veci od prethodnog, tada preuzima njegovu vrijednost
				}
			}
			return maxi;
		}
	}
	public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
		
		//dodavanje brojeva u listu:
		for (int i = 0; i < 10; i++){
			int broj = (int)(Math.random()*100);
			list.add(broj);
		}
		
		// ispisivanje liste
		System.out.println("Brojevi u listi: ");
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " "); 
		}
		// ispisuje najveæi broj u listi
		System.out.println("\nNajveæi broj u listi je: "+max(list));

	}

}
