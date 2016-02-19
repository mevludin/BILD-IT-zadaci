package zadaci_17_02_2016;

import java.util.ArrayList;

public class Cetvrti {
	public static void shuffle(ArrayList<Number> list) {
		//metoda
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size());
			Number temp = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, temp);
		}

	}
	public static void main(String[] args) {
		// lista
				ArrayList<Number> list = new ArrayList<>();
				for (int i = 0; i < 20; i++) {
					list.add(i);
				}
				// standardno
				System.out.println(list);
				// metoda nasumièan raspored
				shuffle(list);
				// ispis
				System.out.println(list);
	}

}
