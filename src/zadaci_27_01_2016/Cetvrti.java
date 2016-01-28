package zadaci_27_01_2016;

import java.util.ArrayList;

public class Cetvrti {

	public static void main(String[] args) {
		ArrayList<Integer> brojevi = new ArrayList<>();
		int brojac = 0;
		//prosti br
		for (int i = 1; i <= 10000; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				brojevi.add(i);

			} else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {

			} else {
				brojevi.add(i);

			}
		}
		//ispis palindroma
		for (int i = 0; i < brojevi.size() - 1; i++) {
				if ((((brojevi.get(i) % 10) == (brojevi.get(i) / 10)) && ((brojevi
						.get(i) / 10) == (brojevi.get(i) % 10)))
						|| (((brojevi.get(i) % 10) == (brojevi.get(i) / 100))
								&& ((brojevi.get(i) / 100) == (brojevi.get(i) % 10)) && (((brojevi
								.get(i) / 10) % 10) == ((brojevi.get(i) / 10) % 10)))
						|| (((brojevi.get(i) % 10) == (brojevi.get(i) / 1000))
								&& ((brojevi.get(i) / 1000) == (brojevi.get(i) % 10))
								&& (((brojevi.get(i) / 10) % 10) == ((brojevi
										.get(i) / 100) % 10)) && ((brojevi
								.get(i) / 100) % 10) == ((brojevi.get(i) / 10) % 10))
								||((brojevi.get(i) /10000) == ((brojevi.get(i) / 10) % 10)
								&& (((brojevi.get(i) / 1000) % 10) == ((brojevi.get(i)/ 10) % 10))
								&& (((brojevi.get(i) / 100) % 10) == ((brojevi.get(i) / 100) % 10)) 
								&& (((brojevi.get(i) / 10) % 10) == ((brojevi.get(i) / 1000) % 10))
								&&((brojevi.get(i) % 10) == (brojevi.get(i) / 10000)))) {

					{
						System.out.print(brojevi.get(i) + ",");
								
						brojac++;
						//prelazak u novi red
						if (brojac==10){
							System.out.println();
						}
					}
					
				}
				if (brojac == 100) {
					break;//prekid unosa
			}
			
			}
			System.out.println("Ukupno: " + brojac);
		}
		
	}

	


