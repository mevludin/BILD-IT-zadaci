package zadaci_17_02_2016;

import java.util.ArrayList;

public class Peti {
	// sortiranje elemenata u listi po rastucem redu.
				public static void sort(ArrayList<Number> list) {
					for (int i = 0; i < list.size(); i++) {
						for (int j = 0; j < list.size(); j++) {
							// Ako je vrijadnost elementa na idneksu i manja od vrijednosti
							// elementa na idneksu j, zamijeni im pozicije.
							if (list.get(i).doubleValue() < list.get(j).doubleValue()) {
								// Cuvamo elemenat sa drugog indeksa u temp varijabli.
								Number temp = list.get(j);
								// Kopiramo elemenat sa prvog indeksa preko drugog elementa.
								list.set(j, list.get(i));
								// Kopiramo temp (drugi elemenat) preko prvog elementa.
								list.set(i, temp);
							}
						}
					}

		}
	public static void main(String[] args) {
		// Kreiramo listu.
				ArrayList<Number> lista = new ArrayList<>();
				// Dodajemo brojeve u listu.
				for (int i=0;i<20;i++){
					
				double a=(double)(Math.random())*1000;
				lista.add(a);
				
				
				}
				// Prikaz stanja prije srotiranja.
				System.out.println(lista);
				// Pozivamo metodu za sortiranje.
				sort(lista);
				// Prikazujemo sortiranu listu.
				System.out.println(lista);
			}

}
