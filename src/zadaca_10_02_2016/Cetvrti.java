package zadaca_10_02_2016;

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.shape.Circle;

public class Cetvrti {

	public static void main(String[] args) {
		// lista objekata
		ArrayList<Object> list = new ArrayList<>();
		// objekat tipa circle
		Circle c = new Circle();
		// dodajemo c u listu
		list.add(c);
		// datum
		Date date = new Date();
		// dodajemo u listu datum
		list.add(date);
		// string
		String s = "String slova";
		// dodajemo string u listu
		list.add(s);

		// ispis liste objekata
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}
