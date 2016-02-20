package zadaci_18_02_2016;
import java.util.InputMismatchException;
import java.util.Scanner;

class ComparableCircle implements Comparable<ComparableCircle> {

	private double radius;

	

	public ComparableCircle(double radius) {
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getPovrsina() {
		return radius * radius * Math.PI;
	}

	@Override
	public int compareTo(ComparableCircle obj) {
		return (getPovrsina() > obj.getPovrsina()) ? 1 : (getPovrsina() == obj
				.getPovrsina()) ? 0 : -1;
	}

	public double max(ComparableCircle ob) {
		return compareTo(ob);

	}
}
public class Treci {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		try {
			//unos poluprecnika za prvi
			System.out.println("Unesite poluprecnik kruga: ");
			System.out.println("Krug 1 ");
			System.out.print("Poluprecnik 1: ");
			double r1 = unos.nextDouble();
			//unos poluprecnika za drugi
			System.out.println("Krug 2 ");
			System.out.print("Poluprecnik 1: ");
			double r2 = unos.nextDouble();
			// dva objekta
			ComparableCircle objekat1 = new ComparableCircle(r1);
			ComparableCircle objekat2 = new ComparableCircle(r2);

			// komparacija i ispis poruke
			System.out.printf(
					"%s  ",
					(objekat1.max(objekat2) == 1) ? "Prvi krug je veci " : (objekat1
							.max(objekat2) == -1) ? "Drugi krug je veci"
							: "Jednaki su");

		} catch (InputMismatchException e) {
			System.out.println("Greska");
			main(args);
		}
		unos.close();

	}

}
